//package hotel;
//
//import java.math.BigDecimal;
//import java.sql.Connection;
//import java.sql.ResultSet;
//import java.sql.Statement;
//import java.util.Date;
//import java.util.List;
//
//import javax.annotation.Resource;
//import javax.sql.DataSource;
//
//import org.apache.commons.lang3.StringUtils;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.jdbc.datasource.DataSourceUtils;
//import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//import com.sdx.merak.common.dal.DalClient;
//import com.sdx.merak.service.intf.book.EventService;
//import com.sdx.merak.service.intf.hotel.DictionaryService;
//import com.sdx.merak.service.intf.hotel.HotelFacilitiesService;
//import com.sdx.merak.service.intf.hotel.HotelGuestRoomService;
//import com.sdx.merak.service.intf.hotel.HotelMeetingRoomService;
//import com.sdx.merak.service.intf.hotel.HotelMerakTypeService;
//import com.sdx.merak.service.intf.hotel.MerakHotelService;
//import com.sdx.merak.service.intf.hotel.constants.FacilitiesConstants;
//import com.sdx.merak.service.intf.hotel.dto.MerakGuestRoomTypeDto;
//import com.sdx.merak.service.intf.hotel.dto.MerakHotel;
//import com.sdx.merak.service.intf.hotel.dto.MerakHotelActFacilities;
//import com.sdx.merak.service.intf.hotel.dto.MerakHotelDetail;
//import com.sdx.merak.service.intf.hotel.dto.MerakHotelOtherFacilitie;
//import com.sdx.merak.service.intf.hotel.dto.MerakHotelRestaFacilities;
//import com.sdx.merak.service.intf.hotel.dto.MerakMeetingRoomDetail;
//import com.sdx.merak.service.intf.hotel.po.MerakHotelMerakType;
//
//@RestController
//@RequestMapping(value = "hotelMerak", produces = "application/json; charset=UTF-8")
//public class HotelTestMerakController2 {
//
//	private String countryCode = "_gbr";
//	private String country = "英国";
//
//	@Autowired
//	ThreadPoolTaskExecutor taskExecutor;
//
//	@Autowired
//	DictionaryService dictionaryService;
//
//	@Resource
//	private DataSource ds01;
//
//	@Autowired
//	DalClient dalClient;
//
//	@Autowired
//	EventService eventService;
//
//	@Autowired
//	MerakHotelService merakHotelService;
//
//	@Autowired
//	HotelMerakTypeService hotelMerakTypeService;
//
//	@Autowired
//	HotelGuestRoomService hotelGuestRoomService;
//
//	@Autowired
//	HotelMeetingRoomService meetingRoomService;
//
//	@Autowired
//	HotelFacilitiesService hotelFacilitiesService;
//
//	@RequestMapping("/analysis")
//	public String analysis(String countryCode) {
//		if (StringUtils.isNotEmpty(countryCode)) {
//			this.countryCode = countryCode;
//		}
//		Long startHotelId = 0L;
//		Long endHotelId = 4000L;
//		Long gap = (endHotelId - startHotelId) / 20;
//		// long i = 0;
//		for (long i = 0; i <= gap; i++) {
//			taskExecutor.execute(new MerakAnalysisTask(startHotelId + i * 20));
//		}
//
//		// taskExecutor.execute(new MerakAnalysisTask(0L));
//		return "ok";
//	}
//
//	@RequestMapping("/analysis4")
//	public String analysis4(String countryCode) {
//		if (StringUtils.isNotEmpty(countryCode)) {
//			this.countryCode = countryCode;
//		}
//		Long gap = 100L;
//		for (long i = 0; i <= gap; i++) {
//			taskExecutor.execute(new MerakAnalysisTask4(0 + 200 * i));
//		}
//		return "ok";
//	}
//
//	class MerakAnalysisTask implements Runnable {
//
//		Long startHotelId = null;
//
//		MerakAnalysisTask(Long startHotelId) {
//			this.startHotelId = startHotelId;
//		}
//
//		@Override
//		public void run() {
//			Connection con = null;
//			Long merakHotelId = null;
//			try {
//				con = DataSourceUtils.getConnection(ds01);
//				Statement stmt = con.createStatement();
//				String query = "select hotel_id from Booking_hotel" + countryCode + " b where "
//						+ "not EXISTS ( select 1 from merak_hotel_language  l where country='" + country
//						+ "' and  b.hotel_name=l.hotel_name )" + "limit " + startHotelId + "," + "100";
//				ResultSet rs = stmt.executeQuery(query);
//				while (rs.next()) {
//					String hotelId = rs.getString(1);
//					stmt = con.createStatement();
//					query = "select * from Booking_hotel" + countryCode + " where hotel_id='" + hotelId + "'";
//					ResultSet rsBooking = stmt.executeQuery(query);
//					rsBooking.next();
//					String hotelName = rsBooking.getString(2);
//					hotelName = hotelName.replaceAll("'", "");
//					String hotelNameEn = rsBooking.getString(3);
//					hotelNameEn = hotelNameEn.replaceAll("'", "");
//					Integer star = rsBooking.getInt(4);
//					String hotelAddress = rsBooking.getString(5);
//					String facilities = rsBooking.getString(6);
//					String hotelAddressEn = rsBooking.getString(8);
//					int wifi = rsBooking.getInt(9);
//					int car = rsBooking.getInt(10);
//					String creditcard = rsBooking.getString(12);
//					String poiList = rsBooking.getString(13);
//					Integer totalGuest = rsBooking.getInt(14);
//					Integer gusetNum = 0;
//
//					query = "select hotel_name from merak_hotel_language  where country='" + country
//						+ "' and hotel_name='" + hotelName + "'";
//					stmt = con.createStatement();
//					if (stmt.executeQuery(query).next()) {
//						continue;
//					}
//					String country = "";
//					if (hotelId.startsWith("us")) {
//						country = "美国";
//					} else if (hotelId.startsWith("au")) {
//						country = "澳大利亚";
//					} else if (hotelId.startsWith("gb")) {
//						country = "英国";
//					} else if (hotelId.startsWith("de")) {
//						country = "德国";
//					} else if (hotelId.startsWith("in")) {
//						country = "印度";
//					} else if (hotelId.startsWith("sg")) {
//						country = "新加坡";
//					} else {
//						continue;
//					}
//					String[] poi = poiList.split(",");
//					String lat = poi[0];
//					String lot = poi[1];
//
//					ResultSet meetingRs = null;
//					ResultSet guestRs = null;
//
//					String guestQuery = "select * from booking_hotel_guest" + countryCode + " where guest_id like '"
//							+ hotelId + "\\_%'";
//					stmt = con.createStatement();
//					guestRs = stmt.executeQuery(guestQuery);
//
//					String guestCountQuery = "select count(1) from booking_hotel_guest" + countryCode
//							+ " where guest_id like '" + hotelId + "\\_%'";
//					stmt = con.createStatement();
//					ResultSet guestCountRs = stmt.executeQuery(guestCountQuery);
//					guestCountRs.next();
//					Integer gestCount = guestCountRs.getInt(1);
//					if (gestCount != null && gestCount > 0) {
//						gusetNum = totalGuest / gestCount;
//					}
//					if (gusetNum == 0) {
//						gusetNum = 1;
//					}
//
//					String cventHotelId = null;
//					String brand = "";
//					String cventQuery = "select * from cvent_hotel" + countryCode + " e where hotel_name='"
//							+ hotelNameEn + "'";
//					stmt = con.createStatement();
//					ResultSet cventRs = stmt.executeQuery(cventQuery);
//					if (cventRs.next()) {
//						cventHotelId = cventRs.getString(1);
//						brand = cventRs.getString(5);
//						String cventMeetingQuery = "select * from cvent_hotel_meeting" + countryCode
//								+ " where meeting_id like '" + cventHotelId + "\\_%'";
//						stmt = con.createStatement();
//						meetingRs = stmt.executeQuery(cventMeetingQuery);
//					}
//
//					MerakHotelDetail merakHotel = new MerakHotelDetail();
//					merakHotel.setLot(Float.valueOf(lot));
//					merakHotel.setLat(Float.valueOf(lat));
//					merakHotel.setCountry(country);
//					merakHotel.setStar(star);
//					merakHotel.setMerakRate(star.floatValue());
//					merakHotel.setDelFlag("0");
//					merakHotel.setCreateTime(new Date());
//					merakHotel.setCreateUser(0L);
//					merakHotel.setLobbyTable(3);
//					merakHotel.setLobbyLogo(3);
//					merakHotel.setTotalRoom(0);
//					merakHotel.setTotalFloor(1);
//					merakHotel.setNote("test0317booking");
//					merakHotel.setHotelName(hotelName);
//					merakHotel.setHotelNameEn(hotelNameEn);
//					merakHotel.setAddress(hotelAddress);
//					merakHotel.setAddressEn(hotelAddress);
//					merakHotel.setIndBrandName(brand);
//					merakHotel.setIndBrandNameEn(brand);
//					merakHotel.setMatchingStatus(1);
//					merakHotelId = merakHotelService.update(merakHotel);
//
//					List<MerakHotelMerakType> merakTypeList = hotelMerakTypeService.getMerkListByHotelId(merakHotelId);
//					Long merakType = merakTypeList.get(0).getId();
//					for (MerakHotelMerakType merakHotelMerakType : merakTypeList) {
//						if (merakHotelMerakType.getMerakType().equals("standard")) {
//							merakType = merakHotelMerakType.getId();
//						}
//					}
//
//					while (guestRs != null && guestRs.next()) {
//
//						String guestName = guestRs.getString(3);
//						String note = guestRs.getString(4);
//						Double area = guestRs.getDouble(5);
//						String sheshi = guestRs.getString(6);
//						String guestNameEn = guestRs.getString(7);
//						note = sheshi;
//						MerakGuestRoomTypeDto room = new MerakGuestRoomTypeDto();
//						room.setArea(area.floatValue());
//						room.setHotelId(merakHotelId);
//						room.setMerakType(merakType);
//						room.setDelFlag(0);
//						room.setRoomTypeNum(gusetNum);
//						room.setBigBedNum(0);
//						room.setDoubleBedNum(0);
//						room.setChangeNum(gusetNum);
//						room.setFloor("1");
//						room.setIsReserve(1);
//						room.setCreateTime(new Date());
//						room.setCreateUser(0L);
//						room.setNote(note);
//						room.setRoomTypeName(guestName);
//						room.setRoomTypeNameEn(guestNameEn);
//						room.setScenery(setGuestScenery(note));
//						hotelGuestRoomService.updateGuestRoom(room);
//					}
//
//					while (meetingRs != null && meetingRs.next()) {
//						String meetingName = meetingRs.getString(3);
//
//						Double meetingSize = meetingRs.getDouble(4);
//						String meetingChang = meetingRs.getString(5);
//						String meetingKuan = meetingRs.getString(6);
//						String meetingGao = meetingRs.getString(7);
//
//						MerakMeetingRoomDetail meeting = new MerakMeetingRoomDetail();
//
//						meeting.setHotelId(merakHotelId);
//						meeting.setRoomType("meetingroom");
//						meeting.setIsReserve(1);
//						meeting.setArea(new BigDecimal(meetingSize).setScale(0, BigDecimal.ROUND_HALF_UP).toString());
//						meeting.setNoObstacleCeiling("0");
//						meeting.setHalfSuggestRate("0");
//						if (StringUtils.isNotEmpty(meetingGao)) {
//							meeting.setCeiling(
//									new BigDecimal(meetingGao).setScale(1, BigDecimal.ROUND_HALF_UP).toString());
//							meeting.setNoObstacleCeiling(meetingGao);
//						}
//
//						meeting.setCreateTime(new Date());
//						meeting.setCreateUser(0L);
//						meeting.setDelFlag(0);
//						meeting.setFloor("1");
//						meeting.setRoomName(meetingName);
//						meeting.setRoomNameEn(meetingName);
//						if (StringUtils.isNotEmpty(meetingChang) && StringUtils.isNotEmpty(meetingKuan)) {
//							String dimensions = new BigDecimal(meetingChang).setScale(1, BigDecimal.ROUND_HALF_UP)
//									.toString() + "*"
//									+ new BigDecimal(meetingKuan).setScale(1, BigDecimal.ROUND_HALF_UP).toString();
//							meeting.setDimensions(dimensions);
//						}
//
//						saveMeetingSetting(meeting, Double.valueOf(meeting.getArea()));
//
//						meetingRoomService.updateMeetingRoom(merakHotelId, meeting);
//					}
//
//					hotelGuestRoomService.updateMerakType(merakHotelId, merakType);
//
//					Float lastarea = meetingRoomService.getLastMeetingRoomArea(merakHotelId);
//					Integer meetingRoomNum = meetingRoomService.getMeetingRoomNum(merakHotelId);
//					Integer totleRoomTypeNum = hotelGuestRoomService.getTotleRoomTypeNum(merakHotelId);
//					// 更新会议室总数到酒店表
//					MerakHotel newmerakHotel = new MerakHotel();
//					newmerakHotel.setTotalRoom(totleRoomTypeNum);
//					merakHotel.setLargestMeetingRoom(lastarea);
//					merakHotel.setHotelId(merakHotelId);
//					merakHotel.setTotalMeetingRoom(meetingRoomNum);
//					merakHotelService.updateSumHotel(merakHotel);
//
//					saveSheshi(facilities, merakHotelId, wifi, car, creditcard);
//					//
//					// PreparedStatement inst = con
//					// .prepareStatement("update Booking_HOTEL"+countryCode+"
//					// set merak_hotel_id=? where hotel_id=?");
//					// inst.setLong(1, merakHotelId);
//					// inst.setString(2, hotelId);
//					// inst.execute();
//				}
//			} catch (Exception e) {
//				e.printStackTrace();
//			} finally {
//				DataSourceUtils.releaseConnection(con, ds01);
//			}
//		}
//	}
//
//	class MerakAnalysisTask4 implements Runnable {
//
//		Long startHotelId = null;
//
//		MerakAnalysisTask4(Long startHotelId) {
//			this.startHotelId = startHotelId;
//		}
//
//		@Override
//		public void run() {
//			Connection con = null;
//			String hotelId = "";
//			try {
//				con = DataSourceUtils.getConnection(ds01);
//				Statement stmt = con.createStatement();
//				String query = "select hotel_id from cvent_hotel" + countryCode
//						+ " b where country is not null and not EXISTS "
//						+ "( select 1 from merak_hotel_language  l where country='" + country
//						+ "' and b.hotel_name=l.hotel_name )" + "limit "
//						+ startHotelId + "," + "200";
//				ResultSet rs = stmt.executeQuery(query);
//				while (rs.next()) {
//					hotelId = rs.getString(1);
//					stmt = con.createStatement();
//					query = "select * from cvent_hotel" + countryCode + " where  country is not null and hotel_id='"
//							+ hotelId + "'";
//					ResultSet rsCvent = stmt.executeQuery(query);
//					rsCvent.next();
//					String cventHotelId = rsCvent.getString(1);
//					String hotelName = rsCvent.getString(2);
//					String brand = rsCvent.getString(5);
//					String country = rsCvent.getString(9);
//					String address = rsCvent.getString(10);
//					Long merakHotelId = null;
//					hotelName = hotelName.replaceAll("'", "");
//
//					query = "select hotel_name from merak_hotel_language  where country='" + country
//						+ "' and hotel_name='" + hotelName + "'";
//					stmt = con.createStatement();
//					if (stmt.executeQuery(query).next()) {
//						continue;
//					}
//
//					MerakHotelDetail merakHotel = new MerakHotelDetail();
//					merakHotel.setCountry(country);
//					merakHotel.setStar(0);
//					merakHotel.setMerakRate(0f);
//					merakHotel.setDelFlag("1");
//					merakHotel.setCreateTime(new Date());
//					merakHotel.setCreateUser(0L);
//					merakHotel.setLobbyTable(3);
//					merakHotel.setLobbyLogo(3);
//					merakHotel.setTotalRoom(0);
//					merakHotel.setTotalFloor(1);
//					merakHotel.setNote("test0317cvent");
//					merakHotel.setHotelName(hotelName);
//					merakHotel.setHotelNameEn(hotelName);
//					merakHotel.setAddress(address);
//					merakHotel.setAddressEn(address);
//					merakHotel.setIndBrandName(brand);
//					merakHotel.setIndBrandNameEn(brand);
//					merakHotelId = merakHotelService.update(merakHotel);
//
//					saveSheshi("", merakHotelId, 0, 0, "");
//					ResultSet meetingRs = null;
//
//					String cventMeetingQuery = "select * from cvent_hotel_meeting" + countryCode
//							+ " where meeting_id like '" + cventHotelId + "\\_%'";
//					stmt = con.createStatement();
//					meetingRs = stmt.executeQuery(cventMeetingQuery);
//
//					while (meetingRs != null && meetingRs.next()) {
//						String meetingName = meetingRs.getString(3);
//
//						Double meetingSize = meetingRs.getDouble(4);
//						String meetingChang = meetingRs.getString(5);
//						String meetingKuan = meetingRs.getString(6);
//						String meetingGao = meetingRs.getString(7);
//
//						MerakMeetingRoomDetail meeting = new MerakMeetingRoomDetail();
//
//						meeting.setHotelId(merakHotelId);
//						meeting.setRoomType("meetingroom");
//						meeting.setIsReserve(1);
//						meeting.setArea(new BigDecimal(meetingSize).setScale(0, BigDecimal.ROUND_HALF_UP).toString());
//						meeting.setNoObstacleCeiling("0");
//						meeting.setHalfSuggestRate("0");
//						if (StringUtils.isNotEmpty(meetingGao)) {
//							meeting.setCeiling(
//									new BigDecimal(meetingGao).setScale(1, BigDecimal.ROUND_HALF_UP).toString());
//							meeting.setNoObstacleCeiling(meetingGao);
//						}
//
//						meeting.setCreateTime(new Date());
//						meeting.setCreateUser(0L);
//						meeting.setDelFlag(0);
//						meeting.setFloor("1");
//						meeting.setRoomName(meetingName);
//						meeting.setRoomNameEn(meetingName);
//						if (StringUtils.isNotEmpty(meetingChang) && StringUtils.isNotEmpty(meetingKuan)) {
//							String dimensions = new BigDecimal(meetingChang).setScale(1, BigDecimal.ROUND_HALF_UP)
//									.toString() + "*"
//									+ new BigDecimal(meetingKuan).setScale(1, BigDecimal.ROUND_HALF_UP).toString();
//							meeting.setDimensions(dimensions);
//						}
//
//						saveMeetingSetting(meeting, Double.valueOf(meeting.getArea()));
//
//						meetingRoomService.updateMeetingRoom(merakHotelId, meeting);
//					}
//
//					Float lastarea = meetingRoomService.getLastMeetingRoomArea(merakHotelId);
//					Integer meetingRoomNum = meetingRoomService.getMeetingRoomNum(merakHotelId);
//					Integer totleRoomTypeNum = hotelGuestRoomService.getTotleRoomTypeNum(merakHotelId);
//					// 更新会议室总数到酒店表
//					MerakHotel newmerakHotel = new MerakHotel();
//					newmerakHotel.setTotalRoom(totleRoomTypeNum);
//					merakHotel.setLargestMeetingRoom(lastarea);
//					merakHotel.setHotelId(merakHotelId);
//					merakHotel.setTotalMeetingRoom(meetingRoomNum);
//					merakHotelService.updateSumHotel(merakHotel);
//
//				}
//			} catch (Exception e) {
//				e.printStackTrace();
//			} finally {
//				DataSourceUtils.releaseConnection(con, ds01);
//			}
//		}
//	}
//
//	public void saveSheshi(String facilities, Long merakHotelId, int wifi, int car, String creditcard) {
//		if (facilities.indexOf("餐厅") >= 0) {
//			MerakHotelRestaFacilities merakHotelRestaFacilities = new MerakHotelRestaFacilities();
//			merakHotelRestaFacilities.setRestaType(FacilitiesConstants.RESTA_TYPE_RESTA);
//			merakHotelRestaFacilities.setHotelId(merakHotelId);
//			merakHotelRestaFacilities.setHotelFacilitiesName("餐厅");
//			merakHotelRestaFacilities.setHotelFacilitiesNameEn("Restaurant");
//			hotelFacilitiesService.updateRestaFacilities(merakHotelRestaFacilities, null);
//		}
//		if (facilities.indexOf("酒吧") >= 0) {
//			MerakHotelRestaFacilities merakHotelRestaFacilities = new MerakHotelRestaFacilities();
//			merakHotelRestaFacilities.setRestaType(FacilitiesConstants.RESTA_TYPE_BAR);
//			merakHotelRestaFacilities.setHotelId(merakHotelId);
//			merakHotelRestaFacilities.setHotelFacilitiesName("酒吧");
//			merakHotelRestaFacilities.setHotelFacilitiesNameEn("Bar");
//			hotelFacilitiesService.updateRestaFacilities(merakHotelRestaFacilities, null);
//		}
//		if (facilities.indexOf("甜品屋") >= 0) {
//			MerakHotelRestaFacilities merakHotelRestaFacilities = new MerakHotelRestaFacilities();
//			merakHotelRestaFacilities.setRestaType(FacilitiesConstants.RESTA_TYPE_DESSERT);
//			merakHotelRestaFacilities.setHotelId(merakHotelId);
//			merakHotelRestaFacilities.setHotelFacilitiesName("甜品屋");
//			merakHotelRestaFacilities.setHotelFacilitiesNameEn("Dessert");
//			hotelFacilitiesService.updateRestaFacilities(merakHotelRestaFacilities, null);
//		}
//		if (facilities.indexOf("健身") >= 0 || true) {
//			MerakHotelActFacilities merakHotelActFacilities = new MerakHotelActFacilities();
//			merakHotelActFacilities.setActType(FacilitiesConstants.ACT_TYPE_SPORT);
//			merakHotelActFacilities.setHotelId(merakHotelId);
//			merakHotelActFacilities.setHotelFacilitiesName("健身");
//			merakHotelActFacilities.setHotelFacilitiesNameEn("sport");
//			hotelFacilitiesService.updateActFacilities(merakHotelActFacilities);
//		}
//		if (facilities.indexOf("游泳池") >= 0 || true) {
//			MerakHotelActFacilities merakHotelActFacilities = new MerakHotelActFacilities();
//			merakHotelActFacilities.setActType(FacilitiesConstants.ACT_TYPE_POOL);
//			merakHotelActFacilities.setHotelId(merakHotelId);
//			merakHotelActFacilities.setHotelFacilitiesName("游泳池");
//			merakHotelActFacilities.setHotelFacilitiesNameEn("pool");
//			hotelFacilitiesService.updateActFacilities(merakHotelActFacilities);
//		}
//		if (facilities.indexOf("水疗中心") >= 0 || facilities.indexOf("按摩") >= 0 || facilities.indexOf("桑拿浴") >= 0
//				|| facilities.indexOf("健康中心") >= 0 || facilities.indexOf("美容中心") >= 0 || true) {
//			MerakHotelActFacilities merakHotelActFacilities = new MerakHotelActFacilities();
//			merakHotelActFacilities.setActType(FacilitiesConstants.ACT_TYPE_SPA);
//			merakHotelActFacilities.setHotelId(merakHotelId);
//			merakHotelActFacilities.setHotelFacilitiesName("水疗中心");
//			merakHotelActFacilities.setHotelFacilitiesNameEn("spa");
//			hotelFacilitiesService.updateActFacilities(merakHotelActFacilities);
//		}
//		if (facilities.indexOf("高尔夫") >= 0) {
//			MerakHotelActFacilities merakHotelActFacilities = new MerakHotelActFacilities();
//			merakHotelActFacilities.setActType(FacilitiesConstants.ACT_TYPE_GOLF);
//			merakHotelActFacilities.setHotelId(merakHotelId);
//			merakHotelActFacilities.setHotelFacilitiesName("高尔夫");
//			hotelFacilitiesService.updateActFacilities(merakHotelActFacilities);
//		}
//
//		MerakHotelOtherFacilitie other = new MerakHotelOtherFacilitie();
//		String sepProj = "";
//		String commonService = "";
//		String funtionalDep = "m_business,s_wifi";
//		String equipment = "freeparkinglot,presidentsuit";
//		String business = "";
//		String credit = "";
//		String mearkWifi = "";
//		if (facilities.indexOf("羽毛球场") >= 0) {
//			sepProj = sepProj + ",badmintoncourt";
//		}
//		if (facilities.indexOf("保龄球") >= 0) {
//			sepProj = sepProj + ",bowling";
//		}
//		if (facilities.indexOf("棋牌室") >= 0) {
//			sepProj = sepProj + ",chessroom";
//		}
//		if (facilities.indexOf("停机坪") >= 0) {
//			sepProj = sepProj + ",parkingapron";
//		}
//		if (facilities.indexOf("滑雪场") >= 0) {
//			sepProj = sepProj + ",skipark";
//		}
//		if (facilities.indexOf("滑雪场") >= 0) {
//			sepProj = sepProj + ",skipark";
//		}
//		if (facilities.indexOf("乒乓球") >= 0) {
//			sepProj = sepProj + ",tabletennisroom";
//		}
//		if (facilities.indexOf("网球场") >= 0) {
//			sepProj = sepProj + ",tenniscourt";
//		}
//		if (facilities.indexOf("水上项目") >= 0 || facilities.indexOf("水上运动设施") >= 0 || facilities.indexOf("水上乐园") >= 0) {
//			sepProj = sepProj + ",waterproject";
//		}
//		if (facilities.indexOf("游艇会") >= 0) {
//			sepProj = sepProj + ",yachtclub";
//		}
//		if (facilities.indexOf("自行车") >= 0) {
//			sepProj = sepProj + ",bicycle";
//		}
//		if (facilities.indexOf("儿童乐园") >= 0 || facilities.indexOf("儿童俱乐部") >= 0) {
//			sepProj = sepProj + ",childrensplayground";
//		}
//		if (facilities.indexOf("KTV") >= 0 || facilities.indexOf("卡拉") >= 0) {
//			sepProj = sepProj + ",ktv";
//		}
//		if (facilities.indexOf("免费接送机") >= 0 || facilities.indexOf("机场班车") >= 0) {
//			commonService = commonService + ",airportservice";
//		}
//		if (facilities.indexOf("行李部") >= 0 || facilities.indexOf("行李寄存") >= 0 || true) {
//			funtionalDep = funtionalDep + ",baggage";
//		}
//		if (facilities.indexOf("信用卡提现") >= 0) {
//			commonService = commonService + ",cashout";
//		}
//		if (facilities.indexOf("礼宾部") >= 0 || facilities.indexOf("票务服务") >= 0 || facilities.indexOf("礼宾服务") >= 0) {
//			funtionalDep = funtionalDep + ",concierge";
//		}
//		if (facilities.indexOf("外币兑换") >= 0) {
//			commonService = commonService + ",exchange";
//		}
//		if (facilities.indexOf("代客泊车") >= 0) {
//			commonService = commonService + ",parkingservice";
//		}
//		if (facilities.indexOf("接驳车服务") >= 0) {
//			commonService = commonService + ",shuttlebus";
//		}
//		if (facilities.indexOf("ATM") >= 0 || facilities.indexOf("自动提款机") >= 0) {
//			equipment = equipment + ",atm";
//		}
//		if (facilities.indexOf("大巴停车场") >= 0) {
//			equipment = equipment + ",busparkinglot";
//		}
//
//		if (facilities.indexOf("前台保险柜") >= 0 || facilities.indexOf("保险箱") >= 0) {
//			equipment = equipment + ",frontdesksafe";
//		}
//
//		if (facilities.indexOf("总统套房") >= 0) {
//			equipment = equipment + ",presidentsuit";
//		}
//
//		if (facilities.indexOf("商务中心") >= 0 || true) {
//			equipment = equipment + ",frontdesksafe";
//			business = "express,fax,internet,print";
//		}
//
//		if (StringUtils.isNotEmpty(creditcard)) {
//			if (creditcard.indexOf("americanexpress") >= 0) {
//				credit = credit + "americanexpress,";
//			}
//			if (creditcard.indexOf("dinersclub") >= 0) {
//				credit = credit + "diners,";
//			}
//			if (creditcard.indexOf("jcb") >= 0) {
//				credit = credit + "jcb,";
//			}
//			if (creditcard.indexOf("euromastercard") >= 0) {
//				credit = credit + "master,";
//			}
//			if (creditcard.indexOf("unionpaycreditcard") >= 0) {
//				credit = credit + "uninpay,";
//			}
//			if (creditcard.indexOf("visa") >= 0) {
//				credit = credit + "visa,";
//			}
//		}
//
//		if (wifi == 1 || true) {
//			mearkWifi = mearkWifi + "free";
//		}
//		if (wifi == 2 || true) {
//			mearkWifi = mearkWifi + "nofree";
//		}
//
//		other.setSepProj(sepProj);
//		other.setCommonService(commonService);
//		other.setFuntionalDep(funtionalDep);
//		other.setEquipment(equipment);
//		other.setBusiness(business);
//		other.setCredit(credit);
//		other.setWifi(mearkWifi);
//		other.setHotelId(merakHotelId);
//		hotelFacilitiesService.updateOtherFacilities(other);
//	}
//
//	public void saveMeetingSetting(MerakMeetingRoomDetail meeting, Double area) {
//		meeting.setNoUpright(1);
//		meeting.setSunshineType("interior");
//		meeting.setReceptionCount((long) (area * 1.08));
//		meeting.setTheatreCount((long) (area * 1.19));
//		meeting.setClassroomCount((long) (area * 0.47));
//		meeting.setRound10Count((long) (area * 0.81));
//		meeting.setUshapeCount((long) (area * 0.31));
//	}
//
//	public String setGuestScenery(String note) {
//		String scenery = "";
//		if (note.indexOf("花园景") >= 0 || note.indexOf("山景") >= 0) {
//			scenery = scenery + "greenscenery,";
//		}
//		if (note.indexOf("市景") >= 0) {
//			scenery = scenery + "cityscenery,";
//		}
//		// if(note.indexOf("花园景")>=0 || note.indexOf("山景")>=0){
//		// scenery=scenery+"hotelscenery,";
//		// }
//		if (note.indexOf("海景") >= 0 || note.indexOf("河景") >= 0 || note.indexOf("湖景") >= 0
//				|| note.indexOf("游泳池景") >= 0) {
//			scenery = scenery + "waterscenery,";
//		}
//		return scenery;
//	}
//
//	public boolean checkCity(String cityId) {
//		if (StringUtils.isEmpty(cityId)) {
//			return false;
//		}
//		String[] citys = { "西安", "成都", "杭州", "广州", "苏州", "南京", "武汉", "深圳", "厦门", "三亚", "哈尔滨", "沈阳", "大连", "天津", "青岛",
//				"重庆", "珠海", "宁波", "昆明", "丽江" };
//		for (String city : citys) {
//			if (cityId.equals(city)) {
//				return true;
//			}
//		}
//		return false;
//	}
//
//}
