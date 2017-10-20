/**
 * Sender.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package localhost.MeetingBrokerServices;

public class Sender  implements java.io.Serializable {
    private java.lang.Integer siteId;

    private localhost.MeetingBrokerServices.LocationIdentifier locationIdentifier;

    private java.lang.String userFirstName;

    private java.lang.String userLastName;

    private java.lang.String userEmailAddress;

    private java.lang.String externalUserName;

    public Sender() {
    }

    public Sender(
           java.lang.Integer siteId,
           localhost.MeetingBrokerServices.LocationIdentifier locationIdentifier,
           java.lang.String userFirstName,
           java.lang.String userLastName,
           java.lang.String userEmailAddress,
           java.lang.String externalUserName) {
           this.siteId = siteId;
           this.locationIdentifier = locationIdentifier;
           this.userFirstName = userFirstName;
           this.userLastName = userLastName;
           this.userEmailAddress = userEmailAddress;
           this.externalUserName = externalUserName;
    }


    /**
     * Gets the siteId value for this Sender.
     * 
     * @return siteId
     */
    public java.lang.Integer getSiteId() {
        return siteId;
    }


    /**
     * Sets the siteId value for this Sender.
     * 
     * @param siteId
     */
    public void setSiteId(java.lang.Integer siteId) {
        this.siteId = siteId;
    }


    /**
     * Gets the locationIdentifier value for this Sender.
     * 
     * @return locationIdentifier
     */
    public localhost.MeetingBrokerServices.LocationIdentifier getLocationIdentifier() {
        return locationIdentifier;
    }


    /**
     * Sets the locationIdentifier value for this Sender.
     * 
     * @param locationIdentifier
     */
    public void setLocationIdentifier(localhost.MeetingBrokerServices.LocationIdentifier locationIdentifier) {
        this.locationIdentifier = locationIdentifier;
    }


    /**
     * Gets the userFirstName value for this Sender.
     * 
     * @return userFirstName
     */
    public java.lang.String getUserFirstName() {
        return userFirstName;
    }


    /**
     * Sets the userFirstName value for this Sender.
     * 
     * @param userFirstName
     */
    public void setUserFirstName(java.lang.String userFirstName) {
        this.userFirstName = userFirstName;
    }


    /**
     * Gets the userLastName value for this Sender.
     * 
     * @return userLastName
     */
    public java.lang.String getUserLastName() {
        return userLastName;
    }


    /**
     * Sets the userLastName value for this Sender.
     * 
     * @param userLastName
     */
    public void setUserLastName(java.lang.String userLastName) {
        this.userLastName = userLastName;
    }


    /**
     * Gets the userEmailAddress value for this Sender.
     * 
     * @return userEmailAddress
     */
    public java.lang.String getUserEmailAddress() {
        return userEmailAddress;
    }


    /**
     * Sets the userEmailAddress value for this Sender.
     * 
     * @param userEmailAddress
     */
    public void setUserEmailAddress(java.lang.String userEmailAddress) {
        this.userEmailAddress = userEmailAddress;
    }


    /**
     * Gets the externalUserName value for this Sender.
     * 
     * @return externalUserName
     */
    public java.lang.String getExternalUserName() {
        return externalUserName;
    }


    /**
     * Sets the externalUserName value for this Sender.
     * 
     * @param externalUserName
     */
    public void setExternalUserName(java.lang.String externalUserName) {
        this.externalUserName = externalUserName;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Sender)) return false;
        Sender other = (Sender) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.siteId==null && other.getSiteId()==null) || 
             (this.siteId!=null &&
              this.siteId.equals(other.getSiteId()))) &&
            ((this.locationIdentifier==null && other.getLocationIdentifier()==null) || 
             (this.locationIdentifier!=null &&
              this.locationIdentifier.equals(other.getLocationIdentifier()))) &&
            ((this.userFirstName==null && other.getUserFirstName()==null) || 
             (this.userFirstName!=null &&
              this.userFirstName.equals(other.getUserFirstName()))) &&
            ((this.userLastName==null && other.getUserLastName()==null) || 
             (this.userLastName!=null &&
              this.userLastName.equals(other.getUserLastName()))) &&
            ((this.userEmailAddress==null && other.getUserEmailAddress()==null) || 
             (this.userEmailAddress!=null &&
              this.userEmailAddress.equals(other.getUserEmailAddress()))) &&
            ((this.externalUserName==null && other.getExternalUserName()==null) || 
             (this.externalUserName!=null &&
              this.externalUserName.equals(other.getExternalUserName())));
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
        if (getSiteId() != null) {
            _hashCode += getSiteId().hashCode();
        }
        if (getLocationIdentifier() != null) {
            _hashCode += getLocationIdentifier().hashCode();
        }
        if (getUserFirstName() != null) {
            _hashCode += getUserFirstName().hashCode();
        }
        if (getUserLastName() != null) {
            _hashCode += getUserLastName().hashCode();
        }
        if (getUserEmailAddress() != null) {
            _hashCode += getUserEmailAddress().hashCode();
        }
        if (getExternalUserName() != null) {
            _hashCode += getExternalUserName().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Sender.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "Sender"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("siteId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "SiteId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("locationIdentifier");
        elemField.setXmlName(new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "LocationIdentifier"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "LocationIdentifier"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userFirstName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "UserFirstName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userLastName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "UserLastName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userEmailAddress");
        elemField.setXmlName(new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "UserEmailAddress"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("externalUserName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "ExternalUserName"));
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
