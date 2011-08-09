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

public class User {

    public enum PreferredEditor {
        PROJECT_DEFAULT, REDDOT_EDITOR, MICROSOFT_WORD, EXTERNAL_EDITOR
    }

    private String action;
    private String country;
    private String dialogLanguageId;
    private String dialogLcid;
    private String email;
    private String flags1;
    private String flags2;
    private String fullName;
    private String guid;
    private String isServerManager;
    private String language;
    private String languageKey;
    private String languageVariantId;
    private String languageVariantLcid;
    private String lcid;
    private String level;
    private String lm;
    private String mainLanguageVariantId;
    private String maxLevel;
    private Integer maxLogin;
    private String projectGuid;
    private String pw;
    private String rights1;
    private String rights2;
    private String rights3;
    private String rights4;
    private String rights5;
    private String rights6;
    private String te;
    private String userId;
    private String userLanguage;
    private Server server;
    private ClipboardData clipboardData;
    private String name;
    private String description;
    private Boolean disabled;
    private PreferredEditor preferredEditor;
    private Boolean invertDirectEdit;
    private Modules modules;
    private LastModules lastModules;
    private CcsConnections ccsConnections;
    private Projects projects;
    // new
    private String accountSystemGuid;
    private String acs;
    private Boolean disablePassword;
    private String id;
    private Groups groups;
    
    
    
    

    public User() {
    }

