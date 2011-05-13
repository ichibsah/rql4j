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

package rql4j.cms;

import rql4j.RDCMSXMLServerLocator;

import java.net.MalformedURLException;
import java.net.URL;

public class CmsServer {
    private URL url;
    private RDCMSXMLServerLocator locator;

    public CmsServer(String url) {
        try {
            this.url = new URL(url);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        this.locator = new RDCMSXMLServerLocator();
    }


    public URL getUrl() {
        return url;
    }

    public RDCMSXMLServerLocator getLocator() {
        return locator;
    }

}
