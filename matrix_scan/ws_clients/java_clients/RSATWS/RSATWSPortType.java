/**
 * RSATWSPortType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.3 Oct 05, 2005 (05:23:37 EDT) WSDL2Java emitter.
 */

package RSATWS;

public interface RSATWSPortType extends java.rmi.Remote {

    /**
     * Returns upstream, downstream or coding DNA sequences
     *            for list of query genes.
     */
    public RSATWS.RetrieveSequenceResponse retrieve_seq(RSATWS.RetrieveSequenceRequest request) throws java.rmi.RemoteException;

    /**
     * Returns upstream, downstream or coding DNA sequences
     *            for list of query genes and organisms.
     */
    public RSATWS.RetrieveSequenceMultigenomeResponse retrieve_seq_multigenome(RSATWS.RetrieveSequenceMultigenomeRequest request) throws java.rmi.RemoteException;

    /**
     * Returns upstream, downstream or coding DNA sequences
     *            for list of query genes (in EnsEMBL database).
     */
    public RSATWS.RetrieveEnsemblSequenceResponse retrieve_ensembl_seq(RSATWS.RetrieveEnsemblSequenceRequest request) throws java.rmi.RemoteException;

    /**
     * Mask repeated fragments of an input sequence.
     */
    public RSATWS.PurgeSequenceResponse purge_seq(RSATWS.PurgeSequenceRequest request) throws java.rmi.RemoteException;

    /**
     * Analysis of the statistical significance of all the oligomers
     * 	   of a given size in a sequence. Commonly used to detect
     * 	   over-represented oligonucleotides in a set of promoter
     * 	   sequences.
     */
    public RSATWS.OligoAnalysisResponse oligo_analysis(RSATWS.OligoAnalysisRequest request) throws java.rmi.RemoteException;

    /**
     * Analysis of the statistical significance of all the
     * 	   spaced dyads
     * 	   of a given size in a sequence. Commonly used to detect
     * 	   over-represented spaced dyads in a set of promoter
     * 	   sequences.
     */
    public RSATWS.DyadAnalysisResponse dyad_analysis(RSATWS.DyadAnalysisRequest request) throws java.rmi.RemoteException;

    /**
     * Assemble a set of oligonucleotides or dyads into groups of
     *         overlapping patterns (assemblies).
     */
    public RSATWS.PatternAssemblyResponse pattern_assembly(RSATWS.PatternAssemblyRequest request) throws java.rmi.RemoteException;

    /**
     * Searches all occurrences of a pattern within DNA sequences.
     */
    public RSATWS.DnaPatternResponse dna_pattern(RSATWS.DnaPatternRequest request) throws java.rmi.RemoteException;

    /**
     * Interconversions between various formats of feature
     *         description.
     */
    public RSATWS.ConvertFeaturesResponse convert_features(RSATWS.ConvertFeaturesRequest request) throws java.rmi.RemoteException;

    /**
     * Draws a graphical map of features (e.g. results of pattern
     * matching) in a set of sequences.
     */
    public RSATWS.FeatureMapResponse feature_map(RSATWS.FeatureMapRequest request) throws java.rmi.RemoteException;

    /**
     * Detect phylogenetic footprints by applying dyad-analysis in
     * promoters of a set of orthologous genes.
     */
    public RSATWS.FootprintDiscoveryResponse footprint_discovery(RSATWS.FootprintDiscoveryRequest request) throws java.rmi.RemoteException;

    /**
     * Get orthologuous genes.
     */
    public RSATWS.GetOrthologsResponse get_orthologs(RSATWS.GetOrthologsRequest request) throws java.rmi.RemoteException;

    /**
     * Infer operon.
     */
    public RSATWS.InferOperonResponse infer_operon(RSATWS.InferOperonRequest request) throws java.rmi.RemoteException;

    /**
     * Get information about genes.
     */
    public RSATWS.GeneInfoResponse gene_info(RSATWS.GeneInfoRequest request) throws java.rmi.RemoteException;

    /**
     * Converts a tab-delimited file into an HTML table.
     */
    public RSATWS.SupportedOrganismsResponse supported_organisms(RSATWS.SupportedOrganismsRequest request) throws java.rmi.RemoteException;

    /**
     * Converts a tab-delimited file into a HTML table
     */
    public RSATWS.TextToHtmlResponse text_to_html(RSATWS.TextToHtmlRequest request) throws java.rmi.RemoteException;

    /**
     * Converts a psi xml file in a tab delimited file
     */
    public RSATWS.ParsepsixmlResponse parse_psi_xml(RSATWS.ParsepsixmlRequest request) throws java.rmi.RemoteException;

    /**
     * This program takes as input a set of scored results associated
     * with validation labels (pos for positive, neg for negative) and computes,
     * for each score value, the derived statistics (Sn, PPV, FPR), which
     * can be further used to draw a ROC curve.
     */
    public RSATWS.RocStatsResponse roc_stats(RSATWS.RocStatsRequest request) throws java.rmi.RemoteException;

    /**
     * Plot a graph and export it.
     */
    public RSATWS.XYGraphResponse xygraph(RSATWS.XYGraphRequest request) throws java.rmi.RemoteException;

    /**
     * This script takes a group of numbers (real or integers) and
     * outputs their distribution among classes.
     */
    public RSATWS.ClassFreqResponse classfreq(RSATWS.ClassFreqRequest request) throws java.rmi.RemoteException;

