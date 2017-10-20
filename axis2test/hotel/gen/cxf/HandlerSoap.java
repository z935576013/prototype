package hotel.gen.cxf;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 3.1.11
 * 2017-05-16T13:20:59.937+08:00
 * Generated source version: 3.1.11
 * 
 */
@WebService(targetNamespace = "http://localhost/MeetingBrokerServices", name = "HandlerSoap")
@XmlSeeAlso({ObjectFactory.class})
public interface HandlerSoap {

    /**
     * This method processes a request. Each request received is cast to the corresponding object and the process method implemented on that object is called.
     */
    @WebResult(name = "ProcessRequestResult", targetNamespace = "http://localhost/MeetingBrokerServices")
    @RequestWrapper(localName = "ProcessRequest", targetNamespace = "http://localhost/MeetingBrokerServices", className = "hotel.gen.cxf.ProcessRequest")
    @WebMethod(operationName = "ProcessRequest", action = "http://localhost/MeetingBrokerServices/ProcessRequest")
    @ResponseWrapper(localName = "ProcessRequestResponse", targetNamespace = "http://localhost/MeetingBrokerServices", className = "hotel.gen.cxf.ProcessRequestResponse")
    public hotel.gen.cxf.Acknowledgement processRequest(
        @WebParam(name = "request", targetNamespace = "http://localhost/MeetingBrokerServices")
        hotel.gen.cxf.Request request
    );
}
