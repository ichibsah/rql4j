/**
 * RDCMSXMLServer.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package rql4j;

public interface RDCMSXMLServer extends javax.xml.rpc.Service {
    public java.lang.String getXmlServerSoapPortAddress();

    public rql4j.XmlServerSoapPort_PortType getXmlServerSoapPort() throws javax.xml.rpc.ServiceException;

    public rql4j.XmlServerSoapPort_PortType getXmlServerSoapPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
