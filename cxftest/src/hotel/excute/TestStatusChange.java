package hotel.excute;

import java.rmi.RemoteException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;

import com.google.gson.Gson;

import hotel.gen.cxf.Acknowledgement;
import hotel.gen.cxf.ArrayOfSite;
import hotel.gen.cxf.HandlerSoap;
import hotel.gen.cxf.ProposalStatus;
import hotel.gen.cxf.Site;
import hotel.gen.cxf.StatusChange;

public class TestStatusChange {

	public static void main(String[] args) throws RemoteException {
		HandlerSoap hs = CxfClient.getHandlerSoap();

		String externalRfpId = "13";
		Integer siteId = 50000429;

		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss");
		StatusChange _processRequest_request = new StatusChange();
		_processRequest_request.setDocumentDate(sdf.format(new Date()));
		String documentId = UUID.randomUUID().toString();
		_processRequest_request.setDocumentId(documentId);
		String transactionId = UUID.randomUUID().toString();
		_processRequest_request.setTransactionId(transactionId);

		_processRequest_request.setRfpId(externalRfpId);

		ArrayOfSite sites = new ArrayOfSite();
		Site site = new Site();
		site.setSiteId(siteId);
		sites.getSite().add(site);
		_processRequest_request.setSites(sites);

		_processRequest_request.setStartDate("2017-05-24T18:13:00");
		_processRequest_request.setStatus(ProposalStatus.SELF_AWARDED);

		Acknowledgement acknowledgement = hs.processRequest(_processRequest_request);
		System.out.println(new Gson().toJson(acknowledgement));

	}
}
