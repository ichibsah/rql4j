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

import java.util.EnumSet;

public class Template {

    public enum TemplateRights {
        EDIT, USE, RELEASE
    }

    private String guid;
    private String action;
    private Elements elements;
    private Element element;
    private TemplateVariant templateVariant;
    private TemplateVariants templateVariants;
    private String description;
    private String folderGuid;
    private String name;
    private String selectInNewPage;
    private Boolean approveRequired;
    private String dialogLanguageId;
    private Boolean filenameRequired;
    private Boolean folderRelease;
    private Boolean framesetAfterList;
    private Boolean ignoreGlobalWorkflow;
    private String languageVariantId;
    private String parentObjectName;
    private String praefixGuid;
    // ToDo: TBD
    private EnumSet<TemplateRights> templateRights;
    private String useConnection;
    private String selectInNewpage;
    private Boolean sharedRights;
    private String suffixGuid;

    public Template() {
    }

    public Template(String guid) {
        this.guid = guid;
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

    public Element getElement() {
        return element;
    }

    public void setElement(Element element) {
        this.element = element;
    }

    public Elements getElements() {
        return elements;
    }

    public void setElements(Elements elements) {
        this.elements = elements;
    }

    public TemplateVariant getTemplateVariant() {
        return templateVariant;
    }

    public void setTemplateVariant(TemplateVariant templateVariant) {
        this.templateVariant = templateVariant;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getFolderGuid() {
        return folderGuid;
    }

    public void setFolderGuid(String folderGuid) {
        this.folderGuid = folderGuid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSelectInNewPage() {
        return selectInNewPage;
    }

    public void setSelectInNewPage(String selectInNewPage) {
        this.selectInNewPage = selectInNewPage;
    }

    public Boolean getApproveRequired() {
        return approveRequired;
    }

    public void setApproveRequired(Boolean approveRequired) {
        this.approveRequired = approveRequired;
    }

    public String getDialogLanguageId() {
        return dialogLanguageId;
    }

    public void setDialogLanguageId(String dialogLanguageId) {
        this.dialogLanguageId = dialogLanguageId;
    }

    public Boolean getFilenameRequired() {
        return filenameRequired;
    }

    public void setFilenameRequired(Boolean filenameRequired) {
        this.filenameRequired = filenameRequired;
    }

    public Boolean getFolderRelease() {
        return folderRelease;
    }

    public void setFolderRelease(Boolean folderRelease) {
        this.folderRelease = folderRelease;
    }

    public Boolean getFramesetAfterList() {
        return framesetAfterList;
    }

    public void setFramesetAfterList(Boolean framesetAfterList) {
        this.framesetAfterList = framesetAfterList;
    }

    public Boolean getIgnoreGlobalWorkflow() {
        return ignoreGlobalWorkflow;
    }

    public void setIgnoreGlobalWorkflow(Boolean ignoreGlobalWorkflow) {
        this.ignoreGlobalWorkflow = ignoreGlobalWorkflow;
    }

    public String getLanguageVariantId() {
        return languageVariantId;
    }

    public void setLanguageVariantId(String languageVariantId) {
        this.languageVariantId = languageVariantId;
    }

    public String getParentObjectName() {
        return parentObjectName;
    }

    public void setParentObjectName(String parentObjectName) {
        this.parentObjectName = parentObjectName;
    }

    public String getPraefixGuid() {
        return praefixGuid;
    }

    public void setPraefixGuid(String praefixGuid) {
        this.praefixGuid = praefixGuid;
    }

    public EnumSet<TemplateRights> getTemplateRights() {
        return templateRights;
    }

    public void setTemplateRights(EnumSet<TemplateRights> templateRights) {
        this.templateRights = templateRights;
    }

    public String getUseConnection() {
        return useConnection;
    }

    public void setUseConnection(String useConnection) {
        this.useConnection = useConnection;
    }

    public String getSelectInNewpage() {
        return selectInNewpage;
    }

    public void setSelectInNewpage(String selectInNewpage) {
        this.selectInNewpage = selectInNewpage;
    }

    public Boolean getSharedRights() {
        return sharedRights;
    }

    public void setSharedRights(Boolean sharedRights) {
        this.sharedRights = sharedRights;
    }

    public String getSuffixGuid() {
        return suffixGuid;
    }

    public void setSuffixGuid(String suffixGuid) {
        this.suffixGuid = suffixGuid;
    }

    public TemplateVariants getTemplateVariants() {
        return templateVariants;
    }

    public void setTemplateVariants(TemplateVariants templateVariants) {
        this.templateVariants = templateVariants;
    }

    @Override
    public String toString() {
        return "Template{" +
                "guid='" + guid + '\'' +
                ", action='" + action + '\'' +
                ", elements=" + elements +
                ", element=" + element +
                ", templateVariant=" + templateVariant +
                ", templateVariants=" + templateVariants +
                ", description='" + description + '\'' +
                ", folderGuid='" + folderGuid + '\'' +
                ", name='" + name + '\'' +
                ", selectInNewPage='" + selectInNewPage + '\'' +
                ", approveRequired=" + approveRequired +
                ", dialogLanguageId='" + dialogLanguageId + '\'' +
                ", filenameRequired=" + filenameRequired +
                ", folderRelease=" + folderRelease +
                ", framesetAfterList=" + framesetAfterList +
                ", ignoreGlobalWorkflow=" + ignoreGlobalWorkflow +
                ", languageVariantId='" + languageVariantId + '\'' +
                ", parentObjectName='" + parentObjectName + '\'' +
                ", praefixGuid='" + praefixGuid + '\'' +
                ", templateRights=" + templateRights +
                ", useConnection='" + useConnection + '\'' +
                ", selectInNewpage='" + selectInNewpage + '\'' +
                ", sharedRights=" + sharedRights +
                ", suffixGuid='" + suffixGuid + '\'' +
                '}';
    }
}
