/**
 * AlterGraphRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.3 Oct 05, 2005 (05:23:37 EDT) WSDL2Java emitter.
 */

package RSATWS;

public class AlterGraphRequest  implements java.io.Serializable {
    /* Input format. Supported: tab, gml, adj_matrix. */
    private java.lang.String informat;

    /* Output format. Supported: tab, gml, dot, adj_matrix. */
    private java.lang.String outformat;

    /* A graph in the format specified by the informat tag. */
    private java.lang.String inputgraph;

    /* Specify a column of the input graph that contains an edge weight
     * or an edge label for the tab-delimited format (no default). */
    private java.lang.Integer wcol;

    /* Specify a column of the input graph that contains the source
     * nodes for the tab-delimited format (default = 1). */
    private java.lang.Integer scol;

    /* Specify a column of the input graph that contains the target
     * nodes for the tab-delimited format (default = 2). */
    private java.lang.Integer tcol;

    /* Specifies whether the edges must be considered as directed,
     * i.e., an     edge from node A to node B is different from an edge
     * from B to A (by default, edges are not directed). */
    private java.lang.Integer directed;

    /* Specifies whether more than one edge may link two nodes. (by
     * default, duplicated edges are not allowed). */
    private java.lang.Integer duplicate;

    /* Allows self loops (by default, self loops are not allowed) */
    private java.lang.Integer self;

    /* Nodes that have to be removed in the graph (if existing). The
     * node names must be separated by comas. */
    private java.lang.String target;

    /* Number of edges to add. This value can either be a percentage
     * value or a discrete number. */
    private java.lang.String add_nodes;

    /* Number of edges to remove. This value can either be a percentage
     * value or a discrete number. */
    private java.lang.String rm_nodes;

    /* Number of edges to add. This value can either be a percentage
     * value or a discrete number. */
    private java.lang.String add_edges;

    /* Number of edges to remove. This value can either be a percentage
     * value or a discrete number. */
    private java.lang.String rm_edges;

    public AlterGraphRequest() {
    }

    public AlterGraphRequest(
           java.lang.String informat,
           java.lang.String outformat,
           java.lang.String inputgraph,
           java.lang.Integer wcol,
           java.lang.Integer scol,
           java.lang.Integer tcol,
           java.lang.Integer directed,
           java.lang.Integer duplicate,
           java.lang.Integer self,
           java.lang.String target,
           java.lang.String add_nodes,
           java.lang.String rm_nodes,
           java.lang.String add_edges,
           java.lang.String rm_edges) {
           this.informat = informat;
           this.outformat = outformat;
           this.inputgraph = inputgraph;
           this.wcol = wcol;
           this.scol = scol;
           this.tcol = tcol;
           this.directed = directed;
           this.duplicate = duplicate;
           this.self = self;
           this.target = target;
           this.add_nodes = add_nodes;
           this.rm_nodes = rm_nodes;
           this.add_edges = add_edges;
           this.rm_edges = rm_edges;
    }


    /**
     * Gets the informat value for this AlterGraphRequest.
     * 
     * @return informat   * Input format. Supported: tab, gml, adj_matrix.
     */
    public java.lang.String getInformat() {
        return informat;
    }


    /**
     * Sets the informat value for this AlterGraphRequest.
     * 
     * @param informat   * Input format. Supported: tab, gml, adj_matrix.
     */
    public void setInformat(java.lang.String informat) {
        this.informat = informat;
    }


    /**
     * Gets the outformat value for this AlterGraphRequest.
     * 
     * @return outformat   * Output format. Supported: tab, gml, dot, adj_matrix.
     */
    public java.lang.String getOutformat() {
        return outformat;
    }


    /**
     * Sets the outformat value for this AlterGraphRequest.
     * 
     * @param outformat   * Output format. Supported: tab, gml, dot, adj_matrix.
     */
    public void setOutformat(java.lang.String outformat) {
        this.outformat = outformat;
    }


    /**
     * Gets the inputgraph value for this AlterGraphRequest.
     * 
     * @return inputgraph   * A graph in the format specified by the informat tag.
     */
    public java.lang.String getInputgraph() {
        return inputgraph;
    }


    /**
     * Sets the inputgraph value for this AlterGraphRequest.
     * 
     * @param inputgraph   * A graph in the format specified by the informat tag.
     */
    public void setInputgraph(java.lang.String inputgraph) {
        this.inputgraph = inputgraph;
    }


    /**
     * Gets the wcol value for this AlterGraphRequest.
     * 
     * @return wcol   * Specify a column of the input graph that contains an edge weight
     * or an edge label for the tab-delimited format (no default).
     */
    public java.lang.Integer getWcol() {
        return wcol;
    }


