/**
 * GetOrthologsRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.3 Oct 05, 2005 (05:23:37 EDT) WSDL2Java emitter.
 */

package RSATWS;

public class GetOrthologsRequest  implements java.io.Serializable {
    /* Return type. Accepted values: 'server' (result is stored on
     * a file on the server), 'client' (result is directly transferred to
     * the client), or  'both'. 
     * 		Default is 'both'. */
    private java.lang.String output;

    /* Organism. Words need to be underscore separated (example: Escherichia_coli_K12). */
    private java.lang.String organism;

    /* Reference taxon. Orthologs are returned for each supported
     * organism belonging to the reference taxon. */
    private java.lang.String taxon;

    /* List of gene(s) for which you want to get orthologs. */
    private java.lang.String[] query;

    /* Get orthologs for all the genes of the query organism if value
     * = 1. This option is particularly convenient to extract phylogenetic
     * profiles. */
    private java.lang.Integer all;

    /* Disable the pre-filtering with grep if value = 1.This pre-filtering
     * accelerates the selection of hits, but some grep versions do not support
     * the -E option. If this is the case on your operating system, you can
     * still obtain the correct results by inactivating the grep filter. */
    private java.lang.Integer nogrep;

    /* Output field(s).
     * 
     *         By default, the output is a two-column file indicating the
     * ID of the
     *         gene identified as similar to the query gene, and the name
     * of the
     *         reference organism.
     * 
     *         The option -return can be used to specify additional output
     * fields.
     * 
     *         Supported fields:
     * 
     *             ref_id
     *                 ID of the reference (target) gene
     * 
     *             ref_organism
     *                 Name of the reference (target) organism
     * 
     *             query_id
     *                 ID of the query gene
     * 
     *             query_organism
     *                 Name of the query organism
     * 
     *             ident
     *                 Percent of identity (a number between 0 and 100)
     * 
     *             ali_len
     *                 Alignment lengths (in residues)
     * 
     *             mismat
     *                 Number of mismatches
     * 
     *             gap_open
     *                 Number of gap openings
     * 
     *             e_value
     *                 E-value (expected number of false positives)
     * 
     *             bit_sc
     *                 Bit score
     * 
     *             rank
     *                 Rank
     * 
     *             s_rank
     *                 Source rank (rank of the hit for the query organism).
     * 
     *         The option -return can be used iteratively on the same command
     * line
     *         to specify several output fields. Another way to specify multiple
     * output fields is to enter them separated by commas.
     * 
     *         Examples:
     * 
     *             -return query_id -return e_value -return rank
     * 
     *             -return query_id,e_value,rank */
    private java.lang.String _return;

    /* Lower threshold for dyad-analysis. Format: list of 'parameter
     * value'. */
    private java.lang.String[] lth;

    /* Upper threshold for dyad-analysis. Format: list of 'parameter
     * value'. */
    private java.lang.String[] uth;

    public GetOrthologsRequest() {
    }

    public GetOrthologsRequest(
           java.lang.String output,
           java.lang.String organism,
           java.lang.String taxon,
           java.lang.String[] query,
           java.lang.Integer all,
           java.lang.Integer nogrep,
           java.lang.String _return,
           java.lang.String[] lth,
           java.lang.String[] uth) {
           this.output = output;
           this.organism = organism;
           this.taxon = taxon;
           this.query = query;
           this.all = all;
           this.nogrep = nogrep;
           this._return = _return;
           this.lth = lth;
           this.uth = uth;
    }


    /**
     * Gets the output value for this GetOrthologsRequest.
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
     * Sets the output value for this GetOrthologsRequest.
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
     * Gets the organism value for this GetOrthologsRequest.
     * 
     * @return organism   * Organism. Words need to be underscore separated (example: Escherichia_coli_K12).
     */
    public java.lang.String getOrganism() {
        return organism;
    }


    /**
     * Sets the organism value for this GetOrthologsRequest.
     * 
     * @param organism   * Organism. Words need to be underscore separated (example: Escherichia_coli_K12).
     */
    public void setOrganism(java.lang.String organism) {
        this.organism = organism;
    }


    /**
     * Gets the taxon value for this GetOrthologsRequest.
     * 
     * @return taxon   * Reference taxon. Orthologs are returned for each supported
     * organism belonging to the reference taxon.
     */
    public java.lang.String getTaxon() {
        return taxon;
    }


