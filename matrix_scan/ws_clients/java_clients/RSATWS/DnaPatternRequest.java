/**
 * DnaPatternRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.3 Oct 05, 2005 (05:23:37 EDT) WSDL2Java emitter.
 */

package RSATWS;

public class DnaPatternRequest  implements java.io.Serializable {
    /* Return type. Accepted values: 'server' (result is stored on
     * a file on the server), 'client' (result is directly transferred to
     * the client), or  'both'. 
     * Default is 'both'. */
    private java.lang.String output;

    /* Input sequence. You need to supply either this parameter or
     * the next one (tmp_infile). */
    private java.lang.String sequence;

    /* Name of the file with input sequence on the server. You need
     * to supply either this parameter or the previous one (sequence). */
    private java.lang.String tmp_infile;

    /* Input sequence format. Supported: IG (Intelligenetics), WC
     * (wconsensus), raw, fasta. Default is fasta. */
    private java.lang.String format;

    /* Number of substitutions allowed. */
    private java.lang.Integer subst;

    /* Pattern to match. Use this option or the 'pattern_file' option */
    private java.lang.String pattern;

    /* File with patterns to match. Use this option or the 'pattern'
     * option */
    private java.lang.String pattern_file;

    /* File located on the server with patterns to match (workflow
     * usage). */
    private java.lang.String tmp_pattern_file;

    /* Pattern identifier. */
    private java.lang.String id;

    /* Origin for the calculation of positions (0 for end of sequence). */
    private java.lang.String origin;

    /* No overlapping of oligos allowed if value = 1. Disable the
     * detection of overlapping matches for self-overlapping patterns (ex
     * TATATA, GATAGA). */
    private java.lang.Integer noov;

    /* Score column. Column of the pattern file which contains the
     * score */
    private java.lang.Integer score;

    /* Oligonucleotide occurrences found on both stands are summed
     * (2) or not (1). Default is 2. */
    private java.lang.Integer str;

    /* Sort oligomers according to overrepresentation if value = 1. */
    private java.lang.Integer sort;

    /* Threshold on match count. */
    private java.lang.Integer th;

    /* List of fields to return. Multiple fields can be entered separated
     * by commas.
     * Supported fields: colsum,counts,ct,limits,profiles,rank,rowsum,scores,sites,stats,table,total.
     * -return sites:   return match positions (default)
     *   -return limits: return start and end positions for each input sequence
     * -return counts: return the count of matches per sequence.  
     *   -return rank: return the rank of the sequence (this is especially
     * useful in combination with the option -sort).
     *   -return score: return a score per sequence, computed by summing
     * the scores of the matching patterns.
     *   -return ct:    same as '-return counts', except that it returns
     * the sum of matches in all the files of the sequence file list, instead
     * of the count within each separate file.
     *   -return table: return the count of pattern matches per sequence
     * in the form of a table.  (one line per sequence, one column per pattern)
     * -return colsum (together with -return table) prints an extra column
     * with the total occurrences per sequence
     *   -return rowsum (together with -return table) prints an extra row
     * with total occurrences per pattern
     *   -return total (together with -return table) prints an extra column
     * with the total occurrences per sequence and an extra row with total
     * occurrences per pattern.  (amounts to combine -colsum and -rowsum)
     * -return stats return matching statistics
     *   -return profiles return matching profiles with sliding windows. */
    private java.lang.String _return;

    public DnaPatternRequest() {
    }

    public DnaPatternRequest(
           java.lang.String output,
           java.lang.String sequence,
           java.lang.String tmp_infile,
           java.lang.String format,
           java.lang.Integer subst,
           java.lang.String pattern,
           java.lang.String pattern_file,
           java.lang.String tmp_pattern_file,
           java.lang.String id,
           java.lang.String origin,
           java.lang.Integer noov,
           java.lang.Integer score,
           java.lang.Integer str,
           java.lang.Integer sort,
           java.lang.Integer th,
           java.lang.String _return) {
           this.output = output;
           this.sequence = sequence;
           this.tmp_infile = tmp_infile;
           this.format = format;
           this.subst = subst;
           this.pattern = pattern;
           this.pattern_file = pattern_file;
           this.tmp_pattern_file = tmp_pattern_file;
           this.id = id;
           this.origin = origin;
           this.noov = noov;
           this.score = score;
           this.str = str;
           this.sort = sort;
           this.th = th;
           this._return = _return;
    }


