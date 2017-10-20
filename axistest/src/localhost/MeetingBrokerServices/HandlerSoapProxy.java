package localhost.MeetingBrokerServices;

public class HandlerSoapProxy implements localhost.MeetingBrokerServices.HandlerSoap {
  private String _endpoint = null;
  private localhost.MeetingBrokerServices.HandlerSoap handlerSoap = null;
  
  public HandlerSoapProxy() {
    _initHandlerSoapProxy();
  }
  
  public HandlerSoapProxy(String endpoint) {
    _endpoint = endpoint;
    _initHandlerSoapProxy();
  }
  
  private void _initHandlerSoapProxy() {
    try {
      handlerSoap = (new localhost.MeetingBrokerServices.HandlerLocator()).getHandlerSoap();
      if (handlerSoap != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)handlerSoap)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)handlerSoap)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (handlerSoap != null)
      ((javax.xml.rpc.Stub)handlerSoap)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public localhost.MeetingBrokerServices.HandlerSoap getHandlerSoap() {
    if (handlerSoap == null)
      _initHandlerSoapProxy();
    return handlerSoap;
  }
  
  public localhost.MeetingBrokerServices.Acknowledgement processRequest(localhost.MeetingBrokerServices.Request request) throws java.rmi.RemoteException{
    if (handlerSoap == null)
      _initHandlerSoapProxy();
    return handlerSoap.processRequest(request);
  }
  
  
}