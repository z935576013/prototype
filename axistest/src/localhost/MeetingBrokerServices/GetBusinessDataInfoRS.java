/**
 * GetBusinessDataInfoRS.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package localhost.MeetingBrokerServices;

public class GetBusinessDataInfoRS  extends localhost.MeetingBrokerServices.Acknowledgement  implements java.io.Serializable {
    private localhost.MeetingBrokerServices.BusinessDataInfo businessDataInfo;

    private localhost.MeetingBrokerServices.BusinessStatus businessStatus;

    private java.lang.String externalLostBusinessReason;

    private java.lang.Integer businessOwnerId;

    private java.lang.String businessOwnerFirstName;

    private java.lang.String businessOwnerLastName;

    private java.lang.String businessOwnerEmail;

    private java.lang.String rfpAccessUserEmailList;

    private java.lang.String rfpAccessUserIdList;

    private java.util.Calendar startDate;

    private java.util.Calendar departureDate;

    private java.lang.String externalRfpId;

    private java.lang.String secondaryExternalRfpId;

    private java.lang.Integer siteId;

    private java.lang.String comments;

    private java.lang.Boolean isPickUpComplete;

    private java.util.Calendar businessCreateDate;

    private java.lang.String businessId;

    private localhost.MeetingBrokerServices.OtherIncomeItem[] otherIncomeItems;

    private java.lang.String externalCurrency;

    private java.math.BigDecimal commission;

    private java.lang.String lostToCity;

    private java.lang.String lostToHotel;

    private java.lang.Boolean isLockedBySC;

    public GetBusinessDataInfoRS() {
    }

    public GetBusinessDataInfoRS(
           java.lang.String documentId,
           java.lang.String transactionId,
           java.util.Calendar documentDate,
           java.util.Calendar receivedTime,
           java.lang.String userGuid,
           java.lang.String requestMetaDataGuid,
           localhost.MeetingBrokerServices.AcknowledgementStatusCode statusCode,
           boolean success,
           localhost.MeetingBrokerServices.Error[] errors,
           localhost.MeetingBrokerServices.BusinessDataInfo businessDataInfo,
           localhost.MeetingBrokerServices.BusinessStatus businessStatus,
           java.lang.String externalLostBusinessReason,
           java.lang.Integer businessOwnerId,
           java.lang.String businessOwnerFirstName,
           java.lang.String businessOwnerLastName,
           java.lang.String businessOwnerEmail,
           java.lang.String rfpAccessUserEmailList,
           java.lang.String rfpAccessUserIdList,
           java.util.Calendar startDate,
           java.util.Calendar departureDate,
           java.lang.String externalRfpId,
           java.lang.String secondaryExternalRfpId,
           java.lang.Integer siteId,
           java.lang.String comments,
           java.lang.Boolean isPickUpComplete,
           java.util.Calendar businessCreateDate,
           java.lang.String businessId,
           localhost.MeetingBrokerServices.OtherIncomeItem[] otherIncomeItems,
           java.lang.String externalCurrency,
           java.math.BigDecimal commission,
           java.lang.String lostToCity,
           java.lang.String lostToHotel,
           java.lang.Boolean isLockedBySC) {
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
        this.businessDataInfo = businessDataInfo;
        this.businessStatus = businessStatus;
        this.externalLostBusinessReason = externalLostBusinessReason;
        this.businessOwnerId = businessOwnerId;
        this.businessOwnerFirstName = businessOwnerFirstName;
        this.businessOwnerLastName = businessOwnerLastName;
        this.businessOwnerEmail = businessOwnerEmail;
        this.rfpAccessUserEmailList = rfpAccessUserEmailList;
        this.rfpAccessUserIdList = rfpAccessUserIdList;
        this.startDate = startDate;
        this.departureDate = departureDate;
        this.externalRfpId = externalRfpId;
        this.secondaryExternalRfpId = secondaryExternalRfpId;
        this.siteId = siteId;
        this.comments = comments;
        this.isPickUpComplete = isPickUpComplete;
        this.businessCreateDate = businessCreateDate;
        this.businessId = businessId;
        this.otherIncomeItems = otherIncomeItems;
        this.externalCurrency = externalCurrency;
        this.commission = commission;
        this.lostToCity = lostToCity;
        this.lostToHotel = lostToHotel;
        this.isLockedBySC = isLockedBySC;
    }


    /**
     * Gets the businessDataInfo value for this GetBusinessDataInfoRS.
     * 
     * @return businessDataInfo
     */
    public localhost.MeetingBrokerServices.BusinessDataInfo getBusinessDataInfo() {
        return businessDataInfo;
    }


    /**
     * Sets the businessDataInfo value for this GetBusinessDataInfoRS.
     * 
     * @param businessDataInfo
     */
    public void setBusinessDataInfo(localhost.MeetingBrokerServices.BusinessDataInfo businessDataInfo) {
        this.businessDataInfo = businessDataInfo;
    }


    /**
     * Gets the businessStatus value for this GetBusinessDataInfoRS.
     * 
     * @return businessStatus
     */
    public localhost.MeetingBrokerServices.BusinessStatus getBusinessStatus() {
        return businessStatus;
    }


    /**
     * Sets the businessStatus value for this GetBusinessDataInfoRS.
     * 
     * @param businessStatus
     */
    public void setBusinessStatus(localhost.MeetingBrokerServices.BusinessStatus businessStatus) {
        this.businessStatus = businessStatus;
    }


    /**
     * Gets the externalLostBusinessReason value for this GetBusinessDataInfoRS.
     * 
     * @return externalLostBusinessReason
     */
    public java.lang.String getExternalLostBusinessReason() {
        return externalLostBusinessReason;
    }


    /**
     * Sets the externalLostBusinessReason value for this GetBusinessDataInfoRS.
     * 
     * @param externalLostBusinessReason
     */
    public void setExternalLostBusinessReason(java.lang.String externalLostBusinessReason) {
        this.externalLostBusinessReason = externalLostBusinessReason;
    }


    /**
     * Gets the businessOwnerId value for this GetBusinessDataInfoRS.
     * 
     * @return businessOwnerId
     */
    public java.lang.Integer getBusinessOwnerId() {
        return businessOwnerId;
    }


    /**
     * Sets the businessOwnerId value for this GetBusinessDataInfoRS.
     * 
     * @param businessOwnerId
     */
    public void setBusinessOwnerId(java.lang.Integer businessOwnerId) {
        this.businessOwnerId = businessOwnerId;
    }


    /**
     * Gets the businessOwnerFirstName value for this GetBusinessDataInfoRS.
     * 
     * @return businessOwnerFirstName
     */
    public java.lang.String getBusinessOwnerFirstName() {
        return businessOwnerFirstName;
    }


    /**
     * Sets the businessOwnerFirstName value for this GetBusinessDataInfoRS.
     * 
     * @param businessOwnerFirstName
     */
    public void setBusinessOwnerFirstName(java.lang.String businessOwnerFirstName) {
        this.businessOwnerFirstName = businessOwnerFirstName;
    }


    /**
     * Gets the businessOwnerLastName value for this GetBusinessDataInfoRS.
     * 
     * @return businessOwnerLastName
     */
    public java.lang.String getBusinessOwnerLastName() {
        return businessOwnerLastName;
    }


    /**
     * Sets the businessOwnerLastName value for this GetBusinessDataInfoRS.
     * 
     * @param businessOwnerLastName
     */
    public void setBusinessOwnerLastName(java.lang.String businessOwnerLastName) {
        this.businessOwnerLastName = businessOwnerLastName;
    }


    /**
     * Gets the businessOwnerEmail value for this GetBusinessDataInfoRS.
     * 
     * @return businessOwnerEmail
     */
    public java.lang.String getBusinessOwnerEmail() {
        return businessOwnerEmail;
    }


    /**
     * Sets the businessOwnerEmail value for this GetBusinessDataInfoRS.
     * 
     * @param businessOwnerEmail
     */
    public void setBusinessOwnerEmail(java.lang.String businessOwnerEmail) {
        this.businessOwnerEmail = businessOwnerEmail;
    }


    /**
     * Gets the rfpAccessUserEmailList value for this GetBusinessDataInfoRS.
     * 
     * @return rfpAccessUserEmailList
     */
    public java.lang.String getRfpAccessUserEmailList() {
        return rfpAccessUserEmailList;
    }


    /**
     * Sets the rfpAccessUserEmailList value for this GetBusinessDataInfoRS.
     * 
     * @param rfpAccessUserEmailList
     */
    public void setRfpAccessUserEmailList(java.lang.String rfpAccessUserEmailList) {
        this.rfpAccessUserEmailList = rfpAccessUserEmailList;
    }


    /**
     * Gets the rfpAccessUserIdList value for this GetBusinessDataInfoRS.
     * 
     * @return rfpAccessUserIdList
     */
    public java.lang.String getRfpAccessUserIdList() {
        return rfpAccessUserIdList;
    }


    /**
     * Sets the rfpAccessUserIdList value for this GetBusinessDataInfoRS.
     * 
     * @param rfpAccessUserIdList
     */
    public void setRfpAccessUserIdList(java.lang.String rfpAccessUserIdList) {
        this.rfpAccessUserIdList = rfpAccessUserIdList;
    }


    /**
     * Gets the startDate value for this GetBusinessDataInfoRS.
     * 
     * @return startDate
     */
    public java.util.Calendar getStartDate() {
        return startDate;
    }


    /**
     * Sets the startDate value for this GetBusinessDataInfoRS.
     * 
     * @param startDate
     */
    public void setStartDate(java.util.Calendar startDate) {
        this.startDate = startDate;
    }


    /**
     * Gets the departureDate value for this GetBusinessDataInfoRS.
     * 
     * @return departureDate
     */
    public java.util.Calendar getDepartureDate() {
        return departureDate;
    }


    /**
     * Sets the departureDate value for this GetBusinessDataInfoRS.
     * 
     * @param departureDate
     */
    public void setDepartureDate(java.util.Calendar departureDate) {
        this.departureDate = departureDate;
    }


    /**
     * Gets the externalRfpId value for this GetBusinessDataInfoRS.
     * 
     * @return externalRfpId
     */
    public java.lang.String getExternalRfpId() {
        return externalRfpId;
    }


    /**
     * Sets the externalRfpId value for this GetBusinessDataInfoRS.
     * 
     * @param externalRfpId
     */
    public void setExternalRfpId(java.lang.String externalRfpId) {
        this.externalRfpId = externalRfpId;
    }


    /**
     * Gets the secondaryExternalRfpId value for this GetBusinessDataInfoRS.
     * 
     * @return secondaryExternalRfpId
     */
    public java.lang.String getSecondaryExternalRfpId() {
        return secondaryExternalRfpId;
    }


    /**
     * Sets the secondaryExternalRfpId value for this GetBusinessDataInfoRS.
     * 
     * @param secondaryExternalRfpId
     */
    public void setSecondaryExternalRfpId(java.lang.String secondaryExternalRfpId) {
        this.secondaryExternalRfpId = secondaryExternalRfpId;
    }


    /**
     * Gets the siteId value for this GetBusinessDataInfoRS.
     * 
     * @return siteId
     */
    public java.lang.Integer getSiteId() {
        return siteId;
    }


    /**
     * Sets the siteId value for this GetBusinessDataInfoRS.
     * 
     * @param siteId
     */
    public void setSiteId(java.lang.Integer siteId) {
        this.siteId = siteId;
    }


    /**
     * Gets the comments value for this GetBusinessDataInfoRS.
     * 
     * @return comments
     */
    public java.lang.String getComments() {
        return comments;
    }


    /**
     * Sets the comments value for this GetBusinessDataInfoRS.
     * 
     * @param comments
     */
    public void setComments(java.lang.String comments) {
        this.comments = comments;
    }


    /**
     * Gets the isPickUpComplete value for this GetBusinessDataInfoRS.
     * 
     * @return isPickUpComplete
     */
    public java.lang.Boolean getIsPickUpComplete() {
        return isPickUpComplete;
    }


    /**
     * Sets the isPickUpComplete value for this GetBusinessDataInfoRS.
     * 
     * @param isPickUpComplete
     */
    public void setIsPickUpComplete(java.lang.Boolean isPickUpComplete) {
        this.isPickUpComplete = isPickUpComplete;
    }


    /**
     * Gets the businessCreateDate value for this GetBusinessDataInfoRS.
     * 
     * @return businessCreateDate
     */
    public java.util.Calendar getBusinessCreateDate() {
        return businessCreateDate;
    }


    /**
     * Sets the businessCreateDate value for this GetBusinessDataInfoRS.
     * 
     * @param businessCreateDate
     */
    public void setBusinessCreateDate(java.util.Calendar businessCreateDate) {
        this.businessCreateDate = businessCreateDate;
    }


    /**
     * Gets the businessId value for this GetBusinessDataInfoRS.
     * 
     * @return businessId
     */
    public java.lang.String getBusinessId() {
        return businessId;
    }


    /**
     * Sets the businessId value for this GetBusinessDataInfoRS.
     * 
     * @param businessId
     */
    public void setBusinessId(java.lang.String businessId) {
        this.businessId = businessId;
    }


    /**
     * Gets the otherIncomeItems value for this GetBusinessDataInfoRS.
     * 
     * @return otherIncomeItems
     */
    public localhost.MeetingBrokerServices.OtherIncomeItem[] getOtherIncomeItems() {
        return otherIncomeItems;
    }


    /**
     * Sets the otherIncomeItems value for this GetBusinessDataInfoRS.
     * 
     * @param otherIncomeItems
     */
    public void setOtherIncomeItems(localhost.MeetingBrokerServices.OtherIncomeItem[] otherIncomeItems) {
        this.otherIncomeItems = otherIncomeItems;
    }


    /**
     * Gets the externalCurrency value for this GetBusinessDataInfoRS.
     * 
     * @return externalCurrency
     */
    public java.lang.String getExternalCurrency() {
        return externalCurrency;
    }


    /**
     * Sets the externalCurrency value for this GetBusinessDataInfoRS.
     * 
     * @param externalCurrency
     */
    public void setExternalCurrency(java.lang.String externalCurrency) {
        this.externalCurrency = externalCurrency;
    }


    /**
     * Gets the commission value for this GetBusinessDataInfoRS.
     * 
     * @return commission
     */
    public java.math.BigDecimal getCommission() {
        return commission;
    }


    /**
     * Sets the commission value for this GetBusinessDataInfoRS.
     * 
     * @param commission
     */
    public void setCommission(java.math.BigDecimal commission) {
        this.commission = commission;
    }


    /**
     * Gets the lostToCity value for this GetBusinessDataInfoRS.
     * 
     * @return lostToCity
     */
    public java.lang.String getLostToCity() {
        return lostToCity;
    }


    /**
     * Sets the lostToCity value for this GetBusinessDataInfoRS.
     * 
     * @param lostToCity
     */
    public void setLostToCity(java.lang.String lostToCity) {
        this.lostToCity = lostToCity;
    }


    /**
     * Gets the lostToHotel value for this GetBusinessDataInfoRS.
     * 
     * @return lostToHotel
     */
    public java.lang.String getLostToHotel() {
        return lostToHotel;
    }


    /**
     * Sets the lostToHotel value for this GetBusinessDataInfoRS.
     * 
     * @param lostToHotel
     */
    public void setLostToHotel(java.lang.String lostToHotel) {
        this.lostToHotel = lostToHotel;
    }


    /**
     * Gets the isLockedBySC value for this GetBusinessDataInfoRS.
     * 
     * @return isLockedBySC
     */
    public java.lang.Boolean getIsLockedBySC() {
        return isLockedBySC;
    }


    /**
     * Sets the isLockedBySC value for this GetBusinessDataInfoRS.
     * 
     * @param isLockedBySC
     */
    public void setIsLockedBySC(java.lang.Boolean isLockedBySC) {
        this.isLockedBySC = isLockedBySC;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetBusinessDataInfoRS)) return false;
        GetBusinessDataInfoRS other = (GetBusinessDataInfoRS) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.businessDataInfo==null && other.getBusinessDataInfo()==null) || 
             (this.businessDataInfo!=null &&
              this.businessDataInfo.equals(other.getBusinessDataInfo()))) &&
            ((this.businessStatus==null && other.getBusinessStatus()==null) || 
             (this.businessStatus!=null &&
              this.businessStatus.equals(other.getBusinessStatus()))) &&
            ((this.externalLostBusinessReason==null && other.getExternalLostBusinessReason()==null) || 
             (this.externalLostBusinessReason!=null &&
              this.externalLostBusinessReason.equals(other.getExternalLostBusinessReason()))) &&
            ((this.businessOwnerId==null && other.getBusinessOwnerId()==null) || 
             (this.businessOwnerId!=null &&
              this.businessOwnerId.equals(other.getBusinessOwnerId()))) &&
            ((this.businessOwnerFirstName==null && other.getBusinessOwnerFirstName()==null) || 
             (this.businessOwnerFirstName!=null &&
              this.businessOwnerFirstName.equals(other.getBusinessOwnerFirstName()))) &&
            ((this.businessOwnerLastName==null && other.getBusinessOwnerLastName()==null) || 
             (this.businessOwnerLastName!=null &&
              this.businessOwnerLastName.equals(other.getBusinessOwnerLastName()))) &&
            ((this.businessOwnerEmail==null && other.getBusinessOwnerEmail()==null) || 
             (this.businessOwnerEmail!=null &&
              this.businessOwnerEmail.equals(other.getBusinessOwnerEmail()))) &&
            ((this.rfpAccessUserEmailList==null && other.getRfpAccessUserEmailList()==null) || 
             (this.rfpAccessUserEmailList!=null &&
              this.rfpAccessUserEmailList.equals(other.getRfpAccessUserEmailList()))) &&
            ((this.rfpAccessUserIdList==null && other.getRfpAccessUserIdList()==null) || 
             (this.rfpAccessUserIdList!=null &&
              this.rfpAccessUserIdList.equals(other.getRfpAccessUserIdList()))) &&
            ((this.startDate==null && other.getStartDate()==null) || 
             (this.startDate!=null &&
              this.startDate.equals(other.getStartDate()))) &&
            ((this.departureDate==null && other.getDepartureDate()==null) || 
             (this.departureDate!=null &&
              this.departureDate.equals(other.getDepartureDate()))) &&
            ((this.externalRfpId==null && other.getExternalRfpId()==null) || 
             (this.externalRfpId!=null &&
              this.externalRfpId.equals(other.getExternalRfpId()))) &&
            ((this.secondaryExternalRfpId==null && other.getSecondaryExternalRfpId()==null) || 
             (this.secondaryExternalRfpId!=null &&
              this.secondaryExternalRfpId.equals(other.getSecondaryExternalRfpId()))) &&
            ((this.siteId==null && other.getSiteId()==null) || 
             (this.siteId!=null &&
              this.siteId.equals(other.getSiteId()))) &&
            ((this.comments==null && other.getComments()==null) || 
             (this.comments!=null &&
              this.comments.equals(other.getComments()))) &&
            ((this.isPickUpComplete==null && other.getIsPickUpComplete()==null) || 
             (this.isPickUpComplete!=null &&
              this.isPickUpComplete.equals(other.getIsPickUpComplete()))) &&
            ((this.businessCreateDate==null && other.getBusinessCreateDate()==null) || 
             (this.businessCreateDate!=null &&
              this.businessCreateDate.equals(other.getBusinessCreateDate()))) &&
            ((this.businessId==null && other.getBusinessId()==null) || 
             (this.businessId!=null &&
              this.businessId.equals(other.getBusinessId()))) &&
            ((this.otherIncomeItems==null && other.getOtherIncomeItems()==null) || 
             (this.otherIncomeItems!=null &&
              java.util.Arrays.equals(this.otherIncomeItems, other.getOtherIncomeItems()))) &&
            ((this.externalCurrency==null && other.getExternalCurrency()==null) || 
             (this.externalCurrency!=null &&
              this.externalCurrency.equals(other.getExternalCurrency()))) &&
            ((this.commission==null && other.getCommission()==null) || 
             (this.commission!=null &&
              this.commission.equals(other.getCommission()))) &&
            ((this.lostToCity==null && other.getLostToCity()==null) || 
             (this.lostToCity!=null &&
              this.lostToCity.equals(other.getLostToCity()))) &&
            ((this.lostToHotel==null && other.getLostToHotel()==null) || 
             (this.lostToHotel!=null &&
              this.lostToHotel.equals(other.getLostToHotel()))) &&
            ((this.isLockedBySC==null && other.getIsLockedBySC()==null) || 
             (this.isLockedBySC!=null &&
              this.isLockedBySC.equals(other.getIsLockedBySC())));
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
        if (getBusinessDataInfo() != null) {
            _hashCode += getBusinessDataInfo().hashCode();
        }
        if (getBusinessStatus() != null) {
            _hashCode += getBusinessStatus().hashCode();
        }
        if (getExternalLostBusinessReason() != null) {
            _hashCode += getExternalLostBusinessReason().hashCode();
        }
        if (getBusinessOwnerId() != null) {
            _hashCode += getBusinessOwnerId().hashCode();
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
        if (getRfpAccessUserEmailList() != null) {
            _hashCode += getRfpAccessUserEmailList().hashCode();
        }
        if (getRfpAccessUserIdList() != null) {
            _hashCode += getRfpAccessUserIdList().hashCode();
        }
        if (getStartDate() != null) {
            _hashCode += getStartDate().hashCode();
        }
        if (getDepartureDate() != null) {
            _hashCode += getDepartureDate().hashCode();
        }
        if (getExternalRfpId() != null) {
            _hashCode += getExternalRfpId().hashCode();
        }
        if (getSecondaryExternalRfpId() != null) {
            _hashCode += getSecondaryExternalRfpId().hashCode();
        }
        if (getSiteId() != null) {
            _hashCode += getSiteId().hashCode();
        }
        if (getComments() != null) {
            _hashCode += getComments().hashCode();
        }
        if (getIsPickUpComplete() != null) {
            _hashCode += getIsPickUpComplete().hashCode();
        }
        if (getBusinessCreateDate() != null) {
            _hashCode += getBusinessCreateDate().hashCode();
        }
        if (getBusinessId() != null) {
            _hashCode += getBusinessId().hashCode();
        }
        if (getOtherIncomeItems() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getOtherIncomeItems());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getOtherIncomeItems(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getExternalCurrency() != null) {
            _hashCode += getExternalCurrency().hashCode();
        }
        if (getCommission() != null) {
            _hashCode += getCommission().hashCode();
        }
        if (getLostToCity() != null) {
            _hashCode += getLostToCity().hashCode();
        }
        if (getLostToHotel() != null) {
            _hashCode += getLostToHotel().hashCode();
        }
        if (getIsLockedBySC() != null) {
            _hashCode += getIsLockedBySC().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetBusinessDataInfoRS.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "GetBusinessDataInfoRS"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("businessDataInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "BusinessDataInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "BusinessDataInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
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
        elemField.setFieldName("businessOwnerId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "BusinessOwnerId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
        elemField.setFieldName("rfpAccessUserEmailList");
        elemField.setXmlName(new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "RfpAccessUserEmailList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rfpAccessUserIdList");
        elemField.setXmlName(new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "RfpAccessUserIdList"));
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
        elemField.setFieldName("departureDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "DepartureDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
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
        elemField.setFieldName("siteId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "SiteId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("comments");
        elemField.setXmlName(new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "Comments"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isPickUpComplete");
        elemField.setXmlName(new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "IsPickUpComplete"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("businessCreateDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "BusinessCreateDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
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
        elemField.setFieldName("otherIncomeItems");
        elemField.setXmlName(new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "OtherIncomeItems"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "OtherIncomeItem"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "OtherIncomeItem"));
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
        elemField.setFieldName("lostToCity");
        elemField.setXmlName(new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "LostToCity"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lostToHotel");
        elemField.setXmlName(new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "LostToHotel"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isLockedBySC");
        elemField.setXmlName(new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "IsLockedBySC"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
