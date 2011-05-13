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

package rql4j.domain;

public class Page {

    public enum ActionFlag {
        DRAFT, COMPLETED, RELEASED
    }

    public enum OrderBy {
        PAGEID, HEADLINE, CREATEDATE, CHANGEDATE, CONTENTCLASS
    }

    public enum OrderDirection {
        ASC, DESC
    }

    private String guid;
    private String id;
    private String sessionKey;
    private String dialogLanguageId;
    private String languageVariantId;
    private Elements elements;
    private String action;
    private String headline;
    private String templateGuid;
    private Links links;
    private Link link;
    private ActionFlag actionFlag;
    private SearchItems searchItems;
    private String pageSize;
    private OrderBy orderBy;
    private OrderDirection orderDirection;
    private ExportJob exportJob;
    private Boolean extendedInfo;
    private String option;
    private LinksFrom linksFrom;
    private Boolean translationMode;
    private Boolean contentBased;
    private Workflow workflow;

    public Page() {
    }

    public Page(String guid) {
        this.guid = guid;
    }

    public String getGuid() {
        return guid;
    }

    public void setGuid(String guid) {
        this.guid = guid;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getSessionKey() {
        return sessionKey;
    }

    public void setSessionKey(String sessionKey) {
        this.sessionKey = sessionKey;
    }

    public String getDialogLanguageId() {
        return dialogLanguageId;
    }

    public void setDialogLanguageId(String dialogLanguageId) {
        this.dialogLanguageId = dialogLanguageId;
    }

    public String getLanguageVariantId() {
        return languageVariantId;
    }

    public void setLanguageVariantId(String languageVariantId) {
        this.languageVariantId = languageVariantId;
    }

    public Elements getElements() {
        return elements;
    }

    public void setElements(Elements elements) {
        this.elements = elements;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public String getHeadline() {
        return headline;
    }

    public void setHeadline(String headline) {
        this.headline = headline;
    }

    public String getTemplateGuid() {
        return templateGuid;
    }

    public void setTemplateGuid(String templateGuid) {
        this.templateGuid = templateGuid;
    }

    public Links getLinks() {
        return links;
    }

    public void setLinks(Links links) {
        this.links = links;
    }

    public Link getLink() {
        return link;
    }

    public void setLink(Link link) {
        this.link = link;
    }

    public ActionFlag getActionFlag() {
        return actionFlag;
    }

    public void setActionFlag(ActionFlag actionFlag) {
        this.actionFlag = actionFlag;
    }

    public SearchItems getSearchItems() {
        return searchItems;
    }

    public void setSearchItems(SearchItems searchItems) {
        this.searchItems = searchItems;
    }

    public String getPageSize() {
        return pageSize;
    }

    public void setPageSize(String pageSize) {
        this.pageSize = pageSize;
    }

    public OrderBy getOrderBy() {
        return orderBy;
    }

    public void setOrderBy(OrderBy orderBy) {
        this.orderBy = orderBy;
    }

    public OrderDirection getOrderDirection() {
        return orderDirection;
    }

    public void setOrderDirection(OrderDirection orderDirection) {
        this.orderDirection = orderDirection;
    }

    public ExportJob getExportJob() {
        return exportJob;
    }

    public void setExportJob(ExportJob exportJob) {
        this.exportJob = exportJob;
    }

    public Boolean getExtendedInfo() {
        return extendedInfo;
    }

    public void setExtendedInfo(Boolean extendedInfo) {
        this.extendedInfo = extendedInfo;
    }

    public String getOption() {
        return option;
    }

    public void setOption(String option) {
        this.option = option;
    }

    public LinksFrom getLinksFrom() {
        return linksFrom;
    }

    public void setLinksFrom(LinksFrom linksFrom) {
        this.linksFrom = linksFrom;
    }

    public Boolean getTranslationMode() {
        return translationMode;
    }

    public void setTranslationMode(Boolean translationMode) {
        this.translationMode = translationMode;
    }

    public Boolean getContentBased() {
        return contentBased;
    }

    public void setContentBased(Boolean contentBased) {
        this.contentBased = contentBased;
    }

    public Workflow getWorkflow() {
        return workflow;
    }

    public void setWorkflow(Workflow workflow) {
        this.workflow = workflow;
    }

    @Override
    public String toString() {
        return "Page{" +
                "guid='" + guid + '\'' +
                ", id='" + id + '\'' +
                ", sessionKey='" + sessionKey + '\'' +
                ", dialogLanguageId='" + dialogLanguageId + '\'' +
                ", languageVariantId='" + languageVariantId + '\'' +
                ", elements=" + elements +
                ", action='" + action + '\'' +
                ", headline='" + headline + '\'' +
                ", templateGuid='" + templateGuid + '\'' +
                ", links=" + links +
                ", link=" + link +
                ", actionFlag=" + actionFlag +
                ", searchItems=" + searchItems +
                ", pageSize='" + pageSize + '\'' +
                ", orderBy=" + orderBy +
                ", orderDirection=" + orderDirection +
                ", exportJob=" + exportJob +
                ", extendedInfo=" + extendedInfo +
                ", option='" + option + '\'' +
                ", linksFrom=" + linksFrom +
                ", translationMode=" + translationMode +
                ", contentBased=" + contentBased +
                ", workflow=" + workflow +
                '}';
    }
}

