/**
 * LocationIdentifiers.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package localhost.MeetingBrokerServices;

public class LocationIdentifiers  implements java.io.Serializable {
    private java.lang.String MBLocationId;

    private java.lang.String externalLocationId;

    private java.lang.String locationCode;

    private java.lang.String hotelUGI;

    public LocationIdentifiers() {
    }

    public LocationIdentifiers(
           java.lang.String MBLocationId,
           java.lang.String externalLocationId,
           java.lang.String locationCode,
           java.lang.String hotelUGI) {
           this.MBLocationId = MBLocationId;
           this.externalLocationId = externalLocationId;
           this.locationCode = locationCode;
           this.hotelUGI = hotelUGI;
    }


    /**
     * Gets the MBLocationId value for this LocationIdentifiers.
     * 
     * @return MBLocationId
     */
    public java.lang.String getMBLocationId() {
        return MBLocationId;
    }


    /**
     * Sets the MBLocationId value for this LocationIdentifiers.
     * 
     * @param MBLocationId
     */
    public void setMBLocationId(java.lang.String MBLocationId) {
        this.MBLocationId = MBLocationId;
    }


    /**
     * Gets the externalLocationId value for this LocationIdentifiers.
     * 
     * @return externalLocationId
     */
    public java.lang.String getExternalLocationId() {
        return externalLocationId;
    }


    /**
     * Sets the externalLocationId value for this LocationIdentifiers.
     * 
     * @param externalLocationId
     */
    public void setExternalLocationId(java.lang.String externalLocationId) {
        this.externalLocationId = externalLocationId;
    }


    /**
     * Gets the locationCode value for this LocationIdentifiers.
     * 
     * @return locationCode
     */
    public java.lang.String getLocationCode() {
        return locationCode;
    }


    /**
     * Sets the locationCode value for this LocationIdentifiers.
     * 
     * @param locationCode
     */
    public void setLocationCode(java.lang.String locationCode) {
        this.locationCode = locationCode;
    }


    /**
     * Gets the hotelUGI value for this LocationIdentifiers.
     * 
     * @return hotelUGI
     */
    public java.lang.String getHotelUGI() {
        return hotelUGI;
    }


    /**
     * Sets the hotelUGI value for this LocationIdentifiers.
     * 
     * @param hotelUGI
     */
    public void setHotelUGI(java.lang.String hotelUGI) {
        this.hotelUGI = hotelUGI;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof LocationIdentifiers)) return false;
        LocationIdentifiers other = (LocationIdentifiers) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.MBLocationId==null && other.getMBLocationId()==null) || 
             (this.MBLocationId!=null &&
              this.MBLocationId.equals(other.getMBLocationId()))) &&
            ((this.externalLocationId==null && other.getExternalLocationId()==null) || 
             (this.externalLocationId!=null &&
              this.externalLocationId.equals(other.getExternalLocationId()))) &&
            ((this.locationCode==null && other.getLocationCode()==null) || 
             (this.locationCode!=null &&
              this.locationCode.equals(other.getLocationCode()))) &&
            ((this.hotelUGI==null && other.getHotelUGI()==null) || 
             (this.hotelUGI!=null &&
              this.hotelUGI.equals(other.getHotelUGI())));
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
        if (getMBLocationId() != null) {
            _hashCode += getMBLocationId().hashCode();
        }
        if (getExternalLocationId() != null) {
            _hashCode += getExternalLocationId().hashCode();
        }
        if (getLocationCode() != null) {
            _hashCode += getLocationCode().hashCode();
        }
        if (getHotelUGI() != null) {
            _hashCode += getHotelUGI().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(LocationIdentifiers.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "LocationIdentifiers"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("MBLocationId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "MBLocationId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("externalLocationId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "ExternalLocationId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("locationCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "LocationCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hotelUGI");
        elemField.setXmlName(new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "HotelUGI"));
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
