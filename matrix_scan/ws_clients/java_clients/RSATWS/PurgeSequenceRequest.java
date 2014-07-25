/**
 * PurgeSequenceRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.3 Oct 05, 2005 (05:23:37 EDT) WSDL2Java emitter.
 */

package RSATWS;

public class PurgeSequenceRequest  implements java.io.Serializable {
    /* Return type. Accepted values: 'server' (result is stored on
     * a file on the server), 'client' (result is directly transferred to
     * the client), or 'both'. 
     * Default is 'both'. */
    private java.lang.String output;

    /* Sequence to purge. You need to supply either this parameter
     * or the next one (tmp_infile). */
    private java.lang.String sequence;

    /* Name of the file with input sequence on the server. You need
     * to supply either this parameter or the previous one (sequence). */
    private java.lang.String tmp_infile;

    /* Sequence format. Supported: IG (Intelligenetics), WC (wconsensus),
     * raw, FastA. */
    private java.lang.String format;

    /* Minimal match length. Default is 40. */
    private java.lang.Integer match_length;

    /* Number of mismatches allowed. Default is 3. */
    private java.lang.Integer mismatch;

    /* Discard duplications on the direct strand only (1) or on the
     * reverse complement as well (2). Default is 2. */
    private java.lang.Integer str;

    /* Delete repeats instead of masking them if value = 1. */
    private java.lang.Integer delete;

    /* Mask (replace by N characters) sequences shorter than the specified
     * length. */
    private java.lang.Integer mask_short;

    public PurgeSequenceRequest() {
    }

    public PurgeSequenceRequest(
           java.lang.String output,
           java.lang.String sequence,
           java.lang.String tmp_infile,
           java.lang.String format,
           java.lang.Integer match_length,
           java.lang.Integer mismatch,
           java.lang.Integer str,
           java.lang.Integer delete,
           java.lang.Integer mask_short) {
           this.output = output;
           this.sequence = sequence;
           this.tmp_infile = tmp_infile;
           this.format = format;
           this.match_length = match_length;
           this.mismatch = mismatch;
           this.str = str;
           this.delete = delete;
           this.mask_short = mask_short;
    }


    /**
     * Gets the output value for this PurgeSequenceRequest.
     * 
     * @return output   * Return type. Accepted values: 'server' (result is stored on
     * a file on the server), 'client' (result is directly transferred to
     * the client), or 'both'. 
     * Default is 'both'.
     */
    public java.lang.String getOutput() {
        return output;
    }


    /**
     * Sets the output value for this PurgeSequenceRequest.
     * 
     * @param output   * Return type. Accepted values: 'server' (result is stored on
     * a file on the server), 'client' (result is directly transferred to
     * the client), or 'both'. 
     * Default is 'both'.
     */
    public void setOutput(java.lang.String output) {
        this.output = output;
    }


    /**
     * Gets the sequence value for this PurgeSequenceRequest.
     * 
     * @return sequence   * Sequence to purge. You need to supply either this parameter
     * or the next one (tmp_infile).
     */
    public java.lang.String getSequence() {
        return sequence;
    }


    /**
     * Sets the sequence value for this PurgeSequenceRequest.
     * 
     * @param sequence   * Sequence to purge. You need to supply either this parameter
     * or the next one (tmp_infile).
     */
    public void setSequence(java.lang.String sequence) {
        this.sequence = sequence;
    }


    /**
     * Gets the tmp_infile value for this PurgeSequenceRequest.
     * 
     * @return tmp_infile   * Name of the file with input sequence on the server. You need
     * to supply either this parameter or the previous one (sequence).
     */
    public java.lang.String getTmp_infile() {
        return tmp_infile;
    }


    /**
     * Sets the tmp_infile value for this PurgeSequenceRequest.
     * 
     * @param tmp_infile   * Name of the file with input sequence on the server. You need
     * to supply either this parameter or the previous one (sequence).
     */
    public void setTmp_infile(java.lang.String tmp_infile) {
        this.tmp_infile = tmp_infile;
    }


    /**
     * Gets the format value for this PurgeSequenceRequest.
     * 
     * @return format   * Sequence format. Supported: IG (Intelligenetics), WC (wconsensus),
     * raw, FastA.
     */
    public java.lang.String getFormat() {
        return format;
    }


    /**
     * Sets the format value for this PurgeSequenceRequest.
     * 
     * @param format   * Sequence format. Supported: IG (Intelligenetics), WC (wconsensus),
     * raw, FastA.
     */
    public void setFormat(java.lang.String format) {
        this.format = format;
    }


    /**
     * Gets the match_length value for this PurgeSequenceRequest.
     * 
     * @return match_length   * Minimal match length. Default is 40.
     */
    public java.lang.Integer getMatch_length() {
        return match_length;
    }


    /**
     * Sets the match_length value for this PurgeSequenceRequest.
     * 
     * @param match_length   * Minimal match length. Default is 40.
     */
    public void setMatch_length(java.lang.Integer match_length) {
        this.match_length = match_length;
    }


