/**
 * RfpBookingLinkRQ.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package localhost.MeetingBrokerServices;

public class RfpBookingLinkRQ  extends localhost.MeetingBrokerServices.Request  implements java.io.Serializable {
    private localhost.MeetingBrokerServices.RfpBookingLink rfpBookingLink;

    public RfpBookingLinkRQ() {
    }

    public RfpBookingLinkRQ(
           java.lang.String documentId,
           java.lang.String transactionId,
           java.util.Calendar documentDate,
           java.util.Calendar receivedTime,
           java.lang.String userGuid,
           java.lang.String requestMetaDataGuid,
           localhost.MeetingBrokerServices.RfpBookingLink rfpBookingLink) {
        super(
            documentId,
            transactionId,
            documentDate,
            receivedTime,
            userGuid,
            requestMetaDataGuid);
        this.rfpBookingLink = rfpBookingLink;
    }


    /**
     * Gets the rfpBookingLink value for this RfpBookingLinkRQ.
     * 
     * @return rfpBookingLink
     */
    public localhost.MeetingBrokerServices.RfpBookingLink getRfpBookingLink() {
        return rfpBookingLink;
    }


    /**
     * Sets the rfpBookingLink value for this RfpBookingLinkRQ.
     * 
     * @param rfpBookingLink
     */
    public void setRfpBookingLink(localhost.MeetingBrokerServices.RfpBookingLink rfpBookingLink) {
        this.rfpBookingLink = rfpBookingLink;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RfpBookingLinkRQ)) return false;
        RfpBookingLinkRQ other = (RfpBookingLinkRQ) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.rfpBookingLink==null && other.getRfpBookingLink()==null) || 
             (this.rfpBookingLink!=null &&
              this.rfpBookingLink.equals(other.getRfpBookingLink())));
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
        if (getRfpBookingLink() != null) {
            _hashCode += getRfpBookingLink().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RfpBookingLinkRQ.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "RfpBookingLinkRQ"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rfpBookingLink");
        elemField.setXmlName(new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "RfpBookingLink"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "RfpBookingLink"));
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
