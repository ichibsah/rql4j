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

public class ProjectVariant {
    private String guid;
    private Integer checked;
    private String name;
    private Integer userDisplayVariant;
    private Boolean doNotGenerate;
    private Boolean doNotUseTidy;

    public ProjectVariant() {
    }

    public ProjectVariant(String guid) {
        this.guid = guid;
    }

    public String getGuid() {
        return guid;
    }

    public void setGuid(String guid) {
        this.guid = guid;
    }

    public Integer getChecked() {
        return checked;
    }

    public void setChecked(Integer checked) {
        this.checked = checked;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getUserDisplayVariant() {
        return userDisplayVariant;
    }

    public void setUserDisplayVariant(Integer userDisplayVariant) {
        this.userDisplayVariant = userDisplayVariant;
    }

    public Boolean getDoNotGenerate() {
        return doNotGenerate;
    }

    public void setDoNotGenerate(Boolean doNotGenerate) {
        this.doNotGenerate = doNotGenerate;
    }

    public Boolean getDoNotUseTidy() {
        return doNotUseTidy;
    }

    public void setDoNotUseTidy(Boolean doNotUseTidy) {
        this.doNotUseTidy = doNotUseTidy;
    }

    @Override
    public String toString() {
        return "ProjectVariant{" +
                "guid='" + guid + '\'' +
                ", checked=" + checked +
                ", name='" + name + '\'' +
                ", userDisplayVariant=" + userDisplayVariant +
                ", doNotGenerate=" + doNotGenerate +
                ", doNotUseTidy=" + doNotUseTidy +
                '}';
    }
}
