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
import java.util.List;

public class PageBuilder extends RqlBuilder {
    private PageBuilder(AddNew addNew) {
        super(addNew.ioData);
    }

    private PageBuilder(Save save) {
        super(save.ioData);
    }

    private PageBuilder(XSearch xSearch) {
        super(xSearch.ioData);
    }

    private PageBuilder(Delete delete) {
        super(delete.ioData);
    }

    private PageBuilder(RejectTempSaved rejectTempSaved) {
        super(rejectTempSaved.ioData);
    }

    private PageBuilder(LoadExtended loadExtended) {
        super(loadExtended.ioData);
    }

    public static class AddNew implements IBuilder {
        private final IoData ioData;
        private final List<Page> pages;
        private final String action;

        public AddNew() {
            this.ioData = new IoData();
            this.pages = new ArrayList<Page>();
            this.action = "addnew";
        }

        public AddNew Page(String templateGuid, String headline) {
            Page page = new Page();
            page.setTemplateGuid(templateGuid);
            page.setHeadline(headline);
            page.setAction(this.action);
            this.pages.add(page);
            return this;
        }

        @Override
        public PageBuilder build() {
            ioData.setPageList(pages);
            return new PageBuilder(this);
        }
    }

    public static class RejectTempSaved implements IBuilder {
        private final IoData ioData;
        private final Page page;
        private final String action = "rejecttempsaved";

        public RejectTempSaved(String pageGuid, String sessionKey, Boolean translationMode) {
            this.ioData = new IoData();
            this.page = new Page(pageGuid);
            this.page.setAction(this.action);
            this.page.setSessionKey(sessionKey);
            this.page.setTranslationMode(translationMode);
        }

        public PageBuilder build() {
            this.ioData.setPage(this.page);
            return new PageBuilder(this);
        }
    }

    /**
     * Builder to delete one or more pages from a project
     */
    public static class Delete implements IBuilder {
        private final IoData ioData;
        private final List<Page> pageList;
        private final String action = "delete";

        /**
         * Constructor
         */
        public Delete() {
            this.ioData = new IoData();
            this.pageList = new ArrayList<Page>();
        }

        /**
         * Constructor for Delete Builder
         * @param page Page object with guid information
         */
        public Delete(Page page) {
            if(page == null || page.getGuid() == null || page.getGuid().equals(""))
                throw new IllegalArgumentException("Guid of the page object is not set or page is null");
            this.ioData = new IoData();
            this.pageList = new ArrayList<Page>();
            Page delPage = new Page(page.getGuid());
            delPage.setAction(this.action);
            pageList.add(delPage);
        }

        /**
         * Construktor for Delete Builder
         * @param pageGuid guid of the page
         */
        public Delete(String pageGuid) {
            this(new Page(pageGuid));
        }

        /**
         * Add page object to Delete Builder
         * @param page page object with given guid
         * @return this Delete instance
         */
        public Delete Page(Page page) {
            if(page == null || page.getGuid() == null || page.getGuid().equals(""))
                throw new IllegalArgumentException("Guid of the page object is null or page is null");
            Page delPage = new Page(page.getGuid());
            delPage.setAction(this.action);
            this.pageList.add(delPage);
            return this;
        }

        /**
         * Add page object to Delete Builder
         * @param pageGuid guid of the page
         * @return this Delete instance
         */
        public Delete Page(String pageGuid) {
            return this.Page(new Page(pageGuid));
        }

        /**
         * Build the Delete Builder
         * @return new PageBuilder Instance
         */
        public PageBuilder build() {
            this.ioData.setPageList(this.pageList);
            return new PageBuilder(this);
        }

    }

    public static class Save implements IBuilder {
        private final IoData ioData;
        private final List<Page> pages;
        private final String action;

        public Save() {
            this.pages = new ArrayList<Page>();
            this.ioData = new IoData();
            this.action = "save";
        }

        public Save Page(String pageGuid, Page.ActionFlag flagPage) {
            if (pageGuid == null)
                throw new NullPointerException("pageGuid is null");
            if (flagPage == null)
                throw new NullPointerException("flagPage is null");
            Page page = new Page(pageGuid);
            page.setAction(this.action);
            page.setActionFlag(flagPage);
            this.pages.add(page);
            return this;
        }

