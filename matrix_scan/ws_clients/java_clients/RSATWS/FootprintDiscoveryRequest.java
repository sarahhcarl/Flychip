/**
 * FootprintDiscoveryRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.3 Oct 05, 2005 (05:23:37 EDT) WSDL2Java emitter.
 */

package RSATWS;

public class FootprintDiscoveryRequest  implements java.io.Serializable {
    /* Return type. Accepted values: 'server' (result is stored on
     * a file on the server), 'client' (result is directly transferred to
     * the client), or  'both'. 
     * 		Default is 'both'. */
    private java.lang.String output;

    /* Level of detail for comments */
    private java.lang.Integer verbosity;

    /* A list of genes (one by line). */
    private java.lang.String genes;

    /* Name of the file with a list of genes on the server. You need
     * to supply either this parameter or the previous one (genes). */
    private java.lang.String tmp_infile;

    /* Automatically analyze all the genes of a query genome, and
     * store each result in a separate folder (the folder name is defined
     * automatically). */
    private java.lang.Integer all_genes;

    /* Maximum number of genes to analyze. */
    private java.lang.Integer max_genes;

    /* Prefix for the output files. If the prefix is 	not specified,
     * the program can guess a default prefix, but this is working only if
     * there is a single query gene or query file. */
    private java.lang.String output_prefix;

    /* A list of genes (referenced array). */
    private java.lang.String query;

    /* Search footprints for each query gene separately. The results
     * arestored in a separate folder for each	gene. The folder name is defined
     * automatically. */
    private java.lang.Integer sep_genes;

    /* Query organism, to which the query genes belong. */
    private java.lang.String organism;

    /* Reference taxon, in which orthologous genes have to be collected. */
    private java.lang.String taxon;

    /* Generate an HTML index with links to the result files. This
     * option is used for the web interface, but can also be convenient to
     * index results, especially when several genes or taxa are analyzed
     * (options -genes, -all_genes, -all_taxa). */
    private java.lang.Integer index;

    /* Lower threshold on some parameters. Format: parameter value. */
    private java.lang.String[] lth;

    /* Upper threshold on some parameters. Format: parameter value. */
    private java.lang.String[] uth;

    /* Return fields for dyad-analysis. See dyad_analysis for a list */
    private java.lang.String _return;

    /* Convert assembled patterns into position-specific scoring matrices
     * (PSSM). Caution ! This conversion can take time if the sequence set
     * is large and if there are many assemblies. */
    private java.lang.Integer to_matrix;

    /* Allow the user to choose among alternative background model.
     * taxfreq
     *                                       Taxon-wide background model,
     * computed by counting dyad frequencies in all the promoters of all
     * the genes of the reference taxon.
     *                                    monads
     *                                       Expected dyad frequencies are
     * the product of monad frequencies observed in the input sequences. */
    private java.lang.String bg_model;

    /* Accept all dyads, even if they are not found in the promoter
     * of the query gene, in the query organism. */
    private java.lang.Integer no_filter;

    /* Infer operons in order to retrieve the	promoters of the predicted
     * operon leader genes rather than those located immediately upstream
     * of the orthologs. This method uses a threshold on the intergenic distance. */
    private java.lang.Integer infer_operons;

    /* Specify here the intergenic distance threshold in base pairs.
     * Pair of adjacent genes with intergenic distance equal or less than
     * this value are predicted to be within operon. (default : 55). */
    private java.lang.Integer dist_thr;

    public FootprintDiscoveryRequest() {
    }

    public FootprintDiscoveryRequest(
           java.lang.String output,
           java.lang.Integer verbosity,
           java.lang.String genes,
           java.lang.String tmp_infile,
           java.lang.Integer all_genes,
           java.lang.Integer max_genes,
           java.lang.String output_prefix,
           java.lang.String query,
           java.lang.Integer sep_genes,
           java.lang.String organism,
           java.lang.String taxon,
           java.lang.Integer index,
           java.lang.String[] lth,
           java.lang.String[] uth,
           java.lang.String _return,
           java.lang.Integer to_matrix,
           java.lang.String bg_model,
           java.lang.Integer no_filter,
           java.lang.Integer infer_operons,
           java.lang.Integer dist_thr) {
           this.output = output;
           this.verbosity = verbosity;
           this.genes = genes;
           this.tmp_infile = tmp_infile;
           this.all_genes = all_genes;
           this.max_genes = max_genes;
           this.output_prefix = output_prefix;
           this.query = query;
           this.sep_genes = sep_genes;
           this.organism = organism;
           this.taxon = taxon;
           this.index = index;
           this.lth = lth;
           this.uth = uth;
           this._return = _return;
           this.to_matrix = to_matrix;
           this.bg_model = bg_model;
           this.no_filter = no_filter;
           this.infer_operons = infer_operons;
           this.dist_thr = dist_thr;
    }


