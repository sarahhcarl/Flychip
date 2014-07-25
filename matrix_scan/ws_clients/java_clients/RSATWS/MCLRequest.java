/**
 * MCLRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.3 Oct 05, 2005 (05:23:37 EDT) WSDL2Java emitter.
 */

package RSATWS;

public class MCLRequest  implements java.io.Serializable {
    /* A graph in the tab delimited format first column : source node,
     * second column : target node, third column : edge weight */
    private java.lang.String inputgraph;

    /* Sets the main inflation value. This value is the main handle
     * for affecting cluster granularity. It is usually chosen somewhere
     * in the range [1.2-5.0]. -I 5.0 will tend to result in fine-grained
     * clusterings, and -I 1.2 will tend to result in very coarse grained
     * clusterings. */
    private java.lang.Float inflation;

    public MCLRequest() {
    }

    public MCLRequest(
           java.lang.String inputgraph,
           java.lang.Float inflation) {
           this.inputgraph = inputgraph;
           this.inflation = inflation;
    }


    /**
     * Gets the inputgraph value for this MCLRequest.
     * 
     * @return inputgraph   * A graph in the tab delimited format first column : source node,
     * second column : target node, third column : edge weight
     */
    public java.lang.String getInputgraph() {
        return inputgraph;
    }


    /**
     * Sets the inputgraph value for this MCLRequest.
     * 
     * @param inputgraph   * A graph in the tab delimited format first column : source node,
     * second column : target node, third column : edge weight
     */
    public void setInputgraph(java.lang.String inputgraph) {
        this.inputgraph = inputgraph;
    }


    /**
     * Gets the inflation value for this MCLRequest.
     * 
     * @return inflation   * Sets the main inflation value. This value is the main handle
     * for affecting cluster granularity. It is usually chosen somewhere
     * in the range [1.2-5.0]. -I 5.0 will tend to result in fine-grained
     * clusterings, and -I 1.2 will tend to result in very coarse grained
     * clusterings.
     */
    public java.lang.Float getInflation() {
        return inflation;
    }


    /**
     * Sets the inflation value for this MCLRequest.
     * 
     * @param inflation   * Sets the main inflation value. This value is the main handle
     * for affecting cluster granularity. It is usually chosen somewhere
     * in the range [1.2-5.0]. -I 5.0 will tend to result in fine-grained
     * clusterings, and -I 1.2 will tend to result in very coarse grained
     * clusterings.
     */
    public void setInflation(java.lang.Float inflation) {
        this.inflation = inflation;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof MCLRequest)) return false;
        MCLRequest other = (MCLRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.inputgraph==null && other.getInputgraph()==null) || 
             (this.inputgraph!=null &&
              this.inputgraph.equals(other.getInputgraph()))) &&
            ((this.inflation==null && other.getInflation()==null) || 
             (this.inflation!=null &&
              this.inflation.equals(other.getInflation())));
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
        if (getInputgraph() != null) {
            _hashCode += getInputgraph().hashCode();
        }
        if (getInflation() != null) {
            _hashCode += getInflation().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(MCLRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:RSATWS", "MCLRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("inputgraph");
        elemField.setXmlName(new javax.xml.namespace.QName("", "inputgraph"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("inflation");
        elemField.setXmlName(new javax.xml.namespace.QName("", "inflation"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "float"));
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
