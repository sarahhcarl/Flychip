/**
 * PatternAssemblyRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.3 Oct 05, 2005 (05:23:37 EDT) WSDL2Java emitter.
 */

package RSATWS;

public class PatternAssemblyRequest  implements java.io.Serializable {
    /* Return type. Accepted values: 'server' (result is stored on
     * a file on the server), 'client' (result is directly transferred to
     * the client), or  'both'. 
     * 		Default is 'both'. */
    private java.lang.String output;

    /* Input data */
    private java.lang.String input;

    /* Input file on the server (workflow usage) */
    private java.lang.String tmp_infile;

    /* Verbosity. */
    private java.lang.Integer verbosity;

    /* Score column. Column of the input file that contains the scores.
     * if not specified, patterns are incorporated according to their order
     * in the input file. However, if the input file has been generated with
     * oligo-analysis or dyad-analysis with a verbosity >= 1, pattern-assembly
     * detects the occ_sig column in the file header and uses this column
     * as score column. */
    private java.lang.Integer score_col;

    /* Strands for the assembly: 1 for single-strand; 2 for two-strand
     * assembly. Default is 2. */
    private java.lang.Integer str;

    /* Maximum flanking segment size. Default is 1. */
    private java.lang.Integer maxfl;

    /* Maximum allowed substitutions. Default is 0. */
    private java.lang.Integer subst;

    /* Maximum assembly size, i.e. number of patterns per assembly.
     * Default is 50. */
    private java.lang.Integer maxcl;

    /* Maximum number of allowed patterns. If the number of patterns
     * exceeds this value, the program issues a fatal error. Default: no
     * limit. */
    private java.lang.Integer maxpat;

    /* Maximum number of patterns to analyze. If the number of patterns
     * exceeds this value, the program selects a subset of them, , starting
     * from the top of the. Default: 100. */
    private java.lang.Integer toppat;

    public PatternAssemblyRequest() {
    }

    public PatternAssemblyRequest(
           java.lang.String output,
           java.lang.String input,
           java.lang.String tmp_infile,
           java.lang.Integer verbosity,
           java.lang.Integer score_col,
           java.lang.Integer str,
           java.lang.Integer maxfl,
           java.lang.Integer subst,
           java.lang.Integer maxcl,
           java.lang.Integer maxpat,
           java.lang.Integer toppat) {
           this.output = output;
           this.input = input;
           this.tmp_infile = tmp_infile;
           this.verbosity = verbosity;
           this.score_col = score_col;
           this.str = str;
           this.maxfl = maxfl;
           this.subst = subst;
           this.maxcl = maxcl;
           this.maxpat = maxpat;
           this.toppat = toppat;
    }


    /**
     * Gets the output value for this PatternAssemblyRequest.
     * 
     * @return output   * Return type. Accepted values: 'server' (result is stored on
     * a file on the server), 'client' (result is directly transferred to
     * the client), or  'both'. 
     * 		Default is 'both'.
     */
    public java.lang.String getOutput() {
        return output;
    }


    /**
     * Sets the output value for this PatternAssemblyRequest.
     * 
     * @param output   * Return type. Accepted values: 'server' (result is stored on
     * a file on the server), 'client' (result is directly transferred to
     * the client), or  'both'. 
     * 		Default is 'both'.
     */
    public void setOutput(java.lang.String output) {
        this.output = output;
    }


    /**
     * Gets the input value for this PatternAssemblyRequest.
     * 
     * @return input   * Input data
     */
    public java.lang.String getInput() {
        return input;
    }


    /**
     * Sets the input value for this PatternAssemblyRequest.
     * 
     * @param input   * Input data
     */
    public void setInput(java.lang.String input) {
        this.input = input;
    }


    /**
     * Gets the tmp_infile value for this PatternAssemblyRequest.
     * 
     * @return tmp_infile   * Input file on the server (workflow usage)
     */
    public java.lang.String getTmp_infile() {
        return tmp_infile;
    }


