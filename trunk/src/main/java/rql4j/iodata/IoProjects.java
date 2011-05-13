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

package rql4j.iodata;

import rql4j.domain.IoData;
import rql4j.domain.Project;

import java.util.List;

public class IoProjects extends IoObject {
    public IoProjects(IoData ioData) {
        super(ioData);
    }

    public Project getProjectByName(String name) {
        if (this.ioData != null &&
                this.ioData.getProjects() != null) {
            List<Project> projects = this.ioData.getProjects().getProjectList();
            for (Project project : projects) {
                if (project.getName().equals(name))
                    return project;
            }
            return null;
        }
        return null;
    }

    /**
     * Get Project List of Result RQL
     *
     * @return List of Projects
     * @throws NullPointerException if no projects are in the result
     */
    public List<Project> getProjects() {
        if (this.ioData == null ||
                this.ioData.getProjects() == null ||
                this.ioData.getProjects().getProjectList() == null)
            throw new NullPointerException("No projets in the result");
        else return this.ioData.getProjects().getProjectList();
    }
}