    /**
     * Gets the output value for this DnaPatternRequest.
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
     * Sets the output value for this DnaPatternRequest.
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
     * Gets the sequence value for this DnaPatternRequest.
     * 
     * @return sequence   * Input sequence. You need to supply either this parameter or
     * the next one (tmp_infile).
     */
    public java.lang.String getSequence() {
        return sequence;
    }


    /**
     * Sets the sequence value for this DnaPatternRequest.
     * 
     * @param sequence   * Input sequence. You need to supply either this parameter or
     * the next one (tmp_infile).
     */
    public void setSequence(java.lang.String sequence) {
        this.sequence = sequence;
    }


    /**
     * Gets the tmp_infile value for this DnaPatternRequest.
     * 
     * @return tmp_infile   * Name of the file with input sequence on the server. You need
     * to supply either this parameter or the previous one (sequence).
     */
    public java.lang.String getTmp_infile() {
        return tmp_infile;
    }


    /**
     * Sets the tmp_infile value for this DnaPatternRequest.
     * 
     * @param tmp_infile   * Name of the file with input sequence on the server. You need
     * to supply either this parameter or the previous one (sequence).
     */
    public void setTmp_infile(java.lang.String tmp_infile) {
        this.tmp_infile = tmp_infile;
    }


    /**
     * Gets the format value for this DnaPatternRequest.
     * 
     * @return format   * Input sequence format. Supported: IG (Intelligenetics), WC
     * (wconsensus), raw, fasta. Default is fasta.
     */
    public java.lang.String getFormat() {
        return format;
    }


    /**
     * Sets the format value for this DnaPatternRequest.
     * 
     * @param format   * Input sequence format. Supported: IG (Intelligenetics), WC
     * (wconsensus), raw, fasta. Default is fasta.
     */
    public void setFormat(java.lang.String format) {
        this.format = format;
    }


    /**
     * Gets the subst value for this DnaPatternRequest.
     * 
     * @return subst   * Number of substitutions allowed.
     */
    public java.lang.Integer getSubst() {
        return subst;
    }


    /**
     * Sets the subst value for this DnaPatternRequest.
     * 
     * @param subst   * Number of substitutions allowed.
     */
    public void setSubst(java.lang.Integer subst) {
        this.subst = subst;
    }


    /**
     * Gets the pattern value for this DnaPatternRequest.
     * 
     * @return pattern   * Pattern to match. Use this option or the 'pattern_file' option
     */
    public java.lang.String getPattern() {
        return pattern;
    }


    /**
     * Sets the pattern value for this DnaPatternRequest.
     * 
     * @param pattern   * Pattern to match. Use this option or the 'pattern_file' option
     */
    public void setPattern(java.lang.String pattern) {
        this.pattern = pattern;
    }


    /**
     * Gets the pattern_file value for this DnaPatternRequest.
     * 
     * @return pattern_file   * File with patterns to match. Use this option or the 'pattern'
     * option
     */
    public java.lang.String getPattern_file() {
        return pattern_file;
    }


    /**
     * Sets the pattern_file value for this DnaPatternRequest.
     * 
     * @param pattern_file   * File with patterns to match. Use this option or the 'pattern'
     * option
     */
    public void setPattern_file(java.lang.String pattern_file) {
        this.pattern_file = pattern_file;
    }


    /**
     * Gets the tmp_pattern_file value for this DnaPatternRequest.
     * 
     * @return tmp_pattern_file   * File located on the server with patterns to match (workflow
     * usage).
     */
    public java.lang.String getTmp_pattern_file() {
        return tmp_pattern_file;
    }


    /**
     * Sets the tmp_pattern_file value for this DnaPatternRequest.
     * 
     * @param tmp_pattern_file   * File located on the server with patterns to match (workflow
     * usage).
     */
    public void setTmp_pattern_file(java.lang.String tmp_pattern_file) {
        this.tmp_pattern_file = tmp_pattern_file;
    }


    /**
     * Gets the id value for this DnaPatternRequest.
     * 
     * @return id   * Pattern identifier.
     */
    public java.lang.String getId() {
        return id;
    }


    /**
     * Sets the id value for this DnaPatternRequest.
     * 
     * @param id   * Pattern identifier.
     */
    public void setId(java.lang.String id) {
        this.id = id;
    }


    /**
     * Gets the origin value for this DnaPatternRequest.
     * 
     * @return origin   * Origin for the calculation of positions (0 for end of sequence).
     */
    public java.lang.String getOrigin() {
        return origin;
    }


    /**
     * Sets the origin value for this DnaPatternRequest.
     * 
     * @param origin   * Origin for the calculation of positions (0 for end of sequence).
     */
    public void setOrigin(java.lang.String origin) {
        this.origin = origin;
    }


