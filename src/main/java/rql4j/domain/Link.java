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

import java.util.Date;

public class Link {

    public enum OrderBy {
        MANUAL
    }

    public enum DateState {
        PAGE_HAS_EXPIRED, PAGE_NEVER_EXPIRES, PAGE_WILL_APPEAR_IN_THE_FUTURE, PAGE_IS_CURRENT
    }

    public enum LinkType {
        NONE, SIMPLE_LINK, MULTI_LINK, REFERENCE
    }

    public enum Status {
        NO_TRANSFER, WAITING_FOR_TRANSFER, TRANSFER_COMPLETE
    }

    private String guid;
    private String action;
    private Page page;
    private String name;
    private Pages pages;
    private OrderBy orderBy;
    private String sessionKey;
    private String aliasName;
    private Boolean connectedByKeyword;
    private Date dateBegin;
    private Date dateEnd;
    private DateState dateState;
    private String eltDragDrop;
    private String eltFlags;
    private Boolean eltLanguageIndependent;
    private String eltName;
    private Boolean eltRequired;
    private String eltTarget;
    private String eltType;
    private String flags;
    private String folderGuid;
    private String formularOrderId;
    private Boolean hasTargetContainerReferences;
    private LinkType isLink;
    private Boolean isMainLink;
    private Boolean isSitemapLink;
    private Boolean isTargetContainer;
    private Boolean ok;
    private String orderId;
    private String pageGuid;
    private String pageHeadline;
    private String redDotDescription;
    private String relationGuid;
    private Boolean release;
    private Status status;
    private String templateeElementFlags;
    private String templateElementGuid;
    private LinkType templateElementIsLink;
    private String type;
    private String value;
    private String variable;
    private String workflowName;

    public Link(String guid) {
        this.guid = guid;
    }

