
package hotel.excute;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import org.apache.axiom.om.OMAbstractFactory;
import org.apache.axiom.om.OMElement;
import org.apache.axiom.om.OMFactory;
import org.apache.axiom.om.OMNamespace;
import org.apache.axis2.AxisFault;
import org.apache.axis2.addressing.EndpointReference;
import org.apache.axis2.client.Options;
import org.apache.axis2.client.ServiceClient;
import org.apache.axis2.transport.http.HTTPConstants;
import org.apache.axis2.transport.http.impl.httpclient3.HttpTransportPropertiesImpl.Authenticator;
import org.apache.http.client.config.AuthSchemes;

public class Client03 {

	public static void main(String[] args) throws AxisFault {

		EndpointReference targetEPR = new EndpointReference(
				"https://release.meetingbroker.com/meetingbrokerservices/handler.asmx");
		Options options = new Options();
		options.setUserName("MerakReleaseChannel@Merak.com");
		options.setPassword("P@ssword!");

		Authenticator auth = new Authenticator();
		List<String> aList = new ArrayList<>();
		aList.add(AuthSchemes.BASIC);
		auth.setAuthSchemes(aList);
		auth.setUsername("MerakReleaseChannel@Merak.com");
		auth.setPassword("P@ssword!");
		auth.setPreemptiveAuthentication(true);
		options.setTransportInProtocol("https");
		options.setProperty(HTTPConstants.AUTHENTICATE, auth);
		// options.setProperty(HTTPConstants.HEADER_AUTHORIZATION, auth);

		options.setAction("http://localhost/MeetingBrokerServices/ProcessRequest");
		options.setTo(targetEPR);
		ServiceClient sender = new ServiceClient();
		sender.setOptions(options);
		OMFactory fac = OMAbstractFactory.getOMFactory();
		OMNamespace omNs = fac.createOMNamespace("http://localhost/MeetingBrokerServices", "ns1");
		OMElement method = fac.createOMElement("ProcessRequest", omNs);
		OMElement request = fac.createOMElement("request", omNs);//
		request.addAttribute("type", "ns1:GetProposalRQ", null);
		method.addChild(request);
		OMElement documentId = fac.createOMElement("DocumentId", omNs);//
		documentId.setText("1");
		request.addChild(documentId);
		OMElement transactionId = fac.createOMElement("TransactionId", omNs);//
		transactionId.setText("2");
		request.addChild(transactionId);
		OMElement documentDate = fac.createOMElement("DocumentDate", omNs);//
		documentDate.setText("2017-05-24T18:13:00");
		request.addChild(documentDate);
		OMElement proposalId = fac.createOMElement("ProposalId", omNs);//
		proposalId.setText("4");
		request.addChild(proposalId);
		OMElement notificationId = fac.createOMElement("NotificationId", omNs);//
		notificationId.setText("5");
		request.addChild(notificationId);

		method.build();
		System.out.println("method：" + method.toString());

		sender.addHeader(createHeaderOMElement());
		OMElement response = sender.sendReceive(method);
		System.out.println("response:" + response);
		OMElement elementReturn = response.getFirstElement().getFirstElement().getFirstElement();
		System.out.println(elementReturn.getText());
	}

	public static OMElement createHeaderOMElement() {

		OMFactory omFactory = OMAbstractFactory.getOMFactory();
		OMNamespace omNS = omFactory.createOMNamespace("http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-utility-1.0.xsd", "wsse");

		OMElement head = omFactory.createOMElement("Security", omNS);
		OMElement token = omFactory.createOMElement("UsernameToken", omNS);
		head.addChild(token);

		OMElement userName = omFactory.createOMElement("Username", omNS);
		userName.addChild(omFactory.createOMText(userName, "MerakReleaseChannel@Merak.com"));
		token.addChild(userName);

		OMElement password = omFactory.createOMElement("Password", omNS);
		password.addAttribute(omFactory.createOMAttribute("Type", null, "PasswordText"));
		password.addChild(omFactory.createOMText(password, "P@ssword!"));
		token.addChild(password);
		return head;
	}

}