/**
 * ExternalRoomBlock.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package localhost.MeetingBrokerServices;

public class ExternalRoomBlock  extends localhost.MeetingBrokerServices.RoomBlock  implements java.io.Serializable {
    private localhost.MeetingBrokerServices.ComplexRoomAvailability[] complexRoomAvailabilities;

    public ExternalRoomBlock() {
    }

    public ExternalRoomBlock(
           java.util.Calendar startDate,
           java.util.Calendar alternateStartDate,
           java.lang.Boolean isAlternateStartDateSelected,
           java.math.BigDecimal budgetedRoomRate,
           java.lang.String comments,
           localhost.MeetingBrokerServices.RoomRequirement[] roomRequirements,
           localhost.MeetingBrokerServices.RoomAvailability[] roomAvailabilities,
           localhost.MeetingBrokerServices.ComplexRoomAvailability[] complexRoomAvailabilities) {
        super(
            startDate,
            alternateStartDate,
            isAlternateStartDateSelected,
            budgetedRoomRate,
            comments,
            roomRequirements,
            roomAvailabilities);
        this.complexRoomAvailabilities = complexRoomAvailabilities;
    }


    /**
     * Gets the complexRoomAvailabilities value for this ExternalRoomBlock.
     * 
     * @return complexRoomAvailabilities
     */
    public localhost.MeetingBrokerServices.ComplexRoomAvailability[] getComplexRoomAvailabilities() {
        return complexRoomAvailabilities;
    }


    /**
     * Sets the complexRoomAvailabilities value for this ExternalRoomBlock.
     * 
     * @param complexRoomAvailabilities
     */
    public void setComplexRoomAvailabilities(localhost.MeetingBrokerServices.ComplexRoomAvailability[] complexRoomAvailabilities) {
        this.complexRoomAvailabilities = complexRoomAvailabilities;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ExternalRoomBlock)) return false;
        ExternalRoomBlock other = (ExternalRoomBlock) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.complexRoomAvailabilities==null && other.getComplexRoomAvailabilities()==null) || 
             (this.complexRoomAvailabilities!=null &&
              java.util.Arrays.equals(this.complexRoomAvailabilities, other.getComplexRoomAvailabilities())));
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
        if (getComplexRoomAvailabilities() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getComplexRoomAvailabilities());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getComplexRoomAvailabilities(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ExternalRoomBlock.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "ExternalRoomBlock"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("complexRoomAvailabilities");
        elemField.setXmlName(new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "ComplexRoomAvailabilities"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "ComplexRoomAvailability"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "ComplexRoomAvailability"));
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
