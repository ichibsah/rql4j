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

public class Templates {
    private String action;
    private String folderGuid;
    private List<Template> templateList;

    public Templates() {
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public String getFolderGuid() {
        return folderGuid;
    }

    public void setFolderGuid(String folderGuid) {
        this.folderGuid = folderGuid;
    }

    public List<Template> getTemplateList() {
        return templateList;
    }

    public void setTemplateList(List<Template> templateList) {
        this.templateList = templateList;
    }

    @Override
    public String toString() {
        return "Templates{" +
                "action='" + action + '\'' +
                ", folderGuid='" + folderGuid + '\'' +
                ", templateList=" + templateList +
                '}';
    }
}
