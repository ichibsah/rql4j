/*
 * Copyright 2011 Burkhard Pauli (http://www.bpauli.de)
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under the License.
 */

package rql4j.builder;

import rql4j.domain.*;

import java.util.ArrayList;
import java.util.List;

public class FilesBuilder extends RqlBuilder {
    public FilesBuilder(ListMedia listMedia) {
        super(listMedia.ioData);
    }

    public FilesBuilder(DeleteFilesMedia deleteFilesMedia) {
        super(deleteFilesMedia.ioData);
    }

    public static class ListMedia implements IBuilder {
        private final IoData ioData;
        private final Media media;
        private final Folder folder;
        private final Files files;
        private final String action = "list";

        public ListMedia(String folderGuid, Integer maxCount) {
            this.ioData = new IoData();
            this.media = new Media();
            this.folder = new Folder(folderGuid);
            this.files = new Files();
            this.files.setMaxCount(maxCount);
            this.files.setAction(this.action);
        }

        @Override
        public FilesBuilder build() {
            this.ioData.setMedia(this.media);
            this.media.setFolder(this.folder);
            this.folder.setFiles(this.files);
            return new FilesBuilder(this);
        }
    }

    public static class DeleteFilesMedia implements IBuilder {
        private final IoData ioData;
        private final Media media;
        private final Folder folder;
        private final Files files;
        private final List<File> fileList;
        private final String action = "deletefiles";

        public DeleteFilesMedia(String folderGuid) {
            this.ioData = new IoData();
            this.media = new Media();
            this.folder = new Folder(folderGuid);
            this.files = new Files();
            this.files.setAction(this.action);
            this.fileList = new ArrayList<File>();
        }

        public DeleteFilesMedia File(String sourceName) {
            File file = new File();
            file.setSourceName(sourceName);
            this.fileList.add(file);
            return this;
        }

        public DeleteFilesMedia File(String sourceName, boolean deletereal) {
            File file = new File();
            file.setSourceName(sourceName);
            if(deletereal)
                file.setDeletereal(1);
            this.fileList.add(file);
            return this;
        }


        @Override
        public FilesBuilder build() {
            this.ioData.setMedia(this.media);
            this.media.setFolder(this.folder);
            this.folder.setFiles(this.files);
            this.files.setFileList(this.fileList);
            return new FilesBuilder(this);
        }
    }
}
