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

public class SharedFolder {
    private String action;
    private String guid;
    private Boolean updateTemplateAssignments;
    private Boolean updateElementProperties;
    private Boolean updateTemplateProperties;

    public SharedFolder() {
    }

    public SharedFolder(String guid) {
        this.guid = guid;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public String getGuid() {
        return guid;
    }

    public void setGuid(String guid) {
        this.guid = guid;
    }

    public Boolean getUpdateTemplateAssignments() {
        return updateTemplateAssignments;
    }

    public void setUpdateTemplateAssignments(Boolean updateTemplateAssignments) {
        this.updateTemplateAssignments = updateTemplateAssignments;
    }

    public Boolean getUpdateElementProperties() {
        return updateElementProperties;
    }

    public void setUpdateElementProperties(Boolean updateElementProperties) {
        this.updateElementProperties = updateElementProperties;
    }

    public Boolean getUpdateTemplateProperties() {
        return updateTemplateProperties;
    }

    public void setUpdateTemplateProperties(Boolean updateTemplateProperties) {
        this.updateTemplateProperties = updateTemplateProperties;
    }

    @Override
    public String toString() {
        return "SharedFolder{" +
                "action='" + action + '\'' +
                ", guid='" + guid + '\'' +
                ", updateTemplateAssignments=" + updateTemplateAssignments +
                ", updateElementProperties=" + updateElementProperties +
                ", updateTemplateProperties=" + updateTemplateProperties +
                '}';
    }
}
