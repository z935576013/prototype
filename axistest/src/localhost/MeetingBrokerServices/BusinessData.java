/**
 * BusinessData.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package localhost.MeetingBrokerServices;

public class BusinessData  implements java.io.Serializable {
    private java.lang.Integer rfpId;

    private java.lang.Integer proposalId;

    private localhost.MeetingBrokerServices.BusinessDataInfo agreedBusinessDataInfo;

    private localhost.MeetingBrokerServices.BusinessDataInfo pickedUpBusinessDataInfo;

    private localhost.MeetingBrokerServices.BusinessDataInfo actualBusinessDataInfo;

    private localhost.MeetingBrokerServices.BusinessDataInfo blockedBusinessDataInfo;

    private localhost.MeetingBrokerServices.MeetingInfo meetingInfo;

    private localhost.MeetingBrokerServices.BusinessStatus businessStatus;

    private java.lang.String externalLostBusinessReason;

    private java.lang.Integer businessOwnerId;

    private java.lang.String businessOwnerName;

    private java.lang.String businessOwnerEmail;

    private java.lang.String rfpAccessUserEmailList;

    private java.lang.String rfpAccessUserIdList;

    private java.util.Calendar departureDate;

    private java.lang.String comments;

    private java.lang.String externalBookingId;

    private java.util.Calendar businessCreationDate;

    private boolean isPickUpComplete;

    private java.lang.String lostToCity;

    private java.lang.String lostToHotel;

    private localhost.MeetingBrokerServices.OtherIncomeItem[] otherIncomeItems;

    private localhost.MeetingBrokerServices.LocationIdentifier locationIdentifier;

    public BusinessData() {
    }

    public BusinessData(
           java.lang.Integer rfpId,
           java.lang.Integer proposalId,
           localhost.MeetingBrokerServices.BusinessDataInfo agreedBusinessDataInfo,
           localhost.MeetingBrokerServices.BusinessDataInfo pickedUpBusinessDataInfo,
           localhost.MeetingBrokerServices.BusinessDataInfo actualBusinessDataInfo,
           localhost.MeetingBrokerServices.BusinessDataInfo blockedBusinessDataInfo,
           localhost.MeetingBrokerServices.MeetingInfo meetingInfo,
           localhost.MeetingBrokerServices.BusinessStatus businessStatus,
           java.lang.String externalLostBusinessReason,
           java.lang.Integer businessOwnerId,
           java.lang.String businessOwnerName,
           java.lang.String businessOwnerEmail,
           java.lang.String rfpAccessUserEmailList,
           java.lang.String rfpAccessUserIdList,
           java.util.Calendar departureDate,
           java.lang.String comments,
           java.lang.String externalBookingId,
           java.util.Calendar businessCreationDate,
           boolean isPickUpComplete,
           java.lang.String lostToCity,
           java.lang.String lostToHotel,
           localhost.MeetingBrokerServices.OtherIncomeItem[] otherIncomeItems,
           localhost.MeetingBrokerServices.LocationIdentifier locationIdentifier) {
           this.rfpId = rfpId;
           this.proposalId = proposalId;
           this.agreedBusinessDataInfo = agreedBusinessDataInfo;
           this.pickedUpBusinessDataInfo = pickedUpBusinessDataInfo;
           this.actualBusinessDataInfo = actualBusinessDataInfo;
           this.blockedBusinessDataInfo = blockedBusinessDataInfo;
           this.meetingInfo = meetingInfo;
           this.businessStatus = businessStatus;
           this.externalLostBusinessReason = externalLostBusinessReason;
           this.businessOwnerId = businessOwnerId;
           this.businessOwnerName = businessOwnerName;
           this.businessOwnerEmail = businessOwnerEmail;
           this.rfpAccessUserEmailList = rfpAccessUserEmailList;
           this.rfpAccessUserIdList = rfpAccessUserIdList;
           this.departureDate = departureDate;
           this.comments = comments;
           this.externalBookingId = externalBookingId;
           this.businessCreationDate = businessCreationDate;
           this.isPickUpComplete = isPickUpComplete;
           this.lostToCity = lostToCity;
           this.lostToHotel = lostToHotel;
           this.otherIncomeItems = otherIncomeItems;
           this.locationIdentifier = locationIdentifier;
    }


    /**
     * Gets the rfpId value for this BusinessData.
     * 
     * @return rfpId
     */
    public java.lang.Integer getRfpId() {
        return rfpId;
    }


    /**
     * Sets the rfpId value for this BusinessData.
     * 
     * @param rfpId
     */
    public void setRfpId(java.lang.Integer rfpId) {
        this.rfpId = rfpId;
    }


    /**
     * Gets the proposalId value for this BusinessData.
     * 
     * @return proposalId
     */
    public java.lang.Integer getProposalId() {
        return proposalId;
    }


    /**
     * Sets the proposalId value for this BusinessData.
     * 
     * @param proposalId
     */
    public void setProposalId(java.lang.Integer proposalId) {
        this.proposalId = proposalId;
    }


    /**
     * Gets the agreedBusinessDataInfo value for this BusinessData.
     * 
     * @return agreedBusinessDataInfo
     */
    public localhost.MeetingBrokerServices.BusinessDataInfo getAgreedBusinessDataInfo() {
        return agreedBusinessDataInfo;
    }


    /**
     * Sets the agreedBusinessDataInfo value for this BusinessData.
     * 
     * @param agreedBusinessDataInfo
     */
    public void setAgreedBusinessDataInfo(localhost.MeetingBrokerServices.BusinessDataInfo agreedBusinessDataInfo) {
        this.agreedBusinessDataInfo = agreedBusinessDataInfo;
    }


    /**
     * Gets the pickedUpBusinessDataInfo value for this BusinessData.
     * 
     * @return pickedUpBusinessDataInfo
     */
    public localhost.MeetingBrokerServices.BusinessDataInfo getPickedUpBusinessDataInfo() {
        return pickedUpBusinessDataInfo;
    }


    /**
     * Sets the pickedUpBusinessDataInfo value for this BusinessData.
     * 
     * @param pickedUpBusinessDataInfo
     */
    public void setPickedUpBusinessDataInfo(localhost.MeetingBrokerServices.BusinessDataInfo pickedUpBusinessDataInfo) {
        this.pickedUpBusinessDataInfo = pickedUpBusinessDataInfo;
    }


    /**
     * Gets the actualBusinessDataInfo value for this BusinessData.
     * 
     * @return actualBusinessDataInfo
     */
    public localhost.MeetingBrokerServices.BusinessDataInfo getActualBusinessDataInfo() {
        return actualBusinessDataInfo;
    }


    /**
     * Sets the actualBusinessDataInfo value for this BusinessData.
     * 
     * @param actualBusinessDataInfo
     */
    public void setActualBusinessDataInfo(localhost.MeetingBrokerServices.BusinessDataInfo actualBusinessDataInfo) {
        this.actualBusinessDataInfo = actualBusinessDataInfo;
    }


    /**
     * Gets the blockedBusinessDataInfo value for this BusinessData.
     * 
     * @return blockedBusinessDataInfo
     */
    public localhost.MeetingBrokerServices.BusinessDataInfo getBlockedBusinessDataInfo() {
        return blockedBusinessDataInfo;
    }


    /**
     * Sets the blockedBusinessDataInfo value for this BusinessData.
     * 
     * @param blockedBusinessDataInfo
     */
    public void setBlockedBusinessDataInfo(localhost.MeetingBrokerServices.BusinessDataInfo blockedBusinessDataInfo) {
        this.blockedBusinessDataInfo = blockedBusinessDataInfo;
    }


    /**
     * Gets the meetingInfo value for this BusinessData.
     * 
     * @return meetingInfo
     */
    public localhost.MeetingBrokerServices.MeetingInfo getMeetingInfo() {
        return meetingInfo;
    }


    /**
     * Sets the meetingInfo value for this BusinessData.
     * 
     * @param meetingInfo
     */
    public void setMeetingInfo(localhost.MeetingBrokerServices.MeetingInfo meetingInfo) {
        this.meetingInfo = meetingInfo;
    }


    /**
     * Gets the businessStatus value for this BusinessData.
     * 
     * @return businessStatus
     */
    public localhost.MeetingBrokerServices.BusinessStatus getBusinessStatus() {
        return businessStatus;
    }


    /**
     * Sets the businessStatus value for this BusinessData.
     * 
     * @param businessStatus
     */
    public void setBusinessStatus(localhost.MeetingBrokerServices.BusinessStatus businessStatus) {
        this.businessStatus = businessStatus;
    }


    /**
     * Gets the externalLostBusinessReason value for this BusinessData.
     * 
     * @return externalLostBusinessReason
     */
    public java.lang.String getExternalLostBusinessReason() {
        return externalLostBusinessReason;
    }


    /**
     * Sets the externalLostBusinessReason value for this BusinessData.
     * 
     * @param externalLostBusinessReason
     */
    public void setExternalLostBusinessReason(java.lang.String externalLostBusinessReason) {
        this.externalLostBusinessReason = externalLostBusinessReason;
    }


    /**
     * Gets the businessOwnerId value for this BusinessData.
     * 
     * @return businessOwnerId
     */
    public java.lang.Integer getBusinessOwnerId() {
        return businessOwnerId;
    }


    /**
     * Sets the businessOwnerId value for this BusinessData.
     * 
     * @param businessOwnerId
     */
    public void setBusinessOwnerId(java.lang.Integer businessOwnerId) {
        this.businessOwnerId = businessOwnerId;
    }


    /**
     * Gets the businessOwnerName value for this BusinessData.
     * 
     * @return businessOwnerName
     */
    public java.lang.String getBusinessOwnerName() {
        return businessOwnerName;
    }


    /**
     * Sets the businessOwnerName value for this BusinessData.
     * 
     * @param businessOwnerName
     */
    public void setBusinessOwnerName(java.lang.String businessOwnerName) {
        this.businessOwnerName = businessOwnerName;
    }


    /**
     * Gets the businessOwnerEmail value for this BusinessData.
     * 
     * @return businessOwnerEmail
     */
    public java.lang.String getBusinessOwnerEmail() {
        return businessOwnerEmail;
    }


    /**
     * Sets the businessOwnerEmail value for this BusinessData.
     * 
     * @param businessOwnerEmail
     */
    public void setBusinessOwnerEmail(java.lang.String businessOwnerEmail) {
        this.businessOwnerEmail = businessOwnerEmail;
    }


    /**
     * Gets the rfpAccessUserEmailList value for this BusinessData.
     * 
     * @return rfpAccessUserEmailList
     */
    public java.lang.String getRfpAccessUserEmailList() {
        return rfpAccessUserEmailList;
    }


    /**
     * Sets the rfpAccessUserEmailList value for this BusinessData.
     * 
     * @param rfpAccessUserEmailList
     */
    public void setRfpAccessUserEmailList(java.lang.String rfpAccessUserEmailList) {
        this.rfpAccessUserEmailList = rfpAccessUserEmailList;
    }


    /**
     * Gets the rfpAccessUserIdList value for this BusinessData.
     * 
     * @return rfpAccessUserIdList
     */
    public java.lang.String getRfpAccessUserIdList() {
        return rfpAccessUserIdList;
    }


    /**
     * Sets the rfpAccessUserIdList value for this BusinessData.
     * 
     * @param rfpAccessUserIdList
     */
    public void setRfpAccessUserIdList(java.lang.String rfpAccessUserIdList) {
        this.rfpAccessUserIdList = rfpAccessUserIdList;
    }


    /**
     * Gets the departureDate value for this BusinessData.
     * 
     * @return departureDate
     */
    public java.util.Calendar getDepartureDate() {
        return departureDate;
    }


    /**
     * Sets the departureDate value for this BusinessData.
     * 
     * @param departureDate
     */
    public void setDepartureDate(java.util.Calendar departureDate) {
        this.departureDate = departureDate;
    }


    /**
     * Gets the comments value for this BusinessData.
     * 
     * @return comments
     */
    public java.lang.String getComments() {
        return comments;
    }


    /**
     * Sets the comments value for this BusinessData.
     * 
     * @param comments
     */
    public void setComments(java.lang.String comments) {
        this.comments = comments;
    }


    /**
     * Gets the externalBookingId value for this BusinessData.
     * 
     * @return externalBookingId
     */
    public java.lang.String getExternalBookingId() {
        return externalBookingId;
    }


    /**
     * Sets the externalBookingId value for this BusinessData.
     * 
     * @param externalBookingId
     */
    public void setExternalBookingId(java.lang.String externalBookingId) {
        this.externalBookingId = externalBookingId;
    }


    /**
     * Gets the businessCreationDate value for this BusinessData.
     * 
     * @return businessCreationDate
     */
    public java.util.Calendar getBusinessCreationDate() {
        return businessCreationDate;
    }


    /**
     * Sets the businessCreationDate value for this BusinessData.
     * 
     * @param businessCreationDate
     */
    public void setBusinessCreationDate(java.util.Calendar businessCreationDate) {
        this.businessCreationDate = businessCreationDate;
    }


    /**
     * Gets the isPickUpComplete value for this BusinessData.
     * 
     * @return isPickUpComplete
     */
    public boolean isIsPickUpComplete() {
        return isPickUpComplete;
    }


    /**
     * Sets the isPickUpComplete value for this BusinessData.
     * 
     * @param isPickUpComplete
     */
    public void setIsPickUpComplete(boolean isPickUpComplete) {
        this.isPickUpComplete = isPickUpComplete;
    }


    /**
     * Gets the lostToCity value for this BusinessData.
     * 
     * @return lostToCity
     */
    public java.lang.String getLostToCity() {
        return lostToCity;
    }


    /**
     * Sets the lostToCity value for this BusinessData.
     * 
     * @param lostToCity
     */
    public void setLostToCity(java.lang.String lostToCity) {
        this.lostToCity = lostToCity;
    }


    /**
     * Gets the lostToHotel value for this BusinessData.
     * 
     * @return lostToHotel
     */
    public java.lang.String getLostToHotel() {
        return lostToHotel;
    }


    /**
     * Sets the lostToHotel value for this BusinessData.
     * 
     * @param lostToHotel
     */
    public void setLostToHotel(java.lang.String lostToHotel) {
        this.lostToHotel = lostToHotel;
    }


    /**
     * Gets the otherIncomeItems value for this BusinessData.
     * 
     * @return otherIncomeItems
     */
    public localhost.MeetingBrokerServices.OtherIncomeItem[] getOtherIncomeItems() {
        return otherIncomeItems;
    }


    /**
     * Sets the otherIncomeItems value for this BusinessData.
     * 
     * @param otherIncomeItems
     */
    public void setOtherIncomeItems(localhost.MeetingBrokerServices.OtherIncomeItem[] otherIncomeItems) {
        this.otherIncomeItems = otherIncomeItems;
    }


    /**
     * Gets the locationIdentifier value for this BusinessData.
     * 
     * @return locationIdentifier
     */
    public localhost.MeetingBrokerServices.LocationIdentifier getLocationIdentifier() {
        return locationIdentifier;
    }


    /**
     * Sets the locationIdentifier value for this BusinessData.
     * 
     * @param locationIdentifier
     */
    public void setLocationIdentifier(localhost.MeetingBrokerServices.LocationIdentifier locationIdentifier) {
        this.locationIdentifier = locationIdentifier;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof BusinessData)) return false;
        BusinessData other = (BusinessData) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.rfpId==null && other.getRfpId()==null) || 
             (this.rfpId!=null &&
              this.rfpId.equals(other.getRfpId()))) &&
            ((this.proposalId==null && other.getProposalId()==null) || 
             (this.proposalId!=null &&
              this.proposalId.equals(other.getProposalId()))) &&
            ((this.agreedBusinessDataInfo==null && other.getAgreedBusinessDataInfo()==null) || 
             (this.agreedBusinessDataInfo!=null &&
              this.agreedBusinessDataInfo.equals(other.getAgreedBusinessDataInfo()))) &&
            ((this.pickedUpBusinessDataInfo==null && other.getPickedUpBusinessDataInfo()==null) || 
             (this.pickedUpBusinessDataInfo!=null &&
              this.pickedUpBusinessDataInfo.equals(other.getPickedUpBusinessDataInfo()))) &&
            ((this.actualBusinessDataInfo==null && other.getActualBusinessDataInfo()==null) || 
             (this.actualBusinessDataInfo!=null &&
              this.actualBusinessDataInfo.equals(other.getActualBusinessDataInfo()))) &&
            ((this.blockedBusinessDataInfo==null && other.getBlockedBusinessDataInfo()==null) || 
             (this.blockedBusinessDataInfo!=null &&
              this.blockedBusinessDataInfo.equals(other.getBlockedBusinessDataInfo()))) &&
            ((this.meetingInfo==null && other.getMeetingInfo()==null) || 
             (this.meetingInfo!=null &&
              this.meetingInfo.equals(other.getMeetingInfo()))) &&
            ((this.businessStatus==null && other.getBusinessStatus()==null) || 
             (this.businessStatus!=null &&
              this.businessStatus.equals(other.getBusinessStatus()))) &&
            ((this.externalLostBusinessReason==null && other.getExternalLostBusinessReason()==null) || 
             (this.externalLostBusinessReason!=null &&
              this.externalLostBusinessReason.equals(other.getExternalLostBusinessReason()))) &&
            ((this.businessOwnerId==null && other.getBusinessOwnerId()==null) || 
             (this.businessOwnerId!=null &&
              this.businessOwnerId.equals(other.getBusinessOwnerId()))) &&
            ((this.businessOwnerName==null && other.getBusinessOwnerName()==null) || 
             (this.businessOwnerName!=null &&
              this.businessOwnerName.equals(other.getBusinessOwnerName()))) &&
            ((this.businessOwnerEmail==null && other.getBusinessOwnerEmail()==null) || 
             (this.businessOwnerEmail!=null &&
              this.businessOwnerEmail.equals(other.getBusinessOwnerEmail()))) &&
            ((this.rfpAccessUserEmailList==null && other.getRfpAccessUserEmailList()==null) || 
             (this.rfpAccessUserEmailList!=null &&
              this.rfpAccessUserEmailList.equals(other.getRfpAccessUserEmailList()))) &&
            ((this.rfpAccessUserIdList==null && other.getRfpAccessUserIdList()==null) || 
             (this.rfpAccessUserIdList!=null &&
              this.rfpAccessUserIdList.equals(other.getRfpAccessUserIdList()))) &&
            ((this.departureDate==null && other.getDepartureDate()==null) || 
             (this.departureDate!=null &&
              this.departureDate.equals(other.getDepartureDate()))) &&
            ((this.comments==null && other.getComments()==null) || 
             (this.comments!=null &&
              this.comments.equals(other.getComments()))) &&
            ((this.externalBookingId==null && other.getExternalBookingId()==null) || 
             (this.externalBookingId!=null &&
              this.externalBookingId.equals(other.getExternalBookingId()))) &&
            ((this.businessCreationDate==null && other.getBusinessCreationDate()==null) || 
             (this.businessCreationDate!=null &&
              this.businessCreationDate.equals(other.getBusinessCreationDate()))) &&
            this.isPickUpComplete == other.isIsPickUpComplete() &&
            ((this.lostToCity==null && other.getLostToCity()==null) || 
             (this.lostToCity!=null &&
              this.lostToCity.equals(other.getLostToCity()))) &&
            ((this.lostToHotel==null && other.getLostToHotel()==null) || 
             (this.lostToHotel!=null &&
              this.lostToHotel.equals(other.getLostToHotel()))) &&
            ((this.otherIncomeItems==null && other.getOtherIncomeItems()==null) || 
             (this.otherIncomeItems!=null &&
              java.util.Arrays.equals(this.otherIncomeItems, other.getOtherIncomeItems()))) &&
            ((this.locationIdentifier==null && other.getLocationIdentifier()==null) || 
             (this.locationIdentifier!=null &&
              this.locationIdentifier.equals(other.getLocationIdentifier())));
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
        if (getRfpId() != null) {
            _hashCode += getRfpId().hashCode();
        }
        if (getProposalId() != null) {
            _hashCode += getProposalId().hashCode();
        }
        if (getAgreedBusinessDataInfo() != null) {
            _hashCode += getAgreedBusinessDataInfo().hashCode();
        }
        if (getPickedUpBusinessDataInfo() != null) {
            _hashCode += getPickedUpBusinessDataInfo().hashCode();
        }
        if (getActualBusinessDataInfo() != null) {
            _hashCode += getActualBusinessDataInfo().hashCode();
        }
        if (getBlockedBusinessDataInfo() != null) {
            _hashCode += getBlockedBusinessDataInfo().hashCode();
        }
        if (getMeetingInfo() != null) {
            _hashCode += getMeetingInfo().hashCode();
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
        if (getBusinessOwnerName() != null) {
            _hashCode += getBusinessOwnerName().hashCode();
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
        if (getDepartureDate() != null) {
            _hashCode += getDepartureDate().hashCode();
        }
        if (getComments() != null) {
            _hashCode += getComments().hashCode();
        }
        if (getExternalBookingId() != null) {
            _hashCode += getExternalBookingId().hashCode();
        }
        if (getBusinessCreationDate() != null) {
            _hashCode += getBusinessCreationDate().hashCode();
        }
        _hashCode += (isIsPickUpComplete() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getLostToCity() != null) {
            _hashCode += getLostToCity().hashCode();
        }
        if (getLostToHotel() != null) {
            _hashCode += getLostToHotel().hashCode();
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
        if (getLocationIdentifier() != null) {
            _hashCode += getLocationIdentifier().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(BusinessData.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "BusinessData"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rfpId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "RfpId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("proposalId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "ProposalId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("agreedBusinessDataInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "AgreedBusinessDataInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "BusinessDataInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pickedUpBusinessDataInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "PickedUpBusinessDataInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "BusinessDataInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("actualBusinessDataInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "ActualBusinessDataInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "BusinessDataInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("blockedBusinessDataInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "BlockedBusinessDataInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "BusinessDataInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("meetingInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "MeetingInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "MeetingInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("businessStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "BusinessStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "BusinessStatus"));
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
        elemField.setFieldName("businessOwnerName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "BusinessOwnerName"));
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
        elemField.setFieldName("departureDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "DepartureDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
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
        elemField.setFieldName("externalBookingId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "ExternalBookingId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("businessCreationDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "BusinessCreationDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isPickUpComplete");
        elemField.setXmlName(new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "IsPickUpComplete"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
        elemField.setFieldName("otherIncomeItems");
        elemField.setXmlName(new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "OtherIncomeItems"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "OtherIncomeItem"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "OtherIncomeItem"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("locationIdentifier");
        elemField.setXmlName(new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "LocationIdentifier"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "LocationIdentifier"));
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
