/**
 * OligoAnalysisRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.3 Oct 05, 2005 (05:23:37 EDT) WSDL2Java emitter.
 */

package RSATWS;

public class OligoAnalysisRequest  implements java.io.Serializable {
    /* Return type. Accepted values: 'server' (result is stored on
     * a file on the server), 'client' (result is directly transferred to
     * the client), or  'both'. 
     * Default is 'both'. */
    private java.lang.String output;

    /* Verbosity. */
    private java.lang.Integer verbosity;

    /* Input sequence. You need to supply either this parameter or
     * the next one (tmp_infile). */
    private java.lang.String sequence;

    /* Name of the file with input sequence on the server. You need
     * to supply either this parameter or the previous one (sequence). */
    private java.lang.String tmp_infile;

    /* Input sequence format. Supported: IG (Intelligenetics), WC
     * (wconsensus), raw, fasta. Default is fasta. */
    private java.lang.String format;

    /* Oligomer length. */
    private int length;

    /* Organism. Words need to be underscore separated (example: Escherichia_coli_K12). */
    private java.lang.String organism;

    /* Background model: Type of sequences used as background model
     * for estimating expected oligonucleotide frequencies. 
     * Supported: upstream, upstream-noorf, upstream-noorf-rm, intergenic,
     * input. */
    private java.lang.String background;

    /* List of statistics to return. Supported:occ, mseq, freq, proba,
     * ratio, zscore, like, pos, rank. */
    private java.lang.String stats;

    /* No overlapping of oligos allowed if value = 1. Disable the
     * detection of overlapping matches for self-overlapping patterns (ex
     * TATATA, GATAGA). */
    private java.lang.Integer noov;

    /* Oligonucleotide occurrences found on both stands are summed
     * (2) or not (1). Default is 2. */
    private java.lang.Integer str;

    /* Sort oligomers according to overrepresentation if value = 1. */
    private java.lang.Integer sort;

    /* Lower threshold on some parameters. Format=list of'parameter
     * value'. */
    private java.lang.String[] lth;

    /* Upper threshold on some parameters. Format=list of 'parameter
     * value'. */
    private java.lang.String[] uth;

    /* Pseudo-weight. Must be a real value between 0 and 1. */
    private java.lang.String pseudo;

    public OligoAnalysisRequest() {
    }

    public OligoAnalysisRequest(
           java.lang.String output,
           java.lang.Integer verbosity,
           java.lang.String sequence,
           java.lang.String tmp_infile,
           java.lang.String format,
           int length,
           java.lang.String organism,
           java.lang.String background,
           java.lang.String stats,
           java.lang.Integer noov,
           java.lang.Integer str,
           java.lang.Integer sort,
           java.lang.String[] lth,
           java.lang.String[] uth,
           java.lang.String pseudo) {
           this.output = output;
           this.verbosity = verbosity;
           this.sequence = sequence;
           this.tmp_infile = tmp_infile;
           this.format = format;
           this.length = length;
           this.organism = organism;
           this.background = background;
           this.stats = stats;
           this.noov = noov;
           this.str = str;
           this.sort = sort;
           this.lth = lth;
           this.uth = uth;
           this.pseudo = pseudo;
    }


    /**
     * Gets the output value for this OligoAnalysisRequest.
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
     * Sets the output value for this OligoAnalysisRequest.
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
     * Gets the verbosity value for this OligoAnalysisRequest.
     * 
     * @return verbosity   * Verbosity.
     */
    public java.lang.Integer getVerbosity() {
        return verbosity;
    }


    /**
     * Sets the verbosity value for this OligoAnalysisRequest.
     * 
     * @param verbosity   * Verbosity.
     */
    public void setVerbosity(java.lang.Integer verbosity) {
        this.verbosity = verbosity;
    }


    /**
     * Gets the sequence value for this OligoAnalysisRequest.
     * 
     * @return sequence   * Input sequence. You need to supply either this parameter or
     * the next one (tmp_infile).
     */
    public java.lang.String getSequence() {
        return sequence;
    }


    /**
     * Sets the sequence value for this OligoAnalysisRequest.
     * 
     * @param sequence   * Input sequence. You need to supply either this parameter or
     * the next one (tmp_infile).
     */
    public void setSequence(java.lang.String sequence) {
        this.sequence = sequence;
    }


    /**
     * Gets the tmp_infile value for this OligoAnalysisRequest.
     * 
     * @return tmp_infile   * Name of the file with input sequence on the server. You need
     * to supply either this parameter or the previous one (sequence).
     */
    public java.lang.String getTmp_infile() {
        return tmp_infile;
    }


    /**
     * Sets the tmp_infile value for this OligoAnalysisRequest.
     * 
     * @param tmp_infile   * Name of the file with input sequence on the server. You need
     * to supply either this parameter or the previous one (sequence).
     */
    public void setTmp_infile(java.lang.String tmp_infile) {
        this.tmp_infile = tmp_infile;
    }


