/**
 * DyadAnalysisRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.3 Oct 05, 2005 (05:23:37 EDT) WSDL2Java emitter.
 */

package RSATWS;

public class DyadAnalysisRequest  implements java.io.Serializable {
    /* Return type. Accepted values: 'server' (result is stored on
     * a file on the server), 'client' (result is directly transferred to
     * the client), or  'both'. 
     * Default is 'both'. */
    private java.lang.String output;

    /* Input sequence. You need to supply either this parameter or
     * the next one (tmp_infile). */
    private java.lang.String sequence;

    /* Name of the file with input sequence on the server. 
     * You need to supply either this parameter or the previous one (sequence). */
    private java.lang.String tmp_infile;

    /* Input sequence format. Supported: IG (Intelligenetics), WC
     * (wconsensus), raw, fasta. Default is fasta. */
    private java.lang.String format;

    /* Dyad length. */
    private int length;

    /* Spacing between elements of the dyads. */
    private java.lang.String spacing;

    /* Organism. Words need to be underscore separated (example: Escherichia_coli_K12). */
    private java.lang.String organism;

    /* Background model: Type of sequences used as background model
     * for estimating expected oligonucleotide frequencies. 
     * Supported: upstream, upstreamL, upstream-noorf, intergenic, input. */
    private java.lang.String background;

    /* List of statistics to return. Supported: occ, mseq, freq, proba,
     * ratio, zscore, like, pos, rank. */
    private java.lang.String stats;

    /* dyad_type (dr | ir | rep | any) 
     * In order to fasten execution, the program can be asked to restrict
     * its analysis to symmetric dyads. 
     * Four types are accepted: 
     * 	dr - direct repeats: the second element is the same as the first
     * one; 
     * 	ir - inverted repeats: the second element is the revers complement
     * of the first one; 
     * 	rep - repeats: direct and inverted repeats are evaluated. 
     * 	any - (default) 
     * When selecting the option any, the analysis is performed on all non-symmetric
     * dyads as well. */
    private java.lang.String type;

    /* No overlapping of dyads allowed if value = 1. 
     * Disable the detection of overlapping matches for self-overlapping
     * patterns (ex TATATA, GATAGA). */
    private java.lang.Integer noov;

    /* Dyad occurrences found on both stands are summed (2) or not
     * (1). Default is 2. */
    private java.lang.Integer str;

    /* Sort dyads according to overrepresentation if value = 1. */
    private java.lang.Integer sort;

    /* Detect under-represented instead of over-represented dyads
     * (left tail significance test) if value = 1. */
    private java.lang.Integer under;

    /* Detect under-represented and over-represented dyads (two-fail
     * significance test) if value = 1. */
    private java.lang.Integer two_tails;

    /* Report also dyads with zero occurrences (provided they fit
     * the other thresholds) if value = 1. 
     * By default, the program reports only patterns present in the sequence.
     * 
     * If the left tail or two-tail test is applied, patterns with zero occurrences
     * are automatically taken into account. 
     * In some other cases, one would also like to detect patterns absent
     * from the sequence. 
     * This is the function of the option -zeroocc. */
    private java.lang.Integer zeroocc;

    /* Lower threshold on some parameters. Format=list of 'parameter
     * value'. */
    private java.lang.String[] lth;

    /* Upper threshold on some parameter. Format=list of 'parameter
     * value'. */
    private java.lang.String[] uth;

    public DyadAnalysisRequest() {
    }

    public DyadAnalysisRequest(
           java.lang.String output,
           java.lang.String sequence,
           java.lang.String tmp_infile,
           java.lang.String format,
           int length,
           java.lang.String spacing,
           java.lang.String organism,
           java.lang.String background,
           java.lang.String stats,
           java.lang.String type,
           java.lang.Integer noov,
           java.lang.Integer str,
           java.lang.Integer sort,
           java.lang.Integer under,
           java.lang.Integer two_tails,
           java.lang.Integer zeroocc,
           java.lang.String[] lth,
           java.lang.String[] uth) {
           this.output = output;
           this.sequence = sequence;
           this.tmp_infile = tmp_infile;
           this.format = format;
           this.length = length;
           this.spacing = spacing;
           this.organism = organism;
           this.background = background;
           this.stats = stats;
           this.type = type;
           this.noov = noov;
           this.str = str;
           this.sort = sort;
           this.under = under;
           this.two_tails = two_tails;
           this.zeroocc = zeroocc;
           this.lth = lth;
           this.uth = uth;
    }