    /**
     * Sets the wcol value for this AlterGraphRequest.
     * 
     * @param wcol   * Specify a column of the input graph that contains an edge weight
     * or an edge label for the tab-delimited format (no default).
     */
    public void setWcol(java.lang.Integer wcol) {
        this.wcol = wcol;
    }


    /**
     * Gets the scol value for this AlterGraphRequest.
     * 
     * @return scol   * Specify a column of the input graph that contains the source
     * nodes for the tab-delimited format (default = 1).
     */
    public java.lang.Integer getScol() {
        return scol;
    }


    /**
     * Sets the scol value for this AlterGraphRequest.
     * 
     * @param scol   * Specify a column of the input graph that contains the source
     * nodes for the tab-delimited format (default = 1).
     */
    public void setScol(java.lang.Integer scol) {
        this.scol = scol;
    }


    /**
     * Gets the tcol value for this AlterGraphRequest.
     * 
     * @return tcol   * Specify a column of the input graph that contains the target
     * nodes for the tab-delimited format (default = 2).
     */
    public java.lang.Integer getTcol() {
        return tcol;
    }


    /**
     * Sets the tcol value for this AlterGraphRequest.
     * 
     * @param tcol   * Specify a column of the input graph that contains the target
     * nodes for the tab-delimited format (default = 2).
     */
    public void setTcol(java.lang.Integer tcol) {
        this.tcol = tcol;
    }


    /**
     * Gets the directed value for this AlterGraphRequest.
     * 
     * @return directed   * Specifies whether the edges must be considered as directed,
     * i.e., an     edge from node A to node B is different from an edge
     * from B to A (by default, edges are not directed).
     */
    public java.lang.Integer getDirected() {
        return directed;
    }


    /**
     * Sets the directed value for this AlterGraphRequest.
     * 
     * @param directed   * Specifies whether the edges must be considered as directed,
     * i.e., an     edge from node A to node B is different from an edge
     * from B to A (by default, edges are not directed).
     */
    public void setDirected(java.lang.Integer directed) {
        this.directed = directed;
    }


    /**
     * Gets the duplicate value for this AlterGraphRequest.
     * 
     * @return duplicate   * Specifies whether more than one edge may link two nodes. (by
     * default, duplicated edges are not allowed).
     */
    public java.lang.Integer getDuplicate() {
        return duplicate;
    }


    /**
     * Sets the duplicate value for this AlterGraphRequest.
     * 
     * @param duplicate   * Specifies whether more than one edge may link two nodes. (by
     * default, duplicated edges are not allowed).
     */
    public void setDuplicate(java.lang.Integer duplicate) {
        this.duplicate = duplicate;
    }


    /**
     * Gets the self value for this AlterGraphRequest.
     * 
     * @return self   * Allows self loops (by default, self loops are not allowed)
     */
    public java.lang.Integer getSelf() {
        return self;
    }


    /**
     * Sets the self value for this AlterGraphRequest.
     * 
     * @param self   * Allows self loops (by default, self loops are not allowed)
     */
    public void setSelf(java.lang.Integer self) {
        this.self = self;
    }


    /**
     * Gets the target value for this AlterGraphRequest.
     * 
     * @return target   * Nodes that have to be removed in the graph (if existing). The
     * node names must be separated by comas.
     */
    public java.lang.String getTarget() {
        return target;
    }


    /**
     * Sets the target value for this AlterGraphRequest.
     * 
     * @param target   * Nodes that have to be removed in the graph (if existing). The
     * node names must be separated by comas.
     */
    public void setTarget(java.lang.String target) {
        this.target = target;
    }


    /**
     * Gets the add_nodes value for this AlterGraphRequest.
     * 
     * @return add_nodes   * Number of edges to add. This value can either be a percentage
     * value or a discrete number.
     */
    public java.lang.String getAdd_nodes() {
        return add_nodes;
    }


    /**
     * Sets the add_nodes value for this AlterGraphRequest.
     * 
     * @param add_nodes   * Number of edges to add. This value can either be a percentage
     * value or a discrete number.
     */
    public void setAdd_nodes(java.lang.String add_nodes) {
        this.add_nodes = add_nodes;
    }


    /**
     * Gets the rm_nodes value for this AlterGraphRequest.
     * 
     * @return rm_nodes   * Number of edges to remove. This value can either be a percentage
     * value or a discrete number.
     */
    public java.lang.String getRm_nodes() {
        return rm_nodes;
    }


    /**
     * Sets the rm_nodes value for this AlterGraphRequest.
     * 
     * @param rm_nodes   * Number of edges to remove. This value can either be a percentage
     * value or a discrete number.
     */
    public void setRm_nodes(java.lang.String rm_nodes) {
        this.rm_nodes = rm_nodes;
    }


    /**
     * Gets the add_edges value for this AlterGraphRequest.
     * 
     * @return add_edges   * Number of edges to add. This value can either be a percentage
     * value or a discrete number.
     */
    public java.lang.String getAdd_edges() {
        return add_edges;
    }


