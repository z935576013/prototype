/**
 * CreateMeetingRQ.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package localhost.MeetingBrokerServices;

public class CreateMeetingRQ  extends localhost.MeetingBrokerServices.Request  implements java.io.Serializable {
    private int siteId;

    private int externalLocationId;

    private localhost.MeetingBrokerServices.RoomBlock roomBlock;

    private localhost.MeetingBrokerServices.EventBlock eventBlock;

    private localhost.MeetingBrokerServices.MeetingInfo meetingInfo;

    public CreateMeetingRQ() {
    }

    public CreateMeetingRQ(
           java.lang.String documentId,
           java.lang.String transactionId,
           java.util.Calendar documentDate,
           java.util.Calendar receivedTime,
           java.lang.String userGuid,
           java.lang.String requestMetaDataGuid,
           int siteId,
           int externalLocationId,
           localhost.MeetingBrokerServices.RoomBlock roomBlock,
           localhost.MeetingBrokerServices.EventBlock eventBlock,
           localhost.MeetingBrokerServices.MeetingInfo meetingInfo) {
        super(
            documentId,
            transactionId,
            documentDate,
            receivedTime,
            userGuid,
            requestMetaDataGuid);
        this.siteId = siteId;
        this.externalLocationId = externalLocationId;
        this.roomBlock = roomBlock;
        this.eventBlock = eventBlock;
        this.meetingInfo = meetingInfo;
    }


    /**
     * Gets the siteId value for this CreateMeetingRQ.
     * 
     * @return siteId
     */
    public int getSiteId() {
        return siteId;
    }


    /**
     * Sets the siteId value for this CreateMeetingRQ.
     * 
     * @param siteId
     */
    public void setSiteId(int siteId) {
        this.siteId = siteId;
    }


    /**
     * Gets the externalLocationId value for this CreateMeetingRQ.
     * 
     * @return externalLocationId
     */
    public int getExternalLocationId() {
        return externalLocationId;
    }


    /**
     * Sets the externalLocationId value for this CreateMeetingRQ.
     * 
     * @param externalLocationId
     */
    public void setExternalLocationId(int externalLocationId) {
        this.externalLocationId = externalLocationId;
    }


    /**
     * Gets the roomBlock value for this CreateMeetingRQ.
     * 
     * @return roomBlock
     */
    public localhost.MeetingBrokerServices.RoomBlock getRoomBlock() {
        return roomBlock;
    }


    /**
     * Sets the roomBlock value for this CreateMeetingRQ.
     * 
     * @param roomBlock
     */
    public void setRoomBlock(localhost.MeetingBrokerServices.RoomBlock roomBlock) {
        this.roomBlock = roomBlock;
    }


    /**
     * Gets the eventBlock value for this CreateMeetingRQ.
     * 
     * @return eventBlock
     */
    public localhost.MeetingBrokerServices.EventBlock getEventBlock() {
        return eventBlock;
    }


    /**
     * Sets the eventBlock value for this CreateMeetingRQ.
     * 
     * @param eventBlock
     */
    public void setEventBlock(localhost.MeetingBrokerServices.EventBlock eventBlock) {
        this.eventBlock = eventBlock;
    }


    /**
     * Gets the meetingInfo value for this CreateMeetingRQ.
     * 
     * @return meetingInfo
     */
    public localhost.MeetingBrokerServices.MeetingInfo getMeetingInfo() {
        return meetingInfo;
    }


    /**
     * Sets the meetingInfo value for this CreateMeetingRQ.
     * 
     * @param meetingInfo
     */
    public void setMeetingInfo(localhost.MeetingBrokerServices.MeetingInfo meetingInfo) {
        this.meetingInfo = meetingInfo;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CreateMeetingRQ)) return false;
        CreateMeetingRQ other = (CreateMeetingRQ) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            this.siteId == other.getSiteId() &&
            this.externalLocationId == other.getExternalLocationId() &&
            ((this.roomBlock==null && other.getRoomBlock()==null) || 
             (this.roomBlock!=null &&
              this.roomBlock.equals(other.getRoomBlock()))) &&
            ((this.eventBlock==null && other.getEventBlock()==null) || 
             (this.eventBlock!=null &&
              this.eventBlock.equals(other.getEventBlock()))) &&
            ((this.meetingInfo==null && other.getMeetingInfo()==null) || 
             (this.meetingInfo!=null &&
              this.meetingInfo.equals(other.getMeetingInfo())));
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
        _hashCode += getSiteId();
        _hashCode += getExternalLocationId();
        if (getRoomBlock() != null) {
            _hashCode += getRoomBlock().hashCode();
        }
        if (getEventBlock() != null) {
            _hashCode += getEventBlock().hashCode();
        }
        if (getMeetingInfo() != null) {
            _hashCode += getMeetingInfo().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CreateMeetingRQ.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "CreateMeetingRQ"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("siteId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "SiteId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("externalLocationId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "ExternalLocationId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
