/**
 * MatrixScanRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.3 Oct 05, 2005 (05:23:37 EDT) WSDL2Java emitter.
 */

package RSATWS;


/**
 * Parameters for the operation matrix scan
 */
public class MatrixScanRequest  implements java.io.Serializable {
    /* Return type. Accepted values: 'server' (result is stored on
     * a file on the server), 'client' (result is directly transferred to
     * the client), or  'both'. 
     * Default is 'both'. */
    private java.lang.String output;

    /* Sequence(s) to scan - all the formats supported in RSAT can
     * be used as input (default: fasta) */
    private java.lang.String sequence;

    /* Name of the file with input sequence(s) on the server. You
     * need to supply either this parameter or the previous one (sequence). */
    private java.lang.String tmp_sequence_infile;

    /* Matrix/ces to scan with. The matrix format is specified with
     * the option "matrix_format" (see below) Default format: tab. */
    private java.lang.String matrix;

    /* Name of the file with input matrix/ces on the server. You need
     * to supply either this parameter or the previous one (matrix). */
    private java.lang.String tmp_matrix_infile;

    /* Supported fields: fasta (default), IG (Intelligenetics), WC
     * (wconsensus), raw. */
    private java.lang.String sequence_format;

    /* Supported fields: tab, cb, consensus, gibbs, meme, assembly. */
    private java.lang.String matrix_format;

    /* Treatment of N characters. These characters
     *               are often used in DNA
     *         sequences to represent undefined or masked nucleotides.
     * 
     *         skip
     *             N-containing regions are skipped.
     * 
     *         score
     *             N-containing regions are scored. The probability of an
     * N is 1
     *             for both the background model and the matrix. The N residues
     * will thus contribute neither positively nor negatively to the
     *             weight score of the N-containing fragment. This option
     * can be
     *             useful to detect sites which are at the border of N-containing
     * regions, or in cases there are isolated N in the sequences. */
    private java.lang.String n_treatment;

    /* Use the motif (degenerate) consensus as matrix name. */
    private java.lang.String consensus_name;

    /* Pseudo-count for the matrix (default: 1).
     * 
     *         The pseudo-count reflects the possibility that residues that
     * were
     *         not (yet) observed in the model might however be valid for
     * future
     *         observations. The pseudo-count is used to compute the corrected
     * residue frequencies.. */
    private java.lang.Integer pseudo;

    /* If this option is called, the pseudo-weight is distributed
     * in an
     *         equiprobable way between residues.
     * 
     *         By default, the pseudo-weight is distributed proportionally
     * to
     *         residue priors, except for the -window option where equipseudo
     * is
     *         default. */
    private java.lang.Integer equi_pseudo;

    /* Only scan with the top # matrices per matrix file. This option
     * is valid for some file formats containing multiple matrices where
     * top matrices are generally more informative. */
    private java.lang.Integer top_matrices;

    /* Background model is a tab-delimited specification of oligonucleotide
     * frequencies. */
    private java.lang.String background_model;

    /* Background model file (tab-delimited specification of oligonucleotide
     * frequencies) on the server. */
    private java.lang.String tmp_background_infile;

    /* To use a precalculated background model from
     *               RSAT, choose the organism corresponding to the background
     * model. Works with background and markov options. */
    private java.lang.String organism;

    /* To use a precalculated background model from RSAT. Works with
     * organism and markov options.
     * 	      Type of sequences used as background model for estimating expected
     * oligonucleotide frequencies. 
     * 		Supported: upstream, upstream-noorf, upstream-noorf-rm, intergenic */
    private java.lang.String background;

    /* Calculate background model from the input sequence set. This
     * option requires to specify the order of the background model with
     * the option markov. */
    private java.lang.Integer background_input;

    /* Size of the sliding window for the background model calculation.
     * This option requires to specify the order of the background model
     * with the option markov (suitable for short order model only markov
     * 0 or 1) */
    private java.lang.Integer background_window;

    /* Order of the markov chain for the background model. This option
     * is incompatible with the option background. */
    private java.lang.Integer markov;

    /* Pseudo frequency for the background models. Value must be a
     * real between 0 and 1. If this option is not specified, the pseudo-frequency
     * value depends on the background calculation.
     * For -bginput and -window, the pseudo frequency is automatically calculated
     * with the length (L) of the sequence following this formula : square-root
     * of L divided by L+squareroot of L. 
     * For -bgfile, default value is 0.01. If the training sequence length
     * (L) is known, the value can be set by -bg_pseudo option to square-root
     * of L divided by L+squareroot of L. */
    private java.lang.Float background_pseudo;

