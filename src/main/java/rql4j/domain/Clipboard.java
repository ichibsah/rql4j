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

public class Clipboard {

    public enum Type {
        LINK
    }

    private String action;
    private String guid;
    private Type type;
    private List<Entry> entryList;
    private Entry entry;

    public Clipboard() {
    }

    public Clipboard(String guid) {
        this.guid = guid;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public String getGuid() {
        return guid;
    }

    public void setGuid(String guid) {
        this.guid = guid;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public List<Entry> getEntryList() {
        return entryList;
    }

    public void setEntryList(List<Entry> entryList) {
        this.entryList = entryList;
    }

    public Entry getEntry() {
        return entry;
    }

    public void setEntry(Entry entry) {
        this.entry = entry;
    }

    @Override
    public String toString() {
        return "Clipboard{" +
                "action='" + action + '\'' +
                ", guid='" + guid + '\'' +
                ", type=" + type +
                ", entryList=" + entryList +
                ", entry=" + entry +
                '}';
    }
}
