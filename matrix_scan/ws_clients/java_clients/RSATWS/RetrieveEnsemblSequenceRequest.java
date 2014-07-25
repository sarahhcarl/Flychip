/**
 * RetrieveEnsemblSequenceRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.3 Oct 05, 2005 (05:23:37 EDT) WSDL2Java emitter.
 */

package RSATWS;


/**
 * Parameters for the operation retrieve_ensembl_seq.
 */
public class RetrieveEnsemblSequenceRequest  implements java.io.Serializable {
    /* Return type. Accepted values: 'server' (result is stored on
     * a file on the server), 'client' (result is directly transferred to
     * the client), or  'both'. 
     * Default is 'both'. */
    private java.lang.String output;

    /* Organism. Words need to be underscore separated (example: Escherichia_coli_K12). */
    private java.lang.String organism;

    /* Address of ensembl database server (default is EBI server). */
    private java.lang.String ensembl_host;

    /* Name of EnsEMBL database (alternative to organism). */
    private java.lang.String db_name;

    /* A list of query genes. You need to supply either this parameter
     * or the next one (tmp_infile). */
    private java.lang.String[] query;

    /* Name of the file with list of genes on the server. You need
     * to supply either this parameter or the previous one (query). */
    private java.lang.String tmp_infile;

    /* Return sequences for all the genes of the organism if value
     * = 1. Incompatible with query. */
    private java.lang.Integer all;

    /* Prevent overlap with upstream open reading frames (ORF) if
     * value = 1. */
    private java.lang.Integer noorf;

    /* Prevent overlap with upstream gene (extreme transcripts limits)
     * if value = 1. */
    private java.lang.Integer nogene;

    /* Inferior limit of the region to retrieve. Default is organism
     * dependant (example: Saccharomyces cerevisiae = -800). */
    private java.lang.Integer from;

    /* Superior limit of the region to retrieve. Default is '-1'. */
    private java.lang.Integer to;

    /* Type of genome features to load. Supported: Gene, CDS, mRNA,
     * intron, exon. */
    private java.lang.String feattype;

    /* Sequence type. Supported: upstream, downstream. */
    private java.lang.String type;

    /* Chromosome name or number (to use with -left and -right). */
    private java.lang.String chromosome;

    /* Left limit of sequence to retrieve. */
    private java.lang.Integer left;

    /* Right limit of sequence to retrieve. */
    private java.lang.Integer right;

    /* Strand of sequence to retrieve when using -left and -right.
     * Values: 1, -1 */
    private java.lang.Integer strand;

    /* Features. */
    private java.lang.String features;

    /* Features format. Supported: ft, gft */
    private java.lang.String feat_format;

    /* All coding sequence is replaced by N in the retrieved sequence
     * if value = 1. */
    private java.lang.Integer mask_coding;

    /* Use the repeat masked version of the genome if value = 1. Attention:
     * repeated regions are annotated for some genomes only. */
    private java.lang.Integer repeat;

    /* Get sequences for all transcript of genes if value = 1. Combine
     * with unique_sequences option if you do pattern discovery afterwards. */
    private java.lang.Integer all_transcripts;

    /* When getting sequences for all transcripts of genes, keep only
     * non-redundant fragments if value = 1. */
    private java.lang.Integer unique_sequences;

    /* With feattype intron, get only first intron sequence if value
     * = 1. */
    private java.lang.Integer first_intron;

    /* With feattype exon, get only non-coding (part of) exons if
     * value = 1. */
    private java.lang.Integer non_coding;

    /* With feattype UTR, get only 5prime or 3prime UTR (default is
     * all UTRs). */
    private java.lang.String utr;

    /* A newline character will be inserted in the 
     *                 sequence every ## bases. 0 will prevent newline
     *                 insertion. This is the default value */
    private java.lang.Integer line_width;

    /* Get orthologuous sequences if value = 1. */
    private java.lang.Integer ortho;

    /* Filter on taxonomic level when collecting orthologs (e.g. Murinae) */
    private java.lang.String taxon;

