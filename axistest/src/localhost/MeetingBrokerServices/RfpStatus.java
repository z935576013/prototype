/**
 * RfpStatus.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package localhost.MeetingBrokerServices;

public class RfpStatus implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected RfpStatus(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _Drafted = "Drafted";
    public static final java.lang.String _Deleted = "Deleted";
    public static final java.lang.String _New = "New";
    public static final java.lang.String _Updated = "Updated";
    public static final java.lang.String _Awarded = "Awarded";
    public static final java.lang.String _SelfAwarded = "SelfAwarded";
    public static final java.lang.String _Withdrawn = "Withdrawn";
    public static final java.lang.String _Cancelled = "Cancelled";
    public static final java.lang.String _TurnedDown = "TurnedDown";
    public static final java.lang.String _Redirected = "Redirected";
    public static final RfpStatus Drafted = new RfpStatus(_Drafted);
    public static final RfpStatus Deleted = new RfpStatus(_Deleted);
    public static final RfpStatus New = new RfpStatus(_New);
    public static final RfpStatus Updated = new RfpStatus(_Updated);
    public static final RfpStatus Awarded = new RfpStatus(_Awarded);
    public static final RfpStatus SelfAwarded = new RfpStatus(_SelfAwarded);
    public static final RfpStatus Withdrawn = new RfpStatus(_Withdrawn);
    public static final RfpStatus Cancelled = new RfpStatus(_Cancelled);
    public static final RfpStatus TurnedDown = new RfpStatus(_TurnedDown);
    public static final RfpStatus Redirected = new RfpStatus(_Redirected);
    public java.lang.String getValue() { return _value_;}
    public static RfpStatus fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        RfpStatus enumeration = (RfpStatus)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static RfpStatus fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(RfpStatus.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "RfpStatus"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
