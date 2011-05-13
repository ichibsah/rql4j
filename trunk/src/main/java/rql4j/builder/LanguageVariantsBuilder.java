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
import rql4j.domain.Languagevariants;
import rql4j.domain.Project;

public class LanguageVariantsBuilder extends RqlBuilder {
    private LanguageVariantsBuilder(List list) {
        super(list.ioData);
    }

    public static class List {
        private final IoData ioData;
        private final Project project;
        private final Languagevariants languagevariants;
        private final String action;

        public List() {
            this.ioData = new IoData();
            this.project = new Project();
            this.languagevariants = new Languagevariants();
            this.action = "list";
            this.languagevariants.setAction(this.action);
        }

        public LanguageVariantsBuilder build() {
            this.ioData.setProject(this.project);
            this.project.setLanguageVariants(this.languagevariants);
            return new LanguageVariantsBuilder(this);
        }
    }
}
