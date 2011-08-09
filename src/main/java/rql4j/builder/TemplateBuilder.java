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

import java.util.List;

public class TemplateBuilder extends RqlBuilder {

    private TemplateBuilder(LoadAll loadAll) {
        super(loadAll.ioData);
    }

    private TemplateBuilder(Assign assign) {
        super(assign.ioData);
    }

    private TemplateBuilder(Save save) {
        super(save.ioData);
    }

	private TemplateBuilder(Delete delete) {
		super(delete.ioData);
	}

    public static class LoadAll implements IBuilder {
        private final IoData ioData;
        private final Project project;
        private final Template template;
        private final Elements elements;
        private final TemplateVariants templateVariants;
        private final String actionLoad;
        private final String actionList;

        public LoadAll(String contentClassGuid) {
            this.ioData = new IoData();
            this.project = new Project();
            this.template = new Template(contentClassGuid);
            this.actionLoad = "load";
            this.template.setAction(this.actionLoad);
            this.elements = new Elements();
            this.elements.setAction(this.actionLoad);
            this.templateVariants = new TemplateVariants();
            this.actionList = "list";
            this.templateVariants.setAction(this.actionList);
        }

        public LoadAll childNodesAsAttributes(Boolean loadEntries) {
            if(loadEntries)
                this.elements.setChildNodesasAttributes(loadEntries);
            return this;
        }

        public TemplateBuilder build() {
            this.ioData.setProject(this.project);
            this.project.setTemplate(this.template);
            this.template.setElements(this.elements);
            this.template.setTemplateVariants(this.templateVariants);
            return new TemplateBuilder(this);
        }
    }

    public static class Assign implements IBuilder {
        private final IoData ioData;
        private final Project project;
        private final Template template;
        private final TemplateVariants templateVariants;
        private final TemplateVariant templateVariant;
        private final String actionTemplate;
        private final String actionTemplateVariants;

        public Assign(String contentClassGuid, String templateName, String fileExtension, String code) {
            this.ioData = new IoData();
            this.project = new Project();
            this.template = new Template(contentClassGuid);
            this.templateVariants = new TemplateVariants();
            this.templateVariant = new TemplateVariant();
            this.templateVariant.setName(templateName);
            this.templateVariant.setCode(code);
            this.templateVariant.setText(code);
            this.templateVariant.setFileExtension(fileExtension);
            this.actionTemplate = "assign";
            this.template.setAction(this.actionTemplate);
            this.actionTemplateVariants = "addnew";
            this.templateVariants.setAction(this.actionTemplateVariants);
        }

        @Override
        public TemplateBuilder build() {
            this.ioData.setProject(this.project);
            this.project.setTemplate(this.template);
            this.template.setTemplateVariants(this.templateVariants);
            this.templateVariants.setTemplateVariant(this.templateVariant);
            return new TemplateBuilder(this);
        }
    }

    public static class Save implements IBuilder {
        private final IoData ioData;
        private final Project project;
        private final Template template;
        private final Elements elements;
        private final TemplateVariant templateVariant;
        private final String action;

        public Save(String contentClassGuid, List<Element> elementList,String templateGuid, String code) {
            this.ioData = new IoData();
            this.project = new Project();
            this.action = "save";
            this.template = new Template(contentClassGuid);
            this.template.setAction(this.action);
            this.elements = new Elements();
            this.elements.setElementList(elementList);
            this.templateVariant = new TemplateVariant(templateGuid);
            this.templateVariant.setText(code);
        }

        @Override
        public TemplateBuilder build() {
            this.ioData.setProject(this.project);
            this.project.setTemplate(this.template);
            this.template.setElements(this.elements);
            this.template.setTemplateVariant(this.templateVariant);
            return new TemplateBuilder(this);
        }
    }

	//ToDo: implement TestCase
	public static class Delete implements IBuilder {

		private final IoData ioData;
		private final Project project;
		private final Template template;
		private final String action = "delete";

		public Delete(String contentClassGuid) {
			this.ioData = new IoData();
			this.project = new Project();
			this.template = new Template(contentClassGuid);
			this.template.setAction(this.action);
		}

		@Override
		public TemplateBuilder build() {
			this.ioData.setProject(this.project);
			this.project.setTemplate(this.template);
			return new TemplateBuilder(this);
		}
	}
}
