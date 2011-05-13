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
import rql4j.domain.Links;
import rql4j.domain.Page;

import java.util.ArrayList;
import java.util.List;

public class LinksBuilder extends RqlBuilder{
    private LinksBuilder(Load load) {
        super(load.ioData);
    }

    public static class Load implements IBuilder{

        private final IoData ioData;
        private final List<Page> pages;
        private final Links links;
        private final String action;

        public Load(String pageGuid) {
            this.ioData = new IoData();
            this.pages = new ArrayList<Page>();
            Page page = new Page(pageGuid);
            this.links = new Links();
            this.action = "load";
            this.links.setAction(this.action);
            page.setLinks(this.links);
            this.pages.add(page);
        }

        public LinksBuilder build() {
            this.ioData.setPageList(this.pages);
            return new LinksBuilder(this);
        }
    }
}
