/**
 * CreateMeetingRS.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package localhost.MeetingBrokerServices;

public class CreateMeetingRS  extends localhost.MeetingBrokerServices.Acknowledgement  implements java.io.Serializable {
    private java.lang.String meetingURL;

    public CreateMeetingRS() {
    }

    public CreateMeetingRS(
           java.lang.String documentId,
           java.lang.String transactionId,
           java.util.Calendar documentDate,
           java.util.Calendar receivedTime,
           java.lang.String userGuid,
           java.lang.String requestMetaDataGuid,
           localhost.MeetingBrokerServices.AcknowledgementStatusCode statusCode,
           boolean success,
           localhost.MeetingBrokerServices.Error[] errors,
           java.lang.String meetingURL) {
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
        this.meetingURL = meetingURL;
    }


    /**
     * Gets the meetingURL value for this CreateMeetingRS.
     * 
     * @return meetingURL
     */
    public java.lang.String getMeetingURL() {
        return meetingURL;
    }


    /**
     * Sets the meetingURL value for this CreateMeetingRS.
     * 
     * @param meetingURL
     */
    public void setMeetingURL(java.lang.String meetingURL) {
        this.meetingURL = meetingURL;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CreateMeetingRS)) return false;
        CreateMeetingRS other = (CreateMeetingRS) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.meetingURL==null && other.getMeetingURL()==null) || 
             (this.meetingURL!=null &&
              this.meetingURL.equals(other.getMeetingURL())));
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
        if (getMeetingURL() != null) {
            _hashCode += getMeetingURL().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CreateMeetingRS.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "CreateMeetingRS"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("meetingURL");
        elemField.setXmlName(new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "MeetingURL"));
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
