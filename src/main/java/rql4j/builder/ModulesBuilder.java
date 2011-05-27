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

import rql4j.domain.Administration;
import rql4j.domain.IoData;
import rql4j.domain.Modules;

public class ModulesBuilder extends RqlBuilder {
    private ModulesBuilder(List list) {
        super(list.ioData);
    }

    /**
     * list modules of the cms server or licenses of a user
     */
    public static class List implements IBuilder {
        private final IoData ioData;
        private final Administration administration;
        private final Modules modules;
        private final String action = "list";

        /**
         * constructor to create new List instance
         */
        public List() {
            this.ioData = new IoData();
            this.administration = new Administration();
            this.modules = new Modules();
            this.modules.setAction(this.action);
        }

        /**
         * show modules licenses
         * @param countLicense set to true to get 
         * @return
         */
        public List CountLicense(Boolean countLicense) {
            this.modules.setCountLicense(countLicense);
            return this;
        }

        public List userGuid(String userGuid) {
            this.modules.setUserGuid(userGuid);
            return this;
        }

        @Override
        public ModulesBuilder build() {
            this.ioData.setAdministration(this.administration);
            this.administration.setModules(this.modules);
            return new ModulesBuilder(this);
        }
    }
}
