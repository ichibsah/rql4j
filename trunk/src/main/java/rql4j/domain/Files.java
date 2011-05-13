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

public class Files {
    private String action;
    private Integer maxCount;
    private Integer startCount;
    private Integer fileCount;
    private Boolean isOverFlow;
    private Boolean isVersioning;
    private List<File> fileList;

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public Integer getMaxCount() {
        return maxCount;
    }

    public void setMaxCount(Integer maxCount) {
        this.maxCount = maxCount;
    }

    public Integer getFileCount() {
        return fileCount;
    }

    public void setFileCount(Integer fileCount) {
        this.fileCount = fileCount;
    }

    public Boolean getOverFlow() {
        return isOverFlow;
    }

    public void setOverFlow(Boolean overFlow) {
        isOverFlow = overFlow;
    }

    public Boolean getVersioning() {
        return isVersioning;
    }

    public void setVersioning(Boolean versioning) {
        isVersioning = versioning;
    }

    public Integer getStartCount() {
        return startCount;
    }

    public void setStartCount(Integer startCount) {
        this.startCount = startCount;
    }

    public List<File> getFileList() {
        return fileList;
    }

    public void setFileList(List<File> fileList) {
        this.fileList = fileList;
    }

    @Override
    public String toString() {
        return "Files{" +
                "action='" + action + '\'' +
                ", maxCount=" + maxCount +
                ", startCount=" + startCount +
                ", fileCount=" + fileCount +
                ", isOverFlow=" + isOverFlow +
                ", isVersioning=" + isVersioning +
                ", fileList=" + fileList +
                '}';
    }
}
