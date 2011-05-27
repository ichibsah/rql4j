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

import rql4j.domain.Category;
import rql4j.domain.IoData;
import rql4j.domain.Keywords;
import rql4j.domain.Project;

public class KeywordsBuilder extends RqlBuilder {
    private KeywordsBuilder(Load load) {
        super(load.ioData);
    }

    /**
     * list all keywords of a category
     */
    public static class Load implements IBuilder {
        private final IoData ioData;
        private final Project project;
        private final Category category;
        private final Keywords keywords;
        private final String action = "load";

        /**
         * create new List instance
         * @param categoryGuid GUID of the category
         */
        public Load(String categoryGuid) {
            this.ioData = new IoData();
            this.project = new Project();
            this.category = new Category(categoryGuid);
            this.keywords = new Keywords();
            this.keywords.setAction(this.action);
        }

        /**
         * build final RQL-Statement
         * @return new KeywordBuilder instance
         */
        @Override
        public KeywordsBuilder build() {
            this.ioData.setProject(this.project);
            this.project.setCategory(this.category);
            this.category.setKeywords(this.keywords);
            return new KeywordsBuilder(this);
        }
    }
}
