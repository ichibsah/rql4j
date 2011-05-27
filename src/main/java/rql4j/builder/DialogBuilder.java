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

import rql4j.domain.Dialog;
import rql4j.domain.IoData;

public class DialogBuilder extends RqlBuilder {
    private DialogBuilder(ListLanguages listLanguages) {
        super(listLanguages.ioData);
    }

    /**
     * RqlBuilder to display all dialog languages, which are supported by the Server
     */
    public static class ListLanguages implements IBuilder {
        private final IoData ioData;
        private final Dialog dialog;
        private final String action = "listlanguages";

        /**
         * constructor to create new ListLanguages Builder
         */
        public ListLanguages() {
            this.ioData = new IoData();
            this.dialog = new Dialog();
            this.dialog.setAction(this.action);
        }

        /**
         * you can specify how the return values should be sorted
         * @param orderBy sort criteria
         * @return this ListLanguages instance
         */
        public ListLanguages OrderBy(Dialog.OrderBy orderBy) {
            this.dialog.setOrderBy(orderBy);
            return this;
        }

        /**
         * build the final RQL statement
         * @return new DialogBuilder instance
         */
        @Override
        public DialogBuilder build() {
            this.ioData.setDialog(this.dialog);
            return new DialogBuilder(this);
        }
    }
}