    /* List of fields to return. Supported fields: sites, rank, limits,
     * normw, bg_model, matrix, freq_matrix, weight_matrix, distrib . */
    private java.lang.String return_fields;

    /* Lower threshold on some parameter. Format=list of 'parameter
     * value'.
     * Supported fields: score, pval, eval, sig, normw, proba_M, proba_B,
     * rank, crer_sites, crer_size, occ, occ_sum, inv_cum, exp_occ, occ_pval,
     * occ_eval, occ_sig, occ_sig_rank */
    private java.lang.String[] lth;

    /* Upper threshold on some parameter. Format=list of 'param value'.
     * Supported parameters: same as lth. */
    private java.lang.String[] uth;

    /* Scan 1 or 2 strands for DNA sequences. */
    private java.lang.Integer str;

    /* Level of verbosity (detail in the warning
     * 	messages during execution) */
    private java.lang.Integer verbosity;

    /* Define the origin for the calculation of positions.
     * 	-origin -0 defines the end of each sequence as the origin. The
     *         matching positions are then negative values, providing the
     * distance
     *         between the match and the end of the sequence. */
    private java.lang.String origin;

    /* Number of decimals displayed for the weight
     * 	score. */
    private java.lang.Integer decimals;

    /* Assign one separate feature ID per CRER. This
     * 	option is convenient to distinguish separate
     * 	CRERs. */
    private java.lang.Integer crer_ids;

    public MatrixScanRequest() {
    }

    public MatrixScanRequest(
           java.lang.String output,
           java.lang.String sequence,
           java.lang.String tmp_sequence_infile,
           java.lang.String matrix,
           java.lang.String tmp_matrix_infile,
           java.lang.String sequence_format,
           java.lang.String matrix_format,
           java.lang.String n_treatment,
           java.lang.String consensus_name,
           java.lang.Integer pseudo,
           java.lang.Integer equi_pseudo,
           java.lang.Integer top_matrices,
           java.lang.String background_model,
           java.lang.String tmp_background_infile,
           java.lang.String organism,
           java.lang.String background,
           java.lang.Integer background_input,
           java.lang.Integer background_window,
           java.lang.Integer markov,
           java.lang.Float background_pseudo,
           java.lang.String return_fields,
           java.lang.String[] lth,
           java.lang.String[] uth,
           java.lang.Integer str,
           java.lang.Integer verbosity,
           java.lang.String origin,
           java.lang.Integer decimals,
           java.lang.Integer crer_ids) {
           this.output = output;
           this.sequence = sequence;
           this.tmp_sequence_infile = tmp_sequence_infile;
           this.matrix = matrix;
           this.tmp_matrix_infile = tmp_matrix_infile;
           this.sequence_format = sequence_format;
           this.matrix_format = matrix_format;
           this.n_treatment = n_treatment;
           this.consensus_name = consensus_name;
           this.pseudo = pseudo;
           this.equi_pseudo = equi_pseudo;
           this.top_matrices = top_matrices;
           this.background_model = background_model;
           this.tmp_background_infile = tmp_background_infile;
           this.organism = organism;
           this.background = background;
           this.background_input = background_input;
           this.background_window = background_window;
           this.markov = markov;
           this.background_pseudo = background_pseudo;
           this.return_fields = return_fields;
           this.lth = lth;
           this.uth = uth;
           this.str = str;
           this.verbosity = verbosity;
           this.origin = origin;
           this.decimals = decimals;
           this.crer_ids = crer_ids;
    }


    /**
     * Gets the output value for this MatrixScanRequest.
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
     * Sets the output value for this MatrixScanRequest.
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
     * Gets the sequence value for this MatrixScanRequest.
     * 
     * @return sequence   * Sequence(s) to scan - all the formats supported in RSAT can
     * be used as input (default: fasta)
     */
    public java.lang.String getSequence() {
        return sequence;
    }


    /**
     * Sets the sequence value for this MatrixScanRequest.
     * 
     * @param sequence   * Sequence(s) to scan - all the formats supported in RSAT can
     * be used as input (default: fasta)
     */
    public void setSequence(java.lang.String sequence) {
        this.sequence = sequence;
    }


    /**
     * Gets the tmp_sequence_infile value for this MatrixScanRequest.
     * 
     * @return tmp_sequence_infile   * Name of the file with input sequence(s) on the server. You
     * need to supply either this parameter or the previous one (sequence).
     */
    public java.lang.String getTmp_sequence_infile() {
        return tmp_sequence_infile;
    }


