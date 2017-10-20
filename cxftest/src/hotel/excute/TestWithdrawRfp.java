package hotel.excute;

import java.rmi.RemoteException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;

import com.google.gson.Gson;

import hotel.gen.cxf.Acknowledgement;
import hotel.gen.cxf.HandlerSoap;
import hotel.gen.cxf.WithdrawRfpRQ;

public class TestWithdrawRfp {

	public static void main(String[] args) throws RemoteException {
		HandlerSoap hs = CxfClient.getHandlerSoap();

		String externalRfpId = "10";
		Integer siteId = 50000429;

		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss");
		WithdrawRfpRQ _processRequest_request = new WithdrawRfpRQ();
		_processRequest_request.setDocumentDate(sdf.format(new Date()));
		String documentId = UUID.randomUUID().toString();
		_processRequest_request.setDocumentId(documentId);
		String transactionId = UUID.randomUUID().toString();
		_processRequest_request.setTransactionId(transactionId);

		_processRequest_request.setRfpId(externalRfpId);
		_processRequest_request.setSiteId(siteId);
		_processRequest_request.setSecondaryExternalRfpId(externalRfpId);
		_processRequest_request.setAutoTurnDownBusiness(true);
		_processRequest_request.setLostToCity("南京");
		_processRequest_request.setLostToHotel("香格里拉");
		_processRequest_request.setExternalLostBusinessReason("其他");

		Acknowledgement acknowledgement = hs.processRequest(_processRequest_request);
		System.out.println(new Gson().toJson(acknowledgement));

	}
}
