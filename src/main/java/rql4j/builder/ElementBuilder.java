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

import rql4j.domain.Element;
import rql4j.domain.IoData;
import rql4j.domain.Project;
import rql4j.domain.Template;

public class ElementBuilder extends RqlBuilder {

    private ElementBuilder(Save save) {
        super(save.ioData);
    }

    public static class Save implements IBuilder {
        private final IoData ioData;
        private final Project project;
        private final Template template;
        private final Element element;
        private final String action = "save";

        public Save(String contentClassGuid, String elementName, Element.EltType elementType) {
            this.ioData = new IoData();
            this.project = new Project();
            this.template = new Template(contentClassGuid);
            this.element = new Element();
            this.element.setEltName(elementName);
            this.element.setEltType(elementType);
            this.element.setAction(this.action);
        }

        public Save(String contentClassGuid, String elementGuid, String elementName, Element.EltType elementType) {
            this.ioData = new IoData();
            this.project = new Project();
            this.template = new Template(contentClassGuid);
            this.element = new Element(elementGuid);
            this.element.setName(elementName);
            this.element.setEltType(elementType);
            this.element.setAction(this.action);
        }

        public Save(Element element) {
            if (element.getGuid() == null)
                throw new IllegalArgumentException("guid of Element has to be set");
            this.ioData = new IoData();
            this.project = new Project();
            this.template = new Template();
            this.element = element;
            this.element.setAction(this.action);
        }

        public Save defaultValue(String defaultValue) {
            this.element.setEltDefaultValue(defaultValue);
            return this;
        }

        public ElementBuilder build() {
            this.ioData.setProject(this.project);
            this.project.setTemplate(this.template);
            this.template.setElement(this.element);
            return new ElementBuilder(this);
        }
    }
}
