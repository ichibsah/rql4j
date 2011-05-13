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

public class AccountSystem {
    public enum AccountSystemType {
        WIN_NT, LDAP
    }
    private String guid;
    private String action;
    private Boolean anonymousnt;
    private String name;
    private String user;
    private String domain;
    private String group;
    private String path;
    private AccountSystemType system;
    private String pass;
    private Boolean anonymousldap;
    private String binddn;
    private String ldapserver;
    private String port;
    private String filter;
    private String scope;
    private String ldappass;

    public AccountSystem() {
    }

    public AccountSystem(String guid) {
        this.guid = guid;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public Boolean getAnonymousldap() {
        return anonymousldap;
    }

    public void setAnonymousldap(Boolean anonymousldap) {
        this.anonymousldap = anonymousldap;
    }

    public Boolean getAnonymousnt() {
        return anonymousnt;
    }

    public void setAnonymousnt(Boolean anonymousnt) {
        this.anonymousnt = anonymousnt;
    }

    public String getBinddn() {
        return binddn;
    }

    public void setBinddn(String binddn) {
        this.binddn = binddn;
    }

    public String getDomain() {
        return domain;
    }

    public void setDomain(String domain) {
        this.domain = domain;
    }

    public String getFilter() {
        return filter;
    }

    public void setFilter(String filter) {
        this.filter = filter;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public String getGuid() {
        return guid;
    }

    public void setGuid(String guid) {
        this.guid = guid;
    }

    public String getLdappass() {
        return ldappass;
    }

    public void setLdappass(String ldappass) {
        this.ldappass = ldappass;
    }

    public String getLdapserver() {
        return ldapserver;
    }

    public void setLdapserver(String ldapserver) {
        this.ldapserver = ldapserver;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public String getPort() {
        return port;
    }

    public void setPort(String port) {
        this.port = port;
    }

    public String getScope() {
        return scope;
    }

    public void setScope(String scope) {
        this.scope = scope;
    }

    public AccountSystemType getSystem() {
        return system;
    }

    public void setSystem(AccountSystemType system) {
        this.system = system;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "AccountSystem{" +
                "action='" + action + '\'' +
                ", guid='" + guid + '\'' +
                ", anonymousnt='" + anonymousnt + '\'' +
                ", name='" + name + '\'' +
                ", user='" + user + '\'' +
                ", domain='" + domain + '\'' +
                ", group='" + group + '\'' +
                ", path='" + path + '\'' +
                ", system='" + system + '\'' +
                ", pass='" + pass + '\'' +
                ", anonymousldap='" + anonymousldap + '\'' +
                ", binddn='" + binddn + '\'' +
                ", ldapserver='" + ldapserver + '\'' +
                ", port='" + port + '\'' +
                ", filter='" + filter + '\'' +
                ", scope='" + scope + '\'' +
                ", ldappass='" + ldappass + '\'' +
                '}';
    }
}
