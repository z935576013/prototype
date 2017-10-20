/**
 * Notification.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package localhost.MeetingBrokerServices;

public class Notification  implements java.io.Serializable {
    private java.lang.String externalRfpId;

    private java.lang.String secondaryExternalRfpId;

    private int notificationId;

    private localhost.MeetingBrokerServices.NotifierEventType notifierEventType;

    private int rfpId;

    private int proposalId;

    private int siteId;

    private java.lang.Integer channelId;

    private localhost.MeetingBrokerServices.NotificationNotificationData notificationData;

    public Notification() {
    }

    public Notification(
           java.lang.String externalRfpId,
           java.lang.String secondaryExternalRfpId,
           int notificationId,
           localhost.MeetingBrokerServices.NotifierEventType notifierEventType,
           int rfpId,
           int proposalId,
           int siteId,
           java.lang.Integer channelId,
           localhost.MeetingBrokerServices.NotificationNotificationData notificationData) {
           this.externalRfpId = externalRfpId;
           this.secondaryExternalRfpId = secondaryExternalRfpId;
           this.notificationId = notificationId;
           this.notifierEventType = notifierEventType;
           this.rfpId = rfpId;
           this.proposalId = proposalId;
           this.siteId = siteId;
           this.channelId = channelId;
           this.notificationData = notificationData;
    }


    /**
     * Gets the externalRfpId value for this Notification.
     * 
     * @return externalRfpId
     */
    public java.lang.String getExternalRfpId() {
        return externalRfpId;
    }


    /**
     * Sets the externalRfpId value for this Notification.
     * 
     * @param externalRfpId
     */
    public void setExternalRfpId(java.lang.String externalRfpId) {
        this.externalRfpId = externalRfpId;
    }


    /**
     * Gets the secondaryExternalRfpId value for this Notification.
     * 
     * @return secondaryExternalRfpId
     */
    public java.lang.String getSecondaryExternalRfpId() {
        return secondaryExternalRfpId;
    }


    /**
     * Sets the secondaryExternalRfpId value for this Notification.
     * 
     * @param secondaryExternalRfpId
     */
    public void setSecondaryExternalRfpId(java.lang.String secondaryExternalRfpId) {
        this.secondaryExternalRfpId = secondaryExternalRfpId;
    }


    /**
     * Gets the notificationId value for this Notification.
     * 
     * @return notificationId
     */
    public int getNotificationId() {
        return notificationId;
    }


    /**
     * Sets the notificationId value for this Notification.
     * 
     * @param notificationId
     */
    public void setNotificationId(int notificationId) {
        this.notificationId = notificationId;
    }


    /**
     * Gets the notifierEventType value for this Notification.
     * 
     * @return notifierEventType
     */
    public localhost.MeetingBrokerServices.NotifierEventType getNotifierEventType() {
        return notifierEventType;
    }


    /**
     * Sets the notifierEventType value for this Notification.
     * 
     * @param notifierEventType
     */
    public void setNotifierEventType(localhost.MeetingBrokerServices.NotifierEventType notifierEventType) {
        this.notifierEventType = notifierEventType;
    }


    /**
     * Gets the rfpId value for this Notification.
     * 
     * @return rfpId
     */
    public int getRfpId() {
        return rfpId;
    }


    /**
     * Sets the rfpId value for this Notification.
     * 
     * @param rfpId
     */
    public void setRfpId(int rfpId) {
        this.rfpId = rfpId;
    }


    /**
     * Gets the proposalId value for this Notification.
     * 
     * @return proposalId
     */
    public int getProposalId() {
        return proposalId;
    }


    /**
     * Sets the proposalId value for this Notification.
     * 
     * @param proposalId
     */
    public void setProposalId(int proposalId) {
        this.proposalId = proposalId;
    }


    /**
     * Gets the siteId value for this Notification.
     * 
     * @return siteId
     */
    public int getSiteId() {
        return siteId;
    }


    /**
     * Sets the siteId value for this Notification.
     * 
     * @param siteId
     */
    public void setSiteId(int siteId) {
        this.siteId = siteId;
    }


    /**
     * Gets the channelId value for this Notification.
     * 
     * @return channelId
     */
    public java.lang.Integer getChannelId() {
        return channelId;
    }


    /**
     * Sets the channelId value for this Notification.
     * 
     * @param channelId
     */
    public void setChannelId(java.lang.Integer channelId) {
        this.channelId = channelId;
    }


    /**
     * Gets the notificationData value for this Notification.
     * 
     * @return notificationData
     */
    public localhost.MeetingBrokerServices.NotificationNotificationData getNotificationData() {
        return notificationData;
    }


    /**
     * Sets the notificationData value for this Notification.
     * 
     * @param notificationData
     */
    public void setNotificationData(localhost.MeetingBrokerServices.NotificationNotificationData notificationData) {
        this.notificationData = notificationData;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Notification)) return false;
        Notification other = (Notification) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.externalRfpId==null && other.getExternalRfpId()==null) || 
             (this.externalRfpId!=null &&
              this.externalRfpId.equals(other.getExternalRfpId()))) &&
            ((this.secondaryExternalRfpId==null && other.getSecondaryExternalRfpId()==null) || 
             (this.secondaryExternalRfpId!=null &&
              this.secondaryExternalRfpId.equals(other.getSecondaryExternalRfpId()))) &&
            this.notificationId == other.getNotificationId() &&
            ((this.notifierEventType==null && other.getNotifierEventType()==null) || 
             (this.notifierEventType!=null &&
              this.notifierEventType.equals(other.getNotifierEventType()))) &&
            this.rfpId == other.getRfpId() &&
            this.proposalId == other.getProposalId() &&
            this.siteId == other.getSiteId() &&
            ((this.channelId==null && other.getChannelId()==null) || 
             (this.channelId!=null &&
              this.channelId.equals(other.getChannelId()))) &&
            ((this.notificationData==null && other.getNotificationData()==null) || 
             (this.notificationData!=null &&
              this.notificationData.equals(other.getNotificationData())));
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
        if (getExternalRfpId() != null) {
            _hashCode += getExternalRfpId().hashCode();
        }
        if (getSecondaryExternalRfpId() != null) {
            _hashCode += getSecondaryExternalRfpId().hashCode();
        }
        _hashCode += getNotificationId();
        if (getNotifierEventType() != null) {
            _hashCode += getNotifierEventType().hashCode();
        }
        _hashCode += getRfpId();
        _hashCode += getProposalId();
        _hashCode += getSiteId();
        if (getChannelId() != null) {
            _hashCode += getChannelId().hashCode();
        }
        if (getNotificationData() != null) {
            _hashCode += getNotificationData().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Notification.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "Notification"));
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
        elemField.setFieldName("notificationId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "NotificationId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("notifierEventType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "NotifierEventType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "NotifierEventType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rfpId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "RfpId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("proposalId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "ProposalId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("siteId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "SiteId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("channelId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "ChannelId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("notificationData");
        elemField.setXmlName(new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "NotificationData"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", ">Notification>NotificationData"));
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
