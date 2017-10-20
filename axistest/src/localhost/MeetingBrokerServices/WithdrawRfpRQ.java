/**
 * WithdrawRfpRQ.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package localhost.MeetingBrokerServices;

public class WithdrawRfpRQ  extends localhost.MeetingBrokerServices.Request  implements java.io.Serializable {
    private java.lang.String rfpId;

    private int siteId;

    private localhost.MeetingBrokerServices.Message message;

    private java.lang.String secondaryExternalRfpId;

    private java.lang.String externalLostBusinessReason;

    private java.lang.String lostToCity;

    private java.lang.String lostToHotel;

    private java.lang.Boolean autoTurnDownBusiness;

    private java.lang.String withdrawnReason;

    public WithdrawRfpRQ() {
    }

    public WithdrawRfpRQ(
           java.lang.String documentId,
           java.lang.String transactionId,
           java.util.Calendar documentDate,
           java.util.Calendar receivedTime,
           java.lang.String userGuid,
           java.lang.String requestMetaDataGuid,
           java.lang.String rfpId,
           int siteId,
           localhost.MeetingBrokerServices.Message message,
           java.lang.String secondaryExternalRfpId,
           java.lang.String externalLostBusinessReason,
           java.lang.String lostToCity,
           java.lang.String lostToHotel,
           java.lang.Boolean autoTurnDownBusiness,
           java.lang.String withdrawnReason) {
        super(
            documentId,
            transactionId,
            documentDate,
            receivedTime,
            userGuid,
            requestMetaDataGuid);
        this.rfpId = rfpId;
        this.siteId = siteId;
        this.message = message;
        this.secondaryExternalRfpId = secondaryExternalRfpId;
        this.externalLostBusinessReason = externalLostBusinessReason;
        this.lostToCity = lostToCity;
        this.lostToHotel = lostToHotel;
        this.autoTurnDownBusiness = autoTurnDownBusiness;
        this.withdrawnReason = withdrawnReason;
    }


    /**
     * Gets the rfpId value for this WithdrawRfpRQ.
     * 
     * @return rfpId
     */
    public java.lang.String getRfpId() {
        return rfpId;
    }


    /**
     * Sets the rfpId value for this WithdrawRfpRQ.
     * 
     * @param rfpId
     */
    public void setRfpId(java.lang.String rfpId) {
        this.rfpId = rfpId;
    }


    /**
     * Gets the siteId value for this WithdrawRfpRQ.
     * 
     * @return siteId
     */
    public int getSiteId() {
        return siteId;
    }


    /**
     * Sets the siteId value for this WithdrawRfpRQ.
     * 
     * @param siteId
     */
    public void setSiteId(int siteId) {
        this.siteId = siteId;
    }


    /**
     * Gets the message value for this WithdrawRfpRQ.
     * 
     * @return message
     */
    public localhost.MeetingBrokerServices.Message getMessage() {
        return message;
    }


    /**
     * Sets the message value for this WithdrawRfpRQ.
     * 
     * @param message
     */
    public void setMessage(localhost.MeetingBrokerServices.Message message) {
        this.message = message;
    }


    /**
     * Gets the secondaryExternalRfpId value for this WithdrawRfpRQ.
     * 
     * @return secondaryExternalRfpId
     */
    public java.lang.String getSecondaryExternalRfpId() {
        return secondaryExternalRfpId;
    }


    /**
     * Sets the secondaryExternalRfpId value for this WithdrawRfpRQ.
     * 
     * @param secondaryExternalRfpId
     */
    public void setSecondaryExternalRfpId(java.lang.String secondaryExternalRfpId) {
        this.secondaryExternalRfpId = secondaryExternalRfpId;
    }


    /**
     * Gets the externalLostBusinessReason value for this WithdrawRfpRQ.
     * 
     * @return externalLostBusinessReason
     */
    public java.lang.String getExternalLostBusinessReason() {
        return externalLostBusinessReason;
    }


    /**
     * Sets the externalLostBusinessReason value for this WithdrawRfpRQ.
     * 
     * @param externalLostBusinessReason
     */
    public void setExternalLostBusinessReason(java.lang.String externalLostBusinessReason) {
        this.externalLostBusinessReason = externalLostBusinessReason;
    }


    /**
     * Gets the lostToCity value for this WithdrawRfpRQ.
     * 
     * @return lostToCity
     */
    public java.lang.String getLostToCity() {
        return lostToCity;
    }


    /**
     * Sets the lostToCity value for this WithdrawRfpRQ.
     * 
     * @param lostToCity
     */
    public void setLostToCity(java.lang.String lostToCity) {
        this.lostToCity = lostToCity;
    }


    /**
     * Gets the lostToHotel value for this WithdrawRfpRQ.
     * 
     * @return lostToHotel
     */
    public java.lang.String getLostToHotel() {
        return lostToHotel;
    }


    /**
     * Sets the lostToHotel value for this WithdrawRfpRQ.
     * 
     * @param lostToHotel
     */
    public void setLostToHotel(java.lang.String lostToHotel) {
        this.lostToHotel = lostToHotel;
    }


    /**
     * Gets the autoTurnDownBusiness value for this WithdrawRfpRQ.
     * 
     * @return autoTurnDownBusiness
     */
    public java.lang.Boolean getAutoTurnDownBusiness() {
        return autoTurnDownBusiness;
    }


    /**
     * Sets the autoTurnDownBusiness value for this WithdrawRfpRQ.
     * 
     * @param autoTurnDownBusiness
     */
    public void setAutoTurnDownBusiness(java.lang.Boolean autoTurnDownBusiness) {
        this.autoTurnDownBusiness = autoTurnDownBusiness;
    }


    /**
     * Gets the withdrawnReason value for this WithdrawRfpRQ.
     * 
     * @return withdrawnReason
     */
    public java.lang.String getWithdrawnReason() {
        return withdrawnReason;
    }


    /**
     * Sets the withdrawnReason value for this WithdrawRfpRQ.
     * 
     * @param withdrawnReason
     */
    public void setWithdrawnReason(java.lang.String withdrawnReason) {
        this.withdrawnReason = withdrawnReason;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof WithdrawRfpRQ)) return false;
        WithdrawRfpRQ other = (WithdrawRfpRQ) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.rfpId==null && other.getRfpId()==null) || 
             (this.rfpId!=null &&
              this.rfpId.equals(other.getRfpId()))) &&
            this.siteId == other.getSiteId() &&
            ((this.message==null && other.getMessage()==null) || 
             (this.message!=null &&
              this.message.equals(other.getMessage()))) &&
            ((this.secondaryExternalRfpId==null && other.getSecondaryExternalRfpId()==null) || 
             (this.secondaryExternalRfpId!=null &&
              this.secondaryExternalRfpId.equals(other.getSecondaryExternalRfpId()))) &&
            ((this.externalLostBusinessReason==null && other.getExternalLostBusinessReason()==null) || 
             (this.externalLostBusinessReason!=null &&
              this.externalLostBusinessReason.equals(other.getExternalLostBusinessReason()))) &&
            ((this.lostToCity==null && other.getLostToCity()==null) || 
             (this.lostToCity!=null &&
              this.lostToCity.equals(other.getLostToCity()))) &&
            ((this.lostToHotel==null && other.getLostToHotel()==null) || 
             (this.lostToHotel!=null &&
              this.lostToHotel.equals(other.getLostToHotel()))) &&
            ((this.autoTurnDownBusiness==null && other.getAutoTurnDownBusiness()==null) || 
             (this.autoTurnDownBusiness!=null &&
              this.autoTurnDownBusiness.equals(other.getAutoTurnDownBusiness()))) &&
            ((this.withdrawnReason==null && other.getWithdrawnReason()==null) || 
             (this.withdrawnReason!=null &&
              this.withdrawnReason.equals(other.getWithdrawnReason())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = super.hashCode();
        if (getRfpId() != null) {
            _hashCode += getRfpId().hashCode();
        }
        _hashCode += getSiteId();
        if (getMessage() != null) {
            _hashCode += getMessage().hashCode();
        }
        if (getSecondaryExternalRfpId() != null) {
            _hashCode += getSecondaryExternalRfpId().hashCode();
        }
        if (getExternalLostBusinessReason() != null) {
            _hashCode += getExternalLostBusinessReason().hashCode();
        }
        if (getLostToCity() != null) {
            _hashCode += getLostToCity().hashCode();
        }
        if (getLostToHotel() != null) {
            _hashCode += getLostToHotel().hashCode();
        }
        if (getAutoTurnDownBusiness() != null) {
            _hashCode += getAutoTurnDownBusiness().hashCode();
        }
        if (getWithdrawnReason() != null) {
            _hashCode += getWithdrawnReason().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(WithdrawRfpRQ.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "WithdrawRfpRQ"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rfpId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "RfpId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("siteId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "SiteId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("message");
        elemField.setXmlName(new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "Message"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "Message"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("secondaryExternalRfpId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "SecondaryExternalRfpId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("externalLostBusinessReason");
        elemField.setXmlName(new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "ExternalLostBusinessReason"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lostToCity");
        elemField.setXmlName(new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "LostToCity"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lostToHotel");
        elemField.setXmlName(new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "LostToHotel"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("autoTurnDownBusiness");
        elemField.setXmlName(new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "AutoTurnDownBusiness"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("withdrawnReason");
        elemField.setXmlName(new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "WithdrawnReason"));
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
