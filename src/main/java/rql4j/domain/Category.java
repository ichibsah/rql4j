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

public class Category {
    private String action;
    private String value;
    private String guid;
    private String dialogLanguageId;
    private String languageVariantId;
    private Boolean force;
    private String password;
    private List<Keyword> keywordList;
    private Keyword keyword;

    public Category() {
    }

    public Category(String guid) {
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

    public String getGuid() {
        return guid;
    }

    public void setGuid(String guid) {
        this.guid = guid;
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

    public List<Keyword> getKeywordList() {
        return keywordList;
    }

    public void setKeywordList(List<Keyword> keywordList) {
        this.keywordList = keywordList;
    }

    public Keyword getKeyword() {
        return keyword;
    }

    public void setKeyword(Keyword keyword) {
        this.keyword = keyword;
    }

    @Override
    public String toString() {
        return "Category{" +
                "action='" + action + '\'' +
                ", value='" + value + '\'' +
                ", guid='" + guid + '\'' +
                ", dialogLanguageId='" + dialogLanguageId + '\'' +
                ", languageVariantId='" + languageVariantId + '\'' +
                ", force=" + force +
                ", password='" + password + '\'' +
                ", keywordList=" + keywordList +
                ", keyword=" + keyword +
                '}';
    }
}
