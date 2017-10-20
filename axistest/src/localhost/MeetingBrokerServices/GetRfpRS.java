/**
 * GetRfpRS.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package localhost.MeetingBrokerServices;

public class GetRfpRS  extends localhost.MeetingBrokerServices.Acknowledgement  implements java.io.Serializable {
    private localhost.MeetingBrokerServices.ExternalRfp externalRfp;

    private localhost.MeetingBrokerServices.Message[] messages;

    private java.lang.String statusChangeReason;

    public GetRfpRS() {
    }

    public GetRfpRS(
           java.lang.String documentId,
           java.lang.String transactionId,
           java.util.Calendar documentDate,
           java.util.Calendar receivedTime,
           java.lang.String userGuid,
           java.lang.String requestMetaDataGuid,
           localhost.MeetingBrokerServices.AcknowledgementStatusCode statusCode,
           boolean success,
           localhost.MeetingBrokerServices.Error[] errors,
           localhost.MeetingBrokerServices.ExternalRfp externalRfp,
           localhost.MeetingBrokerServices.Message[] messages,
           java.lang.String statusChangeReason) {
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
        this.externalRfp = externalRfp;
        this.messages = messages;
        this.statusChangeReason = statusChangeReason;
    }


    /**
     * Gets the externalRfp value for this GetRfpRS.
     * 
     * @return externalRfp
     */
    public localhost.MeetingBrokerServices.ExternalRfp getExternalRfp() {
        return externalRfp;
    }


    /**
     * Sets the externalRfp value for this GetRfpRS.
     * 
     * @param externalRfp
     */
    public void setExternalRfp(localhost.MeetingBrokerServices.ExternalRfp externalRfp) {
        this.externalRfp = externalRfp;
    }


    /**
     * Gets the messages value for this GetRfpRS.
     * 
     * @return messages
     */
    public localhost.MeetingBrokerServices.Message[] getMessages() {
        return messages;
    }


    /**
     * Sets the messages value for this GetRfpRS.
     * 
     * @param messages
     */
    public void setMessages(localhost.MeetingBrokerServices.Message[] messages) {
        this.messages = messages;
    }


    /**
     * Gets the statusChangeReason value for this GetRfpRS.
     * 
     * @return statusChangeReason
     */
    public java.lang.String getStatusChangeReason() {
        return statusChangeReason;
    }


    /**
     * Sets the statusChangeReason value for this GetRfpRS.
     * 
     * @param statusChangeReason
     */
    public void setStatusChangeReason(java.lang.String statusChangeReason) {
        this.statusChangeReason = statusChangeReason;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetRfpRS)) return false;
        GetRfpRS other = (GetRfpRS) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.externalRfp==null && other.getExternalRfp()==null) || 
             (this.externalRfp!=null &&
              this.externalRfp.equals(other.getExternalRfp()))) &&
            ((this.messages==null && other.getMessages()==null) || 
             (this.messages!=null &&
              java.util.Arrays.equals(this.messages, other.getMessages()))) &&
            ((this.statusChangeReason==null && other.getStatusChangeReason()==null) || 
             (this.statusChangeReason!=null &&
              this.statusChangeReason.equals(other.getStatusChangeReason())));
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
        if (getExternalRfp() != null) {
            _hashCode += getExternalRfp().hashCode();
        }
        if (getMessages() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getMessages());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getMessages(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getStatusChangeReason() != null) {
            _hashCode += getStatusChangeReason().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetRfpRS.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "GetRfpRS"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("externalRfp");
        elemField.setXmlName(new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "ExternalRfp"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "ExternalRfp"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("messages");
        elemField.setXmlName(new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "Messages"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "Message"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "Message"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("statusChangeReason");
        elemField.setXmlName(new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "StatusChangeReason"));
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