    /* Filter on homology type when collecting orthologs (e.g. ortholog_one2one) */
    private java.lang.String homology_type;

    /* Type of organism name to use in the fasta header (scientific,
     * common or none).
     *                                  Default is scientific. Common name
     * is only accessible with -ortho. */
    private java.lang.String header_organism;

    public RetrieveEnsemblSequenceRequest() {
    }

    public RetrieveEnsemblSequenceRequest(
           java.lang.String output,
           java.lang.String organism,
           java.lang.String ensembl_host,
           java.lang.String db_name,
           java.lang.String[] query,
           java.lang.String tmp_infile,
           java.lang.Integer all,
           java.lang.Integer noorf,
           java.lang.Integer nogene,
           java.lang.Integer from,
           java.lang.Integer to,
           java.lang.String feattype,
           java.lang.String type,
           java.lang.String chromosome,
           java.lang.Integer left,
           java.lang.Integer right,
           java.lang.Integer strand,
           java.lang.String features,
           java.lang.String feat_format,
           java.lang.Integer mask_coding,
           java.lang.Integer repeat,
           java.lang.Integer all_transcripts,
           java.lang.Integer unique_sequences,
           java.lang.Integer first_intron,
           java.lang.Integer non_coding,
           java.lang.String utr,
           java.lang.Integer line_width,
           java.lang.Integer ortho,
           java.lang.String taxon,
           java.lang.String homology_type,
           java.lang.String header_organism) {
           this.output = output;
           this.organism = organism;
           this.ensembl_host = ensembl_host;
           this.db_name = db_name;
           this.query = query;
           this.tmp_infile = tmp_infile;
           this.all = all;
           this.noorf = noorf;
           this.nogene = nogene;
           this.from = from;
           this.to = to;
           this.feattype = feattype;
           this.type = type;
           this.chromosome = chromosome;
           this.left = left;
           this.right = right;
           this.strand = strand;
           this.features = features;
           this.feat_format = feat_format;
           this.mask_coding = mask_coding;
           this.repeat = repeat;
           this.all_transcripts = all_transcripts;
           this.unique_sequences = unique_sequences;
           this.first_intron = first_intron;
           this.non_coding = non_coding;
           this.utr = utr;
           this.line_width = line_width;
           this.ortho = ortho;
           this.taxon = taxon;
           this.homology_type = homology_type;
           this.header_organism = header_organism;
    }


    /**
     * Gets the output value for this RetrieveEnsemblSequenceRequest.
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
     * Sets the output value for this RetrieveEnsemblSequenceRequest.
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
     * Gets the organism value for this RetrieveEnsemblSequenceRequest.
     * 
     * @return organism   * Organism. Words need to be underscore separated (example: Escherichia_coli_K12).
     */
    public java.lang.String getOrganism() {
        return organism;
    }


    /**
     * Sets the organism value for this RetrieveEnsemblSequenceRequest.
     * 
     * @param organism   * Organism. Words need to be underscore separated (example: Escherichia_coli_K12).
     */
    public void setOrganism(java.lang.String organism) {
        this.organism = organism;
    }


    /**
     * Gets the ensembl_host value for this RetrieveEnsemblSequenceRequest.
     * 
     * @return ensembl_host   * Address of ensembl database server (default is EBI server).
     */
    public java.lang.String getEnsembl_host() {
        return ensembl_host;
    }


    /**
     * Sets the ensembl_host value for this RetrieveEnsemblSequenceRequest.
     * 
     * @param ensembl_host   * Address of ensembl database server (default is EBI server).
     */
    public void setEnsembl_host(java.lang.String ensembl_host) {
        this.ensembl_host = ensembl_host;
    }


    /**
     * Gets the db_name value for this RetrieveEnsemblSequenceRequest.
     * 
     * @return db_name   * Name of EnsEMBL database (alternative to organism).
     */
    public java.lang.String getDb_name() {
        return db_name;
    }


