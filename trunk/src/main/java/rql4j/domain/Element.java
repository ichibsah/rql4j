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

public class Element {

    public enum LinkType {
        NONE, SIMPLE_LINK, MULTI_LINK, REFERENCE
    }

    public enum EltType {
        STANDARD_FIELD_TEXT, STANDARD_FIELD_DATE, STANDARD_FIELD_TIME, STANDARD_FIELD_NUMERIC,
        STANDARD_FIELD_EMAIL, STANDARD_FIELD_URL, STANDARD_FIELD_CUSTOM, HEADLINE, TEXT, TEXT_ASCII,
        IMAGE
    }

    private String action;
    private Boolean denys;
    private String eltFlags;
    private String eltRdDescription;
    private String eltExtendedList;
    private String eltUserDefinedAllowed;
    private String eltDoNotHtmlEncode;
    private String eltXhtmlCompliant;
    private String eltdragdrop;
    private String eltHideInForm;
    private String eltInvisibleInPage;
    private String eltInvisibleInClient;
    private String eltPicsAllLanguages;
    private String eltEditorialElement;
    private String usePageMainLinkTargetContainer;
    private String eltOnlyHrefValue;
    private String eltIsDynamic;
    private String eltCrlfToBr;
    private String eltFolderGuid;
    private String eltIslink;
    private String eltId;
    private String templateGuid;
    private String eltDirectEdit;
    private String eltIgnoreWorkflow;
    private String eltSuffixes;
    private String eltConvert;
    private String eltPresetAlt;
    private String eltLanguageIndependent;
    private String eltautoHeight;
    private String eltautoWidth;
    private String eltautoBorder;
    private String eltSrcSubDirGuid;
    private String eltAlt;
    private String eltEditorOptions;
    private String languageVariantId;
    private String defaultLanguagevariantId;
    private Boolean languageIndependent;
    private Boolean editorOptions;
    private String guid;
    private String templateeElementGuid;
    private String pageGuid;
    private String flags;
    private Boolean eltRequired;
    private String formularOrderId;
    private LinkType linkType;
    private String name;
    private String eltName;
    private String aliasName;
    private String variable;
    private String eltStylesheetData;
    private Integer type;
    private EltType eltType;
    private String templateElementFlags;
    private Boolean templateElementIsLink;
    private String value;
    private String languageVariantGuid;
    private String dialogLanguageGuid;
    private String eltDefaultValue;
    private String text;

    public String getEltDefaultValue() {
        return eltDefaultValue;
    }

    public void setEltDefaultValue(String eltDefaultValue) {
        this.eltDefaultValue = eltDefaultValue;
    }

    public String getDialogLanguageGuid() {
        return dialogLanguageGuid;
    }

    public void setDialogLanguageGuid(String dialogLanguageGuid) {
        this.dialogLanguageGuid = dialogLanguageGuid;
    }

    public Element() {
    }

