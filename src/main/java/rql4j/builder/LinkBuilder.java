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
import rql4j.domain.Link;
import rql4j.domain.Page;
import rql4j.domain.Pages;

import java.util.List;

public class LinkBuilder extends RqlBuilder {
    private LinkBuilder(AssignPage assignPage) {
        super(assignPage.ioData);
    }

    private LinkBuilder(Reference reference) {
        super(reference.ioData);
    }

    private LinkBuilder(Save save) {
        super(save.ioData);
    }

    public static class AssignPage implements IBuilder {

        private final IoData ioData;
        private final Link link;
        private final Page page;
        private final String action;

        public AssignPage(String linkGuid, String pageGuid) {
            this.ioData = new IoData();
            this.link = new Link(linkGuid);
            this.page = new Page(pageGuid);
            this.action = "assign";
            this.link.setAction(this.action);
        }

        public LinkBuilder build() {
            this.ioData.setLink(this.link);
            this.link.setPage(this.page);
            return new LinkBuilder(this);
        }
    }

    public static class Reference implements IBuilder {

        private final IoData ioData;
        private final Page page;
        private final Link link;
        private final Page pageRef;
        private final String action = "reference";

        public Reference(String linkGuid, String pageGuid) {
            this.ioData = new IoData();
            this.page = new Page();
            this.link = new Link(linkGuid);
            this.link.setAction(this.action);
            this.pageRef = new Page(pageGuid);
        }

        public LinkBuilder build() {
            this.ioData.setPage(this.page);
            this.page.setLink(this.link);
            this.link.setPage(this.pageRef);
            return new LinkBuilder(this);
        }
    }

    public static class Save implements IBuilder {
        private final IoData ioData;
        private final Link link;
        private final Pages pages;
        private final List<Page> pageList;
        private final String action = "save";
        private final String pagesAction = "saveorder";

        public Save(String linkGuid, List<Page> pageList) {
            this.ioData = new IoData();
            this.link = new Link(linkGuid);
            this.link.setAction(this.action);
            this.link.setOrderBy(Link.OrderBy.MANUAL);
            this.pages = new Pages();
            this.pages.setAction(this.pagesAction);
            this.pageList = pageList;
        }

        public LinkBuilder build() {
            this.ioData.setLink(this.link);
            this.link.setPages(this.pages);
            this.pages.setPageList(this.pageList);
            return new LinkBuilder(this);
        }


    }
}
