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

public class SearchItem {

    public enum Key {
        HEADLINE, SEARCHTEXT, CONTENTCLASSGUID, PAGEID, CREATEDBY, CHANGEDBY, CREATEDATE, CHANGEDATE, KEYWORD, WORKFLOW, SPECIALPAGES, PAGESTATE
    }

    public enum Operator {
        LIKE, CONTAINS, EQ, NE, GT, LT, GE, LE
    }

    public enum PageState {
        WAITINGFORTRANSLATION, CHECKEDOUT, WAITINGFORRELEASE, WAITINGFORCORRECTION, PAGESINWORKFLOW, RESUBMITTED, RELEASED
    }
    
    public enum User {
        MYSELF, ALL
    }


    private Key key;
    private String value;
    private Operator operator;
    private Users users;
    private User user;
    private String sourceLanguage;


    public SearchItem() {
    }

    public SearchItem(Key key, String value, Operator operator) {
        this.key = key;
        this.value = value;
        this.operator = operator;
    }

    public SearchItem(Key key, String value, Operator operator, User user) {
        this.key = key;
        this.value = value;
        this.operator = operator;
        this.user = user;
    }

    public SearchItem(Key key, String value, Operator operator, User user, String sourceLanguage) {
        this.key = key;
        this.value = value;
        this.operator = operator;
        this.user = user;
        this.sourceLanguage = sourceLanguage;
    }

    public Key getKey() {
        return key;
    }

    public void setKey(Key key) {
        this.key = key;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public Operator getOperator() {
        return operator;
    }

    public void setOperator(Operator operator) {
        this.operator = operator;
    }

    public Users getUsers() {
        return users;
    }

    public void setUsers(Users users) {
        this.users = users;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getSourceLanguage() {
        return sourceLanguage;
    }

    public void setSourceLanguage(String sourceLanguage) {
        this.sourceLanguage = sourceLanguage;
    }

    @Override
    public String toString() {
        return "SearchItem{" +
                "key=" + key +
                ", value='" + value + '\'' +
                ", operator=" + operator +
                ", users=" + users +
                ", user=" + user +
                ", sourceLanguage='" + sourceLanguage + '\'' +
                '}';
    }
}