    /**
     * Gets the format value for this OligoAnalysisRequest.
     * 
     * @return format   * Input sequence format. Supported: IG (Intelligenetics), WC
     * (wconsensus), raw, fasta. Default is fasta.
     */
    public java.lang.String getFormat() {
        return format;
    }


    /**
     * Sets the format value for this OligoAnalysisRequest.
     * 
     * @param format   * Input sequence format. Supported: IG (Intelligenetics), WC
     * (wconsensus), raw, fasta. Default is fasta.
     */
    public void setFormat(java.lang.String format) {
        this.format = format;
    }


    /**
     * Gets the length value for this OligoAnalysisRequest.
     * 
     * @return length   * Oligomer length.
     */
    public int getLength() {
        return length;
    }


    /**
     * Sets the length value for this OligoAnalysisRequest.
     * 
     * @param length   * Oligomer length.
     */
    public void setLength(int length) {
        this.length = length;
    }


    /**
     * Gets the organism value for this OligoAnalysisRequest.
     * 
     * @return organism   * Organism. Words need to be underscore separated (example: Escherichia_coli_K12).
     */
    public java.lang.String getOrganism() {
        return organism;
    }


    /**
     * Sets the organism value for this OligoAnalysisRequest.
     * 
     * @param organism   * Organism. Words need to be underscore separated (example: Escherichia_coli_K12).
     */
    public void setOrganism(java.lang.String organism) {
        this.organism = organism;
    }


    /**
     * Gets the background value for this OligoAnalysisRequest.
     * 
     * @return background   * Background model: Type of sequences used as background model
     * for estimating expected oligonucleotide frequencies. 
     * Supported: upstream, upstream-noorf, upstream-noorf-rm, intergenic,
     * input.
     */
    public java.lang.String getBackground() {
        return background;
    }


    /**
     * Sets the background value for this OligoAnalysisRequest.
     * 
     * @param background   * Background model: Type of sequences used as background model
     * for estimating expected oligonucleotide frequencies. 
     * Supported: upstream, upstream-noorf, upstream-noorf-rm, intergenic,
     * input.
     */
    public void setBackground(java.lang.String background) {
        this.background = background;
    }


    /**
     * Gets the stats value for this OligoAnalysisRequest.
     * 
     * @return stats   * List of statistics to return. Supported:occ, mseq, freq, proba,
     * ratio, zscore, like, pos, rank.
     */
    public java.lang.String getStats() {
        return stats;
    }


    /**
     * Sets the stats value for this OligoAnalysisRequest.
     * 
     * @param stats   * List of statistics to return. Supported:occ, mseq, freq, proba,
     * ratio, zscore, like, pos, rank.
     */
    public void setStats(java.lang.String stats) {
        this.stats = stats;
    }


    /**
     * Gets the noov value for this OligoAnalysisRequest.
     * 
     * @return noov   * No overlapping of oligos allowed if value = 1. Disable the
     * detection of overlapping matches for self-overlapping patterns (ex
     * TATATA, GATAGA).
     */
    public java.lang.Integer getNoov() {
        return noov;
    }


    /**
     * Sets the noov value for this OligoAnalysisRequest.
     * 
     * @param noov   * No overlapping of oligos allowed if value = 1. Disable the
     * detection of overlapping matches for self-overlapping patterns (ex
     * TATATA, GATAGA).
     */
    public void setNoov(java.lang.Integer noov) {
        this.noov = noov;
    }


    /**
     * Gets the str value for this OligoAnalysisRequest.
     * 
     * @return str   * Oligonucleotide occurrences found on both stands are summed
     * (2) or not (1). Default is 2.
     */
    public java.lang.Integer getStr() {
        return str;
    }


    /**
     * Sets the str value for this OligoAnalysisRequest.
     * 
     * @param str   * Oligonucleotide occurrences found on both stands are summed
     * (2) or not (1). Default is 2.
     */
    public void setStr(java.lang.Integer str) {
        this.str = str;
    }


    /**
     * Gets the sort value for this OligoAnalysisRequest.
     * 
     * @return sort   * Sort oligomers according to overrepresentation if value = 1.
     */
    public java.lang.Integer getSort() {
        return sort;
    }


    /**
     * Sets the sort value for this OligoAnalysisRequest.
     * 
     * @param sort   * Sort oligomers according to overrepresentation if value = 1.
     */
    public void setSort(java.lang.Integer sort) {
        this.sort = sort;
    }


    /**
     * Gets the lth value for this OligoAnalysisRequest.
     * 
     * @return lth   * Lower threshold on some parameters. Format=list of'parameter
     * value'.
     */
    public java.lang.String[] getLth() {
        return lth;
    }


    /**
     * Sets the lth value for this OligoAnalysisRequest.
     * 
     * @param lth   * Lower threshold on some parameters. Format=list of'parameter
     * value'.
     */
    public void setLth(java.lang.String[] lth) {
        this.lth = lth;
    }

    public java.lang.String getLth(int i) {
        return this.lth[i];
    }