        @Override
        public PageBuilder build() {
            this.ioData.setPageList(this.pages);
            return new PageBuilder(this);
        }
    }

    /**
     * You can use this RQL to search for pages based on various criteria and settings.
     * @since RedDot CMS 7.5
     */
    public static class XSearch implements IBuilder {
        private final IoData ioData;
        private final List<Page> pageList;
        private final Page page;
        private final SearchItems searchItems;
        private final List<SearchItem> searchItemList;
        private final String action = "xsearch";

        /**
         * Default Constructor for XSearch-Query
         */
        public XSearch() {
            this.ioData = new IoData();
            this.pageList = new ArrayList<Page>();
            this.page = new Page();
            this.page.setAction(this.action);
            this.searchItems = new SearchItems();
            this.searchItemList = new ArrayList<SearchItem>();
        }

        /**
         * If you want the search result to be returned in multiple result pages, this attribute defines the number of
         * result pages. If no PageSize is set the default is set to 20 Items
         * @param size
         * sie < 0: all results are returned
         * size = 0: pagesize is set to 20
         * size > 0: the results are returned on pages with the indicated number of results.
         * @return this XSearch instance
         */
        public XSearch PageSize(String size) {
            this.page.setPageSize(size);
            return this;
        }

        /**
         * The results of the query are sorted by this criterion. If no criterion is specified, the results are sorted
         * by the headline in ascending order.
         * @param orderBy
         * PAGEID = Sort by page ID
         * HEADLINE = Sort by headline (Standard)
         * CREATEDATE = Sort by page creation date
         * CHANGEDATE = Sort by page modification date
         * CONTENTCLASS = Sort by content class
         * @return this XSearch instance
         */
        public XSearch OrderBy(Page.OrderBy orderBy) {
            this.page.setOrderBy(orderBy);
            return this;
        }

        /**
         * Set the the direction of the result set
         * @param orderDirection ASC = Sort in ascending order (Standard) / DESC 	= 	Sort in descending order
         * @return this XSearch instance
         */
        public XSearch OrderDirection(Page.OrderDirection orderDirection) {
            this.page.setOrderDirection(orderDirection);
            return this;
        }

        /**
         * Searching for pages by page headlines
         * @param value    Text to be searched for in all page headlines.
         * @param operator like = Search using substrings / contains = Search using full-text index
         * @return XSearch
         */
        public XSearch SearchHeadline(String value, SearchItem.Operator operator) {
            SearchItem searchItem = new SearchItem(SearchItem.Key.HEADLINE, value, operator);
            this.searchItemList.add(searchItem);
            return this;
        }

        /**
         * Searching for pages by page headline and element content
         * @param value text which you want to search for in all page headlines and element contents
         * @param operator like = Search using substrings / contains = Search using full-text index
         * @return XSearch
         */
        public XSearch SearchText(String value, SearchItem.Operator operator) {
            SearchItem searchItem = new SearchItem(SearchItem.Key.SEARCHTEXT, value, operator);
            this.searchItemList.add(searchItem);
            return this;
        }

        /**
         * Searching for pages by content classes
         * @param guid     GUID of the content class whose instances you want to search
         * @param operator eq =	equal / ne = not equal
         * @return XSearch
         */
        public XSearch SearchContentClassGuid(String guid, SearchItem.Operator operator) {
            SearchItem searchItem = new SearchItem(SearchItem.Key.CONTENTCLASSGUID, guid, operator);
            this.searchItemList.add(searchItem);
            return this;
        }

        /**
         * Searching for pages by page IDs
         * @param id       ID of the page you want to search for
         * @param operator eq = equal / ne = not equal / gt = greater than / lt = less than /
         *                 ge = greater than or equal / le =  less than or equal
         * @return XSearch
         */
        public XSearch SearchPageId(String id, SearchItem.Operator operator) {
            SearchItem searchItem = new SearchItem(SearchItem.Key.PAGEID, id, operator);
            this.searchItemList.add(searchItem);
            return this;
        }

