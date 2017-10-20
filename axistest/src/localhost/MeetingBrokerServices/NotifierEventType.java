/**
 * NotifierEventType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package localhost.MeetingBrokerServices;

public class NotifierEventType implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected NotifierEventType(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _CreateBusinessInitiated = "CreateBusinessInitiated";
    public static final java.lang.String _UpdateBusinessInitiated = "UpdateBusinessInitiated";
    public static final java.lang.String _ProposalSent = "ProposalSent";
    public static final java.lang.String _RfpTurnedDown = "RfpTurnedDown";
    public static final java.lang.String _UpdateAgreedBusinessData = "UpdateAgreedBusinessData";
    public static final java.lang.String _UpdateActualBusinessData = "UpdateActualBusinessData";
    public static final java.lang.String _RfpViewed = "RfpViewed";
    public static final java.lang.String _ProposalSelfAwarded = "ProposalSelfAwarded";
    public static final java.lang.String _RfpWithdrawn = "RfpWithdrawn";
    public static final java.lang.String _RfpCancelled = "RfpCancelled";
    public static final java.lang.String _RfpAwarded = "RfpAwarded";
    public static final java.lang.String _RfpRedirected = "RfpRedirected";
    public static final java.lang.String _RfpUpdated = "RfpUpdated";
    public static final java.lang.String _RfpLinked = "RfpLinked";
    public static final java.lang.String _RfpUnlinked = "RfpUnlinked";
    public static final java.lang.String _UpdateBlockedBusinessData = "UpdateBlockedBusinessData";
    public static final java.lang.String _UpdatePickedUpBusinessData = "UpdatePickedUpBusinessData";
    public static final java.lang.String _TextMessageCreated = "TextMessageCreated";
    public static final java.lang.String _RfpWithdrawnWithAutoTurnDown = "RfpWithdrawnWithAutoTurnDown";
    public static final java.lang.String _GeneralBusinessDataUpdated = "GeneralBusinessDataUpdated";
    public static final NotifierEventType CreateBusinessInitiated = new NotifierEventType(_CreateBusinessInitiated);
    public static final NotifierEventType UpdateBusinessInitiated = new NotifierEventType(_UpdateBusinessInitiated);
    public static final NotifierEventType ProposalSent = new NotifierEventType(_ProposalSent);
    public static final NotifierEventType RfpTurnedDown = new NotifierEventType(_RfpTurnedDown);
    public static final NotifierEventType UpdateAgreedBusinessData = new NotifierEventType(_UpdateAgreedBusinessData);
    public static final NotifierEventType UpdateActualBusinessData = new NotifierEventType(_UpdateActualBusinessData);
    public static final NotifierEventType RfpViewed = new NotifierEventType(_RfpViewed);
    public static final NotifierEventType ProposalSelfAwarded = new NotifierEventType(_ProposalSelfAwarded);
    public static final NotifierEventType RfpWithdrawn = new NotifierEventType(_RfpWithdrawn);
    public static final NotifierEventType RfpCancelled = new NotifierEventType(_RfpCancelled);
    public static final NotifierEventType RfpAwarded = new NotifierEventType(_RfpAwarded);
    public static final NotifierEventType RfpRedirected = new NotifierEventType(_RfpRedirected);
    public static final NotifierEventType RfpUpdated = new NotifierEventType(_RfpUpdated);
    public static final NotifierEventType RfpLinked = new NotifierEventType(_RfpLinked);
    public static final NotifierEventType RfpUnlinked = new NotifierEventType(_RfpUnlinked);
    public static final NotifierEventType UpdateBlockedBusinessData = new NotifierEventType(_UpdateBlockedBusinessData);
    public static final NotifierEventType UpdatePickedUpBusinessData = new NotifierEventType(_UpdatePickedUpBusinessData);
    public static final NotifierEventType TextMessageCreated = new NotifierEventType(_TextMessageCreated);
    public static final NotifierEventType RfpWithdrawnWithAutoTurnDown = new NotifierEventType(_RfpWithdrawnWithAutoTurnDown);
    public static final NotifierEventType GeneralBusinessDataUpdated = new NotifierEventType(_GeneralBusinessDataUpdated);
    public java.lang.String getValue() { return _value_;}
    public static NotifierEventType fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        NotifierEventType enumeration = (NotifierEventType)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static NotifierEventType fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(NotifierEventType.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "NotifierEventType"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
