package hotel.booking;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import hotel.HttpClientUtil;
import hotel.excute.BookingTest;

public class BookingHotelTask implements Runnable {

	Integer startdestId = null;
	Integer enddestId = null;
	Integer destId = null;
	String countryCode = "";

	public BookingHotelTask(Integer startdestId, Integer enddestId, String countryCode) {
		this.destId = startdestId;
		this.startdestId = startdestId;
		this.enddestId = enddestId;
		this.countryCode = countryCode;
	}

	public void run() {
		Connection con = null;
		Map<String, String> headers = new HashMap<String, String>();
		headers.put("Accept", "text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8");
		headers.put("User-Agent", "Mozilla/5.0 (Windows NT 6.2; WOW64; rv:44.0) Gecko/20100101 Firefox/44.0");

		while (destId <= enddestId) {
			try {
				con = BookingTest.db.getConnection();
				Statement stmt2 = con.createStatement();
				String query = "select id from Booking_dest_city where id='" + destId + "'";
				ResultSet cityRs = stmt2.executeQuery(query);
				if (cityRs.next()) {
					// System.out.println("------old page------" + destId);
					destId++;
					continue;
				}
			} catch (Exception e) {
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

			for (long i = 0; i <= 67; i++) {

				String url = "http://www.booking.com/searchresults.zh-cn.html?src=index&nflt=&dcid=1&si=ai%2Cco%2Cci%2Cre%2Cdi&checkin_year_month=2017-5&checkin_monthday=16&checkout_year_month=2017-5&checkout_monthday=17&room1=A%2CA&no_rooms=1&group_adults=2&group_children=0&ac_position=1&ac_langcode=zh&dest_id="
						+ destId + "&dest_type=city&tfl_cwh=1&offset=" + 15 * i;
				String html = HttpClientUtil.getHtml(url, headers);
				System.out.println("------new page------" + destId + "--------" + 15 * i);
				int idx = html.indexOf("class=\"sr_header  \"");
				if (idx < 0) {
					idx = html.indexOf("class=\"sr_header \"");
				}
				if (idx >= 0) {
					String total = html.substring(html.indexOf("：共", idx) + 2, html.indexOf("家住宿", idx));
					total = total.replaceAll(",", "");
					int totalCount = Integer.valueOf(total);
					if (totalCount < 15 * i) {
						try {
							con = BookingTest.db.getConnection();
							PreparedStatement inst = con
									.prepareStatement("insert into Booking_dest_city(id,total)values(?,?)");
							inst.setInt(1, destId);
							inst.setInt(2, totalCount);
							inst.execute();
						} catch (Exception e) {
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
						break;
					}
				} else {
					try {
						con = BookingTest.db.getConnection();
						PreparedStatement inst = con
								.prepareStatement("insert into Booking_dest_city(id,total)values(?,?)");
						inst.setInt(1, destId);
						inst.setInt(2, -1);
						inst.execute();
					} catch (Exception e) {
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
					break;
				}

				if (html == null || html.equals("")) {
					break;
				}

				if (html.indexOf("id=\"hotellist_inner\"") < 0) {
					continue;
				}
				html = html.substring(html.indexOf("id=\"hotellist_inner\""));

				while (true) {
					int in = html.indexOf("class=\"hotel_name_link");
					if (in >= 0) {
						String subhtml = html.substring(in, html.indexOf("class=\"sr-hotel__name\"", in));
						if (subhtml.indexOf("highlight_room=") < 0) {

							subhtml = subhtml.substring(subhtml.indexOf("/hotel/"),
									subhtml.indexOf("dest_id" + destId) + 10);

						} else {
							subhtml = subhtml.substring(subhtml.indexOf("/hotel/"),
									subhtml.indexOf("highlight_room=") + 15);
						}
						String hotelId = subhtml.substring(7, subhtml.indexOf(".html"));
						try {
							con = BookingTest.db.getConnection();
							Statement stmt2 = con.createStatement();
							String query = "select hotel_id from Booking_HOTEL" + countryCode + " where hotel_id='"
									+ hotelId + "'";
							ResultSet rsHotel = stmt2.executeQuery(query);
							if (!rsHotel.next()) {
								Statement stmt = con.createStatement();
								query = "select hotel_id from Booking_hotel" + countryCode + " where hotel_id='"
										+ hotelId + "'";
								ResultSet rs = stmt.executeQuery(query);
								if (!rs.next()) {
									subhtml = "http://www.booking.com" + subhtml;
									String detail = HttpClientUtil.getHtml(subhtml, headers);
									if (detail == null || detail.equals("")) {
										continue;
									}

									if (detail.indexOf("id=\"hp_hotel_name\"") >= 0) {
										String htmlContent = detail.substring(detail.indexOf("id=\"hp_hotel_name\""),
												detail.indexOf(" id=\"location_score_tooltip\""));

										// 酒店基本信息
										String hotelName = htmlContent.substring(htmlContent.indexOf(">") + 1,
												htmlContent.indexOf("</span>"));
										String hotelNameEn = hotelName;
										if (hotelName.indexOf("（") >= 0) {
											hotelNameEn = hotelNameEn.substring(0, hotelNameEn.indexOf("（"));
											hotelName = hotelName.substring(hotelName.indexOf("（") + 1,
													hotelName.indexOf("）"));
										}

										String hotelAddress = "";
										if (htmlContent.indexOf("data-node_tt_id=\"location_score_tooltip\"") >= 0) {
											int ind = htmlContent.indexOf("data-node_tt_id=\"location_score_tooltip\"");
											hotelAddress = htmlContent.substring(htmlContent.indexOf(">", ind) + 1,
													htmlContent.indexOf("</span>", ind));

										}

										String poi = "";
										if (htmlContent.indexOf("data-node_tt_id=\"location_score_tooltip\"") >= 0) {
											int ind = htmlContent.indexOf("data-node_tt_id=\"location_score_tooltip\"");
											poi = htmlContent.substring(htmlContent.indexOf("data-bbox=", ind) + 11,
													htmlContent.indexOf("data-width", ind) - 2);

										}

										int star = 0;
										if (htmlContent.indexOf("b-sprite stars ratings_stars_") >= 0) {
											int ind = htmlContent.indexOf("b-sprite stars ratings_stars_");
											String starStr = htmlContent.substring(ind + 29, ind + 30);
											star = Integer.valueOf(starStr);
										}

										String facilities = "";
										if (detail.indexOf("id=\"FacilitiesContent\"") >= 0) {
											String facilitieContent = detail.substring(
													detail.indexOf("id=\"FacilitiesContent\""),
													detail.indexOf("id=\"blockdisplay4\""));

											facilitieContent = facilitieContent.substring(
													facilitieContent.indexOf("<ul>"),
													facilitieContent.lastIndexOf("</ul>"));
											while (true) {
												int ind = facilitieContent.indexOf("</li>");
												if (ind >= 0) {
													String a = facilitieContent.substring(
															facilitieContent.indexOf("<li ") + 7,
															facilitieContent.indexOf("</li>",
																	facilitieContent.indexOf("<li ") + 7));
													if (a.indexOf("<span") >= 0) {
														a = a.substring(a.indexOf(">", a.indexOf("<span")) + 1,
																a.indexOf("</span>"));
													}
													a = a.trim();
													if (a.indexOf("class") < 0) {
														facilities = facilities + a + ",";
													}
													facilitieContent = facilitieContent.substring(ind + 5);
												} else {
													break;
												}
											}
										}

										int totalGuest = 0;
										int totalGuestIndex = detail.indexOf("酒店客房数量:");
										if (totalGuestIndex >= 0) {
											String totalGuestStr = detail.substring(totalGuestIndex + 7,
													detail.indexOf("\"", totalGuestIndex));
											if (totalGuestStr.indexOf("<") >= 0) {
												totalGuestStr = totalGuestStr.substring(0, totalGuestStr.indexOf("<"));
											}
											if (totalGuestStr.indexOf(",") >= 0) {
												totalGuestStr = totalGuestStr.substring(0, totalGuestStr.indexOf(","));
											}
											totalGuestStr = totalGuestStr.replaceAll(" ", "");
											totalGuest = Integer.valueOf(totalGuestStr);
										} else if (detail.indexOf("别墅：") >= 0) {
											totalGuestIndex = detail.indexOf("别墅：");
											String totalGuestStr = detail.substring(totalGuestIndex + 3,
													detail.indexOf("栋", totalGuestIndex));
											totalGuestStr = totalGuestStr.replaceAll(" ", "");
											totalGuest = Integer.valueOf(totalGuestStr);
										} else if (detail.indexOf("度假屋：供") >= 0) {
											totalGuestIndex = detail.indexOf("度假屋：供");
											String totalGuestStr = detail.substring(totalGuestIndex + 3,
													detail.indexOf("位客人", totalGuestIndex));
											totalGuestStr = totalGuestStr.replaceAll(" ", "");
											totalGuest = Integer.valueOf(totalGuestStr);
										} else if (detail.indexOf("度假屋：") >= 0 && detail.indexOf("栋") >= 0) {
											totalGuestIndex = detail.indexOf("度假屋：");
											String totalGuestStr = detail.substring(totalGuestIndex + 4,
													detail.indexOf("栋", totalGuestIndex));
											totalGuestStr = totalGuestStr.replaceAll(" ", "");
											if (totalGuestStr.length() <= 20) {
												totalGuest = Integer.valueOf(totalGuestStr);
											}
										} else {
											int gap = 5;
											totalGuestIndex = detail.indexOf("汽车旅馆：");
											if (totalGuestIndex < 0) {
												totalGuestIndex = detail.indexOf("公寓：");
												gap = 3;
											}
											if (totalGuestIndex < 0) {
												totalGuestIndex = detail.indexOf("公寓/客房：");
												gap = 6;
											}
											if (totalGuestIndex < 0) {
												totalGuestIndex = detail.indexOf("宾馆：");
												gap = 3;
											}
											if (totalGuestIndex < 0) {
												totalGuestIndex = detail.indexOf("住宿加早餐旅馆：");
												gap = 8;
											}
											if (totalGuestIndex < 0) {
												totalGuestIndex = detail.indexOf("山林小屋：");
												gap = 5;
											}

											if (totalGuestIndex >= 0) {
												String totalGuestStr = detail.substring(totalGuestIndex + gap,
														detail.indexOf("间", totalGuestIndex));
												totalGuestStr = totalGuestStr.replaceAll(" ", "");
												if (totalGuestStr.length() < 5) {
													totalGuest = Integer.valueOf(totalGuestStr);
												}

											}
										}

										int wifi = 0;
										int wifiIndex = detail.indexOf("<h5>网络连接</h5>");
										if (wifiIndex < 0) {
											wifiIndex = detail.indexOf("<h5>网络</h5>");
										}
										if (wifiIndex >= 0) {
											String wifiString = detail.substring(wifiIndex,
													detail.indexOf("</ul>", wifiIndex + 1));
											if (wifiString.indexOf("免费") >= 0) {
												wifi = 1;
											} else {
												wifi = 2;
											}
										}

										int car = 0;
										int carIndex = detail.indexOf("<h5>停车场</h5>");
										if (carIndex >= 0) {
											String carString = detail.substring(carIndex,
													detail.indexOf("</ul>", carIndex + 1));
											if (carString.indexOf("免费") >= 0) {
												car = 1;
											} else {
												car = 2;
											}
										}

										String creditcard = "";
//										int cardIndex = detail.indexOf("酒店接受的银行卡类型");
//										if (cardIndex >= 0) {
//											String cards = detail.substring(detail.indexOf("<span", cardIndex),
//													detail.indexOf("</div>", cardIndex));
//											cards = cards.substring(0, cards.indexOf("</p>"));
//											for (String card : cards.split("<span")) {
//												if (card.indexOf("creditcard ") >= 0) {
//													String c = card.substring(card.indexOf("creditcard ") + 11,
//															card.indexOf(">", card.indexOf("creditcard ") + 10)-1);
//													creditcard = creditcard + c + ",";
//												} else if (card.indexOf("creditcard_noimg no-image-payment") >= 0) {
//													String c = card.substring(card.indexOf(">") + 1,
//															card.indexOf("</span>"));
//													creditcard = creditcard + c + ",";
//												}
//											}
//										}

										if (detail.indexOf("\"room_availability_container") >= 0) {
											int gindex = detail.indexOf("\"room_availability_container");
											String guestContent = "";
											guestContent = detail.substring(gindex,
													detail.indexOf("#available_rooms", gindex));
											while (true) {
												int n = guestContent.indexOf("room-type-container");
												if (n >= 0) {
													int next = guestContent.indexOf("room-type-container", n + 5);
													String guest = "";
													if (next >= 0) {
														guest = guestContent.substring(n, next);
													} else {
														guest = guestContent;
													}
													guestContent = guestContent.substring(n + 30);

													String guestNameEn = "";
													String guestName = "";
													if (guest.indexOf("data-room-name-en") >= 0) {
														int gidx = guest.indexOf("data-room-name-en") + 19;
														guestNameEn = guest.substring(gidx, guest.indexOf("\"", gidx));
														guestName = guest.substring(guest.indexOf("</i>", gidx) + 4,
																guest.indexOf("</a>", gidx));
													}

													guestName = guestName.replaceAll("'", "");
													guestNameEn = guestNameEn.replaceAll("'", "");
													String area = "0";
													if (guest.indexOf("平方米") >= 0) {
														try {
															if (guest.indexOf("平方米）") >= 0) {
																area = guest
																		.substring(
																				guest.indexOf("（",
																						guest.indexOf("平方米）") - 20) + 1,
																				guest.indexOf("平方米）"));
																if (guest.indexOf("到") >= 0) {
																	area = area.substring(area.indexOf("到") + 1);
																}

															} else {
																if (guest.indexOf("客房面积为") >= 0
																		|| guest.indexOf("客房的面积为") >= 0
																		|| guest.indexOf("客房面积") >= 0) {
																	try {
																		area = guest
																				.substring(
																						guest.indexOf(">",
																								guest.indexOf("平方米")
																										- 15)
																								+ 1,
																						guest.indexOf("平方米"));
																	} catch (Exception e) {
																		area = "30";
																	}
																} else if (guest.indexOf("拥有约") >= 0) {
																	area = guest.substring(
																			guest.indexOf("拥有约",
																					guest.indexOf("平方米") - 15) + 1,
																			guest.indexOf("平方米"));
																} else {
																	area = guest.substring(
																			guest.indexOf(">", guest.indexOf("平方米") - 6)
																					+ 1,
																			guest.indexOf("平方米"));

																}
															}
														} catch (Exception e) {
															area = guest.substring(guest.indexOf("平方米") - 5,
																	guest.indexOf("平方米"));
															area = getNumbers(area);
														}

														area = area.replaceAll(" ", "");
														area = area.replaceAll(",", "");
														if (area.indexOf(">") >= 0) {
															area = area.substring(area.indexOf(">") + 1);
														}
														if (area.indexOf("为") >= 0) {
															area = area.substring(area.indexOf("为") + 1);
														}
														if (area.indexOf("-") >= 0) {
															area = area.substring(area.indexOf("-") + 1);
														}
														if (area.indexOf("这间") >= 0) {
															area = area.substring(area.indexOf("这间") + 2);
														}
														if (area.indexOf("间") >= 0) {
															area = area.substring(area.indexOf("间") + 1);
														}
														if (area.indexOf("有") >= 0) {
															area = area.substring(area.indexOf("有") + 1);
														}
														if (area.indexOf("约") >= 0) {
															area = area.substring(area.indexOf("约") + 1);
														}
														if (area.indexOf("至") >= 0) {
															area = area.substring(area.indexOf("至") + 1);
														}
														if (area.indexOf("公寓") >= 0) {
															area = area.substring(area.indexOf("公寓") + 2);
														}
													}
													try {
														Double.parseDouble(area);
													} catch (Exception e) {
														area = "20";
													}

													String sheshi = "";
													if (guest.indexOf("iconfont_wrapper") >= 0) {
														String facContent = guest.substring(
																guest.indexOf("iconfont_wrapper"),
																guest.indexOf("roomAvailability_taxes"));

														String mainFacContent = "";
														if (facContent.indexOf("<div") >= 0) {
															mainFacContent = facContent.substring(0,
																	facContent.indexOf("<div"));
														}

														String[] mainFacs = mainFacContent.split("<span");
														for (String mainFac : mainFacs) {
															if (mainFac.indexOf("</i>") >= 0
																	&& mainFac.indexOf("</span>") >= 0) {
																sheshi = sheshi
																		+ mainFac.substring(mainFac.indexOf("</i>") + 5,
																				mainFac.indexOf("</span>"));
															}
														}

														if (facContent.indexOf("rt-all-facilities-hidden") >= 0) {
															int otherIdx = facContent
																	.indexOf("rt-all-facilities-hidden");
															String otherFacContent = facContent.substring(otherIdx,
																	facContent.indexOf("</div>", otherIdx));

															String[] otherFacs = otherFacContent.split("<span");
															for (String otherFac : otherFacs) {
																if (otherFac.indexOf(">• ") >= 0
																		&& otherFac.indexOf("</span>") >= 0) {
																	sheshi = sheshi + otherFac.substring(
																			otherFac.indexOf(">• ") + 2,
																			otherFac.indexOf("</span>"));
																}
															}
														}

													} else {

														String sheshiIndexer = "客房设施:";
														if (guestContent.indexOf("公寓设施:") >= 0) {
															sheshiIndexer = "公寓设施:";
														}
														if (guestContent.indexOf(sheshiIndexer) >= 0) {
															sheshi = guestContent.substring(
																	guestContent.indexOf(sheshiIndexer) + 14,
																	guestContent.indexOf("</p>",
																			guestContent.indexOf(sheshiIndexer)));
															sheshi = sheshi.replaceAll(" ", "");
														}

													}

													stmt2 = con.createStatement();
													String query2 = "select 1 from booking_hotel_guest" + countryCode
															+ " where guest_id='" + hotelId + "_" + guestNameEn + "'";
													ResultSet hotelRs2 = stmt2.executeQuery(query2);
													if (!hotelRs2.next()) {
														PreparedStatement inst = con.prepareStatement(
																"insert into Booking_HOTEL_GUest" + countryCode
																		+ "(guest_id,hotel_id,guest_name,guest_name_en,description,area,sheshi)values(?,?,?,?,?,?,?)");
														inst.setString(1, hotelId + "_" + guestNameEn);
														inst.setString(2, hotelId);
														inst.setString(3, guestName);
														inst.setString(4, guestNameEn);
														inst.setString(5, null);
														inst.setDouble(6, Double.parseDouble(area));
														inst.setString(7, sheshi);
														inst.execute();
													}

												} else {
													break;
												}

											}
										}

										int hotelImageIndex = detail.indexOf("id=\"photos_distinct\"");
										if (hotelImageIndex >= 0) {

											String images = detail.substring(hotelImageIndex,
													detail.indexOf("</div>", hotelImageIndex));

											int count = 0;
											while (count <= 2) {
												String imageId = "";
												String imgUrl = "";
												int n = images.indexOf("href");
												if (n >= 0) {
													if (images.indexOf(".jpg", n) >= 0) {
														imgUrl = images.substring(n + 6, images.indexOf(".jpg", n) + 4);
														imageId = imgUrl.substring(imgUrl.lastIndexOf("/") + 1,
																imgUrl.length() - 4);
													}

												} else {
													break;
												}
												images = images.substring(images.indexOf(".jpg", n) + 4);

												if (imageId != null && !imageId.equals("")) {
													count++;
													Statement stmt3 = con.createStatement();
													String query2 = "select image_id from booking_hotel_image" + countryCode
															+ " where image_id='" + hotelId + "_" + imageId + "'";
													ResultSet hotelRs2 = stmt3.executeQuery(query2);
													if (!hotelRs2.next()) {
														PreparedStatement inst = con.prepareStatement(
																"insert into booking_hotel_image" + countryCode
																		+ " (image_id,hotel_Id,url)values(?,?,?)");
														inst.setString(1, hotelId + "_" + imageId);
														inst.setString(2, hotelId);
														inst.setString(3, imageId);
														inst.execute();
													}
												}
											}
										}
										
										
										stmt2 = con.createStatement();
										query = "select hotel_id from Booking_HOTEL" + countryCode + " where hotel_id='"
												+ hotelId + "'";
										rsHotel = stmt2.executeQuery(query);
										if (!rsHotel.next()) {
											PreparedStatement inst = con.prepareStatement("insert into Booking_HOTEL"
													+ countryCode
													+ "(hotel_id,hotel_Name,hotel_Name_en,star,hotel_address,facilities,guest,hotel_address_en,wifi,car,merak_hotel_id,creditcard,poi,total_guest,img)values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
											inst.setString(1, hotelId);
											inst.setString(2, hotelName);
											inst.setString(3, hotelNameEn);
											inst.setInt(4, star);
											inst.setString(5, hotelAddress);
											inst.setString(6, facilities);

											inst.setInt(7, 0);
											inst.setString(8, "");
											inst.setInt(9, wifi);
											inst.setInt(10, car);
											inst.setString(11, null);
											inst.setString(12, creditcard);
											inst.setString(13, poi);
											inst.setInt(14, totalGuest);
											inst.setInt(15, 1);
											inst.execute();
											 System.out.println(hotelId);
										}

									}
								}
							} else {
								// System.out.println("-----------" + hotelId);
							}
							html = html.substring(in + 30);
						} catch (Exception e) {
							System.out.println(subhtml);
							e.printStackTrace();
							throw new RuntimeException("--------------------------", e);
						} finally {
							try {
								if (con != null) {
									con.close();
								}
							} catch (Exception e) {
								e.printStackTrace();
							}

						}

					} else {
						break;
					}

				}
			}
			destId++;
		}
	}

	public String getNumbers(String content) {
		Pattern pattern = Pattern.compile("\\d+");
		Matcher matcher = pattern.matcher(content);
		while (matcher.find()) {
			return matcher.group(0);
		}
		return "";
	}

}