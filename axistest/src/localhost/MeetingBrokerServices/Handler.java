/**
 * Handler.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package localhost.MeetingBrokerServices;

public interface Handler extends javax.xml.rpc.Service {

/**
 * The MeetingBroker 3.0 Web Service
 */
    public java.lang.String getHandlerSoapAddress();

    public localhost.MeetingBrokerServices.HandlerSoap getHandlerSoap() throws javax.xml.rpc.ServiceException;

    public localhost.MeetingBrokerServices.HandlerSoap getHandlerSoap(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
