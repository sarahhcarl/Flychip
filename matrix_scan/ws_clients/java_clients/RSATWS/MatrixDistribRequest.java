/**
 * MatrixDistribRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.3 Oct 05, 2005 (05:23:37 EDT) WSDL2Java emitter.
 */

package RSATWS;


/**
 * Parameters for the operation matrix distrib
 */
public class MatrixDistribRequest  implements java.io.Serializable {
    /* Return type. Accepted values: 'server' (result is stored on
     * a file on the server), 'client' (result is directly transferred to
     * the client), or  'both'. 
     * Default is 'both'. */
    private java.lang.String output;

    /* The matrix file content. Matrix format is specified with the
     * option "matrix_format" (see below) Default format: tab. */
    private java.lang.String matrix_file;

    /* Name of the file containing matrix on the server. You need
     * to supply either this parameter or the previous one (matrix_file). */
    private java.lang.String[] tmp_matrix_file;

    /* Supported fields: tab, cb, consensus, gibbs, meme, assembly. */
    private java.lang.String matrix_format;

    /* Pseudo counts to apply on the matrix. Default: 1. */
    private java.lang.Integer matrix_pseudo;

    /* Background model file is a tab-delimited file containing the
     * specification of oligonucleotide frequencies. */
    private java.lang.String background;

    /* Pseudo frequency for the background models. Value must be a
     * real between 0 and 1. Default: 0.01. */
    private java.lang.Float background_pseudo;

    /* Number of decimals for the matrix frequencies. */
    private java.lang.Integer decimals;

    private java.lang.String background_format;

    public MatrixDistribRequest() {
    }

    public MatrixDistribRequest(
           java.lang.String output,
           java.lang.String matrix_file,
           java.lang.String[] tmp_matrix_file,
           java.lang.String matrix_format,
           java.lang.Integer matrix_pseudo,
           java.lang.String background,
           java.lang.Float background_pseudo,
           java.lang.Integer decimals,
           java.lang.String background_format) {
           this.output = output;
           this.matrix_file = matrix_file;
           this.tmp_matrix_file = tmp_matrix_file;
           this.matrix_format = matrix_format;
           this.matrix_pseudo = matrix_pseudo;
           this.background = background;
           this.background_pseudo = background_pseudo;
           this.decimals = decimals;
           this.background_format = background_format;
    }


    /**
     * Gets the output value for this MatrixDistribRequest.
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
     * Sets the output value for this MatrixDistribRequest.
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
     * Gets the matrix_file value for this MatrixDistribRequest.
     * 
     * @return matrix_file   * The matrix file content. Matrix format is specified with the
     * option "matrix_format" (see below) Default format: tab.
     */
    public java.lang.String getMatrix_file() {
        return matrix_file;
    }


    /**
     * Sets the matrix_file value for this MatrixDistribRequest.
     * 
     * @param matrix_file   * The matrix file content. Matrix format is specified with the
     * option "matrix_format" (see below) Default format: tab.
     */
    public void setMatrix_file(java.lang.String matrix_file) {
        this.matrix_file = matrix_file;
    }


    /**
     * Gets the tmp_matrix_file value for this MatrixDistribRequest.
     * 
     * @return tmp_matrix_file   * Name of the file containing matrix on the server. You need
     * to supply either this parameter or the previous one (matrix_file).
     */
    public java.lang.String[] getTmp_matrix_file() {
        return tmp_matrix_file;
    }


    /**
     * Sets the tmp_matrix_file value for this MatrixDistribRequest.
     * 
     * @param tmp_matrix_file   * Name of the file containing matrix on the server. You need
     * to supply either this parameter or the previous one (matrix_file).
     */
    public void setTmp_matrix_file(java.lang.String[] tmp_matrix_file) {
        this.tmp_matrix_file = tmp_matrix_file;
    }

    public java.lang.String getTmp_matrix_file(int i) {
        return this.tmp_matrix_file[i];
    }

    public void setTmp_matrix_file(int i, java.lang.String _value) {
        this.tmp_matrix_file[i] = _value;
    }


    /**
     * Gets the matrix_format value for this MatrixDistribRequest.
     * 
     * @return matrix_format   * Supported fields: tab, cb, consensus, gibbs, meme, assembly.
     */
    public java.lang.String getMatrix_format() {
        return matrix_format;
    }


    /**
     * Sets the matrix_format value for this MatrixDistribRequest.
     * 
     * @param matrix_format   * Supported fields: tab, cb, consensus, gibbs, meme, assembly.
     */
    public void setMatrix_format(java.lang.String matrix_format) {
        this.matrix_format = matrix_format;
    }


    /**
     * Gets the matrix_pseudo value for this MatrixDistribRequest.
     * 
     * @return matrix_pseudo   * Pseudo counts to apply on the matrix. Default: 1.
     */
    public java.lang.Integer getMatrix_pseudo() {
        return matrix_pseudo;
    }


    /**
     * Sets the matrix_pseudo value for this MatrixDistribRequest.
     * 
     * @param matrix_pseudo   * Pseudo counts to apply on the matrix. Default: 1.
     */
    public void setMatrix_pseudo(java.lang.Integer matrix_pseudo) {
        this.matrix_pseudo = matrix_pseudo;
    }


