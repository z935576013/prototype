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
import hotel.excute.BookingImageTest;

public class BookingHotelImageTask implements Runnable {

	Integer startdestId = null;
	Integer enddestId = null;
	Integer destId = null;
	String countryCode = "";

	public BookingHotelImageTask(Integer startdestId, Integer enddestId, String countryCode) {
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
				con = BookingImageTest.db.getConnection();
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

				String url = "http://www.booking.com/searchresults.zh-cn.html?src=index&nflt=&dcid=1&si=ai%2Cco%2Cci%2Cre%2Cdi&checkin_year_month=2017-4&checkin_monthday=18&checkout_year_month=2017-4&checkout_monthday=19&room1=A%2CA&no_rooms=1&group_adults=2&group_children=0&ac_position=1&ac_langcode=zh&dest_id="
						+ destId + "&dest_type=city&tfl_cwh=1&offset=" + 15 * i;
				String html = HttpClientUtil.getHtml(url, headers);
//				System.out.println("------new page------" + destId + "--------" + 15 * i);
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
							con = BookingImageTest.db.getConnection();
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
						con = BookingImageTest.db.getConnection();
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
							con = BookingImageTest.db.getConnection();
							Statement stmt2 = con.createStatement();
							String query = "select hotel_id from Booking_HOTEL" + countryCode + " where hotel_id='"
									+ hotelId + "' and  img is not  null ";
							ResultSet rsHotel = stmt2.executeQuery(query);
							if (!rsHotel.next()) {
								Statement stmt = con.createStatement();
								query = "select hotel_id from Booking_hotel" + countryCode + " where hotel_id='"
										+ hotelId + "' and  img is not null";
								ResultSet rs = stmt.executeQuery(query);
								if (!rs.next()) {
									subhtml = "http://www.booking.com" + subhtml;
									String detail = HttpClientUtil.getHtml(subhtml, headers);
									if (detail == null || detail.equals("")) {
										continue;
									}

									int hotelImageIndex = detail.indexOf("id=\"photos_distinct\"");
									if (detail.indexOf("id=\"hp_hotel_name\"") >= 0 && hotelImageIndex >= 0) {

										String images = detail.substring(hotelImageIndex,
												detail.indexOf("</div>", hotelImageIndex));

										int count = 0;
										while (count < 2) {
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

										PreparedStatement inst = con.prepareStatement(
												"update  Booking_HOTEL" + countryCode + " set img=1 where hotel_id=?");
										inst.setString(1, hotelId);
										inst.execute();
										System.out.println("-----------" + hotelId);
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