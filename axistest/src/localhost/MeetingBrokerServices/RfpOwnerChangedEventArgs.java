/**
 * RfpOwnerChangedEventArgs.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package localhost.MeetingBrokerServices;

public class RfpOwnerChangedEventArgs  extends localhost.MeetingBrokerServices.NINotificationArgs  implements java.io.Serializable {
    private java.lang.String externalRfpId;

    private localhost.MeetingBrokerServices.LocationIdentifiers locationIdentifiers;

    private int rfpId;

    private localhost.MeetingBrokerServices.RfpStatus rfpStatus;

    private java.lang.String rfpOwnerFirstName;

    private java.lang.String rfpOwnerLastName;

    private java.lang.String rfpOwnerEmail;

    public RfpOwnerChangedEventArgs() {
    }

    public RfpOwnerChangedEventArgs(
           java.lang.String externalRfpId,
           localhost.MeetingBrokerServices.LocationIdentifiers locationIdentifiers,
           int rfpId,
           localhost.MeetingBrokerServices.RfpStatus rfpStatus,
           java.lang.String rfpOwnerFirstName,
           java.lang.String rfpOwnerLastName,
           java.lang.String rfpOwnerEmail) {
        this.externalRfpId = externalRfpId;
        this.locationIdentifiers = locationIdentifiers;
        this.rfpId = rfpId;
        this.rfpStatus = rfpStatus;
        this.rfpOwnerFirstName = rfpOwnerFirstName;
        this.rfpOwnerLastName = rfpOwnerLastName;
        this.rfpOwnerEmail = rfpOwnerEmail;
    }


    /**
     * Gets the externalRfpId value for this RfpOwnerChangedEventArgs.
     * 
     * @return externalRfpId
     */
    public java.lang.String getExternalRfpId() {
        return externalRfpId;
    }


    /**
     * Sets the externalRfpId value for this RfpOwnerChangedEventArgs.
     * 
     * @param externalRfpId
     */
    public void setExternalRfpId(java.lang.String externalRfpId) {
        this.externalRfpId = externalRfpId;
    }


    /**
     * Gets the locationIdentifiers value for this RfpOwnerChangedEventArgs.
     * 
     * @return locationIdentifiers
     */
    public localhost.MeetingBrokerServices.LocationIdentifiers getLocationIdentifiers() {
        return locationIdentifiers;
    }


    /**
     * Sets the locationIdentifiers value for this RfpOwnerChangedEventArgs.
     * 
     * @param locationIdentifiers
     */
    public void setLocationIdentifiers(localhost.MeetingBrokerServices.LocationIdentifiers locationIdentifiers) {
        this.locationIdentifiers = locationIdentifiers;
    }


    /**
     * Gets the rfpId value for this RfpOwnerChangedEventArgs.
     * 
     * @return rfpId
     */
    public int getRfpId() {
        return rfpId;
    }


    /**
     * Sets the rfpId value for this RfpOwnerChangedEventArgs.
     * 
     * @param rfpId
     */
    public void setRfpId(int rfpId) {
        this.rfpId = rfpId;
    }


    /**
     * Gets the rfpStatus value for this RfpOwnerChangedEventArgs.
     * 
     * @return rfpStatus
     */
    public localhost.MeetingBrokerServices.RfpStatus getRfpStatus() {
        return rfpStatus;
    }


    /**
     * Sets the rfpStatus value for this RfpOwnerChangedEventArgs.
     * 
     * @param rfpStatus
     */
    public void setRfpStatus(localhost.MeetingBrokerServices.RfpStatus rfpStatus) {
        this.rfpStatus = rfpStatus;
    }


    /**
     * Gets the rfpOwnerFirstName value for this RfpOwnerChangedEventArgs.
     * 
     * @return rfpOwnerFirstName
     */
    public java.lang.String getRfpOwnerFirstName() {
        return rfpOwnerFirstName;
    }


    /**
     * Sets the rfpOwnerFirstName value for this RfpOwnerChangedEventArgs.
     * 
     * @param rfpOwnerFirstName
     */
    public void setRfpOwnerFirstName(java.lang.String rfpOwnerFirstName) {
        this.rfpOwnerFirstName = rfpOwnerFirstName;
    }


    /**
     * Gets the rfpOwnerLastName value for this RfpOwnerChangedEventArgs.
     * 
     * @return rfpOwnerLastName
     */
    public java.lang.String getRfpOwnerLastName() {
        return rfpOwnerLastName;
    }


    /**
     * Sets the rfpOwnerLastName value for this RfpOwnerChangedEventArgs.
     * 
     * @param rfpOwnerLastName
     */
    public void setRfpOwnerLastName(java.lang.String rfpOwnerLastName) {
        this.rfpOwnerLastName = rfpOwnerLastName;
    }


    /**
     * Gets the rfpOwnerEmail value for this RfpOwnerChangedEventArgs.
     * 
     * @return rfpOwnerEmail
     */
    public java.lang.String getRfpOwnerEmail() {
        return rfpOwnerEmail;
    }


    /**
     * Sets the rfpOwnerEmail value for this RfpOwnerChangedEventArgs.
     * 
     * @param rfpOwnerEmail
     */
    public void setRfpOwnerEmail(java.lang.String rfpOwnerEmail) {
        this.rfpOwnerEmail = rfpOwnerEmail;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RfpOwnerChangedEventArgs)) return false;
        RfpOwnerChangedEventArgs other = (RfpOwnerChangedEventArgs) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.externalRfpId==null && other.getExternalRfpId()==null) || 
             (this.externalRfpId!=null &&
              this.externalRfpId.equals(other.getExternalRfpId()))) &&
            ((this.locationIdentifiers==null && other.getLocationIdentifiers()==null) || 
             (this.locationIdentifiers!=null &&
              this.locationIdentifiers.equals(other.getLocationIdentifiers()))) &&
            this.rfpId == other.getRfpId() &&
            ((this.rfpStatus==null && other.getRfpStatus()==null) || 
             (this.rfpStatus!=null &&
              this.rfpStatus.equals(other.getRfpStatus()))) &&
            ((this.rfpOwnerFirstName==null && other.getRfpOwnerFirstName()==null) || 
             (this.rfpOwnerFirstName!=null &&
              this.rfpOwnerFirstName.equals(other.getRfpOwnerFirstName()))) &&
            ((this.rfpOwnerLastName==null && other.getRfpOwnerLastName()==null) || 
             (this.rfpOwnerLastName!=null &&
              this.rfpOwnerLastName.equals(other.getRfpOwnerLastName()))) &&
            ((this.rfpOwnerEmail==null && other.getRfpOwnerEmail()==null) || 
             (this.rfpOwnerEmail!=null &&
              this.rfpOwnerEmail.equals(other.getRfpOwnerEmail())));
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
        if (getExternalRfpId() != null) {
            _hashCode += getExternalRfpId().hashCode();
        }
        if (getLocationIdentifiers() != null) {
            _hashCode += getLocationIdentifiers().hashCode();
        }
        _hashCode += getRfpId();
        if (getRfpStatus() != null) {
            _hashCode += getRfpStatus().hashCode();
        }
        if (getRfpOwnerFirstName() != null) {
            _hashCode += getRfpOwnerFirstName().hashCode();
        }
        if (getRfpOwnerLastName() != null) {
            _hashCode += getRfpOwnerLastName().hashCode();
        }
        if (getRfpOwnerEmail() != null) {
            _hashCode += getRfpOwnerEmail().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RfpOwnerChangedEventArgs.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "RfpOwnerChangedEventArgs"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("externalRfpId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "ExternalRfpId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("locationIdentifiers");
        elemField.setXmlName(new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "LocationIdentifiers"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "LocationIdentifiers"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rfpId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "RfpId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rfpStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "RfpStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "RfpStatus"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rfpOwnerFirstName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "RfpOwnerFirstName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rfpOwnerLastName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "RfpOwnerLastName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rfpOwnerEmail");
        elemField.setXmlName(new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "RfpOwnerEmail"));
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
