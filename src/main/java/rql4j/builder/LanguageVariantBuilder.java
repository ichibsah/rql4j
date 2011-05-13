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
import rql4j.domain.Languagevariant;
import rql4j.domain.Project;

public class LanguageVariantBuilder extends RqlBuilder {

    private LanguageVariantBuilder(SetActive setActive) {
        super(setActive.ioData);
    }

    public static class SetActive {
        private final IoData ioData;
        private final Project project;
        private final Languagevariant languagevariant;
        private final String action;

        public SetActive(String languageVariantGuid) {
            this.ioData = new IoData();
            this.project = new Project();
            this.languagevariant = new Languagevariant(languageVariantGuid);
            this.action = "setactive";
            this.languagevariant.setAction(this.action);
        }

        public LanguageVariantBuilder build() {
            this.ioData.setProject(project);
            this.project.setLanguageVariant(this.languagevariant);
            return new LanguageVariantBuilder(this);
        }
    }
}
