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

package rql4j.domain;

import java.util.List;

public class Folder {
    private String guid;
    private String languageVariantId;
    private String dialogLanguageId;
    private Integer versioning;
    private List<File>fileList;
    private Files files;
    private String name;

    public Folder() {
    }

    public Folder(String guid) {
        this.guid = guid;
    }

    public String getGuid() {
        return guid;
    }

    public void setGuid(String guid) {
        this.guid = guid;
    }

    public List<File> getFileList() {
        return fileList;
    }

    public void setFileList(List<File> fileList) {
        this.fileList = fileList;
    }

    public String getDialogLanguageId() {
        return dialogLanguageId;
    }

    public void setDialogLanguageId(String dialogLanguageId) {
        this.dialogLanguageId = dialogLanguageId;
    }

    public String getLanguageVariantId() {
        return languageVariantId;
    }

    public void setLanguageVariantId(String languageVariantId) {
        this.languageVariantId = languageVariantId;
    }

    public Integer getVersioning() {
        return versioning;
    }

    public void setVersioning(Integer versioning) {
        this.versioning = versioning;
    }

    public Files getFiles() {
        return files;
    }

    public void setFiles(Files files) {
        this.files = files;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    @Override
    public String toString() {
        return "Folder{" +
                "guid='" + guid + '\'' +
                ", languageVariantId='" + languageVariantId + '\'' +
                ", dialogLanguageId='" + dialogLanguageId + '\'' +
                ", versioning=" + versioning +
                ", fileList=" + fileList +
                ", files=" + files +
                ", name='" + name + '\'' +
                '}';
    }
}
