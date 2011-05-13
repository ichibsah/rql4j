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
import java.util.EnumSet;

public class TemplateVariant {

    public enum TemplateProperties {
        CONVERT_TO_XML, TEMPLATE_IS_STYLESHEET, STYLESHEET_ADDED_TO_HEADER, TEMPLATE_IS_EDITED,
        NO_GLOBAL_PDF_ORIENTATION, PDF_ORIENTATION_LANDSCAPE, TEMPLATE_IS_LOCKED, TEMPLATE_WAIT_FOR_RELEASE
    }

    public enum PdfOrientation {
        DEFAULT, PORTRAIT, LANDSCAPE
    }

    private String action;
    private Date changedDate;
    private String changedUserGuid;
    private String changedUserName;
    private Date createDate;
    private String createUserGuid;
    private String createUserName;
    private String description;
    private String dialogLanguageId;
    private Integer doXmlEncode;
    private Boolean draft;
    private String fileExtension;
    // ToDo: TBD
    private EnumSet<TemplateProperties> flags;
    private String guid;
    private Boolean insertStylesheetInPage;
    private String languageVariantId;
    private Boolean lock;
    private Date lockDate;
    private String lockUserGuid;
    private String lockUserMail;
    private String lockUserName;
    private String name;
    // ToDo: TBD
    private PdfOrientation pdfOrientation;
    private Boolean readOnly;
    private Boolean styleSheet;
    private String templateCode;
    private String templateGuid;
    // ToDo: TBD
    private EnumSet<Template.TemplateRights> templateRights;
    private Boolean waitForRelease;
    private String code;
    private String text;
    private ProjectVariants projectVariants;

    public TemplateVariant() {
    }

