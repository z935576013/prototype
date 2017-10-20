/**
 * BusinessStatusChangedEventArgs.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package localhost.MeetingBrokerServices;

public class BusinessStatusChangedEventArgs  extends localhost.MeetingBrokerServices.NINotificationArgs  implements java.io.Serializable {
    private java.lang.String externalRfpId;

    private java.lang.String secondaryExternalRfpId;

    private localhost.MeetingBrokerServices.LocationIdentifiers locationIdentifiers;

    private int rfpId;

    private localhost.MeetingBrokerServices.RfpStatus rfpStatus;

    private localhost.MeetingBrokerServices.BusinessStatus businessStatus;

    private java.lang.String businessId;

    private java.lang.String externalLostBusinessReason;

    public BusinessStatusChangedEventArgs() {
    }

    public BusinessStatusChangedEventArgs(
           java.lang.String externalRfpId,
           java.lang.String secondaryExternalRfpId,
           localhost.MeetingBrokerServices.LocationIdentifiers locationIdentifiers,
           int rfpId,
           localhost.MeetingBrokerServices.RfpStatus rfpStatus,
           localhost.MeetingBrokerServices.BusinessStatus businessStatus,
           java.lang.String businessId,
           java.lang.String externalLostBusinessReason) {
        this.externalRfpId = externalRfpId;
        this.secondaryExternalRfpId = secondaryExternalRfpId;
        this.locationIdentifiers = locationIdentifiers;
        this.rfpId = rfpId;
        this.rfpStatus = rfpStatus;
        this.businessStatus = businessStatus;
        this.businessId = businessId;
        this.externalLostBusinessReason = externalLostBusinessReason;
    }


    /**
     * Gets the externalRfpId value for this BusinessStatusChangedEventArgs.
     * 
     * @return externalRfpId
     */
    public java.lang.String getExternalRfpId() {
        return externalRfpId;
    }


    /**
     * Sets the externalRfpId value for this BusinessStatusChangedEventArgs.
     * 
     * @param externalRfpId
     */
    public void setExternalRfpId(java.lang.String externalRfpId) {
        this.externalRfpId = externalRfpId;
    }


    /**
     * Gets the secondaryExternalRfpId value for this BusinessStatusChangedEventArgs.
     * 
     * @return secondaryExternalRfpId
     */
    public java.lang.String getSecondaryExternalRfpId() {
        return secondaryExternalRfpId;
    }


    /**
     * Sets the secondaryExternalRfpId value for this BusinessStatusChangedEventArgs.
     * 
     * @param secondaryExternalRfpId
     */
    public void setSecondaryExternalRfpId(java.lang.String secondaryExternalRfpId) {
        this.secondaryExternalRfpId = secondaryExternalRfpId;
    }


    /**
     * Gets the locationIdentifiers value for this BusinessStatusChangedEventArgs.
     * 
     * @return locationIdentifiers
     */
    public localhost.MeetingBrokerServices.LocationIdentifiers getLocationIdentifiers() {
        return locationIdentifiers;
    }


    /**
     * Sets the locationIdentifiers value for this BusinessStatusChangedEventArgs.
     * 
     * @param locationIdentifiers
     */
    public void setLocationIdentifiers(localhost.MeetingBrokerServices.LocationIdentifiers locationIdentifiers) {
        this.locationIdentifiers = locationIdentifiers;
    }


    /**
     * Gets the rfpId value for this BusinessStatusChangedEventArgs.
     * 
     * @return rfpId
     */
    public int getRfpId() {
        return rfpId;
    }


    /**
     * Sets the rfpId value for this BusinessStatusChangedEventArgs.
     * 
     * @param rfpId
     */
    public void setRfpId(int rfpId) {
        this.rfpId = rfpId;
    }


    /**
     * Gets the rfpStatus value for this BusinessStatusChangedEventArgs.
     * 
     * @return rfpStatus
     */
    public localhost.MeetingBrokerServices.RfpStatus getRfpStatus() {
        return rfpStatus;
    }


    /**
     * Sets the rfpStatus value for this BusinessStatusChangedEventArgs.
     * 
     * @param rfpStatus
     */
    public void setRfpStatus(localhost.MeetingBrokerServices.RfpStatus rfpStatus) {
        this.rfpStatus = rfpStatus;
    }


    /**
     * Gets the businessStatus value for this BusinessStatusChangedEventArgs.
     * 
     * @return businessStatus
     */
    public localhost.MeetingBrokerServices.BusinessStatus getBusinessStatus() {
        return businessStatus;
    }


    /**
     * Sets the businessStatus value for this BusinessStatusChangedEventArgs.
     * 
     * @param businessStatus
     */
    public void setBusinessStatus(localhost.MeetingBrokerServices.BusinessStatus businessStatus) {
        this.businessStatus = businessStatus;
    }


    /**
     * Gets the businessId value for this BusinessStatusChangedEventArgs.
     * 
     * @return businessId
     */
    public java.lang.String getBusinessId() {
        return businessId;
    }


    /**
     * Sets the businessId value for this BusinessStatusChangedEventArgs.
     * 
     * @param businessId
     */
    public void setBusinessId(java.lang.String businessId) {
        this.businessId = businessId;
    }


    /**
     * Gets the externalLostBusinessReason value for this BusinessStatusChangedEventArgs.
     * 
     * @return externalLostBusinessReason
     */
    public java.lang.String getExternalLostBusinessReason() {
        return externalLostBusinessReason;
    }


    /**
     * Sets the externalLostBusinessReason value for this BusinessStatusChangedEventArgs.
     * 
     * @param externalLostBusinessReason
     */
    public void setExternalLostBusinessReason(java.lang.String externalLostBusinessReason) {
        this.externalLostBusinessReason = externalLostBusinessReason;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof BusinessStatusChangedEventArgs)) return false;
        BusinessStatusChangedEventArgs other = (BusinessStatusChangedEventArgs) obj;
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
            ((this.externalLostBusinessReason==null && other.getExternalLostBusinessReason()==null) || 
             (this.externalLostBusinessReason!=null &&
              this.externalLostBusinessReason.equals(other.getExternalLostBusinessReason())));
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
        if (getExternalLostBusinessReason() != null) {
            _hashCode += getExternalLostBusinessReason().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(BusinessStatusChangedEventArgs.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "BusinessStatusChangedEventArgs"));
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
        elemField.setFieldName("externalLostBusinessReason");
        elemField.setXmlName(new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "ExternalLostBusinessReason"));
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
