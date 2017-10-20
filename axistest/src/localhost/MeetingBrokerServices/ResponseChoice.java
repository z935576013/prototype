/**
 * ResponseChoice.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package localhost.MeetingBrokerServices;

public class ResponseChoice  implements java.io.Serializable {
    private java.lang.String response;

    private boolean isSelected;

    private java.lang.String externalResponseChoiceId;

    public ResponseChoice() {
    }

    public ResponseChoice(
           java.lang.String response,
           boolean isSelected,
           java.lang.String externalResponseChoiceId) {
           this.response = response;
           this.isSelected = isSelected;
           this.externalResponseChoiceId = externalResponseChoiceId;
    }


    /**
     * Gets the response value for this ResponseChoice.
     * 
     * @return response
     */
    public java.lang.String getResponse() {
        return response;
    }


    /**
     * Sets the response value for this ResponseChoice.
     * 
     * @param response
     */
    public void setResponse(java.lang.String response) {
        this.response = response;
    }


    /**
     * Gets the isSelected value for this ResponseChoice.
     * 
     * @return isSelected
     */
    public boolean isIsSelected() {
        return isSelected;
    }


    /**
     * Sets the isSelected value for this ResponseChoice.
     * 
     * @param isSelected
     */
    public void setIsSelected(boolean isSelected) {
        this.isSelected = isSelected;
    }


    /**
     * Gets the externalResponseChoiceId value for this ResponseChoice.
     * 
     * @return externalResponseChoiceId
     */
    public java.lang.String getExternalResponseChoiceId() {
        return externalResponseChoiceId;
    }


    /**
     * Sets the externalResponseChoiceId value for this ResponseChoice.
     * 
     * @param externalResponseChoiceId
     */
    public void setExternalResponseChoiceId(java.lang.String externalResponseChoiceId) {
        this.externalResponseChoiceId = externalResponseChoiceId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ResponseChoice)) return false;
        ResponseChoice other = (ResponseChoice) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.response==null && other.getResponse()==null) || 
             (this.response!=null &&
              this.response.equals(other.getResponse()))) &&
            this.isSelected == other.isIsSelected() &&
            ((this.externalResponseChoiceId==null && other.getExternalResponseChoiceId()==null) || 
             (this.externalResponseChoiceId!=null &&
              this.externalResponseChoiceId.equals(other.getExternalResponseChoiceId())));
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
        if (getResponse() != null) {
            _hashCode += getResponse().hashCode();
        }
        _hashCode += (isIsSelected() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getExternalResponseChoiceId() != null) {
            _hashCode += getExternalResponseChoiceId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ResponseChoice.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "ResponseChoice"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("response");
        elemField.setXmlName(new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "Response"));
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
        elemField.setFieldName("externalResponseChoiceId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "ExternalResponseChoiceId"));
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
