/**
 * RetrieveSequenceMultigenomeRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.3 Oct 05, 2005 (05:23:37 EDT) WSDL2Java emitter.
 */

package RSATWS;


/**
 * Parameters for the operation retrieve_seq_multigenome.
 */
public class RetrieveSequenceMultigenomeRequest  implements java.io.Serializable {
    /* Return type. Accepted values: 'server' (result is stored on
     * a file on the server), 'client' (result is directly transferred to
     * the client), or  'both'. 
     * Default is 'both'. */
    private java.lang.String output;

    /* The input file is a tab-delimited text files with (at least)
     * the two
     *     following columns:
     * 
     *     1. gene ID or name
     *       Identifier oor synonyms are supported.
     * 
     *     2. Organism name
     *       For the organism name, spaces must be replaced by underscore
     * character
     *       (exactly as for retrieve-seq).
     * 
     *     If additional columns are included in the input file, they are
     * ignored. */
    private java.lang.String input;

    /* Input file on the server. */
    private java.lang.String tmp_input_file;

    /* Return sequences for all the genes of the organism if value
     * = 1. Incompatible with query. */
    private java.lang.Integer all;

    /* Prevent overlap with upstream open reading frames (ORF) if
     * value = 1. */
    private java.lang.Integer noorf;

    /* Inferior limit of the region to retrieve. Default is organism
     * dependant (example: Saccharomyces cerevisiae = -800). */
    private java.lang.Integer from;

    /* Superior limit of the region to retrieve. Default is '-1'. */
    private java.lang.Integer to;

    /* Type of genome features to load. Supported: CDS, mRNA, tRNA,
     * rRNA. */
    private java.lang.String feattype;

    /* Sequence type. Supported: upstream, downstream, ORF (unspliced
     * open reading frame). */
    private java.lang.String type;

    /* Sequence format. Supported: IG (Intelligenetics), WC (wconsensus),
     * raw, FastA */
    private java.lang.String format;

    /* Line width (0 for whole sequence on one line). */
    private java.lang.Integer lw;

    /* Field(s) to be used in the sequence label. Multiple fields
     * can be specified, separated by commas. 
     * Supported: id, name, organism_name, sequence_type, current_from, current_to,
     * ctg, orf_strand, reg_left, reg_right. 
     * Default: name. */
    private java.lang.String label;

    /* Separator between the label fields. Default: | (pipe character). */
    private java.lang.String label_sep;

    /* No comments if value = 1. Only the identifier and the sequence
     * are returned. 
     * By default, the comment indicates the ORF and upstream sequence coordinates. */
    private java.lang.Integer nocom;

    /* Use the repeat masked version of the genome if value = 1. Attention:
     * repeated regions are annotated for some genomes only. */
    private java.lang.Integer repeat;

    /* Admit imprecise positions if value = 1. */
    private java.lang.Integer imp_pos;

    /* Number of the column containing the gene names/identifiers
     * (default: 1). */
    private java.lang.Integer gene_col;

    /* Number of the column containing the organisms (default: 2). */
    private java.lang.Integer org_col;

    public RetrieveSequenceMultigenomeRequest() {
    }

    public RetrieveSequenceMultigenomeRequest(
           java.lang.String output,
           java.lang.String input,
           java.lang.String tmp_input_file,
           java.lang.Integer all,
           java.lang.Integer noorf,
           java.lang.Integer from,
           java.lang.Integer to,
           java.lang.String feattype,
           java.lang.String type,
           java.lang.String format,
           java.lang.Integer lw,
           java.lang.String label,
           java.lang.String label_sep,
           java.lang.Integer nocom,
           java.lang.Integer repeat,
           java.lang.Integer imp_pos,
           java.lang.Integer gene_col,
           java.lang.Integer org_col) {
           this.output = output;
           this.input = input;
           this.tmp_input_file = tmp_input_file;
           this.all = all;
           this.noorf = noorf;
           this.from = from;
           this.to = to;
           this.feattype = feattype;
           this.type = type;
           this.format = format;
           this.lw = lw;
           this.label = label;
           this.label_sep = label_sep;
           this.nocom = nocom;
           this.repeat = repeat;
           this.imp_pos = imp_pos;
           this.gene_col = gene_col;
           this.org_col = org_col;
    }


