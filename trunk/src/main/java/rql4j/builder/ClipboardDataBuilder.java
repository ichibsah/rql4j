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

public class ClipboardDataBuilder extends RqlBuilder {

    private ClipboardDataBuilder(Add add) {
        super(add.ioData);
    }

    private ClipboardDataBuilder(Remove remove) {
        super((remove.ioData));
    }

    private ClipboardDataBuilder(Load load) {
        super(load.ioData);
    }

    private ClipboardDataBuilder(Save save) {
        super(save.ioData);
    }

    public static class Add {
        private final IoData ioData;
        private final Administration administration;
        private final User user;
        private final ClipboardData clipboardData;
        private final Data data;
        private final String action = "add";

        public Add(String userGuid, String projectGuid, String elementGuid, Data.DataType type) {
            this.ioData = new IoData();
            this.administration = new Administration();
            this.user = new User(userGuid);
            this.clipboardData = new ClipboardData();
            this.clipboardData.setAction(this.action);
            this.clipboardData.setProjectGuid(projectGuid);
            this.data = new Data(elementGuid);
            this.data.setType(type);
        }

        public ClipboardDataBuilder build() {
            this.ioData.setAdministration(this.administration);
            this.administration.setUser(this.user);
            this.user.setClipboardData(this.clipboardData);
            this.clipboardData.setData(this.data);
            return new ClipboardDataBuilder(this);
        }
    }

    public static class Remove implements IBuilder {
        private final IoData ioData;
        private final Administration administration;
        private final User user;
        private final ClipboardData clipboardData;
        private final Data data;
        private final String action = "remove";

        public Remove(String userGuid, String projectGuid, String elementGuid, Data.DataType type) {
            this.ioData = new IoData();
            this.administration = new Administration();
            this.user = new User(userGuid);
            this.clipboardData = new ClipboardData();
            this.clipboardData.setAction(this.action);
            this.clipboardData.setProjectGuid(projectGuid);
            this.data = new Data(elementGuid);
            this.data.setType(type);
        }

        public ClipboardDataBuilder build() {
            this.ioData.setAdministration(this.administration);
            this.administration.setUser(this.user);
            this.user.setClipboardData(this.clipboardData);
            this.clipboardData.setData(this.data);
            return new ClipboardDataBuilder(this);
        }
    }

    public static class Load implements IBuilder {
        private final IoData ioData;
        private final Administration administration;
        private final User user;
        private final ClipboardData clipboardData;
        private final String action = "load";

        public Load(String userGuid) {
            this.ioData = new IoData();
            this.administration = new Administration();
            this.user = new User(userGuid);
            this.clipboardData = new ClipboardData();
            this.clipboardData.setAction(this.action);
        }

        public Load languageVariantId(String languageVariantId) {
            this.clipboardData.setLanguageVariantId(languageVariantId);
            return this;
        }

        public Load projectGuid(String projectGuid) {
            this.clipboardData.setProjectGuid(projectGuid);
            return this;
        }

        public Load forAspx(Boolean forAspx) {
            this.clipboardData.setForAspx(forAspx);
            return this;
        }

        public ClipboardDataBuilder build() {
            this.ioData.setAdministration(this.administration);
            this.administration.setUser(this.user);
            this.user.setClipboardData(this.clipboardData);
            return new ClipboardDataBuilder(this);
        }

    }

    public static class Save implements IBuilder {
        private final IoData ioData;
        private final Administration administration;
        private final User user;
        private final ClipboardData clipboardData;
        private final String action = "save";

        public Save(String userGuid, String value) {
            this.ioData = new IoData();
            this.administration = new Administration();
            this.user = new User(userGuid);
            this.clipboardData = new ClipboardData();
            this.clipboardData.setAction(this.action);
            this.clipboardData.setValue(value);
        }

        public Save projectGuid(String projectGuid) {
            this.clipboardData.setProjectGuid(projectGuid);
            return this;
        }

        public ClipboardDataBuilder build() {
            this.ioData.setAdministration(this.administration);
            this.administration.setUser(this.user);
            this.user.setClipboardData(this.clipboardData);
            return new ClipboardDataBuilder(this);
        }
    }
}
