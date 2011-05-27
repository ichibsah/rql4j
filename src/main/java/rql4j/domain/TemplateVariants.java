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
import java.util.List;

public class TemplateVariants {
    private String action;
    private String dialogLanguageId;
    private Boolean draft;
    private String folderGuid;
    private String languageVariantId;
    private Boolean lock;
    private Date lockDate;
    private String lockUserMail;
    private String lockUserGuid;
    private String lockUserName;
    private String templateGuid;
    private Boolean waitForRelease;
    private List<TemplateVariant> templateVariantList;
    private TemplateVariant templateVariant;
    private Boolean withStyleSheets;

    public TemplateVariants() {
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public String getDialogLanguageId() {
        return dialogLanguageId;
    }

    public void setDialogLanguageId(String dialogLanguageId) {
        this.dialogLanguageId = dialogLanguageId;
    }

    public Boolean getDraft() {
        return draft;
    }

    public void setDraft(Boolean draft) {
        this.draft = draft;
    }

    public String getFolderGuid() {
        return folderGuid;
    }

    public void setFolderGuid(String folderGuid) {
        this.folderGuid = folderGuid;
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

    public String getLockUserMail() {
        return lockUserMail;
    }

    public void setLockUserMail(String lockUserMail) {
        this.lockUserMail = lockUserMail;
    }

    public String getLockUserGuid() {
        return lockUserGuid;
    }

    public void setLockUserGuid(String lockUserGuid) {
        this.lockUserGuid = lockUserGuid;
    }

    public String getLockUserName() {
        return lockUserName;
    }

    public void setLockUserName(String lockUserName) {
        this.lockUserName = lockUserName;
    }

    public String getTemplateGuid() {
        return templateGuid;
    }

    public void setTemplateGuid(String templateGuid) {
        this.templateGuid = templateGuid;
    }

    public Boolean getWaitForRelease() {
        return waitForRelease;
    }

    public void setWaitForRelease(Boolean waitForRelease) {
        this.waitForRelease = waitForRelease;
    }

    public List<TemplateVariant> getTemplateVariantList() {
        return templateVariantList;
    }

    public void setTemplateVariantList(List<TemplateVariant> templateVariantList) {
        this.templateVariantList = templateVariantList;
    }

    public TemplateVariant getTemplateVariant() {
        return templateVariant;
    }

    public void setTemplateVariant(TemplateVariant templateVariant) {
        this.templateVariant = templateVariant;
    }

    public Boolean getWithStyleSheets() {
        return withStyleSheets;
    }

    public void setWithStyleSheets(Boolean withStyleSheets) {
        this.withStyleSheets = withStyleSheets;
    }

    @Override
    public String toString() {
        return "TemplateVariants{" +
                "action='" + action + '\'' +
                ", dialogLanguageId='" + dialogLanguageId + '\'' +
                ", draft=" + draft +
                ", folderGuid='" + folderGuid + '\'' +
                ", languageVariantId='" + languageVariantId + '\'' +
                ", lock=" + lock +
                ", lockDate=" + lockDate +
                ", lockUserMail='" + lockUserMail + '\'' +
                ", lockUserGuid='" + lockUserGuid + '\'' +
                ", lockUserName='" + lockUserName + '\'' +
                ", templateGuid='" + templateGuid + '\'' +
                ", waitForRelease=" + waitForRelease +
                ", templateVariantList=" + templateVariantList +
                ", templateVariant=" + templateVariant +
                ", withStyleSheets=" + withStyleSheets +
                '}';
    }
}