    /**
     * Gets the output value for this FootprintDiscoveryRequest.
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
     * Sets the output value for this FootprintDiscoveryRequest.
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
     * Gets the verbosity value for this FootprintDiscoveryRequest.
     * 
     * @return verbosity   * Level of detail for comments
     */
    public java.lang.Integer getVerbosity() {
        return verbosity;
    }


    /**
     * Sets the verbosity value for this FootprintDiscoveryRequest.
     * 
     * @param verbosity   * Level of detail for comments
     */
    public void setVerbosity(java.lang.Integer verbosity) {
        this.verbosity = verbosity;
    }


    /**
     * Gets the genes value for this FootprintDiscoveryRequest.
     * 
     * @return genes   * A list of genes (one by line).
     */
    public java.lang.String getGenes() {
        return genes;
    }


    /**
     * Sets the genes value for this FootprintDiscoveryRequest.
     * 
     * @param genes   * A list of genes (one by line).
     */
    public void setGenes(java.lang.String genes) {
        this.genes = genes;
    }


    /**
     * Gets the tmp_infile value for this FootprintDiscoveryRequest.
     * 
     * @return tmp_infile   * Name of the file with a list of genes on the server. You need
     * to supply either this parameter or the previous one (genes).
     */
    public java.lang.String getTmp_infile() {
        return tmp_infile;
    }


    /**
     * Sets the tmp_infile value for this FootprintDiscoveryRequest.
     * 
     * @param tmp_infile   * Name of the file with a list of genes on the server. You need
     * to supply either this parameter or the previous one (genes).
     */
    public void setTmp_infile(java.lang.String tmp_infile) {
        this.tmp_infile = tmp_infile;
    }


    /**
     * Gets the all_genes value for this FootprintDiscoveryRequest.
     * 
     * @return all_genes   * Automatically analyze all the genes of a query genome, and
     * store each result in a separate folder (the folder name is defined
     * automatically).
     */
    public java.lang.Integer getAll_genes() {
        return all_genes;
    }


    /**
     * Sets the all_genes value for this FootprintDiscoveryRequest.
     * 
     * @param all_genes   * Automatically analyze all the genes of a query genome, and
     * store each result in a separate folder (the folder name is defined
     * automatically).
     */
    public void setAll_genes(java.lang.Integer all_genes) {
        this.all_genes = all_genes;
    }


    /**
     * Gets the max_genes value for this FootprintDiscoveryRequest.
     * 
     * @return max_genes   * Maximum number of genes to analyze.
     */
    public java.lang.Integer getMax_genes() {
        return max_genes;
    }


    /**
     * Sets the max_genes value for this FootprintDiscoveryRequest.
     * 
     * @param max_genes   * Maximum number of genes to analyze.
     */
    public void setMax_genes(java.lang.Integer max_genes) {
        this.max_genes = max_genes;
    }


    /**
     * Gets the output_prefix value for this FootprintDiscoveryRequest.
     * 
     * @return output_prefix   * Prefix for the output files. If the prefix is 	not specified,
     * the program can guess a default prefix, but this is working only if
     * there is a single query gene or query file.
     */
    public java.lang.String getOutput_prefix() {
        return output_prefix;
    }


    /**
     * Sets the output_prefix value for this FootprintDiscoveryRequest.
     * 
     * @param output_prefix   * Prefix for the output files. If the prefix is 	not specified,
     * the program can guess a default prefix, but this is working only if
     * there is a single query gene or query file.
     */
    public void setOutput_prefix(java.lang.String output_prefix) {
        this.output_prefix = output_prefix;
    }


    /**
     * Gets the query value for this FootprintDiscoveryRequest.
     * 
     * @return query   * A list of genes (referenced array).
     */
    public java.lang.String getQuery() {
        return query;
    }


    /**
     * Sets the query value for this FootprintDiscoveryRequest.
     * 
     * @param query   * A list of genes (referenced array).
     */
    public void setQuery(java.lang.String query) {
        this.query = query;
    }


    /**
     * Gets the sep_genes value for this FootprintDiscoveryRequest.
     * 
     * @return sep_genes   * Search footprints for each query gene separately. The results
     * arestored in a separate folder for each	gene. The folder name is defined
     * automatically.
     */
    public java.lang.Integer getSep_genes() {
        return sep_genes;
    }


