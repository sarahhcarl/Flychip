/**
 * ConvertFeaturesRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.3 Oct 05, 2005 (05:23:37 EDT) WSDL2Java emitter.
 */

package RSATWS;

public class ConvertFeaturesRequest  implements java.io.Serializable {
    /* Return type. Accepted values: 'server' (result is stored on
     * a file on the server), 'client' (result is directly transferred to
     * the client), or  'both'. 
     * Default is 'both'. */
    private java.lang.String output;

    /* Input data */
    private java.lang.String input;

    /* Input file on the server (workflow usage) */
    private java.lang.String tmp_infile;

    /* Input format. Supported: dnapat,ft,gft,gff3,gff. */
    private java.lang.String from;

    /* Output format. Supported: dnapat,ft,gft,gff3,gff. */
    private java.lang.String to;

    public ConvertFeaturesRequest() {
    }

    public ConvertFeaturesRequest(
           java.lang.String output,
           java.lang.String input,
           java.lang.String tmp_infile,
           java.lang.String from,
           java.lang.String to) {
           this.output = output;
           this.input = input;
           this.tmp_infile = tmp_infile;
           this.from = from;
           this.to = to;
    }


    /**
     * Gets the output value for this ConvertFeaturesRequest.
     * 
     * @return output   * Return type. Accepted values: 'server' (result is stored on
     * a file on the server), 'client' (result is directly transferred to
     * the client), or  'both'. 
     * Default is 'both'.
     */
    public java.lang.String getOutput() {
        return output;
    }


    /**
     * Sets the output value for this ConvertFeaturesRequest.
     * 
     * @param output   * Return type. Accepted values: 'server' (result is stored on
     * a file on the server), 'client' (result is directly transferred to
     * the client), or  'both'. 
     * Default is 'both'.
     */
    public void setOutput(java.lang.String output) {
        this.output = output;
    }


    /**
     * Gets the input value for this ConvertFeaturesRequest.
     * 
     * @return input   * Input data
     */
    public java.lang.String getInput() {
        return input;
    }


    /**
     * Sets the input value for this ConvertFeaturesRequest.
     * 
     * @param input   * Input data
     */
    public void setInput(java.lang.String input) {
        this.input = input;
    }


    /**
     * Gets the tmp_infile value for this ConvertFeaturesRequest.
     * 
     * @return tmp_infile   * Input file on the server (workflow usage)
     */
    public java.lang.String getTmp_infile() {
        return tmp_infile;
    }


    /**
     * Sets the tmp_infile value for this ConvertFeaturesRequest.
     * 
     * @param tmp_infile   * Input file on the server (workflow usage)
     */
    public void setTmp_infile(java.lang.String tmp_infile) {
        this.tmp_infile = tmp_infile;
    }


    /**
     * Gets the from value for this ConvertFeaturesRequest.
     * 
     * @return from   * Input format. Supported: dnapat,ft,gft,gff3,gff.
     */
    public java.lang.String getFrom() {
        return from;
    }


    /**
     * Sets the from value for this ConvertFeaturesRequest.
     * 
     * @param from   * Input format. Supported: dnapat,ft,gft,gff3,gff.
     */
    public void setFrom(java.lang.String from) {
        this.from = from;
    }


    /**
     * Gets the to value for this ConvertFeaturesRequest.
     * 
     * @return to   * Output format. Supported: dnapat,ft,gft,gff3,gff.
     */
    public java.lang.String getTo() {
        return to;
    }


    /**
     * Sets the to value for this ConvertFeaturesRequest.
     * 
     * @param to   * Output format. Supported: dnapat,ft,gft,gff3,gff.
     */
    public void setTo(java.lang.String to) {
        this.to = to;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ConvertFeaturesRequest)) return false;
        ConvertFeaturesRequest other = (ConvertFeaturesRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.output==null && other.getOutput()==null) || 
             (this.output!=null &&
              this.output.equals(other.getOutput()))) &&
            ((this.input==null && other.getInput()==null) || 
             (this.input!=null &&
              this.input.equals(other.getInput()))) &&
            ((this.tmp_infile==null && other.getTmp_infile()==null) || 
             (this.tmp_infile!=null &&
              this.tmp_infile.equals(other.getTmp_infile()))) &&
            ((this.from==null && other.getFrom()==null) || 
             (this.from!=null &&
              this.from.equals(other.getFrom()))) &&
            ((this.to==null && other.getTo()==null) || 
             (this.to!=null &&
              this.to.equals(other.getTo())));
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
        if (getOutput() != null) {
            _hashCode += getOutput().hashCode();
        }
        if (getInput() != null) {
            _hashCode += getInput().hashCode();
        }
        if (getTmp_infile() != null) {
            _hashCode += getTmp_infile().hashCode();
        }
        if (getFrom() != null) {
            _hashCode += getFrom().hashCode();
        }
        if (getTo() != null) {
            _hashCode += getTo().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ConvertFeaturesRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:RSATWS", "ConvertFeaturesRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("output");
        elemField.setXmlName(new javax.xml.namespace.QName("", "output"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("input");
        elemField.setXmlName(new javax.xml.namespace.QName("", "input"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tmp_infile");
        elemField.setXmlName(new javax.xml.namespace.QName("", "tmp_infile"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("from");
        elemField.setXmlName(new javax.xml.namespace.QName("", "from"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("to");
        elemField.setXmlName(new javax.xml.namespace.QName("", "to"));
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
