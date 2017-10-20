package hotel.cvent;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashMap;
import java.util.Map;

import hotel.HttpClientUtil;
import hotel.excute.CventTest;

public class CventHotelTask implements Runnable {

	Integer startPageId = null;
	Integer endPageId = null;

	Integer sbr = null;
	Integer ma = null;
	Integer csn = null;
	Integer total = null;
	String countryCode = null;
	String country = null;

	public CventHotelTask(Integer startPageId, Integer endPageId, Integer sbr, Integer ma, Integer csn, Integer total,
			String countryCode, String country) {
		this.startPageId = startPageId;
		this.endPageId = endPageId;
		this.sbr = sbr;
		this.ma = ma;
		this.csn = csn;
		this.total = total;
		this.countryCode = countryCode;
		this.country = country;
	}

	public void run() {
		Map<String, String> headers = new HashMap<String, String>();
		headers.put("Accept", "text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8");
		headers.put("User-Agent", "Mozilla/5.0 (Windows NT 6.2; WOW64; rv:44.0) Gecko/20100101 Firefox/44.0");

		for (long i = startPageId; i <= endPageId; i++) {
			String sbrStr = null;
			if (sbr != null) {
				sbrStr = "&sbr=" + sbr;
			}
			if (ma != null) {
				sbrStr = "&ma=" + ma;
			}

			if (sbrStr == null) {
				throw new RuntimeException("no sbr or ma");
			}
			String url = "http://www.cvent.com/rfp/Venues.aspx?ist=8" + sbrStr + "&csn=" + csn
					+ "&vtt=1&source=mainsearch&pnum=" + i + "&total=" + total + "&so=1";

			String html = HttpClientUtil.getHtml(url, headers);
			if (html == null || html.indexOf("hdnMapShowLabels") < 0 || html.indexOf("bottom-rfp") < 0) {
				continue;
			}
			html = html.substring(html.indexOf("hdnMapShowLabels"), html.indexOf("bottom-rfp"));
			while (true) {
				int in = html.indexOf("<span class=\"result-index\">");
				if (in >= 0) {
					String subhtml = html.substring(html.indexOf("type=\"checkbox\""),
							html.indexOf("<span class=\"result-index\">"));
					subhtml = subhtml.substring(subhtml.indexOf("/rfp/"), subhtml.indexOf("CsnSearch"));

					String hotelId = "";
					if (subhtml.indexOf("/venue-") >= 0) {
						hotelId = subhtml.substring(subhtml.indexOf("/rfp/") + 5, subhtml.indexOf("/venue-"));
					} else if (subhtml.indexOf("/Venue-") >= 0) {
						hotelId = subhtml.substring(subhtml.indexOf("/rfp/") + 5, subhtml.indexOf("/Venue-"));
					}

					Connection con = null;
					try {
						con = CventTest.db.getConnection();
						Statement stmt = con.createStatement();
						String query = "select hotel_id from CVENT_hotel" + countryCode + " where hotel_id='" + hotelId
								+ "'";
						ResultSet rs = stmt.executeQuery(query);
						if (!rs.next()) {

							subhtml = "http://www.cvent.com" + subhtml;
							String detail = HttpClientUtil.getHtml(subhtml, headers);
							if (detail != null && detail.indexOf("itemprop=\"name\"") >= 0
									&& detail.indexOf("<h3>Meeting Space</h3>") >= 0) {
								String html1 = detail.substring(detail.indexOf("itemprop=\"name\""),
										detail.indexOf("<h3>Meeting Space</h3>"));
								String html2 = detail.substring(detail.indexOf("<h3>Meeting Space</h3>"),
										detail.indexOf("id=\"ctl04_dvGallery\""));

								// 酒店
								String hotelName = html1.substring(html1.indexOf("itemprop=\"name\"") + 16,
										html1.indexOf("</h1>"));

								String yearBuilt = "";
								if (html1.indexOf("Year Built/Year Renovated") >= 0) {
									yearBuilt = html1.substring(html1.indexOf("Year Built/Year Renovated") + 36,
											html1.indexOf("</td>", html1.indexOf("Year Built/Year Renovated")));
								}
								String amenities = "";
								if (html1.indexOf("<h3>Amenities</h3>") >= 0) {
									String allAmenities = html1.substring(html1.indexOf("<h3>Amenities</h3>") + 18,
											html1.indexOf("<div", html1.indexOf("<h3>Amenities</h3>")));

									while (true) {
										int ind = allAmenities.indexOf("</dd>");
										if (ind >= 0) {
											String a = allAmenities.substring(allAmenities.indexOf("<dd>") + 4,
													allAmenities.indexOf("</dd>"));
											a = a.trim();
											amenities = amenities + a + ",";
											allAmenities = allAmenities.substring(ind + 5);
										} else {
											break;
										}
									}
								}

								String brand = "";
								if (html1.indexOf("<th>Brand</th>") >= 0) {
									brand = html1.substring(html1.indexOf("<th>Brand</th>") + 19,
											html1.indexOf("</td>", html1.indexOf("<th>Brand</th>")));
									brand = brand.trim();
								}

								int busParking = 0;
								int paidParking = 0;
								int valetParking = 0;
								if (html1.indexOf("<h3>Parking</h3>") >= 0) {
									String parking = html1.substring(html1.indexOf("<h3>Parking</h3>"),
											html1.indexOf("</table>", html1.indexOf("<h3>Parking</h3>")));
									if (parking.indexOf("Paid Parking Available") >= 0) {
										paidParking = 1;
									}
									if (parking.indexOf("Valet Parking Available") >= 0) {
										valetParking = 1;
									}
									if (parking.indexOf("Bus Parking Available") >= 0) {
										busParking = 1;
									}
								}

								String address = "";

								if (detail.indexOf("itemprop=\"address\"") >= 0) {
									int ind = detail.indexOf("itemprop=\"address\"");
									String addressContent = detail.substring(ind, detail.indexOf("</div>", ind));
									String[] addressList = addressContent.split("<span");
									for (String addressStr : addressList) {
										if (addressStr.indexOf("itemprop=") >= 0 && addressStr.indexOf("span") >= 0) {
											int ind2 = addressStr.indexOf("itemprop=");
											addressStr = addressStr.substring(addressStr.indexOf(">", ind2) + 1,
													addressStr.indexOf("<", ind2));
											address = address + addressStr + " ";
										}
									}
								}

								// 会议室
								html2 = html2.substring(html2.indexOf("</table>") + 8);
								html2 = html2.substring(0, html2.indexOf("</table>"));
								Map<String, String> meetingNameMap = new HashMap<String, String>();
								while (true) {
									int ind = html2.indexOf("</tr>");
									if (ind >= 0) {

										String meeting = html2.substring(html2.indexOf("<tr>") + 4,
												html2.indexOf("</tr>"));

										html2 = html2.substring(ind + 5);

										meeting = meeting.replaceAll("Sq. Ft.", "");
										meeting = meeting.replaceAll("Ft.", "");
										String meetingName = meeting.substring(meeting.indexOf("<th") + 4,
												meeting.indexOf("</th>"));
										if (meetingName.indexOf("<a href") >= 0) {
											meetingName = meetingName.substring(meetingName.lastIndexOf("\">") + 2,
													meetingName.indexOf("</a>"));
										}
										if (meetingName.indexOf(">") >= 0) {
											meetingName = meetingName.substring(meetingName.indexOf(">") + 1);
										}
										meeting = meeting.substring(meeting.indexOf("</th>"));
										meetingName = meetingName.replaceAll("'", "");

										if (meeting.indexOf(">") >= 0) {
											meeting = meeting.substring(meeting.indexOf(">") + 1);
										}

										if (meetingNameMap.get(meetingName) != null) {
											continue;
										}

										Double meetingSize = 0d;
										String size = meeting.substring(meeting.indexOf("<td") + 16,
												meeting.indexOf("</td>"));
										size = size.replaceAll(",", "");
										if (size.indexOf("-") < 0) {
											size = size.substring(0, size.length() - 1);
											meetingSize = Double.valueOf(size);
											meetingSize = meetingSize * 0.3048 * 0.3048;
										}
										meeting = meeting.substring(meeting.indexOf("</td>") + 5);

										Double meetingGao = 0d;
										String gao = meeting.substring(meeting.indexOf("<td") + 15,
												meeting.indexOf("</td>"));
										if (gao.indexOf("-") < 0) {
											gao = gao.replaceAll(",", "");
											if (gao != null && !gao.equals("")) {
												gao = gao.substring(0, gao.length() - 1);
												meetingGao = Double.valueOf(gao);
												meetingGao = meetingGao * 0.3048;
											}
										}
										meeting = meeting.substring(meeting.indexOf("</td>") + 5);

										Double meetingChang = 0d;
										Double meetingKuan = 0d;
										String ck = meeting.substring(meeting.indexOf("<td") + 33,
												meeting.indexOf("</td>"));
										if (ck.indexOf("-") < 0) {
											ck = ck.trim();
											ck = ck.replaceAll(",", "");
											if (ck.split("x")[0] != null && !ck.split("x")[0].equals("")) {
												meetingChang = Double.valueOf(ck.split("x")[0]) * 0.3048;
											}
											if (ck.split("x")[1] != null && !ck.split("x")[1].equals("")) {
												meetingKuan = Double.valueOf(ck.split("x")[1]) * 0.3048;
											}

										}
										stmt = con.createStatement();
										query = "select hotel_id from CVENT_HOTEL_MEETING" + countryCode
												+ " where meeting_id='" + hotelId + "_" + meetingName + "'";
										rs = stmt.executeQuery(query);
										if (!rs.next()) {
											PreparedStatement inst = con
													.prepareStatement("insert into CVENT_HOTEL_MEETING" + countryCode
															+ "(meeting_id,hotel_id,meeting_name,meeting_size,meeing_chang,meeting_kuang,meeting_gao)values(?,?,?,?,?,?,?)");
											inst.setString(1, hotelId + "_" + meetingName);
											inst.setString(2, hotelId);
											inst.setString(3, meetingName);
											inst.setDouble(4, meetingSize);
											inst.setString(5, meetingChang.toString());
											inst.setString(6, meetingKuan.toString());
											inst.setString(7, meetingGao.toString());
											inst.execute();
											meetingNameMap.put(meetingName, "");
										}
									} else {
										break;
									}

								}

								PreparedStatement inst = con.prepareStatement("insert into CVENT_HOTEL" + countryCode
										+ "(hotel_id,hotel_Name,year_Built,amenities,brand,bus_Parking,paid_Parking,valet_Parking,country,address)values(?,?,?,?,?,?,?,?,?,?)");
								inst.setString(1, hotelId);
								inst.setString(2, hotelName);
								inst.setString(3, yearBuilt);
								inst.setString(4, amenities);
								inst.setString(5, brand);
								inst.setInt(6, busParking);
								inst.setInt(7, paidParking);
								inst.setInt(8, valetParking);
								inst.setString(9, country);
								inst.setString(10, address);

								inst.execute();
								System.out.println(hotelId);
							} else {
								if (detail != null && !detail.equals("")) {
									PreparedStatement inst = con.prepareStatement("insert into CVENT_HOTEL"
											+ countryCode + "(hotel_id,hotel_Name)values(?,?)");
									inst.setString(1, hotelId);
									inst.setString(2, subhtml);
									inst.execute();
								}
							}
						} else {
							System.out.println("-----" + hotelId);
						}
					} catch (SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					} finally {
						try {
							if (con != null) {
								con.close();
							}
						} catch (Exception e) {
							e.printStackTrace();
						}

					}

					html = html.substring(in + 30);

				} else {
					break;
				}

			}
		}
	}

}