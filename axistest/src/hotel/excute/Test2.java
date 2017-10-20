package hotel.excute;

import java.net.MalformedURLException;
import java.net.URL;
import java.rmi.RemoteException;
import java.util.Calendar;

import com.google.gson.Gson;

import localhost.MeetingBrokerServices.Acknowledgement;
import localhost.MeetingBrokerServices.GetProposalRQ;
import localhost.MeetingBrokerServices.HandlerSoapStub;
import localhost.MeetingBrokerServices.ProcessRequest;

public class Test2 {

	public static void main(String[] args) throws RemoteException, MalformedURLException {
		String url = "https://release.meetingbroker.com/meetingbrokerservices/handler.asmx";
		HandlerSoapStub stub = new HandlerSoapStub(new URL(url),null);
		stub.setUsername("MerakReleaseChannel@Merak.com");
		stub.setPassword("P@ssword!");
		ProcessRequest processRequest = new ProcessRequest();
		GetProposalRQ param = new GetProposalRQ();
		param.setDocumentDate(Calendar.getInstance());
		processRequest.setRequest(param);
		Acknowledgement acknowledgement = stub.processRequest(param);
		System.out.println(new Gson().toJson(acknowledgement));

	}
}
