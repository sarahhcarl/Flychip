/**
 * GraphGetClustersResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.3 Oct 05, 2005 (05:23:37 EDT) WSDL2Java emitter.
 */

package RSATWS;

public class GraphGetClustersResponse  implements java.io.Serializable {
    /* Location of the result file on the server. This can be used
     * as input for a further request. */
    private java.lang.String server;

    /* The stand-alone command executed on the server. */
    private java.lang.String command;

    /* The results. */
    private java.lang.String client;

    public GraphGetClustersResponse() {
    }

    public GraphGetClustersResponse(
           java.lang.String server,
           java.lang.String command,
           java.lang.String client) {
           this.server = server;
           this.command = command;
           this.client = client;
    }


    /**
     * Gets the server value for this GraphGetClustersResponse.
     * 
     * @return server   * Location of the result file on the server. This can be used
     * as input for a further request.
     */
    public java.lang.String getServer() {
        return server;
    }


    /**
     * Sets the server value for this GraphGetClustersResponse.
     * 
     * @param server   * Location of the result file on the server. This can be used
     * as input for a further request.
     */
    public void setServer(java.lang.String server) {
        this.server = server;
    }


    /**
     * Gets the command value for this GraphGetClustersResponse.
     * 
     * @return command   * The stand-alone command executed on the server.
     */
    public java.lang.String getCommand() {
        return command;
    }


    /**
     * Sets the command value for this GraphGetClustersResponse.
     * 
     * @param command   * The stand-alone command executed on the server.
     */
    public void setCommand(java.lang.String command) {
        this.command = command;
    }


    /**
     * Gets the client value for this GraphGetClustersResponse.
     * 
     * @return client   * The results.
     */
    public java.lang.String getClient() {
        return client;
    }


    /**
     * Sets the client value for this GraphGetClustersResponse.
     * 
     * @param client   * The results.
     */
    public void setClient(java.lang.String client) {
        this.client = client;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GraphGetClustersResponse)) return false;
        GraphGetClustersResponse other = (GraphGetClustersResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.server==null && other.getServer()==null) || 
             (this.server!=null &&
              this.server.equals(other.getServer()))) &&
            ((this.command==null && other.getCommand()==null) || 
             (this.command!=null &&
              this.command.equals(other.getCommand()))) &&
            ((this.client==null && other.getClient()==null) || 
             (this.client!=null &&
              this.client.equals(other.getClient())));
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
        if (getServer() != null) {
            _hashCode += getServer().hashCode();
        }
        if (getCommand() != null) {
            _hashCode += getCommand().hashCode();
        }
        if (getClient() != null) {
            _hashCode += getClient().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GraphGetClustersResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:RSATWS", "GraphGetClustersResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("server");
        elemField.setXmlName(new javax.xml.namespace.QName("", "server"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("command");
        elemField.setXmlName(new javax.xml.namespace.QName("", "command"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("client");
        elemField.setXmlName(new javax.xml.namespace.QName("", "client"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
