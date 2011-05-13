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

import java.util.List;

public class LinksFrom {
    private String action;
    private Boolean deleteExpiredPage;
    private String dialogLanguageId;
    private String languageVariantId;
    private String guid;
    private String pageGuid;
    private Boolean stopSiteMapSearch;
    private List<Link> linkList;

    public LinksFrom() {
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public Boolean getDeleteExpiredPage() {
        return deleteExpiredPage;
    }

    public void setDeleteExpiredPage(Boolean deleteExpiredPage) {
        this.deleteExpiredPage = deleteExpiredPage;
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

    public String getGuid() {
        return guid;
    }

    public void setGuid(String guid) {
        this.guid = guid;
    }

    public String getPageGuid() {
        return pageGuid;
    }

    public void setPageGuid(String pageGuid) {
        this.pageGuid = pageGuid;
    }

    public Boolean getStopSiteMapSearch() {
        return stopSiteMapSearch;
    }

    public void setStopSiteMapSearch(Boolean stopSiteMapSearch) {
        this.stopSiteMapSearch = stopSiteMapSearch;
    }

    public List<Link> getLinkList() {
        return linkList;
    }

    public void setLinkList(List<Link> linkList) {
        this.linkList = linkList;
    }

    @Override
    public String toString() {
        return "LinksFrom{" +
                "action='" + action + '\'' +
                ", deleteExpiredPage=" + deleteExpiredPage +
                ", dialogLanguageId='" + dialogLanguageId + '\'' +
                ", languageVariantId='" + languageVariantId + '\'' +
                ", guid='" + guid + '\'' +
                ", pageGuid='" + pageGuid + '\'' +
                ", stopSiteMapSearch=" + stopSiteMapSearch +
                ", linkList=" + linkList +
                '}';
    }
}
