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
import rql4j.domain.IoData;
import rql4j.domain.Page;
import rql4j.domain.SearchItem;
import junit.framework.Assert;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import org.apache.commons.lang.RandomStringUtils;

import java.util.*;

public class PageBuilderTest extends TestCase {
    RqlCommand command;
    String loginGuid;
    Properties properties;
    List<String> headlines;
    Set<String> pageGuids;

    public PageBuilderTest(String name) {
        super(name);
        this.pageGuids = new HashSet<String>();
        this.headlines = new ArrayList<String>();
    }

    public static Test suite() {
        return new TestSuite(PageBuilderTest.class);
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


        // Create TestPage
        PageBuilder.AddNew addNew = new PageBuilder.AddNew();
        String headline = RandomStringUtils.randomAlphabetic(10);
        this.headlines.add(headline);
        addNew.Page(properties.getProperty("cms.test.contentclass.guid"), headline);
        headline = RandomStringUtils.randomAlphabetic(10);
        this.headlines.add(headline);
        addNew.Page(properties.getProperty("cms.test.contentclass.guid"), headline);
        PageBuilder pageBuilder = addNew.build();
        List<Page> createdPages = new ArrayList<Page>();
        List<IoData> ioDataList = command.getResult(pageBuilder).getIoData().getIoDataList();
        for (IoData ioData : ioDataList) {
            createdPages.add(ioData.getPage());
        }
        for (Page page : createdPages) {
            this.pageGuids.add(page.getGuid());
        }
        Assert.assertEquals(2, createdPages.size());
    }

    @Override
    protected void tearDown() throws Exception {
        super.tearDown();

        //Delete TestPage
        PageBuilder.Delete delete = new PageBuilder.Delete();
        for (String pageGuid : pageGuids) {
            delete.Page(pageGuid);
        }
        PageBuilder pageBuilder = delete.build();
        command.addCommand(pageBuilder);
        command.execute();

        RqlBuilder logoutBuilder = new AdministrationBuilder.Logout(this.loginGuid).build();
        command.addCommand(logoutBuilder);
        command.execute();
    }

    public void testPageBuilderXSearch() throws Exception {
        PageBuilder pageBuilder = new PageBuilder.XSearch()
                .PageSize("-1")
                .OrderBy(Page.OrderBy.CREATEDATE)
                .OrderDirection(Page.OrderDirection.DESC)
                .SearchContentClassGuid(properties.getProperty("cms.test.contentclass.guid"), SearchItem.Operator.EQ).build();
        List<Page> pages = command.getResult(pageBuilder).getIoData().getPages().getPageList();
        Set<String> pageGuids = new HashSet<String>();
        for (Page page : pages) {
            pageGuids.add(page.getGuid());
            System.out.println("Headline: " + page.getHeadline() + ", Guid: " + page.getGuid());
        }
        Assert.assertEquals(true, pageGuids.containsAll(this.pageGuids));
    }
}