    public Element(String guid) {
        this.guid = guid;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public EltType getEltType() {
        return eltType;
    }

    public void setEltType(EltType eltType) {
        this.eltType = eltType;
    }

    public String getTemplateElementFlags() {
        return templateElementFlags;
    }

    public void setTemplateElementFlags(String templateElementFlags) {
        this.templateElementFlags = templateElementFlags;
    }

    public Boolean getTemplateElementIsLink() {
        return templateElementIsLink;
    }

    public void setTemplateElementIsLink(Boolean templateElementIsLink) {
        this.templateElementIsLink = templateElementIsLink;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public Boolean getEltRequired() {
        return eltRequired;
    }

    public void setEltRequired(Boolean eltRequired) {
        this.eltRequired = eltRequired;
    }

    public String getFormularOrderId() {
        return formularOrderId;
    }

    public void setFormularOrderId(String formularOrderId) {
        this.formularOrderId = formularOrderId;
    }

    public String getEltStylesheetData() {
        return eltStylesheetData;
    }

    public void setEltStylesheetData(String eltStylesheetData) {
        this.eltStylesheetData = eltStylesheetData;
    }

    public Boolean getDenys() {
        return denys;
    }

    public void setDenys(Boolean denys) {
        this.denys = denys;
    }

    public String getLanguageVariantId() {
        return languageVariantId;
    }

    public void setLanguageVariantId(String languageVariantId) {
        this.languageVariantId = languageVariantId;
    }

    public String getDefaultLanguagevariantId() {
        return defaultLanguagevariantId;
    }

    public void setDefaultLanguagevariantId(String defaultLanguagevariantId) {
        this.defaultLanguagevariantId = defaultLanguagevariantId;
    }

    public Boolean getLanguageIndependent() {
        return languageIndependent;
    }

    public void setLanguageIndependent(Boolean languageIndependent) {
        this.languageIndependent = languageIndependent;
    }

    public Boolean getEditorOptions() {
        return editorOptions;
    }

    public void setEditorOptions(Boolean editorOptions) {
        this.editorOptions = editorOptions;
    }

    public String getGuid() {
        return guid;
    }

    public void setGuid(String guid) {
        this.guid = guid;
    }

    public String getTemplateeElementGuid() {
        return templateeElementGuid;
    }

    public void setTemplateeElementGuid(String templateeElementGuid) {
        this.templateeElementGuid = templateeElementGuid;
    }

    public String getPageGuid() {
        return pageGuid;
    }

    public void setPageGuid(String pageGuid) {
        this.pageGuid = pageGuid;
    }

    public String getEltFlags() {
        return eltFlags;
    }

    public void setEltFlags(String eltFlags) {
        this.eltFlags = eltFlags;
    }

    public String getFlags() {
        return flags;
    }

    public void setFlags(String flags) {
        this.flags = flags;
    }


    public LinkType getLinkType() {
        return linkType;
    }

    public void setLinkType(LinkType linkType) {
        this.linkType = linkType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEltName() {
        return eltName;
    }

    public void setEltName(String eltName) {
        this.eltName = eltName;
    }

    public String getAliasName() {
        return aliasName;
    }

    public void setAliasName(String aliasName) {
        this.aliasName = aliasName;
    }

    public String getVariable() {
        return variable;
    }

    public void setVariable(String variable) {
        this.variable = variable;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getEltRdDescription() {
        return eltRdDescription;
    }

    public void setEltRdDescription(String eltRdDescription) {
        this.eltRdDescription = eltRdDescription;
    }

    public String getEltExtendedList() {
        return eltExtendedList;
    }

    public void setEltExtendedList(String eltExtendedList) {
        this.eltExtendedList = eltExtendedList;
    }

    public String getEltUserDefinedAllowed() {
        return eltUserDefinedAllowed;
    }

    public void setEltUserDefinedAllowed(String eltUserDefinedAllowed) {
        this.eltUserDefinedAllowed = eltUserDefinedAllowed;
    }

    public String getEltDoNotHtmlEncode() {
        return eltDoNotHtmlEncode;
    }

    public void setEltDoNotHtmlEncode(String eltDoNotHtmlEncode) {
        this.eltDoNotHtmlEncode = eltDoNotHtmlEncode;
    }

    public String getEltXhtmlCompliant() {
        return eltXhtmlCompliant;
    }

    public void setEltXhtmlCompliant(String eltXhtmlCompliant) {
        this.eltXhtmlCompliant = eltXhtmlCompliant;
    }

    public String getEltdragdrop() {
        return eltdragdrop;
    }

    public void setEltdragdrop(String eltdragdrop) {
        this.eltdragdrop = eltdragdrop;
    }

    public String getEltHideInForm() {
        return eltHideInForm;
    }

    public void setEltHideInForm(String eltHideInForm) {
        this.eltHideInForm = eltHideInForm;
    }

    public String getEltInvisibleInPage() {
        return eltInvisibleInPage;
    }

    public void setEltInvisibleInPage(String eltInvisibleInPage) {
        this.eltInvisibleInPage = eltInvisibleInPage;
    }

    public String getEltInvisibleInClient() {
        return eltInvisibleInClient;
    }

    public void setEltInvisibleInClient(String eltInvisibleInClient) {
        this.eltInvisibleInClient = eltInvisibleInClient;
    }

    public String getEltPicsAllLanguages() {
        return eltPicsAllLanguages;
    }

    public void setEltPicsAllLanguages(String eltPicsAllLanguages) {
        this.eltPicsAllLanguages = eltPicsAllLanguages;
    }

    public String getEltEditorialElement() {
        return eltEditorialElement;
    }

    public void setEltEditorialElement(String eltEditorialElement) {
        this.eltEditorialElement = eltEditorialElement;
    }

    public String getUsePageMainLinkTargetContainer() {
        return usePageMainLinkTargetContainer;
    }

    public void setUsePageMainLinkTargetContainer(String usePageMainLinkTargetContainer) {
        this.usePageMainLinkTargetContainer = usePageMainLinkTargetContainer;
    }

    public String getEltOnlyHrefValue() {
        return eltOnlyHrefValue;
    }

    public void setEltOnlyHrefValue(String eltOnlyHrefValue) {
        this.eltOnlyHrefValue = eltOnlyHrefValue;
    }

    public String getEltIsDynamic() {
        return eltIsDynamic;
    }

    public void setEltIsDynamic(String eltIsDynamic) {
        this.eltIsDynamic = eltIsDynamic;
    }

    public String getEltCrlfToBr() {
        return eltCrlfToBr;
    }

    public void setEltCrlfToBr(String eltCrlfToBr) {
        this.eltCrlfToBr = eltCrlfToBr;
    }

    public String getEltFolderGuid() {
        return eltFolderGuid;
    }

    public void setEltFolderGuid(String eltFolderGuid) {
        this.eltFolderGuid = eltFolderGuid;
    }

    public String getEltIslink() {
        return eltIslink;
    }

    public void setEltIslink(String eltIslink) {
        this.eltIslink = eltIslink;
    }

    public String getEltId() {
        return eltId;
    }

    public void setEltId(String eltId) {
        this.eltId = eltId;
    }

    public String getTemplateGuid() {
        return templateGuid;
    }

    public void setTemplateGuid(String templateGuid) {
        this.templateGuid = templateGuid;
    }

    public String getEltDirectEdit() {
        return eltDirectEdit;
    }

    public void setEltDirectEdit(String eltDirectEdit) {
        this.eltDirectEdit = eltDirectEdit;
    }

    public String getEltIgnoreWorkflow() {
        return eltIgnoreWorkflow;
    }

    public void setEltIgnoreWorkflow(String eltIgnoreWorkflow) {
        this.eltIgnoreWorkflow = eltIgnoreWorkflow;
    }

    public String getEltSuffixes() {
        return eltSuffixes;
    }

    public void setEltSuffixes(String eltSuffixes) {
        this.eltSuffixes = eltSuffixes;
    }

    public String getEltConvert() {
        return eltConvert;
    }

    public void setEltConvert(String eltConvert) {
        this.eltConvert = eltConvert;
    }

    public String getEltPresetAlt() {
        return eltPresetAlt;
    }

    public void setEltPresetAlt(String eltPresetAlt) {
        this.eltPresetAlt = eltPresetAlt;
    }

    public String getEltLanguageIndependent() {
        return eltLanguageIndependent;
    }

    public void setEltLanguageIndependent(String eltLanguageIndependent) {
        this.eltLanguageIndependent = eltLanguageIndependent;
    }

    public String getEltautoHeight() {
        return eltautoHeight;
    }

    public void setEltautoHeight(String eltautoHeight) {
        this.eltautoHeight = eltautoHeight;
    }

    public String getEltautoWidth() {
        return eltautoWidth;
    }

    public void setEltautoWidth(String eltautoWidth) {
        this.eltautoWidth = eltautoWidth;
    }

    public String getEltautoBorder() {
        return eltautoBorder;
    }

    public void setEltautoBorder(String eltautoBorder) {
        this.eltautoBorder = eltautoBorder;
    }

    public String getEltSrcSubDirGuid() {
        return eltSrcSubDirGuid;
    }

    public void setEltSrcSubDirGuid(String eltSrcSubDirGuid) {
        this.eltSrcSubDirGuid = eltSrcSubDirGuid;
    }

    public String getEltAlt() {
        return eltAlt;
    }

    public void setEltAlt(String eltAlt) {
        this.eltAlt = eltAlt;
    }

    public String getEltEditorOptions() {
        return eltEditorOptions;
    }

    public void setEltEditorOptions(String eltEditorOptions) {
        this.eltEditorOptions = eltEditorOptions;
    }

    public String getLanguageVariantGuid() {
        return languageVariantGuid;
    }

    public void setLanguageVariantGuid(String languageVariantGuid) {
        this.languageVariantGuid = languageVariantGuid;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return "Element{" +
                "action='" + action + '\'' +
                ", denys=" + denys +
                ", eltFlags='" + eltFlags + '\'' +
                ", eltRdDescription='" + eltRdDescription + '\'' +
                ", eltExtendedList='" + eltExtendedList + '\'' +
                ", eltUserDefinedAllowed='" + eltUserDefinedAllowed + '\'' +
                ", eltDoNotHtmlEncode='" + eltDoNotHtmlEncode + '\'' +
                ", eltXhtmlCompliant='" + eltXhtmlCompliant + '\'' +
                ", eltdragdrop='" + eltdragdrop + '\'' +
                ", eltHideInForm='" + eltHideInForm + '\'' +
                ", eltInvisibleInPage='" + eltInvisibleInPage + '\'' +
                ", eltInvisibleInClient='" + eltInvisibleInClient + '\'' +
                ", eltPicsAllLanguages='" + eltPicsAllLanguages + '\'' +
                ", eltEditorialElement='" + eltEditorialElement + '\'' +
                ", usePageMainLinkTargetContainer='" + usePageMainLinkTargetContainer + '\'' +
                ", eltOnlyHrefValue='" + eltOnlyHrefValue + '\'' +
                ", eltIsDynamic='" + eltIsDynamic + '\'' +
                ", eltCrlfToBr='" + eltCrlfToBr + '\'' +
                ", eltFolderGuid='" + eltFolderGuid + '\'' +
                ", eltIslink='" + eltIslink + '\'' +
                ", eltId='" + eltId + '\'' +
                ", templateGuid='" + templateGuid + '\'' +
                ", eltDirectEdit='" + eltDirectEdit + '\'' +
                ", eltIgnoreWorkflow='" + eltIgnoreWorkflow + '\'' +
                ", eltSuffixes='" + eltSuffixes + '\'' +
                ", eltConvert='" + eltConvert + '\'' +
                ", eltPresetAlt='" + eltPresetAlt + '\'' +
                ", eltLanguageIndependent='" + eltLanguageIndependent + '\'' +
                ", eltautoHeight='" + eltautoHeight + '\'' +
                ", eltautoWidth='" + eltautoWidth + '\'' +
                ", eltautoBorder='" + eltautoBorder + '\'' +
                ", eltSrcSubDirGuid='" + eltSrcSubDirGuid + '\'' +
                ", eltAlt='" + eltAlt + '\'' +
                ", eltEditorOptions='" + eltEditorOptions + '\'' +
                ", languageVariantId='" + languageVariantId + '\'' +
                ", defaultLanguagevariantId='" + defaultLanguagevariantId + '\'' +
                ", languageIndependent=" + languageIndependent +
                ", editorOptions=" + editorOptions +
                ", guid='" + guid + '\'' +
                ", templateeElementGuid='" + templateeElementGuid + '\'' +
                ", pageGuid='" + pageGuid + '\'' +
                ", flags='" + flags + '\'' +
                ", eltRequired=" + eltRequired +
                ", formularOrderId='" + formularOrderId + '\'' +
                ", linkType=" + linkType +
                ", name='" + name + '\'' +
                ", eltName='" + eltName + '\'' +
                ", aliasName='" + aliasName + '\'' +
                ", variable='" + variable + '\'' +
                ", eltStylesheetData='" + eltStylesheetData + '\'' +
                ", type=" + type +
                ", eltType=" + eltType +
                ", templateElementFlags='" + templateElementFlags + '\'' +
                ", templateElementIsLink=" + templateElementIsLink +
                ", value='" + value + '\'' +
                ", languageVariantGuid='" + languageVariantGuid + '\'' +
                ", dialogLanguageGuid='" + dialogLanguageGuid + '\'' +
                ", eltDefaultValue='" + eltDefaultValue + '\'' +
                ", text='" + text + '\'' +
                '}';
    }
}
