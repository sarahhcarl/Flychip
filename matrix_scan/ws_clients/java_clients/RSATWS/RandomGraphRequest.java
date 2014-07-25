/**
 * RandomGraphRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.3 Oct 05, 2005 (05:23:37 EDT) WSDL2Java emitter.
 */

package RSATWS;

public class RandomGraphRequest  implements java.io.Serializable {
    /* Input format. Supported: tab, gml. */
    private java.lang.String informat;

    /* Output format. Supported: tab, gml, dot. */
    private java.lang.String outformat;

    /* A graph in the format specified by the informat tag. */
    private java.lang.String inputgraph;

    /* Randomization type:
     * - scratch (de novo graph) : don't forget to specify the number of
     * nodes and of edges,
     * - ER (Erdos-Renyii randomization) : corresponds to the randomization
     * of a input graph, keeping the nodes and the number of edges but changing
     * its characteristics,
     * - node_degree : each node will keep the same degree that in the input
     * graph (edge randomization),
     * - node_degree_distrib : the global distribution of node degree will
     * remain the same as in the input graph. */
    private java.lang.String random_type;

    /* Specify a column of the input graph that contains an edge weight
     * or an edge label (default none) for the tab-delimited format. */
    private java.lang.Integer wcol;

    /* Specify a column of the input graph that contains the source
     * nodes for the tab-delimited format (default = 1). */
    private java.lang.Integer scol;

    /* Specify a column of the input graph that contains the target
     * nodes for the tab-delimited format (default = 2). */
    private java.lang.Integer tcol;

    /* Number of requested edges (for scratch randomization type). */
    private java.lang.Integer edges;

    /* Maximal degree of the nodes in the ER random graph. */
    private java.lang.Integer degree;

    /* Number of requested nodes (for scratch randomization type). */
    private java.lang.Integer nodes;

    /* Mean value on the weight of the arcs. This argument can only
     * be used with the scratch and ER randomization type and must be combined
     * with the -sd option. */
    private java.lang.Float mean;

    /* Standard deviation value of the weight of the arcs. This argument
     * can only be used with the scratch and ER randomization type and must
     * be combined with the -mean option. */
    private java.lang.Float sd;

    /* Indicates whether the graphs must be considered as directed,
     * i.e., an arc from node A to node B is different from an arc from B
     * to A. */
    private java.lang.Integer directed;

    /* Prevent the ER / scratch graph from containing nodes with no
     * neighbour. */
    private java.lang.Integer no_single;

    /* Specifies whether more than one edge may link two nodes (by
     * default, duplicated edges are not allowed). */
    private java.lang.Integer duplicate;

    /* Only compatible with ER randomization of a graph. Source and
     * target nodes stay source and target nodes in the randomized graph. */
    private java.lang.Integer col_conservation;

    /* This option can only be used with ER randomization type and
     * if the input graph is weighted. 
     * Using this option will generate randomly the weight of the output
     * random graph according to a normal distribution of weights. 
     * The mean and standard deviation can then be chosen (-mean and -sd
     * option) or will be calculated according to the weights the input graph. */
    private java.lang.Integer normal;

    public RandomGraphRequest() {
    }

    public RandomGraphRequest(
           java.lang.String informat,
           java.lang.String outformat,
           java.lang.String inputgraph,
           java.lang.String random_type,
           java.lang.Integer wcol,
           java.lang.Integer scol,
           java.lang.Integer tcol,
           java.lang.Integer edges,
           java.lang.Integer degree,
           java.lang.Integer nodes,
           java.lang.Float mean,
           java.lang.Float sd,
           java.lang.Integer directed,
           java.lang.Integer no_single,
           java.lang.Integer duplicate,
           java.lang.Integer col_conservation,
           java.lang.Integer normal) {
           this.informat = informat;
           this.outformat = outformat;
           this.inputgraph = inputgraph;
           this.random_type = random_type;
           this.wcol = wcol;
           this.scol = scol;
           this.tcol = tcol;
           this.edges = edges;
           this.degree = degree;
           this.nodes = nodes;
           this.mean = mean;
           this.sd = sd;
           this.directed = directed;
           this.no_single = no_single;
           this.duplicate = duplicate;
           this.col_conservation = col_conservation;
           this.normal = normal;
    }