    /**
     * Gets the output value for this RetrieveSequenceMultigenomeRequest.
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
     * Sets the output value for this RetrieveSequenceMultigenomeRequest.
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
     * Gets the input value for this RetrieveSequenceMultigenomeRequest.
     * 
     * @return input   * The input file is a tab-delimited text files with (at least)
     * the two
     *     following columns:
     * 
     *     1. gene ID or name
     *       Identifier oor synonyms are supported.
     * 
     *     2. Organism name
     *       For the organism name, spaces must be replaced by underscore
     * character
     *       (exactly as for retrieve-seq).
     * 
     *     If additional columns are included in the input file, they are
     * ignored.
     */
    public java.lang.String getInput() {
        return input;
    }


    /**
     * Sets the input value for this RetrieveSequenceMultigenomeRequest.
     * 
     * @param input   * The input file is a tab-delimited text files with (at least)
     * the two
     *     following columns:
     * 
     *     1. gene ID or name
     *       Identifier oor synonyms are supported.
     * 
     *     2. Organism name
     *       For the organism name, spaces must be replaced by underscore
     * character
     *       (exactly as for retrieve-seq).
     * 
     *     If additional columns are included in the input file, they are
     * ignored.
     */
    public void setInput(java.lang.String input) {
        this.input = input;
    }


    /**
     * Gets the tmp_input_file value for this RetrieveSequenceMultigenomeRequest.
     * 
     * @return tmp_input_file   * Input file on the server.
     */
    public java.lang.String getTmp_input_file() {
        return tmp_input_file;
    }


    /**
     * Sets the tmp_input_file value for this RetrieveSequenceMultigenomeRequest.
     * 
     * @param tmp_input_file   * Input file on the server.
     */
    public void setTmp_input_file(java.lang.String tmp_input_file) {
        this.tmp_input_file = tmp_input_file;
    }


    /**
     * Gets the all value for this RetrieveSequenceMultigenomeRequest.
     * 
     * @return all   * Return sequences for all the genes of the organism if value
     * = 1. Incompatible with query.
     */
    public java.lang.Integer getAll() {
        return all;
    }


    /**
     * Sets the all value for this RetrieveSequenceMultigenomeRequest.
     * 
     * @param all   * Return sequences for all the genes of the organism if value
     * = 1. Incompatible with query.
     */
    public void setAll(java.lang.Integer all) {
        this.all = all;
    }


    /**
     * Gets the noorf value for this RetrieveSequenceMultigenomeRequest.
     * 
     * @return noorf   * Prevent overlap with upstream open reading frames (ORF) if
     * value = 1.
     */
    public java.lang.Integer getNoorf() {
        return noorf;
    }


    /**
     * Sets the noorf value for this RetrieveSequenceMultigenomeRequest.
     * 
     * @param noorf   * Prevent overlap with upstream open reading frames (ORF) if
     * value = 1.
     */
    public void setNoorf(java.lang.Integer noorf) {
        this.noorf = noorf;
    }


    /**
     * Gets the from value for this RetrieveSequenceMultigenomeRequest.
     * 
     * @return from   * Inferior limit of the region to retrieve. Default is organism
     * dependant (example: Saccharomyces cerevisiae = -800).
     */
    public java.lang.Integer getFrom() {
        return from;
    }


    /**
     * Sets the from value for this RetrieveSequenceMultigenomeRequest.
     * 
     * @param from   * Inferior limit of the region to retrieve. Default is organism
     * dependant (example: Saccharomyces cerevisiae = -800).
     */
    public void setFrom(java.lang.Integer from) {
        this.from = from;
    }


    /**
     * Gets the to value for this RetrieveSequenceMultigenomeRequest.
     * 
     * @return to   * Superior limit of the region to retrieve. Default is '-1'.
     */
    public java.lang.Integer getTo() {
        return to;
    }