    /**
     * Gets the output value for this DyadAnalysisRequest.
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
     * Sets the output value for this DyadAnalysisRequest.
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
     * Gets the sequence value for this DyadAnalysisRequest.
     * 
     * @return sequence   * Input sequence. You need to supply either this parameter or
     * the next one (tmp_infile).
     */
    public java.lang.String getSequence() {
        return sequence;
    }


    /**
     * Sets the sequence value for this DyadAnalysisRequest.
     * 
     * @param sequence   * Input sequence. You need to supply either this parameter or
     * the next one (tmp_infile).
     */
    public void setSequence(java.lang.String sequence) {
        this.sequence = sequence;
    }


    /**
     * Gets the tmp_infile value for this DyadAnalysisRequest.
     * 
     * @return tmp_infile   * Name of the file with input sequence on the server. 
     * You need to supply either this parameter or the previous one (sequence).
     */
    public java.lang.String getTmp_infile() {
        return tmp_infile;
    }


    /**
     * Sets the tmp_infile value for this DyadAnalysisRequest.
     * 
     * @param tmp_infile   * Name of the file with input sequence on the server. 
     * You need to supply either this parameter or the previous one (sequence).
     */
    public void setTmp_infile(java.lang.String tmp_infile) {
        this.tmp_infile = tmp_infile;
    }


    /**
     * Gets the format value for this DyadAnalysisRequest.
     * 
     * @return format   * Input sequence format. Supported: IG (Intelligenetics), WC
     * (wconsensus), raw, fasta. Default is fasta.
     */
    public java.lang.String getFormat() {
        return format;
    }


    /**
     * Sets the format value for this DyadAnalysisRequest.
     * 
     * @param format   * Input sequence format. Supported: IG (Intelligenetics), WC
     * (wconsensus), raw, fasta. Default is fasta.
     */
    public void setFormat(java.lang.String format) {
        this.format = format;
    }


    /**
     * Gets the length value for this DyadAnalysisRequest.
     * 
     * @return length   * Dyad length.
     */
    public int getLength() {
        return length;
    }


    /**
     * Sets the length value for this DyadAnalysisRequest.
     * 
     * @param length   * Dyad length.
     */
    public void setLength(int length) {
        this.length = length;
    }


    /**
     * Gets the spacing value for this DyadAnalysisRequest.
     * 
     * @return spacing   * Spacing between elements of the dyads.
     */
    public java.lang.String getSpacing() {
        return spacing;
    }


    /**
     * Sets the spacing value for this DyadAnalysisRequest.
     * 
     * @param spacing   * Spacing between elements of the dyads.
     */
    public void setSpacing(java.lang.String spacing) {
        this.spacing = spacing;
    }


    /**
     * Gets the organism value for this DyadAnalysisRequest.
     * 
     * @return organism   * Organism. Words need to be underscore separated (example: Escherichia_coli_K12).
     */
    public java.lang.String getOrganism() {
        return organism;
    }


    /**
     * Sets the organism value for this DyadAnalysisRequest.
     * 
     * @param organism   * Organism. Words need to be underscore separated (example: Escherichia_coli_K12).
     */
    public void setOrganism(java.lang.String organism) {
        this.organism = organism;
    }


    /**
     * Gets the background value for this DyadAnalysisRequest.
     * 
     * @return background   * Background model: Type of sequences used as background model
     * for estimating expected oligonucleotide frequencies. 
     * Supported: upstream, upstreamL, upstream-noorf, intergenic, input.
     */
    public java.lang.String getBackground() {
        return background;
    }


    /**
     * Sets the background value for this DyadAnalysisRequest.
     * 
     * @param background   * Background model: Type of sequences used as background model
     * for estimating expected oligonucleotide frequencies. 
     * Supported: upstream, upstreamL, upstream-noorf, intergenic, input.
     */
    public void setBackground(java.lang.String background) {
        this.background = background;
    }


    /**
     * Gets the stats value for this DyadAnalysisRequest.
     * 
     * @return stats   * List of statistics to return. Supported: occ, mseq, freq, proba,
     * ratio, zscore, like, pos, rank.
     */
    public java.lang.String getStats() {
        return stats;
    }


    /**
     * Sets the stats value for this DyadAnalysisRequest.
     * 
     * @param stats   * List of statistics to return. Supported: occ, mseq, freq, proba,
     * ratio, zscore, like, pos, rank.
     */
    public void setStats(java.lang.String stats) {
        this.stats = stats;
    }


    /**
     * Gets the type value for this DyadAnalysisRequest.
     * 
     * @return type   * dyad_type (dr | ir | rep | any) 
     * In order to fasten execution, the program can be asked to restrict
     * its analysis to symmetric dyads. 
     * Four types are accepted: 
     * 	dr - direct repeats: the second element is the same as the first
     * one; 
     * 	ir - inverted repeats: the second element is the revers complement
     * of the first one; 
     * 	rep - repeats: direct and inverted repeats are evaluated. 
     * 	any - (default) 
     * When selecting the option any, the analysis is performed on all non-symmetric
     * dyads as well.
     */
    public java.lang.String getType() {
        return type;
    }