    /**
     * Gets the informat value for this RandomGraphRequest.
     * 
     * @return informat   * Input format. Supported: tab, gml.
     */
    public java.lang.String getInformat() {
        return informat;
    }


    /**
     * Sets the informat value for this RandomGraphRequest.
     * 
     * @param informat   * Input format. Supported: tab, gml.
     */
    public void setInformat(java.lang.String informat) {
        this.informat = informat;
    }


    /**
     * Gets the outformat value for this RandomGraphRequest.
     * 
     * @return outformat   * Output format. Supported: tab, gml, dot.
     */
    public java.lang.String getOutformat() {
        return outformat;
    }


    /**
     * Sets the outformat value for this RandomGraphRequest.
     * 
     * @param outformat   * Output format. Supported: tab, gml, dot.
     */
    public void setOutformat(java.lang.String outformat) {
        this.outformat = outformat;
    }


    /**
     * Gets the inputgraph value for this RandomGraphRequest.
     * 
     * @return inputgraph   * A graph in the format specified by the informat tag.
     */
    public java.lang.String getInputgraph() {
        return inputgraph;
    }


    /**
     * Sets the inputgraph value for this RandomGraphRequest.
     * 
     * @param inputgraph   * A graph in the format specified by the informat tag.
     */
    public void setInputgraph(java.lang.String inputgraph) {
        this.inputgraph = inputgraph;
    }


    /**
     * Gets the random_type value for this RandomGraphRequest.
     * 
     * @return random_type   * Randomization type:
     * - scratch (de novo graph) : don't forget to specify the number of
     * nodes and of edges,
     * - ER (Erdos-Renyii randomization) : corresponds to the randomization
     * of a input graph, keeping the nodes and the number of edges but changing
     * its characteristics,
     * - node_degree : each node will keep the same degree that in the input
     * graph (edge randomization),
     * - node_degree_distrib : the global distribution of node degree will
     * remain the same as in the input graph.
     */
    public java.lang.String getRandom_type() {
        return random_type;
    }


    /**
     * Sets the random_type value for this RandomGraphRequest.
     * 
     * @param random_type   * Randomization type:
     * - scratch (de novo graph) : don't forget to specify the number of
     * nodes and of edges,
     * - ER (Erdos-Renyii randomization) : corresponds to the randomization
     * of a input graph, keeping the nodes and the number of edges but changing
     * its characteristics,
     * - node_degree : each node will keep the same degree that in the input
     * graph (edge randomization),
     * - node_degree_distrib : the global distribution of node degree will
     * remain the same as in the input graph.
     */
    public void setRandom_type(java.lang.String random_type) {
        this.random_type = random_type;
    }


    /**
     * Gets the wcol value for this RandomGraphRequest.
     * 
     * @return wcol   * Specify a column of the input graph that contains an edge weight
     * or an edge label (default none) for the tab-delimited format.
     */
    public java.lang.Integer getWcol() {
        return wcol;
    }


    /**
     * Sets the wcol value for this RandomGraphRequest.
     * 
     * @param wcol   * Specify a column of the input graph that contains an edge weight
     * or an edge label (default none) for the tab-delimited format.
     */
    public void setWcol(java.lang.Integer wcol) {
        this.wcol = wcol;
    }


    /**
     * Gets the scol value for this RandomGraphRequest.
     * 
     * @return scol   * Specify a column of the input graph that contains the source
     * nodes for the tab-delimited format (default = 1).
     */
    public java.lang.Integer getScol() {
        return scol;
    }


    /**
     * Sets the scol value for this RandomGraphRequest.
     * 
     * @param scol   * Specify a column of the input graph that contains the source
     * nodes for the tab-delimited format (default = 1).
     */
    public void setScol(java.lang.Integer scol) {
        this.scol = scol;
    }