    /**
     * Sets the tmp_infile value for this PatternAssemblyRequest.
     * 
     * @param tmp_infile   * Input file on the server (workflow usage)
     */
    public void setTmp_infile(java.lang.String tmp_infile) {
        this.tmp_infile = tmp_infile;
    }


    /**
     * Gets the verbosity value for this PatternAssemblyRequest.
     * 
     * @return verbosity   * Verbosity.
     */
    public java.lang.Integer getVerbosity() {
        return verbosity;
    }


    /**
     * Sets the verbosity value for this PatternAssemblyRequest.
     * 
     * @param verbosity   * Verbosity.
     */
    public void setVerbosity(java.lang.Integer verbosity) {
        this.verbosity = verbosity;
    }


    /**
     * Gets the score_col value for this PatternAssemblyRequest.
     * 
     * @return score_col   * Score column. Column of the input file that contains the scores.
     * if not specified, patterns are incorporated according to their order
     * in the input file. However, if the input file has been generated with
     * oligo-analysis or dyad-analysis with a verbosity >= 1, pattern-assembly
     * detects the occ_sig column in the file header and uses this column
     * as score column.
     */
    public java.lang.Integer getScore_col() {
        return score_col;
    }


    /**
     * Sets the score_col value for this PatternAssemblyRequest.
     * 
     * @param score_col   * Score column. Column of the input file that contains the scores.
     * if not specified, patterns are incorporated according to their order
     * in the input file. However, if the input file has been generated with
     * oligo-analysis or dyad-analysis with a verbosity >= 1, pattern-assembly
     * detects the occ_sig column in the file header and uses this column
     * as score column.
     */
    public void setScore_col(java.lang.Integer score_col) {
        this.score_col = score_col;
    }


    /**
     * Gets the str value for this PatternAssemblyRequest.
     * 
     * @return str   * Strands for the assembly: 1 for single-strand; 2 for two-strand
     * assembly. Default is 2.
     */
    public java.lang.Integer getStr() {
        return str;
    }


    /**
     * Sets the str value for this PatternAssemblyRequest.
     * 
     * @param str   * Strands for the assembly: 1 for single-strand; 2 for two-strand
     * assembly. Default is 2.
     */
    public void setStr(java.lang.Integer str) {
        this.str = str;
    }


    /**
     * Gets the maxfl value for this PatternAssemblyRequest.
     * 
     * @return maxfl   * Maximum flanking segment size. Default is 1.
     */
    public java.lang.Integer getMaxfl() {
        return maxfl;
    }


    /**
     * Sets the maxfl value for this PatternAssemblyRequest.
     * 
     * @param maxfl   * Maximum flanking segment size. Default is 1.
     */
    public void setMaxfl(java.lang.Integer maxfl) {
        this.maxfl = maxfl;
    }


    /**
     * Gets the subst value for this PatternAssemblyRequest.
     * 
     * @return subst   * Maximum allowed substitutions. Default is 0.
     */
    public java.lang.Integer getSubst() {
        return subst;
    }


    /**
     * Sets the subst value for this PatternAssemblyRequest.
     * 
     * @param subst   * Maximum allowed substitutions. Default is 0.
     */
    public void setSubst(java.lang.Integer subst) {
        this.subst = subst;
    }


    /**
     * Gets the maxcl value for this PatternAssemblyRequest.
     * 
     * @return maxcl   * Maximum assembly size, i.e. number of patterns per assembly.
     * Default is 50.
     */
    public java.lang.Integer getMaxcl() {
        return maxcl;
    }


    /**
     * Sets the maxcl value for this PatternAssemblyRequest.
     * 
     * @param maxcl   * Maximum assembly size, i.e. number of patterns per assembly.
     * Default is 50.
     */
    public void setMaxcl(java.lang.Integer maxcl) {
        this.maxcl = maxcl;
    }


    /**
     * Gets the maxpat value for this PatternAssemblyRequest.
     * 
     * @return maxpat   * Maximum number of allowed patterns. If the number of patterns
     * exceeds this value, the program issues a fatal error. Default: no
     * limit.
     */
    public java.lang.Integer getMaxpat() {
        return maxpat;
    }


