/**
 * NINotificationStatusUpdateRQ.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package localhost.MeetingBrokerServices;

public class NINotificationStatusUpdateRQ  extends localhost.MeetingBrokerServices.Request  implements java.io.Serializable {
    private java.lang.String NINotificationId;

    private localhost.MeetingBrokerServices.NotificationStatus notificationStatus;

    private java.lang.String additionalInformation;

    public NINotificationStatusUpdateRQ() {
    }

    public NINotificationStatusUpdateRQ(
           java.lang.String documentId,
           java.lang.String transactionId,
           java.util.Calendar documentDate,
           java.util.Calendar receivedTime,
           java.lang.String userGuid,
           java.lang.String requestMetaDataGuid,
           java.lang.String NINotificationId,
           localhost.MeetingBrokerServices.NotificationStatus notificationStatus,
           java.lang.String additionalInformation) {
        super(
            documentId,
            transactionId,
            documentDate,
            receivedTime,
            userGuid,
            requestMetaDataGuid);
        this.NINotificationId = NINotificationId;
        this.notificationStatus = notificationStatus;
        this.additionalInformation = additionalInformation;
    }


    /**
     * Gets the NINotificationId value for this NINotificationStatusUpdateRQ.
     * 
     * @return NINotificationId
     */
    public java.lang.String getNINotificationId() {
        return NINotificationId;
    }


    /**
     * Sets the NINotificationId value for this NINotificationStatusUpdateRQ.
     * 
     * @param NINotificationId
     */
    public void setNINotificationId(java.lang.String NINotificationId) {
        this.NINotificationId = NINotificationId;
    }


    /**
     * Gets the notificationStatus value for this NINotificationStatusUpdateRQ.
     * 
     * @return notificationStatus
     */
    public localhost.MeetingBrokerServices.NotificationStatus getNotificationStatus() {
        return notificationStatus;
    }


    /**
     * Sets the notificationStatus value for this NINotificationStatusUpdateRQ.
     * 
     * @param notificationStatus
     */
    public void setNotificationStatus(localhost.MeetingBrokerServices.NotificationStatus notificationStatus) {
        this.notificationStatus = notificationStatus;
    }


    /**
     * Gets the additionalInformation value for this NINotificationStatusUpdateRQ.
     * 
     * @return additionalInformation
     */
    public java.lang.String getAdditionalInformation() {
        return additionalInformation;
    }


    /**
     * Sets the additionalInformation value for this NINotificationStatusUpdateRQ.
     * 
     * @param additionalInformation
     */
    public void setAdditionalInformation(java.lang.String additionalInformation) {
        this.additionalInformation = additionalInformation;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof NINotificationStatusUpdateRQ)) return false;
        NINotificationStatusUpdateRQ other = (NINotificationStatusUpdateRQ) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.NINotificationId==null && other.getNINotificationId()==null) || 
             (this.NINotificationId!=null &&
              this.NINotificationId.equals(other.getNINotificationId()))) &&
            ((this.notificationStatus==null && other.getNotificationStatus()==null) || 
             (this.notificationStatus!=null &&
              this.notificationStatus.equals(other.getNotificationStatus()))) &&
            ((this.additionalInformation==null && other.getAdditionalInformation()==null) || 
             (this.additionalInformation!=null &&
              this.additionalInformation.equals(other.getAdditionalInformation())));
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
        if (getNINotificationId() != null) {
            _hashCode += getNINotificationId().hashCode();
        }
        if (getNotificationStatus() != null) {
            _hashCode += getNotificationStatus().hashCode();
        }
        if (getAdditionalInformation() != null) {
            _hashCode += getAdditionalInformation().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(NINotificationStatusUpdateRQ.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "NINotificationStatusUpdateRQ"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("NINotificationId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "NINotificationId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("notificationStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "NotificationStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "NotificationStatus"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("additionalInformation");
        elemField.setXmlName(new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "AdditionalInformation"));
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
