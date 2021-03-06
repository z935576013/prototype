/**
 * CancelRfpRQ.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package localhost.MeetingBrokerServices;

public class CancelRfpRQ  extends localhost.MeetingBrokerServices.Request  implements java.io.Serializable {
    private java.lang.String rfpId;

    private localhost.MeetingBrokerServices.Message message;

    public CancelRfpRQ() {
    }

    public CancelRfpRQ(
           java.lang.String documentId,
           java.lang.String transactionId,
           java.util.Calendar documentDate,
           java.util.Calendar receivedTime,
           java.lang.String userGuid,
           java.lang.String requestMetaDataGuid,
           java.lang.String rfpId,
           localhost.MeetingBrokerServices.Message message) {
        super(
            documentId,
            transactionId,
            documentDate,
            receivedTime,
            userGuid,
            requestMetaDataGuid);
        this.rfpId = rfpId;
        this.message = message;
    }


    /**
     * Gets the rfpId value for this CancelRfpRQ.
     * 
     * @return rfpId
     */
    public java.lang.String getRfpId() {
        return rfpId;
    }


    /**
     * Sets the rfpId value for this CancelRfpRQ.
     * 
     * @param rfpId
     */
    public void setRfpId(java.lang.String rfpId) {
        this.rfpId = rfpId;
    }


    /**
     * Gets the message value for this CancelRfpRQ.
     * 
     * @return message
     */
    public localhost.MeetingBrokerServices.Message getMessage() {
        return message;
    }


    /**
     * Sets the message value for this CancelRfpRQ.
     * 
     * @param message
     */
    public void setMessage(localhost.MeetingBrokerServices.Message message) {
        this.message = message;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CancelRfpRQ)) return false;
        CancelRfpRQ other = (CancelRfpRQ) obj;
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
        if (getMessage() != null) {
            _hashCode += getMessage().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CancelRfpRQ.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "CancelRfpRQ"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rfpId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "RfpId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
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
