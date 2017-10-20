package com.suning.vgs.lifesquare.autotool.bean;


public class Column extends AbstractBean{
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -4727209055941034386L;
	private String name;
	private String code;	
	private String dataType;
	private String mandatory;
	private String identity;
	private String physicalOptions;
	private String length;
	private String defaultValue;
	private String comment;
	private String precision;
	
	
	private Boolean isPrimary = Boolean.FALSE;
	
    /**
     * @return the serialversionuid
     */
    public static long getSerialversionuid() {
        return serialVersionUID;
    }

    /**
     * @return the physicalOptions
     */
    public String getPhysicalOptions() {
        return physicalOptions;
    }

    /**
     * @param physicalOptions the physicalOptions to set
     */
    public void setPhysicalOptions(String physicalOptions) {
        this.physicalOptions = physicalOptions;
    }

    public Boolean getIsPrimary() {
		return isPrimary;
	}
	public void setIsPrimary(Boolean isPrimary) {
		this.isPrimary = isPrimary;
	}
	
	public String getPrecision() {
		return precision;
	}
	public void setPrecision(String precision) {
		this.precision = precision;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getDataType() {
		return dataType;
	}
	public void setDataType(String dataType) {
		this.dataType = dataType;
	}
	public String getMandatory() {
		return mandatory;
	}
	public void setMandatory(String mandatory) {
		this.mandatory = mandatory;
	}
	public String getIdentity() {
		return identity;
	}
	public void setIdentity(String identity) {
		this.identity = identity;
	}
	public String getLength() {
		return length;
	}
	public void setLength(String length) {
		this.length = length;
	}
	public String getDefaultValue() {
		return defaultValue;
	}
	public void setDefaultValue(String defaultValue) {
		this.defaultValue = defaultValue;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	
}
