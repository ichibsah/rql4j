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

public class AccountsystemBuilder extends RqlBuilder {
    private AccountsystemBuilder(AddNewNT newNT) {
        super(newNT.ioData);
    }

    /**
     * Build RQL-Statement to add an external directory service for Windows NT system.
     */
    public static class AddNewNT implements IBuilder {
        private final IoData ioData;
        private final AccountSystem accountSystem;
        private final String action = "addnew";
        private final AccountSystem.AccountSystemType systemType = AccountSystem.AccountSystemType.WIN_NT;

        /**
         * Create a new instance for Winddows NT directory service
         *
         * @param name name of new directory service to be defined
         * @param user username who has access to the user directory
         * @param domain domainname where the corresponding users are registered
         * @param anonymous if the application server is located in the domain from which the users are imported, you can set true here
         * @param group Name of the group in the domain where the corresponding users are registered
         * @param path Full name of the folder from which to import the users
         * @param password Appropriate password for the user
         */
        public AddNewNT(String name, String domain, Boolean anonymous, String user,
                        String group, String path, String password) {
            this.ioData = new IoData();
            this.accountSystem = new AccountSystem();
            this.accountSystem.setAction(this.action);
            this.accountSystem.setName(name);
            this.accountSystem.setAnonymousnt(anonymous);
            this.accountSystem.setUser(user);
            this.accountSystem.setDomain(domain);
            this.accountSystem.setGroup(group);
            this.accountSystem.setPath(path);
            this.accountSystem.setSystem(this.systemType);
            this.accountSystem.setPass(password);
        }

        /**
         * Build RQL-Statement
         *
         * @return a new {@link AccountsystemBuilder}
         */

        @Override
        public AccountsystemBuilder build() {
            this.ioData.setAccountSystem(this.accountSystem);
            return new AccountsystemBuilder(this);
        }

    }


    public static class AddNewLDAP implements IBuilder {
//<IODATA loginguid="[!guid_login!]">
//  <ACCOUNTSYSTEM action="addnew"
//   name="test_ldap"
//   anonymousldap="" binddn="" ldapserver=""
//   port="" path="" filter="" scope=""
//   system="V2" ldappass="ldap_pw"/>
//</IODATA>



        @Override
        public RqlBuilder build() {
            return null;  //To change body of implemented methods use File | Settings | File Templates.
        }
    }
}