    /**
     * Sets the tmp_sequence_infile value for this MatrixScanRequest.
     * 
     * @param tmp_sequence_infile   * Name of the file with input sequence(s) on the server. You
     * need to supply either this parameter or the previous one (sequence).
     */
    public void setTmp_sequence_infile(java.lang.String tmp_sequence_infile) {
        this.tmp_sequence_infile = tmp_sequence_infile;
    }


    /**
     * Gets the matrix value for this MatrixScanRequest.
     * 
     * @return matrix   * Matrix/ces to scan with. The matrix format is specified with
     * the option "matrix_format" (see below) Default format: tab.
     */
    public java.lang.String getMatrix() {
        return matrix;
    }


    /**
     * Sets the matrix value for this MatrixScanRequest.
     * 
     * @param matrix   * Matrix/ces to scan with. The matrix format is specified with
     * the option "matrix_format" (see below) Default format: tab.
     */
    public void setMatrix(java.lang.String matrix) {
        this.matrix = matrix;
    }


    /**
     * Gets the tmp_matrix_infile value for this MatrixScanRequest.
     * 
     * @return tmp_matrix_infile   * Name of the file with input matrix/ces on the server. You need
     * to supply either this parameter or the previous one (matrix).
     */
    public java.lang.String getTmp_matrix_infile() {
        return tmp_matrix_infile;
    }


    /**
     * Sets the tmp_matrix_infile value for this MatrixScanRequest.
     * 
     * @param tmp_matrix_infile   * Name of the file with input matrix/ces on the server. You need
     * to supply either this parameter or the previous one (matrix).
     */
    public void setTmp_matrix_infile(java.lang.String tmp_matrix_infile) {
        this.tmp_matrix_infile = tmp_matrix_infile;
    }


    /**
     * Gets the sequence_format value for this MatrixScanRequest.
     * 
     * @return sequence_format   * Supported fields: fasta (default), IG (Intelligenetics), WC
     * (wconsensus), raw.
     */
    public java.lang.String getSequence_format() {
        return sequence_format;
    }


    /**
     * Sets the sequence_format value for this MatrixScanRequest.
     * 
     * @param sequence_format   * Supported fields: fasta (default), IG (Intelligenetics), WC
     * (wconsensus), raw.
     */
    public void setSequence_format(java.lang.String sequence_format) {
        this.sequence_format = sequence_format;
    }


    /**
     * Gets the matrix_format value for this MatrixScanRequest.
     * 
     * @return matrix_format   * Supported fields: tab, cb, consensus, gibbs, meme, assembly.
     */
    public java.lang.String getMatrix_format() {
        return matrix_format;
    }


    /**
     * Sets the matrix_format value for this MatrixScanRequest.
     * 
     * @param matrix_format   * Supported fields: tab, cb, consensus, gibbs, meme, assembly.
     */
    public void setMatrix_format(java.lang.String matrix_format) {
        this.matrix_format = matrix_format;
    }


    /**
     * Gets the n_treatment value for this MatrixScanRequest.
     * 
     * @return n_treatment   * Treatment of N characters. These characters
     *               are often used in DNA
     *         sequences to represent undefined or masked nucleotides.
     * 
     *         skip
     *             N-containing regions are skipped.
     * 
     *         score
     *             N-containing regions are scored. The probability of an
     * N is 1
     *             for both the background model and the matrix. The N residues
     * will thus contribute neither positively nor negatively to the
     *             weight score of the N-containing fragment. This option
     * can be
     *             useful to detect sites which are at the border of N-containing
     * regions, or in cases there are isolated N in the sequences.
     */
    public java.lang.String getN_treatment() {
        return n_treatment;
    }


    /**
     * Sets the n_treatment value for this MatrixScanRequest.
     * 
     * @param n_treatment   * Treatment of N characters. These characters
     *               are often used in DNA
     *         sequences to represent undefined or masked nucleotides.
     * 
     *         skip
     *             N-containing regions are skipped.
     * 
     *         score
     *             N-containing regions are scored. The probability of an
     * N is 1
     *             for both the background model and the matrix. The N residues
     * will thus contribute neither positively nor negatively to the
     *             weight score of the N-containing fragment. This option
     * can be
     *             useful to detect sites which are at the border of N-containing
     * regions, or in cases there are isolated N in the sequences.
     */
    public void setN_treatment(java.lang.String n_treatment) {
        this.n_treatment = n_treatment;
    }


    /**
     * Gets the consensus_name value for this MatrixScanRequest.
     * 
     * @return consensus_name   * Use the motif (degenerate) consensus as matrix name.
     */
    public java.lang.String getConsensus_name() {
        return consensus_name;
    }


