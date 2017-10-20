package hotel.excute;

import java.math.BigDecimal;
import java.rmi.RemoteException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;

import com.google.gson.Gson;

import hotel.gen.cxf.Acknowledgement;
import hotel.gen.cxf.ArrayOfEventRequirement;
import hotel.gen.cxf.ArrayOfExternalRfp;
import hotel.gen.cxf.ArrayOfRoomRequirement;
import hotel.gen.cxf.ArrayOfSite;
import hotel.gen.cxf.Contact;
import hotel.gen.cxf.EventBlock;
import hotel.gen.cxf.EventRequirement;
import hotel.gen.cxf.ExternalRfp;
import hotel.gen.cxf.HandlerSoap;
import hotel.gen.cxf.MeetingInfo;
import hotel.gen.cxf.Profile;
import hotel.gen.cxf.RoomBlock;
import hotel.gen.cxf.RoomRequirement;
import hotel.gen.cxf.RoomTypes;
import hotel.gen.cxf.SendRfpsRQ;
import hotel.gen.cxf.Site;

public class TestSendRfpsRQ {

	public static void main(String[] args) throws RemoteException {
		HandlerSoap hs = CxfClient.getHandlerSoap();

		String externalRfpId = "13";
		Integer siteId = 50000429;
		BigDecimal budgetedRoomRate = new BigDecimal(1000);
		BigDecimal totalEventBudget = new BigDecimal(5000);
		BigDecimal totalBudget = new BigDecimal(15000);
		String roomStartDate = "2017-06-24T00:00:00";
		String eventStartDate = "2017-06-25T00:00:00";
		Integer attendeeQuantity = 100;
		String respondByDate = "2017-06-20T00:00:00";

		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss");
		SendRfpsRQ _processRequest_request = new SendRfpsRQ();
		_processRequest_request.setDocumentDate(sdf.format(new Date()));
		String documentId = UUID.randomUUID().toString();
		_processRequest_request.setDocumentId(documentId);
		String transactionId = UUID.randomUUID().toString();
		_processRequest_request.setTransactionId(transactionId);

		ArrayOfExternalRfp externalRfps = new ArrayOfExternalRfp();

		ExternalRfp rfp = new ExternalRfp();
		rfp.setExternalRfpId(externalRfpId);
		RoomBlock roomBlock = new RoomBlock();
		roomBlock.setBudgetedRoomRate(budgetedRoomRate);
		roomBlock.setStartDate(roomStartDate);

		ArrayOfRoomRequirement arrayOfRoomRequirement = new ArrayOfRoomRequirement();
		RoomRequirement roomRequirement = new RoomRequirement();
		roomRequirement.setDayNumber(1);
		roomRequirement.setDoubleQuantity(1);
		roomRequirement.setQuadQuantity(1);
		roomRequirement.setSingleQuantity(1);
		roomRequirement.setTripleQuantity(1);
		roomRequirement.setRoomType(RoomTypes.DOUBLE_DOUBLE);
		arrayOfRoomRequirement.getRoomRequirement().add(roomRequirement);
		RoomRequirement roomRequirement2 = new RoomRequirement();
		roomRequirement2.setDayNumber(2);
		roomRequirement2.setDoubleQuantity(2);
		roomRequirement2.setQuadQuantity(2);
		roomRequirement2.setSingleQuantity(2);
		roomRequirement2.setTripleQuantity(2);
		roomRequirement2.setRoomType(RoomTypes.RUN_OF_HOUSE);
		arrayOfRoomRequirement.getRoomRequirement().add(roomRequirement2);
		RoomRequirement roomRequirement3 = new RoomRequirement();
		roomRequirement3.setDayNumber(2);
		roomRequirement3.setDoubleQuantity(3);
		roomRequirement3.setQuadQuantity(3);
		roomRequirement3.setSingleQuantity(3);
		roomRequirement3.setTripleQuantity(3);
		roomRequirement3.setRoomType(RoomTypes.DOUBLE_DOUBLE);
		arrayOfRoomRequirement.getRoomRequirement().add(roomRequirement3);
		roomBlock.setRoomRequirements(arrayOfRoomRequirement);
		// TODO Availability
		// ArrayOfRoomAvailability arrayOfRoomAvailability = new
		// ArrayOfRoomAvailability();
		// RoomAvailability roomAvailability = new RoomAvailability();
		// roomAvailability.setDayNumber(1);
		// roomAvailability.setDoublesAvailable(1);
		// roomAvailability.setDoubleRate(new BigDecimal(100));
		// roomAvailability.setRoomType(RoomTypes.DOUBLE_DOUBLE);
		// arrayOfRoomAvailability.getRoomAvailability().add(roomAvailability);
		// roomBlock.setRoomAvailabilities(arrayOfRoomAvailability);

		rfp.setRoomBlock(roomBlock);

		EventBlock eventBlock = new EventBlock();
		eventBlock.setStartDate(eventStartDate);
		eventBlock.setTotalEventBudget(totalEventBudget);
		ArrayOfEventRequirement reqList = new ArrayOfEventRequirement();
		EventRequirement req = new EventRequirement();
		req.setAttendeeQuantity(10);
		req.setComments("commentEventRequirement1");
		req.setDayNumber(1);
		req.setEndTime("06:00");
		req.setRoomSize(100);
		req.setStartTime("05:00");
		reqList.getEventRequirement().add(req);
		EventRequirement req2 = new EventRequirement();
		req2.setAttendeeQuantity(20);
		req2.setComments("commentEventRequirement2");
		req2.setDayNumber(2);
		req2.setEndTime("08:00");
		req2.setRoomSize(200);
		req2.setStartTime("07:00");
		reqList.getEventRequirement().add(req2);
		// TODO Availability
		// ArrayOfEventAvailability arrayOfEventAvailability = new
		// ArrayOfEventAvailability();
		// EventAvailability eventAvailability = new EventAvailability();
		// eventAvailability.setAttendeeQuantity(10);
		// eventAvailability.setDayNumber(1);
		// eventAvailability.setEndTime("06:00");
		// eventAvailability.setRoomSize(100);
		// eventAvailability.setStartTime("05:00");
		// arrayOfEventAvailability.getEventAvailability().add(eventAvailability);
		// eventBlock.setEventAvailabilities(arrayOfEventAvailability);
		// eventBlock.setFoodCost(new BigDecimal(1000));
		// eventBlock.setBeverageCost(new BigDecimal(1000));
		// eventBlock.setRentalCost(new BigDecimal(1000));
		// eventBlock.setResourceCost(new BigDecimal(1000));
		// eventBlock.setOtherCost(new BigDecimal(1000));
		eventBlock.setEventRequirements(reqList);
		eventBlock.setFoodBudget(new BigDecimal(1000));
		eventBlock.setBeverageBudget(new BigDecimal(1000));
		eventBlock.setRentalBudget(new BigDecimal(1000));
		eventBlock.setResourceBudget(new BigDecimal(1000));
		eventBlock.setOtherBudget(new BigDecimal(1000));
		rfp.setEventBlock(eventBlock);

		MeetingInfo meetingInfo = new MeetingInfo();
		meetingInfo.setMeetingName("testrfp" + externalRfpId);
		meetingInfo.setTotalBudget(totalBudget);
		meetingInfo.setStartDate(eventStartDate);
		meetingInfo.setRespondByDate(respondByDate);
		meetingInfo.setAlternateStartDate1(eventStartDate);
		meetingInfo.setAlternateStartDate2(eventStartDate);
		meetingInfo.setNumberOfEvents(2);
		meetingInfo.setNumberOfNights(2);
		meetingInfo.setNumberOfAttendeesAtLargestEvent(attendeeQuantity);
		meetingInfo.setPeakRooms(12);
		Profile companyProfile = new Profile();
		companyProfile.setCompanyName("苏宁");
		Contact contact = new Contact();
		contact.setFirstName("朱");
		contact.setLastName("呵呵");
		contact.setPhoneNumber("1231321321");
		contact.setEmail("93421321@qq.com");
		companyProfile.setContact(contact);
		meetingInfo.setCompanyProfile(companyProfile);
		rfp.setMeetingInfo(meetingInfo);

		ArrayOfSite sites = new ArrayOfSite();
		Site site = new Site();
		site.setSiteId(siteId);
		site.setAllowsRedirect(false);
		sites.getSite().add(site);
		rfp.setSites(sites);

		externalRfps.getExternalRfp().add(rfp);
		_processRequest_request.setExternalRfps(externalRfps);

		Acknowledgement acknowledgement = hs.processRequest(_processRequest_request);
		System.out.println(new Gson().toJson(acknowledgement));

	}
}
