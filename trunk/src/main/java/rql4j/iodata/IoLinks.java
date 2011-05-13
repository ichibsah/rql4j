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
import rql4j.domain.Link;

import java.util.List;

public class IoLinks extends IoObject{
    public IoLinks(IoData ioData) {
        super(ioData);
    }

    public Link getLinksByName(String name) {
        if (this.ioData != null &&
                this.ioData.getPage() != null &&
                this.ioData.getPage().getLinks() != null &&
                this.ioData.getPage().getLinks().getLinkList() != null) {
            List<Link> links = this.ioData.getPage().getLinks().getLinkList();
            for (Link link : links) {
                if (link.getName().equals(name))
                   return link;
            }
        }
        return null;
    }
}
