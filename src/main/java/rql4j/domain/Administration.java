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

public class Administration {
    private String name;
    private String password;
    private String action;
    private String loginGuid;
    private String userAgent;
    private Project project;
    private Projects projects;
    private Logout logout;
    private User user;

    public Administration() {
    }

    public Administration(String name, String password) {
        this.name = name;
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public String getLoginGuid() {
        return loginGuid;
    }

    public void setLoginGuid(String loginGuid) {
        this.loginGuid = loginGuid;
    }

    public String getUserAgent() {
        return userAgent;
    }

    public void setUserAgent(String userAgent) {
        this.userAgent = userAgent;
    }

    public Project getProject() {
        return project;
    }

    public void setProject(Project project) {
        this.project = project;
    }

    public Projects getProjects() {
        return projects;
    }

    public void setProjects(Projects projects) {
        this.projects = projects;
    }

    public Logout getLogout() {
        return logout;
    }

    public void setLogout(Logout logout) {
        this.logout = logout;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "Administration{" +
                "name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", action='" + action + '\'' +
                ", loginGuid='" + loginGuid + '\'' +
                ", userAgent='" + userAgent + '\'' +
                ", project=" + project +
                ", projects=" + projects +
                ", logout=" + logout +
                ", user=" + user +
                '}';
    }
}