    /**
     * Sets the taxon value for this GetOrthologsRequest.
     * 
     * @param taxon   * Reference taxon. Orthologs are returned for each supported
     * organism belonging to the reference taxon.
     */
    public void setTaxon(java.lang.String taxon) {
        this.taxon = taxon;
    }


    /**
     * Gets the query value for this GetOrthologsRequest.
     * 
     * @return query   * List of gene(s) for which you want to get orthologs.
     */
    public java.lang.String[] getQuery() {
        return query;
    }


    /**
     * Sets the query value for this GetOrthologsRequest.
     * 
     * @param query   * List of gene(s) for which you want to get orthologs.
     */
    public void setQuery(java.lang.String[] query) {
        this.query = query;
    }

    public java.lang.String getQuery(int i) {
        return this.query[i];
    }

    public void setQuery(int i, java.lang.String _value) {
        this.query[i] = _value;
    }


    /**
     * Gets the all value for this GetOrthologsRequest.
     * 
     * @return all   * Get orthologs for all the genes of the query organism if value
     * = 1. This option is particularly convenient to extract phylogenetic
     * profiles.
     */
    public java.lang.Integer getAll() {
        return all;
    }


    /**
     * Sets the all value for this GetOrthologsRequest.
     * 
     * @param all   * Get orthologs for all the genes of the query organism if value
     * = 1. This option is particularly convenient to extract phylogenetic
     * profiles.
     */
    public void setAll(java.lang.Integer all) {
        this.all = all;
    }


    /**
     * Gets the nogrep value for this GetOrthologsRequest.
     * 
     * @return nogrep   * Disable the pre-filtering with grep if value = 1.This pre-filtering
     * accelerates the selection of hits, but some grep versions do not support
     * the -E option. If this is the case on your operating system, you can
     * still obtain the correct results by inactivating the grep filter.
     */
    public java.lang.Integer getNogrep() {
        return nogrep;
    }


    /**
     * Sets the nogrep value for this GetOrthologsRequest.
     * 
     * @param nogrep   * Disable the pre-filtering with grep if value = 1.This pre-filtering
     * accelerates the selection of hits, but some grep versions do not support
     * the -E option. If this is the case on your operating system, you can
     * still obtain the correct results by inactivating the grep filter.
     */
    public void setNogrep(java.lang.Integer nogrep) {
        this.nogrep = nogrep;
    }


    /**
     * Gets the _return value for this GetOrthologsRequest.
     * 
     * @return _return   * Output field(s).
     * 
     *         By default, the output is a two-column file indicating the
     * ID of the
     *         gene identified as similar to the query gene, and the name
     * of the
     *         reference organism.
     * 
     *         The option -return can be used to specify additional output
     * fields.
     * 
     *         Supported fields:
     * 
     *             ref_id
     *                 ID of the reference (target) gene
     * 
     *             ref_organism
     *                 Name of the reference (target) organism
     * 
     *             query_id
     *                 ID of the query gene
     * 
     *             query_organism
     *                 Name of the query organism
     * 
     *             ident
     *                 Percent of identity (a number between 0 and 100)
     * 
     *             ali_len
     *                 Alignment lengths (in residues)
     * 
     *             mismat
     *                 Number of mismatches
     * 
     *             gap_open
     *                 Number of gap openings
     * 
     *             e_value
     *                 E-value (expected number of false positives)
     * 
     *             bit_sc
     *                 Bit score
     * 
     *             rank
     *                 Rank
     * 
     *             s_rank
     *                 Source rank (rank of the hit for the query organism).
     * 
     *         The option -return can be used iteratively on the same command
     * line
     *         to specify several output fields. Another way to specify multiple
     * output fields is to enter them separated by commas.
     * 
     *         Examples:
     * 
     *             -return query_id -return e_value -return rank
     * 
     *             -return query_id,e_value,rank
     */
    public java.lang.String get_return() {
        return _return;
    }


