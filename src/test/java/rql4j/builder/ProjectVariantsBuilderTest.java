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

import rql4j.cms.CmsServer;
import rql4j.cms.RemoteCallWorker;
import rql4j.cms.RqlCommand;
import rql4j.domain.ProjectVariant;
import rql4j.iodata.IoAdminstration;
import junit.framework.TestCase;

import java.util.List;
import java.util.Properties;

public class ProjectVariantsBuilderTest extends TestCase {
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
        IoAdminstration adminstration = command.getResult(validateBuilder);
    }

    @Override
    protected void tearDown() throws Exception {
        super.tearDown();
        RqlBuilder logoutBuilder = new AdministrationBuilder.Logout(this.loginGuid).build();
        command.addCommand(logoutBuilder);
        command.execute();
    }

    public void testProjectVariantsBuilderList() throws Exception {
        ProjectVariantsBuilder builder = new ProjectVariantsBuilder.List().build();
        ProjectVariant displayFormat = command.getResult(builder).getDisplayFromat();
        assertEquals("HTML/Test", displayFormat.getName());
        ProjectVariant userDisplayVariant = command.getResult(builder).getUserDisplayVariant();
        assertEquals("HTML/Test", displayFormat.getName());
        ProjectVariant htmlDisplayFormat = command.getResult(builder).getProjectVariantByName("HTML/Test");
        assertEquals("HTML/Test", htmlDisplayFormat.getName());
        List<ProjectVariant> projectVariantList = command.getResult(builder).getProjectVariants();
        assertEquals(2, projectVariantList.size());
    }

    public void testProjectVariantsBuilderAssign() throws Exception {
        ProjectVariantsBuilder projectVariantsBuilder = new ProjectVariantsBuilder.Assign(
                properties.getProperty("cms.test.contentclass.guid"),
                properties.getProperty("cms.test.contentclass.template.guid")
        ).ProjectVariant(properties.getProperty("cms.test.projectvariant.guid"), true, false).build();
        command.getResult(projectVariantsBuilder);
    }
}
