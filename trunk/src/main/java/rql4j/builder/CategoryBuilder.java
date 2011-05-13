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
import rql4j.domain.Project;

public class CategoryBuilder extends RqlBuilder {
    private CategoryBuilder(AddNew addNew) {
        super(addNew.ioData);
    }

    private CategoryBuilder(Delete delete) {
        super(delete.ioData);
    }

    private CategoryBuilder(Load load) {
        super(load.ioData);
    }

    private CategoryBuilder(Save save) {
        super(save.ioData);
    }

    /**
     * Create a new category in a project
     */
    public static class AddNew implements IBuilder {
        private final IoData ioData;
        private final Project project;
        private final Category category;
        private final String action = "addnew";

        /**
         * Constructor to create new AddNew instance
         * @param categoryValue Name of the category
         */
        public AddNew(String categoryValue) {
            this.ioData = new IoData();
            this.project = new Project();
            this.category = new Category();
            this.category.setValue(categoryValue);
            this.category.setAction(this.action);
        }

        /**
         * Build the final RqlBuilder
         * @return new CategoryBuilder instance
         */
        @Override
        public CategoryBuilder build() {
            this.ioData.setProject(this.project);
            this.project.setCategory(this.category);
            return new CategoryBuilder(this);
        }
    }

    /**
     * delete a category in a project
     */
    public static class Delete implements IBuilder {
        private final IoData ioData;
        private final Project project;
        private final Category category;
        private final String action;

        /**
         * constructor to create new Delete instance
         * @param categoryGuid
         */
        public Delete(String categoryGuid) {
            this.ioData = new IoData();
            this.project = new Project();
            this.category = new Category(categoryGuid);
            this.action = "delete";
            this.category.setAction(this.action);
        }

        /**
         * force delete however pages with keyword of this category still exist
         * @param force set to true if you want to force
         * @return current Delete instance
         */
        public Delete force(Boolean force) {
            this.category.setForce(force);
            return this;
        }

        /**
         * force delete in case sturcture elements where be prea    ssign with keywords of this category
         * @param force
         * @param password
         * @return
         */
        public Delete force(Boolean force, String password) {
            this.category.setForce(force);
            this.category.setPassword(password);
            return this;
        }

        @Override
        public CategoryBuilder build() {
            this.ioData.setProject(this.project);
            this.project.setCategory(this.category);
            return new CategoryBuilder(this);
        }
    }

    public static class Load implements IBuilder {
        private final IoData ioData;
        private final Project project;
        private final Category category;
        private final String action;

        public Load(String categoryGuid) {
            this.ioData = new IoData();
            this.project = new Project();
            this.category = new Category(categoryGuid);
            this.action = "load";
            this.category.setAction(action);
        }

        @Override
        public CategoryBuilder build() {
            this.ioData.setProject(this.project);
            this.project.setCategory(this.category);
            return new CategoryBuilder(this);
        }
    }

    public static class Save implements IBuilder {
        private final IoData ioData;
        private final Project project;
        private final Category category;
        private final String action;

        public Save(String newValue, String categoryGuid) {
            this.ioData = new IoData();
            this.project = new Project();
            this.category = new Category(categoryGuid);
            this.action = "save";
            this.category.setAction(action);
            this.category.setValue(newValue);
        }

        @Override
        public CategoryBuilder build() {
            this.ioData.setProject(this.project);
            this.project.setCategory(this.category);
            return new CategoryBuilder(this);
        }
    }
}
