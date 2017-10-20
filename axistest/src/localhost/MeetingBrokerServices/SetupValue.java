/**
 * SetupValue.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package localhost.MeetingBrokerServices;

public class SetupValue  implements java.io.Serializable {
    private int entityTypeId;

    private java.lang.String name;

    private int setupValueCategoryId;

    private int entityId;

    private java.lang.String setupValueCategoryName;

    public SetupValue() {
    }

    public SetupValue(
           int entityTypeId,
           java.lang.String name,
           int setupValueCategoryId,
           int entityId,
           java.lang.String setupValueCategoryName) {
           this.entityTypeId = entityTypeId;
           this.name = name;
           this.setupValueCategoryId = setupValueCategoryId;
           this.entityId = entityId;
           this.setupValueCategoryName = setupValueCategoryName;
    }


    /**
     * Gets the entityTypeId value for this SetupValue.
     * 
     * @return entityTypeId
     */
    public int getEntityTypeId() {
        return entityTypeId;
    }


    /**
     * Sets the entityTypeId value for this SetupValue.
     * 
     * @param entityTypeId
     */
    public void setEntityTypeId(int entityTypeId) {
        this.entityTypeId = entityTypeId;
    }


    /**
     * Gets the name value for this SetupValue.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this SetupValue.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }


    /**
     * Gets the setupValueCategoryId value for this SetupValue.
     * 
     * @return setupValueCategoryId
     */
    public int getSetupValueCategoryId() {
        return setupValueCategoryId;
    }


    /**
     * Sets the setupValueCategoryId value for this SetupValue.
     * 
     * @param setupValueCategoryId
     */
    public void setSetupValueCategoryId(int setupValueCategoryId) {
        this.setupValueCategoryId = setupValueCategoryId;
    }


    /**
     * Gets the entityId value for this SetupValue.
     * 
     * @return entityId
     */
    public int getEntityId() {
        return entityId;
    }


    /**
     * Sets the entityId value for this SetupValue.
     * 
     * @param entityId
     */
    public void setEntityId(int entityId) {
        this.entityId = entityId;
    }


    /**
     * Gets the setupValueCategoryName value for this SetupValue.
     * 
     * @return setupValueCategoryName
     */
    public java.lang.String getSetupValueCategoryName() {
        return setupValueCategoryName;
    }


    /**
     * Sets the setupValueCategoryName value for this SetupValue.
     * 
     * @param setupValueCategoryName
     */
    public void setSetupValueCategoryName(java.lang.String setupValueCategoryName) {
        this.setupValueCategoryName = setupValueCategoryName;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SetupValue)) return false;
        SetupValue other = (SetupValue) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.entityTypeId == other.getEntityTypeId() &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName()))) &&
            this.setupValueCategoryId == other.getSetupValueCategoryId() &&
            this.entityId == other.getEntityId() &&
            ((this.setupValueCategoryName==null && other.getSetupValueCategoryName()==null) || 
             (this.setupValueCategoryName!=null &&
              this.setupValueCategoryName.equals(other.getSetupValueCategoryName())));
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
        _hashCode += getEntityTypeId();
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        _hashCode += getSetupValueCategoryId();
        _hashCode += getEntityId();
        if (getSetupValueCategoryName() != null) {
            _hashCode += getSetupValueCategoryName().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SetupValue.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "SetupValue"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("entityTypeId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "EntityTypeId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "Name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("setupValueCategoryId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "SetupValueCategoryId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("entityId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "EntityId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("setupValueCategoryName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "SetupValueCategoryName"));
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