    /**
     * Sets the sep_genes value for this FootprintDiscoveryRequest.
     * 
     * @param sep_genes   * Search footprints for each query gene separately. The results
     * arestored in a separate folder for each	gene. The folder name is defined
     * automatically.
     */
    public void setSep_genes(java.lang.Integer sep_genes) {
        this.sep_genes = sep_genes;
    }


    /**
     * Gets the organism value for this FootprintDiscoveryRequest.
     * 
     * @return organism   * Query organism, to which the query genes belong.
     */
    public java.lang.String getOrganism() {
        return organism;
    }


    /**
     * Sets the organism value for this FootprintDiscoveryRequest.
     * 
     * @param organism   * Query organism, to which the query genes belong.
     */
    public void setOrganism(java.lang.String organism) {
        this.organism = organism;
    }


    /**
     * Gets the taxon value for this FootprintDiscoveryRequest.
     * 
     * @return taxon   * Reference taxon, in which orthologous genes have to be collected.
     */
    public java.lang.String getTaxon() {
        return taxon;
    }


    /**
     * Sets the taxon value for this FootprintDiscoveryRequest.
     * 
     * @param taxon   * Reference taxon, in which orthologous genes have to be collected.
     */
    public void setTaxon(java.lang.String taxon) {
        this.taxon = taxon;
    }


    /**
     * Gets the index value for this FootprintDiscoveryRequest.
     * 
     * @return index   * Generate an HTML index with links to the result files. This
     * option is used for the web interface, but can also be convenient to
     * index results, especially when several genes or taxa are analyzed
     * (options -genes, -all_genes, -all_taxa).
     */
    public java.lang.Integer getIndex() {
        return index;
    }


    /**
     * Sets the index value for this FootprintDiscoveryRequest.
     * 
     * @param index   * Generate an HTML index with links to the result files. This
     * option is used for the web interface, but can also be convenient to
     * index results, especially when several genes or taxa are analyzed
     * (options -genes, -all_genes, -all_taxa).
     */
    public void setIndex(java.lang.Integer index) {
        this.index = index;
    }


    /**
     * Gets the lth value for this FootprintDiscoveryRequest.
     * 
     * @return lth   * Lower threshold on some parameters. Format: parameter value.
     */
    public java.lang.String[] getLth() {
        return lth;
    }


    /**
     * Sets the lth value for this FootprintDiscoveryRequest.
     * 
     * @param lth   * Lower threshold on some parameters. Format: parameter value.
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
     * Gets the uth value for this FootprintDiscoveryRequest.
     * 
     * @return uth   * Upper threshold on some parameters. Format: parameter value.
     */
    public java.lang.String[] getUth() {
        return uth;
    }


    /**
     * Sets the uth value for this FootprintDiscoveryRequest.
     * 
     * @param uth   * Upper threshold on some parameters. Format: parameter value.
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
     * Gets the _return value for this FootprintDiscoveryRequest.
     * 
     * @return _return   * Return fields for dyad-analysis. See dyad_analysis for a list
     */
    public java.lang.String get_return() {
        return _return;
    }


    /**
     * Sets the _return value for this FootprintDiscoveryRequest.
     * 
     * @param _return   * Return fields for dyad-analysis. See dyad_analysis for a list
     */
    public void set_return(java.lang.String _return) {
        this._return = _return;
    }


    /**
     * Gets the to_matrix value for this FootprintDiscoveryRequest.
     * 
     * @return to_matrix   * Convert assembled patterns into position-specific scoring matrices
     * (PSSM). Caution ! This conversion can take time if the sequence set
     * is large and if there are many assemblies.
     */
    public java.lang.Integer getTo_matrix() {
        return to_matrix;
    }


    /**
     * Sets the to_matrix value for this FootprintDiscoveryRequest.
     * 
     * @param to_matrix   * Convert assembled patterns into position-specific scoring matrices
     * (PSSM). Caution ! This conversion can take time if the sequence set
     * is large and if there are many assemblies.
     */
    public void setTo_matrix(java.lang.Integer to_matrix) {
        this.to_matrix = to_matrix;
    }


    /**
     * Gets the bg_model value for this FootprintDiscoveryRequest.
     * 
     * @return bg_model   * Allow the user to choose among alternative background model.
     * taxfreq
     *                                       Taxon-wide background model,
     * computed by counting dyad frequencies in all the promoters of all
     * the genes of the reference taxon.
     *                                    monads
     *                                       Expected dyad frequencies are
     * the product of monad frequencies observed in the input sequences.
     */
    public java.lang.String getBg_model() {
        return bg_model;
    }