    /**
     * Sets the type value for this DyadAnalysisRequest.
     * 
     * @param type   * dyad_type (dr | ir | rep | any) 
     * In order to fasten execution, the program can be asked to restrict
     * its analysis to symmetric dyads. 
     * Four types are accepted: 
     * 	dr - direct repeats: the second element is the same as the first
     * one; 
     * 	ir - inverted repeats: the second element is the revers complement
     * of the first one; 
     * 	rep - repeats: direct and inverted repeats are evaluated. 
     * 	any - (default) 
     * When selecting the option any, the analysis is performed on all non-symmetric
     * dyads as well.
     */
    public void setType(java.lang.String type) {
        this.type = type;
    }


    /**
     * Gets the noov value for this DyadAnalysisRequest.
     * 
     * @return noov   * No overlapping of dyads allowed if value = 1. 
     * Disable the detection of overlapping matches for self-overlapping
     * patterns (ex TATATA, GATAGA).
     */
    public java.lang.Integer getNoov() {
        return noov;
    }


    /**
     * Sets the noov value for this DyadAnalysisRequest.
     * 
     * @param noov   * No overlapping of dyads allowed if value = 1. 
     * Disable the detection of overlapping matches for self-overlapping
     * patterns (ex TATATA, GATAGA).
     */
    public void setNoov(java.lang.Integer noov) {
        this.noov = noov;
    }


    /**
     * Gets the str value for this DyadAnalysisRequest.
     * 
     * @return str   * Dyad occurrences found on both stands are summed (2) or not
     * (1). Default is 2.
     */
    public java.lang.Integer getStr() {
        return str;
    }


    /**
     * Sets the str value for this DyadAnalysisRequest.
     * 
     * @param str   * Dyad occurrences found on both stands are summed (2) or not
     * (1). Default is 2.
     */
    public void setStr(java.lang.Integer str) {
        this.str = str;
    }


    /**
     * Gets the sort value for this DyadAnalysisRequest.
     * 
     * @return sort   * Sort dyads according to overrepresentation if value = 1.
     */
    public java.lang.Integer getSort() {
        return sort;
    }


    /**
     * Sets the sort value for this DyadAnalysisRequest.
     * 
     * @param sort   * Sort dyads according to overrepresentation if value = 1.
     */
    public void setSort(java.lang.Integer sort) {
        this.sort = sort;
    }


    /**
     * Gets the under value for this DyadAnalysisRequest.
     * 
     * @return under   * Detect under-represented instead of over-represented dyads
     * (left tail significance test) if value = 1.
     */
    public java.lang.Integer getUnder() {
        return under;
    }


    /**
     * Sets the under value for this DyadAnalysisRequest.
     * 
     * @param under   * Detect under-represented instead of over-represented dyads
     * (left tail significance test) if value = 1.
     */
    public void setUnder(java.lang.Integer under) {
        this.under = under;
    }


    /**
     * Gets the two_tails value for this DyadAnalysisRequest.
     * 
     * @return two_tails   * Detect under-represented and over-represented dyads (two-fail
     * significance test) if value = 1.
     */
    public java.lang.Integer getTwo_tails() {
        return two_tails;
    }


    /**
     * Sets the two_tails value for this DyadAnalysisRequest.
     * 
     * @param two_tails   * Detect under-represented and over-represented dyads (two-fail
     * significance test) if value = 1.
     */
    public void setTwo_tails(java.lang.Integer two_tails) {
        this.two_tails = two_tails;
    }


    /**
     * Gets the zeroocc value for this DyadAnalysisRequest.
     * 
     * @return zeroocc   * Report also dyads with zero occurrences (provided they fit
     * the other thresholds) if value = 1. 
     * By default, the program reports only patterns present in the sequence.
     * 
     * If the left tail or two-tail test is applied, patterns with zero occurrences
     * are automatically taken into account. 
     * In some other cases, one would also like to detect patterns absent
     * from the sequence. 
     * This is the function of the option -zeroocc.
     */
    public java.lang.Integer getZeroocc() {
        return zeroocc;
    }


