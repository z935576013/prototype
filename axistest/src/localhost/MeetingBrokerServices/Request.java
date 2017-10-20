/**
 * Request.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package localhost.MeetingBrokerServices;

public class Request  implements java.io.Serializable {
    private java.lang.String documentId;

    private java.lang.String transactionId;

    private java.util.Calendar documentDate;

    private java.util.Calendar receivedTime;

    private java.lang.String userGuid;

    private java.lang.String requestMetaDataGuid;

    public Request() {
    }

    public Request(
           java.lang.String documentId,
           java.lang.String transactionId,
           java.util.Calendar documentDate,
           java.util.Calendar receivedTime,
           java.lang.String userGuid,
           java.lang.String requestMetaDataGuid) {
           this.documentId = documentId;
           this.transactionId = transactionId;
           this.documentDate = documentDate;
           this.receivedTime = receivedTime;
           this.userGuid = userGuid;
           this.requestMetaDataGuid = requestMetaDataGuid;
    }


    /**
     * Gets the documentId value for this Request.
     * 
     * @return documentId
     */
    public java.lang.String getDocumentId() {
        return documentId;
    }


    /**
     * Sets the documentId value for this Request.
     * 
     * @param documentId
     */
    public void setDocumentId(java.lang.String documentId) {
        this.documentId = documentId;
    }


    /**
     * Gets the transactionId value for this Request.
     * 
     * @return transactionId
     */
    public java.lang.String getTransactionId() {
        return transactionId;
    }


    /**
     * Sets the transactionId value for this Request.
     * 
     * @param transactionId
     */
    public void setTransactionId(java.lang.String transactionId) {
        this.transactionId = transactionId;
    }


    /**
     * Gets the documentDate value for this Request.
     * 
     * @return documentDate
     */
    public java.util.Calendar getDocumentDate() {
        return documentDate;
    }


    /**
     * Sets the documentDate value for this Request.
     * 
     * @param documentDate
     */
    public void setDocumentDate(java.util.Calendar documentDate) {
        this.documentDate = documentDate;
    }


    /**
     * Gets the receivedTime value for this Request.
     * 
     * @return receivedTime
     */
    public java.util.Calendar getReceivedTime() {
        return receivedTime;
    }


    /**
     * Sets the receivedTime value for this Request.
     * 
     * @param receivedTime
     */
    public void setReceivedTime(java.util.Calendar receivedTime) {
        this.receivedTime = receivedTime;
    }


    /**
     * Gets the userGuid value for this Request.
     * 
     * @return userGuid
     */
    public java.lang.String getUserGuid() {
        return userGuid;
    }


    /**
     * Sets the userGuid value for this Request.
     * 
     * @param userGuid
     */
    public void setUserGuid(java.lang.String userGuid) {
        this.userGuid = userGuid;
    }


    /**
     * Gets the requestMetaDataGuid value for this Request.
     * 
     * @return requestMetaDataGuid
     */
    public java.lang.String getRequestMetaDataGuid() {
        return requestMetaDataGuid;
    }


    /**
     * Sets the requestMetaDataGuid value for this Request.
     * 
     * @param requestMetaDataGuid
     */
    public void setRequestMetaDataGuid(java.lang.String requestMetaDataGuid) {
        this.requestMetaDataGuid = requestMetaDataGuid;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Request)) return false;
        Request other = (Request) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.documentId==null && other.getDocumentId()==null) || 
             (this.documentId!=null &&
              this.documentId.equals(other.getDocumentId()))) &&
            ((this.transactionId==null && other.getTransactionId()==null) || 
             (this.transactionId!=null &&
              this.transactionId.equals(other.getTransactionId()))) &&
            ((this.documentDate==null && other.getDocumentDate()==null) || 
             (this.documentDate!=null &&
              this.documentDate.equals(other.getDocumentDate()))) &&
            ((this.receivedTime==null && other.getReceivedTime()==null) || 
             (this.receivedTime!=null &&
              this.receivedTime.equals(other.getReceivedTime()))) &&
            ((this.userGuid==null && other.getUserGuid()==null) || 
             (this.userGuid!=null &&
              this.userGuid.equals(other.getUserGuid()))) &&
            ((this.requestMetaDataGuid==null && other.getRequestMetaDataGuid()==null) || 
             (this.requestMetaDataGuid!=null &&
              this.requestMetaDataGuid.equals(other.getRequestMetaDataGuid())));
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
        if (getDocumentId() != null) {
            _hashCode += getDocumentId().hashCode();
        }
        if (getTransactionId() != null) {
            _hashCode += getTransactionId().hashCode();
        }
        if (getDocumentDate() != null) {
            _hashCode += getDocumentDate().hashCode();
        }
        if (getReceivedTime() != null) {
            _hashCode += getReceivedTime().hashCode();
        }
        if (getUserGuid() != null) {
            _hashCode += getUserGuid().hashCode();
        }
        if (getRequestMetaDataGuid() != null) {
            _hashCode += getRequestMetaDataGuid().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Request.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "Request"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("documentId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "DocumentId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transactionId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "TransactionId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("documentDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "DocumentDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("receivedTime");
        elemField.setXmlName(new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "ReceivedTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userGuid");
        elemField.setXmlName(new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "UserGuid"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("requestMetaDataGuid");
        elemField.setXmlName(new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "RequestMetaDataGuid"));
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
