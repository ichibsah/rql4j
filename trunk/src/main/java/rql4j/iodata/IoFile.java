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

import rql4j.domain.Element;
import rql4j.domain.File;
import rql4j.domain.IoData;

import java.util.List;

public class IoFile extends IoObject {
    public IoFile(IoData ioData) {
        super(ioData);
    }

    public Boolean isFileExists() {
        if(this.ioData != null &&
                this.ioData.getFolder() != null &&
                this.ioData.getFolder().getFileList() != null &&
                this.ioData.getFolder().getFileList().size() > 0) {
            File file = this.ioData.getFolder().getFileList().get(0);
            if (file.getSourceName().equals(file.getNewSourceName()))
                return false;
            else
                return true;
        }
        return null;
    }

    public Element getElementByName(String name) {
        if(this.ioData != null &&
                this.ioData.getPages() != null &&
                this.ioData.getPageList().get(0).getElements() != null &&
                this.ioData.getPageList().get(0).getElements().getElementList() != null) {
            List<Element> elementList = this.ioData.getPageList().get(0).getElements().getElementList();
            for (Element element : elementList) {
                if (element.getName().equals(name))
                   return element;
            }
        }
        return null;
    }
}
