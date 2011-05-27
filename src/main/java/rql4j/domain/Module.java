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

import java.util.EnumSet;

public class Module {

    public enum ServerManagerFlag {
        DELETE_USER, CREATE_USER, DELETE_GROUPS, CREATE_GROUPS, ASSIGN_USER_TO_GROUPS,
        EDIT_USER, ADMINISTER_PLUG_INS, ADMINISTER_USER_DEFINED_JOBS, ADMINISTER_DATABASE_SERVER,
        ADMINISTER_APPLICATION_SERVER, ADMINISTER_DIRECTORY_SERVICES, ADMINISTER_PROJECTS, ADMINISTER_XCMS_PROJECTS,
        ADMINISTER_DELIVERY_SERVER
    }

    private String guid;
    private Boolean checked;
    private EnumSet<ServerManagerFlag> serverManagerFlagSet;
    private Modules modules;
    private String project;
    private String projectName;
    private String id;
    private String lastId;
    private String lastGuid;
    private Boolean last;

    public Module() {
    }

    public Module(String guid) {
        this.guid = guid;
    }

    public String getGuid() {
        return guid;
    }

    public void setGuid(String guid) {
        this.guid = guid;
    }

    public Boolean getChecked() {
        return checked;
    }

    public void setChecked(Boolean checked) {
        this.checked = checked;
    }

    public EnumSet<ServerManagerFlag> getServerManagerFlagSet() {
        return serverManagerFlagSet;
    }

    public void setServerManagerFlagSet(EnumSet<ServerManagerFlag> serverManagerFlagSet) {
        this.serverManagerFlagSet = serverManagerFlagSet;
    }

    public Modules getModules() {
        return modules;
    }

    public void setModules(Modules modules) {
        this.modules = modules;
    }

    public String getProject() {
        return project;
    }

    public void setProject(String project) {
        this.project = project;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getLastId() {
        return lastId;
    }

    public void setLastId(String lastId) {
        this.lastId = lastId;
    }

    public String getLastGuid() {
        return lastGuid;
    }

    public void setLastGuid(String lastGuid) {
        this.lastGuid = lastGuid;
    }

    public Boolean getLast() {
        return last;
    }

    public void setLast(Boolean last) {
        this.last = last;
    }

    @Override
    public String toString() {
        return "Module{" +
                "guid='" + guid + '\'' +
                ", checked=" + checked +
                ", serverManagerFlagSet=" + serverManagerFlagSet +
                ", modules=" + modules +
                ", project='" + project + '\'' +
                ", projectName='" + projectName + '\'' +
                ", id='" + id + '\'' +
                ", lastId='" + lastId + '\'' +
                ", lastGuid='" + lastGuid + '\'' +
                ", last=" + last +
                '}';
    }
}
