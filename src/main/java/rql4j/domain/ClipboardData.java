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

public class ClipboardData {
    private String action;
    private String projectGuid;
    private Data data;
    private String languageVariantId;
    private Boolean forAspx;
    private String value;

    public ClipboardData() {
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public String getProjectGuid() {
        return projectGuid;
    }

    public void setProjectGuid(String projectGuid) {
        this.projectGuid = projectGuid;
    }

    public Data getData() {
        return data;
    }

    public void setData(Data data) {
        this.data = data;
    }

    public String getLanguageVariantId() {
        return languageVariantId;
    }

    public void setLanguageVariantId(String languageVariantId) {
        this.languageVariantId = languageVariantId;
    }

    public Boolean getForAspx() {
        return forAspx;
    }

    public void setForAspx(Boolean forAspx) {
        this.forAspx = forAspx;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "ClipboardData{" +
                "action='" + action + '\'' +
                ", projectGuid='" + projectGuid + '\'' +
                ", data=" + data +
                ", languageVariantId='" + languageVariantId + '\'' +
                ", forAspx=" + forAspx +
                ", value='" + value + '\'' +
                '}';
    }
}
