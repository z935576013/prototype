/**
 * ResponseSentRQ.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package localhost.MeetingBrokerServices;

public class ResponseSentRQ  extends localhost.MeetingBrokerServices.Request  implements java.io.Serializable {
    private localhost.MeetingBrokerServices.ResponseType responseType;

    private java.util.Calendar responseSentDate;

    private localhost.MeetingBrokerServices.ResponseSentRQResponseData responseData;

    private java.math.BigInteger rfpId;

    private localhost.MeetingBrokerServices.ResponseSentRQExternalRfpIdentification externalRfpIdentification;

    private java.lang.String externalBusinessId;

    private localhost.MeetingBrokerServices.ExternalProposalDetail externalProposalDetail;

    public ResponseSentRQ() {
    }

    public ResponseSentRQ(
           java.lang.String documentId,
           java.lang.String transactionId,
           java.util.Calendar documentDate,
           java.util.Calendar receivedTime,
           java.lang.String userGuid,
           java.lang.String requestMetaDataGuid,
           localhost.MeetingBrokerServices.ResponseType responseType,
           java.util.Calendar responseSentDate,
           localhost.MeetingBrokerServices.ResponseSentRQResponseData responseData,
           java.math.BigInteger rfpId,
           localhost.MeetingBrokerServices.ResponseSentRQExternalRfpIdentification externalRfpIdentification,
           java.lang.String externalBusinessId,
           localhost.MeetingBrokerServices.ExternalProposalDetail externalProposalDetail) {
        super(
            documentId,
            transactionId,
            documentDate,
            receivedTime,
            userGuid,
            requestMetaDataGuid);
        this.responseType = responseType;
        this.responseSentDate = responseSentDate;
        this.responseData = responseData;
        this.rfpId = rfpId;
        this.externalRfpIdentification = externalRfpIdentification;
        this.externalBusinessId = externalBusinessId;
        this.externalProposalDetail = externalProposalDetail;
    }


    /**
     * Gets the responseType value for this ResponseSentRQ.
     * 
     * @return responseType
     */
    public localhost.MeetingBrokerServices.ResponseType getResponseType() {
        return responseType;
    }


    /**
     * Sets the responseType value for this ResponseSentRQ.
     * 
     * @param responseType
     */
    public void setResponseType(localhost.MeetingBrokerServices.ResponseType responseType) {
        this.responseType = responseType;
    }


    /**
     * Gets the responseSentDate value for this ResponseSentRQ.
     * 
     * @return responseSentDate
     */
    public java.util.Calendar getResponseSentDate() {
        return responseSentDate;
    }


    /**
     * Sets the responseSentDate value for this ResponseSentRQ.
     * 
     * @param responseSentDate
     */
    public void setResponseSentDate(java.util.Calendar responseSentDate) {
        this.responseSentDate = responseSentDate;
    }


    /**
     * Gets the responseData value for this ResponseSentRQ.
     * 
     * @return responseData
     */
    public localhost.MeetingBrokerServices.ResponseSentRQResponseData getResponseData() {
        return responseData;
    }


    /**
     * Sets the responseData value for this ResponseSentRQ.
     * 
     * @param responseData
     */
    public void setResponseData(localhost.MeetingBrokerServices.ResponseSentRQResponseData responseData) {
        this.responseData = responseData;
    }


    /**
     * Gets the rfpId value for this ResponseSentRQ.
     * 
     * @return rfpId
     */
    public java.math.BigInteger getRfpId() {
        return rfpId;
    }


    /**
     * Sets the rfpId value for this ResponseSentRQ.
     * 
     * @param rfpId
     */
    public void setRfpId(java.math.BigInteger rfpId) {
        this.rfpId = rfpId;
    }


    /**
     * Gets the externalRfpIdentification value for this ResponseSentRQ.
     * 
     * @return externalRfpIdentification
     */
    public localhost.MeetingBrokerServices.ResponseSentRQExternalRfpIdentification getExternalRfpIdentification() {
        return externalRfpIdentification;
    }


    /**
     * Sets the externalRfpIdentification value for this ResponseSentRQ.
     * 
     * @param externalRfpIdentification
     */
    public void setExternalRfpIdentification(localhost.MeetingBrokerServices.ResponseSentRQExternalRfpIdentification externalRfpIdentification) {
        this.externalRfpIdentification = externalRfpIdentification;
    }


    /**
     * Gets the externalBusinessId value for this ResponseSentRQ.
     * 
     * @return externalBusinessId
     */
    public java.lang.String getExternalBusinessId() {
        return externalBusinessId;
    }


    /**
     * Sets the externalBusinessId value for this ResponseSentRQ.
     * 
     * @param externalBusinessId
     */
    public void setExternalBusinessId(java.lang.String externalBusinessId) {
        this.externalBusinessId = externalBusinessId;
    }


    /**
     * Gets the externalProposalDetail value for this ResponseSentRQ.
     * 
     * @return externalProposalDetail
     */
    public localhost.MeetingBrokerServices.ExternalProposalDetail getExternalProposalDetail() {
        return externalProposalDetail;
    }


    /**
     * Sets the externalProposalDetail value for this ResponseSentRQ.
     * 
     * @param externalProposalDetail
     */
    public void setExternalProposalDetail(localhost.MeetingBrokerServices.ExternalProposalDetail externalProposalDetail) {
        this.externalProposalDetail = externalProposalDetail;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ResponseSentRQ)) return false;
        ResponseSentRQ other = (ResponseSentRQ) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.responseType==null && other.getResponseType()==null) || 
             (this.responseType!=null &&
              this.responseType.equals(other.getResponseType()))) &&
            ((this.responseSentDate==null && other.getResponseSentDate()==null) || 
             (this.responseSentDate!=null &&
              this.responseSentDate.equals(other.getResponseSentDate()))) &&
            ((this.responseData==null && other.getResponseData()==null) || 
             (this.responseData!=null &&
              this.responseData.equals(other.getResponseData()))) &&
            ((this.rfpId==null && other.getRfpId()==null) || 
             (this.rfpId!=null &&
              this.rfpId.equals(other.getRfpId()))) &&
            ((this.externalRfpIdentification==null && other.getExternalRfpIdentification()==null) || 
             (this.externalRfpIdentification!=null &&
              this.externalRfpIdentification.equals(other.getExternalRfpIdentification()))) &&
            ((this.externalBusinessId==null && other.getExternalBusinessId()==null) || 
             (this.externalBusinessId!=null &&
              this.externalBusinessId.equals(other.getExternalBusinessId()))) &&
            ((this.externalProposalDetail==null && other.getExternalProposalDetail()==null) || 
             (this.externalProposalDetail!=null &&
              this.externalProposalDetail.equals(other.getExternalProposalDetail())));
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
        if (getResponseType() != null) {
            _hashCode += getResponseType().hashCode();
        }
        if (getResponseSentDate() != null) {
            _hashCode += getResponseSentDate().hashCode();
        }
        if (getResponseData() != null) {
            _hashCode += getResponseData().hashCode();
        }
        if (getRfpId() != null) {
            _hashCode += getRfpId().hashCode();
        }
        if (getExternalRfpIdentification() != null) {
            _hashCode += getExternalRfpIdentification().hashCode();
        }
        if (getExternalBusinessId() != null) {
            _hashCode += getExternalBusinessId().hashCode();
        }
        if (getExternalProposalDetail() != null) {
            _hashCode += getExternalProposalDetail().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ResponseSentRQ.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "ResponseSentRQ"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("responseType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "ResponseType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "ResponseType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("responseSentDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "ResponseSentDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("responseData");
        elemField.setXmlName(new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "ResponseData"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", ">ResponseSentRQ>ResponseData"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rfpId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "RfpId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "integer"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("externalRfpIdentification");
        elemField.setXmlName(new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "ExternalRfpIdentification"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", ">ResponseSentRQ>ExternalRfpIdentification"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("externalBusinessId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "ExternalBusinessId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("externalProposalDetail");
        elemField.setXmlName(new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "ExternalProposalDetail"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "ExternalProposalDetail"));
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
