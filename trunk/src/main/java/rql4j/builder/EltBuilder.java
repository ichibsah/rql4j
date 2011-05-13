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

import rql4j.domain.Elements;
import rql4j.domain.Elt;
import rql4j.domain.IoData;

import java.util.ArrayList;
import java.util.List;

public class EltBuilder extends RqlBuilder {

    private EltBuilder(Save save) {
        super(save.ioData);
    }

    public static class Save implements IBuilder{
        private final IoData ioData;
        private final List<Elt> eltList;
        private final String action;

        public Save() {
            this.ioData = new IoData();
            this.eltList = new ArrayList<Elt>();
            this.action = "save";
        }

        public Save Elt(String eltGuid, String value) {
            Elt elt = new Elt(eltGuid);
            elt.setValue(value);
            this.eltList.add(elt);
            return this;
        }

        public Save EltMedia(String eltGuid, String value, String subdirGuid) {
            Elt elt = new Elt(eltGuid);
            elt.setValue(value);
            elt.setSubdirGuid(subdirGuid);
            this.eltList.add(elt);
            return this;
        }

        @Override
        public EltBuilder build() {
            Elements elements = new Elements();
            elements.setEltList(this.eltList);
            elements.setAction("save");
            ioData.setElements(elements);
            return new EltBuilder(this);
        }
    }
}