    public Link() {
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public String getGuid() {
        return guid;
    }

    public void setGuid(String guid) {
        this.guid = guid;
    }

    public Page getPage() {
        return page;
    }

    public void setPage(Page page) {
        this.page = page;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public OrderBy getOrderBy() {
        return orderBy;
    }

    public void setOrderBy(OrderBy orderBy) {
        this.orderBy = orderBy;
    }

    public Pages getPages() {
        return pages;
    }

    public void setPages(Pages pages) {
        this.pages = pages;
    }

    public String getSessionKey() {
        return sessionKey;
    }

    public void setSessionKey(String sessionKey) {
        this.sessionKey = sessionKey;
    }

    public String getAliasName() {
        return aliasName;
    }

    public void setAliasName(String aliasName) {
        this.aliasName = aliasName;
    }

    public Boolean getConnectedByKeyword() {
        return connectedByKeyword;
    }

    public void setConnectedByKeyword(Boolean connectedByKeyword) {
        this.connectedByKeyword = connectedByKeyword;
    }

    public Date getDateBegin() {
        return dateBegin;
    }

    public void setDateBegin(Date dateBegin) {
        this.dateBegin = dateBegin;
    }

    public Date getDateEnd() {
        return dateEnd;
    }

    public void setDateEnd(Date dateEnd) {
        this.dateEnd = dateEnd;
    }

    public DateState getDateState() {
        return dateState;
    }

    public void setDateState(DateState dateState) {
        this.dateState = dateState;
    }

    public String getEltDragDrop() {
        return eltDragDrop;
    }

    public void setEltDragDrop(String eltDragDrop) {
        this.eltDragDrop = eltDragDrop;
    }

    public String getEltFlags() {
        return eltFlags;
    }

    public void setEltFlags(String eltFlags) {
        this.eltFlags = eltFlags;
    }

    public Boolean getEltLanguageIndependent() {
        return eltLanguageIndependent;
    }

    public void setEltLanguageIndependent(Boolean eltLanguageIndependent) {
        this.eltLanguageIndependent = eltLanguageIndependent;
    }

    public String getEltName() {
        return eltName;
    }

    public void setEltName(String eltName) {
        this.eltName = eltName;
    }

    public Boolean getEltRequired() {
        return eltRequired;
    }

    public void setEltRequired(Boolean eltRequired) {
        this.eltRequired = eltRequired;
    }

    public String getEltTarget() {
        return eltTarget;
    }

    public void setEltTarget(String eltTarget) {
        this.eltTarget = eltTarget;
    }

    public String getEltType() {
        return eltType;
    }

    public void setEltType(String eltType) {
        this.eltType = eltType;
    }

    public String getFlags() {
        return flags;
    }

    public void setFlags(String flags) {
        this.flags = flags;
    }

    public String getFolderGuid() {
        return folderGuid;
    }

    public void setFolderGuid(String folderGuid) {
        this.folderGuid = folderGuid;
    }

    public String getFormularOrderId() {
        return formularOrderId;
    }

    public void setFormularOrderId(String formularOrderId) {
        this.formularOrderId = formularOrderId;
    }

    public Boolean getHasTargetContainerReferences() {
        return hasTargetContainerReferences;
    }

    public void setHasTargetContainerReferences(Boolean hasTargetContainerReferences) {
        this.hasTargetContainerReferences = hasTargetContainerReferences;
    }

    public LinkType getIsLink() {
        return isLink;
    }

    public void setIsLink(LinkType link) {
        isLink = link;
    }

    public Boolean getIsMainLink() {
        return isMainLink;
    }

    public void setIsMainLink(Boolean mainLink) {
        isMainLink = mainLink;
    }

    public Boolean getIsSitemapLink() {
        return isSitemapLink;
    }

    public void setIsSitemapLink(Boolean sitemapLink) {
        isSitemapLink = sitemapLink;
    }

    public Boolean getIsTargetContainer() {
        return isTargetContainer;
    }

    public void setIsTargetContainer(Boolean targetContainer) {
        isTargetContainer = targetContainer;
    }

    public Boolean getOk() {
        return ok;
    }

    public void setOk(Boolean ok) {
        this.ok = ok;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getPageGuid() {
        return pageGuid;
    }

    public void setPageGuid(String pageGuid) {
        this.pageGuid = pageGuid;
    }

    public String getPageHeadline() {
        return pageHeadline;
    }

    public void setPageHeadline(String pageHeadline) {
        this.pageHeadline = pageHeadline;
    }

    public String getRedDotDescription() {
        return redDotDescription;
    }

    public void setRedDotDescription(String redDotDescription) {
        this.redDotDescription = redDotDescription;
    }

    public String getRelationGuid() {
        return relationGuid;
    }

    public void setRelationGuid(String relationGuid) {
        this.relationGuid = relationGuid;
    }

    public Boolean getRelease() {
        return release;
    }

    public void setRelease(Boolean release) {
        this.release = release;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public String getTemplateeElementFlags() {
        return templateeElementFlags;
    }

    public void setTemplateeElementFlags(String templateeElementFlags) {
        this.templateeElementFlags = templateeElementFlags;
    }

    public String getTemplateElementGuid() {
        return templateElementGuid;
    }

    public void setTemplateElementGuid(String templateElementGuid) {
        this.templateElementGuid = templateElementGuid;
    }

    public LinkType getTemplateElementIsLink() {
        return templateElementIsLink;
    }

    public void setTemplateElementIsLink(LinkType templateElementIsLink) {
        this.templateElementIsLink = templateElementIsLink;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getVariable() {
        return variable;
    }

    public void setVariable(String variable) {
        this.variable = variable;
    }

    public String getWorkflowName() {
        return workflowName;
    }

    public void setWorkflowName(String workflowName) {
        this.workflowName = workflowName;
    }

    @Override
    public String toString() {
        return "Link{" +
                "guid='" + guid + '\'' +
                ", action='" + action + '\'' +
                ", page=" + page +
                ", name='" + name + '\'' +
                ", pages=" + pages +
                ", orderBy=" + orderBy +
                ", sessionKey='" + sessionKey + '\'' +
                ", aliasName='" + aliasName + '\'' +
                ", connectedByKeyword=" + connectedByKeyword +
                ", dateBegin=" + dateBegin +
                ", dateEnd=" + dateEnd +
                ", dateState=" + dateState +
                ", eltDragDrop='" + eltDragDrop + '\'' +
                ", eltFlags='" + eltFlags + '\'' +
                ", eltLanguageIndependent=" + eltLanguageIndependent +
                ", eltName='" + eltName + '\'' +
                ", eltRequired=" + eltRequired +
                ", eltTarget='" + eltTarget + '\'' +
                ", eltType='" + eltType + '\'' +
                ", flags='" + flags + '\'' +
                ", folderGuid='" + folderGuid + '\'' +
                ", formularOrderId='" + formularOrderId + '\'' +
                ", hasTargetContainerReferences=" + hasTargetContainerReferences +
                ", isLink=" + isLink +
                ", isMainLink=" + isMainLink +
                ", isSitemapLink=" + isSitemapLink +
                ", isTargetContainer=" + isTargetContainer +
                ", ok=" + ok +
                ", orderId='" + orderId + '\'' +
                ", pageGuid='" + pageGuid + '\'' +
                ", pageHeadline='" + pageHeadline + '\'' +
                ", redDotDescription='" + redDotDescription + '\'' +
                ", relationGuid='" + relationGuid + '\'' +
                ", release=" + release +
                ", status=" + status +
                ", templateeElementFlags='" + templateeElementFlags + '\'' +
                ", templateElementGuid='" + templateElementGuid + '\'' +
                ", templateElementIsLink=" + templateElementIsLink +
                ", type='" + type + '\'' +
                ", value='" + value + '\'' +
                ", variable='" + variable + '\'' +
                ", workflowName='" + workflowName + '\'' +
                '}';
    }
}
