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

import junit.framework.Assert;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import rql4j.cms.CmsServer;
import rql4j.cms.RemoteCallWorker;
import rql4j.cms.RqlCommand;
import rql4j.domain.TemplateVariant;

import java.util.Properties;

public class TemplateVariantsBuilderTest extends TestCase {
    RqlCommand command;
    String loginGuid;
    Properties properties;

    public TemplateVariantsBuilderTest(String testName) {
        super(testName);
    }
    
        public static Test suite() {
        return new TestSuite(TemplateVariantsBuilderTest.class);
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

    public void testTemplateVariantsBuilderList() throws Exception {
        TemplateVariantsBuilder templateVariantsBuilder = new TemplateVariantsBuilder.List(
                properties.getProperty("cms.test.contentclass.guid")).WithStyleSheets(true).build();
        TemplateVariant templateVariant = command.getResult(templateVariantsBuilder).getTemplateVariantByName(
                properties.getProperty("cms.test.contentclass.template.name"));
        Assert.assertEquals(properties.getProperty("cms.test.contentclass.template.guid"), templateVariant.getGuid());

    }
}
