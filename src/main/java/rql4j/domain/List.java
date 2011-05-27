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

public class List {
    private String id;
    private String country;
    private String language;
    private Boolean standardLanguage;
    private Integer lcid;
    private String rfcLanguageId;

    public List() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public Boolean getStandardLanguage() {
        return standardLanguage;
    }

    public void setStandardLanguage(Boolean standardLanguage) {
        this.standardLanguage = standardLanguage;
    }

    public Integer getLcid() {
        return lcid;
    }

    public void setLcid(Integer lcid) {
        this.lcid = lcid;
    }

    public String getRfcLanguageId() {
        return rfcLanguageId;
    }

    public void setRfcLanguageId(String rfcLanguageId) {
        this.rfcLanguageId = rfcLanguageId;
    }

    @Override
    public String toString() {
        return "List{" +
                "id='" + id + '\'' +
                ", country='" + country + '\'' +
                ", language='" + language + '\'' +
                ", standardLanguage=" + standardLanguage +
                ", lcid=" + lcid +
                ", rfcLanguageId='" + rfcLanguageId + '\'' +
                '}';
    }
}