    public TemplateVariant(String guid) {
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

    public String getTemplateCode() {
        return templateCode;
    }

    public void setTemplateCode(String templateCode) {
        this.templateCode = templateCode;
    }

    public Date getChangedDate() {
        return changedDate;
    }

    public void setChangedDate(Date changedDate) {
        this.changedDate = changedDate;
    }

    public String getChangedUserGuid() {
        return changedUserGuid;
    }

    public void setChangedUserGuid(String changedUserGuid) {
        this.changedUserGuid = changedUserGuid;
    }

    public String getChangedUserName() {
        return changedUserName;
    }

    public void setChangedUserName(String changedUserName) {
        this.changedUserName = changedUserName;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public String getCreateUserGuid() {
        return createUserGuid;
    }

    public void setCreateUserGuid(String createUserGuid) {
        this.createUserGuid = createUserGuid;
    }

    public String getCreateUserName() {
        return createUserName;
    }

    public void setCreateUserName(String createUserName) {
        this.createUserName = createUserName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getDoXmlEncode() {
        return doXmlEncode;
    }

    public void setDoXmlEncode(Integer doXmlEncode) {
        this.doXmlEncode = doXmlEncode;
    }

    public Boolean getDraft() {
        return draft;
    }

    public void setDraft(Boolean draft) {
        this.draft = draft;
    }

    public Boolean getStyleSheet() {
        return styleSheet;
    }

    public void setStyleSheet(Boolean styleSheet) {
        this.styleSheet = styleSheet;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Boolean getWaitForRelease() {
        return waitForRelease;
    }

    public void setWaitForRelease(Boolean waitForRelease) {
        this.waitForRelease = waitForRelease;
    }

    public Boolean getReadOnly() {
        return readOnly;
    }

    public void setReadOnly(Boolean readOnly) {
        this.readOnly = readOnly;
    }

    public String getDialogLanguageId() {
        return dialogLanguageId;
    }

    public void setDialogLanguageId(String dialogLanguageId) {
        this.dialogLanguageId = dialogLanguageId;
    }

    public String getFileExtension() {
        return fileExtension;
    }

    public void setFileExtension(String fileExtension) {
        this.fileExtension = fileExtension;
    }

    public EnumSet<TemplateProperties> getFlags() {
        return flags;
    }

    public void setFlags(EnumSet<TemplateProperties> flags) {
        this.flags = flags;
    }

    public Boolean getInsertStylesheetInPage() {
        return insertStylesheetInPage;
    }

    public void setInsertStylesheetInPage(Boolean insertStylesheetInPage) {
        this.insertStylesheetInPage = insertStylesheetInPage;
    }

    public String getLanguageVariantId() {
        return languageVariantId;
    }

    public void setLanguageVariantId(String languageVariantId) {
        this.languageVariantId = languageVariantId;
    }

    public Boolean getLock() {
        return lock;
    }

    public void setLock(Boolean lock) {
        this.lock = lock;
    }

    public Date getLockDate() {
        return lockDate;
    }

    public void setLockDate(Date lockDate) {
        this.lockDate = lockDate;
    }

    public String getLockUserGuid() {
        return lockUserGuid;
    }

    public void setLockUserGuid(String lockUserGuid) {
        this.lockUserGuid = lockUserGuid;
    }

    public String getLockUserMail() {
        return lockUserMail;
    }

    public void setLockUserMail(String lockUserMail) {
        this.lockUserMail = lockUserMail;
    }

    public String getLockUserName() {
        return lockUserName;
    }

    public void setLockUserName(String lockUserName) {
        this.lockUserName = lockUserName;
    }

    public PdfOrientation getPdfOrientation() {
        return pdfOrientation;
    }

    public void setPdfOrientation(PdfOrientation pdfOrientation) {
        this.pdfOrientation = pdfOrientation;
    }

    public String getTemplateGuid() {
        return templateGuid;
    }

    public void setTemplateGuid(String templateGuid) {
        this.templateGuid = templateGuid;
    }

    public EnumSet<Template.TemplateRights> getTemplateRights() {
        return templateRights;
    }

    public void setTemplateRights(EnumSet<Template.TemplateRights> templateRights) {
        this.templateRights = templateRights;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public ProjectVariants getProjectVariants() {
        return projectVariants;
    }

    public void setProjectVariants(ProjectVariants projectVariants) {
        this.projectVariants = projectVariants;
    }

    @Override
    public String toString() {
        return "TemplateVariant{" +
                "action='" + action + '\'' +
                ", changedDate=" + changedDate +
                ", changedUserGuid='" + changedUserGuid + '\'' +
                ", changedUserName='" + changedUserName + '\'' +
                ", createDate=" + createDate +
                ", createUserGuid='" + createUserGuid + '\'' +
                ", createUserName='" + createUserName + '\'' +
                ", description='" + description + '\'' +
                ", dialogLanguageId='" + dialogLanguageId + '\'' +
                ", doXmlEncode=" + doXmlEncode +
                ", draft=" + draft +
                ", fileExtension='" + fileExtension + '\'' +
                ", flags=" + flags +
                ", guid='" + guid + '\'' +
                ", insertStylesheetInPage=" + insertStylesheetInPage +
                ", languageVariantId='" + languageVariantId + '\'' +
                ", lock=" + lock +
                ", lockDate=" + lockDate +
                ", lockUserGuid='" + lockUserGuid + '\'' +
                ", lockUserMail='" + lockUserMail + '\'' +
                ", lockUserName='" + lockUserName + '\'' +
                ", name='" + name + '\'' +
                ", pdfOrientation=" + pdfOrientation +
                ", readOnly=" + readOnly +
                ", styleSheet=" + styleSheet +
                ", templateCode='" + templateCode + '\'' +
                ", templateGuid='" + templateGuid + '\'' +
                ", templateRights=" + templateRights +
                ", waitForRelease=" + waitForRelease +
                ", code='" + code + '\'' +
                ", text='" + text + '\'' +
                ", projectVariants=" + projectVariants +
                '}';
    }
}
