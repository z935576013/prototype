/**
 * StatusChange.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package localhost.MeetingBrokerServices;

public class StatusChange  extends localhost.MeetingBrokerServices.Request  implements java.io.Serializable {
    private java.lang.String rfpId;

    private localhost.MeetingBrokerServices.Site[] sites;

    private java.util.Calendar startDate;

    private localhost.MeetingBrokerServices.ProposalStatus status;

    private localhost.MeetingBrokerServices.Message message;

    private java.lang.String statusChangeReason;

    public StatusChange() {
    }

    public StatusChange(
           java.lang.String documentId,
           java.lang.String transactionId,
           java.util.Calendar documentDate,
           java.util.Calendar receivedTime,
           java.lang.String userGuid,
           java.lang.String requestMetaDataGuid,
           java.lang.String rfpId,
           localhost.MeetingBrokerServices.Site[] sites,
           java.util.Calendar startDate,
           localhost.MeetingBrokerServices.ProposalStatus status,
           localhost.MeetingBrokerServices.Message message,
           java.lang.String statusChangeReason) {
        super(
            documentId,
            transactionId,
            documentDate,
            receivedTime,
            userGuid,
            requestMetaDataGuid);
        this.rfpId = rfpId;
        this.sites = sites;
        this.startDate = startDate;
        this.status = status;
        this.message = message;
        this.statusChangeReason = statusChangeReason;
    }


    /**
     * Gets the rfpId value for this StatusChange.
     * 
     * @return rfpId
     */
    public java.lang.String getRfpId() {
        return rfpId;
    }


    /**
     * Sets the rfpId value for this StatusChange.
     * 
     * @param rfpId
     */
    public void setRfpId(java.lang.String rfpId) {
        this.rfpId = rfpId;
    }


    /**
     * Gets the sites value for this StatusChange.
     * 
     * @return sites
     */
    public localhost.MeetingBrokerServices.Site[] getSites() {
        return sites;
    }


    /**
     * Sets the sites value for this StatusChange.
     * 
     * @param sites
     */
    public void setSites(localhost.MeetingBrokerServices.Site[] sites) {
        this.sites = sites;
    }


    /**
     * Gets the startDate value for this StatusChange.
     * 
     * @return startDate
     */
    public java.util.Calendar getStartDate() {
        return startDate;
    }


    /**
     * Sets the startDate value for this StatusChange.
     * 
     * @param startDate
     */
    public void setStartDate(java.util.Calendar startDate) {
        this.startDate = startDate;
    }


    /**
     * Gets the status value for this StatusChange.
     * 
     * @return status
     */
    public localhost.MeetingBrokerServices.ProposalStatus getStatus() {
        return status;
    }


    /**
     * Sets the status value for this StatusChange.
     * 
     * @param status
     */
    public void setStatus(localhost.MeetingBrokerServices.ProposalStatus status) {
        this.status = status;
    }


    /**
     * Gets the message value for this StatusChange.
     * 
     * @return message
     */
    public localhost.MeetingBrokerServices.Message getMessage() {
        return message;
    }


    /**
     * Sets the message value for this StatusChange.
     * 
     * @param message
     */
    public void setMessage(localhost.MeetingBrokerServices.Message message) {
        this.message = message;
    }


    /**
     * Gets the statusChangeReason value for this StatusChange.
     * 
     * @return statusChangeReason
     */
    public java.lang.String getStatusChangeReason() {
        return statusChangeReason;
    }


    /**
     * Sets the statusChangeReason value for this StatusChange.
     * 
     * @param statusChangeReason
     */
    public void setStatusChangeReason(java.lang.String statusChangeReason) {
        this.statusChangeReason = statusChangeReason;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof StatusChange)) return false;
        StatusChange other = (StatusChange) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.rfpId==null && other.getRfpId()==null) || 
             (this.rfpId!=null &&
              this.rfpId.equals(other.getRfpId()))) &&
            ((this.sites==null && other.getSites()==null) || 
             (this.sites!=null &&
              java.util.Arrays.equals(this.sites, other.getSites()))) &&
            ((this.startDate==null && other.getStartDate()==null) || 
             (this.startDate!=null &&
              this.startDate.equals(other.getStartDate()))) &&
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              this.status.equals(other.getStatus()))) &&
            ((this.message==null && other.getMessage()==null) || 
             (this.message!=null &&
              this.message.equals(other.getMessage()))) &&
            ((this.statusChangeReason==null && other.getStatusChangeReason()==null) || 
             (this.statusChangeReason!=null &&
              this.statusChangeReason.equals(other.getStatusChangeReason())));
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
        if (getRfpId() != null) {
            _hashCode += getRfpId().hashCode();
        }
        if (getSites() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSites());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSites(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getStartDate() != null) {
            _hashCode += getStartDate().hashCode();
        }
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        if (getMessage() != null) {
            _hashCode += getMessage().hashCode();
        }
        if (getStatusChangeReason() != null) {
            _hashCode += getStatusChangeReason().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(StatusChange.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "StatusChange"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rfpId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "RfpId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sites");
        elemField.setXmlName(new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "Sites"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "Site"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "Site"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("startDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "StartDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "Status"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "ProposalStatus"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("message");
        elemField.setXmlName(new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "Message"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "Message"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("statusChangeReason");
        elemField.setXmlName(new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "StatusChangeReason"));
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