    /**
     * Sets the db_name value for this RetrieveEnsemblSequenceRequest.
     * 
     * @param db_name   * Name of EnsEMBL database (alternative to organism).
     */
    public void setDb_name(java.lang.String db_name) {
        this.db_name = db_name;
    }


    /**
     * Gets the query value for this RetrieveEnsemblSequenceRequest.
     * 
     * @return query   * A list of query genes. You need to supply either this parameter
     * or the next one (tmp_infile).
     */
    public java.lang.String[] getQuery() {
        return query;
    }


    /**
     * Sets the query value for this RetrieveEnsemblSequenceRequest.
     * 
     * @param query   * A list of query genes. You need to supply either this parameter
     * or the next one (tmp_infile).
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
     * Gets the tmp_infile value for this RetrieveEnsemblSequenceRequest.
     * 
     * @return tmp_infile   * Name of the file with list of genes on the server. You need
     * to supply either this parameter or the previous one (query).
     */
    public java.lang.String getTmp_infile() {
        return tmp_infile;
    }


    /**
     * Sets the tmp_infile value for this RetrieveEnsemblSequenceRequest.
     * 
     * @param tmp_infile   * Name of the file with list of genes on the server. You need
     * to supply either this parameter or the previous one (query).
     */
    public void setTmp_infile(java.lang.String tmp_infile) {
        this.tmp_infile = tmp_infile;
    }


    /**
     * Gets the all value for this RetrieveEnsemblSequenceRequest.
     * 
     * @return all   * Return sequences for all the genes of the organism if value
     * = 1. Incompatible with query.
     */
    public java.lang.Integer getAll() {
        return all;
    }


    /**
     * Sets the all value for this RetrieveEnsemblSequenceRequest.
     * 
     * @param all   * Return sequences for all the genes of the organism if value
     * = 1. Incompatible with query.
     */
    public void setAll(java.lang.Integer all) {
        this.all = all;
    }


    /**
     * Gets the noorf value for this RetrieveEnsemblSequenceRequest.
     * 
     * @return noorf   * Prevent overlap with upstream open reading frames (ORF) if
     * value = 1.
     */
    public java.lang.Integer getNoorf() {
        return noorf;
    }


    /**
     * Sets the noorf value for this RetrieveEnsemblSequenceRequest.
     * 
     * @param noorf   * Prevent overlap with upstream open reading frames (ORF) if
     * value = 1.
     */
    public void setNoorf(java.lang.Integer noorf) {
        this.noorf = noorf;
    }


    /**
     * Gets the nogene value for this RetrieveEnsemblSequenceRequest.
     * 
     * @return nogene   * Prevent overlap with upstream gene (extreme transcripts limits)
     * if value = 1.
     */
    public java.lang.Integer getNogene() {
        return nogene;
    }


    /**
     * Sets the nogene value for this RetrieveEnsemblSequenceRequest.
     * 
     * @param nogene   * Prevent overlap with upstream gene (extreme transcripts limits)
     * if value = 1.
     */
    public void setNogene(java.lang.Integer nogene) {
        this.nogene = nogene;
    }


    /**
     * Gets the from value for this RetrieveEnsemblSequenceRequest.
     * 
     * @return from   * Inferior limit of the region to retrieve. Default is organism
     * dependant (example: Saccharomyces cerevisiae = -800).
     */
    public java.lang.Integer getFrom() {
        return from;
    }


    /**
     * Sets the from value for this RetrieveEnsemblSequenceRequest.
     * 
     * @param from   * Inferior limit of the region to retrieve. Default is organism
     * dependant (example: Saccharomyces cerevisiae = -800).
     */
    public void setFrom(java.lang.Integer from) {
        this.from = from;
    }


    /**
     * Gets the to value for this RetrieveEnsemblSequenceRequest.
     * 
     * @return to   * Superior limit of the region to retrieve. Default is '-1'.
     */
    public java.lang.Integer getTo() {
        return to;
    }


