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

public class IoData {
    private String loginGuid;
    private String sessionKey;
    private String result;
    private Page page;
    private List<Page> pageList;
    private Login login;
    private Administration administration;
    private Project project;
    private Projects projects;
    private User user;
    private Server server;
    private License license;
    private Link link;
    private Elements elements;
    private Media media;
    private List<File> fileList;
    private Folder folder;
    private Template template;
    private AccountSystem accountSystem;
    private Files files;
    private Pages pages;
    private ExportJob exportJob;
    private Languagevariants languageVariants;
    private ProjectVariants projectVariants;
    private Folders folders;
    private Templates templates;
    private ExportJobs exportJobs;
    private Export export;
    private Category category;
    private Categories categories;
    private Keyword keyword;
    private List<Element> elementList;
    private ClipboardData clipboardData;
    private Clipboard clipboard;
    private List<IoData> ioDataList;
    private SharedFolder sharedFolder;
    private LinksFrom linksFrom;
    private Workflow workflow;
    private Language language;
    private Languages languages;
    private Dialog dialog;
    private Keywords keywords;
    private Modules modules;

    public IoData() {
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public Project getProject() {
        return project;
    }

    public void setProject(Project project) {
        this.project = project;
    }

    public Administration getAdministration() {
        return administration;
    }

    public void setAdministration(Administration administration) {
        this.administration = administration;
    }

    public Login getLogin() {
        return login;
    }

    public void setLogin(Login login) {
        this.login = login;
    }

    public Page getPage() {
        return page;
    }

    public void setPage(Page page) {
        this.page = page;
    }

    public List<Page> getPageList() {
        return pageList;
    }

    public void setPageList(List<Page> pageList) {
        this.pageList = pageList;
    }

    public String getLoginGuid() {
        return loginGuid;
    }

    public void setLoginGuid(String loginGuid) {
        this.loginGuid = loginGuid;
    }

    public String getSessionKey() {
        return sessionKey;
    }

    public void setSessionKey(String sessionKey) {
        this.sessionKey = sessionKey;
    }

    public Server getServer() {
        return server;
    }

    public void setServer(Server server) {
        this.server = server;
    }

    public License getLicense() {
        return license;
    }

    public void setLicense(License license) {
        this.license = license;
    }

    public Elements getElements() {
        return elements;
    }

    public void setElements(Elements elements) {
        this.elements = elements;
    }

    public Projects getProjects() {
        return projects;
    }

    public void setProjects(Projects projects) {
        this.projects = projects;
    }

    public Media getMedia() {
        return media;
    }

    public void setMedia(Media media) {
        this.media = media;
    }

    public List<File> getFileList() {
        return fileList;
    }

    public void setFileList(List<File> fileList) {
        this.fileList = fileList;
    }

    public Folder getFolder() {
        return folder;
    }

    public void setFolder(Folder folder) {
        this.folder = folder;
    }

    public Template getTemplate() {
        return template;
    }

    public void setTemplate(Template template) {
        this.template = template;
    }

    public Link getLink() {
        return link;
    }

    public void setLink(Link link) {
        this.link = link;
    }

    public AccountSystem getAccountSystem() {
        return accountSystem;
    }

    public void setAccountSystem(AccountSystem accountSystem) {
        this.accountSystem = accountSystem;
    }

    public Files getFiles() {
        return files;
    }

    public void setFiles(Files files) {
        this.files = files;
    }

    public Pages getPages() {
        return pages;
    }

    public void setPages(Pages pages) {
        this.pages = pages;
    }

    public ExportJob getExportJob() {
        return exportJob;
    }

    public void setExportJob(ExportJob exportJob) {
        this.exportJob = exportJob;
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

    public Templates getTemplates() {
        return templates;
    }

    public void setTemplates(Templates templates) {
        this.templates = templates;
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

    public Keyword getKeyword() {
        return keyword;
    }

    public void setKeyword(Keyword keyword) {
        this.keyword = keyword;
    }


    public List<Element> getElementList() {
        return elementList;
    }

    public void setElementList(List<Element> elementList) {
        this.elementList = elementList;
    }

    public ClipboardData getClipboardData() {
        return clipboardData;
    }

    public void setClipboardData(ClipboardData clipboardData) {
        this.clipboardData = clipboardData;
    }

    public List<IoData> getIoDataList() {
        return ioDataList;
    }

    public void setIoDataList(List<IoData> ioDataList) {
        this.ioDataList = ioDataList;
    }

    public Clipboard getClipboard() {
        return clipboard;
    }

    public void setClipboard(Clipboard clipboard) {
        this.clipboard = clipboard;
    }

    public SharedFolder getSharedFolder() {
        return sharedFolder;
    }

    public void setSharedFolder(SharedFolder sharedFolder) {
        this.sharedFolder = sharedFolder;
    }

    public LinksFrom getLinksFrom() {
        return linksFrom;
    }

    public void setLinksFrom(LinksFrom linksFrom) {
        this.linksFrom = linksFrom;
    }

    public Workflow getWorkflow() {
        return workflow;
    }

    public void setWorkflow(Workflow workflow) {
        this.workflow = workflow;
    }

    public Language getLanguage() {
        return language;
    }

    public void setLanguage(Language language) {
        this.language = language;
    }

    public Languages getLanguages() {
        return languages;
    }

    public void setLanguages(Languages languages) {
        this.languages = languages;
    }

    public Dialog getDialog() {
        return dialog;
    }

    public void setDialog(Dialog dialog) {
        this.dialog = dialog;
    }

    public Keywords getKeywords() {
        return keywords;
    }

    public void setKeywords(Keywords keywords) {
        this.keywords = keywords;
    }

    public Modules getModules() {
        return modules;
    }

    public void setModules(Modules modules) {
        this.modules = modules;
    }

    @Override
    public String toString() {
        return "IoData{" +
                "loginGuid='" + loginGuid + '\'' +
                ", sessionKey='" + sessionKey + '\'' +
                ", result='" + result + '\'' +
                ", page=" + page +
                ", pageList=" + pageList +
                ", login=" + login +
                ", administration=" + administration +
                ", project=" + project +
                ", projects=" + projects +
                ", user=" + user +
                ", server=" + server +
                ", license=" + license +
                ", link=" + link +
                ", elements=" + elements +
                ", media=" + media +
                ", fileList=" + fileList +
                ", folder=" + folder +
                ", template=" + template +
                ", accountSystem=" + accountSystem +
                ", files=" + files +
                ", pages=" + pages +
                ", exportJob=" + exportJob +
                ", languageVariants=" + languageVariants +
                ", projectVariants=" + projectVariants +
                ", folders=" + folders +
                ", templates=" + templates +
                ", exportJobs=" + exportJobs +
                ", export=" + export +
                ", category=" + category +
                ", categories=" + categories +
                ", keyword=" + keyword +
                ", elementList=" + elementList +
                ", clipboardData=" + clipboardData +
                ", clipboard=" + clipboard +
                ", ioDataList=" + ioDataList +
                ", sharedFolder=" + sharedFolder +
                ", linksFrom=" + linksFrom +
                ", workflow=" + workflow +
                ", language=" + language +
                ", languages=" + languages +
                ", dialog=" + dialog +
                ", keywords=" + keywords +
                ", modules=" + modules +
                '}';
    }
}