        /**
         * Searching for pages which was created the by the current user
         *
         * @param operator eq =	equal / ne = not equal
         * @return XSearch
         * @throws IllegalArgumentException if operator is not EQ or NE
         */
        public XSearch SearchCreatedByMySelf(SearchItem.Operator operator) {
            if (operator != SearchItem.Operator.EQ &&
                    operator != SearchItem.Operator.NE)
                throw new IllegalArgumentException("Operator must be EQ or NE " + operator);
            SearchItem searchItem = new SearchItem(SearchItem.Key.CREATEDBY, "myself", operator);
            this.searchItemList.add(searchItem);
            return this;
        }

        /**
         * Searching for pages which was created by the given userGuids
         *
         * @param operator  eq =	equal / ne = not equal
         * @param userGuids Array of user GUIDs
         * @return XSearch
         */
        public XSearch SearchCreatedBy(SearchItem.Operator operator, String[] userGuids) {
            SearchItem searchItem = new SearchItem(SearchItem.Key.CREATEDBY, "list", operator);
            Users users = new Users();
            List<User> userList = new ArrayList<User>();
            for (String userGuid : userGuids) {
                userList.add(new User(userGuid));
            }
            users.setUserList(userList);
            searchItem.setUsers(users);
            this.searchItemList.add(searchItem);
            return this;
        }

        public XSearch SearchPageState(SearchItem.PageState pageState, SearchItem.Operator operator,
                                       SearchItem.User user, String sourceLanguage) {
            String pageStateValue;
            switch (pageState) {
                case CHECKEDOUT:
                    pageStateValue = "checkedout";
                    break;
                case PAGESINWORKFLOW:
                    pageStateValue = "pagesinworkflow";
                    break;
                case RELEASED:
                    pageStateValue = "released";
                    break;
                case RESUBMITTED:
                    pageStateValue = "resubmitted";
                    break;
                case WAITINGFORCORRECTION:
                    pageStateValue = "waitingforcorrection";
                    break;
                case WAITINGFORRELEASE:
                    pageStateValue = "waitingforrelease";
                    break;
                case WAITINGFORTRANSLATION:
                    pageStateValue = "waitingfortranslation";
                    break;
                default:
                    pageStateValue = null;
            }

            if (pageStateValue == null)
                throw new IllegalArgumentException("Pagestate is null");


            if (user == null)
                throw new IllegalArgumentException("User is null");

            SearchItem searchItem;
            if (sourceLanguage == null || sourceLanguage.equals("")) {
                searchItem = new SearchItem(SearchItem.Key.PAGESTATE, pageStateValue, operator, user);
            } else {
                searchItem = new SearchItem(SearchItem.Key.PAGESTATE, pageStateValue, operator, user, sourceLanguage);
            }
            this.searchItemList.add(searchItem);
            return this;
        }

        public XSearch SearchPageState(SearchItem.PageState pageState, SearchItem.Operator operator, SearchItem.User user) {
            return this.SearchPageState(pageState, operator, user, null);
        }


        /**
         * Build the XSearch RQL
         * @return new PageBuilder Instance
         */
        @Override
        public PageBuilder build() {
            this.ioData.setPageList(this.pageList);
            this.pageList.add(this.page);
            this.page.setSearchItems(this.searchItems);
            this.searchItems.setSearchItemList(this.searchItemList);
            return new PageBuilder(this);
        }
    }

    public static class LoadExtended implements IBuilder {
        private final IoData ioData;
        private final Page page;
        private final String action = "load";
        private final String option = "extendedinfo";

        public LoadExtended(String pageGuid) {
            this.ioData = new IoData();
            this.page = new Page(pageGuid);
            this.page.setAction(this.action);
            this.page.setOption(this.option);
        }

        public LoadExtended contentBased(Boolean contentBased) {
            this.page.setContentBased(contentBased);
            return this;
        }

        public PageBuilder build() {
            this.ioData.setPage(this.page);
            return new PageBuilder(this);
        }
    }
}