    /**
     * Sets the consensus_name value for this MatrixScanRequest.
     * 
     * @param consensus_name   * Use the motif (degenerate) consensus as matrix name.
     */
    public void setConsensus_name(java.lang.String consensus_name) {
        this.consensus_name = consensus_name;
    }


    /**
     * Gets the pseudo value for this MatrixScanRequest.
     * 
     * @return pseudo   * Pseudo-count for the matrix (default: 1).
     * 
     *         The pseudo-count reflects the possibility that residues that
     * were
     *         not (yet) observed in the model might however be valid for
     * future
     *         observations. The pseudo-count is used to compute the corrected
     * residue frequencies..
     */
    public java.lang.Integer getPseudo() {
        return pseudo;
    }


    /**
     * Sets the pseudo value for this MatrixScanRequest.
     * 
     * @param pseudo   * Pseudo-count for the matrix (default: 1).
     * 
     *         The pseudo-count reflects the possibility that residues that
     * were
     *         not (yet) observed in the model might however be valid for
     * future
     *         observations. The pseudo-count is used to compute the corrected
     * residue frequencies..
     */
    public void setPseudo(java.lang.Integer pseudo) {
        this.pseudo = pseudo;
    }


    /**
     * Gets the equi_pseudo value for this MatrixScanRequest.
     * 
     * @return equi_pseudo   * If this option is called, the pseudo-weight is distributed
     * in an
     *         equiprobable way between residues.
     * 
     *         By default, the pseudo-weight is distributed proportionally
     * to
     *         residue priors, except for the -window option where equipseudo
     * is
     *         default.
     */
    public java.lang.Integer getEqui_pseudo() {
        return equi_pseudo;
    }


    /**
     * Sets the equi_pseudo value for this MatrixScanRequest.
     * 
     * @param equi_pseudo   * If this option is called, the pseudo-weight is distributed
     * in an
     *         equiprobable way between residues.
     * 
     *         By default, the pseudo-weight is distributed proportionally
     * to
     *         residue priors, except for the -window option where equipseudo
     * is
     *         default.
     */
    public void setEqui_pseudo(java.lang.Integer equi_pseudo) {
        this.equi_pseudo = equi_pseudo;
    }


    /**
     * Gets the top_matrices value for this MatrixScanRequest.
     * 
     * @return top_matrices   * Only scan with the top # matrices per matrix file. This option
     * is valid for some file formats containing multiple matrices where
     * top matrices are generally more informative.
     */
    public java.lang.Integer getTop_matrices() {
        return top_matrices;
    }


    /**
     * Sets the top_matrices value for this MatrixScanRequest.
     * 
     * @param top_matrices   * Only scan with the top # matrices per matrix file. This option
     * is valid for some file formats containing multiple matrices where
     * top matrices are generally more informative.
     */
    public void setTop_matrices(java.lang.Integer top_matrices) {
        this.top_matrices = top_matrices;
    }


    /**
     * Gets the background_model value for this MatrixScanRequest.
     * 
     * @return background_model   * Background model is a tab-delimited specification of oligonucleotide
     * frequencies.
     */
    public java.lang.String getBackground_model() {
        return background_model;
    }


    /**
     * Sets the background_model value for this MatrixScanRequest.
     * 
     * @param background_model   * Background model is a tab-delimited specification of oligonucleotide
     * frequencies.
     */
    public void setBackground_model(java.lang.String background_model) {
        this.background_model = background_model;
    }


    /**
     * Gets the tmp_background_infile value for this MatrixScanRequest.
     * 
     * @return tmp_background_infile   * Background model file (tab-delimited specification of oligonucleotide
     * frequencies) on the server.
     */
    public java.lang.String getTmp_background_infile() {
        return tmp_background_infile;
    }


    /**
     * Sets the tmp_background_infile value for this MatrixScanRequest.
     * 
     * @param tmp_background_infile   * Background model file (tab-delimited specification of oligonucleotide
     * frequencies) on the server.
     */
    public void setTmp_background_infile(java.lang.String tmp_background_infile) {
        this.tmp_background_infile = tmp_background_infile;
    }


    /**
     * Gets the organism value for this MatrixScanRequest.
     * 
     * @return organism   * To use a precalculated background model from
     *               RSAT, choose the organism corresponding to the background
     * model. Works with background and markov options.
     */
    public java.lang.String getOrganism() {
        return organism;
    }


