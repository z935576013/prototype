/**
 * ExternalProposalDetail.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package localhost.MeetingBrokerServices;

public class ExternalProposalDetail  implements java.io.Serializable {
    private java.lang.String currency;

    private localhost.MeetingBrokerServices.EventBlock eventBlock;

    private localhost.MeetingBrokerServices.ExternalRoomBlock roomBlock;

    public ExternalProposalDetail() {
    }

    public ExternalProposalDetail(
           java.lang.String currency,
           localhost.MeetingBrokerServices.EventBlock eventBlock,
           localhost.MeetingBrokerServices.ExternalRoomBlock roomBlock) {
           this.currency = currency;
           this.eventBlock = eventBlock;
           this.roomBlock = roomBlock;
    }


    /**
     * Gets the currency value for this ExternalProposalDetail.
     * 
     * @return currency
     */
    public java.lang.String getCurrency() {
        return currency;
    }


    /**
     * Sets the currency value for this ExternalProposalDetail.
     * 
     * @param currency
     */
    public void setCurrency(java.lang.String currency) {
        this.currency = currency;
    }


    /**
     * Gets the eventBlock value for this ExternalProposalDetail.
     * 
     * @return eventBlock
     */
    public localhost.MeetingBrokerServices.EventBlock getEventBlock() {
        return eventBlock;
    }


    /**
     * Sets the eventBlock value for this ExternalProposalDetail.
     * 
     * @param eventBlock
     */
    public void setEventBlock(localhost.MeetingBrokerServices.EventBlock eventBlock) {
        this.eventBlock = eventBlock;
    }


    /**
     * Gets the roomBlock value for this ExternalProposalDetail.
     * 
     * @return roomBlock
     */
    public localhost.MeetingBrokerServices.ExternalRoomBlock getRoomBlock() {
        return roomBlock;
    }


    /**
     * Sets the roomBlock value for this ExternalProposalDetail.
     * 
     * @param roomBlock
     */
    public void setRoomBlock(localhost.MeetingBrokerServices.ExternalRoomBlock roomBlock) {
        this.roomBlock = roomBlock;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ExternalProposalDetail)) return false;
        ExternalProposalDetail other = (ExternalProposalDetail) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.currency==null && other.getCurrency()==null) || 
             (this.currency!=null &&
              this.currency.equals(other.getCurrency()))) &&
            ((this.eventBlock==null && other.getEventBlock()==null) || 
             (this.eventBlock!=null &&
              this.eventBlock.equals(other.getEventBlock()))) &&
            ((this.roomBlock==null && other.getRoomBlock()==null) || 
             (this.roomBlock!=null &&
              this.roomBlock.equals(other.getRoomBlock())));
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
        if (getCurrency() != null) {
            _hashCode += getCurrency().hashCode();
        }
        if (getEventBlock() != null) {
            _hashCode += getEventBlock().hashCode();
        }
        if (getRoomBlock() != null) {
            _hashCode += getRoomBlock().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ExternalProposalDetail.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "ExternalProposalDetail"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("currency");
        elemField.setXmlName(new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "Currency"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
        elemField.setFieldName("roomBlock");
        elemField.setXmlName(new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "RoomBlock"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "ExternalRoomBlock"));
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
