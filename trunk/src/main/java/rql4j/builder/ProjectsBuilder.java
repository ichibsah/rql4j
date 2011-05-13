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
import rql4j.domain.Projects;

public class ProjectsBuilder extends RqlBuilder {

    private ProjectsBuilder(List list) {
        super(list.ioData);
    }

    public static class List implements IBuilder{

        private final IoData ioData;
        private final Administration administration;
        private final Projects projects;
        private final String action = "list";

        public List() {
            this.ioData = new IoData();
            this.administration = new Administration();
            this.projects = new Projects();
            this.projects.setAction(this.action);
        }

        public ProjectsBuilder build() {
            this.ioData.setAdministration(this.administration);
            this.administration.setProjects(this.projects);
            return new ProjectsBuilder(this);
        }
    }


}