    /**
     * Gets the tcol value for this RandomGraphRequest.
     * 
     * @return tcol   * Specify a column of the input graph that contains the target
     * nodes for the tab-delimited format (default = 2).
     */
    public java.lang.Integer getTcol() {
        return tcol;
    }


    /**
     * Sets the tcol value for this RandomGraphRequest.
     * 
     * @param tcol   * Specify a column of the input graph that contains the target
     * nodes for the tab-delimited format (default = 2).
     */
    public void setTcol(java.lang.Integer tcol) {
        this.tcol = tcol;
    }


    /**
     * Gets the edges value for this RandomGraphRequest.
     * 
     * @return edges   * Number of requested edges (for scratch randomization type).
     */
    public java.lang.Integer getEdges() {
        return edges;
    }


    /**
     * Sets the edges value for this RandomGraphRequest.
     * 
     * @param edges   * Number of requested edges (for scratch randomization type).
     */
    public void setEdges(java.lang.Integer edges) {
        this.edges = edges;
    }


    /**
     * Gets the degree value for this RandomGraphRequest.
     * 
     * @return degree   * Maximal degree of the nodes in the ER random graph.
     */
    public java.lang.Integer getDegree() {
        return degree;
    }


    /**
     * Sets the degree value for this RandomGraphRequest.
     * 
     * @param degree   * Maximal degree of the nodes in the ER random graph.
     */
    public void setDegree(java.lang.Integer degree) {
        this.degree = degree;
    }


    /**
     * Gets the nodes value for this RandomGraphRequest.
     * 
     * @return nodes   * Number of requested nodes (for scratch randomization type).
     */
    public java.lang.Integer getNodes() {
        return nodes;
    }


    /**
     * Sets the nodes value for this RandomGraphRequest.
     * 
     * @param nodes   * Number of requested nodes (for scratch randomization type).
     */
    public void setNodes(java.lang.Integer nodes) {
        this.nodes = nodes;
    }


    /**
     * Gets the mean value for this RandomGraphRequest.
     * 
     * @return mean   * Mean value on the weight of the arcs. This argument can only
     * be used with the scratch and ER randomization type and must be combined
     * with the -sd option.
     */
    public java.lang.Float getMean() {
        return mean;
    }


    /**
     * Sets the mean value for this RandomGraphRequest.
     * 
     * @param mean   * Mean value on the weight of the arcs. This argument can only
     * be used with the scratch and ER randomization type and must be combined
     * with the -sd option.
     */
    public void setMean(java.lang.Float mean) {
        this.mean = mean;
    }


    /**
     * Gets the sd value for this RandomGraphRequest.
     * 
     * @return sd   * Standard deviation value of the weight of the arcs. This argument
     * can only be used with the scratch and ER randomization type and must
     * be combined with the -mean option.
     */
    public java.lang.Float getSd() {
        return sd;
    }


    /**
     * Sets the sd value for this RandomGraphRequest.
     * 
     * @param sd   * Standard deviation value of the weight of the arcs. This argument
     * can only be used with the scratch and ER randomization type and must
     * be combined with the -mean option.
     */
    public void setSd(java.lang.Float sd) {
        this.sd = sd;
    }


    /**
     * Gets the directed value for this RandomGraphRequest.
     * 
     * @return directed   * Indicates whether the graphs must be considered as directed,
     * i.e., an arc from node A to node B is different from an arc from B
     * to A.
     */
    public java.lang.Integer getDirected() {
        return directed;
    }


    /**
     * Sets the directed value for this RandomGraphRequest.
     * 
     * @param directed   * Indicates whether the graphs must be considered as directed,
     * i.e., an arc from node A to node B is different from an arc from B
     * to A.
     */
    public void setDirected(java.lang.Integer directed) {
        this.directed = directed;
    }


    /**
     * Gets the no_single value for this RandomGraphRequest.
     * 
     * @return no_single   * Prevent the ER / scratch graph from containing nodes with no
     * neighbour.
     */
    public java.lang.Integer getNo_single() {
        return no_single;
    }


