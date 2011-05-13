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

import rql4j.domain.Administration;
import rql4j.domain.IoData;
import rql4j.domain.Project;

public class ProjectBuilder extends RqlBuilder {

    private ProjectBuilder(Load load) {
        super(load.ioData);
    }

    private ProjectBuilder(Save save) {
        super(save.ioData);
    }

    public static class Load implements IBuilder{
        private final IoData ioData;
        private final Administration administration;
        private final Project project;
        private final String action;

        public Load(String projectGuid) {
            this.ioData = new IoData();
            this.administration = new Administration();
            this.project = new Project(projectGuid);
            this.action = "load";
            this.project.setAction(this.action);
        }

        public ProjectBuilder build() {
            this.ioData.setAdministration(this.administration);
            this.administration.setProject(this.project);
            return new ProjectBuilder(this);
        }
    }

    /**
     * edit lock of a project
     */
    public static class Save implements IBuilder {
        private final IoData ioData;
        private final Administration administration;
        private final Project project;
        private final String action = "save";

        public Save(String projectGuid, String inhibitLevel, String lockInfo) {
            this.ioData = new IoData();
            this.administration = new Administration();
            this.project = new Project(projectGuid);
            this.project.setAction(this.action);
            this.project.setInhibitLevel(inhibitLevel);
            this.project.setLockInfo(lockInfo);
        }

        public ProjectBuilder build() {
            this.ioData.setAdministration(this.administration);
            this.administration.setProject(this.project);
            return new ProjectBuilder(this);
        }
    }
}