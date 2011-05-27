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
import rql4j.domain.Keyword;
import rql4j.domain.Project;

import java.util.ArrayList;
import java.util.List;

public class KeywordBuilder extends RqlBuilder {

    private KeywordBuilder(AddNew addNew) {
        super(addNew.ioData);
    }

    private KeywordBuilder(Delete delete) {
        super(delete.ioData);
    }

    private KeywordBuilder(Load load) {
        super(load.ioData);
    }

    private KeywordBuilder(Save save) {
        super(save.ioData);
    }

    public static class AddNew implements IBuilder {
        private final IoData ioData;
        private final Project project;
        private final Category category;
        private final String action = "addnew";
        private final List<Keyword> keywordList;

        public AddNew(String categoryGuid) {
            this.ioData = new IoData();
            this.project = new Project();
            this.category = new Category(categoryGuid);
            this.keywordList = new ArrayList<Keyword>();
        }

        public AddNew Keyword(String keywordValue) {
            Keyword keyword = new Keyword();
            keyword.setValue(keywordValue);
            keyword.setAction(this.action);
            this.keywordList.add(keyword);
            return this;
        }

        @Override
        public KeywordBuilder build() {
            this.ioData.setProject(this.project);
            this.project.setCategory(this.category);
            this.category.setKeywordList(this.keywordList);
            return new KeywordBuilder(this);
        }
    }

    public static class Delete implements IBuilder {
        private final IoData ioData;
        private final Project project;
        private final Keyword keyword;
        private final String action;

        public Delete(String keywordGuid) {
            this.ioData = new IoData();
            this.project = new Project();
            this.keyword = new Keyword(keywordGuid);
            this.action = "delete";
            this.keyword.setAction(this.action);
        }

        public Delete force(Boolean force) {
            if(force)
                this.keyword.setForce(force);
            return this;
        }

        public Delete force(Boolean force, String password) {
            if(force) {
                this.keyword.setForce(force);
                this.keyword.setPassword(password);
            }
            return this;
        }

        @Override
        public KeywordBuilder build(){
            this.ioData.setProject(this.project);
            this.project.setKeyword(this.keyword);
            return new KeywordBuilder(this);
        }
    }

    public static class Load implements IBuilder {
        private final IoData ioData;
        private final Project project;
        private final Category category;
        private final Keyword keyword;
        private final String action;

        public Load(String keywordGuid) {
            this.ioData = new IoData();
            this.project = new Project();
            this.category = new Category();
            this.keyword = new Keyword(keywordGuid);
            this.action = "load";
            this.keyword.setAction(this.action);
        }

        public KeywordBuilder build() {
            this.ioData.setProject(this.project);
            this.project.setCategory(this.category);
            this.category.setKeyword(this.keyword);
            return new KeywordBuilder(this);
        }
    }

    public static class Save implements IBuilder {
        private final IoData ioData;
        private final Project project;
        private final Category category;
        private final List<Keyword> keywordList;
        private final String action;

        public Save() {
            this.ioData = new IoData();
            this.project = new Project();
            this.category = new Category();
            this.keywordList = new ArrayList<Keyword>();
            this.action = "save";
        }

        public Save saveKeyword(String keywordGuid, String keywordValue) {
            Keyword keyword = new Keyword(keywordGuid);
            keyword.setValue(keywordValue);
            keyword.setAction(this.action);
            this.keywordList.add(keyword);
            return this;
        }

        @Override
        public KeywordBuilder build() {
            this.ioData.setProject(this.project);
            this.project.setCategory(this.category);
            this.category.setKeywordList(this.keywordList);
            return new KeywordBuilder(this);
        }
    }
}