    /**
     * Gets the noov value for this DnaPatternRequest.
     * 
     * @return noov   * No overlapping of oligos allowed if value = 1. Disable the
     * detection of overlapping matches for self-overlapping patterns (ex
     * TATATA, GATAGA).
     */
    public java.lang.Integer getNoov() {
        return noov;
    }


    /**
     * Sets the noov value for this DnaPatternRequest.
     * 
     * @param noov   * No overlapping of oligos allowed if value = 1. Disable the
     * detection of overlapping matches for self-overlapping patterns (ex
     * TATATA, GATAGA).
     */
    public void setNoov(java.lang.Integer noov) {
        this.noov = noov;
    }


    /**
     * Gets the score value for this DnaPatternRequest.
     * 
     * @return score   * Score column. Column of the pattern file which contains the
     * score
     */
    public java.lang.Integer getScore() {
        return score;
    }


    /**
     * Sets the score value for this DnaPatternRequest.
     * 
     * @param score   * Score column. Column of the pattern file which contains the
     * score
     */
    public void setScore(java.lang.Integer score) {
        this.score = score;
    }


    /**
     * Gets the str value for this DnaPatternRequest.
     * 
     * @return str   * Oligonucleotide occurrences found on both stands are summed
     * (2) or not (1). Default is 2.
     */
    public java.lang.Integer getStr() {
        return str;
    }


    /**
     * Sets the str value for this DnaPatternRequest.
     * 
     * @param str   * Oligonucleotide occurrences found on both stands are summed
     * (2) or not (1). Default is 2.
     */
    public void setStr(java.lang.Integer str) {
        this.str = str;
    }


    /**
     * Gets the sort value for this DnaPatternRequest.
     * 
     * @return sort   * Sort oligomers according to overrepresentation if value = 1.
     */
    public java.lang.Integer getSort() {
        return sort;
    }


    /**
     * Sets the sort value for this DnaPatternRequest.
     * 
     * @param sort   * Sort oligomers according to overrepresentation if value = 1.
     */
    public void setSort(java.lang.Integer sort) {
        this.sort = sort;
    }


    /**
     * Gets the th value for this DnaPatternRequest.
     * 
     * @return th   * Threshold on match count.
     */
    public java.lang.Integer getTh() {
        return th;
    }


    /**
     * Sets the th value for this DnaPatternRequest.
     * 
     * @param th   * Threshold on match count.
     */
    public void setTh(java.lang.Integer th) {
        this.th = th;
    }


    /**
     * Gets the _return value for this DnaPatternRequest.
     * 
     * @return _return   * List of fields to return. Multiple fields can be entered separated
     * by commas.
     * Supported fields: colsum,counts,ct,limits,profiles,rank,rowsum,scores,sites,stats,table,total.
     * -return sites:   return match positions (default)
     *   -return limits: return start and end positions for each input sequence
     * -return counts: return the count of matches per sequence.  
     *   -return rank: return the rank of the sequence (this is especially
     * useful in combination with the option -sort).
     *   -return score: return a score per sequence, computed by summing
     * the scores of the matching patterns.
     *   -return ct:    same as '-return counts', except that it returns
     * the sum of matches in all the files of the sequence file list, instead
     * of the count within each separate file.
     *   -return table: return the count of pattern matches per sequence
     * in the form of a table.  (one line per sequence, one column per pattern)
     * -return colsum (together with -return table) prints an extra column
     * with the total occurrences per sequence
     *   -return rowsum (together with -return table) prints an extra row
     * with total occurrences per pattern
     *   -return total (together with -return table) prints an extra column
     * with the total occurrences per sequence and an extra row with total
     * occurrences per pattern.  (amounts to combine -colsum and -rowsum)
     * -return stats return matching statistics
     *   -return profiles return matching profiles with sliding windows.
     */
    public java.lang.String get_return() {
        return _return;
    }


