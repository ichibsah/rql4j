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
import rql4j.domain.Template;
import rql4j.domain.TemplateVariants;

public class TemplateVariantsBuilder extends RqlBuilder {
    private TemplateVariantsBuilder(List list) {
        super(list.ioData);
    }

    /**
     * list all templates of a content class
     */
    public static class List implements IBuilder {
        private final IoData ioData;
        private final Project project;
        private final Template template;
        private final TemplateVariants templateVariants;
        private final String action = "list";

        /**
         * constructor to create a new List instance
         * @param templateGuid guid of the content class
         */
        public List(String templateGuid) {
            this.ioData = new IoData();
            this.project = new Project();
            this.template = new Template(templateGuid);
            this.templateVariants = new TemplateVariants();
            this.templateVariants.setAction(this.action);
        }

        /**
         * list stylesheet which is assigned to the content class
         * @param withStyleSheets set to true to get stylesheet
         * @return this List instance
         */
        public List WithStyleSheets(Boolean withStyleSheets) {
            this.templateVariants.setWithStyleSheets(withStyleSheets);
            return this;
        }

        /**
         * build the final RQL-Statement
         * @return new TemplateVariantsBuilder
         */
        @Override
        public TemplateVariantsBuilder build() {
            this.ioData.setProject(this.project);
            this.project.setTemplate(this.template);
            this.template.setTemplateVariants(this.templateVariants);
            return new TemplateVariantsBuilder(this);
        }
    }
}