    /**
     * Sets the organism value for this MatrixScanRequest.
     * 
     * @param organism   * To use a precalculated background model from
     *               RSAT, choose the organism corresponding to the background
     * model. Works with background and markov options.
     */
    public void setOrganism(java.lang.String organism) {
        this.organism = organism;
    }


    /**
     * Gets the background value for this MatrixScanRequest.
     * 
     * @return background   * To use a precalculated background model from RSAT. Works with
     * organism and markov options.
     * 	      Type of sequences used as background model for estimating expected
     * oligonucleotide frequencies. 
     * 		Supported: upstream, upstream-noorf, upstream-noorf-rm, intergenic
     */
    public java.lang.String getBackground() {
        return background;
    }


    /**
     * Sets the background value for this MatrixScanRequest.
     * 
     * @param background   * To use a precalculated background model from RSAT. Works with
     * organism and markov options.
     * 	      Type of sequences used as background model for estimating expected
     * oligonucleotide frequencies. 
     * 		Supported: upstream, upstream-noorf, upstream-noorf-rm, intergenic
     */
    public void setBackground(java.lang.String background) {
        this.background = background;
    }


    /**
     * Gets the background_input value for this MatrixScanRequest.
     * 
     * @return background_input   * Calculate background model from the input sequence set. This
     * option requires to specify the order of the background model with
     * the option markov.
     */
    public java.lang.Integer getBackground_input() {
        return background_input;
    }


    /**
     * Sets the background_input value for this MatrixScanRequest.
     * 
     * @param background_input   * Calculate background model from the input sequence set. This
     * option requires to specify the order of the background model with
     * the option markov.
     */
    public void setBackground_input(java.lang.Integer background_input) {
        this.background_input = background_input;
    }


    /**
     * Gets the background_window value for this MatrixScanRequest.
     * 
     * @return background_window   * Size of the sliding window for the background model calculation.
     * This option requires to specify the order of the background model
     * with the option markov (suitable for short order model only markov
     * 0 or 1)
     */
    public java.lang.Integer getBackground_window() {
        return background_window;
    }


    /**
     * Sets the background_window value for this MatrixScanRequest.
     * 
     * @param background_window   * Size of the sliding window for the background model calculation.
     * This option requires to specify the order of the background model
     * with the option markov (suitable for short order model only markov
     * 0 or 1)
     */
    public void setBackground_window(java.lang.Integer background_window) {
        this.background_window = background_window;
    }


    /**
     * Gets the markov value for this MatrixScanRequest.
     * 
     * @return markov   * Order of the markov chain for the background model. This option
     * is incompatible with the option background.
     */
    public java.lang.Integer getMarkov() {
        return markov;
    }


    /**
     * Sets the markov value for this MatrixScanRequest.
     * 
     * @param markov   * Order of the markov chain for the background model. This option
     * is incompatible with the option background.
     */
    public void setMarkov(java.lang.Integer markov) {
        this.markov = markov;
    }


    /**
     * Gets the background_pseudo value for this MatrixScanRequest.
     * 
     * @return background_pseudo   * Pseudo frequency for the background models. Value must be a
     * real between 0 and 1. If this option is not specified, the pseudo-frequency
     * value depends on the background calculation.
     * For -bginput and -window, the pseudo frequency is automatically calculated
     * with the length (L) of the sequence following this formula : square-root
     * of L divided by L+squareroot of L. 
     * For -bgfile, default value is 0.01. If the training sequence length
     * (L) is known, the value can be set by -bg_pseudo option to square-root
     * of L divided by L+squareroot of L.
     */
    public java.lang.Float getBackground_pseudo() {
        return background_pseudo;
    }


    /**
     * Sets the background_pseudo value for this MatrixScanRequest.
     * 
     * @param background_pseudo   * Pseudo frequency for the background models. Value must be a
     * real between 0 and 1. If this option is not specified, the pseudo-frequency
     * value depends on the background calculation.
     * For -bginput and -window, the pseudo frequency is automatically calculated
     * with the length (L) of the sequence following this formula : square-root
     * of L divided by L+squareroot of L. 
     * For -bgfile, default value is 0.01. If the training sequence length
     * (L) is known, the value can be set by -bg_pseudo option to square-root
     * of L divided by L+squareroot of L.
     */
    public void setBackground_pseudo(java.lang.Float background_pseudo) {
        this.background_pseudo = background_pseudo;
    }


    /**
     * Gets the return_fields value for this MatrixScanRequest.
     * 
     * @return return_fields   * List of fields to return. Supported fields: sites, rank, limits,
     * normw, bg_model, matrix, freq_matrix, weight_matrix, distrib .
     */
    public java.lang.String getReturn_fields() {
        return return_fields;
    }


