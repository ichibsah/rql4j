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

import rql4j.domain.Elements;
import rql4j.domain.IoData;
import rql4j.domain.Page;

import java.util.ArrayList;
import java.util.List;

public class ElementsBuilder extends RqlBuilder {
    private ElementsBuilder(Load load) {
        super(load.ioData);
    }

    public static class Load implements IBuilder{
        private final IoData ioData;
        private final List<Page> pages;
        private final Elements elements;
        private final String action;

        public Load(String pageGuid) {
            this.ioData = new IoData();
            Page page = new Page(pageGuid);
            this.elements = new Elements();
            this.action ="load";
            this.elements.setAction(this.action);
            page.setElements(this.elements);
            this.pages = new ArrayList<Page>();
            pages.add(page);
        }

        public ElementsBuilder build() {
            this.ioData.setPageList(this.pages);
            return new ElementsBuilder(this);
        }
    }
}
