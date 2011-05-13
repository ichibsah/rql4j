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

import rql4j.domain.*;

public class IoAdminstration extends IoObject {
    public IoAdminstration(IoData ioData) {
        super(ioData);
    }

    public Login getLogin() {
        if (this.ioData != null &&
                this.ioData.getLogin() != null)
            return this.ioData.getLogin();
        return null;
    }

    public Server getServer() {
        if (this.ioData != null &&
                this.ioData.getServer() != null)
            return this.ioData.getServer();
        return null;
    }

    public User getUser() {
        if (this.ioData != null &&
                this.ioData.getUser() != null)
            return this.ioData.getUser();
        return null;
    }

}

