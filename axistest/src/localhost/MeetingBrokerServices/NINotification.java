/**
 * NINotification.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package localhost.MeetingBrokerServices;

public class NINotification  implements java.io.Serializable {
    private java.lang.String NINotificationId;

    private localhost.MeetingBrokerServices.NINotificationType NINotificationType;

    private java.util.Calendar createDate;

    private localhost.MeetingBrokerServices.NINotificationArgs NINotificationArgs;

    public NINotification() {
    }

    public NINotification(
           java.lang.String NINotificationId,
           localhost.MeetingBrokerServices.NINotificationType NINotificationType,
           java.util.Calendar createDate,
           localhost.MeetingBrokerServices.NINotificationArgs NINotificationArgs) {
           this.NINotificationId = NINotificationId;
           this.NINotificationType = NINotificationType;
           this.createDate = createDate;
           this.NINotificationArgs = NINotificationArgs;
    }


    /**
     * Gets the NINotificationId value for this NINotification.
     * 
     * @return NINotificationId
     */
    public java.lang.String getNINotificationId() {
        return NINotificationId;
    }


    /**
     * Sets the NINotificationId value for this NINotification.
     * 
     * @param NINotificationId
     */
    public void setNINotificationId(java.lang.String NINotificationId) {
        this.NINotificationId = NINotificationId;
    }


    /**
     * Gets the NINotificationType value for this NINotification.
     * 
     * @return NINotificationType
     */
    public localhost.MeetingBrokerServices.NINotificationType getNINotificationType() {
        return NINotificationType;
    }


    /**
     * Sets the NINotificationType value for this NINotification.
     * 
     * @param NINotificationType
     */
    public void setNINotificationType(localhost.MeetingBrokerServices.NINotificationType NINotificationType) {
        this.NINotificationType = NINotificationType;
    }


    /**
     * Gets the createDate value for this NINotification.
     * 
     * @return createDate
     */
    public java.util.Calendar getCreateDate() {
        return createDate;
    }


    /**
     * Sets the createDate value for this NINotification.
     * 
     * @param createDate
     */
    public void setCreateDate(java.util.Calendar createDate) {
        this.createDate = createDate;
    }


    /**
     * Gets the NINotificationArgs value for this NINotification.
     * 
     * @return NINotificationArgs
     */
    public localhost.MeetingBrokerServices.NINotificationArgs getNINotificationArgs() {
        return NINotificationArgs;
    }


    /**
     * Sets the NINotificationArgs value for this NINotification.
     * 
     * @param NINotificationArgs
     */
    public void setNINotificationArgs(localhost.MeetingBrokerServices.NINotificationArgs NINotificationArgs) {
        this.NINotificationArgs = NINotificationArgs;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof NINotification)) return false;
        NINotification other = (NINotification) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.NINotificationId==null && other.getNINotificationId()==null) || 
             (this.NINotificationId!=null &&
              this.NINotificationId.equals(other.getNINotificationId()))) &&
            ((this.NINotificationType==null && other.getNINotificationType()==null) || 
             (this.NINotificationType!=null &&
              this.NINotificationType.equals(other.getNINotificationType()))) &&
            ((this.createDate==null && other.getCreateDate()==null) || 
             (this.createDate!=null &&
              this.createDate.equals(other.getCreateDate()))) &&
            ((this.NINotificationArgs==null && other.getNINotificationArgs()==null) || 
             (this.NINotificationArgs!=null &&
              this.NINotificationArgs.equals(other.getNINotificationArgs())));
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
        if (getNINotificationId() != null) {
            _hashCode += getNINotificationId().hashCode();
        }
        if (getNINotificationType() != null) {
            _hashCode += getNINotificationType().hashCode();
        }
        if (getCreateDate() != null) {
            _hashCode += getCreateDate().hashCode();
        }
        if (getNINotificationArgs() != null) {
            _hashCode += getNINotificationArgs().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(NINotification.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "NINotification"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("NINotificationId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "NINotificationId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("NINotificationType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "NINotificationType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "NINotificationType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("createDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "CreateDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("NINotificationArgs");
        elemField.setXmlName(new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "NINotificationArgs"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "NINotificationArgs"));
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
