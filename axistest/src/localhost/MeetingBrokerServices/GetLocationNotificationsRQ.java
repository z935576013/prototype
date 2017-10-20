/**
 * GetLocationNotificationsRQ.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package localhost.MeetingBrokerServices;

public class GetLocationNotificationsRQ  extends localhost.MeetingBrokerServices.Request  implements java.io.Serializable {
    private java.lang.Integer externalLocationId;

    private java.lang.Integer notificationId;

    public GetLocationNotificationsRQ() {
    }

    public GetLocationNotificationsRQ(
           java.lang.String documentId,
           java.lang.String transactionId,
           java.util.Calendar documentDate,
           java.util.Calendar receivedTime,
           java.lang.String userGuid,
           java.lang.String requestMetaDataGuid,
           java.lang.Integer externalLocationId,
           java.lang.Integer notificationId) {
        super(
            documentId,
            transactionId,
            documentDate,
            receivedTime,
            userGuid,
            requestMetaDataGuid);
        this.externalLocationId = externalLocationId;
        this.notificationId = notificationId;
    }


    /**
     * Gets the externalLocationId value for this GetLocationNotificationsRQ.
     * 
     * @return externalLocationId
     */
    public java.lang.Integer getExternalLocationId() {
        return externalLocationId;
    }


    /**
     * Sets the externalLocationId value for this GetLocationNotificationsRQ.
     * 
     * @param externalLocationId
     */
    public void setExternalLocationId(java.lang.Integer externalLocationId) {
        this.externalLocationId = externalLocationId;
    }


    /**
     * Gets the notificationId value for this GetLocationNotificationsRQ.
     * 
     * @return notificationId
     */
    public java.lang.Integer getNotificationId() {
        return notificationId;
    }


    /**
     * Sets the notificationId value for this GetLocationNotificationsRQ.
     * 
     * @param notificationId
     */
    public void setNotificationId(java.lang.Integer notificationId) {
        this.notificationId = notificationId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetLocationNotificationsRQ)) return false;
        GetLocationNotificationsRQ other = (GetLocationNotificationsRQ) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.externalLocationId==null && other.getExternalLocationId()==null) || 
             (this.externalLocationId!=null &&
              this.externalLocationId.equals(other.getExternalLocationId()))) &&
            ((this.notificationId==null && other.getNotificationId()==null) || 
             (this.notificationId!=null &&
              this.notificationId.equals(other.getNotificationId())));
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
        if (getExternalLocationId() != null) {
            _hashCode += getExternalLocationId().hashCode();
        }
        if (getNotificationId() != null) {
            _hashCode += getNotificationId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetLocationNotificationsRQ.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "GetLocationNotificationsRQ"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("externalLocationId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "ExternalLocationId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("notificationId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "NotificationId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
