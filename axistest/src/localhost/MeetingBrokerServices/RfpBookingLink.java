/**
 * RfpBookingLink.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package localhost.MeetingBrokerServices;

public class RfpBookingLink  implements java.io.Serializable {
    private java.lang.String bookingId;

    private int externalLocationId;

    private int rfpId;

    private int proposalId;

    private java.lang.String channelName;

    private java.lang.String sendingLocation;

    private java.lang.String sendingUser;

    private java.lang.String referenceNumber;

    private java.lang.String meetingSeriesName;

    private java.util.Calendar respondByDate;

    private localhost.MeetingBrokerServices.RfpActionTypes rfpAction;

    public RfpBookingLink() {
    }

    public RfpBookingLink(
           java.lang.String bookingId,
           int externalLocationId,
           int rfpId,
           int proposalId,
           java.lang.String channelName,
           java.lang.String sendingLocation,
           java.lang.String sendingUser,
           java.lang.String referenceNumber,
           java.lang.String meetingSeriesName,
           java.util.Calendar respondByDate,
           localhost.MeetingBrokerServices.RfpActionTypes rfpAction) {
           this.bookingId = bookingId;
           this.externalLocationId = externalLocationId;
           this.rfpId = rfpId;
           this.proposalId = proposalId;
           this.channelName = channelName;
           this.sendingLocation = sendingLocation;
           this.sendingUser = sendingUser;
           this.referenceNumber = referenceNumber;
           this.meetingSeriesName = meetingSeriesName;
           this.respondByDate = respondByDate;
           this.rfpAction = rfpAction;
    }


    /**
     * Gets the bookingId value for this RfpBookingLink.
     * 
     * @return bookingId
     */
    public java.lang.String getBookingId() {
        return bookingId;
    }


    /**
     * Sets the bookingId value for this RfpBookingLink.
     * 
     * @param bookingId
     */
    public void setBookingId(java.lang.String bookingId) {
        this.bookingId = bookingId;
    }


    /**
     * Gets the externalLocationId value for this RfpBookingLink.
     * 
     * @return externalLocationId
     */
    public int getExternalLocationId() {
        return externalLocationId;
    }


    /**
     * Sets the externalLocationId value for this RfpBookingLink.
     * 
     * @param externalLocationId
     */
    public void setExternalLocationId(int externalLocationId) {
        this.externalLocationId = externalLocationId;
    }


    /**
     * Gets the rfpId value for this RfpBookingLink.
     * 
     * @return rfpId
     */
    public int getRfpId() {
        return rfpId;
    }


    /**
     * Sets the rfpId value for this RfpBookingLink.
     * 
     * @param rfpId
     */
    public void setRfpId(int rfpId) {
        this.rfpId = rfpId;
    }


    /**
     * Gets the proposalId value for this RfpBookingLink.
     * 
     * @return proposalId
     */
    public int getProposalId() {
        return proposalId;
    }


    /**
     * Sets the proposalId value for this RfpBookingLink.
     * 
     * @param proposalId
     */
    public void setProposalId(int proposalId) {
        this.proposalId = proposalId;
    }


    /**
     * Gets the channelName value for this RfpBookingLink.
     * 
     * @return channelName
     */
    public java.lang.String getChannelName() {
        return channelName;
    }


    /**
     * Sets the channelName value for this RfpBookingLink.
     * 
     * @param channelName
     */
    public void setChannelName(java.lang.String channelName) {
        this.channelName = channelName;
    }


    /**
     * Gets the sendingLocation value for this RfpBookingLink.
     * 
     * @return sendingLocation
     */
    public java.lang.String getSendingLocation() {
        return sendingLocation;
    }


    /**
     * Sets the sendingLocation value for this RfpBookingLink.
     * 
     * @param sendingLocation
     */
    public void setSendingLocation(java.lang.String sendingLocation) {
        this.sendingLocation = sendingLocation;
    }


    /**
     * Gets the sendingUser value for this RfpBookingLink.
     * 
     * @return sendingUser
     */
    public java.lang.String getSendingUser() {
        return sendingUser;
    }


    /**
     * Sets the sendingUser value for this RfpBookingLink.
     * 
     * @param sendingUser
     */
    public void setSendingUser(java.lang.String sendingUser) {
        this.sendingUser = sendingUser;
    }


    /**
     * Gets the referenceNumber value for this RfpBookingLink.
     * 
     * @return referenceNumber
     */
    public java.lang.String getReferenceNumber() {
        return referenceNumber;
    }


    /**
     * Sets the referenceNumber value for this RfpBookingLink.
     * 
     * @param referenceNumber
     */
    public void setReferenceNumber(java.lang.String referenceNumber) {
        this.referenceNumber = referenceNumber;
    }


    /**
     * Gets the meetingSeriesName value for this RfpBookingLink.
     * 
     * @return meetingSeriesName
     */
    public java.lang.String getMeetingSeriesName() {
        return meetingSeriesName;
    }


    /**
     * Sets the meetingSeriesName value for this RfpBookingLink.
     * 
     * @param meetingSeriesName
     */
    public void setMeetingSeriesName(java.lang.String meetingSeriesName) {
        this.meetingSeriesName = meetingSeriesName;
    }


    /**
     * Gets the respondByDate value for this RfpBookingLink.
     * 
     * @return respondByDate
     */
    public java.util.Calendar getRespondByDate() {
        return respondByDate;
    }


    /**
     * Sets the respondByDate value for this RfpBookingLink.
     * 
     * @param respondByDate
     */
    public void setRespondByDate(java.util.Calendar respondByDate) {
        this.respondByDate = respondByDate;
    }


    /**
     * Gets the rfpAction value for this RfpBookingLink.
     * 
     * @return rfpAction
     */
    public localhost.MeetingBrokerServices.RfpActionTypes getRfpAction() {
        return rfpAction;
    }


    /**
     * Sets the rfpAction value for this RfpBookingLink.
     * 
     * @param rfpAction
     */
    public void setRfpAction(localhost.MeetingBrokerServices.RfpActionTypes rfpAction) {
        this.rfpAction = rfpAction;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RfpBookingLink)) return false;
        RfpBookingLink other = (RfpBookingLink) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.bookingId==null && other.getBookingId()==null) || 
             (this.bookingId!=null &&
              this.bookingId.equals(other.getBookingId()))) &&
            this.externalLocationId == other.getExternalLocationId() &&
            this.rfpId == other.getRfpId() &&
            this.proposalId == other.getProposalId() &&
            ((this.channelName==null && other.getChannelName()==null) || 
             (this.channelName!=null &&
              this.channelName.equals(other.getChannelName()))) &&
            ((this.sendingLocation==null && other.getSendingLocation()==null) || 
             (this.sendingLocation!=null &&
              this.sendingLocation.equals(other.getSendingLocation()))) &&
            ((this.sendingUser==null && other.getSendingUser()==null) || 
             (this.sendingUser!=null &&
              this.sendingUser.equals(other.getSendingUser()))) &&
            ((this.referenceNumber==null && other.getReferenceNumber()==null) || 
             (this.referenceNumber!=null &&
              this.referenceNumber.equals(other.getReferenceNumber()))) &&
            ((this.meetingSeriesName==null && other.getMeetingSeriesName()==null) || 
             (this.meetingSeriesName!=null &&
              this.meetingSeriesName.equals(other.getMeetingSeriesName()))) &&
            ((this.respondByDate==null && other.getRespondByDate()==null) || 
             (this.respondByDate!=null &&
              this.respondByDate.equals(other.getRespondByDate()))) &&
            ((this.rfpAction==null && other.getRfpAction()==null) || 
             (this.rfpAction!=null &&
              this.rfpAction.equals(other.getRfpAction())));
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
        if (getBookingId() != null) {
            _hashCode += getBookingId().hashCode();
        }
        _hashCode += getExternalLocationId();
        _hashCode += getRfpId();
        _hashCode += getProposalId();
        if (getChannelName() != null) {
            _hashCode += getChannelName().hashCode();
        }
        if (getSendingLocation() != null) {
            _hashCode += getSendingLocation().hashCode();
        }
        if (getSendingUser() != null) {
            _hashCode += getSendingUser().hashCode();
        }
        if (getReferenceNumber() != null) {
            _hashCode += getReferenceNumber().hashCode();
        }
        if (getMeetingSeriesName() != null) {
            _hashCode += getMeetingSeriesName().hashCode();
        }
        if (getRespondByDate() != null) {
            _hashCode += getRespondByDate().hashCode();
        }
        if (getRfpAction() != null) {
            _hashCode += getRfpAction().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RfpBookingLink.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "RfpBookingLink"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bookingId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "BookingId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("externalLocationId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "ExternalLocationId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
        elemField.setFieldName("sendingLocation");
        elemField.setXmlName(new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "SendingLocation"));
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
        elemField.setFieldName("referenceNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "ReferenceNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("meetingSeriesName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "MeetingSeriesName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("respondByDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "RespondByDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rfpAction");
        elemField.setXmlName(new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "RfpAction"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "RfpActionTypes"));
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