    public User(String guid) {
        this.guid = guid;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public String getCountry() {
        return country;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getLanguageKey() {
        return languageKey;
    }

    public void setLanguageKey(String languageKey) {
        this.languageKey = languageKey;
    }

    public String getLanguageVariantId() {
        return languageVariantId;
    }

    public void setLanguageVariantId(String languageVariantId) {
        this.languageVariantId = languageVariantId;
    }

    public String getLanguageVariantLcid() {
        return languageVariantLcid;
    }

    public void setLanguageVariantLcid(String languageVariantLcid) {
        this.languageVariantLcid = languageVariantLcid;
    }

    public String getMainLanguageVariantId() {
        return mainLanguageVariantId;
    }

    public void setMainLanguageVariantId(String mainLanguageVariantId) {
        this.mainLanguageVariantId = mainLanguageVariantId;
    }

    public String getMaxLevel() {
        return maxLevel;
    }

    public void setMaxLevel(String maxLevel) {
        this.maxLevel = maxLevel;
    }

    public Integer getMaxLogin() {
        return maxLogin;
    }

    public void setMaxLogin(Integer maxLogin) {
        this.maxLogin = maxLogin;
    }

    public String getProjectGuid() {
        return projectGuid;
    }

    public void setProjectGuid(String projectGuid) {
        this.projectGuid = projectGuid;
    }

    public Boolean getDisabled() {
        return disabled;
    }

    public void setDisabled(Boolean disabled) {
        this.disabled = disabled;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getDialogLanguageId() {
        return dialogLanguageId;
    }

    public void setDialogLanguageId(String dialogLanguageId) {
        this.dialogLanguageId = dialogLanguageId;
    }

    public String getDialogLcid() {
        return dialogLcid;
    }

    public void setDialogLcid(String dialogLcid) {
        this.dialogLcid = dialogLcid;
    }

    public String getFlags1() {
        return flags1;
    }

    public void setFlags1(String flags1) {
        this.flags1 = flags1;
    }

    public String getFlags2() {
        return flags2;
    }

    public void setFlags2(String flags2) {
        this.flags2 = flags2;
    }

    public String getGuid() {
        return guid;
    }

    public void setGuid(String guid) {
        this.guid = guid;
    }

    public String getServerManager() {
        return isServerManager;
    }

    public void setServerManager(String serverManager) {
        isServerManager = serverManager;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getLcid() {
        return lcid;
    }

    public void setLcid(String lcid) {
        this.lcid = lcid;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getLm() {
        return lm;
    }

    public void setLm(String lm) {
        this.lm = lm;
    }

    public String getPw() {
        return pw;
    }

    public void setPw(String pw) {
        this.pw = pw;
    }

    public String getRights1() {
        return rights1;
    }

    public void setRights1(String rights1) {
        this.rights1 = rights1;
    }

    public String getRights2() {
        return rights2;
    }

    public void setRights2(String rights2) {
        this.rights2 = rights2;
    }

    public String getRights3() {
        return rights3;
    }

    public void setRights3(String rights3) {
        this.rights3 = rights3;
    }

    public String getRights4() {
        return rights4;
    }

    public void setRights4(String rights4) {
        this.rights4 = rights4;
    }

    public String getRights5() {
        return rights5;
    }

    public void setRights5(String rights5) {
        this.rights5 = rights5;
    }

    public String getRights6() {
        return rights6;
    }

    public void setRights6(String rights6) {
        this.rights6 = rights6;
    }

    public String getTe() {
        return te;
    }

    public void setTe(String te) {
        this.te = te;
    }

    public Server getServer() {
        return server;
    }

    public void setServer(Server server) {
        this.server = server;
    }

    public ClipboardData getClipboardData() {
        return clipboardData;
    }

    public void setClipboardData(ClipboardData clipboardData) {
        this.clipboardData = clipboardData;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUserLanguage() {
        return userLanguage;
    }

    public void setUserLanguage(String userLanguage) {
        this.userLanguage = userLanguage;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }



    public PreferredEditor getPreferredEditor() {
        return preferredEditor;
    }

    public void setPreferredEditor(PreferredEditor preferredEditor) {
        this.preferredEditor = preferredEditor;
    }

    public Boolean getInvertDirectEdit() {
        return invertDirectEdit;
    }

    public void setInvertDirectEdit(Boolean invertDirectEdit) {
        this.invertDirectEdit = invertDirectEdit;
    }

    public Modules getModules() {
        return modules;
    }

    public void setModules(Modules modules) {
        this.modules = modules;
    }

    public LastModules getLastModules() {
        return lastModules;
    }

    public void setLastModules(LastModules lastModules) {
        this.lastModules = lastModules;
    }

    public CcsConnections getCcsConnections() {
        return ccsConnections;
    }

    public void setCcsConnections(CcsConnections ccsConnections) {
        this.ccsConnections = ccsConnections;
    }

    public Projects getProjects() {
        return projects;
    }

    public void setProjects(Projects projects) {
        this.projects = projects;
    }

    public String getAccountSystemGuid() {
        return accountSystemGuid;
    }

    public void setAccountSystemGuid(String accountSystemGuid) {
        this.accountSystemGuid = accountSystemGuid;
    }

    public String getAcs() {
        return acs;
    }

    public void setAcs(String acs) {
        this.acs = acs;
    }

    public Boolean getDisablePassword() {
        return disablePassword;
    }

    public void setDisablePassword(Boolean disablePassword) {
        this.disablePassword = disablePassword;
    }

    public Groups getGroups() {
        return groups;
    }

    public void setGroups(Groups groups) {
        this.groups = groups;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "User{" +
                "accountSystemGuid='" + accountSystemGuid + '\'' +
                ", action='" + action + '\'' +
                ", country='" + country + '\'' +
                ", dialogLanguageId='" + dialogLanguageId + '\'' +
                ", dialogLcid='" + dialogLcid + '\'' +
                ", email='" + email + '\'' +
                ", flags1='" + flags1 + '\'' +
                ", flags2='" + flags2 + '\'' +
                ", fullName='" + fullName + '\'' +
                ", guid='" + guid + '\'' +
                ", isServerManager='" + isServerManager + '\'' +
                ", language='" + language + '\'' +
                ", languageKey='" + languageKey + '\'' +
                ", languageVariantId='" + languageVariantId + '\'' +
                ", languageVariantLcid='" + languageVariantLcid + '\'' +
                ", lcid='" + lcid + '\'' +
                ", level='" + level + '\'' +
                ", lm='" + lm + '\'' +
                ", mainLanguageVariantId='" + mainLanguageVariantId + '\'' +
                ", maxLevel='" + maxLevel + '\'' +
                ", maxLogin=" + maxLogin +
                ", projectGuid='" + projectGuid + '\'' +
                ", pw='" + pw + '\'' +
                ", rights1='" + rights1 + '\'' +
                ", rights2='" + rights2 + '\'' +
                ", rights3='" + rights3 + '\'' +
                ", rights4='" + rights4 + '\'' +
                ", rights5='" + rights5 + '\'' +
                ", rights6='" + rights6 + '\'' +
                ", te='" + te + '\'' +
                ", userId='" + userId + '\'' +
                ", userLanguage='" + userLanguage + '\'' +
                ", server=" + server +
                ", clipboardData=" + clipboardData +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", disabled=" + disabled +
                ", preferredEditor=" + preferredEditor +
                ", invertDirectEdit=" + invertDirectEdit +
                ", modules=" + modules +
                ", lastModules=" + lastModules +
                ", ccsConnections=" + ccsConnections +
                ", projects=" + projects +
                ", acs='" + acs + '\'' +
                ", disablePassword=" + disablePassword +
                ", id='" + id + '\'' +
                ", groups=" + groups +
                '}';
    }
}
