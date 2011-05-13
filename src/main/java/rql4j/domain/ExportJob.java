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

public class ExportJob {

    private String action;
    private String email;
    private Integer topPriority;
    private Integer generateRelativePages;
    private Integer generateNextPages;
    private String reddotServer;
    private String application;
    private Date generateDate;
    private Date startGenerationAt;
    private Languagevariants languageVariants;
    private ProjectVariants projectVariants;

    public ExportJob() {
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getTopPriority() {
        return topPriority;
    }

    public void setTopPriority(Integer topPriority) {
        this.topPriority = topPriority;
    }

    public Integer getGenerateRelativePages() {
        return generateRelativePages;
    }

    public void setGenerateRelativePages(Integer generateRelativePages) {
        this.generateRelativePages = generateRelativePages;
    }

    public Integer getGenerateNextPages() {
        return generateNextPages;
    }

    public void setGenerateNextPages(Integer generateNextPages) {
        this.generateNextPages = generateNextPages;
    }

    public String getReddotServer() {
        return reddotServer;
    }

    public void setReddotServer(String reddotServer) {
        this.reddotServer = reddotServer;
    }

    public String getApplication() {
        return application;
    }

    public void setApplication(String application) {
        this.application = application;
    }

    public Date getStartGenerationAt() {
        return startGenerationAt;
    }

    public void setStartGenerationAt(Date startGenerationAt) {
        this.startGenerationAt = startGenerationAt;
    }

    public Date getGenerateDate() {

        return generateDate;
    }

    public void setGenerateDate(Date generateDate) {
        this.generateDate = generateDate;
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

    @Override
    public String toString() {
        return "ExportJob{" +
                "action='" + action + '\'' +
                ", email='" + email + '\'' +
                ", topPriority=" + topPriority +
                ", generateRelativePages=" + generateRelativePages +
                ", generateNextPages=" + generateNextPages +
                ", reddotServer='" + reddotServer + '\'' +
                ", application='" + application + '\'' +
                ", generateDate='" + generateDate + '\'' +
                ", startGenerationAt='" + startGenerationAt + '\'' +
                ", languageVariants=" + languageVariants +
                ", projectVariants=" + projectVariants +
                '}';
    }
}
