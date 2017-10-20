/**
 * GetBusinessDataRS.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package localhost.MeetingBrokerServices;

public class GetBusinessDataRS  extends localhost.MeetingBrokerServices.Acknowledgement  implements java.io.Serializable {
    private java.lang.String externalRfpId;

    private java.lang.Integer siteId;

    private localhost.MeetingBrokerServices.BusinessDataInfo businessDataInfo;

    private localhost.MeetingBrokerServices.Message[] messages;

    private localhost.MeetingBrokerServices.BusinessStatus businessStatus;

    private java.lang.String externalLostBusinessReason;

    private java.lang.String businessOwnerFirstName;

    private java.lang.String businessOwnerLastName;

    private java.lang.String businessOwnerEmail;

    private java.util.Calendar startDate;

    private java.lang.String externalCurrency;

    private java.math.BigDecimal commission;

    private java.lang.Boolean isCommissionable;

    private java.lang.Integer rfpId;

    private java.lang.String rfpGuid;

    private java.util.Calendar businessStatusChangeDate;

    public GetBusinessDataRS() {
    }

    public GetBusinessDataRS(
           java.lang.String documentId,
           java.lang.String transactionId,
           java.util.Calendar documentDate,
           java.util.Calendar receivedTime,
           java.lang.String userGuid,
           java.lang.String requestMetaDataGuid,
           localhost.MeetingBrokerServices.AcknowledgementStatusCode statusCode,
           boolean success,
           localhost.MeetingBrokerServices.Error[] errors,
           java.lang.String externalRfpId,
           java.lang.Integer siteId,
           localhost.MeetingBrokerServices.BusinessDataInfo businessDataInfo,
           localhost.MeetingBrokerServices.Message[] messages,
           localhost.MeetingBrokerServices.BusinessStatus businessStatus,
           java.lang.String externalLostBusinessReason,
           java.lang.String businessOwnerFirstName,
           java.lang.String businessOwnerLastName,
           java.lang.String businessOwnerEmail,
           java.util.Calendar startDate,
           java.lang.String externalCurrency,
           java.math.BigDecimal commission,
           java.lang.Boolean isCommissionable,
           java.lang.Integer rfpId,
           java.lang.String rfpGuid,
           java.util.Calendar businessStatusChangeDate) {
        super(
            documentId,
            transactionId,
            documentDate,
            receivedTime,
            userGuid,
            requestMetaDataGuid,
            statusCode,
            success,
            errors);
        this.externalRfpId = externalRfpId;
        this.siteId = siteId;
        this.businessDataInfo = businessDataInfo;
        this.messages = messages;
        this.businessStatus = businessStatus;
        this.externalLostBusinessReason = externalLostBusinessReason;
        this.businessOwnerFirstName = businessOwnerFirstName;
        this.businessOwnerLastName = businessOwnerLastName;
        this.businessOwnerEmail = businessOwnerEmail;
        this.startDate = startDate;
        this.externalCurrency = externalCurrency;
        this.commission = commission;
        this.isCommissionable = isCommissionable;
        this.rfpId = rfpId;
        this.rfpGuid = rfpGuid;
        this.businessStatusChangeDate = businessStatusChangeDate;
    }


    /**
     * Gets the externalRfpId value for this GetBusinessDataRS.
     * 
     * @return externalRfpId
     */
    public java.lang.String getExternalRfpId() {
        return externalRfpId;
    }


    /**
     * Sets the externalRfpId value for this GetBusinessDataRS.
     * 
     * @param externalRfpId
     */
    public void setExternalRfpId(java.lang.String externalRfpId) {
        this.externalRfpId = externalRfpId;
    }


    /**
     * Gets the siteId value for this GetBusinessDataRS.
     * 
     * @return siteId
     */
    public java.lang.Integer getSiteId() {
        return siteId;
    }


    /**
     * Sets the siteId value for this GetBusinessDataRS.
     * 
     * @param siteId
     */
    public void setSiteId(java.lang.Integer siteId) {
        this.siteId = siteId;
    }


    /**
     * Gets the businessDataInfo value for this GetBusinessDataRS.
     * 
     * @return businessDataInfo
     */
    public localhost.MeetingBrokerServices.BusinessDataInfo getBusinessDataInfo() {
        return businessDataInfo;
    }


    /**
     * Sets the businessDataInfo value for this GetBusinessDataRS.
     * 
     * @param businessDataInfo
     */
    public void setBusinessDataInfo(localhost.MeetingBrokerServices.BusinessDataInfo businessDataInfo) {
        this.businessDataInfo = businessDataInfo;
    }


    /**
     * Gets the messages value for this GetBusinessDataRS.
     * 
     * @return messages
     */
    public localhost.MeetingBrokerServices.Message[] getMessages() {
        return messages;
    }


    /**
     * Sets the messages value for this GetBusinessDataRS.
     * 
     * @param messages
     */
    public void setMessages(localhost.MeetingBrokerServices.Message[] messages) {
        this.messages = messages;
    }


    /**
     * Gets the businessStatus value for this GetBusinessDataRS.
     * 
     * @return businessStatus
     */
    public localhost.MeetingBrokerServices.BusinessStatus getBusinessStatus() {
        return businessStatus;
    }


    /**
     * Sets the businessStatus value for this GetBusinessDataRS.
     * 
     * @param businessStatus
     */
    public void setBusinessStatus(localhost.MeetingBrokerServices.BusinessStatus businessStatus) {
        this.businessStatus = businessStatus;
    }


    /**
     * Gets the externalLostBusinessReason value for this GetBusinessDataRS.
     * 
     * @return externalLostBusinessReason
     */
    public java.lang.String getExternalLostBusinessReason() {
        return externalLostBusinessReason;
    }


    /**
     * Sets the externalLostBusinessReason value for this GetBusinessDataRS.
     * 
     * @param externalLostBusinessReason
     */
    public void setExternalLostBusinessReason(java.lang.String externalLostBusinessReason) {
        this.externalLostBusinessReason = externalLostBusinessReason;
    }


    /**
     * Gets the businessOwnerFirstName value for this GetBusinessDataRS.
     * 
     * @return businessOwnerFirstName
     */
    public java.lang.String getBusinessOwnerFirstName() {
        return businessOwnerFirstName;
    }


    /**
     * Sets the businessOwnerFirstName value for this GetBusinessDataRS.
     * 
     * @param businessOwnerFirstName
     */
    public void setBusinessOwnerFirstName(java.lang.String businessOwnerFirstName) {
        this.businessOwnerFirstName = businessOwnerFirstName;
    }


    /**
     * Gets the businessOwnerLastName value for this GetBusinessDataRS.
     * 
     * @return businessOwnerLastName
     */
    public java.lang.String getBusinessOwnerLastName() {
        return businessOwnerLastName;
    }


    /**
     * Sets the businessOwnerLastName value for this GetBusinessDataRS.
     * 
     * @param businessOwnerLastName
     */
    public void setBusinessOwnerLastName(java.lang.String businessOwnerLastName) {
        this.businessOwnerLastName = businessOwnerLastName;
    }


    /**
     * Gets the businessOwnerEmail value for this GetBusinessDataRS.
     * 
     * @return businessOwnerEmail
     */
    public java.lang.String getBusinessOwnerEmail() {
        return businessOwnerEmail;
    }


    /**
     * Sets the businessOwnerEmail value for this GetBusinessDataRS.
     * 
     * @param businessOwnerEmail
     */
    public void setBusinessOwnerEmail(java.lang.String businessOwnerEmail) {
        this.businessOwnerEmail = businessOwnerEmail;
    }


    /**
     * Gets the startDate value for this GetBusinessDataRS.
     * 
     * @return startDate
     */
    public java.util.Calendar getStartDate() {
        return startDate;
    }


    /**
     * Sets the startDate value for this GetBusinessDataRS.
     * 
     * @param startDate
     */
    public void setStartDate(java.util.Calendar startDate) {
        this.startDate = startDate;
    }


    /**
     * Gets the externalCurrency value for this GetBusinessDataRS.
     * 
     * @return externalCurrency
     */
    public java.lang.String getExternalCurrency() {
        return externalCurrency;
    }


    /**
     * Sets the externalCurrency value for this GetBusinessDataRS.
     * 
     * @param externalCurrency
     */
    public void setExternalCurrency(java.lang.String externalCurrency) {
        this.externalCurrency = externalCurrency;
    }


    /**
     * Gets the commission value for this GetBusinessDataRS.
     * 
     * @return commission
     */
    public java.math.BigDecimal getCommission() {
        return commission;
    }


    /**
     * Sets the commission value for this GetBusinessDataRS.
     * 
     * @param commission
     */
    public void setCommission(java.math.BigDecimal commission) {
        this.commission = commission;
    }


    /**
     * Gets the isCommissionable value for this GetBusinessDataRS.
     * 
     * @return isCommissionable
     */
    public java.lang.Boolean getIsCommissionable() {
        return isCommissionable;
    }


    /**
     * Sets the isCommissionable value for this GetBusinessDataRS.
     * 
     * @param isCommissionable
     */
    public void setIsCommissionable(java.lang.Boolean isCommissionable) {
        this.isCommissionable = isCommissionable;
    }


    /**
     * Gets the rfpId value for this GetBusinessDataRS.
     * 
     * @return rfpId
     */
    public java.lang.Integer getRfpId() {
        return rfpId;
    }


    /**
     * Sets the rfpId value for this GetBusinessDataRS.
     * 
     * @param rfpId
     */
    public void setRfpId(java.lang.Integer rfpId) {
        this.rfpId = rfpId;
    }


    /**
     * Gets the rfpGuid value for this GetBusinessDataRS.
     * 
     * @return rfpGuid
     */
    public java.lang.String getRfpGuid() {
        return rfpGuid;
    }


    /**
     * Sets the rfpGuid value for this GetBusinessDataRS.
     * 
     * @param rfpGuid
     */
    public void setRfpGuid(java.lang.String rfpGuid) {
        this.rfpGuid = rfpGuid;
    }


    /**
     * Gets the businessStatusChangeDate value for this GetBusinessDataRS.
     * 
     * @return businessStatusChangeDate
     */
    public java.util.Calendar getBusinessStatusChangeDate() {
        return businessStatusChangeDate;
    }


    /**
     * Sets the businessStatusChangeDate value for this GetBusinessDataRS.
     * 
     * @param businessStatusChangeDate
     */
    public void setBusinessStatusChangeDate(java.util.Calendar businessStatusChangeDate) {
        this.businessStatusChangeDate = businessStatusChangeDate;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetBusinessDataRS)) return false;
        GetBusinessDataRS other = (GetBusinessDataRS) obj;
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
            ((this.siteId==null && other.getSiteId()==null) || 
             (this.siteId!=null &&
              this.siteId.equals(other.getSiteId()))) &&
            ((this.businessDataInfo==null && other.getBusinessDataInfo()==null) || 
             (this.businessDataInfo!=null &&
              this.businessDataInfo.equals(other.getBusinessDataInfo()))) &&
            ((this.messages==null && other.getMessages()==null) || 
             (this.messages!=null &&
              java.util.Arrays.equals(this.messages, other.getMessages()))) &&
            ((this.businessStatus==null && other.getBusinessStatus()==null) || 
             (this.businessStatus!=null &&
              this.businessStatus.equals(other.getBusinessStatus()))) &&
            ((this.externalLostBusinessReason==null && other.getExternalLostBusinessReason()==null) || 
             (this.externalLostBusinessReason!=null &&
              this.externalLostBusinessReason.equals(other.getExternalLostBusinessReason()))) &&
            ((this.businessOwnerFirstName==null && other.getBusinessOwnerFirstName()==null) || 
             (this.businessOwnerFirstName!=null &&
              this.businessOwnerFirstName.equals(other.getBusinessOwnerFirstName()))) &&
            ((this.businessOwnerLastName==null && other.getBusinessOwnerLastName()==null) || 
             (this.businessOwnerLastName!=null &&
              this.businessOwnerLastName.equals(other.getBusinessOwnerLastName()))) &&
            ((this.businessOwnerEmail==null && other.getBusinessOwnerEmail()==null) || 
             (this.businessOwnerEmail!=null &&
              this.businessOwnerEmail.equals(other.getBusinessOwnerEmail()))) &&
            ((this.startDate==null && other.getStartDate()==null) || 
             (this.startDate!=null &&
              this.startDate.equals(other.getStartDate()))) &&
            ((this.externalCurrency==null && other.getExternalCurrency()==null) || 
             (this.externalCurrency!=null &&
              this.externalCurrency.equals(other.getExternalCurrency()))) &&
            ((this.commission==null && other.getCommission()==null) || 
             (this.commission!=null &&
              this.commission.equals(other.getCommission()))) &&
            ((this.isCommissionable==null && other.getIsCommissionable()==null) || 
             (this.isCommissionable!=null &&
              this.isCommissionable.equals(other.getIsCommissionable()))) &&
            ((this.rfpId==null && other.getRfpId()==null) || 
             (this.rfpId!=null &&
              this.rfpId.equals(other.getRfpId()))) &&
            ((this.rfpGuid==null && other.getRfpGuid()==null) || 
             (this.rfpGuid!=null &&
              this.rfpGuid.equals(other.getRfpGuid()))) &&
            ((this.businessStatusChangeDate==null && other.getBusinessStatusChangeDate()==null) || 
             (this.businessStatusChangeDate!=null &&
              this.businessStatusChangeDate.equals(other.getBusinessStatusChangeDate())));
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
        if (getSiteId() != null) {
            _hashCode += getSiteId().hashCode();
        }
        if (getBusinessDataInfo() != null) {
            _hashCode += getBusinessDataInfo().hashCode();
        }
        if (getMessages() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getMessages());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getMessages(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getBusinessStatus() != null) {
            _hashCode += getBusinessStatus().hashCode();
        }
        if (getExternalLostBusinessReason() != null) {
            _hashCode += getExternalLostBusinessReason().hashCode();
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
        if (getStartDate() != null) {
            _hashCode += getStartDate().hashCode();
        }
        if (getExternalCurrency() != null) {
            _hashCode += getExternalCurrency().hashCode();
        }
        if (getCommission() != null) {
            _hashCode += getCommission().hashCode();
        }
        if (getIsCommissionable() != null) {
            _hashCode += getIsCommissionable().hashCode();
        }
        if (getRfpId() != null) {
            _hashCode += getRfpId().hashCode();
        }
        if (getRfpGuid() != null) {
            _hashCode += getRfpGuid().hashCode();
        }
        if (getBusinessStatusChangeDate() != null) {
            _hashCode += getBusinessStatusChangeDate().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetBusinessDataRS.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "GetBusinessDataRS"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("externalRfpId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "ExternalRfpId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("siteId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "SiteId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("businessDataInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "BusinessDataInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "BusinessDataInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("messages");
        elemField.setXmlName(new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "Messages"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "Message"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "Message"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("businessStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "BusinessStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "BusinessStatus"));
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
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("startDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "StartDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("externalCurrency");
        elemField.setXmlName(new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "ExternalCurrency"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("commission");
        elemField.setXmlName(new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "Commission"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isCommissionable");
        elemField.setXmlName(new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "IsCommissionable"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rfpId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "RfpId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rfpGuid");
        elemField.setXmlName(new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "RfpGuid"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("businessStatusChangeDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "BusinessStatusChangeDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
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