    /**
     * Sets the to value for this RetrieveEnsemblSequenceRequest.
     * 
     * @param to   * Superior limit of the region to retrieve. Default is '-1'.
     */
    public void setTo(java.lang.Integer to) {
        this.to = to;
    }


    /**
     * Gets the feattype value for this RetrieveEnsemblSequenceRequest.
     * 
     * @return feattype   * Type of genome features to load. Supported: Gene, CDS, mRNA,
     * intron, exon.
     */
    public java.lang.String getFeattype() {
        return feattype;
    }


    /**
     * Sets the feattype value for this RetrieveEnsemblSequenceRequest.
     * 
     * @param feattype   * Type of genome features to load. Supported: Gene, CDS, mRNA,
     * intron, exon.
     */
    public void setFeattype(java.lang.String feattype) {
        this.feattype = feattype;
    }


    /**
     * Gets the type value for this RetrieveEnsemblSequenceRequest.
     * 
     * @return type   * Sequence type. Supported: upstream, downstream.
     */
    public java.lang.String getType() {
        return type;
    }


    /**
     * Sets the type value for this RetrieveEnsemblSequenceRequest.
     * 
     * @param type   * Sequence type. Supported: upstream, downstream.
     */
    public void setType(java.lang.String type) {
        this.type = type;
    }


    /**
     * Gets the chromosome value for this RetrieveEnsemblSequenceRequest.
     * 
     * @return chromosome   * Chromosome name or number (to use with -left and -right).
     */
    public java.lang.String getChromosome() {
        return chromosome;
    }


    /**
     * Sets the chromosome value for this RetrieveEnsemblSequenceRequest.
     * 
     * @param chromosome   * Chromosome name or number (to use with -left and -right).
     */
    public void setChromosome(java.lang.String chromosome) {
        this.chromosome = chromosome;
    }


    /**
     * Gets the left value for this RetrieveEnsemblSequenceRequest.
     * 
     * @return left   * Left limit of sequence to retrieve.
     */
    public java.lang.Integer getLeft() {
        return left;
    }


    /**
     * Sets the left value for this RetrieveEnsemblSequenceRequest.
     * 
     * @param left   * Left limit of sequence to retrieve.
     */
    public void setLeft(java.lang.Integer left) {
        this.left = left;
    }


    /**
     * Gets the right value for this RetrieveEnsemblSequenceRequest.
     * 
     * @return right   * Right limit of sequence to retrieve.
     */
    public java.lang.Integer getRight() {
        return right;
    }


    /**
     * Sets the right value for this RetrieveEnsemblSequenceRequest.
     * 
     * @param right   * Right limit of sequence to retrieve.
     */
    public void setRight(java.lang.Integer right) {
        this.right = right;
    }


    /**
     * Gets the strand value for this RetrieveEnsemblSequenceRequest.
     * 
     * @return strand   * Strand of sequence to retrieve when using -left and -right.
     * Values: 1, -1
     */
    public java.lang.Integer getStrand() {
        return strand;
    }


    /**
     * Sets the strand value for this RetrieveEnsemblSequenceRequest.
     * 
     * @param strand   * Strand of sequence to retrieve when using -left and -right.
     * Values: 1, -1
     */
    public void setStrand(java.lang.Integer strand) {
        this.strand = strand;
    }


    /**
     * Gets the features value for this RetrieveEnsemblSequenceRequest.
     * 
     * @return features   * Features.
     */
    public java.lang.String getFeatures() {
        return features;
    }


    /**
     * Sets the features value for this RetrieveEnsemblSequenceRequest.
     * 
     * @param features   * Features.
     */
    public void setFeatures(java.lang.String features) {
        this.features = features;
    }


    /**
     * Gets the feat_format value for this RetrieveEnsemblSequenceRequest.
     * 
     * @return feat_format   * Features format. Supported: ft, gft
     */
    public java.lang.String getFeat_format() {
        return feat_format;
    }


    /**
     * Sets the feat_format value for this RetrieveEnsemblSequenceRequest.
     * 
     * @param feat_format   * Features format. Supported: ft, gft
     */
    public void setFeat_format(java.lang.String feat_format) {
        this.feat_format = feat_format;
    }