    /**
     * Sets the return_fields value for this MatrixScanRequest.
     * 
     * @param return_fields   * List of fields to return. Supported fields: sites, rank, limits,
     * normw, bg_model, matrix, freq_matrix, weight_matrix, distrib .
     */
    public void setReturn_fields(java.lang.String return_fields) {
        this.return_fields = return_fields;
    }


    /**
     * Gets the lth value for this MatrixScanRequest.
     * 
     * @return lth   * Lower threshold on some parameter. Format=list of 'parameter
     * value'.
     * Supported fields: score, pval, eval, sig, normw, proba_M, proba_B,
     * rank, crer_sites, crer_size, occ, occ_sum, inv_cum, exp_occ, occ_pval,
     * occ_eval, occ_sig, occ_sig_rank
     */
    public java.lang.String[] getLth() {
        return lth;
    }


    /**
     * Sets the lth value for this MatrixScanRequest.
     * 
     * @param lth   * Lower threshold on some parameter. Format=list of 'parameter
     * value'.
     * Supported fields: score, pval, eval, sig, normw, proba_M, proba_B,
     * rank, crer_sites, crer_size, occ, occ_sum, inv_cum, exp_occ, occ_pval,
     * occ_eval, occ_sig, occ_sig_rank
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
     * Gets the uth value for this MatrixScanRequest.
     * 
     * @return uth   * Upper threshold on some parameter. Format=list of 'param value'.
     * Supported parameters: same as lth.
     */
    public java.lang.String[] getUth() {
        return uth;
    }


    /**
     * Sets the uth value for this MatrixScanRequest.
     * 
     * @param uth   * Upper threshold on some parameter. Format=list of 'param value'.
     * Supported parameters: same as lth.
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
     * Gets the str value for this MatrixScanRequest.
     * 
     * @return str   * Scan 1 or 2 strands for DNA sequences.
     */
    public java.lang.Integer getStr() {
        return str;
    }


    /**
     * Sets the str value for this MatrixScanRequest.
     * 
     * @param str   * Scan 1 or 2 strands for DNA sequences.
     */
    public void setStr(java.lang.Integer str) {
        this.str = str;
    }


    /**
     * Gets the verbosity value for this MatrixScanRequest.
     * 
     * @return verbosity   * Level of verbosity (detail in the warning
     * 	messages during execution)
     */
    public java.lang.Integer getVerbosity() {
        return verbosity;
    }


    /**
     * Sets the verbosity value for this MatrixScanRequest.
     * 
     * @param verbosity   * Level of verbosity (detail in the warning
     * 	messages during execution)
     */
    public void setVerbosity(java.lang.Integer verbosity) {
        this.verbosity = verbosity;
    }


    /**
     * Gets the origin value for this MatrixScanRequest.
     * 
     * @return origin   * Define the origin for the calculation of positions.
     * 	-origin -0 defines the end of each sequence as the origin. The
     *         matching positions are then negative values, providing the
     * distance
     *         between the match and the end of the sequence.
     */
    public java.lang.String getOrigin() {
        return origin;
    }


    /**
     * Sets the origin value for this MatrixScanRequest.
     * 
     * @param origin   * Define the origin for the calculation of positions.
     * 	-origin -0 defines the end of each sequence as the origin. The
     *         matching positions are then negative values, providing the
     * distance
     *         between the match and the end of the sequence.
     */
    public void setOrigin(java.lang.String origin) {
        this.origin = origin;
    }


    /**
     * Gets the decimals value for this MatrixScanRequest.
     * 
     * @return decimals   * Number of decimals displayed for the weight
     * 	score.
     */
    public java.lang.Integer getDecimals() {
        return decimals;
    }


    /**
     * Sets the decimals value for this MatrixScanRequest.
     * 
     * @param decimals   * Number of decimals displayed for the weight
     * 	score.
     */
    public void setDecimals(java.lang.Integer decimals) {
        this.decimals = decimals;
    }


    /**
     * Gets the crer_ids value for this MatrixScanRequest.
     * 
     * @return crer_ids   * Assign one separate feature ID per CRER. This
     * 	option is convenient to distinguish separate
     * 	CRERs.
     */
    public java.lang.Integer getCrer_ids() {
        return crer_ids;
    }