    /**
     * Sets the add_edges value for this AlterGraphRequest.
     * 
     * @param add_edges   * Number of edges to add. This value can either be a percentage
     * value or a discrete number.
     */
    public void setAdd_edges(java.lang.String add_edges) {
        this.add_edges = add_edges;
    }


    /**
     * Gets the rm_edges value for this AlterGraphRequest.
     * 
     * @return rm_edges   * Number of edges to remove. This value can either be a percentage
     * value or a discrete number.
     */
    public java.lang.String getRm_edges() {
        return rm_edges;
    }


    /**
     * Sets the rm_edges value for this AlterGraphRequest.
     * 
     * @param rm_edges   * Number of edges to remove. This value can either be a percentage
     * value or a discrete number.
     */
    public void setRm_edges(java.lang.String rm_edges) {
        this.rm_edges = rm_edges;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AlterGraphRequest)) return false;
        AlterGraphRequest other = (AlterGraphRequest) obj;
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
            ((this.wcol==null && other.getWcol()==null) || 
             (this.wcol!=null &&
              this.wcol.equals(other.getWcol()))) &&
            ((this.scol==null && other.getScol()==null) || 
             (this.scol!=null &&
              this.scol.equals(other.getScol()))) &&
            ((this.tcol==null && other.getTcol()==null) || 
             (this.tcol!=null &&
              this.tcol.equals(other.getTcol()))) &&
            ((this.directed==null && other.getDirected()==null) || 
             (this.directed!=null &&
              this.directed.equals(other.getDirected()))) &&
            ((this.duplicate==null && other.getDuplicate()==null) || 
             (this.duplicate!=null &&
              this.duplicate.equals(other.getDuplicate()))) &&
            ((this.self==null && other.getSelf()==null) || 
             (this.self!=null &&
              this.self.equals(other.getSelf()))) &&
            ((this.target==null && other.getTarget()==null) || 
             (this.target!=null &&
              this.target.equals(other.getTarget()))) &&
            ((this.add_nodes==null && other.getAdd_nodes()==null) || 
             (this.add_nodes!=null &&
              this.add_nodes.equals(other.getAdd_nodes()))) &&
            ((this.rm_nodes==null && other.getRm_nodes()==null) || 
             (this.rm_nodes!=null &&
              this.rm_nodes.equals(other.getRm_nodes()))) &&
            ((this.add_edges==null && other.getAdd_edges()==null) || 
             (this.add_edges!=null &&
              this.add_edges.equals(other.getAdd_edges()))) &&
            ((this.rm_edges==null && other.getRm_edges()==null) || 
             (this.rm_edges!=null &&
              this.rm_edges.equals(other.getRm_edges())));
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
        if (getWcol() != null) {
            _hashCode += getWcol().hashCode();
        }
        if (getScol() != null) {
            _hashCode += getScol().hashCode();
        }
        if (getTcol() != null) {
            _hashCode += getTcol().hashCode();
        }
        if (getDirected() != null) {
            _hashCode += getDirected().hashCode();
        }
        if (getDuplicate() != null) {
            _hashCode += getDuplicate().hashCode();
        }
        if (getSelf() != null) {
            _hashCode += getSelf().hashCode();
        }
        if (getTarget() != null) {
            _hashCode += getTarget().hashCode();
        }
        if (getAdd_nodes() != null) {
            _hashCode += getAdd_nodes().hashCode();
        }
        if (getRm_nodes() != null) {
            _hashCode += getRm_nodes().hashCode();
        }
        if (getAdd_edges() != null) {
            _hashCode += getAdd_edges().hashCode();
        }
        if (getRm_edges() != null) {
            _hashCode += getRm_edges().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AlterGraphRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:RSATWS", "AlterGraphRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("informat");
        elemField.setXmlName(new javax.xml.namespace.QName("", "informat"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("outformat");
        elemField.setXmlName(new javax.xml.namespace.QName("", "outformat"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("inputgraph");
        elemField.setXmlName(new javax.xml.namespace.QName("", "inputgraph"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
        elemField.setFieldName("directed");
        elemField.setXmlName(new javax.xml.namespace.QName("", "directed"));
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
        elemField.setFieldName("self");
        elemField.setXmlName(new javax.xml.namespace.QName("", "self"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("target");
        elemField.setXmlName(new javax.xml.namespace.QName("", "target"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("add_nodes");
        elemField.setXmlName(new javax.xml.namespace.QName("", "add_nodes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rm_nodes");
        elemField.setXmlName(new javax.xml.namespace.QName("", "rm_nodes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("add_edges");
        elemField.setXmlName(new javax.xml.namespace.QName("", "add_edges"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rm_edges");
        elemField.setXmlName(new javax.xml.namespace.QName("", "rm_edges"));
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