    /**
     * Gets the mask_coding value for this RetrieveEnsemblSequenceRequest.
     * 
     * @return mask_coding   * All coding sequence is replaced by N in the retrieved sequence
     * if value = 1.
     */
    public java.lang.Integer getMask_coding() {
        return mask_coding;
    }


    /**
     * Sets the mask_coding value for this RetrieveEnsemblSequenceRequest.
     * 
     * @param mask_coding   * All coding sequence is replaced by N in the retrieved sequence
     * if value = 1.
     */
    public void setMask_coding(java.lang.Integer mask_coding) {
        this.mask_coding = mask_coding;
    }


    /**
     * Gets the repeat value for this RetrieveEnsemblSequenceRequest.
     * 
     * @return repeat   * Use the repeat masked version of the genome if value = 1. Attention:
     * repeated regions are annotated for some genomes only.
     */
    public java.lang.Integer getRepeat() {
        return repeat;
    }


    /**
     * Sets the repeat value for this RetrieveEnsemblSequenceRequest.
     * 
     * @param repeat   * Use the repeat masked version of the genome if value = 1. Attention:
     * repeated regions are annotated for some genomes only.
     */
    public void setRepeat(java.lang.Integer repeat) {
        this.repeat = repeat;
    }


    /**
     * Gets the all_transcripts value for this RetrieveEnsemblSequenceRequest.
     * 
     * @return all_transcripts   * Get sequences for all transcript of genes if value = 1. Combine
     * with unique_sequences option if you do pattern discovery afterwards.
     */
    public java.lang.Integer getAll_transcripts() {
        return all_transcripts;
    }


    /**
     * Sets the all_transcripts value for this RetrieveEnsemblSequenceRequest.
     * 
     * @param all_transcripts   * Get sequences for all transcript of genes if value = 1. Combine
     * with unique_sequences option if you do pattern discovery afterwards.
     */
    public void setAll_transcripts(java.lang.Integer all_transcripts) {
        this.all_transcripts = all_transcripts;
    }


    /**
     * Gets the unique_sequences value for this RetrieveEnsemblSequenceRequest.
     * 
     * @return unique_sequences   * When getting sequences for all transcripts of genes, keep only
     * non-redundant fragments if value = 1.
     */
    public java.lang.Integer getUnique_sequences() {
        return unique_sequences;
    }


    /**
     * Sets the unique_sequences value for this RetrieveEnsemblSequenceRequest.
     * 
     * @param unique_sequences   * When getting sequences for all transcripts of genes, keep only
     * non-redundant fragments if value = 1.
     */
    public void setUnique_sequences(java.lang.Integer unique_sequences) {
        this.unique_sequences = unique_sequences;
    }


    /**
     * Gets the first_intron value for this RetrieveEnsemblSequenceRequest.
     * 
     * @return first_intron   * With feattype intron, get only first intron sequence if value
     * = 1.
     */
    public java.lang.Integer getFirst_intron() {
        return first_intron;
    }


    /**
     * Sets the first_intron value for this RetrieveEnsemblSequenceRequest.
     * 
     * @param first_intron   * With feattype intron, get only first intron sequence if value
     * = 1.
     */
    public void setFirst_intron(java.lang.Integer first_intron) {
        this.first_intron = first_intron;
    }


    /**
     * Gets the non_coding value for this RetrieveEnsemblSequenceRequest.
     * 
     * @return non_coding   * With feattype exon, get only non-coding (part of) exons if
     * value = 1.
     */
    public java.lang.Integer getNon_coding() {
        return non_coding;
    }


    /**
     * Sets the non_coding value for this RetrieveEnsemblSequenceRequest.
     * 
     * @param non_coding   * With feattype exon, get only non-coding (part of) exons if
     * value = 1.
     */
    public void setNon_coding(java.lang.Integer non_coding) {
        this.non_coding = non_coding;
    }


