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
import rql4j.domain.Language;

public class LanguageBuilder extends RqlBuilder {
    private LanguageBuilder(List list) {
        super(list.ioData);
    }

    /**
     * list all kinds of languages which are available in the CMS
     */
    public static class List implements IBuilder {
        private final IoData ioData;
        private final Language language;
        private final String action = "list";

        /**
         * create new List instance
         */
        public List() {
            this.ioData = new IoData();
            this.language = new Language();
            this.language.setAction(this.action);
        }

        /**
         * build the final RQL-Statement
         * @return new LanguageBuilder instance
         */
        @Override
        public LanguageBuilder build() {
            this.ioData.setLanguage(this.language);
            return new LanguageBuilder(this);
        }
    }
}