    public void setLth(int i, java.lang.String _value) {
        this.lth[i] = _value;
    }


    /**
     * Gets the uth value for this OligoAnalysisRequest.
     * 
     * @return uth   * Upper threshold on some parameters. Format=list of 'parameter
     * value'.
     */
    public java.lang.String[] getUth() {
        return uth;
    }


    /**
     * Sets the uth value for this OligoAnalysisRequest.
     * 
     * @param uth   * Upper threshold on some parameters. Format=list of 'parameter
     * value'.
     */
    public void setUth(java.lang.String[] uth) {
        this.uth = uth;
    }

    public java.lang.String getUth(int i) {
        return this.uth[i];
    }

    public void setUth(int i, java.lang.String _value) {
        this.uth[i] = _value;
    }


    /**
     * Gets the pseudo value for this OligoAnalysisRequest.
     * 
     * @return pseudo   * Pseudo-weight. Must be a real value between 0 and 1.
     */
    public java.lang.String getPseudo() {
        return pseudo;
    }


    /**
     * Sets the pseudo value for this OligoAnalysisRequest.
     * 
     * @param pseudo   * Pseudo-weight. Must be a real value between 0 and 1.
     */
    public void setPseudo(java.lang.String pseudo) {
        this.pseudo = pseudo;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof OligoAnalysisRequest)) return false;
        OligoAnalysisRequest other = (OligoAnalysisRequest) obj;
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
            ((this.verbosity==null && other.getVerbosity()==null) || 
             (this.verbosity!=null &&
              this.verbosity.equals(other.getVerbosity()))) &&
            ((this.sequence==null && other.getSequence()==null) || 
             (this.sequence!=null &&
              this.sequence.equals(other.getSequence()))) &&
            ((this.tmp_infile==null && other.getTmp_infile()==null) || 
             (this.tmp_infile!=null &&
              this.tmp_infile.equals(other.getTmp_infile()))) &&
            ((this.format==null && other.getFormat()==null) || 
             (this.format!=null &&
              this.format.equals(other.getFormat()))) &&
            this.length == other.getLength() &&
            ((this.organism==null && other.getOrganism()==null) || 
             (this.organism!=null &&
              this.organism.equals(other.getOrganism()))) &&
            ((this.background==null && other.getBackground()==null) || 
             (this.background!=null &&
              this.background.equals(other.getBackground()))) &&
            ((this.stats==null && other.getStats()==null) || 
             (this.stats!=null &&
              this.stats.equals(other.getStats()))) &&
            ((this.noov==null && other.getNoov()==null) || 
             (this.noov!=null &&
              this.noov.equals(other.getNoov()))) &&
            ((this.str==null && other.getStr()==null) || 
             (this.str!=null &&
              this.str.equals(other.getStr()))) &&
            ((this.sort==null && other.getSort()==null) || 
             (this.sort!=null &&
              this.sort.equals(other.getSort()))) &&
            ((this.lth==null && other.getLth()==null) || 
             (this.lth!=null &&
              java.util.Arrays.equals(this.lth, other.getLth()))) &&
            ((this.uth==null && other.getUth()==null) || 
             (this.uth!=null &&
              java.util.Arrays.equals(this.uth, other.getUth()))) &&
            ((this.pseudo==null && other.getPseudo()==null) || 
             (this.pseudo!=null &&
              this.pseudo.equals(other.getPseudo())));
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
        if (getVerbosity() != null) {
            _hashCode += getVerbosity().hashCode();
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
        _hashCode += getLength();
        if (getOrganism() != null) {
            _hashCode += getOrganism().hashCode();
        }
        if (getBackground() != null) {
            _hashCode += getBackground().hashCode();
        }
        if (getStats() != null) {
            _hashCode += getStats().hashCode();
        }
        if (getNoov() != null) {
            _hashCode += getNoov().hashCode();
        }
        if (getStr() != null) {
            _hashCode += getStr().hashCode();
        }
        if (getSort() != null) {
            _hashCode += getSort().hashCode();
        }
        if (getLth() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getLth());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getLth(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getUth() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getUth());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getUth(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getPseudo() != null) {
            _hashCode += getPseudo().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(OligoAnalysisRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:RSATWS", "OligoAnalysisRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("output");
        elemField.setXmlName(new javax.xml.namespace.QName("", "output"));
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
        elemField.setFieldName("length");
        elemField.setXmlName(new javax.xml.namespace.QName("", "length"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("organism");
        elemField.setXmlName(new javax.xml.namespace.QName("", "organism"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
        elemField.setFieldName("stats");
        elemField.setXmlName(new javax.xml.namespace.QName("", "stats"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("noov");
        elemField.setXmlName(new javax.xml.namespace.QName("", "noov"));
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
        elemField.setFieldName("sort");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sort"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lth");
        elemField.setXmlName(new javax.xml.namespace.QName("", "lth"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("uth");
        elemField.setXmlName(new javax.xml.namespace.QName("", "uth"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pseudo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "pseudo"));
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