    /**
     * Gets the utr value for this RetrieveEnsemblSequenceRequest.
     * 
     * @return utr   * With feattype UTR, get only 5prime or 3prime UTR (default is
     * all UTRs).
     */
    public java.lang.String getUtr() {
        return utr;
    }


    /**
     * Sets the utr value for this RetrieveEnsemblSequenceRequest.
     * 
     * @param utr   * With feattype UTR, get only 5prime or 3prime UTR (default is
     * all UTRs).
     */
    public void setUtr(java.lang.String utr) {
        this.utr = utr;
    }


    /**
     * Gets the line_width value for this RetrieveEnsemblSequenceRequest.
     * 
     * @return line_width   * A newline character will be inserted in the 
     *                 sequence every ## bases. 0 will prevent newline
     *                 insertion. This is the default value
     */
    public java.lang.Integer getLine_width() {
        return line_width;
    }


    /**
     * Sets the line_width value for this RetrieveEnsemblSequenceRequest.
     * 
     * @param line_width   * A newline character will be inserted in the 
     *                 sequence every ## bases. 0 will prevent newline
     *                 insertion. This is the default value
     */
    public void setLine_width(java.lang.Integer line_width) {
        this.line_width = line_width;
    }


    /**
     * Gets the ortho value for this RetrieveEnsemblSequenceRequest.
     * 
     * @return ortho   * Get orthologuous sequences if value = 1.
     */
    public java.lang.Integer getOrtho() {
        return ortho;
    }


    /**
     * Sets the ortho value for this RetrieveEnsemblSequenceRequest.
     * 
     * @param ortho   * Get orthologuous sequences if value = 1.
     */
    public void setOrtho(java.lang.Integer ortho) {
        this.ortho = ortho;
    }


    /**
     * Gets the taxon value for this RetrieveEnsemblSequenceRequest.
     * 
     * @return taxon   * Filter on taxonomic level when collecting orthologs (e.g. Murinae)
     */
    public java.lang.String getTaxon() {
        return taxon;
    }


    /**
     * Sets the taxon value for this RetrieveEnsemblSequenceRequest.
     * 
     * @param taxon   * Filter on taxonomic level when collecting orthologs (e.g. Murinae)
     */
    public void setTaxon(java.lang.String taxon) {
        this.taxon = taxon;
    }


    /**
     * Gets the homology_type value for this RetrieveEnsemblSequenceRequest.
     * 
     * @return homology_type   * Filter on homology type when collecting orthologs (e.g. ortholog_one2one)
     */
    public java.lang.String getHomology_type() {
        return homology_type;
    }


    /**
     * Sets the homology_type value for this RetrieveEnsemblSequenceRequest.
     * 
     * @param homology_type   * Filter on homology type when collecting orthologs (e.g. ortholog_one2one)
     */
    public void setHomology_type(java.lang.String homology_type) {
        this.homology_type = homology_type;
    }


    /**
     * Gets the header_organism value for this RetrieveEnsemblSequenceRequest.
     * 
     * @return header_organism   * Type of organism name to use in the fasta header (scientific,
     * common or none).
     *                                  Default is scientific. Common name
     * is only accessible with -ortho.
     */
    public java.lang.String getHeader_organism() {
        return header_organism;
    }


