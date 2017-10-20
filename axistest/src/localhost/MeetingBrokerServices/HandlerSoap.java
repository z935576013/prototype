/**
 * HandlerSoap.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package localhost.MeetingBrokerServices;

public interface HandlerSoap extends java.rmi.Remote {

    /**
     * This method processes a request. Each request received is cast
     * to the corresponding object and the process method implemented on
     * that object is called.
     */
    public localhost.MeetingBrokerServices.Acknowledgement processRequest(localhost.MeetingBrokerServices.Request request) throws java.rmi.RemoteException;
}
