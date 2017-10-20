/**
 * ResponseUnit.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package localhost.MeetingBrokerServices;

public class ResponseUnit  implements java.io.Serializable {
    private java.lang.String unit;

    private boolean isSelected;

    private java.lang.String externalResponseUnitId;

    public ResponseUnit() {
    }

    public ResponseUnit(
           java.lang.String unit,
           boolean isSelected,
           java.lang.String externalResponseUnitId) {
           this.unit = unit;
           this.isSelected = isSelected;
           this.externalResponseUnitId = externalResponseUnitId;
    }


    /**
     * Gets the unit value for this ResponseUnit.
     * 
     * @return unit
     */
    public java.lang.String getUnit() {
        return unit;
    }


    /**
     * Sets the unit value for this ResponseUnit.
     * 
     * @param unit
     */
    public void setUnit(java.lang.String unit) {
        this.unit = unit;
    }


    /**
     * Gets the isSelected value for this ResponseUnit.
     * 
     * @return isSelected
     */
    public boolean isIsSelected() {
        return isSelected;
    }


    /**
     * Sets the isSelected value for this ResponseUnit.
     * 
     * @param isSelected
     */
    public void setIsSelected(boolean isSelected) {
        this.isSelected = isSelected;
    }


    /**
     * Gets the externalResponseUnitId value for this ResponseUnit.
     * 
     * @return externalResponseUnitId
     */
    public java.lang.String getExternalResponseUnitId() {
        return externalResponseUnitId;
    }


    /**
     * Sets the externalResponseUnitId value for this ResponseUnit.
     * 
     * @param externalResponseUnitId
     */
    public void setExternalResponseUnitId(java.lang.String externalResponseUnitId) {
        this.externalResponseUnitId = externalResponseUnitId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ResponseUnit)) return false;
        ResponseUnit other = (ResponseUnit) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.unit==null && other.getUnit()==null) || 
             (this.unit!=null &&
              this.unit.equals(other.getUnit()))) &&
            this.isSelected == other.isIsSelected() &&
            ((this.externalResponseUnitId==null && other.getExternalResponseUnitId()==null) || 
             (this.externalResponseUnitId!=null &&
              this.externalResponseUnitId.equals(other.getExternalResponseUnitId())));
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
        if (getUnit() != null) {
            _hashCode += getUnit().hashCode();
        }
        _hashCode += (isIsSelected() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getExternalResponseUnitId() != null) {
            _hashCode += getExternalResponseUnitId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ResponseUnit.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "ResponseUnit"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("unit");
        elemField.setXmlName(new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "Unit"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isSelected");
        elemField.setXmlName(new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "IsSelected"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("externalResponseUnitId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "ExternalResponseUnitId"));
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
