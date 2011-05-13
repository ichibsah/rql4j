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

public class File {
    private String sourceName;
    private String sourcePath;
    private String action;
    private String tempDir;
    private String guid;
    private String dialogLanguageId;
    private String newSourceName;
    private Integer checkoutDate;
    private String checkoutUser;
    private String thumbGuid;
    private String name;
    private String thumbName;
    private Date date;
    private String author;
    private String checkedFrom;
    private Date checkDate;
    private Boolean isThumbExist;
    private int deletereal;


    public File() {
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public String getSourceName() {
        return sourceName;
    }

    public void setSourceName(String sourceName) {
        this.sourceName = sourceName;
    }

    public String getSourcePath() {
        return sourcePath;
    }

    public void setSourcePath(String sourcePath) {
        this.sourcePath = sourcePath;
    }

    public String getTempDir() {
        return tempDir;
    }

    public void setTempDir(String tempDir) {
        this.tempDir = tempDir;
    }

    public String getGuid() {
        return guid;
    }

    public void setGuid(String guid) {
        this.guid = guid;
    }

    public Integer getCheckoutDate() {
        return checkoutDate;
    }

    public void setCheckoutDate(Integer checkoutDate) {
        this.checkoutDate = checkoutDate;
    }

    public String getCheckoutUser() {
        return checkoutUser;
    }

    public void setCheckoutUser(String checkoutUser) {
        this.checkoutUser = checkoutUser;
    }

    public String getDialogLanguageId() {
        return dialogLanguageId;
    }

    public void setDialogLanguageId(String dialogLanguageId) {
        this.dialogLanguageId = dialogLanguageId;
    }

    public String getNewSourceName() {
        return newSourceName;
    }

    public void setNewSourceName(String newSourceName) {
        this.newSourceName = newSourceName;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Date getCheckDate() {
        return checkDate;
    }

    public void setCheckDate(Date checkDate) {
        this.checkDate = checkDate;
    }

    public String getCheckedFrom() {
        return checkedFrom;
    }

    public void setCheckedFrom(String checkedFrom) {
        this.checkedFrom = checkedFrom;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Boolean getThumbExist() {
        return isThumbExist;
    }

    public void setThumbExist(Boolean thumbExist) {
        isThumbExist = thumbExist;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getThumbGuid() {
        return thumbGuid;
    }

    public void setThumbGuid(String thumbGuid) {
        this.thumbGuid = thumbGuid;
    }

    public String getThumbName() {
        return thumbName;
    }

    public void setThumbName(String thumbName) {
        this.thumbName = thumbName;
    }

    public int getDeletereal() {
        return deletereal;
    }

    public void setDeletereal(int deletereal) {
        this.deletereal = deletereal;
    }


    @Override
    public String toString() {
        return "File{" +
                "sourceName='" + sourceName + '\'' +
                ", sourcePath='" + sourcePath + '\'' +
                ", action='" + action + '\'' +
                ", tempDir='" + tempDir + '\'' +
                ", guid='" + guid + '\'' +
                ", dialogLanguageId='" + dialogLanguageId + '\'' +
                ", newSourceName='" + newSourceName + '\'' +
                ", checkoutDate=" + checkoutDate +
                ", checkoutUser='" + checkoutUser + '\'' +
                ", thumbGuid='" + thumbGuid + '\'' +
                ", name='" + name + '\'' +
                ", thumbName='" + thumbName + '\'' +
                ", date=" + date +
                ", author='" + author + '\'' +
                ", checkedFrom='" + checkedFrom + '\'' +
                ", checkDate=" + checkDate +
                ", isThumbExist=" + isThumbExist +
                ", deletereal=" + deletereal +
                '}';
    }
}
