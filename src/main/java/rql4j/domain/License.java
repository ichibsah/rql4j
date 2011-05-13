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

public class License {
    private String guid;
    private String id;
    private String level;
    private String levelChanged;
    private String lm;
    private String projectGuid;
    private String te;
    private String userGuid;

    public License() {
    }

    public String getGuid() {
        return guid;
    }

    public void setGuid(String guid) {
        this.guid = guid;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getLevelChanged() {
        return levelChanged;
    }

    public void setLevelChanged(String levelChanged) {
        this.levelChanged = levelChanged;
    }

    public String getLm() {
        return lm;
    }

    public void setLm(String lm) {
        this.lm = lm;
    }

    public String getProjectGuid() {
        return projectGuid;
    }

    public void setProjectGuid(String projectGuid) {
        this.projectGuid = projectGuid;
    }

    public String getTe() {
        return te;
    }

    public void setTe(String te) {
        this.te = te;
    }

    public String getUserGuid() {
        return userGuid;
    }

    public void setUserGuid(String userGuid) {
        this.userGuid = userGuid;
    }

    @Override
    public String toString() {
        return "License{" +
                "guid='" + guid + '\'' +
                ", id='" + id + '\'' +
                ", level='" + level + '\'' +
                ", levelChanged='" + levelChanged + '\'' +
                ", lm='" + lm + '\'' +
                ", projectGuid='" + projectGuid + '\'' +
                ", te='" + te + '\'' +
                ", userGuid='" + userGuid + '\'' +
                '}';
    }
}
