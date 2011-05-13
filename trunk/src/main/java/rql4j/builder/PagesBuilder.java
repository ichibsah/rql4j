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

import java.util.ArrayList;

public class PagesBuilder extends RqlBuilder {
    private PagesBuilder(List list) {
        super(list.ioData);
    }

    private PagesBuilder(DoNotTranslate doNotTranslate) {
        super(doNotTranslate.ioData);
    }

    public static class List implements IBuilder {
        private final IoData ioData;
        private final Project project;
        private final Pages pages;
        private final Link link;
        private final String action = "list";

        public List() {
            this.ioData = new IoData();
            this.project = new Project();
            this.pages = new Pages();
            this.link = null;
            this.pages.setAction(this.action);
        }

        public List(String linkGuid) {
            this.ioData = new IoData();
            this.project = null;
            this.link = new Link(linkGuid);
            this.pages = new Pages();
            this.pages.setAction(this.action);
        }

        @Override
        public PagesBuilder build() {
            if (this.project != null) {
                this.ioData.setProject(this.project);
                this.project.setPages(this.pages);
            }
            if (this.link != null) {
                this.ioData.setLink(this.link);
                this.link.setPages(this.pages);
            }
            return new PagesBuilder(this);
        }
    }

    /**
     * Builder to reject a page from the translation editor
     */
    public static class DoNotTranslate implements IBuilder {
        private final IoData ioData;
        private final Workflow workflow;
        private final Pages pages;
        private final java.util.List<Page> pageList;
        private final String action = "donottranslate";

        /**
         * Constructor to create DoNotTranslate Builder
         * @param sourceLanguageId sourceLangueId
         * @param targetLanguageId targetLanguageId
         */
        public DoNotTranslate(String sourceLanguageId, String targetLanguageId) {
            this.ioData = new IoData();
            this.workflow = new Workflow();
            this.pages = new Pages();
            this.pages.setAction(this.action);
            this.pages.setSourceLanguageId(sourceLanguageId);
            this.pages.setTargetLanguageId(targetLanguageId);
            this.pageList = new ArrayList<Page>();
        }

        public DoNotTranslate Page(String pageGuid) {
            Page page = new Page(pageGuid);
            this.pageList.add(page);
            return this;
        }

        /**
         * create new PagesBuilder instance for DoNotTranslate Builder
         * @return new PagesBuilder instance
         */
        @Override
        public PagesBuilder build() {
            this.ioData.setWorkflow(this.workflow);
            this.workflow.setPages(this.pages);
            this.pages.setPageList(this.pageList);
            return new PagesBuilder(this);
        }
    }
}
