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
import rql4j.domain.Template;

import java.util.List;

public class IoTemplates extends IoObject{

    public IoTemplates(IoData ioData) {
        super(ioData);
    }

    public Template getTemplateByName(String name) {
        if (this.ioData != null &&
                this.ioData.getTemplates() != null &&
                this.ioData.getTemplates().getTemplateList() != null) {
            List<Template> templateList = this.ioData.getTemplates().getTemplateList();
            for (Template template : templateList) {
                if (template.getName().equals(name))
                    return template;
            }
        }
        return null;
    }

    public List<Template> getTemplates() {
        if (this.ioData != null &&
                this.ioData.getTemplates() != null &&
                this.ioData.getTemplates().getTemplateList() != null) {
            return this.ioData.getTemplates().getTemplateList();
        }
        return null;
    }
}
