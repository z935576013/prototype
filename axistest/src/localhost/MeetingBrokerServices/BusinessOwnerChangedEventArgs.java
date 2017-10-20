/**
 * BusinessOwnerChangedEventArgs.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package localhost.MeetingBrokerServices;

public class BusinessOwnerChangedEventArgs  extends localhost.MeetingBrokerServices.NINotificationArgs  implements java.io.Serializable {
    private java.lang.String externalRfpId;

    private java.lang.String secondaryExternalRfpId;

    private localhost.MeetingBrokerServices.LocationIdentifiers locationIdentifiers;

    private int rfpId;

    private localhost.MeetingBrokerServices.RfpStatus rfpStatus;

    private localhost.MeetingBrokerServices.BusinessStatus businessStatus;

    private java.lang.String businessId;

    private java.lang.String businessOwnerFirstName;

    private java.lang.String businessOwnerLastName;

    private java.lang.String businessOwnerEmail;

    public BusinessOwnerChangedEventArgs() {
    }

    public BusinessOwnerChangedEventArgs(
           java.lang.String externalRfpId,
           java.lang.String secondaryExternalRfpId,
           localhost.MeetingBrokerServices.LocationIdentifiers locationIdentifiers,
           int rfpId,
           localhost.MeetingBrokerServices.RfpStatus rfpStatus,
           localhost.MeetingBrokerServices.BusinessStatus businessStatus,
           java.lang.String businessId,
           java.lang.String businessOwnerFirstName,
           java.lang.String businessOwnerLastName,
           java.lang.String businessOwnerEmail) {
        this.externalRfpId = externalRfpId;
        this.secondaryExternalRfpId = secondaryExternalRfpId;
        this.locationIdentifiers = locationIdentifiers;
        this.rfpId = rfpId;
        this.rfpStatus = rfpStatus;
        this.businessStatus = businessStatus;
        this.businessId = businessId;
        this.businessOwnerFirstName = businessOwnerFirstName;
        this.businessOwnerLastName = businessOwnerLastName;
        this.businessOwnerEmail = businessOwnerEmail;
    }


    /**
     * Gets the externalRfpId value for this BusinessOwnerChangedEventArgs.
     * 
     * @return externalRfpId
     */
    public java.lang.String getExternalRfpId() {
        return externalRfpId;
    }


    /**
     * Sets the externalRfpId value for this BusinessOwnerChangedEventArgs.
     * 
     * @param externalRfpId
     */
    public void setExternalRfpId(java.lang.String externalRfpId) {
        this.externalRfpId = externalRfpId;
    }


    /**
     * Gets the secondaryExternalRfpId value for this BusinessOwnerChangedEventArgs.
     * 
     * @return secondaryExternalRfpId
     */
    public java.lang.String getSecondaryExternalRfpId() {
        return secondaryExternalRfpId;
    }


    /**
     * Sets the secondaryExternalRfpId value for this BusinessOwnerChangedEventArgs.
     * 
     * @param secondaryExternalRfpId
     */
    public void setSecondaryExternalRfpId(java.lang.String secondaryExternalRfpId) {
        this.secondaryExternalRfpId = secondaryExternalRfpId;
    }


    /**
     * Gets the locationIdentifiers value for this BusinessOwnerChangedEventArgs.
     * 
     * @return locationIdentifiers
     */
    public localhost.MeetingBrokerServices.LocationIdentifiers getLocationIdentifiers() {
        return locationIdentifiers;
    }


    /**
     * Sets the locationIdentifiers value for this BusinessOwnerChangedEventArgs.
     * 
     * @param locationIdentifiers
     */
    public void setLocationIdentifiers(localhost.MeetingBrokerServices.LocationIdentifiers locationIdentifiers) {
        this.locationIdentifiers = locationIdentifiers;
    }


    /**
     * Gets the rfpId value for this BusinessOwnerChangedEventArgs.
     * 
     * @return rfpId
     */
    public int getRfpId() {
        return rfpId;
    }


    /**
     * Sets the rfpId value for this BusinessOwnerChangedEventArgs.
     * 
     * @param rfpId
     */
    public void setRfpId(int rfpId) {
        this.rfpId = rfpId;
    }


    /**
     * Gets the rfpStatus value for this BusinessOwnerChangedEventArgs.
     * 
     * @return rfpStatus
     */
    public localhost.MeetingBrokerServices.RfpStatus getRfpStatus() {
        return rfpStatus;
    }


    /**
     * Sets the rfpStatus value for this BusinessOwnerChangedEventArgs.
     * 
     * @param rfpStatus
     */
    public void setRfpStatus(localhost.MeetingBrokerServices.RfpStatus rfpStatus) {
        this.rfpStatus = rfpStatus;
    }


    /**
     * Gets the businessStatus value for this BusinessOwnerChangedEventArgs.
     * 
     * @return businessStatus
     */
    public localhost.MeetingBrokerServices.BusinessStatus getBusinessStatus() {
        return businessStatus;
    }


    /**
     * Sets the businessStatus value for this BusinessOwnerChangedEventArgs.
     * 
     * @param businessStatus
     */
    public void setBusinessStatus(localhost.MeetingBrokerServices.BusinessStatus businessStatus) {
        this.businessStatus = businessStatus;
    }


    /**
     * Gets the businessId value for this BusinessOwnerChangedEventArgs.
     * 
     * @return businessId
     */
    public java.lang.String getBusinessId() {
        return businessId;
    }


    /**
     * Sets the businessId value for this BusinessOwnerChangedEventArgs.
     * 
     * @param businessId
     */
    public void setBusinessId(java.lang.String businessId) {
        this.businessId = businessId;
    }


    /**
     * Gets the businessOwnerFirstName value for this BusinessOwnerChangedEventArgs.
     * 
     * @return businessOwnerFirstName
     */
    public java.lang.String getBusinessOwnerFirstName() {
        return businessOwnerFirstName;
    }


    /**
     * Sets the businessOwnerFirstName value for this BusinessOwnerChangedEventArgs.
     * 
     * @param businessOwnerFirstName
     */
    public void setBusinessOwnerFirstName(java.lang.String businessOwnerFirstName) {
        this.businessOwnerFirstName = businessOwnerFirstName;
    }


    /**
     * Gets the businessOwnerLastName value for this BusinessOwnerChangedEventArgs.
     * 
     * @return businessOwnerLastName
     */
    public java.lang.String getBusinessOwnerLastName() {
        return businessOwnerLastName;
    }


    /**
     * Sets the businessOwnerLastName value for this BusinessOwnerChangedEventArgs.
     * 
     * @param businessOwnerLastName
     */
    public void setBusinessOwnerLastName(java.lang.String businessOwnerLastName) {
        this.businessOwnerLastName = businessOwnerLastName;
    }


    /**
     * Gets the businessOwnerEmail value for this BusinessOwnerChangedEventArgs.
     * 
     * @return businessOwnerEmail
     */
    public java.lang.String getBusinessOwnerEmail() {
        return businessOwnerEmail;
    }


    /**
     * Sets the businessOwnerEmail value for this BusinessOwnerChangedEventArgs.
     * 
     * @param businessOwnerEmail
     */
    public void setBusinessOwnerEmail(java.lang.String businessOwnerEmail) {
        this.businessOwnerEmail = businessOwnerEmail;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof BusinessOwnerChangedEventArgs)) return false;
        BusinessOwnerChangedEventArgs other = (BusinessOwnerChangedEventArgs) obj;
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
            ((this.secondaryExternalRfpId==null && other.getSecondaryExternalRfpId()==null) || 
             (this.secondaryExternalRfpId!=null &&
              this.secondaryExternalRfpId.equals(other.getSecondaryExternalRfpId()))) &&
            ((this.locationIdentifiers==null && other.getLocationIdentifiers()==null) || 
             (this.locationIdentifiers!=null &&
              this.locationIdentifiers.equals(other.getLocationIdentifiers()))) &&
            this.rfpId == other.getRfpId() &&
            ((this.rfpStatus==null && other.getRfpStatus()==null) || 
             (this.rfpStatus!=null &&
              this.rfpStatus.equals(other.getRfpStatus()))) &&
            ((this.businessStatus==null && other.getBusinessStatus()==null) || 
             (this.businessStatus!=null &&
              this.businessStatus.equals(other.getBusinessStatus()))) &&
            ((this.businessId==null && other.getBusinessId()==null) || 
             (this.businessId!=null &&
              this.businessId.equals(other.getBusinessId()))) &&
            ((this.businessOwnerFirstName==null && other.getBusinessOwnerFirstName()==null) || 
             (this.businessOwnerFirstName!=null &&
              this.businessOwnerFirstName.equals(other.getBusinessOwnerFirstName()))) &&
            ((this.businessOwnerLastName==null && other.getBusinessOwnerLastName()==null) || 
             (this.businessOwnerLastName!=null &&
              this.businessOwnerLastName.equals(other.getBusinessOwnerLastName()))) &&
            ((this.businessOwnerEmail==null && other.getBusinessOwnerEmail()==null) || 
             (this.businessOwnerEmail!=null &&
              this.businessOwnerEmail.equals(other.getBusinessOwnerEmail())));
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
        if (getSecondaryExternalRfpId() != null) {
            _hashCode += getSecondaryExternalRfpId().hashCode();
        }
        if (getLocationIdentifiers() != null) {
            _hashCode += getLocationIdentifiers().hashCode();
        }
        _hashCode += getRfpId();
        if (getRfpStatus() != null) {
            _hashCode += getRfpStatus().hashCode();
        }
        if (getBusinessStatus() != null) {
            _hashCode += getBusinessStatus().hashCode();
        }
        if (getBusinessId() != null) {
            _hashCode += getBusinessId().hashCode();
        }
        if (getBusinessOwnerFirstName() != null) {
            _hashCode += getBusinessOwnerFirstName().hashCode();
        }
        if (getBusinessOwnerLastName() != null) {
            _hashCode += getBusinessOwnerLastName().hashCode();
        }
        if (getBusinessOwnerEmail() != null) {
            _hashCode += getBusinessOwnerEmail().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(BusinessOwnerChangedEventArgs.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "BusinessOwnerChangedEventArgs"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("externalRfpId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "ExternalRfpId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("secondaryExternalRfpId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "SecondaryExternalRfpId"));
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
        elemField.setFieldName("businessStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "BusinessStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "BusinessStatus"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("businessId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "BusinessId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("businessOwnerFirstName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "BusinessOwnerFirstName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("businessOwnerLastName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "BusinessOwnerLastName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("businessOwnerEmail");
        elemField.setXmlName(new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "BusinessOwnerEmail"));
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
