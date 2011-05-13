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

import rql4j.cms.RemoteCallWorker;
import rql4j.domain.IoData;


public abstract class RqlBuilder {
    final IoData ioData;
    private IoData result;

    protected RqlBuilder(IoData ioData) {
        this.ioData = ioData;
    }

    public IoData execute(RemoteCallWorker worker) {
        if(worker.getLoginGuid()!= null)
            ioData.setLoginGuid(worker.getLoginGuid());
        if(worker.getSesionKey()!= null)
            ioData.setSessionKey(worker.getSesionKey());
        this.result = worker.execute(ioData);
        return this.result;
    }

}