    /**
     * Sets the maxpat value for this PatternAssemblyRequest.
     * 
     * @param maxpat   * Maximum number of allowed patterns. If the number of patterns
     * exceeds this value, the program issues a fatal error. Default: no
     * limit.
     */
    public void setMaxpat(java.lang.Integer maxpat) {
        this.maxpat = maxpat;
    }


    /**
     * Gets the toppat value for this PatternAssemblyRequest.
     * 
     * @return toppat   * Maximum number of patterns to analyze. If the number of patterns
     * exceeds this value, the program selects a subset of them, , starting
     * from the top of the. Default: 100.
     */
    public java.lang.Integer getToppat() {
        return toppat;
    }


    /**
     * Sets the toppat value for this PatternAssemblyRequest.
     * 
     * @param toppat   * Maximum number of patterns to analyze. If the number of patterns
     * exceeds this value, the program selects a subset of them, , starting
     * from the top of the. Default: 100.
     */
    public void setToppat(java.lang.Integer toppat) {
        this.toppat = toppat;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PatternAssemblyRequest)) return false;
        PatternAssemblyRequest other = (PatternAssemblyRequest) obj;
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
            ((this.verbosity==null && other.getVerbosity()==null) || 
             (this.verbosity!=null &&
              this.verbosity.equals(other.getVerbosity()))) &&
            ((this.score_col==null && other.getScore_col()==null) || 
             (this.score_col!=null &&
              this.score_col.equals(other.getScore_col()))) &&
            ((this.str==null && other.getStr()==null) || 
             (this.str!=null &&
              this.str.equals(other.getStr()))) &&
            ((this.maxfl==null && other.getMaxfl()==null) || 
             (this.maxfl!=null &&
              this.maxfl.equals(other.getMaxfl()))) &&
            ((this.subst==null && other.getSubst()==null) || 
             (this.subst!=null &&
              this.subst.equals(other.getSubst()))) &&
            ((this.maxcl==null && other.getMaxcl()==null) || 
             (this.maxcl!=null &&
              this.maxcl.equals(other.getMaxcl()))) &&
            ((this.maxpat==null && other.getMaxpat()==null) || 
             (this.maxpat!=null &&
              this.maxpat.equals(other.getMaxpat()))) &&
            ((this.toppat==null && other.getToppat()==null) || 
             (this.toppat!=null &&
              this.toppat.equals(other.getToppat())));
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
        if (getVerbosity() != null) {
            _hashCode += getVerbosity().hashCode();
        }
        if (getScore_col() != null) {
            _hashCode += getScore_col().hashCode();
        }
        if (getStr() != null) {
            _hashCode += getStr().hashCode();
        }
        if (getMaxfl() != null) {
            _hashCode += getMaxfl().hashCode();
        }
        if (getSubst() != null) {
            _hashCode += getSubst().hashCode();
        }
        if (getMaxcl() != null) {
            _hashCode += getMaxcl().hashCode();
        }
        if (getMaxpat() != null) {
            _hashCode += getMaxpat().hashCode();
        }
        if (getToppat() != null) {
            _hashCode += getToppat().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PatternAssemblyRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:RSATWS", "PatternAssemblyRequest"));
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
        elemField.setFieldName("verbosity");
        elemField.setXmlName(new javax.xml.namespace.QName("", "verbosity"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("score_col");
        elemField.setXmlName(new javax.xml.namespace.QName("", "score_col"));
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
        elemField.setFieldName("maxfl");
        elemField.setXmlName(new javax.xml.namespace.QName("", "maxfl"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subst");
        elemField.setXmlName(new javax.xml.namespace.QName("", "subst"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maxcl");
        elemField.setXmlName(new javax.xml.namespace.QName("", "maxcl"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maxpat");
        elemField.setXmlName(new javax.xml.namespace.QName("", "maxpat"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("toppat");
        elemField.setXmlName(new javax.xml.namespace.QName("", "toppat"));
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