    /**
     * Sets the no_single value for this RandomGraphRequest.
     * 
     * @param no_single   * Prevent the ER / scratch graph from containing nodes with no
     * neighbour.
     */
    public void setNo_single(java.lang.Integer no_single) {
        this.no_single = no_single;
    }


    /**
     * Gets the duplicate value for this RandomGraphRequest.
     * 
     * @return duplicate   * Specifies whether more than one edge may link two nodes (by
     * default, duplicated edges are not allowed).
     */
    public java.lang.Integer getDuplicate() {
        return duplicate;
    }


    /**
     * Sets the duplicate value for this RandomGraphRequest.
     * 
     * @param duplicate   * Specifies whether more than one edge may link two nodes (by
     * default, duplicated edges are not allowed).
     */
    public void setDuplicate(java.lang.Integer duplicate) {
        this.duplicate = duplicate;
    }


    /**
     * Gets the col_conservation value for this RandomGraphRequest.
     * 
     * @return col_conservation   * Only compatible with ER randomization of a graph. Source and
     * target nodes stay source and target nodes in the randomized graph.
     */
    public java.lang.Integer getCol_conservation() {
        return col_conservation;
    }


    /**
     * Sets the col_conservation value for this RandomGraphRequest.
     * 
     * @param col_conservation   * Only compatible with ER randomization of a graph. Source and
     * target nodes stay source and target nodes in the randomized graph.
     */
    public void setCol_conservation(java.lang.Integer col_conservation) {
        this.col_conservation = col_conservation;
    }


    /**
     * Gets the normal value for this RandomGraphRequest.
     * 
     * @return normal   * This option can only be used with ER randomization type and
     * if the input graph is weighted. 
     * Using this option will generate randomly the weight of the output
     * random graph according to a normal distribution of weights. 
     * The mean and standard deviation can then be chosen (-mean and -sd
     * option) or will be calculated according to the weights the input graph.
     */
    public java.lang.Integer getNormal() {
        return normal;
    }


