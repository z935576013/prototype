/**
 * HandlerLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package localhost.MeetingBrokerServices;

public class HandlerLocator extends org.apache.axis.client.Service implements localhost.MeetingBrokerServices.Handler {

/**
 * The MeetingBroker 3.0 Web Service
 */

    public HandlerLocator() {
    }


    public HandlerLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public HandlerLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for HandlerSoap
    private java.lang.String HandlerSoap_address = "https://release.meetingbroker.com/meetingbrokerservices/handler.asmx";

    public java.lang.String getHandlerSoapAddress() {
        return HandlerSoap_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String HandlerSoapWSDDServiceName = "HandlerSoap";

    public java.lang.String getHandlerSoapWSDDServiceName() {
        return HandlerSoapWSDDServiceName;
    }

    public void setHandlerSoapWSDDServiceName(java.lang.String name) {
        HandlerSoapWSDDServiceName = name;
    }

    public localhost.MeetingBrokerServices.HandlerSoap getHandlerSoap() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(HandlerSoap_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getHandlerSoap(endpoint);
    }

    public localhost.MeetingBrokerServices.HandlerSoap getHandlerSoap(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            localhost.MeetingBrokerServices.HandlerSoapStub _stub = new localhost.MeetingBrokerServices.HandlerSoapStub(portAddress, this);
            _stub.setPortName(getHandlerSoapWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setHandlerSoapEndpointAddress(java.lang.String address) {
        HandlerSoap_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (localhost.MeetingBrokerServices.HandlerSoap.class.isAssignableFrom(serviceEndpointInterface)) {
                localhost.MeetingBrokerServices.HandlerSoapStub _stub = new localhost.MeetingBrokerServices.HandlerSoapStub(new java.net.URL(HandlerSoap_address), this);
                _stub.setPortName(getHandlerSoapWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("HandlerSoap".equals(inputPortName)) {
            return getHandlerSoap();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "Handler");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "HandlerSoap"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("HandlerSoap".equals(portName)) {
            setHandlerSoapEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