    /**
     * Sets the _return value for this GetOrthologsRequest.
     * 
     * @param _return   * Output field(s).
     * 
     *         By default, the output is a two-column file indicating the
     * ID of the
     *         gene identified as similar to the query gene, and the name
     * of the
     *         reference organism.
     * 
     *         The option -return can be used to specify additional output
     * fields.
     * 
     *         Supported fields:
     * 
     *             ref_id
     *                 ID of the reference (target) gene
     * 
     *             ref_organism
     *                 Name of the reference (target) organism
     * 
     *             query_id
     *                 ID of the query gene
     * 
     *             query_organism
     *                 Name of the query organism
     * 
     *             ident
     *                 Percent of identity (a number between 0 and 100)
     * 
     *             ali_len
     *                 Alignment lengths (in residues)
     * 
     *             mismat
     *                 Number of mismatches
     * 
     *             gap_open
     *                 Number of gap openings
     * 
     *             e_value
     *                 E-value (expected number of false positives)
     * 
     *             bit_sc
     *                 Bit score
     * 
     *             rank
     *                 Rank
     * 
     *             s_rank
     *                 Source rank (rank of the hit for the query organism).
     * 
     *         The option -return can be used iteratively on the same command
     * line
     *         to specify several output fields. Another way to specify multiple
     * output fields is to enter them separated by commas.
     * 
     *         Examples:
     * 
     *             -return query_id -return e_value -return rank
     * 
     *             -return query_id,e_value,rank
     */
    public void set_return(java.lang.String _return) {
        this._return = _return;
    }


    /**
     * Gets the lth value for this GetOrthologsRequest.
     * 
     * @return lth   * Lower threshold for dyad-analysis. Format: list of 'parameter
     * value'.
     */
    public java.lang.String[] getLth() {
        return lth;
    }


    /**
     * Sets the lth value for this GetOrthologsRequest.
     * 
     * @param lth   * Lower threshold for dyad-analysis. Format: list of 'parameter
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
     * Gets the uth value for this GetOrthologsRequest.
     * 
     * @return uth   * Upper threshold for dyad-analysis. Format: list of 'parameter
     * value'.
     */
    public java.lang.String[] getUth() {
        return uth;
    }


    /**
     * Sets the uth value for this GetOrthologsRequest.
     * 
     * @param uth   * Upper threshold for dyad-analysis. Format: list of 'parameter
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
        if (!(obj instanceof GetOrthologsRequest)) return false;
        GetOrthologsRequest other = (GetOrthologsRequest) obj;
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
            ((this.organism==null && other.getOrganism()==null) || 
             (this.organism!=null &&
              this.organism.equals(other.getOrganism()))) &&
            ((this.taxon==null && other.getTaxon()==null) || 
             (this.taxon!=null &&
              this.taxon.equals(other.getTaxon()))) &&
            ((this.query==null && other.getQuery()==null) || 
             (this.query!=null &&
              java.util.Arrays.equals(this.query, other.getQuery()))) &&
            ((this.all==null && other.getAll()==null) || 
             (this.all!=null &&
              this.all.equals(other.getAll()))) &&
            ((this.nogrep==null && other.getNogrep()==null) || 
             (this.nogrep!=null &&
              this.nogrep.equals(other.getNogrep()))) &&
            ((this._return==null && other.get_return()==null) || 
             (this._return!=null &&
              this._return.equals(other.get_return()))) &&
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
        if (getOrganism() != null) {
            _hashCode += getOrganism().hashCode();
        }
        if (getTaxon() != null) {
            _hashCode += getTaxon().hashCode();
        }
        if (getQuery() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getQuery());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getQuery(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getAll() != null) {
            _hashCode += getAll().hashCode();
        }
        if (getNogrep() != null) {
            _hashCode += getNogrep().hashCode();
        }
        if (get_return() != null) {
            _hashCode += get_return().hashCode();
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
        new org.apache.axis.description.TypeDesc(GetOrthologsRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:RSATWS", "GetOrthologsRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("output");
        elemField.setXmlName(new javax.xml.namespace.QName("", "output"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("organism");
        elemField.setXmlName(new javax.xml.namespace.QName("", "organism"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taxon");
        elemField.setXmlName(new javax.xml.namespace.QName("", "taxon"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("query");
        elemField.setXmlName(new javax.xml.namespace.QName("", "query"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("all");
        elemField.setXmlName(new javax.xml.namespace.QName("", "all"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nogrep");
        elemField.setXmlName(new javax.xml.namespace.QName("", "nogrep"));
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
