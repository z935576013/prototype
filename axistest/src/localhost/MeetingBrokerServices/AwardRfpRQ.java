/**
 * AwardRfpRQ.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package localhost.MeetingBrokerServices;

public class AwardRfpRQ  extends localhost.MeetingBrokerServices.Request  implements java.io.Serializable {
    private java.lang.String rfpId;

    private int siteId;

    private java.util.Calendar startDate;

    private localhost.MeetingBrokerServices.Message message;

    public AwardRfpRQ() {
    }

    public AwardRfpRQ(
           java.lang.String documentId,
           java.lang.String transactionId,
           java.util.Calendar documentDate,
           java.util.Calendar receivedTime,
           java.lang.String userGuid,
           java.lang.String requestMetaDataGuid,
           java.lang.String rfpId,
           int siteId,
           java.util.Calendar startDate,
           localhost.MeetingBrokerServices.Message message) {
        super(
            documentId,
            transactionId,
            documentDate,
            receivedTime,
            userGuid,
            requestMetaDataGuid);
        this.rfpId = rfpId;
        this.siteId = siteId;
        this.startDate = startDate;
        this.message = message;
    }


    /**
     * Gets the rfpId value for this AwardRfpRQ.
     * 
     * @return rfpId
     */
    public java.lang.String getRfpId() {
        return rfpId;
    }


    /**
     * Sets the rfpId value for this AwardRfpRQ.
     * 
     * @param rfpId
     */
    public void setRfpId(java.lang.String rfpId) {
        this.rfpId = rfpId;
    }


    /**
     * Gets the siteId value for this AwardRfpRQ.
     * 
     * @return siteId
     */
    public int getSiteId() {
        return siteId;
    }


    /**
     * Sets the siteId value for this AwardRfpRQ.
     * 
     * @param siteId
     */
    public void setSiteId(int siteId) {
        this.siteId = siteId;
    }


    /**
     * Gets the startDate value for this AwardRfpRQ.
     * 
     * @return startDate
     */
    public java.util.Calendar getStartDate() {
        return startDate;
    }


    /**
     * Sets the startDate value for this AwardRfpRQ.
     * 
     * @param startDate
     */
    public void setStartDate(java.util.Calendar startDate) {
        this.startDate = startDate;
    }


    /**
     * Gets the message value for this AwardRfpRQ.
     * 
     * @return message
     */
    public localhost.MeetingBrokerServices.Message getMessage() {
        return message;
    }


    /**
     * Sets the message value for this AwardRfpRQ.
     * 
     * @param message
     */
    public void setMessage(localhost.MeetingBrokerServices.Message message) {
        this.message = message;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AwardRfpRQ)) return false;
        AwardRfpRQ other = (AwardRfpRQ) obj;
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
            ((this.startDate==null && other.getStartDate()==null) || 
             (this.startDate!=null &&
              this.startDate.equals(other.getStartDate()))) &&
            ((this.message==null && other.getMessage()==null) || 
             (this.message!=null &&
              this.message.equals(other.getMessage())));
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
        if (getStartDate() != null) {
            _hashCode += getStartDate().hashCode();
        }
        if (getMessage() != null) {
            _hashCode += getMessage().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AwardRfpRQ.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "AwardRfpRQ"));
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
        elemField.setFieldName("startDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "StartDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("message");
        elemField.setXmlName(new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "Message"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "Message"));
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