    /**
     * Sets the to value for this RetrieveSequenceMultigenomeRequest.
     * 
     * @param to   * Superior limit of the region to retrieve. Default is '-1'.
     */
    public void setTo(java.lang.Integer to) {
        this.to = to;
    }


    /**
     * Gets the feattype value for this RetrieveSequenceMultigenomeRequest.
     * 
     * @return feattype   * Type of genome features to load. Supported: CDS, mRNA, tRNA,
     * rRNA.
     */
    public java.lang.String getFeattype() {
        return feattype;
    }


    /**
     * Sets the feattype value for this RetrieveSequenceMultigenomeRequest.
     * 
     * @param feattype   * Type of genome features to load. Supported: CDS, mRNA, tRNA,
     * rRNA.
     */
    public void setFeattype(java.lang.String feattype) {
        this.feattype = feattype;
    }


    /**
     * Gets the type value for this RetrieveSequenceMultigenomeRequest.
     * 
     * @return type   * Sequence type. Supported: upstream, downstream, ORF (unspliced
     * open reading frame).
     */
    public java.lang.String getType() {
        return type;
    }


    /**
     * Sets the type value for this RetrieveSequenceMultigenomeRequest.
     * 
     * @param type   * Sequence type. Supported: upstream, downstream, ORF (unspliced
     * open reading frame).
     */
    public void setType(java.lang.String type) {
        this.type = type;
    }


    /**
     * Gets the format value for this RetrieveSequenceMultigenomeRequest.
     * 
     * @return format   * Sequence format. Supported: IG (Intelligenetics), WC (wconsensus),
     * raw, FastA
     */
    public java.lang.String getFormat() {
        return format;
    }


    /**
     * Sets the format value for this RetrieveSequenceMultigenomeRequest.
     * 
     * @param format   * Sequence format. Supported: IG (Intelligenetics), WC (wconsensus),
     * raw, FastA
     */
    public void setFormat(java.lang.String format) {
        this.format = format;
    }


    /**
     * Gets the lw value for this RetrieveSequenceMultigenomeRequest.
     * 
     * @return lw   * Line width (0 for whole sequence on one line).
     */
    public java.lang.Integer getLw() {
        return lw;
    }


    /**
     * Sets the lw value for this RetrieveSequenceMultigenomeRequest.
     * 
     * @param lw   * Line width (0 for whole sequence on one line).
     */
    public void setLw(java.lang.Integer lw) {
        this.lw = lw;
    }


    /**
     * Gets the label value for this RetrieveSequenceMultigenomeRequest.
     * 
     * @return label   * Field(s) to be used in the sequence label. Multiple fields
     * can be specified, separated by commas. 
     * Supported: id, name, organism_name, sequence_type, current_from, current_to,
     * ctg, orf_strand, reg_left, reg_right. 
     * Default: name.
     */
    public java.lang.String getLabel() {
        return label;
    }


    /**
     * Sets the label value for this RetrieveSequenceMultigenomeRequest.
     * 
     * @param label   * Field(s) to be used in the sequence label. Multiple fields
     * can be specified, separated by commas. 
     * Supported: id, name, organism_name, sequence_type, current_from, current_to,
     * ctg, orf_strand, reg_left, reg_right. 
     * Default: name.
     */
    public void setLabel(java.lang.String label) {
        this.label = label;
    }


    /**
     * Gets the label_sep value for this RetrieveSequenceMultigenomeRequest.
     * 
     * @return label_sep   * Separator between the label fields. Default: | (pipe character).
     */
    public java.lang.String getLabel_sep() {
        return label_sep;
    }


    /**
     * Sets the label_sep value for this RetrieveSequenceMultigenomeRequest.
     * 
     * @param label_sep   * Separator between the label fields. Default: | (pipe character).
     */
    public void setLabel_sep(java.lang.String label_sep) {
        this.label_sep = label_sep;
    }


    /**
     * Gets the nocom value for this RetrieveSequenceMultigenomeRequest.
     * 
     * @return nocom   * No comments if value = 1. Only the identifier and the sequence
     * are returned. 
     * By default, the comment indicates the ORF and upstream sequence coordinates.
     */
    public java.lang.Integer getNocom() {
        return nocom;
    }