    /**
     * Sets the crer_ids value for this MatrixScanRequest.
     * 
     * @param crer_ids   * Assign one separate feature ID per CRER. This
     * 	option is convenient to distinguish separate
     * 	CRERs.
     */
    public void setCrer_ids(java.lang.Integer crer_ids) {
        this.crer_ids = crer_ids;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof MatrixScanRequest)) return false;
        MatrixScanRequest other = (MatrixScanRequest) obj;
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
            ((this.tmp_sequence_infile==null && other.getTmp_sequence_infile()==null) || 
             (this.tmp_sequence_infile!=null &&
              this.tmp_sequence_infile.equals(other.getTmp_sequence_infile()))) &&
            ((this.matrix==null && other.getMatrix()==null) || 
             (this.matrix!=null &&
              this.matrix.equals(other.getMatrix()))) &&
            ((this.tmp_matrix_infile==null && other.getTmp_matrix_infile()==null) || 
             (this.tmp_matrix_infile!=null &&
              this.tmp_matrix_infile.equals(other.getTmp_matrix_infile()))) &&
            ((this.sequence_format==null && other.getSequence_format()==null) || 
             (this.sequence_format!=null &&
              this.sequence_format.equals(other.getSequence_format()))) &&
            ((this.matrix_format==null && other.getMatrix_format()==null) || 
             (this.matrix_format!=null &&
              this.matrix_format.equals(other.getMatrix_format()))) &&
            ((this.n_treatment==null && other.getN_treatment()==null) || 
             (this.n_treatment!=null &&
              this.n_treatment.equals(other.getN_treatment()))) &&
            ((this.consensus_name==null && other.getConsensus_name()==null) || 
             (this.consensus_name!=null &&
              this.consensus_name.equals(other.getConsensus_name()))) &&
            ((this.pseudo==null && other.getPseudo()==null) || 
             (this.pseudo!=null &&
              this.pseudo.equals(other.getPseudo()))) &&
            ((this.equi_pseudo==null && other.getEqui_pseudo()==null) || 
             (this.equi_pseudo!=null &&
              this.equi_pseudo.equals(other.getEqui_pseudo()))) &&
            ((this.top_matrices==null && other.getTop_matrices()==null) || 
             (this.top_matrices!=null &&
              this.top_matrices.equals(other.getTop_matrices()))) &&
            ((this.background_model==null && other.getBackground_model()==null) || 
             (this.background_model!=null &&
              this.background_model.equals(other.getBackground_model()))) &&
            ((this.tmp_background_infile==null && other.getTmp_background_infile()==null) || 
             (this.tmp_background_infile!=null &&
              this.tmp_background_infile.equals(other.getTmp_background_infile()))) &&
            ((this.organism==null && other.getOrganism()==null) || 
             (this.organism!=null &&
              this.organism.equals(other.getOrganism()))) &&
            ((this.background==null && other.getBackground()==null) || 
             (this.background!=null &&
              this.background.equals(other.getBackground()))) &&
            ((this.background_input==null && other.getBackground_input()==null) || 
             (this.background_input!=null &&
              this.background_input.equals(other.getBackground_input()))) &&
            ((this.background_window==null && other.getBackground_window()==null) || 
             (this.background_window!=null &&
              this.background_window.equals(other.getBackground_window()))) &&
            ((this.markov==null && other.getMarkov()==null) || 
             (this.markov!=null &&
              this.markov.equals(other.getMarkov()))) &&
            ((this.background_pseudo==null && other.getBackground_pseudo()==null) || 
             (this.background_pseudo!=null &&
              this.background_pseudo.equals(other.getBackground_pseudo()))) &&
            ((this.return_fields==null && other.getReturn_fields()==null) || 
             (this.return_fields!=null &&
              this.return_fields.equals(other.getReturn_fields()))) &&
            ((this.lth==null && other.getLth()==null) || 
             (this.lth!=null &&
              java.util.Arrays.equals(this.lth, other.getLth()))) &&
            ((this.uth==null && other.getUth()==null) || 
             (this.uth!=null &&
              java.util.Arrays.equals(this.uth, other.getUth()))) &&
            ((this.str==null && other.getStr()==null) || 
             (this.str!=null &&
              this.str.equals(other.getStr()))) &&
            ((this.verbosity==null && other.getVerbosity()==null) || 
             (this.verbosity!=null &&
              this.verbosity.equals(other.getVerbosity()))) &&
            ((this.origin==null && other.getOrigin()==null) || 
             (this.origin!=null &&
              this.origin.equals(other.getOrigin()))) &&
            ((this.decimals==null && other.getDecimals()==null) || 
             (this.decimals!=null &&
              this.decimals.equals(other.getDecimals()))) &&
            ((this.crer_ids==null && other.getCrer_ids()==null) || 
             (this.crer_ids!=null &&
              this.crer_ids.equals(other.getCrer_ids())));
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
        if (getTmp_sequence_infile() != null) {
            _hashCode += getTmp_sequence_infile().hashCode();
        }
        if (getMatrix() != null) {
            _hashCode += getMatrix().hashCode();
        }
        if (getTmp_matrix_infile() != null) {
            _hashCode += getTmp_matrix_infile().hashCode();
        }
        if (getSequence_format() != null) {
            _hashCode += getSequence_format().hashCode();
        }
        if (getMatrix_format() != null) {
            _hashCode += getMatrix_format().hashCode();
        }
        if (getN_treatment() != null) {
            _hashCode += getN_treatment().hashCode();
        }
        if (getConsensus_name() != null) {
            _hashCode += getConsensus_name().hashCode();
        }
        if (getPseudo() != null) {
            _hashCode += getPseudo().hashCode();
        }
        if (getEqui_pseudo() != null) {
            _hashCode += getEqui_pseudo().hashCode();
        }
        if (getTop_matrices() != null) {
            _hashCode += getTop_matrices().hashCode();
        }
        if (getBackground_model() != null) {
            _hashCode += getBackground_model().hashCode();
        }
        if (getTmp_background_infile() != null) {
            _hashCode += getTmp_background_infile().hashCode();
        }
        if (getOrganism() != null) {
            _hashCode += getOrganism().hashCode();
        }
        if (getBackground() != null) {
            _hashCode += getBackground().hashCode();
        }
        if (getBackground_input() != null) {
            _hashCode += getBackground_input().hashCode();
        }
        if (getBackground_window() != null) {
            _hashCode += getBackground_window().hashCode();
        }
        if (getMarkov() != null) {
            _hashCode += getMarkov().hashCode();
        }
        if (getBackground_pseudo() != null) {
            _hashCode += getBackground_pseudo().hashCode();
        }
        if (getReturn_fields() != null) {
            _hashCode += getReturn_fields().hashCode();
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
        if (getStr() != null) {
            _hashCode += getStr().hashCode();
        }
        if (getVerbosity() != null) {
            _hashCode += getVerbosity().hashCode();
        }
        if (getOrigin() != null) {
            _hashCode += getOrigin().hashCode();
        }
        if (getDecimals() != null) {
            _hashCode += getDecimals().hashCode();
        }
        if (getCrer_ids() != null) {
            _hashCode += getCrer_ids().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(MatrixScanRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:RSATWS", "MatrixScanRequest"));
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
        elemField.setFieldName("tmp_sequence_infile");
        elemField.setXmlName(new javax.xml.namespace.QName("", "tmp_sequence_infile"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("matrix");
        elemField.setXmlName(new javax.xml.namespace.QName("", "matrix"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tmp_matrix_infile");
        elemField.setXmlName(new javax.xml.namespace.QName("", "tmp_matrix_infile"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sequence_format");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sequence_format"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("matrix_format");
        elemField.setXmlName(new javax.xml.namespace.QName("", "matrix_format"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("n_treatment");
        elemField.setXmlName(new javax.xml.namespace.QName("", "n_treatment"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("consensus_name");
        elemField.setXmlName(new javax.xml.namespace.QName("", "consensus_name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pseudo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "pseudo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("equi_pseudo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "equi_pseudo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("top_matrices");
        elemField.setXmlName(new javax.xml.namespace.QName("", "top_matrices"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("background_model");
        elemField.setXmlName(new javax.xml.namespace.QName("", "background_model"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tmp_background_infile");
        elemField.setXmlName(new javax.xml.namespace.QName("", "tmp_background_infile"));
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
        elemField.setFieldName("background");
        elemField.setXmlName(new javax.xml.namespace.QName("", "background"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("background_input");
        elemField.setXmlName(new javax.xml.namespace.QName("", "background_input"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("background_window");
        elemField.setXmlName(new javax.xml.namespace.QName("", "background_window"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("markov");
        elemField.setXmlName(new javax.xml.namespace.QName("", "markov"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
        elemField.setFieldName("return_fields");
        elemField.setXmlName(new javax.xml.namespace.QName("", "return_fields"));
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
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("str");
        elemField.setXmlName(new javax.xml.namespace.QName("", "str"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
        elemField.setFieldName("origin");
        elemField.setXmlName(new javax.xml.namespace.QName("", "origin"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
        elemField.setFieldName("crer_ids");
        elemField.setXmlName(new javax.xml.namespace.QName("", "crer_ids"));
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
