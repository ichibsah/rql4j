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

import rql4j.domain.*;

import java.util.ArrayList;

public class ProjectVariantsBuilder extends RqlBuilder {
    private ProjectVariantsBuilder(List list) {
        super(list.ioData);
    }

    private ProjectVariantsBuilder(Assign assign) {
        super(assign.ioData);
    }

    /**
     * With this RqlBuilder you can list all existing ProjectVariants of a project
     */
    public static class List {
        private final IoData ioData;
        private final Project project;
        private final ProjectVariants projectVariants;
        private final String action;

        /**
         * Constructor to create new List RqlBuilder instance
         */
        public List() {
            this.ioData = new IoData();
            this.project = new Project();
            this.projectVariants = new ProjectVariants();
            this.action = "list";
            this.projectVariants.setAction(this.action);
        }

        /**
         * Build the final RqlBuilder
         * @return new ProjectVariantsBuilder instance
         */
        public ProjectVariantsBuilder build() {
            this.ioData.setProject(this.project);
            this.project.setProjectVariants(this.projectVariants);
            return new ProjectVariantsBuilder(this);
        }
    }

    /**
     * With this RqlBuilder you can assign ProjectVariants to TemplateVariants
     */
    public static class Assign implements IBuilder {
        private final IoData ioData;
        private final Project project;
        private final Template template;
        private final TemplateVariants templateVariants;
        private final TemplateVariant templateVariant;
        private final ProjectVariants projectVariants;
        private final java.util.List<ProjectVariant> projectVariantList;
        private final String action = "assign";

        /**
         * Constructor to create a new Assign instance
         * @param templateGuid Guid of the Template (ContentClass)
         * @param templateVariantGuid Guid of the TemplateVariant
         */
        public Assign(String templateGuid, String templateVariantGuid) {
            this.ioData = new IoData();
            this.project = new Project();
            this.template = new Template(templateGuid);
            this.templateVariants = new TemplateVariants();
            this.templateVariant = new TemplateVariant(templateVariantGuid);
            this.projectVariants = new ProjectVariants();
            this.projectVariants.setAction(this.action);
            this.projectVariantList = new ArrayList<ProjectVariant>();
        }

        /**
         * ProjectVariant which should be assign to this TemplateVariant. This will be added to the ProjectVariantList
         * @param projectVariantGuid guid of the ProjectVariant
         * @param doNotGenerate flag to not publish this ProjectVariant
         * @param doNotUseTidy flag to not use Tidy for this ProjectVariant
         * @return this Assign instance
         */
        public Assign ProjectVariant(String projectVariantGuid, Boolean doNotGenerate, Boolean doNotUseTidy) {
            ProjectVariant projectVariant = new ProjectVariant(projectVariantGuid);
            projectVariant.setDoNotGenerate(doNotGenerate);
            projectVariant.setDoNotUseTidy(doNotUseTidy);
            this.projectVariantList.add(projectVariant);
            return this;
        }

        /**
         * Build the final RqlBuilder
         * @return new ProjectVariantsBuilder instance
         */
        public ProjectVariantsBuilder build() {
            if(this.projectVariantList.isEmpty())
                throw new IllegalArgumentException("you have to pass at least one ProjectVariant");
            this.ioData.setProject(this.project);
            this.project.setTemplate(this.template);
            this.template.setTemplateVariants(this.templateVariants);
            this.templateVariants.setTemplateVariant(this.templateVariant);
            this.templateVariant.setProjectVariants(this.projectVariants);
            this.projectVariants.setProjectVariantList(this.projectVariantList);
            return new ProjectVariantsBuilder(this);
        }

    }
}
