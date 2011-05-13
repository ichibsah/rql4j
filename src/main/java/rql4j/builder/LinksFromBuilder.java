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
import rql4j.domain.LinksFrom;
import rql4j.domain.Page;

public class LinksFromBuilder extends RqlBuilder {
    private LinksFromBuilder(Load load) {
        super(load.ioData);
    }

    /**
     * Builder to to display linking information of a page.
     */
    public static class Load implements IBuilder {
        private final IoData ioData;
        private final Page page;
        private final LinksFrom linksFrom;
        private final String action = "load";

        /**
         * Construktor for Load Builder
         * @param pageGuid Guid of Page
         */
        public Load(String pageGuid) {
            this.ioData = new IoData();
            this.page = new Page(pageGuid);
            this.linksFrom = new LinksFrom();
            this.linksFrom.setAction(this.action);
        }

        /**
         * Build the Load Builder
         * @return new LinksFromBuilder instance
         */
        public LinksFromBuilder build() {
            this.ioData.setPage(this.page);
            this.page.setLinksFrom(this.linksFrom);
            return new LinksFromBuilder(this);
        }
    }
}
