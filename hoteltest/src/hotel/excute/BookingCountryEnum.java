package hotel.excute;

public enum BookingCountryEnum {

	// 美国
	USA(20000001, 20152960, ""),
	// 英国
	GBR(-2612311, -2588192, "_gbr"),
	// 德国
	DEU(-1889023, -1737948, "_deu"),
	// 澳大利亚
	AUS(-1612177, -1556844, "_aus"),

	// 印度
	IND(-2114968, -2088601, "_ind"),
	// 日本
	JP(-248822, -225001, "_jp"),
	// 韩国
	KR(-720429, -705285, "_kr"),
	// 泰国
	TH(-3257559, -3232447, "_th"),
	// 越南
	VN(-3736173, -3701502, "_vn"),
	// 新加坡
	SG(-73635, -73634, "_sg"),
	// 新加坡
	// SG(26789, 26790, "_sg"),
	// 菲律宾
	PH(-2460391, -2406715, "_ph"),
	// 马来西亚
	MY(-2405456, -2400147, "_my"),
	// 印度尼西亚
	ID(-2703546, -2670274, "_id");

	private Integer start = null;
	private Integer end = null;
	private String countryCode = null;

	private BookingCountryEnum(Integer start, Integer end, String countryCode) {
		this.start = start;
		this.end = end;
		this.countryCode = countryCode;
	}

	/**
	 * @return the start
	 */
	public int getStart() {
		return start;
	}

	/**
	 * @param start
	 *            the start to set
	 */
	public void setStart(int start) {
		this.start = start;
	}

	/**
	 * @return the end
	 */
	public int getEnd() {
		return end;
	}

	/**
	 * @param end
	 *            the end to set
	 */
	public void setEnd(int end) {
		this.end = end;
	}

	/**
	 * @return the countryCode
	 */
	public String getCountryCode() {
		return countryCode;
	}

	/**
	 * @param countryCode
	 *            the countryCode to set
	 */
	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}

}
