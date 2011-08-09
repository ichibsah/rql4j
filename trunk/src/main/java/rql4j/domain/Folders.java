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


public class Folders {

    private String action;
    private List<Folder> folderList;
    private FolderType folderType;

    public Folders() {
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public List<Folder> getFolderList() {
        return folderList;
    }

    public void setFolderList(List<Folder> folderList) {
        this.folderList = folderList;
    }

	public FolderType getFolderType() {
		return folderType;
	}

	public void setFolderType(FolderType folderType) {
		this.folderType = folderType;
	}

	@Override
    public String toString() {
        return "Folders{" +
                "action='" + action + '\'' +
                ", folderList=" + folderList +
                ", folderType=" + folderType +
                '}';
    }
}
