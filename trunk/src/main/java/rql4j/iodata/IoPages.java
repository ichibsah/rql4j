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
import rql4j.domain.Page;

import java.util.List;

public class IoPages extends IoObject {
    public IoPages(IoData ioData) {
        super(ioData);
    }

    public List<Page> getPageList() {
        if (this.ioData != null &&
                this.ioData.getLink() != null &&
                this.ioData.getLink().getPages() != null &&
                this.ioData.getLink().getPages().getPageList() != null)
            return this.ioData.getLink().getPages().getPageList();
        else if (this.ioData != null &&
                this.ioData.getPages() != null &&
                this.ioData.getPages().getPageList() != null)
            return this.ioData.getPages().getPageList();
        else
            return null;
    }
}