    /**
     * Sets the bg_model value for this FootprintDiscoveryRequest.
     * 
     * @param bg_model   * Allow the user to choose among alternative background model.
     * taxfreq
     *                                       Taxon-wide background model,
     * computed by counting dyad frequencies in all the promoters of all
     * the genes of the reference taxon.
     *                                    monads
     *                                       Expected dyad frequencies are
     * the product of monad frequencies observed in the input sequences.
     */
    public void setBg_model(java.lang.String bg_model) {
        this.bg_model = bg_model;
    }


    /**
     * Gets the no_filter value for this FootprintDiscoveryRequest.
     * 
     * @return no_filter   * Accept all dyads, even if they are not found in the promoter
     * of the query gene, in the query organism.
     */
    public java.lang.Integer getNo_filter() {
        return no_filter;
    }


    /**
     * Sets the no_filter value for this FootprintDiscoveryRequest.
     * 
     * @param no_filter   * Accept all dyads, even if they are not found in the promoter
     * of the query gene, in the query organism.
     */
    public void setNo_filter(java.lang.Integer no_filter) {
        this.no_filter = no_filter;
    }


    /**
     * Gets the infer_operons value for this FootprintDiscoveryRequest.
     * 
     * @return infer_operons   * Infer operons in order to retrieve the	promoters of the predicted
     * operon leader genes rather than those located immediately upstream
     * of the orthologs. This method uses a threshold on the intergenic distance.
     */
    public java.lang.Integer getInfer_operons() {
        return infer_operons;
    }


    /**
     * Sets the infer_operons value for this FootprintDiscoveryRequest.
     * 
     * @param infer_operons   * Infer operons in order to retrieve the	promoters of the predicted
     * operon leader genes rather than those located immediately upstream
     * of the orthologs. This method uses a threshold on the intergenic distance.
     */
    public void setInfer_operons(java.lang.Integer infer_operons) {
        this.infer_operons = infer_operons;
    }


    /**
     * Gets the dist_thr value for this FootprintDiscoveryRequest.
     * 
     * @return dist_thr   * Specify here the intergenic distance threshold in base pairs.
     * Pair of adjacent genes with intergenic distance equal or less than
     * this value are predicted to be within operon. (default : 55).
     */
    public java.lang.Integer getDist_thr() {
        return dist_thr;
    }


