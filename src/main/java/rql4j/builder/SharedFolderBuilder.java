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

import rql4j.domain.IoData;
import rql4j.domain.Project;
import rql4j.domain.SharedFolder;

public class SharedFolderBuilder extends RqlBuilder {
    private SharedFolderBuilder(Update update) {
        super(update.ioData );
    }

    public static class Update implements IBuilder {
        private final IoData ioData;
        private final Project project;
        private final SharedFolder sharedFolder;
        private final String action = "update";

        public Update(String folderGuid) {
            this.ioData = new IoData();
            this.project = new Project();
            this.sharedFolder = new SharedFolder(folderGuid);
        }

        public Update updateTemplateAssignments(Boolean update) {
            this.sharedFolder.setUpdateTemplateAssignments(update);
            return this;
        }

        public Update updateElementProperties(Boolean update) {
            this.sharedFolder.setUpdateElementProperties(update);
            return this;
        }

        public Update updateTemplateProperties(Boolean update) {
            this.sharedFolder.setUpdateTemplateProperties(update);
            return this;
        }

        @Override
        public SharedFolderBuilder build() {
            this.ioData.setProject(this.project);
            this.project.setSharedFolder(this.sharedFolder);
            return new SharedFolderBuilder(this);
        }
    }
}
