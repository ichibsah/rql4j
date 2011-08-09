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

public class Folder {


	public enum SaveType {
		REDDOT_DATABASE, EXTERNAL_FOLDER, FILE_SYSTEM, EXTERNAL_DATABASE
	}

	public enum Catalog {
		STANDARD_FILE_FOLDER, ASSET_MANAGER
	}

	private String guid;
	private String languageVariantId;
	private String dialogLanguageId;
	private Integer versioning;
	private List<File> fileList;
	private Files files;
	private String name;
	private Boolean shared;
	private FolderType folderType;
	private Boolean hideInTextEditor;
	private String description;
	private String dms;
	private String folderRights;
	private String path;
	private SaveType saveType;
	private Catalog catalog;
	private SubFolders subFolders;

	public Folder() {
	}

	public Folder(String guid) {
		this.guid = guid;
	}

	public String getGuid() {
		return guid;
	}

	public void setGuid(String guid) {
		this.guid = guid;
	}

	public List<File> getFileList() {
		return fileList;
	}

	public void setFileList(List<File> fileList) {
		this.fileList = fileList;
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

	public Integer getVersioning() {
		return versioning;
	}

	public void setVersioning(Integer versioning) {
		this.versioning = versioning;
	}

	public Files getFiles() {
		return files;
	}

	public void setFiles(Files files) {
		this.files = files;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Boolean isShared() {
		return shared;
	}

	public void setShared(Boolean shared) {
		this.shared = shared;
	}

	public FolderType getFolderType() {
		return folderType;
	}

	public void setFolderType(FolderType folderType) {
		this.folderType = folderType;
	}

	public Boolean isHideInTextEditor() {
		return hideInTextEditor;
	}

	public void setHideInTextEditor(Boolean hideInTextEditor) {
		this.hideInTextEditor = hideInTextEditor;
	}

	public SaveType getSaveType() {
		return saveType;
	}

	public void setSaveType(SaveType saveType) {
		this.saveType = saveType;
	}

	public Catalog getCatalog() {
		return catalog;
	}

	public void setCatalog(Catalog catalog) {
		this.catalog = catalog;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getDms() {
		return dms;
	}

	public void setDms(String dms) {
		this.dms = dms;
	}

	public String getFolderRights() {
		return folderRights;
	}

	public void setFolderRights(String folderRights) {
		this.folderRights = folderRights;
	}

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}

	public SubFolders getSubFolders() {
		return subFolders;
	}

	public void setSubFolders(SubFolders subFolders) {
		this.subFolders = subFolders;
	}

	@Override
	public String toString() {
		return "Folder{" +
				"catalog=" + catalog +
				", guid='" + guid + '\'' +
				", languageVariantId='" + languageVariantId + '\'' +
				", dialogLanguageId='" + dialogLanguageId + '\'' +
				", versioning=" + versioning +
				", fileList=" + fileList +
				", files=" + files +
				", name='" + name + '\'' +
				", shared=" + shared +
				", folderType=" + folderType +
				", hideInTextEditor=" + hideInTextEditor +
				", description='" + description + '\'' +
				", dms='" + dms + '\'' +
				", folderRights='" + folderRights + '\'' +
				", path='" + path + '\'' +
				", saveType=" + saveType +
				", subFolders=" + subFolders +
				'}';
	}
}