    /**
     * Sets the nocom value for this RetrieveSequenceMultigenomeRequest.
     * 
     * @param nocom   * No comments if value = 1. Only the identifier and the sequence
     * are returned. 
     * By default, the comment indicates the ORF and upstream sequence coordinates.
     */
    public void setNocom(java.lang.Integer nocom) {
        this.nocom = nocom;
    }


    /**
     * Gets the repeat value for this RetrieveSequenceMultigenomeRequest.
     * 
     * @return repeat   * Use the repeat masked version of the genome if value = 1. Attention:
     * repeated regions are annotated for some genomes only.
     */
    public java.lang.Integer getRepeat() {
        return repeat;
    }


    /**
     * Sets the repeat value for this RetrieveSequenceMultigenomeRequest.
     * 
     * @param repeat   * Use the repeat masked version of the genome if value = 1. Attention:
     * repeated regions are annotated for some genomes only.
     */
    public void setRepeat(java.lang.Integer repeat) {
        this.repeat = repeat;
    }


    /**
     * Gets the imp_pos value for this RetrieveSequenceMultigenomeRequest.
     * 
     * @return imp_pos   * Admit imprecise positions if value = 1.
     */
    public java.lang.Integer getImp_pos() {
        return imp_pos;
    }


    /**
     * Sets the imp_pos value for this RetrieveSequenceMultigenomeRequest.
     * 
     * @param imp_pos   * Admit imprecise positions if value = 1.
     */
    public void setImp_pos(java.lang.Integer imp_pos) {
        this.imp_pos = imp_pos;
    }


    /**
     * Gets the gene_col value for this RetrieveSequenceMultigenomeRequest.
     * 
     * @return gene_col   * Number of the column containing the gene names/identifiers
     * (default: 1).
     */
    public java.lang.Integer getGene_col() {
        return gene_col;
    }


    /**
     * Sets the gene_col value for this RetrieveSequenceMultigenomeRequest.
     * 
     * @param gene_col   * Number of the column containing the gene names/identifiers
     * (default: 1).
     */
    public void setGene_col(java.lang.Integer gene_col) {
        this.gene_col = gene_col;
    }


    /**
     * Gets the org_col value for this RetrieveSequenceMultigenomeRequest.
     * 
     * @return org_col   * Number of the column containing the organisms (default: 2).
     */
    public java.lang.Integer getOrg_col() {
        return org_col;
    }


