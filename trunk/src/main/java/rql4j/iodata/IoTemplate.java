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

import rql4j.domain.Element;
import rql4j.domain.IoData;
import rql4j.domain.TemplateVariant;

import java.util.List;

public class IoTemplate extends IoObject {
    public IoTemplate(IoData ioData) {
        super(ioData);
    }

    public Element getElementByName(String elementName) {
        if (this.ioData != null &&
                this.ioData.getTemplate() != null &&
                this.ioData.getTemplate().getElements() != null &&
                this.ioData.getTemplate().getElements().getElementList() != null) {
            List<Element> elementList = this.ioData.getTemplate().getElements().getElementList();
            for (Element element : elementList) {
                if (element.getEltName().equals(elementName))
                    return element;
            }
        }
        return null;
    }

    public TemplateVariant getTemplateVariantByName(String templateVariantName) {
        if(this.ioData != null &&
                this.ioData.getTemplate() != null &&
                this.ioData.getTemplate().getTemplateVariants() != null &&
                this.ioData.getTemplate().getTemplateVariants().getTemplateVariantList() != null) {
            List<TemplateVariant> templateVariantList = this.ioData.getTemplate().getTemplateVariants()
                    .getTemplateVariantList();
            for(TemplateVariant templateVariant: templateVariantList) {
                if(templateVariant.getName().equals(templateVariantName))
                    return templateVariant;
            }
        }
        return null;
    }
}
