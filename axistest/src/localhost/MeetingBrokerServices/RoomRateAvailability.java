/**
 * RoomRateAvailability.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package localhost.MeetingBrokerServices;

public class RoomRateAvailability  implements java.io.Serializable {
    private int occupancy;

    private java.math.BigDecimal roomRate;

    public RoomRateAvailability() {
    }

    public RoomRateAvailability(
           int occupancy,
           java.math.BigDecimal roomRate) {
           this.occupancy = occupancy;
           this.roomRate = roomRate;
    }


    /**
     * Gets the occupancy value for this RoomRateAvailability.
     * 
     * @return occupancy
     */
    public int getOccupancy() {
        return occupancy;
    }


    /**
     * Sets the occupancy value for this RoomRateAvailability.
     * 
     * @param occupancy
     */
    public void setOccupancy(int occupancy) {
        this.occupancy = occupancy;
    }


    /**
     * Gets the roomRate value for this RoomRateAvailability.
     * 
     * @return roomRate
     */
    public java.math.BigDecimal getRoomRate() {
        return roomRate;
    }


    /**
     * Sets the roomRate value for this RoomRateAvailability.
     * 
     * @param roomRate
     */
    public void setRoomRate(java.math.BigDecimal roomRate) {
        this.roomRate = roomRate;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RoomRateAvailability)) return false;
        RoomRateAvailability other = (RoomRateAvailability) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.occupancy == other.getOccupancy() &&
            ((this.roomRate==null && other.getRoomRate()==null) || 
             (this.roomRate!=null &&
              this.roomRate.equals(other.getRoomRate())));
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
        _hashCode += getOccupancy();
        if (getRoomRate() != null) {
            _hashCode += getRoomRate().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RoomRateAvailability.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "RoomRateAvailability"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("occupancy");
        elemField.setXmlName(new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "Occupancy"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("roomRate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "RoomRate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
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
