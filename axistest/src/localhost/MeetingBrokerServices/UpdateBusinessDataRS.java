/**
 * UpdateBusinessDataRS.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package localhost.MeetingBrokerServices;

public class UpdateBusinessDataRS  extends localhost.MeetingBrokerServices.Acknowledgement  implements java.io.Serializable {
    private java.lang.String externalRfpId;

    private java.lang.String secondaryExternalRfpId;

    public UpdateBusinessDataRS() {
    }

    public UpdateBusinessDataRS(
           java.lang.String documentId,
           java.lang.String transactionId,
           java.util.Calendar documentDate,
           java.util.Calendar receivedTime,
           java.lang.String userGuid,
           java.lang.String requestMetaDataGuid,
           localhost.MeetingBrokerServices.AcknowledgementStatusCode statusCode,
           boolean success,
           localhost.MeetingBrokerServices.Error[] errors,
           java.lang.String externalRfpId,
           java.lang.String secondaryExternalRfpId) {
        super(
            documentId,
            transactionId,
            documentDate,
            receivedTime,
            userGuid,
            requestMetaDataGuid,
            statusCode,
            success,
            errors);
        this.externalRfpId = externalRfpId;
        this.secondaryExternalRfpId = secondaryExternalRfpId;
    }


    /**
     * Gets the externalRfpId value for this UpdateBusinessDataRS.
     * 
     * @return externalRfpId
     */
    public java.lang.String getExternalRfpId() {
        return externalRfpId;
    }


    /**
     * Sets the externalRfpId value for this UpdateBusinessDataRS.
     * 
     * @param externalRfpId
     */
    public void setExternalRfpId(java.lang.String externalRfpId) {
        this.externalRfpId = externalRfpId;
    }


    /**
     * Gets the secondaryExternalRfpId value for this UpdateBusinessDataRS.
     * 
     * @return secondaryExternalRfpId
     */
    public java.lang.String getSecondaryExternalRfpId() {
        return secondaryExternalRfpId;
    }


    /**
     * Sets the secondaryExternalRfpId value for this UpdateBusinessDataRS.
     * 
     * @param secondaryExternalRfpId
     */
    public void setSecondaryExternalRfpId(java.lang.String secondaryExternalRfpId) {
        this.secondaryExternalRfpId = secondaryExternalRfpId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof UpdateBusinessDataRS)) return false;
        UpdateBusinessDataRS other = (UpdateBusinessDataRS) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.externalRfpId==null && other.getExternalRfpId()==null) || 
             (this.externalRfpId!=null &&
              this.externalRfpId.equals(other.getExternalRfpId()))) &&
            ((this.secondaryExternalRfpId==null && other.getSecondaryExternalRfpId()==null) || 
             (this.secondaryExternalRfpId!=null &&
              this.secondaryExternalRfpId.equals(other.getSecondaryExternalRfpId())));
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
        if (getExternalRfpId() != null) {
            _hashCode += getExternalRfpId().hashCode();
        }
        if (getSecondaryExternalRfpId() != null) {
            _hashCode += getSecondaryExternalRfpId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(UpdateBusinessDataRS.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "UpdateBusinessDataRS"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
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
