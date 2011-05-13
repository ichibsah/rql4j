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
import rql4j.domain.IoData;
import junit.framework.Assert;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

import java.util.Properties;

public class KeywordBuilderTest extends TestCase {
    RqlCommand command;
    Properties properties;
    String loginGuid;
    String categoryGuid;
    String keywordGuid;

    private static final String CATEGORY_VALUE = "Test Category";
    private static final String[] KEYWORD_VALUES = {"Keyword 1", "Keyword 2"};

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
        CategoryBuilder categoryBuilder = new CategoryBuilder.AddNew(CATEGORY_VALUE).build();
        IoData ioData = command.getResult(categoryBuilder);
        Assert.assertEquals(CATEGORY_VALUE, ioData.getCategory().getValue());
        this.categoryGuid = ioData.getCategory().getGuid();
        String[] test = {"Test"};
        KeywordBuilder keywordBuilder = new KeywordBuilder.AddNew().addKeywords(this.categoryGuid, test).build();
        this.keywordGuid = command.getResult(keywordBuilder).getKeyword().getGuid();
    }

    @Override
    protected void tearDown() throws Exception {
        super.tearDown();
        CategoryBuilder categoryBuilder = new CategoryBuilder.Delete(this.categoryGuid).build();
        command.getResult(categoryBuilder);
        RqlBuilder logoutBuilder = new AdministrationBuilder.Logout(this.loginGuid).build();
        command.addCommand(logoutBuilder);
        command.execute();
    }

    public KeywordBuilderTest(String name) {
        super(name);
    }

    public static Test suite() {
        return new TestSuite(KeywordBuilderTest.class);
    }

    public void testKeywordBuilderAddNew() throws Exception {
        KeywordBuilder keywordBuilder = new KeywordBuilder.AddNew().addKeywords(this.categoryGuid, KEYWORD_VALUES).build();
        IoData ioData = command.getResult(keywordBuilder);
        Assert.assertEquals(this.categoryGuid, ioData.getKeyword().getCategoryGuid());
    }

    public void testKeywordBuilderDelete() throws Exception {
        KeywordBuilder keywordBuilder = new KeywordBuilder.Delete(this.keywordGuid).force(true, properties.getProperty("cms.test.password")).build();
        command.getResult(keywordBuilder);
    }

    public void testKeywordBuilderLoad() throws Exception {
        KeywordBuilder keywordBuilder = new KeywordBuilder.Load(this.keywordGuid).build();
        IoData ioData = command.getResult(keywordBuilder);
        Assert.assertEquals(this.categoryGuid, ioData.getKeyword().getCategoryGuid());
    }

    public void testKeywordBuilderSave() throws Exception {
        KeywordBuilder keywordBuilder = new KeywordBuilder.Save().saveKeyword(this.keywordGuid, "Keyword Neu").build();
        IoData ioData = command.getResult(keywordBuilder);
        Assert.assertEquals("Keyword Neu", ioData.getKeyword().getValue());
    }

}
