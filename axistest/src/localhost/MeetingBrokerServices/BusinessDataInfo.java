/**
 * BusinessDataInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package localhost.MeetingBrokerServices;

public class BusinessDataInfo  implements java.io.Serializable {
    private localhost.MeetingBrokerServices.BusinessDataType businessDataType;

    private localhost.MeetingBrokerServices.RoomBlock roomBlock;

    private localhost.MeetingBrokerServices.EventBlock eventBlock;

    private java.lang.Boolean isComplete;

    public BusinessDataInfo() {
    }

    public BusinessDataInfo(
           localhost.MeetingBrokerServices.BusinessDataType businessDataType,
           localhost.MeetingBrokerServices.RoomBlock roomBlock,
           localhost.MeetingBrokerServices.EventBlock eventBlock,
           java.lang.Boolean isComplete) {
           this.businessDataType = businessDataType;
           this.roomBlock = roomBlock;
           this.eventBlock = eventBlock;
           this.isComplete = isComplete;
    }


    /**
     * Gets the businessDataType value for this BusinessDataInfo.
     * 
     * @return businessDataType
     */
    public localhost.MeetingBrokerServices.BusinessDataType getBusinessDataType() {
        return businessDataType;
    }


    /**
     * Sets the businessDataType value for this BusinessDataInfo.
     * 
     * @param businessDataType
     */
    public void setBusinessDataType(localhost.MeetingBrokerServices.BusinessDataType businessDataType) {
        this.businessDataType = businessDataType;
    }


    /**
     * Gets the roomBlock value for this BusinessDataInfo.
     * 
     * @return roomBlock
     */
    public localhost.MeetingBrokerServices.RoomBlock getRoomBlock() {
        return roomBlock;
    }


    /**
     * Sets the roomBlock value for this BusinessDataInfo.
     * 
     * @param roomBlock
     */
    public void setRoomBlock(localhost.MeetingBrokerServices.RoomBlock roomBlock) {
        this.roomBlock = roomBlock;
    }


    /**
     * Gets the eventBlock value for this BusinessDataInfo.
     * 
     * @return eventBlock
     */
    public localhost.MeetingBrokerServices.EventBlock getEventBlock() {
        return eventBlock;
    }


    /**
     * Sets the eventBlock value for this BusinessDataInfo.
     * 
     * @param eventBlock
     */
    public void setEventBlock(localhost.MeetingBrokerServices.EventBlock eventBlock) {
        this.eventBlock = eventBlock;
    }


    /**
     * Gets the isComplete value for this BusinessDataInfo.
     * 
     * @return isComplete
     */
    public java.lang.Boolean getIsComplete() {
        return isComplete;
    }


    /**
     * Sets the isComplete value for this BusinessDataInfo.
     * 
     * @param isComplete
     */
    public void setIsComplete(java.lang.Boolean isComplete) {
        this.isComplete = isComplete;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof BusinessDataInfo)) return false;
        BusinessDataInfo other = (BusinessDataInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.businessDataType==null && other.getBusinessDataType()==null) || 
             (this.businessDataType!=null &&
              this.businessDataType.equals(other.getBusinessDataType()))) &&
            ((this.roomBlock==null && other.getRoomBlock()==null) || 
             (this.roomBlock!=null &&
              this.roomBlock.equals(other.getRoomBlock()))) &&
            ((this.eventBlock==null && other.getEventBlock()==null) || 
             (this.eventBlock!=null &&
              this.eventBlock.equals(other.getEventBlock()))) &&
            ((this.isComplete==null && other.getIsComplete()==null) || 
             (this.isComplete!=null &&
              this.isComplete.equals(other.getIsComplete())));
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
        if (getBusinessDataType() != null) {
            _hashCode += getBusinessDataType().hashCode();
        }
        if (getRoomBlock() != null) {
            _hashCode += getRoomBlock().hashCode();
        }
        if (getEventBlock() != null) {
            _hashCode += getEventBlock().hashCode();
        }
        if (getIsComplete() != null) {
            _hashCode += getIsComplete().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(BusinessDataInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "BusinessDataInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("businessDataType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "BusinessDataType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "BusinessDataType"));
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
        elemField.setFieldName("isComplete");
        elemField.setXmlName(new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "IsComplete"));
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
