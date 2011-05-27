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

import com.sun.org.apache.xml.internal.serialize.Method;
import com.sun.org.apache.xml.internal.serialize.OutputFormat;
import com.sun.org.apache.xml.internal.serialize.XMLSerializer;
import org.apache.log4j.Logger;
import org.exolab.castor.mapping.Mapping;
import org.exolab.castor.mapping.MappingException;
import org.exolab.castor.xml.*;
import org.xml.sax.ContentHandler;
import rql4j.XmlServerSoapPort_PortType;
import rql4j.domain.IoData;

import javax.xml.rpc.ServiceException;
import javax.xml.rpc.holders.StringHolder;
import java.io.IOException;
import java.io.StringReader;
import java.io.StringWriter;
import java.net.URL;
import java.rmi.RemoteException;

public class RemoteCallWorker {
    private XmlServerSoapPort_PortType port;
    private static RemoteCallWorker instance;
    private static Logger log;

    private String sesionKey;
    private String loginGuid;

    public RemoteCallWorker(CmsServer server) {
        log = Logger.getLogger(RemoteCallWorker.class);
        try {
            this.port = server.getLocator().getXmlServerSoapPort(server.getUrl());
        } catch (ServiceException e) {
            e.printStackTrace();
        }
    }


    public static RemoteCallWorker getInstance(CmsServer server) {
        if (instance == null) {
            instance = new RemoteCallWorker(server);
        }
        return instance;
    }

    public String getSesionKey() {
        return sesionKey;
    }

    public void setSesionKey(String sesionKey) {
        this.sesionKey = sesionKey;
    }

    public String getLoginGuid() {
        return loginGuid;
    }

    public void setLoginGuid(String loginGuid) {
        this.loginGuid = loginGuid;
    }

    public IoData execute(Object obj) {
        StringHolder sErrorA = new StringHolder();
        StringHolder sResultInfoA = new StringHolder();
        String result = "";
        IoData data = null;
        Mapping mapping = new Mapping();
        URL mappingFile = this.getClass().getResource("/META-INF/mapping.xml");

        try {
            mapping.loadMapping(mappingFile);
        } catch (Exception e) {
            e.printStackTrace();
        }
        XMLContext context = new XMLContext();
        try {
            context.addMapping(mapping);
        } catch (MappingException e) {
            e.printStackTrace();
        }

        StringWriter writer = new StringWriter();
        OutputFormat outputFormat = new OutputFormat(Method.XML, "UTF-8", true);
        XMLSerializer serializer = new XMLSerializer(writer,outputFormat);
        Marshaller marshaller = context.createMarshaller();
        try {
            ContentHandler contentHandler = serializer.asContentHandler();
            marshaller.setWriter(writer);
            marshaller.setContentHandler(contentHandler);
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            marshaller.marshal(obj);
        } catch (MarshalException e) {
            e.printStackTrace();
        } catch (ValidationException e) {
            e.printStackTrace();
        }
        String rql = writer.toString();

        log.debug("RQL-Input: " + rql);

        boolean test = true;
        int tryCounter = 0;

        while (test) {
            try {
                result = port.execute(rql, sErrorA, sResultInfoA);
                log.debug("RQL-Output: " + result);
                test = false;
            } catch (RemoteException e) {
                tryCounter++;
                if (tryCounter > 2)
                    test = false;
            }
        }

        try {
            Unmarshaller unmarshaller = new Unmarshaller(mapping);
            unmarshaller.setWhitespacePreserve(true);
            data = (IoData) unmarshaller.unmarshal(new StringReader(result));

        } catch (Exception e) {
            e.printStackTrace();
        }


        return data;
    }
}
