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

import java.util.*;

public class Elements {
    private String action;
    private List<Element> elementList;
    private List<Elt> eltList;
    private Boolean childNodesasAttributes;
    private String templateVariantGuid;
    private String dialogLanguageId;
    private String languageVariantId;
    private String parentGuid;
    private String parentTable;

    public Elements() {
    }

    public List<Element> getElementList() {
        return elementList;
    }

    public void setElementList(List<Element> elementList) {
        this.elementList = elementList;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }


    public List<Elt> getEltList() {
        return eltList;
    }

    public void setEltList(List<Elt> eltList) {
        this.eltList = eltList;
    }

    public Boolean getChildNodesasAttributes() {
        return childNodesasAttributes;
    }

    public void setChildNodesasAttributes(Boolean childNodesasAttributes) {
        this.childNodesasAttributes = childNodesasAttributes;
    }

    public String getTemplateVariantGuid() {
        return templateVariantGuid;
    }

    public void setTemplateVariantGuid(String templateVariantGuid) {
        this.templateVariantGuid = templateVariantGuid;
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

    public String getParentGuid() {
        return parentGuid;
    }

    public void setParentGuid(String parentGuid) {
        this.parentGuid = parentGuid;
    }

    public String getParentTable() {
        return parentTable;
    }

    public void setParentTable(String parentTable) {
        this.parentTable = parentTable;
    }


    @Override
    public String toString() {
        return "Elements{" +
                "action='" + action + '\'' +
                ", elementList=" + elementList +
                ", eltList=" + eltList +
                ", childNodesasAttributes=" + childNodesasAttributes +
                ", templateVariantGuid='" + templateVariantGuid + '\'' +
                ", dialogLanguageId='" + dialogLanguageId + '\'' +
                ", languageVariantId='" + languageVariantId + '\'' +
                ", parentGuid='" + parentGuid + '\'' +
                ", parentTable='" + parentTable + '\'' +
                '}';
    }
}