    /**
     * Sets the dist_thr value for this FootprintDiscoveryRequest.
     * 
     * @param dist_thr   * Specify here the intergenic distance threshold in base pairs.
     * Pair of adjacent genes with intergenic distance equal or less than
     * this value are predicted to be within operon. (default : 55).
     */
    public void setDist_thr(java.lang.Integer dist_thr) {
        this.dist_thr = dist_thr;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof FootprintDiscoveryRequest)) return false;
        FootprintDiscoveryRequest other = (FootprintDiscoveryRequest) obj;
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
            ((this.genes==null && other.getGenes()==null) || 
             (this.genes!=null &&
              this.genes.equals(other.getGenes()))) &&
            ((this.tmp_infile==null && other.getTmp_infile()==null) || 
             (this.tmp_infile!=null &&
              this.tmp_infile.equals(other.getTmp_infile()))) &&
            ((this.all_genes==null && other.getAll_genes()==null) || 
             (this.all_genes!=null &&
              this.all_genes.equals(other.getAll_genes()))) &&
            ((this.max_genes==null && other.getMax_genes()==null) || 
             (this.max_genes!=null &&
              this.max_genes.equals(other.getMax_genes()))) &&
            ((this.output_prefix==null && other.getOutput_prefix()==null) || 
             (this.output_prefix!=null &&
              this.output_prefix.equals(other.getOutput_prefix()))) &&
            ((this.query==null && other.getQuery()==null) || 
             (this.query!=null &&
              this.query.equals(other.getQuery()))) &&
            ((this.sep_genes==null && other.getSep_genes()==null) || 
             (this.sep_genes!=null &&
              this.sep_genes.equals(other.getSep_genes()))) &&
            ((this.organism==null && other.getOrganism()==null) || 
             (this.organism!=null &&
              this.organism.equals(other.getOrganism()))) &&
            ((this.taxon==null && other.getTaxon()==null) || 
             (this.taxon!=null &&
              this.taxon.equals(other.getTaxon()))) &&
            ((this.index==null && other.getIndex()==null) || 
             (this.index!=null &&
              this.index.equals(other.getIndex()))) &&
            ((this.lth==null && other.getLth()==null) || 
             (this.lth!=null &&
              java.util.Arrays.equals(this.lth, other.getLth()))) &&
            ((this.uth==null && other.getUth()==null) || 
             (this.uth!=null &&
              java.util.Arrays.equals(this.uth, other.getUth()))) &&
            ((this._return==null && other.get_return()==null) || 
             (this._return!=null &&
              this._return.equals(other.get_return()))) &&
            ((this.to_matrix==null && other.getTo_matrix()==null) || 
             (this.to_matrix!=null &&
              this.to_matrix.equals(other.getTo_matrix()))) &&
            ((this.bg_model==null && other.getBg_model()==null) || 
             (this.bg_model!=null &&
              this.bg_model.equals(other.getBg_model()))) &&
            ((this.no_filter==null && other.getNo_filter()==null) || 
             (this.no_filter!=null &&
              this.no_filter.equals(other.getNo_filter()))) &&
            ((this.infer_operons==null && other.getInfer_operons()==null) || 
             (this.infer_operons!=null &&
              this.infer_operons.equals(other.getInfer_operons()))) &&
            ((this.dist_thr==null && other.getDist_thr()==null) || 
             (this.dist_thr!=null &&
              this.dist_thr.equals(other.getDist_thr())));
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
        if (getGenes() != null) {
            _hashCode += getGenes().hashCode();
        }
        if (getTmp_infile() != null) {
            _hashCode += getTmp_infile().hashCode();
        }
        if (getAll_genes() != null) {
            _hashCode += getAll_genes().hashCode();
        }
        if (getMax_genes() != null) {
            _hashCode += getMax_genes().hashCode();
        }
        if (getOutput_prefix() != null) {
            _hashCode += getOutput_prefix().hashCode();
        }
        if (getQuery() != null) {
            _hashCode += getQuery().hashCode();
        }
        if (getSep_genes() != null) {
            _hashCode += getSep_genes().hashCode();
        }
        if (getOrganism() != null) {
            _hashCode += getOrganism().hashCode();
        }
        if (getTaxon() != null) {
            _hashCode += getTaxon().hashCode();
        }
        if (getIndex() != null) {
            _hashCode += getIndex().hashCode();
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
        if (get_return() != null) {
            _hashCode += get_return().hashCode();
        }
        if (getTo_matrix() != null) {
            _hashCode += getTo_matrix().hashCode();
        }
        if (getBg_model() != null) {
            _hashCode += getBg_model().hashCode();
        }
        if (getNo_filter() != null) {
            _hashCode += getNo_filter().hashCode();
        }
        if (getInfer_operons() != null) {
            _hashCode += getInfer_operons().hashCode();
        }
        if (getDist_thr() != null) {
            _hashCode += getDist_thr().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(FootprintDiscoveryRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:RSATWS", "FootprintDiscoveryRequest"));
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
        elemField.setFieldName("genes");
        elemField.setXmlName(new javax.xml.namespace.QName("", "genes"));
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
        elemField.setFieldName("all_genes");
        elemField.setXmlName(new javax.xml.namespace.QName("", "all_genes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("max_genes");
        elemField.setXmlName(new javax.xml.namespace.QName("", "max_genes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("output_prefix");
        elemField.setXmlName(new javax.xml.namespace.QName("", "output_prefix"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("query");
        elemField.setXmlName(new javax.xml.namespace.QName("", "query"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sep_genes");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sep_genes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("organism");
        elemField.setXmlName(new javax.xml.namespace.QName("", "organism"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taxon");
        elemField.setXmlName(new javax.xml.namespace.QName("", "taxon"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("index");
        elemField.setXmlName(new javax.xml.namespace.QName("", "index"));
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
        elemField.setFieldName("_return");
        elemField.setXmlName(new javax.xml.namespace.QName("", "return"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("to_matrix");
        elemField.setXmlName(new javax.xml.namespace.QName("", "to_matrix"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bg_model");
        elemField.setXmlName(new javax.xml.namespace.QName("", "bg_model"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("no_filter");
        elemField.setXmlName(new javax.xml.namespace.QName("", "no_filter"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("infer_operons");
        elemField.setXmlName(new javax.xml.namespace.QName("", "infer_operons"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dist_thr");
        elemField.setXmlName(new javax.xml.namespace.QName("", "dist_thr"));
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
