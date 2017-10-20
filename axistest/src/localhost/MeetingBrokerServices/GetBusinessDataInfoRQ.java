/**
 * GetBusinessDataInfoRQ.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package localhost.MeetingBrokerServices;

public class GetBusinessDataInfoRQ  extends localhost.MeetingBrokerServices.Request  implements java.io.Serializable {
    private java.lang.Integer notificationId;

    private java.lang.String externalRfpId;

    private java.lang.String secondaryExternalRfpId;

    private java.lang.Integer siteId;

    private localhost.MeetingBrokerServices.BusinessDataType businessDataType;

    private java.lang.Boolean includeBusinessLockStatus;

    public GetBusinessDataInfoRQ() {
    }

    public GetBusinessDataInfoRQ(
           java.lang.String documentId,
           java.lang.String transactionId,
           java.util.Calendar documentDate,
           java.util.Calendar receivedTime,
           java.lang.String userGuid,
           java.lang.String requestMetaDataGuid,
           java.lang.Integer notificationId,
           java.lang.String externalRfpId,
           java.lang.String secondaryExternalRfpId,
           java.lang.Integer siteId,
           localhost.MeetingBrokerServices.BusinessDataType businessDataType,
           java.lang.Boolean includeBusinessLockStatus) {
        super(
            documentId,
            transactionId,
            documentDate,
            receivedTime,
            userGuid,
            requestMetaDataGuid);
        this.notificationId = notificationId;
        this.externalRfpId = externalRfpId;
        this.secondaryExternalRfpId = secondaryExternalRfpId;
        this.siteId = siteId;
        this.businessDataType = businessDataType;
        this.includeBusinessLockStatus = includeBusinessLockStatus;
    }


    /**
     * Gets the notificationId value for this GetBusinessDataInfoRQ.
     * 
     * @return notificationId
     */
    public java.lang.Integer getNotificationId() {
        return notificationId;
    }


    /**
     * Sets the notificationId value for this GetBusinessDataInfoRQ.
     * 
     * @param notificationId
     */
    public void setNotificationId(java.lang.Integer notificationId) {
        this.notificationId = notificationId;
    }


    /**
     * Gets the externalRfpId value for this GetBusinessDataInfoRQ.
     * 
     * @return externalRfpId
     */
    public java.lang.String getExternalRfpId() {
        return externalRfpId;
    }


    /**
     * Sets the externalRfpId value for this GetBusinessDataInfoRQ.
     * 
     * @param externalRfpId
     */
    public void setExternalRfpId(java.lang.String externalRfpId) {
        this.externalRfpId = externalRfpId;
    }


    /**
     * Gets the secondaryExternalRfpId value for this GetBusinessDataInfoRQ.
     * 
     * @return secondaryExternalRfpId
     */
    public java.lang.String getSecondaryExternalRfpId() {
        return secondaryExternalRfpId;
    }


    /**
     * Sets the secondaryExternalRfpId value for this GetBusinessDataInfoRQ.
     * 
     * @param secondaryExternalRfpId
     */
    public void setSecondaryExternalRfpId(java.lang.String secondaryExternalRfpId) {
        this.secondaryExternalRfpId = secondaryExternalRfpId;
    }


    /**
     * Gets the siteId value for this GetBusinessDataInfoRQ.
     * 
     * @return siteId
     */
    public java.lang.Integer getSiteId() {
        return siteId;
    }


    /**
     * Sets the siteId value for this GetBusinessDataInfoRQ.
     * 
     * @param siteId
     */
    public void setSiteId(java.lang.Integer siteId) {
        this.siteId = siteId;
    }


    /**
     * Gets the businessDataType value for this GetBusinessDataInfoRQ.
     * 
     * @return businessDataType
     */
    public localhost.MeetingBrokerServices.BusinessDataType getBusinessDataType() {
        return businessDataType;
    }


    /**
     * Sets the businessDataType value for this GetBusinessDataInfoRQ.
     * 
     * @param businessDataType
     */
    public void setBusinessDataType(localhost.MeetingBrokerServices.BusinessDataType businessDataType) {
        this.businessDataType = businessDataType;
    }


    /**
     * Gets the includeBusinessLockStatus value for this GetBusinessDataInfoRQ.
     * 
     * @return includeBusinessLockStatus
     */
    public java.lang.Boolean getIncludeBusinessLockStatus() {
        return includeBusinessLockStatus;
    }


    /**
     * Sets the includeBusinessLockStatus value for this GetBusinessDataInfoRQ.
     * 
     * @param includeBusinessLockStatus
     */
    public void setIncludeBusinessLockStatus(java.lang.Boolean includeBusinessLockStatus) {
        this.includeBusinessLockStatus = includeBusinessLockStatus;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetBusinessDataInfoRQ)) return false;
        GetBusinessDataInfoRQ other = (GetBusinessDataInfoRQ) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.notificationId==null && other.getNotificationId()==null) || 
             (this.notificationId!=null &&
              this.notificationId.equals(other.getNotificationId()))) &&
            ((this.externalRfpId==null && other.getExternalRfpId()==null) || 
             (this.externalRfpId!=null &&
              this.externalRfpId.equals(other.getExternalRfpId()))) &&
            ((this.secondaryExternalRfpId==null && other.getSecondaryExternalRfpId()==null) || 
             (this.secondaryExternalRfpId!=null &&
              this.secondaryExternalRfpId.equals(other.getSecondaryExternalRfpId()))) &&
            ((this.siteId==null && other.getSiteId()==null) || 
             (this.siteId!=null &&
              this.siteId.equals(other.getSiteId()))) &&
            ((this.businessDataType==null && other.getBusinessDataType()==null) || 
             (this.businessDataType!=null &&
              this.businessDataType.equals(other.getBusinessDataType()))) &&
            ((this.includeBusinessLockStatus==null && other.getIncludeBusinessLockStatus()==null) || 
             (this.includeBusinessLockStatus!=null &&
              this.includeBusinessLockStatus.equals(other.getIncludeBusinessLockStatus())));
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
        if (getNotificationId() != null) {
            _hashCode += getNotificationId().hashCode();
        }
        if (getExternalRfpId() != null) {
            _hashCode += getExternalRfpId().hashCode();
        }
        if (getSecondaryExternalRfpId() != null) {
            _hashCode += getSecondaryExternalRfpId().hashCode();
        }
        if (getSiteId() != null) {
            _hashCode += getSiteId().hashCode();
        }
        if (getBusinessDataType() != null) {
            _hashCode += getBusinessDataType().hashCode();
        }
        if (getIncludeBusinessLockStatus() != null) {
            _hashCode += getIncludeBusinessLockStatus().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetBusinessDataInfoRQ.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "GetBusinessDataInfoRQ"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("notificationId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "NotificationId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("externalRfpId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "ExternalRfpId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
        elemField.setFieldName("siteId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "SiteId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("businessDataType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "BusinessDataType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "BusinessDataType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("includeBusinessLockStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "IncludeBusinessLockStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
