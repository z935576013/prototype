/**
 * ExternalRfp.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package localhost.MeetingBrokerServices;

public class ExternalRfp  implements java.io.Serializable {
    private java.lang.String externalRfpId;

    private localhost.MeetingBrokerServices.RoomBlock roomBlock;

    private localhost.MeetingBrokerServices.EventBlock eventBlock;

    private localhost.MeetingBrokerServices.MeetingInfo meetingInfo;

    private localhost.MeetingBrokerServices.Site[] sites;

    private java.lang.String status;

    private localhost.MeetingBrokerServices.Question[] questions;

    private localhost.MeetingBrokerServices.Sender sender;

    private localhost.MeetingBrokerServices.Override override;

    private localhost.MeetingBrokerServices.AdditionalInformation[] additionalInformations;

    public ExternalRfp() {
    }

    public ExternalRfp(
           java.lang.String externalRfpId,
           localhost.MeetingBrokerServices.RoomBlock roomBlock,
           localhost.MeetingBrokerServices.EventBlock eventBlock,
           localhost.MeetingBrokerServices.MeetingInfo meetingInfo,
           localhost.MeetingBrokerServices.Site[] sites,
           java.lang.String status,
           localhost.MeetingBrokerServices.Question[] questions,
           localhost.MeetingBrokerServices.Sender sender,
           localhost.MeetingBrokerServices.Override override,
           localhost.MeetingBrokerServices.AdditionalInformation[] additionalInformations) {
           this.externalRfpId = externalRfpId;
           this.roomBlock = roomBlock;
           this.eventBlock = eventBlock;
           this.meetingInfo = meetingInfo;
           this.sites = sites;
           this.status = status;
           this.questions = questions;
           this.sender = sender;
           this.override = override;
           this.additionalInformations = additionalInformations;
    }


    /**
     * Gets the externalRfpId value for this ExternalRfp.
     * 
     * @return externalRfpId
     */
    public java.lang.String getExternalRfpId() {
        return externalRfpId;
    }


    /**
     * Sets the externalRfpId value for this ExternalRfp.
     * 
     * @param externalRfpId
     */
    public void setExternalRfpId(java.lang.String externalRfpId) {
        this.externalRfpId = externalRfpId;
    }


    /**
     * Gets the roomBlock value for this ExternalRfp.
     * 
     * @return roomBlock
     */
    public localhost.MeetingBrokerServices.RoomBlock getRoomBlock() {
        return roomBlock;
    }


    /**
     * Sets the roomBlock value for this ExternalRfp.
     * 
     * @param roomBlock
     */
    public void setRoomBlock(localhost.MeetingBrokerServices.RoomBlock roomBlock) {
        this.roomBlock = roomBlock;
    }


    /**
     * Gets the eventBlock value for this ExternalRfp.
     * 
     * @return eventBlock
     */
    public localhost.MeetingBrokerServices.EventBlock getEventBlock() {
        return eventBlock;
    }


    /**
     * Sets the eventBlock value for this ExternalRfp.
     * 
     * @param eventBlock
     */
    public void setEventBlock(localhost.MeetingBrokerServices.EventBlock eventBlock) {
        this.eventBlock = eventBlock;
    }


    /**
     * Gets the meetingInfo value for this ExternalRfp.
     * 
     * @return meetingInfo
     */
    public localhost.MeetingBrokerServices.MeetingInfo getMeetingInfo() {
        return meetingInfo;
    }


    /**
     * Sets the meetingInfo value for this ExternalRfp.
     * 
     * @param meetingInfo
     */
    public void setMeetingInfo(localhost.MeetingBrokerServices.MeetingInfo meetingInfo) {
        this.meetingInfo = meetingInfo;
    }


    /**
     * Gets the sites value for this ExternalRfp.
     * 
     * @return sites
     */
    public localhost.MeetingBrokerServices.Site[] getSites() {
        return sites;
    }


    /**
     * Sets the sites value for this ExternalRfp.
     * 
     * @param sites
     */
    public void setSites(localhost.MeetingBrokerServices.Site[] sites) {
        this.sites = sites;
    }


    /**
     * Gets the status value for this ExternalRfp.
     * 
     * @return status
     */
    public java.lang.String getStatus() {
        return status;
    }


    /**
     * Sets the status value for this ExternalRfp.
     * 
     * @param status
     */
    public void setStatus(java.lang.String status) {
        this.status = status;
    }


    /**
     * Gets the questions value for this ExternalRfp.
     * 
     * @return questions
     */
    public localhost.MeetingBrokerServices.Question[] getQuestions() {
        return questions;
    }


    /**
     * Sets the questions value for this ExternalRfp.
     * 
     * @param questions
     */
    public void setQuestions(localhost.MeetingBrokerServices.Question[] questions) {
        this.questions = questions;
    }


    /**
     * Gets the sender value for this ExternalRfp.
     * 
     * @return sender
     */
    public localhost.MeetingBrokerServices.Sender getSender() {
        return sender;
    }


    /**
     * Sets the sender value for this ExternalRfp.
     * 
     * @param sender
     */
    public void setSender(localhost.MeetingBrokerServices.Sender sender) {
        this.sender = sender;
    }


    /**
     * Gets the override value for this ExternalRfp.
     * 
     * @return override
     */
    public localhost.MeetingBrokerServices.Override getOverride() {
        return override;
    }


    /**
     * Sets the override value for this ExternalRfp.
     * 
     * @param override
     */
    public void setOverride(localhost.MeetingBrokerServices.Override override) {
        this.override = override;
    }


    /**
     * Gets the additionalInformations value for this ExternalRfp.
     * 
     * @return additionalInformations
     */
    public localhost.MeetingBrokerServices.AdditionalInformation[] getAdditionalInformations() {
        return additionalInformations;
    }


    /**
     * Sets the additionalInformations value for this ExternalRfp.
     * 
     * @param additionalInformations
     */
    public void setAdditionalInformations(localhost.MeetingBrokerServices.AdditionalInformation[] additionalInformations) {
        this.additionalInformations = additionalInformations;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ExternalRfp)) return false;
        ExternalRfp other = (ExternalRfp) obj;
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
            ((this.roomBlock==null && other.getRoomBlock()==null) || 
             (this.roomBlock!=null &&
              this.roomBlock.equals(other.getRoomBlock()))) &&
            ((this.eventBlock==null && other.getEventBlock()==null) || 
             (this.eventBlock!=null &&
              this.eventBlock.equals(other.getEventBlock()))) &&
            ((this.meetingInfo==null && other.getMeetingInfo()==null) || 
             (this.meetingInfo!=null &&
              this.meetingInfo.equals(other.getMeetingInfo()))) &&
            ((this.sites==null && other.getSites()==null) || 
             (this.sites!=null &&
              java.util.Arrays.equals(this.sites, other.getSites()))) &&
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              this.status.equals(other.getStatus()))) &&
            ((this.questions==null && other.getQuestions()==null) || 
             (this.questions!=null &&
              java.util.Arrays.equals(this.questions, other.getQuestions()))) &&
            ((this.sender==null && other.getSender()==null) || 
             (this.sender!=null &&
              this.sender.equals(other.getSender()))) &&
            ((this.override==null && other.getOverride()==null) || 
             (this.override!=null &&
              this.override.equals(other.getOverride()))) &&
            ((this.additionalInformations==null && other.getAdditionalInformations()==null) || 
             (this.additionalInformations!=null &&
              java.util.Arrays.equals(this.additionalInformations, other.getAdditionalInformations())));
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
        if (getRoomBlock() != null) {
            _hashCode += getRoomBlock().hashCode();
        }
        if (getEventBlock() != null) {
            _hashCode += getEventBlock().hashCode();
        }
        if (getMeetingInfo() != null) {
            _hashCode += getMeetingInfo().hashCode();
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
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        if (getQuestions() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getQuestions());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getQuestions(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getSender() != null) {
            _hashCode += getSender().hashCode();
        }
        if (getOverride() != null) {
            _hashCode += getOverride().hashCode();
        }
        if (getAdditionalInformations() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAdditionalInformations());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAdditionalInformations(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ExternalRfp.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "ExternalRfp"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("externalRfpId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "ExternalRfpId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
        elemField.setFieldName("meetingInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "MeetingInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "MeetingInfo"));
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
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "Status"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("questions");
        elemField.setXmlName(new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "Questions"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "Question"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "Question"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sender");
        elemField.setXmlName(new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "Sender"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "Sender"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("override");
        elemField.setXmlName(new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "Override"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "Override"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("additionalInformations");
        elemField.setXmlName(new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "AdditionalInformations"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "AdditionalInformation"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "AdditionalInformation"));
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
