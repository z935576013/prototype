package hotel.excute;

import java.rmi.RemoteException;
import java.util.UUID;

import com.google.gson.Gson;

import hotel.gen.cxf.Acknowledgement;
import hotel.gen.cxf.GetNotificationsRQ;
import hotel.gen.cxf.HandlerSoap;
import hotel.gen.cxf.NotifierEventType;

public class TestGetNotificationRQ {

	public static void main(String[] args) throws RemoteException {
		HandlerSoap hs = CxfClient.getHandlerSoap();

		GetNotificationsRQ _processRequest_request = new GetNotificationsRQ();
		_processRequest_request.setDocumentDate("2017-05-17T01:13:00");
		_processRequest_request.setDocumentId(UUID.randomUUID().toString());
		_processRequest_request.setReceivedTime("2017-05-17T01:13:00");
		_processRequest_request.setRequestMetaDataGuid(UUID.randomUUID().toString());
		_processRequest_request.setTransactionId(UUID.randomUUID().toString());
		_processRequest_request.setUserGuid(UUID.randomUUID().toString());

		_processRequest_request.setEventType(NotifierEventType.PROPOSAL_SENT);

		Acknowledgement acknowledgement = hs.processRequest(_processRequest_request);
		System.out.println(new Gson().toJson(acknowledgement));

	}
}