    /**
     * Sets the header_organism value for this RetrieveEnsemblSequenceRequest.
     * 
     * @param header_organism   * Type of organism name to use in the fasta header (scientific,
     * common or none).
     *                                  Default is scientific. Common name
     * is only accessible with -ortho.
     */
    public void setHeader_organism(java.lang.String header_organism) {
        this.header_organism = header_organism;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RetrieveEnsemblSequenceRequest)) return false;
        RetrieveEnsemblSequenceRequest other = (RetrieveEnsemblSequenceRequest) obj;
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
            ((this.ensembl_host==null && other.getEnsembl_host()==null) || 
             (this.ensembl_host!=null &&
              this.ensembl_host.equals(other.getEnsembl_host()))) &&
            ((this.db_name==null && other.getDb_name()==null) || 
             (this.db_name!=null &&
              this.db_name.equals(other.getDb_name()))) &&
            ((this.query==null && other.getQuery()==null) || 
             (this.query!=null &&
              java.util.Arrays.equals(this.query, other.getQuery()))) &&
            ((this.tmp_infile==null && other.getTmp_infile()==null) || 
             (this.tmp_infile!=null &&
              this.tmp_infile.equals(other.getTmp_infile()))) &&
            ((this.all==null && other.getAll()==null) || 
             (this.all!=null &&
              this.all.equals(other.getAll()))) &&
            ((this.noorf==null && other.getNoorf()==null) || 
             (this.noorf!=null &&
              this.noorf.equals(other.getNoorf()))) &&
            ((this.nogene==null && other.getNogene()==null) || 
             (this.nogene!=null &&
              this.nogene.equals(other.getNogene()))) &&
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
            ((this.chromosome==null && other.getChromosome()==null) || 
             (this.chromosome!=null &&
              this.chromosome.equals(other.getChromosome()))) &&
            ((this.left==null && other.getLeft()==null) || 
             (this.left!=null &&
              this.left.equals(other.getLeft()))) &&
            ((this.right==null && other.getRight()==null) || 
             (this.right!=null &&
              this.right.equals(other.getRight()))) &&
            ((this.strand==null && other.getStrand()==null) || 
             (this.strand!=null &&
              this.strand.equals(other.getStrand()))) &&
            ((this.features==null && other.getFeatures()==null) || 
             (this.features!=null &&
              this.features.equals(other.getFeatures()))) &&
            ((this.feat_format==null && other.getFeat_format()==null) || 
             (this.feat_format!=null &&
              this.feat_format.equals(other.getFeat_format()))) &&
            ((this.mask_coding==null && other.getMask_coding()==null) || 
             (this.mask_coding!=null &&
              this.mask_coding.equals(other.getMask_coding()))) &&
            ((this.repeat==null && other.getRepeat()==null) || 
             (this.repeat!=null &&
              this.repeat.equals(other.getRepeat()))) &&
            ((this.all_transcripts==null && other.getAll_transcripts()==null) || 
             (this.all_transcripts!=null &&
              this.all_transcripts.equals(other.getAll_transcripts()))) &&
            ((this.unique_sequences==null && other.getUnique_sequences()==null) || 
             (this.unique_sequences!=null &&
              this.unique_sequences.equals(other.getUnique_sequences()))) &&
            ((this.first_intron==null && other.getFirst_intron()==null) || 
             (this.first_intron!=null &&
              this.first_intron.equals(other.getFirst_intron()))) &&
            ((this.non_coding==null && other.getNon_coding()==null) || 
             (this.non_coding!=null &&
              this.non_coding.equals(other.getNon_coding()))) &&
            ((this.utr==null && other.getUtr()==null) || 
             (this.utr!=null &&
              this.utr.equals(other.getUtr()))) &&
            ((this.line_width==null && other.getLine_width()==null) || 
             (this.line_width!=null &&
              this.line_width.equals(other.getLine_width()))) &&
            ((this.ortho==null && other.getOrtho()==null) || 
             (this.ortho!=null &&
              this.ortho.equals(other.getOrtho()))) &&
            ((this.taxon==null && other.getTaxon()==null) || 
             (this.taxon!=null &&
              this.taxon.equals(other.getTaxon()))) &&
            ((this.homology_type==null && other.getHomology_type()==null) || 
             (this.homology_type!=null &&
              this.homology_type.equals(other.getHomology_type()))) &&
            ((this.header_organism==null && other.getHeader_organism()==null) || 
             (this.header_organism!=null &&
              this.header_organism.equals(other.getHeader_organism())));
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
        if (getEnsembl_host() != null) {
            _hashCode += getEnsembl_host().hashCode();
        }
        if (getDb_name() != null) {
            _hashCode += getDb_name().hashCode();
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
        if (getTmp_infile() != null) {
            _hashCode += getTmp_infile().hashCode();
        }
        if (getAll() != null) {
            _hashCode += getAll().hashCode();
        }
        if (getNoorf() != null) {
            _hashCode += getNoorf().hashCode();
        }
        if (getNogene() != null) {
            _hashCode += getNogene().hashCode();
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
        if (getChromosome() != null) {
            _hashCode += getChromosome().hashCode();
        }
        if (getLeft() != null) {
            _hashCode += getLeft().hashCode();
        }
        if (getRight() != null) {
            _hashCode += getRight().hashCode();
        }
        if (getStrand() != null) {
            _hashCode += getStrand().hashCode();
        }
        if (getFeatures() != null) {
            _hashCode += getFeatures().hashCode();
        }
        if (getFeat_format() != null) {
            _hashCode += getFeat_format().hashCode();
        }
        if (getMask_coding() != null) {
            _hashCode += getMask_coding().hashCode();
        }
        if (getRepeat() != null) {
            _hashCode += getRepeat().hashCode();
        }
        if (getAll_transcripts() != null) {
            _hashCode += getAll_transcripts().hashCode();
        }
        if (getUnique_sequences() != null) {
            _hashCode += getUnique_sequences().hashCode();
        }
        if (getFirst_intron() != null) {
            _hashCode += getFirst_intron().hashCode();
        }
        if (getNon_coding() != null) {
            _hashCode += getNon_coding().hashCode();
        }
        if (getUtr() != null) {
            _hashCode += getUtr().hashCode();
        }
        if (getLine_width() != null) {
            _hashCode += getLine_width().hashCode();
        }
        if (getOrtho() != null) {
            _hashCode += getOrtho().hashCode();
        }
        if (getTaxon() != null) {
            _hashCode += getTaxon().hashCode();
        }
        if (getHomology_type() != null) {
            _hashCode += getHomology_type().hashCode();
        }
        if (getHeader_organism() != null) {
            _hashCode += getHeader_organism().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RetrieveEnsemblSequenceRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:RSATWS", "RetrieveEnsemblSequenceRequest"));
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
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ensembl_host");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ensembl_host"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("db_name");
        elemField.setXmlName(new javax.xml.namespace.QName("", "db_name"));
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
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tmp_infile");
        elemField.setXmlName(new javax.xml.namespace.QName("", "tmp_infile"));
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
        elemField.setFieldName("nogene");
        elemField.setXmlName(new javax.xml.namespace.QName("", "nogene"));
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
        elemField.setFieldName("chromosome");
        elemField.setXmlName(new javax.xml.namespace.QName("", "chromosome"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("left");
        elemField.setXmlName(new javax.xml.namespace.QName("", "left"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("right");
        elemField.setXmlName(new javax.xml.namespace.QName("", "right"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("strand");
        elemField.setXmlName(new javax.xml.namespace.QName("", "strand"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("features");
        elemField.setXmlName(new javax.xml.namespace.QName("", "features"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("feat_format");
        elemField.setXmlName(new javax.xml.namespace.QName("", "feat_format"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mask_coding");
        elemField.setXmlName(new javax.xml.namespace.QName("", "mask_coding"));
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
        elemField.setFieldName("all_transcripts");
        elemField.setXmlName(new javax.xml.namespace.QName("", "all_transcripts"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("unique_sequences");
        elemField.setXmlName(new javax.xml.namespace.QName("", "unique_sequences"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("first_intron");
        elemField.setXmlName(new javax.xml.namespace.QName("", "first_intron"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("non_coding");
        elemField.setXmlName(new javax.xml.namespace.QName("", "non_coding"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("utr");
        elemField.setXmlName(new javax.xml.namespace.QName("", "utr"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("line_width");
        elemField.setXmlName(new javax.xml.namespace.QName("", "line_width"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ortho");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ortho"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
        elemField.setFieldName("homology_type");
        elemField.setXmlName(new javax.xml.namespace.QName("", "homology_type"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("header_organism");
        elemField.setXmlName(new javax.xml.namespace.QName("", "header_organism"));
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
