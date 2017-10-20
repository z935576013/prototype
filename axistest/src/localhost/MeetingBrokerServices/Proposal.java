/**
 * Proposal.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package localhost.MeetingBrokerServices;

public class Proposal  implements java.io.Serializable {
    private java.lang.String externalRfpId;

    private java.lang.Integer siteId;

    private java.lang.Integer externalLocationId;

    private java.math.BigDecimal commission;

    private java.lang.Boolean isCommissionable;

    private localhost.MeetingBrokerServices.ProposalStatus status;

    private localhost.MeetingBrokerServices.MeetingInfo meetingInfo;

    private localhost.MeetingBrokerServices.RoomBlock roomBlock;

    private localhost.MeetingBrokerServices.EventBlock eventBlock;

    private int rfpId;

    private int proposalId;

    private java.lang.String channelName;

    private java.lang.String sendingUser;

    private java.lang.String sendingLocation;

    private java.lang.String redirectedLocationName;

    private int redirectedLocationId;

    private java.lang.String assignedUser;

    public Proposal() {
    }

    public Proposal(
           java.lang.String externalRfpId,
           java.lang.Integer siteId,
           java.lang.Integer externalLocationId,
           java.math.BigDecimal commission,
           java.lang.Boolean isCommissionable,
           localhost.MeetingBrokerServices.ProposalStatus status,
           localhost.MeetingBrokerServices.MeetingInfo meetingInfo,
           localhost.MeetingBrokerServices.RoomBlock roomBlock,
           localhost.MeetingBrokerServices.EventBlock eventBlock,
           int rfpId,
           int proposalId,
           java.lang.String channelName,
           java.lang.String sendingUser,
           java.lang.String sendingLocation,
           java.lang.String redirectedLocationName,
           int redirectedLocationId,
           java.lang.String assignedUser) {
           this.externalRfpId = externalRfpId;
           this.siteId = siteId;
           this.externalLocationId = externalLocationId;
           this.commission = commission;
           this.isCommissionable = isCommissionable;
           this.status = status;
           this.meetingInfo = meetingInfo;
           this.roomBlock = roomBlock;
           this.eventBlock = eventBlock;
           this.rfpId = rfpId;
           this.proposalId = proposalId;
           this.channelName = channelName;
           this.sendingUser = sendingUser;
           this.sendingLocation = sendingLocation;
           this.redirectedLocationName = redirectedLocationName;
           this.redirectedLocationId = redirectedLocationId;
           this.assignedUser = assignedUser;
    }


    /**
     * Gets the externalRfpId value for this Proposal.
     * 
     * @return externalRfpId
     */
    public java.lang.String getExternalRfpId() {
        return externalRfpId;
    }


    /**
     * Sets the externalRfpId value for this Proposal.
     * 
     * @param externalRfpId
     */
    public void setExternalRfpId(java.lang.String externalRfpId) {
        this.externalRfpId = externalRfpId;
    }


    /**
     * Gets the siteId value for this Proposal.
     * 
     * @return siteId
     */
    public java.lang.Integer getSiteId() {
        return siteId;
    }


    /**
     * Sets the siteId value for this Proposal.
     * 
     * @param siteId
     */
    public void setSiteId(java.lang.Integer siteId) {
        this.siteId = siteId;
    }


    /**
     * Gets the externalLocationId value for this Proposal.
     * 
     * @return externalLocationId
     */
    public java.lang.Integer getExternalLocationId() {
        return externalLocationId;
    }


    /**
     * Sets the externalLocationId value for this Proposal.
     * 
     * @param externalLocationId
     */
    public void setExternalLocationId(java.lang.Integer externalLocationId) {
        this.externalLocationId = externalLocationId;
    }


    /**
     * Gets the commission value for this Proposal.
     * 
     * @return commission
     */
    public java.math.BigDecimal getCommission() {
        return commission;
    }


    /**
     * Sets the commission value for this Proposal.
     * 
     * @param commission
     */
    public void setCommission(java.math.BigDecimal commission) {
        this.commission = commission;
    }


    /**
     * Gets the isCommissionable value for this Proposal.
     * 
     * @return isCommissionable
     */
    public java.lang.Boolean getIsCommissionable() {
        return isCommissionable;
    }


    /**
     * Sets the isCommissionable value for this Proposal.
     * 
     * @param isCommissionable
     */
    public void setIsCommissionable(java.lang.Boolean isCommissionable) {
        this.isCommissionable = isCommissionable;
    }


    /**
     * Gets the status value for this Proposal.
     * 
     * @return status
     */
    public localhost.MeetingBrokerServices.ProposalStatus getStatus() {
        return status;
    }


    /**
     * Sets the status value for this Proposal.
     * 
     * @param status
     */
    public void setStatus(localhost.MeetingBrokerServices.ProposalStatus status) {
        this.status = status;
    }


    /**
     * Gets the meetingInfo value for this Proposal.
     * 
     * @return meetingInfo
     */
    public localhost.MeetingBrokerServices.MeetingInfo getMeetingInfo() {
        return meetingInfo;
    }


    /**
     * Sets the meetingInfo value for this Proposal.
     * 
     * @param meetingInfo
     */
    public void setMeetingInfo(localhost.MeetingBrokerServices.MeetingInfo meetingInfo) {
        this.meetingInfo = meetingInfo;
    }


    /**
     * Gets the roomBlock value for this Proposal.
     * 
     * @return roomBlock
     */
    public localhost.MeetingBrokerServices.RoomBlock getRoomBlock() {
        return roomBlock;
    }


    /**
     * Sets the roomBlock value for this Proposal.
     * 
     * @param roomBlock
     */
    public void setRoomBlock(localhost.MeetingBrokerServices.RoomBlock roomBlock) {
        this.roomBlock = roomBlock;
    }


    /**
     * Gets the eventBlock value for this Proposal.
     * 
     * @return eventBlock
     */
    public localhost.MeetingBrokerServices.EventBlock getEventBlock() {
        return eventBlock;
    }


    /**
     * Sets the eventBlock value for this Proposal.
     * 
     * @param eventBlock
     */
    public void setEventBlock(localhost.MeetingBrokerServices.EventBlock eventBlock) {
        this.eventBlock = eventBlock;
    }


    /**
     * Gets the rfpId value for this Proposal.
     * 
     * @return rfpId
     */
    public int getRfpId() {
        return rfpId;
    }


    /**
     * Sets the rfpId value for this Proposal.
     * 
     * @param rfpId
     */
    public void setRfpId(int rfpId) {
        this.rfpId = rfpId;
    }


    /**
     * Gets the proposalId value for this Proposal.
     * 
     * @return proposalId
     */
    public int getProposalId() {
        return proposalId;
    }


    /**
     * Sets the proposalId value for this Proposal.
     * 
     * @param proposalId
     */
    public void setProposalId(int proposalId) {
        this.proposalId = proposalId;
    }


    /**
     * Gets the channelName value for this Proposal.
     * 
     * @return channelName
     */
    public java.lang.String getChannelName() {
        return channelName;
    }


    /**
     * Sets the channelName value for this Proposal.
     * 
     * @param channelName
     */
    public void setChannelName(java.lang.String channelName) {
        this.channelName = channelName;
    }


    /**
     * Gets the sendingUser value for this Proposal.
     * 
     * @return sendingUser
     */
    public java.lang.String getSendingUser() {
        return sendingUser;
    }


    /**
     * Sets the sendingUser value for this Proposal.
     * 
     * @param sendingUser
     */
    public void setSendingUser(java.lang.String sendingUser) {
        this.sendingUser = sendingUser;
    }


    /**
     * Gets the sendingLocation value for this Proposal.
     * 
     * @return sendingLocation
     */
    public java.lang.String getSendingLocation() {
        return sendingLocation;
    }


    /**
     * Sets the sendingLocation value for this Proposal.
     * 
     * @param sendingLocation
     */
    public void setSendingLocation(java.lang.String sendingLocation) {
        this.sendingLocation = sendingLocation;
    }


    /**
     * Gets the redirectedLocationName value for this Proposal.
     * 
     * @return redirectedLocationName
     */
    public java.lang.String getRedirectedLocationName() {
        return redirectedLocationName;
    }


    /**
     * Sets the redirectedLocationName value for this Proposal.
     * 
     * @param redirectedLocationName
     */
    public void setRedirectedLocationName(java.lang.String redirectedLocationName) {
        this.redirectedLocationName = redirectedLocationName;
    }


    /**
     * Gets the redirectedLocationId value for this Proposal.
     * 
     * @return redirectedLocationId
     */
    public int getRedirectedLocationId() {
        return redirectedLocationId;
    }


    /**
     * Sets the redirectedLocationId value for this Proposal.
     * 
     * @param redirectedLocationId
     */
    public void setRedirectedLocationId(int redirectedLocationId) {
        this.redirectedLocationId = redirectedLocationId;
    }


    /**
     * Gets the assignedUser value for this Proposal.
     * 
     * @return assignedUser
     */
    public java.lang.String getAssignedUser() {
        return assignedUser;
    }


    /**
     * Sets the assignedUser value for this Proposal.
     * 
     * @param assignedUser
     */
    public void setAssignedUser(java.lang.String assignedUser) {
        this.assignedUser = assignedUser;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Proposal)) return false;
        Proposal other = (Proposal) obj;
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
            ((this.siteId==null && other.getSiteId()==null) || 
             (this.siteId!=null &&
              this.siteId.equals(other.getSiteId()))) &&
            ((this.externalLocationId==null && other.getExternalLocationId()==null) || 
             (this.externalLocationId!=null &&
              this.externalLocationId.equals(other.getExternalLocationId()))) &&
            ((this.commission==null && other.getCommission()==null) || 
             (this.commission!=null &&
              this.commission.equals(other.getCommission()))) &&
            ((this.isCommissionable==null && other.getIsCommissionable()==null) || 
             (this.isCommissionable!=null &&
              this.isCommissionable.equals(other.getIsCommissionable()))) &&
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              this.status.equals(other.getStatus()))) &&
            ((this.meetingInfo==null && other.getMeetingInfo()==null) || 
             (this.meetingInfo!=null &&
              this.meetingInfo.equals(other.getMeetingInfo()))) &&
            ((this.roomBlock==null && other.getRoomBlock()==null) || 
             (this.roomBlock!=null &&
              this.roomBlock.equals(other.getRoomBlock()))) &&
            ((this.eventBlock==null && other.getEventBlock()==null) || 
             (this.eventBlock!=null &&
              this.eventBlock.equals(other.getEventBlock()))) &&
            this.rfpId == other.getRfpId() &&
            this.proposalId == other.getProposalId() &&
            ((this.channelName==null && other.getChannelName()==null) || 
             (this.channelName!=null &&
              this.channelName.equals(other.getChannelName()))) &&
            ((this.sendingUser==null && other.getSendingUser()==null) || 
             (this.sendingUser!=null &&
              this.sendingUser.equals(other.getSendingUser()))) &&
            ((this.sendingLocation==null && other.getSendingLocation()==null) || 
             (this.sendingLocation!=null &&
              this.sendingLocation.equals(other.getSendingLocation()))) &&
            ((this.redirectedLocationName==null && other.getRedirectedLocationName()==null) || 
             (this.redirectedLocationName!=null &&
              this.redirectedLocationName.equals(other.getRedirectedLocationName()))) &&
            this.redirectedLocationId == other.getRedirectedLocationId() &&
            ((this.assignedUser==null && other.getAssignedUser()==null) || 
             (this.assignedUser!=null &&
              this.assignedUser.equals(other.getAssignedUser())));
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
        if (getSiteId() != null) {
            _hashCode += getSiteId().hashCode();
        }
        if (getExternalLocationId() != null) {
            _hashCode += getExternalLocationId().hashCode();
        }
        if (getCommission() != null) {
            _hashCode += getCommission().hashCode();
        }
        if (getIsCommissionable() != null) {
            _hashCode += getIsCommissionable().hashCode();
        }
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        if (getMeetingInfo() != null) {
            _hashCode += getMeetingInfo().hashCode();
        }
        if (getRoomBlock() != null) {
            _hashCode += getRoomBlock().hashCode();
        }
        if (getEventBlock() != null) {
            _hashCode += getEventBlock().hashCode();
        }
        _hashCode += getRfpId();
        _hashCode += getProposalId();
        if (getChannelName() != null) {
            _hashCode += getChannelName().hashCode();
        }
        if (getSendingUser() != null) {
            _hashCode += getSendingUser().hashCode();
        }
        if (getSendingLocation() != null) {
            _hashCode += getSendingLocation().hashCode();
        }
        if (getRedirectedLocationName() != null) {
            _hashCode += getRedirectedLocationName().hashCode();
        }
        _hashCode += getRedirectedLocationId();
        if (getAssignedUser() != null) {
            _hashCode += getAssignedUser().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Proposal.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "Proposal"));
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
        elemField.setFieldName("externalLocationId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "ExternalLocationId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "Status"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "ProposalStatus"));
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
        elemField.setFieldName("roomBlock");
        elemField.setXmlName(new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "RoomBlock"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "RoomBlock"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("eventBlock");
        elemField.setXmlName(new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "EventBlock"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "EventBlock"));
        elemField.setMinOccurs(0);
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
        elemField.setFieldName("channelName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "ChannelName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sendingUser");
        elemField.setXmlName(new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "SendingUser"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sendingLocation");
        elemField.setXmlName(new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "SendingLocation"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("redirectedLocationName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "RedirectedLocationName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("redirectedLocationId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "RedirectedLocationId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("assignedUser");
        elemField.setXmlName(new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "AssignedUser"));
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