    /**
     * Sets the _return value for this DnaPatternRequest.
     * 
     * @param _return   * List of fields to return. Multiple fields can be entered separated
     * by commas.
     * Supported fields: colsum,counts,ct,limits,profiles,rank,rowsum,scores,sites,stats,table,total.
     * -return sites:   return match positions (default)
     *   -return limits: return start and end positions for each input sequence
     * -return counts: return the count of matches per sequence.  
     *   -return rank: return the rank of the sequence (this is especially
     * useful in combination with the option -sort).
     *   -return score: return a score per sequence, computed by summing
     * the scores of the matching patterns.
     *   -return ct:    same as '-return counts', except that it returns
     * the sum of matches in all the files of the sequence file list, instead
     * of the count within each separate file.
     *   -return table: return the count of pattern matches per sequence
     * in the form of a table.  (one line per sequence, one column per pattern)
     * -return colsum (together with -return table) prints an extra column
     * with the total occurrences per sequence
     *   -return rowsum (together with -return table) prints an extra row
     * with total occurrences per pattern
     *   -return total (together with -return table) prints an extra column
     * with the total occurrences per sequence and an extra row with total
     * occurrences per pattern.  (amounts to combine -colsum and -rowsum)
     * -return stats return matching statistics
     *   -return profiles return matching profiles with sliding windows.
     */
    public void set_return(java.lang.String _return) {
        this._return = _return;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DnaPatternRequest)) return false;
        DnaPatternRequest other = (DnaPatternRequest) obj;
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
            ((this.subst==null && other.getSubst()==null) || 
             (this.subst!=null &&
              this.subst.equals(other.getSubst()))) &&
            ((this.pattern==null && other.getPattern()==null) || 
             (this.pattern!=null &&
              this.pattern.equals(other.getPattern()))) &&
            ((this.pattern_file==null && other.getPattern_file()==null) || 
             (this.pattern_file!=null &&
              this.pattern_file.equals(other.getPattern_file()))) &&
            ((this.tmp_pattern_file==null && other.getTmp_pattern_file()==null) || 
             (this.tmp_pattern_file!=null &&
              this.tmp_pattern_file.equals(other.getTmp_pattern_file()))) &&
            ((this.id==null && other.getId()==null) || 
             (this.id!=null &&
              this.id.equals(other.getId()))) &&
            ((this.origin==null && other.getOrigin()==null) || 
             (this.origin!=null &&
              this.origin.equals(other.getOrigin()))) &&
            ((this.noov==null && other.getNoov()==null) || 
             (this.noov!=null &&
              this.noov.equals(other.getNoov()))) &&
            ((this.score==null && other.getScore()==null) || 
             (this.score!=null &&
              this.score.equals(other.getScore()))) &&
            ((this.str==null && other.getStr()==null) || 
             (this.str!=null &&
              this.str.equals(other.getStr()))) &&
            ((this.sort==null && other.getSort()==null) || 
             (this.sort!=null &&
              this.sort.equals(other.getSort()))) &&
            ((this.th==null && other.getTh()==null) || 
             (this.th!=null &&
              this.th.equals(other.getTh()))) &&
            ((this._return==null && other.get_return()==null) || 
             (this._return!=null &&
              this._return.equals(other.get_return())));
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
        if (getSubst() != null) {
            _hashCode += getSubst().hashCode();
        }
        if (getPattern() != null) {
            _hashCode += getPattern().hashCode();
        }
        if (getPattern_file() != null) {
            _hashCode += getPattern_file().hashCode();
        }
        if (getTmp_pattern_file() != null) {
            _hashCode += getTmp_pattern_file().hashCode();
        }
        if (getId() != null) {
            _hashCode += getId().hashCode();
        }
        if (getOrigin() != null) {
            _hashCode += getOrigin().hashCode();
        }
        if (getNoov() != null) {
            _hashCode += getNoov().hashCode();
        }
        if (getScore() != null) {
            _hashCode += getScore().hashCode();
        }
        if (getStr() != null) {
            _hashCode += getStr().hashCode();
        }
        if (getSort() != null) {
            _hashCode += getSort().hashCode();
        }
        if (getTh() != null) {
            _hashCode += getTh().hashCode();
        }
        if (get_return() != null) {
            _hashCode += get_return().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DnaPatternRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:RSATWS", "DnaPatternRequest"));
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
        elemField.setFieldName("subst");
        elemField.setXmlName(new javax.xml.namespace.QName("", "subst"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pattern");
        elemField.setXmlName(new javax.xml.namespace.QName("", "pattern"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pattern_file");
        elemField.setXmlName(new javax.xml.namespace.QName("", "pattern_file"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tmp_pattern_file");
        elemField.setXmlName(new javax.xml.namespace.QName("", "tmp_pattern_file"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("origin");
        elemField.setXmlName(new javax.xml.namespace.QName("", "origin"));
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
        elemField.setFieldName("score");
        elemField.setXmlName(new javax.xml.namespace.QName("", "score"));
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
        elemField.setFieldName("th");
        elemField.setXmlName(new javax.xml.namespace.QName("", "th"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("_return");
        elemField.setXmlName(new javax.xml.namespace.QName("", "return"));
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
