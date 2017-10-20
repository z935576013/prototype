package hotel.excute;

import java.math.BigDecimal;
import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

import org.apache.cxf.binding.soap.saaj.SAAJOutInterceptor;
import org.apache.cxf.interceptor.LoggingInInterceptor;
import org.apache.cxf.interceptor.LoggingOutInterceptor;
import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;
import org.apache.cxf.ws.security.wss4j.WSS4JOutInterceptor;
import org.apache.wss4j.dom.WSConstants;
import org.apache.wss4j.dom.handler.WSHandlerConstants;

import com.google.gson.Gson;

import hotel.gen.cxf.Acknowledgement;
import hotel.gen.cxf.ArrayOfExternalRfp;
import hotel.gen.cxf.ArrayOfRoomRequirement;
import hotel.gen.cxf.ArrayOfSite;
import hotel.gen.cxf.ExternalRfp;
import hotel.gen.cxf.HandlerSoap;
import hotel.gen.cxf.MeetingInfo;
import hotel.gen.cxf.Message;
import hotel.gen.cxf.RoomBlock;
import hotel.gen.cxf.RoomRequirement;
import hotel.gen.cxf.RoomTypes;
import hotel.gen.cxf.SendRfpsRQ;
import hotel.gen.cxf.Site;

public class Test2 {

	public static void main(String[] args) throws RemoteException {

		// 以下和服务端配置类似，不对，应该说服务端和这里的安全验证配置一致
		Map<String, Object> outProps = new HashMap<String, Object>();
		outProps.put(WSHandlerConstants.ACTION, WSHandlerConstants.USERNAME_TOKEN);
		outProps.put(WSHandlerConstants.USER, "MerakReleaseChannel@Merak.com");
		outProps.put(WSHandlerConstants.PASSWORD_TYPE, WSConstants.PW_TEXT);
		// 指定在调用远程ws之前触发的回调函数WsClinetAuthHandler，其实类似于一个拦截器
		outProps.put(WSHandlerConstants.PW_CALLBACK_CLASS, ClientPasswordHandler.class.getName());
		ArrayList list = new ArrayList();
		// 添加cxf安全验证拦截器，必须
		list.add(new SAAJOutInterceptor());
		list.add(new WSS4JOutInterceptor(outProps));

		JaxWsProxyFactoryBean jwpfb = new JaxWsProxyFactoryBean();
		jwpfb.setServiceClass(HandlerSoap.class);
		jwpfb.getInInterceptors().add(new LoggingInInterceptor());
		jwpfb.getInFaultInterceptors().add(new LoggingOutInterceptor());
		jwpfb.setAddress("https://release.meetingbroker.com/meetingbrokerservices/handler.asmx");
		jwpfb.getOutInterceptors().addAll(list);
		HandlerSoap hw = (HandlerSoap) jwpfb.create();

		hotel.gen.cxf.SendRfpsRQ _processRequest_request = new SendRfpsRQ();
		_processRequest_request.setDocumentDate("2017-05-24T18:13:00");
		_processRequest_request.setDocumentId(UUID.randomUUID().toString());
		_processRequest_request.setReceivedTime("2017-05-24T18:13:00");
		_processRequest_request.setRequestMetaDataGuid(UUID.randomUUID().toString());
		_processRequest_request.setTransactionId(UUID.randomUUID().toString());
		_processRequest_request.setUserGuid(UUID.randomUUID().toString());

		ArrayOfExternalRfp externalRfps = new ArrayOfExternalRfp();
		ExternalRfp rfp = new ExternalRfp();
		rfp.setExternalRfpId("1");
		RoomBlock roomBlock=new RoomBlock();
		roomBlock.setBudgetedRoomRate(new BigDecimal(100));
		roomBlock.setStartDate("2017-05-24T18:13:00");
		
		ArrayOfRoomRequirement arrayOfRoomRequirement=new ArrayOfRoomRequirement();
		RoomRequirement roomRequirement=new RoomRequirement();
		roomRequirement.setDayNumber(40);
		roomRequirement.setDoubleQuantity(10);
		roomRequirement.setQuadQuantity(10);
		roomRequirement.setRoomType(RoomTypes.COMPLIMENTARY_DOUBLE_DOUBLE);
		roomRequirement.setSingleQuantity(10);
		roomRequirement.setTripleQuantity(10);
		arrayOfRoomRequirement.getRoomRequirement().add(roomRequirement);
		roomBlock.setRoomRequirements(arrayOfRoomRequirement);
		rfp.setRoomBlock(roomBlock);;
		
		ArrayOfSite sites=new ArrayOfSite();
		Site site=new Site();
		site.setSiteId(10);
		sites.getSite().add(site);
		rfp.setSites(sites);
		
		
		MeetingInfo meetingInfo=new MeetingInfo();
		meetingInfo.setMeetingName("test rfp");
		rfp.setMeetingInfo(meetingInfo);
		
		externalRfps.getExternalRfp().add(rfp);
		_processRequest_request.setExternalRfps(externalRfps);

		Message message = new Message();
		message.setTo("merakmeetingbroker@gmail.com");
		message.setFrom("MerakReleaseChannel@Merak.com");
		message.setSubject("test sub");
		message.setMeetingName("test rfp");
		message.setMarketingText("test setMarketingText");
		_processRequest_request.setMessage(message);
		Acknowledgement acknowledgement = hw.processRequest(_processRequest_request);
		System.out.println(new Gson().toJson(acknowledgement));

	}
}
