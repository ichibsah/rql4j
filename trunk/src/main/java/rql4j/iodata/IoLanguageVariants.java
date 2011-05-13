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
import rql4j.domain.Languagevariant;
import java.util.List;

public class IoLanguageVariants extends IoObject {
    public IoLanguageVariants(IoData ioData) {
        super(ioData);
    }

    public Languagevariant getMainLanguage() {
        if (this.ioData != null &&
                this.ioData.getLanguageVariants() != null &&
                this.ioData.getLanguageVariants().getLanguagevariantList() != null) {
            List<Languagevariant> languagevariantList = this.ioData.getLanguageVariants().getLanguagevariantList();
            for (Languagevariant languagevariant : languagevariantList) {
                if (languagevariant.getMainLanguage() == 1)
                    return languagevariant;
            }
        }
        return null;
    }

    public Languagevariant getLanguageVariantByName(String name) {
        if (this.ioData != null &&
                this.ioData.getLanguageVariants() != null &&
                this.ioData.getLanguageVariants().getLanguagevariantList() != null) {
            List<Languagevariant> languagevariantList = this.ioData.getLanguageVariants().getLanguagevariantList();
            for (Languagevariant languagevariant : languagevariantList) {
                if (languagevariant.getName().equals(name))
                    return languagevariant;
            }
        }
        return null;
    }

    public List<Languagevariant> getLanguageVariants() {
        if (this.ioData != null &&
                this.ioData.getLanguageVariants() != null &&
                this.ioData.getLanguageVariants().getLanguagevariantList() != null) {
            return this.ioData.getLanguageVariants().getLanguagevariantList();
        }
        return null;
    }
}
