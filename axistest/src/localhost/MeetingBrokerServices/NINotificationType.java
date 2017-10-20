/**
 * NINotificationType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package localhost.MeetingBrokerServices;

public class NINotificationType implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected NINotificationType(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _CreateBusinessInitiated = "CreateBusinessInitiated";
    public static final java.lang.String _ProposalSent = "ProposalSent";
    public static final java.lang.String _BusinessStatusChanged = "BusinessStatusChanged";
    public static final java.lang.String _RfpCreated = "RfpCreated";
    public static final java.lang.String _RfpViewed = "RfpViewed";
    public static final java.lang.String _PickedUpBusinessDataUpdated = "PickedUpBusinessDataUpdated";
    public static final java.lang.String _AgreedBusinessDataUpdated = "AgreedBusinessDataUpdated";
    public static final java.lang.String _BlockedBusinessDataUpdated = "BlockedBusinessDataUpdated";
    public static final java.lang.String _ActualBusinessDataUpdated = "ActualBusinessDataUpdated";
    public static final java.lang.String _BusinessOwnerChanged = "BusinessOwnerChanged";
    public static final java.lang.String _BusinessDataIsCompleteChanged = "BusinessDataIsCompleteChanged";
    public static final java.lang.String _HeartBeat = "HeartBeat";
    public static final java.lang.String _LocationUpdated = "LocationUpdated";
    public static final java.lang.String _RfpOwnerChanged = "RfpOwnerChanged";
    public static final java.lang.String _BusinessDataInfoUpdateFailed = "BusinessDataInfoUpdateFailed";
    public static final java.lang.String _BusinessDataInfoUpdated = "BusinessDataInfoUpdated";
    public static final NINotificationType CreateBusinessInitiated = new NINotificationType(_CreateBusinessInitiated);
    public static final NINotificationType ProposalSent = new NINotificationType(_ProposalSent);
    public static final NINotificationType BusinessStatusChanged = new NINotificationType(_BusinessStatusChanged);
    public static final NINotificationType RfpCreated = new NINotificationType(_RfpCreated);
    public static final NINotificationType RfpViewed = new NINotificationType(_RfpViewed);
    public static final NINotificationType PickedUpBusinessDataUpdated = new NINotificationType(_PickedUpBusinessDataUpdated);
    public static final NINotificationType AgreedBusinessDataUpdated = new NINotificationType(_AgreedBusinessDataUpdated);
    public static final NINotificationType BlockedBusinessDataUpdated = new NINotificationType(_BlockedBusinessDataUpdated);
    public static final NINotificationType ActualBusinessDataUpdated = new NINotificationType(_ActualBusinessDataUpdated);
    public static final NINotificationType BusinessOwnerChanged = new NINotificationType(_BusinessOwnerChanged);
    public static final NINotificationType BusinessDataIsCompleteChanged = new NINotificationType(_BusinessDataIsCompleteChanged);
    public static final NINotificationType HeartBeat = new NINotificationType(_HeartBeat);
    public static final NINotificationType LocationUpdated = new NINotificationType(_LocationUpdated);
    public static final NINotificationType RfpOwnerChanged = new NINotificationType(_RfpOwnerChanged);
    public static final NINotificationType BusinessDataInfoUpdateFailed = new NINotificationType(_BusinessDataInfoUpdateFailed);
    public static final NINotificationType BusinessDataInfoUpdated = new NINotificationType(_BusinessDataInfoUpdated);
    public java.lang.String getValue() { return _value_;}
    public static NINotificationType fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        NINotificationType enumeration = (NINotificationType)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static NINotificationType fromString(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        return fromValue(value);
    }
    public boolean equals(java.lang.Object obj) {return (obj == this);}
    public int hashCode() { return toString().hashCode();}
    public java.lang.String toString() { return _value_;}
    public java.lang.Object readResolve() throws java.io.ObjectStreamException { return fromValue(_value_);}
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new org.apache.axis.encoding.ser.EnumSerializer(
            _javaType, _xmlType);
    }
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new org.apache.axis.encoding.ser.EnumDeserializer(
            _javaType, _xmlType);
    }
    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(NINotificationType.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "NINotificationType"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
