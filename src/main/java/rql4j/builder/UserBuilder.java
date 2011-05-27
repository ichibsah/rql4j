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
import java.util.EnumSet;
import java.util.List;

public class UserBuilder extends RqlBuilder {
    private UserBuilder(AddNew addNew) {
        super(addNew.ioData);
    }

    /**
     * create a new user
     */
    public static class AddNew implements IBuilder {

        private final IoData ioData;
        private final Administration administration;
        private final User user;
        private final List<Module> moduleList;
        private final List<Project> projectList;
        private final List<CcsConnection> ccsConnectionList;
        private final String action = "addnew";

        /**
         * create a new AddNew instance
         * @param userName name of the user
         * @param dialogLanguageId id of the dialog language - find out with {@link DialogBuilder.ListLanguages}
         * @param localId lcid of the user locale - find out with {@link LanguageBuilder.List}
         */
        public AddNew(String userName, String dialogLanguageId, String localId) {
            this.ioData = new IoData();
            this.administration = new Administration();
            this.user = new User();
            this.user.setName(userName);
            this.user.setAction(this.action);
            this.user.setUserLanguage(dialogLanguageId);
            this.user.setLcid(localId);
            this.moduleList = new ArrayList<Module>();
            this.projectList = new ArrayList<Project>();
            this.ccsConnectionList = new ArrayList<CcsConnection>();
            
        }


        /**
         * set password for the new user
         * @param password password to login
         * @return this AddNew instance
         */
        public AddNew Password(String password) {
            this.user.setPw(password);
            return this;
        }

        /**
         * set number of maximal concurrent sessions of this user
         * @param maxLogin number of concurrent user sessions
         * @return this AddNew instance
         */
        public AddNew MaxLogin(int maxLogin) {
            this.user.setMaxLogin(maxLogin);
            return this;
        }

        /**
         * set fullname of this new user
         * @param fullName name of this user
         * @return this AddNew instance
         */
        public AddNew Fullname(String fullName) {
            this.user.setFullName(fullName);
            return this;
        }

        /**
         * set description  of this user
         * @param description description text
         * @return this AddNew instance
         */
        public AddNew Description(String description) {
            this.user.setDescription(description);
            return this;
        }

        /**
         * deactivate this user
         * @param disabled if true user will be deactivated
         * @return this AddNew instance
         */
        public AddNew Disabled(Boolean disabled) {
            this.user.setDisabled(disabled);
            return this;
        }

        /**
         * Set email address of this user
         * @param email email address
         * @return this AddNew instance
         */
        public AddNew EMail(String email) {
            this.user.setEmail(email);
            return this;
        }

        /**
         * Preferred Text Editor
         * @param preferredEditor PreferredEditor
         * @return this AddNew instance
         */
        public AddNew PreferredEditor(User.PreferredEditor preferredEditor) {
            this.user.setPreferredEditor(preferredEditor);
            return this;
        }

        /**
         * DirectEdit
         * @param invertDirectEdit Boolean false = CTRL and mouse button
         * @return this AddNew instance
         */
        public AddNew InvertDirectEdit(Boolean invertDirectEdit) {
            this.user.setInvertDirectEdit(invertDirectEdit);
            return this;
        }

        /**
         * Add module license to this user. Valid modules can list with {@link ModulesBuilder.List}
         * @param moduleGuid guid of the module
         * @return this AddNew instance
         */
        public AddNew Module(String moduleGuid) {
            Module module = new Module(moduleGuid);
            module.setChecked(true);
            this.moduleList.add(module);
            return this;
        }

        /**
         * Add module license to this user. Valid modules can list with {@link ModulesBuilder.List}
         * @param moduleGuid guid of the module
         * @param flags for server manager module specify also ServerManagerFlag
         * @return this AddNew instance
         */
        public AddNew Module(String moduleGuid, EnumSet<Module.ServerManagerFlag> flags) {
            Module module = new Module(moduleGuid);
            module.setChecked(true);
            module.setServerManagerFlagSet(flags);
            this.moduleList.add(module);
            return this;
        }

        public AddNew Project(String projectGuid, Boolean translationEditor, Boolean templateEditor,
                              Project.UserLevel userLevel) {
            Project project = new Project(projectGuid);
            project.setLm(translationEditor);
            project.setChecked(true);
            project.setTe(templateEditor);
            project.setUserLevel(userLevel);
            this.projectList.add(project);
            return this;
        }

        public AddNew CcsConnecton(String ccsConnectionGuid) {
            CcsConnection ccsConnection = new CcsConnection(ccsConnectionGuid);
            ccsConnection.setChecked(true);
            ccsConnectionList.add(ccsConnection);
            return this;
        }

        /**
         * build the final RQL-Statement
         * @return new UserBuilder instance
         */
        @Override
        public UserBuilder build() {
            this.ioData.setAdministration(this.administration);

            if(moduleList.size() > 0) {
                Modules modules = new Modules();
                modules.setModuleList(this.moduleList);
                this.user.setModules(modules);
            }
            if(projectList.size() > 0) {
                Projects projects = new Projects();
                projects.setProjectList(this.projectList);
                this.user.setProjects(projects);
            }
            if(ccsConnectionList.size() > 0) {
                CcsConnections ccsConnections = new CcsConnections();
                ccsConnections.setCcsConnectionList(this.ccsConnectionList);
                this.user.setCcsConnections(ccsConnections);
            }
            this.administration.setUser(this.user);
            return new UserBuilder(this);
        }

    }
}
