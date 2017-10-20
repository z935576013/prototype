/**
 * ProposalStatus.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package localhost.MeetingBrokerServices;

public class ProposalStatus implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected ProposalStatus(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _None = "None";
    public static final java.lang.String _Draft = "Draft";
    public static final java.lang.String _Deleted = "Deleted";
    public static final java.lang.String _New = "New";
    public static final java.lang.String _Updated = "Updated";
    public static final java.lang.String _Awarded = "Awarded";
    public static final java.lang.String _Self_Awarded = "Self_Awarded";
    public static final java.lang.String _Withdrawn = "Withdrawn";
    public static final java.lang.String _Cancelled = "Cancelled";
    public static final java.lang.String _Turned_Down = "Turned_Down";
    public static final java.lang.String _Redirected = "Redirected";
    public static final ProposalStatus None = new ProposalStatus(_None);
    public static final ProposalStatus Draft = new ProposalStatus(_Draft);
    public static final ProposalStatus Deleted = new ProposalStatus(_Deleted);
    public static final ProposalStatus New = new ProposalStatus(_New);
    public static final ProposalStatus Updated = new ProposalStatus(_Updated);
    public static final ProposalStatus Awarded = new ProposalStatus(_Awarded);
    public static final ProposalStatus Self_Awarded = new ProposalStatus(_Self_Awarded);
    public static final ProposalStatus Withdrawn = new ProposalStatus(_Withdrawn);
    public static final ProposalStatus Cancelled = new ProposalStatus(_Cancelled);
    public static final ProposalStatus Turned_Down = new ProposalStatus(_Turned_Down);
    public static final ProposalStatus Redirected = new ProposalStatus(_Redirected);
    public java.lang.String getValue() { return _value_;}
    public static ProposalStatus fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        ProposalStatus enumeration = (ProposalStatus)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static ProposalStatus fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(ProposalStatus.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "ProposalStatus"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
