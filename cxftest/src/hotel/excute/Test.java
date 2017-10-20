package hotel.excute;

import java.rmi.RemoteException;
import java.util.Map;

import javax.xml.ws.BindingProvider;

import hotel.gen.cxf.Handler;
import hotel.gen.cxf.HandlerSoap;
import hotel.gen.cxf.SendRfpsRQ;

public class Test {

	public static void main(String[] args) throws RemoteException {
		
		
		System.setProperty("javax.xml.bind.JAXBContext", "com.sun.xml.internal.bind.v2.ContextFactory");
		Handler ss = new Handler();
		HandlerSoap port = ss.getHandlerSoap();
		
		  // 设置访问接口服务器的用户名和密码  
        BindingProvider bp = (BindingProvider) port;  
        Map<String, Object> context = bp.getRequestContext();  
        context.put(BindingProvider.USERNAME_PROPERTY, "MerakReleaseChannel@Merak.com");  
        context.put(BindingProvider.PASSWORD_PROPERTY, "P@ssword!");  
		
		System.out.println("Invoking processRequest...");
		hotel.gen.cxf.SendRfpsRQ _processRequest_request = new SendRfpsRQ();
		_processRequest_request.setDocumentDate("2017-05-24T18:13:00");
		_processRequest_request.setDocumentId("1");
		_processRequest_request.setReceivedTime("2017-05-24T18:13:00");
		_processRequest_request.setRequestMetaDataGuid("5");
		_processRequest_request.setTransactionId("6");
		_processRequest_request.setUserGuid("7");
		
		hotel.gen.cxf.Acknowledgement _processRequest__return = port.processRequest(_processRequest_request);
		System.out.println("processRequest.result=" + _processRequest__return);
		
	}
}
