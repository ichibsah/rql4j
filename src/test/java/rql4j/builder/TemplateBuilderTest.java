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
import rql4j.domain.Element;
import rql4j.iodata.IoTemplate;
import junit.framework.Assert;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

import java.util.List;
import java.util.Properties;

public class TemplateBuilderTest extends TestCase{
    RqlCommand command;
    String loginGuid;
    Properties properties;
    List<Element> elementList;

    public TemplateBuilderTest(String testName) {
        super(testName);
    }

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

    /**
     * @return the suite of tests being tested
     */
    public static Test suite() {
        return new TestSuite(TemplateBuilderTest.class);
    }

    public void testTemplateBuilderLoadAll() {
        TemplateBuilder templateBuilder = new TemplateBuilder.LoadAll(properties.getProperty("cms.test.contentclass.guid")).childNodesAsAttributes(true).build();
        IoTemplate ioTemplate = command.getResult(templateBuilder);
        this.elementList = ioTemplate.getIoData().getTemplate().getElements().getElementList();
        Assert.assertEquals(properties.getProperty("cms.test.contentclass.guid"), ioTemplate.getIoData().getTemplate().getGuid());
    }
    
    public void testTemplateBuilderAssign() throws Exception {
        TemplateBuilder templatesBuilder = new TemplateBuilder.Assign(properties.getProperty("cms.test.contentclass.guid"), "HTMLNEU2", "html", "<html>Hello World</html>").build();
        command.getResult(templatesBuilder);
    }

    public void testTemplateBuilderSave() throws Exception {
        TemplateBuilder templateBuilder = new TemplateBuilder.LoadAll(properties.getProperty("cms.test.contentclass.guid")).childNodesAsAttributes(true).build();
        IoTemplate ioTemplate = command.getResult(templateBuilder);
        this.elementList = ioTemplate.getIoData().getTemplate().getElements().getElementList();
        templateBuilder = new TemplateBuilder.Save(properties.getProperty("cms.test.contentclass.guid"), this.elementList, properties.getProperty("cms.test.contentclass.template.guid"), "<html>Test</html>").build();
        command.getResult(templateBuilder);
    }
}
