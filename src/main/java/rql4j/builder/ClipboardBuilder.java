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

import rql4j.domain.Clipboard;
import rql4j.domain.Entry;
import rql4j.domain.IoData;

import java.util.ArrayList;
import java.util.List;

public class ClipboardBuilder extends RqlBuilder {

    private ClipboardBuilder(AddPagesToLink addPagesToLink) {
        super(addPagesToLink.ioData);
    }

    private ClipboardBuilder(ReferenceToLink referenceToLink) {
        super(referenceToLink.ioData);
    }

    /**
     *
     */
    public static class AddPagesToLink implements IBuilder {
        private final IoData ioData;
        private final Clipboard clipboard;
        private final List<Entry> entryList;
        private final String action = "AddPagesToLink";

        public AddPagesToLink(String linkGuid) {
            this.ioData = new IoData();
            this.clipboard = new Clipboard(linkGuid);
            this.clipboard.setAction(this.action);
            this.clipboard.setType(Clipboard.Type.LINK);
            this.entryList = new ArrayList<Entry>();
        }

        public AddPagesToLink Entry(String pageGuid) {
            Entry entry = new Entry(pageGuid);
            entry.setType(Entry.Type.PAGE);
            this.entryList.add(entry);
            return this;
        }

        public ClipboardBuilder build() {
            this.ioData.setClipboard(this.clipboard);
            this.clipboard.setEntryList(this.entryList);
            return new ClipboardBuilder(this);
        }
    }

        public static class ReferenceToLink implements IBuilder {
        private final IoData ioData;
        private final Clipboard clipboard;
        private final Entry entry;
        private final String action = "ReferenceToLink";

        public ReferenceToLink(String linkGuid, String entryGuid) {
            this.ioData = new IoData();
            this.clipboard = new Clipboard(linkGuid);
            this.clipboard.setAction(this.action);
            this.clipboard.setType(Clipboard.Type.LINK);
            this.entry = new Entry(entryGuid);
            this.entry.setType(Entry.Type.LINK);
        }

        public ClipboardBuilder build() {
            this.ioData.setClipboard(this.clipboard);
            this.clipboard.setEntry(this.entry);
            return new ClipboardBuilder(this);
        }
    }
}
