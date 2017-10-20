package hotel.excute;

public enum CventCountryEnum {

	// 美国
	USA(6, null, 1, 42183, "", "美国"),
	// 英国
	GBR(160, null, 3, 6132, "_gbr", "英国"),
	// 德国
	DEU(180, null, 3, 8151, "_deu", "德国"),
	// 澳大利亚
	AUS(40, null, 4, 3093, "_aus", "澳大利亚"),
	// 印度
	IND(190, null, 5, 7967, "_ind", "印度"),
	// 新加坡
	SG(null, 2895, 5, 251, "_sg", "新加坡");

	private Integer sbr = null;
	private Integer ma = null;
	private Integer csn = null;
	private Integer total = null;
	private String countryCode = null;
	private String country = null;

	private CventCountryEnum(Integer sbr, Integer ma, Integer csn, Integer total, String countryCode, String country) {
		this.sbr = sbr;
		this.ma = ma;
		this.csn = csn;
		this.total = total;
		this.countryCode = countryCode;
		this.country = country;
	}

	/**
	 * @return the sbr
	 */
	public Integer getSbr() {
		return sbr;
	}

	/**
	 * @param sbr
	 *            the sbr to set
	 */
	public void setSbr(Integer sbr) {
		this.sbr = sbr;
	}

	/**
	 * @return the ma
	 */
	public Integer getMa() {
		return ma;
	}

	/**
	 * @param ma
	 *            the ma to set
	 */
	public void setMa(Integer ma) {
		this.ma = ma;
	}

	/**
	 * @return the csn
	 */
	public Integer getCsn() {
		return csn;
	}

	/**
	 * @param csn
	 *            the csn to set
	 */
	public void setCsn(Integer csn) {
		this.csn = csn;
	}

	/**
	 * @return the total
	 */
	public Integer getTotal() {
		return total;
	}

	/**
	 * @param total
	 *            the total to set
	 */
	public void setTotal(Integer total) {
		this.total = total;
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

	/**
	 * @return the country
	 */
	public String getCountry() {
		return country;
	}

	/**
	 * @param country
	 *            the country to set
	 */
	public void setCountry(String country) {
		this.country = country;
	}

}
