/**
 * BusinessStatus.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package localhost.MeetingBrokerServices;

public class BusinessStatus implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected BusinessStatus(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _None = "None";
    public static final java.lang.String _Prospect = "Prospect";
    public static final java.lang.String _Tentative = "Tentative";
    public static final java.lang.String _Definite = "Definite";
    public static final java.lang.String _Cancelled = "Cancelled";
    public static final java.lang.String _Inquiry = "Inquiry";
    public static final java.lang.String _Completed = "Completed";
    public static final java.lang.String _TurnedDown = "TurnedDown";
    public static final BusinessStatus None = new BusinessStatus(_None);
    public static final BusinessStatus Prospect = new BusinessStatus(_Prospect);
    public static final BusinessStatus Tentative = new BusinessStatus(_Tentative);
    public static final BusinessStatus Definite = new BusinessStatus(_Definite);
    public static final BusinessStatus Cancelled = new BusinessStatus(_Cancelled);
    public static final BusinessStatus Inquiry = new BusinessStatus(_Inquiry);
    public static final BusinessStatus Completed = new BusinessStatus(_Completed);
    public static final BusinessStatus TurnedDown = new BusinessStatus(_TurnedDown);
    public java.lang.String getValue() { return _value_;}
    public static BusinessStatus fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        BusinessStatus enumeration = (BusinessStatus)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static BusinessStatus fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(BusinessStatus.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "BusinessStatus"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
