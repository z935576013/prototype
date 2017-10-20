/**
 * ResponseSentRQExternalRfpIdentification.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package localhost.MeetingBrokerServices;

public class ResponseSentRQExternalRfpIdentification  implements java.io.Serializable {
    private java.lang.String externalRfpId;

    private localhost.MeetingBrokerServices.LocationIdentifier locationIdentifier;

    private java.lang.String secondaryExternalRfpId;

    public ResponseSentRQExternalRfpIdentification() {
    }

    public ResponseSentRQExternalRfpIdentification(
           java.lang.String externalRfpId,
           localhost.MeetingBrokerServices.LocationIdentifier locationIdentifier,
           java.lang.String secondaryExternalRfpId) {
           this.externalRfpId = externalRfpId;
           this.locationIdentifier = locationIdentifier;
           this.secondaryExternalRfpId = secondaryExternalRfpId;
    }


    /**
     * Gets the externalRfpId value for this ResponseSentRQExternalRfpIdentification.
     * 
     * @return externalRfpId
     */
    public java.lang.String getExternalRfpId() {
        return externalRfpId;
    }


    /**
     * Sets the externalRfpId value for this ResponseSentRQExternalRfpIdentification.
     * 
     * @param externalRfpId
     */
    public void setExternalRfpId(java.lang.String externalRfpId) {
        this.externalRfpId = externalRfpId;
    }


    /**
     * Gets the locationIdentifier value for this ResponseSentRQExternalRfpIdentification.
     * 
     * @return locationIdentifier
     */
    public localhost.MeetingBrokerServices.LocationIdentifier getLocationIdentifier() {
        return locationIdentifier;
    }


    /**
     * Sets the locationIdentifier value for this ResponseSentRQExternalRfpIdentification.
     * 
     * @param locationIdentifier
     */
    public void setLocationIdentifier(localhost.MeetingBrokerServices.LocationIdentifier locationIdentifier) {
        this.locationIdentifier = locationIdentifier;
    }


    /**
     * Gets the secondaryExternalRfpId value for this ResponseSentRQExternalRfpIdentification.
     * 
     * @return secondaryExternalRfpId
     */
    public java.lang.String getSecondaryExternalRfpId() {
        return secondaryExternalRfpId;
    }


    /**
     * Sets the secondaryExternalRfpId value for this ResponseSentRQExternalRfpIdentification.
     * 
     * @param secondaryExternalRfpId
     */
    public void setSecondaryExternalRfpId(java.lang.String secondaryExternalRfpId) {
        this.secondaryExternalRfpId = secondaryExternalRfpId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ResponseSentRQExternalRfpIdentification)) return false;
        ResponseSentRQExternalRfpIdentification other = (ResponseSentRQExternalRfpIdentification) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.externalRfpId==null && other.getExternalRfpId()==null) || 
             (this.externalRfpId!=null &&
              this.externalRfpId.equals(other.getExternalRfpId()))) &&
            ((this.locationIdentifier==null && other.getLocationIdentifier()==null) || 
             (this.locationIdentifier!=null &&
              this.locationIdentifier.equals(other.getLocationIdentifier()))) &&
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
        int _hashCode = 1;
        if (getExternalRfpId() != null) {
            _hashCode += getExternalRfpId().hashCode();
        }
        if (getLocationIdentifier() != null) {
            _hashCode += getLocationIdentifier().hashCode();
        }
        if (getSecondaryExternalRfpId() != null) {
            _hashCode += getSecondaryExternalRfpId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ResponseSentRQExternalRfpIdentification.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", ">ResponseSentRQ>ExternalRfpIdentification"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("externalRfpId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "ExternalRfpId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("locationIdentifier");
        elemField.setXmlName(new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "LocationIdentifier"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "LocationIdentifier"));
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
