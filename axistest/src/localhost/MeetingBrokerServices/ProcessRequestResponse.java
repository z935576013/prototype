/**
 * ProcessRequestResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package localhost.MeetingBrokerServices;

public class ProcessRequestResponse  implements java.io.Serializable {
    private localhost.MeetingBrokerServices.Acknowledgement processRequestResult;

    public ProcessRequestResponse() {
    }

    public ProcessRequestResponse(
           localhost.MeetingBrokerServices.Acknowledgement processRequestResult) {
           this.processRequestResult = processRequestResult;
    }


    /**
     * Gets the processRequestResult value for this ProcessRequestResponse.
     * 
     * @return processRequestResult
     */
    public localhost.MeetingBrokerServices.Acknowledgement getProcessRequestResult() {
        return processRequestResult;
    }


    /**
     * Sets the processRequestResult value for this ProcessRequestResponse.
     * 
     * @param processRequestResult
     */
    public void setProcessRequestResult(localhost.MeetingBrokerServices.Acknowledgement processRequestResult) {
        this.processRequestResult = processRequestResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ProcessRequestResponse)) return false;
        ProcessRequestResponse other = (ProcessRequestResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.processRequestResult==null && other.getProcessRequestResult()==null) || 
             (this.processRequestResult!=null &&
              this.processRequestResult.equals(other.getProcessRequestResult())));
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
        if (getProcessRequestResult() != null) {
            _hashCode += getProcessRequestResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ProcessRequestResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", ">ProcessRequestResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("processRequestResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "ProcessRequestResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://localhost/MeetingBrokerServices", "Acknowledgement"));
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
