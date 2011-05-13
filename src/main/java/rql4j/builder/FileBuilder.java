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

public class FileBuilder extends RqlBuilder {

    private FileBuilder(Save save) {
        super(save.ioData);
    }

    private FileBuilder(SaveMedia saveMedia) {
        super(saveMedia.ioData);
    }

    private FileBuilder(Update update) {
        super(update.ioData);
    }

    private FileBuilder(Check check) {
        super(check.ioData);
    }

    public static class Save implements IBuilder {
        private final IoData ioData;
        private final List<rql4j.domain.File> files;
        private final String action;
        private final Folder folder;
        private final Project project;

        public Save(String folderGuid) {
            this.action = "save";
            this.ioData = new IoData();
            this.files = new ArrayList<rql4j.domain.File>();
            this.folder = new Folder(folderGuid);
            this.project = new Project();
        }

        public Save File(String sourceName, String sourcePath) {
            File file = new File();
            file.setSourceName(sourceName);
            file.setSourcePath(sourcePath);
            file.setAction(this.action);
            files.add(file);
            return this;
        }

        public FileBuilder build() {
            this.ioData.setProject(this.project);
            this.project.setFolder((this.folder));
            this.folder.setFileList(this.files);
            return new FileBuilder(this);
        }

    }

    public static class SaveMedia implements IBuilder {
        private final IoData ioData;
        private final List<rql4j.domain.File> files;
        private final String action;
        private final Folder folder;
        private final Media media;

        public SaveMedia(String folderGuid) {
            this.action = "save";
            this.ioData = new IoData();
            this.files = new ArrayList<rql4j.domain.File>();
            this.folder = new Folder(folderGuid);
            this.media = new Media();
        }

        public SaveMedia File(String sourceName, String sourcePath) {
            rql4j.domain.File file = new rql4j.domain.File();
            file.setSourceName(sourceName);
            file.setSourcePath(sourcePath);
            file.setAction(this.action);
            files.add(file);
            return this;
        }

        public FileBuilder build() {
            this.ioData.setMedia(this.media);
            this.media.setFolder((this.folder));
            this.folder.setFileList(this.files);
            return new FileBuilder(this);
        }

    }

    public static class Update implements IBuilder {
        private final IoData ioData;
        private final Media media;
        private final Folder folder;
        private final List<rql4j.domain.File> files;
        private final String action;

        public Update(String folderGuid) {
            this.ioData = new IoData();
            this.media = new Media();
            this.folder = new Folder(folderGuid);
            this.files = new ArrayList<rql4j.domain.File>();
            this.action = "update";
        }

        public Update File(String sourceName, String tempDir) {
            rql4j.domain.File file = new rql4j.domain.File();
            file.setSourceName(sourceName);
            file.setTempDir(tempDir);
            file.setAction(this.action);
            this.files.add(file);
            return this;
        }

        public Update File(String sourceName, String guid, String tempDir) {
            File file = new File();
            file.setSourceName(sourceName);
            file.setTempDir(tempDir);
            file.setGuid(guid);
            file.setAction(this.action);
            this.files.add(file);
            return this;
        }

        public FileBuilder build() {
            this.ioData.setMedia(this.media);
            this.media.setFolder(this.folder);
            this.folder.setFileList(this.files);
            return new FileBuilder(this);
        }
    }

    public static class Check {
        private final IoData ioData;
        private final Project project;
        private final Folder folder;
        private final List<File> files;
        private final String action;

        public Check(String folderGuid) {
            this.ioData = new IoData();
            this.project = new Project();
            this.folder = new Folder(folderGuid);
            this.files = new ArrayList<File>();
            this.action = "check";
        }

        public Check File(String sourceName) {
            File file = new File();
            file.setSourceName(sourceName);
            file.setAction(this.action);
            this.files.add(file);
            return this;
        }

        public FileBuilder build() {
            this.ioData.setProject(this.project);
            this.project.setFolder(this.folder);
            this.folder.setFileList(this.files);
            return new FileBuilder(this);
        }
    }


}
