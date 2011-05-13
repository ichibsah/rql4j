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
import rql4j.domain.TemplateVariant;

public class TemplateVariantBuilder extends RqlBuilder {

    private TemplateVariantBuilder(Load load) {
        super(load.ioData);
    }

    public static class Load implements IBuilder {

        private final IoData ioData;
        private final Project project;
        private final Template template;
        private final TemplateVariant templateVariant;
        private final String action;

        public Load(String templateGuid) {
            this.action = "load";
            this.ioData = new IoData();
            this.project = new Project();
            this.template = new Template();
            this.templateVariant = new TemplateVariant(templateGuid);
            this.templateVariant.setAction(this.action);
        }

        public Load readOnly(Boolean readOnly) {
            this.templateVariant.setReadOnly(readOnly);
            return this;
        }

        @Override
        public TemplateVariantBuilder build() {
            this.ioData.setProject(this.project);
            this.project.setTemplate(this.template);
            this.template.setTemplateVariant(this.templateVariant);
            return new TemplateVariantBuilder(this);
        }
    }
}