    /**
     * Converts a sequence between two formats (e.g. fasta -> raw).
     */
    public RSATWS.ConvertSeqResponse convert_seq(RSATWS.ConvertSeqRequest request) throws java.rmi.RemoteException;

    /**
     * Compare two class files(the query file and the reference file).
     * Each class of the query file is compared to each class of the reference
     * file. The number of common elements is reported, as well as the probability
     * to observe at least this number of common elements by chance alone.
     */
    public RSATWS.CompareClassesResponse compare_classes(RSATWS.CompareClassesRequest request) throws java.rmi.RemoteException;

    /**
     * Interconversions between different formats of cluster files.
     */
    public RSATWS.ConvertClassesResponse convert_classes(RSATWS.ConvertClassesRequest request) throws java.rmi.RemoteException;

    /**
     * This programs takes as input a contingency table, and calculates
     * various     matching statistics between the rows and columns. The
     * description of these statistics can be found in Brohee and van Helden
     * (2006).
     */
    public RSATWS.ContingencyStatsResponse contingency_stats(RSATWS.ContingencyStatsRequest request) throws java.rmi.RemoteException;

    /**
     * Create a contingency table from a two-column file.
     */
    public RSATWS.ContingencyTableResponse contingency_table(RSATWS.ContingencyTableRequest request) throws java.rmi.RemoteException;

    /**
     * Scan sequences with one or several position-specific scoring
     * matrices (PSSM) to identify instances of the corresponding motifs(putative
     * sites). This program supports a variety of background models (Bernoulli,
     * Markov chains of any order).
     */
    public RSATWS.MatrixScanResponse matrix_scan(RSATWS.MatrixScanRequest request) throws java.rmi.RemoteException;

    /**
     * Returns the theoretical distribution of matrix weight within
     * the defined background model.
     */
    public RSATWS.MatrixDistribResponse matrix_distrib(RSATWS.MatrixDistribRequest request) throws java.rmi.RemoteException;

    /**
     * Generates random sequences.
     */
    public RSATWS.RandomSequenceResponse random_seq(RSATWS.RandomSequenceRequest request) throws java.rmi.RemoteException;

    /**
     * Convert graphs between different formats
     */
    public RSATWS.ConvertGraphResponse convert_graph(RSATWS.ConvertGraphRequest request) throws java.rmi.RemoteException;

    /**
     * Alter a graph either by adding or removing edges or nodes
     */
    public RSATWS.AlterGraphResponse alter_graph(RSATWS.AlterGraphRequest request) throws java.rmi.RemoteException;

    /**
     * Find all cliques in a graph
     */
    public RSATWS.GraphCliquesResponse graph_cliques(RSATWS.GraphCliquesRequest request) throws java.rmi.RemoteException;

    /**
     * Produces the figure of a graph
     */
    public RSATWS.DisplayGraphResponse display_graph(RSATWS.DisplayGraphRequest request) throws java.rmi.RemoteException;

    /**
     * Produces the figure of a heatmap
     */
    public RSATWS.DrawHeatmapResponse draw_heatmap(RSATWS.DrawHeatmapRequest request) throws java.rmi.RemoteException;

    /**
     * Computes the union / difference or intersection of two graphs
     */
    public RSATWS.CompareGraphsResponse compare_graphs(RSATWS.CompareGraphsRequest request) throws java.rmi.RemoteException;

    /**
     * Calculates the in / out / global degree for a selection of
     * seed nodes
     */
    public RSATWS.GraphNodeDegreeResponse graph_node_degree(RSATWS.GraphNodeDegreeRequest request) throws java.rmi.RemoteException;

    /**
     * Calculate the node degree, the closeness and the betweenness
     * of each node and specifies if this node is a seed or a target node.
     */
    public RSATWS.GraphTopologyResponse graph_topology(RSATWS.GraphTopologyRequest request) throws java.rmi.RemoteException;

    /**
     * Map a clustering result onto a graph, and compute the membership
     * degree
     *     between each node and each cluster, on the basis of egdes linking
     * this node to the cluster.
     */
    public RSATWS.GraphClusterMembershipResponse graph_cluster_membership(RSATWS.GraphClusterMembershipRequest request) throws java.rmi.RemoteException;

    /**
     * Generate random graphs either from scratch of
     * 	      from an existing graph using different randomization models
     */
    public RSATWS.RandomGraphResponse random_graph(RSATWS.RandomGraphRequest request) throws java.rmi.RemoteException;

    /**
     * Compares a graph with a classification/clustering file.
     */
    public RSATWS.GraphGetClustersResponse graph_get_clusters(RSATWS.GraphGetClustersRequest request) throws java.rmi.RemoteException;

    /**
     * Find the neihbours up to a certain distance of a collection
     * of seed nodes
     */
    public RSATWS.GraphNeighboursResponse graph_neighbours(RSATWS.GraphNeighboursRequest request) throws java.rmi.RemoteException;

    /**
     * Clustering via Stijn van Dongen MCL algorithm
     */
    public RSATWS.MCLResponse mcl(RSATWS.MCLRequest request) throws java.rmi.RemoteException;

    /**
     * Clustering via Andrew King RNSC algorithm
     */
    public RSATWS.RNSCResponse rnsc(RSATWS.RNSCRequest request) throws java.rmi.RemoteException;

    /**
     * Monitoring the status of a job
     */
    public RSATWS.MonitorResponse monitor(RSATWS.MonitorRequest request) throws java.rmi.RemoteException;

    /**
     * Get result of a job
     */
    public RSATWS.GetResultResponse get_result(RSATWS.GetResultRequest request) throws java.rmi.RemoteException;
}
