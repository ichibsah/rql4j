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

package rql4j.iodata;

import rql4j.domain.IoData;
import rql4j.domain.ProjectVariant;
import java.util.List;

public class IoProjectVariants extends IoObject {
    public IoProjectVariants(IoData ioData) {
        super(ioData);
    }

    public ProjectVariant getDisplayFromat() {
        if (this.ioData != null &&
                this.ioData.getProjectVariants() != null &&
                this.ioData.getProjectVariants().getProjectVariantList() != null) {
            List<ProjectVariant> projectVariantList = this.ioData.getProjectVariants().getProjectVariantList();
            for (ProjectVariant projectVariant : projectVariantList) {
                if (projectVariant.getChecked() == 1)
                    return projectVariant;
            }
        }
        return null;
    }

    public ProjectVariant getUserDisplayVariant() {
        if (this.ioData != null &&
                this.ioData.getProjectVariants() != null &&
                this.ioData.getProjectVariants().getProjectVariantList() != null) {
            List<ProjectVariant> projectVariantList = this.ioData.getProjectVariants().getProjectVariantList();
            for (ProjectVariant projectVariant : projectVariantList) {
                if (projectVariant.getUserDisplayVariant() != null && projectVariant.getUserDisplayVariant() == 1)
                    return projectVariant;
            }
        }
        return null;
    }

    public ProjectVariant getProjectVariantByName(String name) {
        if (this.ioData != null &&
                this.ioData.getProjectVariants() != null &&
                this.ioData.getProjectVariants().getProjectVariantList() != null) {
            List<ProjectVariant> projectVariantList = this.ioData.getProjectVariants().getProjectVariantList();
            for (ProjectVariant projectVariant : projectVariantList) {
                if (projectVariant.getName().equals(name))
                    return projectVariant;
            }
        }
        return null;
    }

    public List<ProjectVariant> getProjectVariants() {
        if (this.ioData != null &&
                this.ioData.getProjectVariants() != null &&
                this.ioData.getProjectVariants().getProjectVariantList() != null) {
            return this.ioData.getProjectVariants().getProjectVariantList();
        }
        return null;
    }
}
