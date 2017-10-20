/**
 * GetLinkedRfpsRS.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package localhost.MeetingBrokerServices;

public class GetLinkedRfpsRS  extends localhost.MeetingBrokerServices.Acknowledgement  implements java.io.Serializable {
    private localhost.MeetingBrokerServices.LinkedRfp[] linkedRfpList;

    public GetLinkedRfpsRS() {
    }

    public GetLinkedRfpsRS(
           java.lang.String documentId,
           java.lang.String transactionId,
           java.util.Calendar documentDate,
           java.util.Calendar receivedTime,
           java.lang.String userGuid,
           java.lang.String requestMetaDataGuid,
           localhost.MeetingBrokerServices.AcknowledgementStatusCode statusCode,
           boolean success,
           localhost.MeetingBrokerServices.Error[] errors,
           localhost.MeetingBrokerServices.LinkedRfp[] linkedRfpList) {
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
        this.linkedRfpList = linkedRfpList;
    }


    /**
     * Gets the linkedRfpList value for this GetLinkedRfpsRS.
     * 
     * @return linkedRfpList
     */
    public localhost.MeetingBrokerServices.LinkedRfp[] getLinkedRfpList() {
        return linkedRfpList;
    }


    /**
     * Sets the linkedRfpList value for this GetLinkedRfpsRS.
     * 
     * @param linkedRfpList
     */
    public void setLinkedRfpList(localhost.MeetingBrokerServices.LinkedRfp[] linkedRfpList) {
        this.linkedRfpList = linkedRfpList;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetLinkedRfpsRS)) return false;
        GetLinkedRfpsRS other = (GetLinkedRfpsRS) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.linkedRfpList==null && other.getLinkedRfpList()==null) || 
             (this.linkedRfpList!=null &&
              java.util.Arrays.equals(this.linkedRfpList, other.getLinkedRfpList())));
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
        if (getLinkedRfpList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getLinkedRfpList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getLinkedRfpList(), i);
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
        new org.apache.axis.description.TypeDesc(GetLinkedRfpsRS.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "GetLinkedRfpsRS"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("linkedRfpList");
        elemField.setXmlName(new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "LinkedRfpList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "LinkedRfp"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "LinkedRfp"));
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
