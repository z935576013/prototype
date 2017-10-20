/**
 * RoomTypes.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package localhost.MeetingBrokerServices;

public class RoomTypes implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected RoomTypes(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _Run_Of_House = "Run_Of_House";
    public static final java.lang.String _Standard = "Standard";
    public static final java.lang.String _Double_Double = "Double_Double";
    public static final java.lang.String _Suite = "Suite";
    public static final java.lang.String _Complimentary_Run_Of_House = "Complimentary_Run_Of_House";
    public static final java.lang.String _Complimentary_Standard = "Complimentary_Standard";
    public static final java.lang.String _Complimentary_Double_Double = "Complimentary_Double_Double";
    public static final java.lang.String _Complimentary_Suite = "Complimentary_Suite";
    public static final java.lang.String _External = "External";
    public static final RoomTypes Run_Of_House = new RoomTypes(_Run_Of_House);
    public static final RoomTypes Standard = new RoomTypes(_Standard);
    public static final RoomTypes Double_Double = new RoomTypes(_Double_Double);
    public static final RoomTypes Suite = new RoomTypes(_Suite);
    public static final RoomTypes Complimentary_Run_Of_House = new RoomTypes(_Complimentary_Run_Of_House);
    public static final RoomTypes Complimentary_Standard = new RoomTypes(_Complimentary_Standard);
    public static final RoomTypes Complimentary_Double_Double = new RoomTypes(_Complimentary_Double_Double);
    public static final RoomTypes Complimentary_Suite = new RoomTypes(_Complimentary_Suite);
    public static final RoomTypes External = new RoomTypes(_External);
    public java.lang.String getValue() { return _value_;}
    public static RoomTypes fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        RoomTypes enumeration = (RoomTypes)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static RoomTypes fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(RoomTypes.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "RoomTypes"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
