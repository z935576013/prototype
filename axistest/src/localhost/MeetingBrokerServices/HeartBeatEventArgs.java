/**
 * HeartBeatEventArgs.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package localhost.MeetingBrokerServices;

public class HeartBeatEventArgs  extends localhost.MeetingBrokerServices.NINotificationArgs  implements java.io.Serializable {
    private java.lang.Integer channelId;

    private localhost.MeetingBrokerServices.LocationIdentifiers locationIdentifiers;

    public HeartBeatEventArgs() {
    }

    public HeartBeatEventArgs(
           java.lang.Integer channelId,
           localhost.MeetingBrokerServices.LocationIdentifiers locationIdentifiers) {
        this.channelId = channelId;
        this.locationIdentifiers = locationIdentifiers;
    }


    /**
     * Gets the channelId value for this HeartBeatEventArgs.
     * 
     * @return channelId
     */
    public java.lang.Integer getChannelId() {
        return channelId;
    }


    /**
     * Sets the channelId value for this HeartBeatEventArgs.
     * 
     * @param channelId
     */
    public void setChannelId(java.lang.Integer channelId) {
        this.channelId = channelId;
    }


    /**
     * Gets the locationIdentifiers value for this HeartBeatEventArgs.
     * 
     * @return locationIdentifiers
     */
    public localhost.MeetingBrokerServices.LocationIdentifiers getLocationIdentifiers() {
        return locationIdentifiers;
    }


    /**
     * Sets the locationIdentifiers value for this HeartBeatEventArgs.
     * 
     * @param locationIdentifiers
     */
    public void setLocationIdentifiers(localhost.MeetingBrokerServices.LocationIdentifiers locationIdentifiers) {
        this.locationIdentifiers = locationIdentifiers;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof HeartBeatEventArgs)) return false;
        HeartBeatEventArgs other = (HeartBeatEventArgs) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.channelId==null && other.getChannelId()==null) || 
             (this.channelId!=null &&
              this.channelId.equals(other.getChannelId()))) &&
            ((this.locationIdentifiers==null && other.getLocationIdentifiers()==null) || 
             (this.locationIdentifiers!=null &&
              this.locationIdentifiers.equals(other.getLocationIdentifiers())));
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
        if (getChannelId() != null) {
            _hashCode += getChannelId().hashCode();
        }
        if (getLocationIdentifiers() != null) {
            _hashCode += getLocationIdentifiers().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(HeartBeatEventArgs.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "HeartBeatEventArgs"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("channelId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "ChannelId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("locationIdentifiers");
        elemField.setXmlName(new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "LocationIdentifiers"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "LocationIdentifiers"));
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
