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
import rql4j.domain.Templates;

public class TemplatesBuilder extends RqlBuilder {
    private TemplatesBuilder(List list) {
        super(list.ioData);
    }

    /**
     * This RQL query allows you to list all Content Classes of a Project.
     */
    public static class List {
        private final IoData ioData;
        private final Templates templates;
        private final String action;

        public List() {
            this.ioData = new IoData();
            this.templates = new Templates();
            this.action = "list";
            this.templates.setAction(this.action);
        }

        /**
         * You can limit the output to the Content Classes of one folder.
         * @param folderGuid Guid of Folder
         * @return List instance
         */
        public List FolderGuid(String folderGuid) {
            this.templates.setFolderGuid(folderGuid);
            return this;
        }

        public TemplatesBuilder build() {
            this.ioData.setTemplates(this.templates);
            return new TemplatesBuilder(this);
        }
    }
}