    /**
     * Sets the zeroocc value for this DyadAnalysisRequest.
     * 
     * @param zeroocc   * Report also dyads with zero occurrences (provided they fit
     * the other thresholds) if value = 1. 
     * By default, the program reports only patterns present in the sequence.
     * 
     * If the left tail or two-tail test is applied, patterns with zero occurrences
     * are automatically taken into account. 
     * In some other cases, one would also like to detect patterns absent
     * from the sequence. 
     * This is the function of the option -zeroocc.
     */
    public void setZeroocc(java.lang.Integer zeroocc) {
        this.zeroocc = zeroocc;
    }


    /**
     * Gets the lth value for this DyadAnalysisRequest.
     * 
     * @return lth   * Lower threshold on some parameters. Format=list of 'parameter
     * value'.
     */
    public java.lang.String[] getLth() {
        return lth;
    }


    /**
     * Sets the lth value for this DyadAnalysisRequest.
     * 
     * @param lth   * Lower threshold on some parameters. Format=list of 'parameter
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
     * Gets the uth value for this DyadAnalysisRequest.
     * 
     * @return uth   * Upper threshold on some parameter. Format=list of 'parameter
     * value'.
     */
    public java.lang.String[] getUth() {
        return uth;
    }


    /**
     * Sets the uth value for this DyadAnalysisRequest.
     * 
     * @param uth   * Upper threshold on some parameter. Format=list of 'parameter
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

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DyadAnalysisRequest)) return false;
        DyadAnalysisRequest other = (DyadAnalysisRequest) obj;
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
            this.length == other.getLength() &&
            ((this.spacing==null && other.getSpacing()==null) || 
             (this.spacing!=null &&
              this.spacing.equals(other.getSpacing()))) &&
            ((this.organism==null && other.getOrganism()==null) || 
             (this.organism!=null &&
              this.organism.equals(other.getOrganism()))) &&
            ((this.background==null && other.getBackground()==null) || 
             (this.background!=null &&
              this.background.equals(other.getBackground()))) &&
            ((this.stats==null && other.getStats()==null) || 
             (this.stats!=null &&
              this.stats.equals(other.getStats()))) &&
            ((this.type==null && other.getType()==null) || 
             (this.type!=null &&
              this.type.equals(other.getType()))) &&
            ((this.noov==null && other.getNoov()==null) || 
             (this.noov!=null &&
              this.noov.equals(other.getNoov()))) &&
            ((this.str==null && other.getStr()==null) || 
             (this.str!=null &&
              this.str.equals(other.getStr()))) &&
            ((this.sort==null && other.getSort()==null) || 
             (this.sort!=null &&
              this.sort.equals(other.getSort()))) &&
            ((this.under==null && other.getUnder()==null) || 
             (this.under!=null &&
              this.under.equals(other.getUnder()))) &&
            ((this.two_tails==null && other.getTwo_tails()==null) || 
             (this.two_tails!=null &&
              this.two_tails.equals(other.getTwo_tails()))) &&
            ((this.zeroocc==null && other.getZeroocc()==null) || 
             (this.zeroocc!=null &&
              this.zeroocc.equals(other.getZeroocc()))) &&
            ((this.lth==null && other.getLth()==null) || 
             (this.lth!=null &&
              java.util.Arrays.equals(this.lth, other.getLth()))) &&
            ((this.uth==null && other.getUth()==null) || 
             (this.uth!=null &&
              java.util.Arrays.equals(this.uth, other.getUth())));
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
        _hashCode += getLength();
        if (getSpacing() != null) {
            _hashCode += getSpacing().hashCode();
        }
        if (getOrganism() != null) {
            _hashCode += getOrganism().hashCode();
        }
        if (getBackground() != null) {
            _hashCode += getBackground().hashCode();
        }
        if (getStats() != null) {
            _hashCode += getStats().hashCode();
        }
        if (getType() != null) {
            _hashCode += getType().hashCode();
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
        if (getUnder() != null) {
            _hashCode += getUnder().hashCode();
        }
        if (getTwo_tails() != null) {
            _hashCode += getTwo_tails().hashCode();
        }
        if (getZeroocc() != null) {
            _hashCode += getZeroocc().hashCode();
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
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DyadAnalysisRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:RSATWS", "DyadAnalysisRequest"));
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
        elemField.setFieldName("length");
        elemField.setXmlName(new javax.xml.namespace.QName("", "length"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("spacing");
        elemField.setXmlName(new javax.xml.namespace.QName("", "spacing"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
        elemField.setFieldName("type");
        elemField.setXmlName(new javax.xml.namespace.QName("", "type"));
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
        elemField.setFieldName("under");
        elemField.setXmlName(new javax.xml.namespace.QName("", "under"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("two_tails");
        elemField.setXmlName(new javax.xml.namespace.QName("", "two_tails"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("zeroocc");
        elemField.setXmlName(new javax.xml.namespace.QName("", "zeroocc"));
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
