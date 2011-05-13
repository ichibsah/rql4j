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

package rql4j.builder;

import rql4j.domain.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ExportJobBuilder  extends RqlBuilder {
    private ExportJobBuilder(Save save) {
        super(save.ioData);
    }

    public static class Save implements IBuilder {

        private final IoData ioData;
        private final Project project;
        private final Page page;
        private final ExportJob exportJob;
        private final Languagevariants languagevariants;
        private final List<Languagevariant> languagevariantList;
        private final ProjectVariants projectVariants;
        private final List<ProjectVariant> projectVariantList;
        private final String action;

        public Save(String projectGuid, String pageGuid, Boolean generateNextPages, Boolean generateRelativePages, String emailGuid) {
            this.ioData = new IoData();
            this.project = new Project(projectGuid);
            this.page = new Page(pageGuid);
            this.exportJob = new ExportJob();
            if(generateNextPages)
                exportJob.setGenerateNextPages(1);
            if(generateRelativePages)
                exportJob.setGenerateRelativePages(1);
            exportJob.setEmail(emailGuid);
            this.languagevariants = new Languagevariants();
            languagevariants.setAction("checkassigning");
            this.languagevariantList = new ArrayList<Languagevariant>();
            this.projectVariants = new ProjectVariants();
            projectVariants.setAction("checkassigning");
            this.projectVariantList = new ArrayList<ProjectVariant>();
            this.action = "save";
            exportJob.setAction(this.action);
        }

        public Save LanguageVariant(String languageVariantGuid, Boolean checked) {
            Languagevariant languagevariant = new Languagevariant(languageVariantGuid);
            if(checked)
                languagevariant.setChecked(1);
            languagevariantList.add(languagevariant);
            return this;
        }

        public Save ProjectVariant(String projectVariantGuid, Boolean checked) {
            ProjectVariant projectVariant = new ProjectVariant(projectVariantGuid);
            if(checked)
                projectVariant.setChecked(1);
            projectVariantList.add(projectVariant);
            return this;
        }

        public Save generateDate(Date generateDate) {
            this.exportJob.setGenerateDate(generateDate);
            return this;
        }

        public Save startGenerationAt(Date startGenerationDate) {
            this.exportJob.setStartGenerationAt(startGenerationDate);
            return this;
        }

        @Override
        public ExportJobBuilder build() {
            this.ioData.setProject(this.project);
            this.project.setPage(this.page);
            this.page.setExportJob(this.exportJob);
            this.exportJob.setLanguageVariants(this.languagevariants);
            this.exportJob.setProjectVariants(this.projectVariants);
            this.languagevariants.setLanguagevariantList(this.languagevariantList);
            this.projectVariants.setProjectVariantList(this.projectVariantList);
            return new ExportJobBuilder(this);
        }
    }
}