    /**
     * Sets the org_col value for this RetrieveSequenceMultigenomeRequest.
     * 
     * @param org_col   * Number of the column containing the organisms (default: 2).
     */
    public void setOrg_col(java.lang.Integer org_col) {
        this.org_col = org_col;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RetrieveSequenceMultigenomeRequest)) return false;
        RetrieveSequenceMultigenomeRequest other = (RetrieveSequenceMultigenomeRequest) obj;
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
            ((this.tmp_input_file==null && other.getTmp_input_file()==null) || 
             (this.tmp_input_file!=null &&
              this.tmp_input_file.equals(other.getTmp_input_file()))) &&
            ((this.all==null && other.getAll()==null) || 
             (this.all!=null &&
              this.all.equals(other.getAll()))) &&
            ((this.noorf==null && other.getNoorf()==null) || 
             (this.noorf!=null &&
              this.noorf.equals(other.getNoorf()))) &&
            ((this.from==null && other.getFrom()==null) || 
             (this.from!=null &&
              this.from.equals(other.getFrom()))) &&
            ((this.to==null && other.getTo()==null) || 
             (this.to!=null &&
              this.to.equals(other.getTo()))) &&
            ((this.feattype==null && other.getFeattype()==null) || 
             (this.feattype!=null &&
              this.feattype.equals(other.getFeattype()))) &&
            ((this.type==null && other.getType()==null) || 
             (this.type!=null &&
              this.type.equals(other.getType()))) &&
            ((this.format==null && other.getFormat()==null) || 
             (this.format!=null &&
              this.format.equals(other.getFormat()))) &&
            ((this.lw==null && other.getLw()==null) || 
             (this.lw!=null &&
              this.lw.equals(other.getLw()))) &&
            ((this.label==null && other.getLabel()==null) || 
             (this.label!=null &&
              this.label.equals(other.getLabel()))) &&
            ((this.label_sep==null && other.getLabel_sep()==null) || 
             (this.label_sep!=null &&
              this.label_sep.equals(other.getLabel_sep()))) &&
            ((this.nocom==null && other.getNocom()==null) || 
             (this.nocom!=null &&
              this.nocom.equals(other.getNocom()))) &&
            ((this.repeat==null && other.getRepeat()==null) || 
             (this.repeat!=null &&
              this.repeat.equals(other.getRepeat()))) &&
            ((this.imp_pos==null && other.getImp_pos()==null) || 
             (this.imp_pos!=null &&
              this.imp_pos.equals(other.getImp_pos()))) &&
            ((this.gene_col==null && other.getGene_col()==null) || 
             (this.gene_col!=null &&
              this.gene_col.equals(other.getGene_col()))) &&
            ((this.org_col==null && other.getOrg_col()==null) || 
             (this.org_col!=null &&
              this.org_col.equals(other.getOrg_col())));
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
        if (getTmp_input_file() != null) {
            _hashCode += getTmp_input_file().hashCode();
        }
        if (getAll() != null) {
            _hashCode += getAll().hashCode();
        }
        if (getNoorf() != null) {
            _hashCode += getNoorf().hashCode();
        }
        if (getFrom() != null) {
            _hashCode += getFrom().hashCode();
        }
        if (getTo() != null) {
            _hashCode += getTo().hashCode();
        }
        if (getFeattype() != null) {
            _hashCode += getFeattype().hashCode();
        }
        if (getType() != null) {
            _hashCode += getType().hashCode();
        }
        if (getFormat() != null) {
            _hashCode += getFormat().hashCode();
        }
        if (getLw() != null) {
            _hashCode += getLw().hashCode();
        }
        if (getLabel() != null) {
            _hashCode += getLabel().hashCode();
        }
        if (getLabel_sep() != null) {
            _hashCode += getLabel_sep().hashCode();
        }
        if (getNocom() != null) {
            _hashCode += getNocom().hashCode();
        }
        if (getRepeat() != null) {
            _hashCode += getRepeat().hashCode();
        }
        if (getImp_pos() != null) {
            _hashCode += getImp_pos().hashCode();
        }
        if (getGene_col() != null) {
            _hashCode += getGene_col().hashCode();
        }
        if (getOrg_col() != null) {
            _hashCode += getOrg_col().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RetrieveSequenceMultigenomeRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:RSATWS", "RetrieveSequenceMultigenomeRequest"));
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
        elemField.setFieldName("tmp_input_file");
        elemField.setXmlName(new javax.xml.namespace.QName("", "tmp_input_file"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("all");
        elemField.setXmlName(new javax.xml.namespace.QName("", "all"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("noorf");
        elemField.setXmlName(new javax.xml.namespace.QName("", "noorf"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("from");
        elemField.setXmlName(new javax.xml.namespace.QName("", "from"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("to");
        elemField.setXmlName(new javax.xml.namespace.QName("", "to"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("feattype");
        elemField.setXmlName(new javax.xml.namespace.QName("", "feattype"));
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
        elemField.setFieldName("format");
        elemField.setXmlName(new javax.xml.namespace.QName("", "format"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lw");
        elemField.setXmlName(new javax.xml.namespace.QName("", "lw"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("label");
        elemField.setXmlName(new javax.xml.namespace.QName("", "label"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("label_sep");
        elemField.setXmlName(new javax.xml.namespace.QName("", "label_sep"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nocom");
        elemField.setXmlName(new javax.xml.namespace.QName("", "nocom"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("repeat");
        elemField.setXmlName(new javax.xml.namespace.QName("", "repeat"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("imp_pos");
        elemField.setXmlName(new javax.xml.namespace.QName("", "imp_pos"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("gene_col");
        elemField.setXmlName(new javax.xml.namespace.QName("", "gene_col"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("org_col");
        elemField.setXmlName(new javax.xml.namespace.QName("", "org_col"));
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
