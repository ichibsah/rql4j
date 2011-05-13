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

public class Project {

    // ToDo: Create Handler
    /**
     * Unrestricted_release = 0
     * Lock entire -1
     * Lock publisher 16
     * publisher + administrator 17
     * administrator 1
     * sitebuilder 2
     * administrator + sitebuilder 18
     * editor 3
     * author 4
     * visitor 5
     */
    public enum InhibitLevel {
        Unrestricted_release,  
    }


    private String guid;
    private String sessionKey;
    private User user;
    private String name;
    private Folder folder;
    private String action;
    private Template template;
    private Pages pages;
    private Page page;
    private Languagevariant languageVariant;
    private Languagevariants languageVariants;
    private ProjectVariants projectVariants;
    private Folders folders;
    private String inhibitLevel;
    private ExportJobs exportJobs;
    private Export export;
    private Category category;
    private Categories categories;
    private List<Category> categoryList;
    private Keyword keyword;
    private String lockInfo;
    private SharedFolder sharedFolder;

    public Project() {
    }

    public Project(String guid) {
        this.guid = guid;
    }

    public String getGuid() {
        return guid;
    }

    public String getSessionKey() {
        return sessionKey;
    }

    public void setSessionKey(String sessionKey) {
        this.sessionKey = sessionKey;
    }

    public void setGuid(String guid) {
        this.guid = guid;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Folder getFolder() {
        return folder;
    }

    public void setFolder(Folder folder) {
        this.folder = folder;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public Template getTemplate() {
        return template;
    }

    public void setTemplate(Template template) {
        this.template = template;
    }

    public Pages getPages() {
        return pages;
    }

    public void setPages(Pages pages) {
        this.pages = pages;
    }

    public Page getPage() {
        return page;
    }

    public void setPage(Page page) {
        this.page = page;
    }

    public Languagevariant getLanguageVariant() {
        return languageVariant;
    }

    public void setLanguageVariant(Languagevariant languageVariant) {
        this.languageVariant = languageVariant;
    }

    public Languagevariants getLanguageVariants() {
        return languageVariants;
    }

    public void setLanguageVariants(Languagevariants languageVariants) {
        this.languageVariants = languageVariants;
    }

    public ProjectVariants getProjectVariants() {
        return projectVariants;
    }

    public void setProjectVariants(ProjectVariants projectVariants) {
        this.projectVariants = projectVariants;
    }

    public Folders getFolders() {
        return folders;
    }

    public void setFolders(Folders folders) {
        this.folders = folders;
    }

    public String getInhibitLevel() {
        return inhibitLevel;
    }

    public void setInhibitLevel(String inhibitLevel) {
        this.inhibitLevel = inhibitLevel;
    }

    public ExportJobs getExportJobs() {
        return exportJobs;
    }

    public void setExportJobs(ExportJobs exportJobs) {
        this.exportJobs = exportJobs;
    }

    public Export getExport() {
        return export;
    }

    public void setExport(Export export) {
        this.export = export;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public Categories getCategories() {
        return categories;
    }

    public void setCategories(Categories categories) {
        this.categories = categories;
    }

    public List<Category> getCategoryList() {
        return categoryList;
    }

    public void setCategoryList(List<Category> categoryList) {
        this.categoryList = categoryList;
    }

    public Keyword getKeyword() {
        return keyword;
    }

    public void setKeyword(Keyword keyword) {
        this.keyword = keyword;
    }

    public String getLockInfo() {
        return lockInfo;
    }

    public void setLockInfo(String lockInfo) {
        this.lockInfo = lockInfo;
    }

    public SharedFolder getSharedFolder() {
        return sharedFolder;
    }

    public void setSharedFolder(SharedFolder sharedFolder) {
        this.sharedFolder = sharedFolder;
    }

    @Override
    public String toString() {
        return "Project{" +
                "guid='" + guid + '\'' +
                ", sessionKey='" + sessionKey + '\'' +
                ", user=" + user +
                ", name='" + name + '\'' +
                ", folder=" + folder +
                ", action='" + action + '\'' +
                ", template=" + template +
                ", pages=" + pages +
                ", page=" + page +
                ", languageVariant=" + languageVariant +
                ", languageVariants=" + languageVariants +
                ", projectVariants=" + projectVariants +
                ", folders=" + folders +
                ", inhibitLevel='" + inhibitLevel + '\'' +
                ", exportJobs=" + exportJobs +
                ", export=" + export +
                ", category=" + category +
                ", categories=" + categories +
                ", categoryList=" + categoryList +
                ", keyword=" + keyword +
                ", lockInfo='" + lockInfo + '\'' +
                ", sharedFolder=" + sharedFolder +
                '}';
    }
}
