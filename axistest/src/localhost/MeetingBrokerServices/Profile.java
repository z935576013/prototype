/**
 * Profile.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package localhost.MeetingBrokerServices;

public class Profile  implements java.io.Serializable {
    private java.lang.String companyName;

    private java.lang.String addressLine1;

    private java.lang.String addressLine2;

    private java.lang.String addressLine3;

    private java.lang.String url;

    private java.lang.String phoneNumber;

    private java.lang.String phoneExtension;

    private java.lang.String faxNumber;

    private java.lang.String email;

    private java.lang.String cityRegion;

    private java.lang.String stateProvince;

    private java.lang.String postalCode;

    private java.lang.String externalCountry;

    private boolean isCommissionable;

    private java.math.BigDecimal commission;

    private java.lang.String externalSicCode;

    private java.lang.Integer externalSicCodeId;

    private localhost.MeetingBrokerServices.Contact contact;

    private java.lang.String externalProfileId;

    private java.lang.String salesAndCateringId;

    private java.lang.String IATANumber;

    private java.lang.String DUNSNumber;

    public Profile() {
    }

    public Profile(
           java.lang.String companyName,
           java.lang.String addressLine1,
           java.lang.String addressLine2,
           java.lang.String addressLine3,
           java.lang.String url,
           java.lang.String phoneNumber,
           java.lang.String phoneExtension,
           java.lang.String faxNumber,
           java.lang.String email,
           java.lang.String cityRegion,
           java.lang.String stateProvince,
           java.lang.String postalCode,
           java.lang.String externalCountry,
           boolean isCommissionable,
           java.math.BigDecimal commission,
           java.lang.String externalSicCode,
           java.lang.Integer externalSicCodeId,
           localhost.MeetingBrokerServices.Contact contact,
           java.lang.String externalProfileId,
           java.lang.String salesAndCateringId,
           java.lang.String IATANumber,
           java.lang.String DUNSNumber) {
           this.companyName = companyName;
           this.addressLine1 = addressLine1;
           this.addressLine2 = addressLine2;
           this.addressLine3 = addressLine3;
           this.url = url;
           this.phoneNumber = phoneNumber;
           this.phoneExtension = phoneExtension;
           this.faxNumber = faxNumber;
           this.email = email;
           this.cityRegion = cityRegion;
           this.stateProvince = stateProvince;
           this.postalCode = postalCode;
           this.externalCountry = externalCountry;
           this.isCommissionable = isCommissionable;
           this.commission = commission;
           this.externalSicCode = externalSicCode;
           this.externalSicCodeId = externalSicCodeId;
           this.contact = contact;
           this.externalProfileId = externalProfileId;
           this.salesAndCateringId = salesAndCateringId;
           this.IATANumber = IATANumber;
           this.DUNSNumber = DUNSNumber;
    }


    /**
     * Gets the companyName value for this Profile.
     * 
     * @return companyName
     */
    public java.lang.String getCompanyName() {
        return companyName;
    }


    /**
     * Sets the companyName value for this Profile.
     * 
     * @param companyName
     */
    public void setCompanyName(java.lang.String companyName) {
        this.companyName = companyName;
    }


    /**
     * Gets the addressLine1 value for this Profile.
     * 
     * @return addressLine1
     */
    public java.lang.String getAddressLine1() {
        return addressLine1;
    }


    /**
     * Sets the addressLine1 value for this Profile.
     * 
     * @param addressLine1
     */
    public void setAddressLine1(java.lang.String addressLine1) {
        this.addressLine1 = addressLine1;
    }


    /**
     * Gets the addressLine2 value for this Profile.
     * 
     * @return addressLine2
     */
    public java.lang.String getAddressLine2() {
        return addressLine2;
    }


    /**
     * Sets the addressLine2 value for this Profile.
     * 
     * @param addressLine2
     */
    public void setAddressLine2(java.lang.String addressLine2) {
        this.addressLine2 = addressLine2;
    }


    /**
     * Gets the addressLine3 value for this Profile.
     * 
     * @return addressLine3
     */
    public java.lang.String getAddressLine3() {
        return addressLine3;
    }


    /**
     * Sets the addressLine3 value for this Profile.
     * 
     * @param addressLine3
     */
    public void setAddressLine3(java.lang.String addressLine3) {
        this.addressLine3 = addressLine3;
    }


    /**
     * Gets the url value for this Profile.
     * 
     * @return url
     */
    public java.lang.String getUrl() {
        return url;
    }


    /**
     * Sets the url value for this Profile.
     * 
     * @param url
     */
    public void setUrl(java.lang.String url) {
        this.url = url;
    }


    /**
     * Gets the phoneNumber value for this Profile.
     * 
     * @return phoneNumber
     */
    public java.lang.String getPhoneNumber() {
        return phoneNumber;
    }


    /**
     * Sets the phoneNumber value for this Profile.
     * 
     * @param phoneNumber
     */
    public void setPhoneNumber(java.lang.String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }


    /**
     * Gets the phoneExtension value for this Profile.
     * 
     * @return phoneExtension
     */
    public java.lang.String getPhoneExtension() {
        return phoneExtension;
    }


    /**
     * Sets the phoneExtension value for this Profile.
     * 
     * @param phoneExtension
     */
    public void setPhoneExtension(java.lang.String phoneExtension) {
        this.phoneExtension = phoneExtension;
    }


    /**
     * Gets the faxNumber value for this Profile.
     * 
     * @return faxNumber
     */
    public java.lang.String getFaxNumber() {
        return faxNumber;
    }


    /**
     * Sets the faxNumber value for this Profile.
     * 
     * @param faxNumber
     */
    public void setFaxNumber(java.lang.String faxNumber) {
        this.faxNumber = faxNumber;
    }


    /**
     * Gets the email value for this Profile.
     * 
     * @return email
     */
    public java.lang.String getEmail() {
        return email;
    }


    /**
     * Sets the email value for this Profile.
     * 
     * @param email
     */
    public void setEmail(java.lang.String email) {
        this.email = email;
    }


    /**
     * Gets the cityRegion value for this Profile.
     * 
     * @return cityRegion
     */
    public java.lang.String getCityRegion() {
        return cityRegion;
    }


    /**
     * Sets the cityRegion value for this Profile.
     * 
     * @param cityRegion
     */
    public void setCityRegion(java.lang.String cityRegion) {
        this.cityRegion = cityRegion;
    }


    /**
     * Gets the stateProvince value for this Profile.
     * 
     * @return stateProvince
     */
    public java.lang.String getStateProvince() {
        return stateProvince;
    }


    /**
     * Sets the stateProvince value for this Profile.
     * 
     * @param stateProvince
     */
    public void setStateProvince(java.lang.String stateProvince) {
        this.stateProvince = stateProvince;
    }


    /**
     * Gets the postalCode value for this Profile.
     * 
     * @return postalCode
     */
    public java.lang.String getPostalCode() {
        return postalCode;
    }


    /**
     * Sets the postalCode value for this Profile.
     * 
     * @param postalCode
     */
    public void setPostalCode(java.lang.String postalCode) {
        this.postalCode = postalCode;
    }


    /**
     * Gets the externalCountry value for this Profile.
     * 
     * @return externalCountry
     */
    public java.lang.String getExternalCountry() {
        return externalCountry;
    }


    /**
     * Sets the externalCountry value for this Profile.
     * 
     * @param externalCountry
     */
    public void setExternalCountry(java.lang.String externalCountry) {
        this.externalCountry = externalCountry;
    }


    /**
     * Gets the isCommissionable value for this Profile.
     * 
     * @return isCommissionable
     */
    public boolean isIsCommissionable() {
        return isCommissionable;
    }


    /**
     * Sets the isCommissionable value for this Profile.
     * 
     * @param isCommissionable
     */
    public void setIsCommissionable(boolean isCommissionable) {
        this.isCommissionable = isCommissionable;
    }


    /**
     * Gets the commission value for this Profile.
     * 
     * @return commission
     */
    public java.math.BigDecimal getCommission() {
        return commission;
    }


    /**
     * Sets the commission value for this Profile.
     * 
     * @param commission
     */
    public void setCommission(java.math.BigDecimal commission) {
        this.commission = commission;
    }


    /**
     * Gets the externalSicCode value for this Profile.
     * 
     * @return externalSicCode
     */
    public java.lang.String getExternalSicCode() {
        return externalSicCode;
    }


    /**
     * Sets the externalSicCode value for this Profile.
     * 
     * @param externalSicCode
     */
    public void setExternalSicCode(java.lang.String externalSicCode) {
        this.externalSicCode = externalSicCode;
    }


    /**
     * Gets the externalSicCodeId value for this Profile.
     * 
     * @return externalSicCodeId
     */
    public java.lang.Integer getExternalSicCodeId() {
        return externalSicCodeId;
    }


    /**
     * Sets the externalSicCodeId value for this Profile.
     * 
     * @param externalSicCodeId
     */
    public void setExternalSicCodeId(java.lang.Integer externalSicCodeId) {
        this.externalSicCodeId = externalSicCodeId;
    }


    /**
     * Gets the contact value for this Profile.
     * 
     * @return contact
     */
    public localhost.MeetingBrokerServices.Contact getContact() {
        return contact;
    }


    /**
     * Sets the contact value for this Profile.
     * 
     * @param contact
     */
    public void setContact(localhost.MeetingBrokerServices.Contact contact) {
        this.contact = contact;
    }


    /**
     * Gets the externalProfileId value for this Profile.
     * 
     * @return externalProfileId
     */
    public java.lang.String getExternalProfileId() {
        return externalProfileId;
    }


    /**
     * Sets the externalProfileId value for this Profile.
     * 
     * @param externalProfileId
     */
    public void setExternalProfileId(java.lang.String externalProfileId) {
        this.externalProfileId = externalProfileId;
    }


    /**
     * Gets the salesAndCateringId value for this Profile.
     * 
     * @return salesAndCateringId
     */
    public java.lang.String getSalesAndCateringId() {
        return salesAndCateringId;
    }


    /**
     * Sets the salesAndCateringId value for this Profile.
     * 
     * @param salesAndCateringId
     */
    public void setSalesAndCateringId(java.lang.String salesAndCateringId) {
        this.salesAndCateringId = salesAndCateringId;
    }


    /**
     * Gets the IATANumber value for this Profile.
     * 
     * @return IATANumber
     */
    public java.lang.String getIATANumber() {
        return IATANumber;
    }


    /**
     * Sets the IATANumber value for this Profile.
     * 
     * @param IATANumber
     */
    public void setIATANumber(java.lang.String IATANumber) {
        this.IATANumber = IATANumber;
    }


    /**
     * Gets the DUNSNumber value for this Profile.
     * 
     * @return DUNSNumber
     */
    public java.lang.String getDUNSNumber() {
        return DUNSNumber;
    }


    /**
     * Sets the DUNSNumber value for this Profile.
     * 
     * @param DUNSNumber
     */
    public void setDUNSNumber(java.lang.String DUNSNumber) {
        this.DUNSNumber = DUNSNumber;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Profile)) return false;
        Profile other = (Profile) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.companyName==null && other.getCompanyName()==null) || 
             (this.companyName!=null &&
              this.companyName.equals(other.getCompanyName()))) &&
            ((this.addressLine1==null && other.getAddressLine1()==null) || 
             (this.addressLine1!=null &&
              this.addressLine1.equals(other.getAddressLine1()))) &&
            ((this.addressLine2==null && other.getAddressLine2()==null) || 
             (this.addressLine2!=null &&
              this.addressLine2.equals(other.getAddressLine2()))) &&
            ((this.addressLine3==null && other.getAddressLine3()==null) || 
             (this.addressLine3!=null &&
              this.addressLine3.equals(other.getAddressLine3()))) &&
            ((this.url==null && other.getUrl()==null) || 
             (this.url!=null &&
              this.url.equals(other.getUrl()))) &&
            ((this.phoneNumber==null && other.getPhoneNumber()==null) || 
             (this.phoneNumber!=null &&
              this.phoneNumber.equals(other.getPhoneNumber()))) &&
            ((this.phoneExtension==null && other.getPhoneExtension()==null) || 
             (this.phoneExtension!=null &&
              this.phoneExtension.equals(other.getPhoneExtension()))) &&
            ((this.faxNumber==null && other.getFaxNumber()==null) || 
             (this.faxNumber!=null &&
              this.faxNumber.equals(other.getFaxNumber()))) &&
            ((this.email==null && other.getEmail()==null) || 
             (this.email!=null &&
              this.email.equals(other.getEmail()))) &&
            ((this.cityRegion==null && other.getCityRegion()==null) || 
             (this.cityRegion!=null &&
              this.cityRegion.equals(other.getCityRegion()))) &&
            ((this.stateProvince==null && other.getStateProvince()==null) || 
             (this.stateProvince!=null &&
              this.stateProvince.equals(other.getStateProvince()))) &&
            ((this.postalCode==null && other.getPostalCode()==null) || 
             (this.postalCode!=null &&
              this.postalCode.equals(other.getPostalCode()))) &&
            ((this.externalCountry==null && other.getExternalCountry()==null) || 
             (this.externalCountry!=null &&
              this.externalCountry.equals(other.getExternalCountry()))) &&
            this.isCommissionable == other.isIsCommissionable() &&
            ((this.commission==null && other.getCommission()==null) || 
             (this.commission!=null &&
              this.commission.equals(other.getCommission()))) &&
            ((this.externalSicCode==null && other.getExternalSicCode()==null) || 
             (this.externalSicCode!=null &&
              this.externalSicCode.equals(other.getExternalSicCode()))) &&
            ((this.externalSicCodeId==null && other.getExternalSicCodeId()==null) || 
             (this.externalSicCodeId!=null &&
              this.externalSicCodeId.equals(other.getExternalSicCodeId()))) &&
            ((this.contact==null && other.getContact()==null) || 
             (this.contact!=null &&
              this.contact.equals(other.getContact()))) &&
            ((this.externalProfileId==null && other.getExternalProfileId()==null) || 
             (this.externalProfileId!=null &&
              this.externalProfileId.equals(other.getExternalProfileId()))) &&
            ((this.salesAndCateringId==null && other.getSalesAndCateringId()==null) || 
             (this.salesAndCateringId!=null &&
              this.salesAndCateringId.equals(other.getSalesAndCateringId()))) &&
            ((this.IATANumber==null && other.getIATANumber()==null) || 
             (this.IATANumber!=null &&
              this.IATANumber.equals(other.getIATANumber()))) &&
            ((this.DUNSNumber==null && other.getDUNSNumber()==null) || 
             (this.DUNSNumber!=null &&
              this.DUNSNumber.equals(other.getDUNSNumber())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getCompanyName() != null) {
            _hashCode += getCompanyName().hashCode();
        }
        if (getAddressLine1() != null) {
            _hashCode += getAddressLine1().hashCode();
        }
        if (getAddressLine2() != null) {
            _hashCode += getAddressLine2().hashCode();
        }
        if (getAddressLine3() != null) {
            _hashCode += getAddressLine3().hashCode();
        }
        if (getUrl() != null) {
            _hashCode += getUrl().hashCode();
        }
        if (getPhoneNumber() != null) {
            _hashCode += getPhoneNumber().hashCode();
        }
        if (getPhoneExtension() != null) {
            _hashCode += getPhoneExtension().hashCode();
        }
        if (getFaxNumber() != null) {
            _hashCode += getFaxNumber().hashCode();
        }
        if (getEmail() != null) {
            _hashCode += getEmail().hashCode();
        }
        if (getCityRegion() != null) {
            _hashCode += getCityRegion().hashCode();
        }
        if (getStateProvince() != null) {
            _hashCode += getStateProvince().hashCode();
        }
        if (getPostalCode() != null) {
            _hashCode += getPostalCode().hashCode();
        }
        if (getExternalCountry() != null) {
            _hashCode += getExternalCountry().hashCode();
        }
        _hashCode += (isIsCommissionable() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getCommission() != null) {
            _hashCode += getCommission().hashCode();
        }
        if (getExternalSicCode() != null) {
            _hashCode += getExternalSicCode().hashCode();
        }
        if (getExternalSicCodeId() != null) {
            _hashCode += getExternalSicCodeId().hashCode();
        }
        if (getContact() != null) {
            _hashCode += getContact().hashCode();
        }
        if (getExternalProfileId() != null) {
            _hashCode += getExternalProfileId().hashCode();
        }
        if (getSalesAndCateringId() != null) {
            _hashCode += getSalesAndCateringId().hashCode();
        }
        if (getIATANumber() != null) {
            _hashCode += getIATANumber().hashCode();
        }
        if (getDUNSNumber() != null) {
            _hashCode += getDUNSNumber().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Profile.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "Profile"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("companyName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "CompanyName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("addressLine1");
        elemField.setXmlName(new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "AddressLine1"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("addressLine2");
        elemField.setXmlName(new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "AddressLine2"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("addressLine3");
        elemField.setXmlName(new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "AddressLine3"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("url");
        elemField.setXmlName(new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "Url"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("phoneNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "PhoneNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("phoneExtension");
        elemField.setXmlName(new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "PhoneExtension"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("faxNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "FaxNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("email");
        elemField.setXmlName(new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "Email"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cityRegion");
        elemField.setXmlName(new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "CityRegion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("stateProvince");
        elemField.setXmlName(new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "StateProvince"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("postalCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "PostalCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("externalCountry");
        elemField.setXmlName(new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "ExternalCountry"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isCommissionable");
        elemField.setXmlName(new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "IsCommissionable"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("commission");
        elemField.setXmlName(new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "Commission"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("externalSicCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "ExternalSicCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("externalSicCodeId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "ExternalSicCodeId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("contact");
        elemField.setXmlName(new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "Contact"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "Contact"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("externalProfileId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "ExternalProfileId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("salesAndCateringId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "SalesAndCateringId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("IATANumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "IATANumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("DUNSNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "DUNSNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
