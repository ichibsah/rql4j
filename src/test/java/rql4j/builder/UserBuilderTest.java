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

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import rql4j.cms.CmsServer;
import rql4j.cms.RemoteCallWorker;
import rql4j.cms.RqlCommand;
import rql4j.domain.Module;
import rql4j.domain.Project;

import java.util.List;
import java.util.Properties;

public class UserBuilderTest extends TestCase {

    RqlCommand command;
    Properties properties;
    String loginGuid;

    @Override
    protected void setUp() throws Exception {
        super.setUp();
        this.properties = new Properties();
        properties.load(ClassLoader.getSystemResourceAsStream("cms.properties"));
        CmsServer server = new CmsServer(properties.getProperty("cms.test.url"));
        RemoteCallWorker worker = new RemoteCallWorker(server);
        this.command = new RqlCommand(worker);
        AdministrationBuilder loginBuilder = new AdministrationBuilder.Login(properties.getProperty("cms.test.user"), properties.getProperty("cms.test.password")).build();
        this.loginGuid = command.getResult(loginBuilder).getLogin().getGuid();
        AdministrationBuilder validateBuilder = new AdministrationBuilder.Validate(properties.getProperty("cms.test.project.guid")).build();
        command.getResult(validateBuilder);
    }

    @Override
    protected void tearDown() throws Exception {
        super.tearDown();
        RqlBuilder logoutBuilder = new AdministrationBuilder.Logout(this.loginGuid).build();
        command.addCommand(logoutBuilder);
        command.execute();
    }

    public UserBuilderTest(String name) {
        super(name);
    }

    public static Test suite() {
        return new TestSuite(UserBuilderTest.class);
    }

    public void testUserBuilderAddNew() throws Exception {
        ModulesBuilder modulesBuilder = new ModulesBuilder.List().build();
        List<Module> moduleList = command.getResult(modulesBuilder).getModules().getModuleList();
        UserBuilder.AddNew addNewUserBuilder = new UserBuilder.AddNew(properties.getProperty("cms.test.user.name"),
                properties.getProperty("cms.test.user.language"), properties.getProperty("cms.test.user.lcid"))
                .Password(properties.getProperty("cms.test.user.password"))
                .EMail(properties.getProperty("cms.test.user.email"))
                .MaxLogin(2)
                .Project(properties.getProperty("cms.test.project.guid"), true, true, Project.UserLevel.ADMINISTRATOR);
        for(Module module: moduleList) {
            addNewUserBuilder.Module(module.getGuid());
            if(module.getModules() != null) {
                List<Module> cmsModuleList = module.getModules().getModuleList();
                for(Module cmsModule: cmsModuleList) {
                    addNewUserBuilder.Module(cmsModule.getGuid());
                }
            }
        }
        UserBuilder userBuilder = addNewUserBuilder.build();
        command.getResult(userBuilder);
    }

    public void testUserBuilderDelete() throws Exception {
        UserBuilder userBuilder = new UserBuilder.Delete(properties.getProperty("cms.test.user.delete.guid")).build();
        command.getResult(userBuilder);
    }

    public void testUserBuilderSessionInfo() throws Exception {
        UserBuilder userBuilder = new UserBuilder.SessionInfo().build();
        command.getResult(userBuilder);
    }

    public void testUserBuilderSaveGroup() throws Exception {
        UserBuilder userBuilder = new UserBuilder.SaveGroup(properties.getProperty("cms.test.user.guid"))
                .Group(properties.getProperty("cms.test.goup.guid")).build();
        command.getResult(userBuilder);
    }
}
