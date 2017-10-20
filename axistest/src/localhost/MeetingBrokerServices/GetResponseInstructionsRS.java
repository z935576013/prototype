/**
 * GetResponseInstructionsRS.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package localhost.MeetingBrokerServices;

public class GetResponseInstructionsRS  extends localhost.MeetingBrokerServices.Acknowledgement  implements java.io.Serializable {
    private int rfpId;

    private java.lang.String rfpGuid;

    private boolean allowResponseInstructionOverride;

    private localhost.MeetingBrokerServices.ResponseInstructionType responseInstructionType;

    private localhost.MeetingBrokerServices.Sender sender;

    public GetResponseInstructionsRS() {
    }

    public GetResponseInstructionsRS(
           java.lang.String documentId,
           java.lang.String transactionId,
           java.util.Calendar documentDate,
           java.util.Calendar receivedTime,
           java.lang.String userGuid,
           java.lang.String requestMetaDataGuid,
           localhost.MeetingBrokerServices.AcknowledgementStatusCode statusCode,
           boolean success,
           localhost.MeetingBrokerServices.Error[] errors,
           int rfpId,
           java.lang.String rfpGuid,
           boolean allowResponseInstructionOverride,
           localhost.MeetingBrokerServices.ResponseInstructionType responseInstructionType,
           localhost.MeetingBrokerServices.Sender sender) {
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
        this.rfpId = rfpId;
        this.rfpGuid = rfpGuid;
        this.allowResponseInstructionOverride = allowResponseInstructionOverride;
        this.responseInstructionType = responseInstructionType;
        this.sender = sender;
    }


    /**
     * Gets the rfpId value for this GetResponseInstructionsRS.
     * 
     * @return rfpId
     */
    public int getRfpId() {
        return rfpId;
    }


    /**
     * Sets the rfpId value for this GetResponseInstructionsRS.
     * 
     * @param rfpId
     */
    public void setRfpId(int rfpId) {
        this.rfpId = rfpId;
    }


    /**
     * Gets the rfpGuid value for this GetResponseInstructionsRS.
     * 
     * @return rfpGuid
     */
    public java.lang.String getRfpGuid() {
        return rfpGuid;
    }


    /**
     * Sets the rfpGuid value for this GetResponseInstructionsRS.
     * 
     * @param rfpGuid
     */
    public void setRfpGuid(java.lang.String rfpGuid) {
        this.rfpGuid = rfpGuid;
    }


    /**
     * Gets the allowResponseInstructionOverride value for this GetResponseInstructionsRS.
     * 
     * @return allowResponseInstructionOverride
     */
    public boolean isAllowResponseInstructionOverride() {
        return allowResponseInstructionOverride;
    }


    /**
     * Sets the allowResponseInstructionOverride value for this GetResponseInstructionsRS.
     * 
     * @param allowResponseInstructionOverride
     */
    public void setAllowResponseInstructionOverride(boolean allowResponseInstructionOverride) {
        this.allowResponseInstructionOverride = allowResponseInstructionOverride;
    }


    /**
     * Gets the responseInstructionType value for this GetResponseInstructionsRS.
     * 
     * @return responseInstructionType
     */
    public localhost.MeetingBrokerServices.ResponseInstructionType getResponseInstructionType() {
        return responseInstructionType;
    }


    /**
     * Sets the responseInstructionType value for this GetResponseInstructionsRS.
     * 
     * @param responseInstructionType
     */
    public void setResponseInstructionType(localhost.MeetingBrokerServices.ResponseInstructionType responseInstructionType) {
        this.responseInstructionType = responseInstructionType;
    }


    /**
     * Gets the sender value for this GetResponseInstructionsRS.
     * 
     * @return sender
     */
    public localhost.MeetingBrokerServices.Sender getSender() {
        return sender;
    }


    /**
     * Sets the sender value for this GetResponseInstructionsRS.
     * 
     * @param sender
     */
    public void setSender(localhost.MeetingBrokerServices.Sender sender) {
        this.sender = sender;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetResponseInstructionsRS)) return false;
        GetResponseInstructionsRS other = (GetResponseInstructionsRS) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            this.rfpId == other.getRfpId() &&
            ((this.rfpGuid==null && other.getRfpGuid()==null) || 
             (this.rfpGuid!=null &&
              this.rfpGuid.equals(other.getRfpGuid()))) &&
            this.allowResponseInstructionOverride == other.isAllowResponseInstructionOverride() &&
            ((this.responseInstructionType==null && other.getResponseInstructionType()==null) || 
             (this.responseInstructionType!=null &&
              this.responseInstructionType.equals(other.getResponseInstructionType()))) &&
            ((this.sender==null && other.getSender()==null) || 
             (this.sender!=null &&
              this.sender.equals(other.getSender())));
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
        _hashCode += getRfpId();
        if (getRfpGuid() != null) {
            _hashCode += getRfpGuid().hashCode();
        }
        _hashCode += (isAllowResponseInstructionOverride() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getResponseInstructionType() != null) {
            _hashCode += getResponseInstructionType().hashCode();
        }
        if (getSender() != null) {
            _hashCode += getSender().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetResponseInstructionsRS.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "GetResponseInstructionsRS"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rfpId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "RfpId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rfpGuid");
        elemField.setXmlName(new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "RfpGuid"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("allowResponseInstructionOverride");
        elemField.setXmlName(new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "AllowResponseInstructionOverride"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("responseInstructionType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "ResponseInstructionType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "ResponseInstructionType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sender");
        elemField.setXmlName(new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "Sender"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "Sender"));
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
