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

public class Keyword {
    private String action;
    private String value;
    private String categoryGuid;
    private String guid;
    private Boolean force;
    private String password;
    private String languageVariantId;
    private String dialogLanguageId;
    private Integer countKeywordOnPag;
    private Integer countKeywordOnPge;
    private Integer countKeywordOnpPeAndPag;

    public Keyword() {
    }

    public Keyword(String guid) {
        this.guid = guid;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getCategoryGuid() {
        return categoryGuid;
    }

    public void setCategoryGuid(String categoryGuid) {
        this.categoryGuid = categoryGuid;
    }

    public String getGuid() {
        return guid;
    }

    public void setGuid(String guid) {
        this.guid = guid;
    }


    public Boolean getForce() {
        return force;
    }

    public void setForce(Boolean force) {
        this.force = force;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getLanguageVariantId() {
        return languageVariantId;
    }

    public void setLanguageVariantId(String languageVariantId) {
        this.languageVariantId = languageVariantId;
    }

    public String getDialogLanguageId() {
        return dialogLanguageId;
    }

    public void setDialogLanguageId(String dialogLanguageId) {
        this.dialogLanguageId = dialogLanguageId;
    }

    public Integer getCountKeywordOnPag() {
        return countKeywordOnPag;
    }

    public void setCountKeywordOnPag(Integer countKeywordOnPag) {
        this.countKeywordOnPag = countKeywordOnPag;
    }

    public Integer getCountKeywordOnPge() {
        return countKeywordOnPge;
    }

    public void setCountKeywordOnPge(Integer countKeywordOnPge) {
        this.countKeywordOnPge = countKeywordOnPge;
    }

    public Integer getCountKeywordOnpPeAndPag() {
        return countKeywordOnpPeAndPag;
    }

    public void setCountKeywordOnpPeAndPag(Integer countKeywordOnpPeAndPag) {
        this.countKeywordOnpPeAndPag = countKeywordOnpPeAndPag;
    }

    @Override
    public String toString() {
        return "Keyword{" +
                "action='" + action + '\'' +
                ", value='" + value + '\'' +
                ", categoryGuid='" + categoryGuid + '\'' +
                ", guid='" + guid + '\'' +
                ", force=" + force +
                ", password='" + password + '\'' +
                ", languageVariantId='" + languageVariantId + '\'' +
                ", dialogLanguageId='" + dialogLanguageId + '\'' +
                ", countKeywordOnPag=" + countKeywordOnPag +
                ", countKeywordOnPge=" + countKeywordOnPge +
                ", countKeywordOnpPeAndPag=" + countKeywordOnpPeAndPag +
                '}';
    }
}
