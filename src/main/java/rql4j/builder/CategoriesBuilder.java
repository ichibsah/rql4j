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

import rql4j.domain.Categories;
import rql4j.domain.IoData;
import rql4j.domain.Project;

public class CategoriesBuilder extends RqlBuilder {

    private CategoriesBuilder(List list) {
        super(list.ioData);
    }

    /**
     * RqlBuilder to list all categories of a project
     */
    public static class List implements IBuilder {
        private final IoData ioData;
        private final Project project;
        private final Categories categories;
        private final String action = "list";

        /**
         * Create a new List instance
         */
        public List() {
            this.ioData = new IoData();
            this.project = new Project();
            this.categories = new Categories();
            this.categories.setAction(this.action);
        }

        /**
         * Build the final RqlBuilder
         * @return new CategoriesBuilder instance
         */
        @Override
        public CategoriesBuilder build() {
            this.ioData.setProject(this.project);
            this.project.setCategories(this.categories);
            return new CategoriesBuilder(this);
        }
    }
}
