package hotel.excute;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import org.apache.cxf.binding.soap.interceptor.SoapInterceptor;
import org.apache.cxf.binding.soap.saaj.SAAJOutInterceptor;
import org.apache.cxf.interceptor.LoggingInInterceptor;
import org.apache.cxf.interceptor.LoggingOutInterceptor;
import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;
import org.apache.cxf.ws.security.wss4j.WSS4JOutInterceptor;
import org.apache.wss4j.dom.WSConstants;
import org.apache.wss4j.dom.handler.WSHandlerConstants;

import hotel.gen.cxf.HandlerSoap;

public class CxfClient {

	private static HandlerSoap hs = null;

	public static HandlerSoap getHandlerSoap() {
		if (hs == null) {
			synchronized (CxfClient.class) {
				if (hs == null) {
					Map<String, Object> outProps = new HashMap<String, Object>();
					outProps.put(WSHandlerConstants.ACTION, WSHandlerConstants.USERNAME_TOKEN);
					outProps.put(WSHandlerConstants.USER, "MerakReleaseChannel@Merak.com");
					outProps.put(WSHandlerConstants.PASSWORD_TYPE, WSConstants.PW_TEXT);
					outProps.put(WSHandlerConstants.PW_CALLBACK_CLASS, ClientPasswordHandler.class.getName());
					ArrayList<SoapInterceptor> list = new ArrayList<>();
					// 添加cxf安全验证拦截器，必须
					list.add(new SAAJOutInterceptor());
					list.add(new WSS4JOutInterceptor(outProps));

					JaxWsProxyFactoryBean jwpfb = new JaxWsProxyFactoryBean();
					jwpfb.setServiceClass(HandlerSoap.class);
					jwpfb.getInInterceptors().add(new LoggingInInterceptor());
					jwpfb.getInFaultInterceptors().add(new LoggingOutInterceptor());
					jwpfb.setAddress("https://release.meetingbroker.com/meetingbrokerservices/handler.asmx");
					jwpfb.getOutInterceptors().addAll(list);
					hs = (HandlerSoap) jwpfb.create();
				}
			}
		}
		return hs;
	}

}
