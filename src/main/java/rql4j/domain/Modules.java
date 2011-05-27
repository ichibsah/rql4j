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

public class Modules {
    private String action;
    private Boolean countLicense;
    private String userGuid;
    List<Module> moduleList;

    public Modules() {
    }


    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public List<Module> getModuleList() {
        return moduleList;
    }

    public void setModuleList(List<Module> moduleList) {
        this.moduleList = moduleList;
    }

    public Boolean getCountLicense() {
        return countLicense;
    }

    public void setCountLicense(Boolean countLicense) {
        this.countLicense = countLicense;
    }

    public String getUserGuid() {
        return userGuid;
    }

    public void setUserGuid(String userGuid) {
        this.userGuid = userGuid;
    }

    @Override
    public String toString() {
        return "Modules{" +
                "action='" + action + '\'' +
                ", countLicense=" + countLicense +
                ", userGuid='" + userGuid + '\'' +
                ", moduleList=" + moduleList +
                '}';
    }
}
