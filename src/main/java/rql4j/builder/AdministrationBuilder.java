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
import rql4j.domain.Project;

public class AdministrationBuilder extends RqlBuilder {

    private AdministrationBuilder(Login login) {
        super(login.ioData);
    }

    private AdministrationBuilder(Validate validate) {
        super(validate.ioData);
    }

    private AdministrationBuilder(Logout logout) {
        super(logout.ioData);
    }

    public static class Login implements IBuilder {
        private final IoData ioData;
        private final Administration administration;
        private final String action = "login";

        public Login(String username, String password) {
            this.ioData = new IoData();
            this.administration = new Administration(username, password);
            this.administration.setAction(this.action);
        }

        public AdministrationBuilder build() {
            this.ioData.setAdministration(this.administration);
            return new AdministrationBuilder(this);
        }

    }

    public static class Validate implements IBuilder {
        private final IoData ioData;
        private final Administration administration;
        private final Project project;
        private final String action = "validate";

        public Validate(String projectGuid) {
            this.ioData = new IoData();
            this.administration = new Administration();
            this.administration.setAction(this.action);
            this.project = new Project(projectGuid);
        }

        public AdministrationBuilder build() {
            this.ioData.setAdministration(this.administration);
            this.administration.setProject(this.project);
            return new AdministrationBuilder(this);
        }
    }

    public static class Logout implements IBuilder {
        private final IoData ioData;
        private final Administration administration;
        private final rql4j.domain.Logout logout;

        public Logout(String loginGuid) {
            this.ioData = new IoData();
            this.administration = new Administration();
            this.logout = new rql4j.domain.Logout(loginGuid);
        }

        public AdministrationBuilder build() {
            this.ioData.setAdministration(this.administration);
            this.administration.setLogout(this.logout);
            return new AdministrationBuilder(this);
        }

    }

}