    /**
     * Gets the background value for this MatrixDistribRequest.
     * 
     * @return background   * Background model file is a tab-delimited file containing the
     * specification of oligonucleotide frequencies.
     */
    public java.lang.String getBackground() {
        return background;
    }


    /**
     * Sets the background value for this MatrixDistribRequest.
     * 
     * @param background   * Background model file is a tab-delimited file containing the
     * specification of oligonucleotide frequencies.
     */
    public void setBackground(java.lang.String background) {
        this.background = background;
    }


    /**
     * Gets the background_pseudo value for this MatrixDistribRequest.
     * 
     * @return background_pseudo   * Pseudo frequency for the background models. Value must be a
     * real between 0 and 1. Default: 0.01.
     */
    public java.lang.Float getBackground_pseudo() {
        return background_pseudo;
    }


    /**
     * Sets the background_pseudo value for this MatrixDistribRequest.
     * 
     * @param background_pseudo   * Pseudo frequency for the background models. Value must be a
     * real between 0 and 1. Default: 0.01.
     */
    public void setBackground_pseudo(java.lang.Float background_pseudo) {
        this.background_pseudo = background_pseudo;
    }


    /**
     * Gets the decimals value for this MatrixDistribRequest.
     * 
     * @return decimals   * Number of decimals for the matrix frequencies.
     */
    public java.lang.Integer getDecimals() {
        return decimals;
    }


    /**
     * Sets the decimals value for this MatrixDistribRequest.
     * 
     * @param decimals   * Number of decimals for the matrix frequencies.
     */
    public void setDecimals(java.lang.Integer decimals) {
        this.decimals = decimals;
    }


    /**
     * Gets the background_format value for this MatrixDistribRequest.
     * 
     * @return background_format
     */
    public java.lang.String getBackground_format() {
        return background_format;
    }


    /**
     * Sets the background_format value for this MatrixDistribRequest.
     * 
     * @param background_format
     */
    public void setBackground_format(java.lang.String background_format) {
        this.background_format = background_format;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof MatrixDistribRequest)) return false;
        MatrixDistribRequest other = (MatrixDistribRequest) obj;
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
            ((this.matrix_file==null && other.getMatrix_file()==null) || 
             (this.matrix_file!=null &&
              this.matrix_file.equals(other.getMatrix_file()))) &&
            ((this.tmp_matrix_file==null && other.getTmp_matrix_file()==null) || 
             (this.tmp_matrix_file!=null &&
              java.util.Arrays.equals(this.tmp_matrix_file, other.getTmp_matrix_file()))) &&
            ((this.matrix_format==null && other.getMatrix_format()==null) || 
             (this.matrix_format!=null &&
              this.matrix_format.equals(other.getMatrix_format()))) &&
            ((this.matrix_pseudo==null && other.getMatrix_pseudo()==null) || 
             (this.matrix_pseudo!=null &&
              this.matrix_pseudo.equals(other.getMatrix_pseudo()))) &&
            ((this.background==null && other.getBackground()==null) || 
             (this.background!=null &&
              this.background.equals(other.getBackground()))) &&
            ((this.background_pseudo==null && other.getBackground_pseudo()==null) || 
             (this.background_pseudo!=null &&
              this.background_pseudo.equals(other.getBackground_pseudo()))) &&
            ((this.decimals==null && other.getDecimals()==null) || 
             (this.decimals!=null &&
              this.decimals.equals(other.getDecimals()))) &&
            ((this.background_format==null && other.getBackground_format()==null) || 
             (this.background_format!=null &&
              this.background_format.equals(other.getBackground_format())));
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
        if (getMatrix_file() != null) {
            _hashCode += getMatrix_file().hashCode();
        }
        if (getTmp_matrix_file() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTmp_matrix_file());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTmp_matrix_file(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getMatrix_format() != null) {
            _hashCode += getMatrix_format().hashCode();
        }
        if (getMatrix_pseudo() != null) {
            _hashCode += getMatrix_pseudo().hashCode();
        }
        if (getBackground() != null) {
            _hashCode += getBackground().hashCode();
        }
        if (getBackground_pseudo() != null) {
            _hashCode += getBackground_pseudo().hashCode();
        }
        if (getDecimals() != null) {
            _hashCode += getDecimals().hashCode();
        }
        if (getBackground_format() != null) {
            _hashCode += getBackground_format().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(MatrixDistribRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:RSATWS", "MatrixDistribRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("output");
        elemField.setXmlName(new javax.xml.namespace.QName("", "output"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("matrix_file");
        elemField.setXmlName(new javax.xml.namespace.QName("", "matrix_file"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tmp_matrix_file");
        elemField.setXmlName(new javax.xml.namespace.QName("", "tmp_matrix_file"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("matrix_format");
        elemField.setXmlName(new javax.xml.namespace.QName("", "matrix_format"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("matrix_pseudo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "matrix_pseudo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("background");
        elemField.setXmlName(new javax.xml.namespace.QName("", "background"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("background_pseudo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "background_pseudo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "float"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("decimals");
        elemField.setXmlName(new javax.xml.namespace.QName("", "decimals"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("background_format");
        elemField.setXmlName(new javax.xml.namespace.QName("", "background_format"));
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