    /**
     * Gets the mismatch value for this PurgeSequenceRequest.
     * 
     * @return mismatch   * Number of mismatches allowed. Default is 3.
     */
    public java.lang.Integer getMismatch() {
        return mismatch;
    }


    /**
     * Sets the mismatch value for this PurgeSequenceRequest.
     * 
     * @param mismatch   * Number of mismatches allowed. Default is 3.
     */
    public void setMismatch(java.lang.Integer mismatch) {
        this.mismatch = mismatch;
    }


    /**
     * Gets the str value for this PurgeSequenceRequest.
     * 
     * @return str   * Discard duplications on the direct strand only (1) or on the
     * reverse complement as well (2). Default is 2.
     */
    public java.lang.Integer getStr() {
        return str;
    }


    /**
     * Sets the str value for this PurgeSequenceRequest.
     * 
     * @param str   * Discard duplications on the direct strand only (1) or on the
     * reverse complement as well (2). Default is 2.
     */
    public void setStr(java.lang.Integer str) {
        this.str = str;
    }


    /**
     * Gets the delete value for this PurgeSequenceRequest.
     * 
     * @return delete   * Delete repeats instead of masking them if value = 1.
     */
    public java.lang.Integer getDelete() {
        return delete;
    }


    /**
     * Sets the delete value for this PurgeSequenceRequest.
     * 
     * @param delete   * Delete repeats instead of masking them if value = 1.
     */
    public void setDelete(java.lang.Integer delete) {
        this.delete = delete;
    }


    /**
     * Gets the mask_short value for this PurgeSequenceRequest.
     * 
     * @return mask_short   * Mask (replace by N characters) sequences shorter than the specified
     * length.
     */
    public java.lang.Integer getMask_short() {
        return mask_short;
    }


    /**
     * Sets the mask_short value for this PurgeSequenceRequest.
     * 
     * @param mask_short   * Mask (replace by N characters) sequences shorter than the specified
     * length.
     */
    public void setMask_short(java.lang.Integer mask_short) {
        this.mask_short = mask_short;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PurgeSequenceRequest)) return false;
        PurgeSequenceRequest other = (PurgeSequenceRequest) obj;
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
            ((this.sequence==null && other.getSequence()==null) || 
             (this.sequence!=null &&
              this.sequence.equals(other.getSequence()))) &&
            ((this.tmp_infile==null && other.getTmp_infile()==null) || 
             (this.tmp_infile!=null &&
              this.tmp_infile.equals(other.getTmp_infile()))) &&
            ((this.format==null && other.getFormat()==null) || 
             (this.format!=null &&
              this.format.equals(other.getFormat()))) &&
            ((this.match_length==null && other.getMatch_length()==null) || 
             (this.match_length!=null &&
              this.match_length.equals(other.getMatch_length()))) &&
            ((this.mismatch==null && other.getMismatch()==null) || 
             (this.mismatch!=null &&
              this.mismatch.equals(other.getMismatch()))) &&
            ((this.str==null && other.getStr()==null) || 
             (this.str!=null &&
              this.str.equals(other.getStr()))) &&
            ((this.delete==null && other.getDelete()==null) || 
             (this.delete!=null &&
              this.delete.equals(other.getDelete()))) &&
            ((this.mask_short==null && other.getMask_short()==null) || 
             (this.mask_short!=null &&
              this.mask_short.equals(other.getMask_short())));
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
        if (getSequence() != null) {
            _hashCode += getSequence().hashCode();
        }
        if (getTmp_infile() != null) {
            _hashCode += getTmp_infile().hashCode();
        }
        if (getFormat() != null) {
            _hashCode += getFormat().hashCode();
        }
        if (getMatch_length() != null) {
            _hashCode += getMatch_length().hashCode();
        }
        if (getMismatch() != null) {
            _hashCode += getMismatch().hashCode();
        }
        if (getStr() != null) {
            _hashCode += getStr().hashCode();
        }
        if (getDelete() != null) {
            _hashCode += getDelete().hashCode();
        }
        if (getMask_short() != null) {
            _hashCode += getMask_short().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PurgeSequenceRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:RSATWS", "PurgeSequenceRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("output");
        elemField.setXmlName(new javax.xml.namespace.QName("", "output"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sequence");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sequence"));
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
        elemField.setFieldName("format");
        elemField.setXmlName(new javax.xml.namespace.QName("", "format"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("match_length");
        elemField.setXmlName(new javax.xml.namespace.QName("", "match_length"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mismatch");
        elemField.setXmlName(new javax.xml.namespace.QName("", "mismatch"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("str");
        elemField.setXmlName(new javax.xml.namespace.QName("", "str"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("delete");
        elemField.setXmlName(new javax.xml.namespace.QName("", "delete"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mask_short");
        elemField.setXmlName(new javax.xml.namespace.QName("", "mask_short"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