    /**
     * Sets the normal value for this RandomGraphRequest.
     * 
     * @param normal   * This option can only be used with ER randomization type and
     * if the input graph is weighted. 
     * Using this option will generate randomly the weight of the output
     * random graph according to a normal distribution of weights. 
     * The mean and standard deviation can then be chosen (-mean and -sd
     * option) or will be calculated according to the weights the input graph.
     */
    public void setNormal(java.lang.Integer normal) {
        this.normal = normal;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RandomGraphRequest)) return false;
        RandomGraphRequest other = (RandomGraphRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.informat==null && other.getInformat()==null) || 
             (this.informat!=null &&
              this.informat.equals(other.getInformat()))) &&
            ((this.outformat==null && other.getOutformat()==null) || 
             (this.outformat!=null &&
              this.outformat.equals(other.getOutformat()))) &&
            ((this.inputgraph==null && other.getInputgraph()==null) || 
             (this.inputgraph!=null &&
              this.inputgraph.equals(other.getInputgraph()))) &&
            ((this.random_type==null && other.getRandom_type()==null) || 
             (this.random_type!=null &&
              this.random_type.equals(other.getRandom_type()))) &&
            ((this.wcol==null && other.getWcol()==null) || 
             (this.wcol!=null &&
              this.wcol.equals(other.getWcol()))) &&
            ((this.scol==null && other.getScol()==null) || 
             (this.scol!=null &&
              this.scol.equals(other.getScol()))) &&
            ((this.tcol==null && other.getTcol()==null) || 
             (this.tcol!=null &&
              this.tcol.equals(other.getTcol()))) &&
            ((this.edges==null && other.getEdges()==null) || 
             (this.edges!=null &&
              this.edges.equals(other.getEdges()))) &&
            ((this.degree==null && other.getDegree()==null) || 
             (this.degree!=null &&
              this.degree.equals(other.getDegree()))) &&
            ((this.nodes==null && other.getNodes()==null) || 
             (this.nodes!=null &&
              this.nodes.equals(other.getNodes()))) &&
            ((this.mean==null && other.getMean()==null) || 
             (this.mean!=null &&
              this.mean.equals(other.getMean()))) &&
            ((this.sd==null && other.getSd()==null) || 
             (this.sd!=null &&
              this.sd.equals(other.getSd()))) &&
            ((this.directed==null && other.getDirected()==null) || 
             (this.directed!=null &&
              this.directed.equals(other.getDirected()))) &&
            ((this.no_single==null && other.getNo_single()==null) || 
             (this.no_single!=null &&
              this.no_single.equals(other.getNo_single()))) &&
            ((this.duplicate==null && other.getDuplicate()==null) || 
             (this.duplicate!=null &&
              this.duplicate.equals(other.getDuplicate()))) &&
            ((this.col_conservation==null && other.getCol_conservation()==null) || 
             (this.col_conservation!=null &&
              this.col_conservation.equals(other.getCol_conservation()))) &&
            ((this.normal==null && other.getNormal()==null) || 
             (this.normal!=null &&
              this.normal.equals(other.getNormal())));
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
        if (getInformat() != null) {
            _hashCode += getInformat().hashCode();
        }
        if (getOutformat() != null) {
            _hashCode += getOutformat().hashCode();
        }
        if (getInputgraph() != null) {
            _hashCode += getInputgraph().hashCode();
        }
        if (getRandom_type() != null) {
            _hashCode += getRandom_type().hashCode();
        }
        if (getWcol() != null) {
            _hashCode += getWcol().hashCode();
        }
        if (getScol() != null) {
            _hashCode += getScol().hashCode();
        }
        if (getTcol() != null) {
            _hashCode += getTcol().hashCode();
        }
        if (getEdges() != null) {
            _hashCode += getEdges().hashCode();
        }
        if (getDegree() != null) {
            _hashCode += getDegree().hashCode();
        }
        if (getNodes() != null) {
            _hashCode += getNodes().hashCode();
        }
        if (getMean() != null) {
            _hashCode += getMean().hashCode();
        }
        if (getSd() != null) {
            _hashCode += getSd().hashCode();
        }
        if (getDirected() != null) {
            _hashCode += getDirected().hashCode();
        }
        if (getNo_single() != null) {
            _hashCode += getNo_single().hashCode();
        }
        if (getDuplicate() != null) {
            _hashCode += getDuplicate().hashCode();
        }
        if (getCol_conservation() != null) {
            _hashCode += getCol_conservation().hashCode();
        }
        if (getNormal() != null) {
            _hashCode += getNormal().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RandomGraphRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:RSATWS", "RandomGraphRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("informat");
        elemField.setXmlName(new javax.xml.namespace.QName("", "informat"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("outformat");
        elemField.setXmlName(new javax.xml.namespace.QName("", "outformat"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("inputgraph");
        elemField.setXmlName(new javax.xml.namespace.QName("", "inputgraph"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("random_type");
        elemField.setXmlName(new javax.xml.namespace.QName("", "random_type"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("wcol");
        elemField.setXmlName(new javax.xml.namespace.QName("", "wcol"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("scol");
        elemField.setXmlName(new javax.xml.namespace.QName("", "scol"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tcol");
        elemField.setXmlName(new javax.xml.namespace.QName("", "tcol"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("edges");
        elemField.setXmlName(new javax.xml.namespace.QName("", "edges"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("degree");
        elemField.setXmlName(new javax.xml.namespace.QName("", "degree"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nodes");
        elemField.setXmlName(new javax.xml.namespace.QName("", "nodes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mean");
        elemField.setXmlName(new javax.xml.namespace.QName("", "mean"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "float"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sd");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sd"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "float"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("directed");
        elemField.setXmlName(new javax.xml.namespace.QName("", "directed"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("no_single");
        elemField.setXmlName(new javax.xml.namespace.QName("", "no_single"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("duplicate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "duplicate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("col_conservation");
        elemField.setXmlName(new javax.xml.namespace.QName("", "col_conservation"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("normal");
        elemField.setXmlName(new javax.xml.namespace.QName("", "normal"));
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
