package hotel.excute;

import java.rmi.RemoteException;
import java.util.UUID;

import com.google.gson.Gson;

import hotel.gen.cxf.Acknowledgement;
import hotel.gen.cxf.BusinessDataType;
import hotel.gen.cxf.GetBusinessDataInfoRQ;
import hotel.gen.cxf.HandlerSoap;

public class TestGetBusinessDataInfoRQ {

	public static void main(String[] args) throws RemoteException {
		HandlerSoap hs = CxfClient.getHandlerSoap();

		GetBusinessDataInfoRQ _processRequest_request = new GetBusinessDataInfoRQ();
		_processRequest_request.setDocumentDate("2017-05-17T01:13:00");
		String documentId = UUID.randomUUID().toString();
		_processRequest_request.setDocumentId(documentId);
		// _processRequest_request.setReceivedTime("2017-05-17T01:13:00");
		// _processRequest_request.setRequestMetaDataGuid(UUID.randomUUID().toString());
		String transactionId = UUID.randomUUID().toString();
		_processRequest_request.setTransactionId(transactionId);
		// _processRequest_request.setUserGuid(UUID.randomUUID().toString());

		_processRequest_request.setBusinessDataType(BusinessDataType.GENERAL);
		_processRequest_request.setExternalRfpId("Testing_Credentials");
		_processRequest_request.setNotificationId(50656166);
		_processRequest_request.setIncludeBusinessLockStatus(true);
		_processRequest_request.setSiteId(50000429);

		Acknowledgement acknowledgement = hs.processRequest(_processRequest_request);
		System.out.println(new Gson().toJson(acknowledgement));

	}
}
