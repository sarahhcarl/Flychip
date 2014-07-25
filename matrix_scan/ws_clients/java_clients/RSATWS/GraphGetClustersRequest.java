/**
 * GraphGetClustersRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.3 Oct 05, 2005 (05:23:37 EDT) WSDL2Java emitter.
 */

package RSATWS;

public class GraphGetClustersRequest  implements java.io.Serializable {
    /* Input format. Supported: tab, gml. */
    private java.lang.String informat;

    /* Return format. Supported: table, cluster, graph. */
    private java.lang.String _return;

    /* Output format. Supported: tab, gml, dot. */
    private java.lang.String outformat;

    /* A graph in the format specified by the informat tag. */
    private java.lang.String inputgraph;

    /* Specification of the clusters to which belong the nodes. */
    private java.lang.String clusters;

    /* Specify a column of the input graph that contains an edge weight
     * or an edge label (default none) for the tab-delimited format. */
    private java.lang.Integer wcol;

    /* Specify a column of the input graph that contains the source
     * nodes for the tab-delimited format (default = 1). */
    private java.lang.Integer scol;

    /* Specify a column of the input graph that contains the target
     * nodes for the tab-delimited format (default = 2). */
    private java.lang.Integer tcol;

    /* As some nodes may belong to more than one group, using this
     * option will duplicate the nodes belonging to more than one group. */
    private java.lang.Integer distinct;

    /* Using this option, only the first column of the cluster file
     * will be taken into account. 
     * The output graph will thus consist in the graph induced by all nodes
     * of the first column. */
    private java.lang.Integer induced;

    public GraphGetClustersRequest() {
    }

    public GraphGetClustersRequest(
           java.lang.String informat,
           java.lang.String _return,
           java.lang.String outformat,
           java.lang.String inputgraph,
           java.lang.String clusters,
           java.lang.Integer wcol,
           java.lang.Integer scol,
           java.lang.Integer tcol,
           java.lang.Integer distinct,
           java.lang.Integer induced) {
           this.informat = informat;
           this._return = _return;
           this.outformat = outformat;
           this.inputgraph = inputgraph;
           this.clusters = clusters;
           this.wcol = wcol;
           this.scol = scol;
           this.tcol = tcol;
           this.distinct = distinct;
           this.induced = induced;
    }


    /**
     * Gets the informat value for this GraphGetClustersRequest.
     * 
     * @return informat   * Input format. Supported: tab, gml.
     */
    public java.lang.String getInformat() {
        return informat;
    }


    /**
     * Sets the informat value for this GraphGetClustersRequest.
     * 
     * @param informat   * Input format. Supported: tab, gml.
     */
    public void setInformat(java.lang.String informat) {
        this.informat = informat;
    }


    /**
     * Gets the _return value for this GraphGetClustersRequest.
     * 
     * @return _return   * Return format. Supported: table, cluster, graph.
     */
    public java.lang.String get_return() {
        return _return;
    }


    /**
     * Sets the _return value for this GraphGetClustersRequest.
     * 
     * @param _return   * Return format. Supported: table, cluster, graph.
     */
    public void set_return(java.lang.String _return) {
        this._return = _return;
    }


    /**
     * Gets the outformat value for this GraphGetClustersRequest.
     * 
     * @return outformat   * Output format. Supported: tab, gml, dot.
     */
    public java.lang.String getOutformat() {
        return outformat;
    }


    /**
     * Sets the outformat value for this GraphGetClustersRequest.
     * 
     * @param outformat   * Output format. Supported: tab, gml, dot.
     */
    public void setOutformat(java.lang.String outformat) {
        this.outformat = outformat;
    }


    /**
     * Gets the inputgraph value for this GraphGetClustersRequest.
     * 
     * @return inputgraph   * A graph in the format specified by the informat tag.
     */
    public java.lang.String getInputgraph() {
        return inputgraph;
    }


    /**
     * Sets the inputgraph value for this GraphGetClustersRequest.
     * 
     * @param inputgraph   * A graph in the format specified by the informat tag.
     */
    public void setInputgraph(java.lang.String inputgraph) {
        this.inputgraph = inputgraph;
    }


    /**
     * Gets the clusters value for this GraphGetClustersRequest.
     * 
     * @return clusters   * Specification of the clusters to which belong the nodes.
     */
    public java.lang.String getClusters() {
        return clusters;
    }


    /**
     * Sets the clusters value for this GraphGetClustersRequest.
     * 
     * @param clusters   * Specification of the clusters to which belong the nodes.
     */
    public void setClusters(java.lang.String clusters) {
        this.clusters = clusters;
    }


    /**
     * Gets the wcol value for this GraphGetClustersRequest.
     * 
     * @return wcol   * Specify a column of the input graph that contains an edge weight
     * or an edge label (default none) for the tab-delimited format.
     */
    public java.lang.Integer getWcol() {
        return wcol;
    }


    /**
     * Sets the wcol value for this GraphGetClustersRequest.
     * 
     * @param wcol   * Specify a column of the input graph that contains an edge weight
     * or an edge label (default none) for the tab-delimited format.
     */
    public void setWcol(java.lang.Integer wcol) {
        this.wcol = wcol;
    }


    /**
     * Gets the scol value for this GraphGetClustersRequest.
     * 
     * @return scol   * Specify a column of the input graph that contains the source
     * nodes for the tab-delimited format (default = 1).
     */
    public java.lang.Integer getScol() {
        return scol;
    }


    /**
     * Sets the scol value for this GraphGetClustersRequest.
     * 
     * @param scol   * Specify a column of the input graph that contains the source
     * nodes for the tab-delimited format (default = 1).
     */
    public void setScol(java.lang.Integer scol) {
        this.scol = scol;
    }


    /**
     * Gets the tcol value for this GraphGetClustersRequest.
     * 
     * @return tcol   * Specify a column of the input graph that contains the target
     * nodes for the tab-delimited format (default = 2).
     */
    public java.lang.Integer getTcol() {
        return tcol;
    }


    /**
     * Sets the tcol value for this GraphGetClustersRequest.
     * 
     * @param tcol   * Specify a column of the input graph that contains the target
     * nodes for the tab-delimited format (default = 2).
     */
    public void setTcol(java.lang.Integer tcol) {
        this.tcol = tcol;
    }


    /**
     * Gets the distinct value for this GraphGetClustersRequest.
     * 
     * @return distinct   * As some nodes may belong to more than one group, using this
     * option will duplicate the nodes belonging to more than one group.
     */
    public java.lang.Integer getDistinct() {
        return distinct;
    }


    /**
     * Sets the distinct value for this GraphGetClustersRequest.
     * 
     * @param distinct   * As some nodes may belong to more than one group, using this
     * option will duplicate the nodes belonging to more than one group.
     */
    public void setDistinct(java.lang.Integer distinct) {
        this.distinct = distinct;
    }


    /**
     * Gets the induced value for this GraphGetClustersRequest.
     * 
     * @return induced   * Using this option, only the first column of the cluster file
     * will be taken into account. 
     * The output graph will thus consist in the graph induced by all nodes
     * of the first column.
     */
    public java.lang.Integer getInduced() {
        return induced;
    }


    /**
     * Sets the induced value for this GraphGetClustersRequest.
     * 
     * @param induced   * Using this option, only the first column of the cluster file
     * will be taken into account. 
     * The output graph will thus consist in the graph induced by all nodes
     * of the first column.
     */
    public void setInduced(java.lang.Integer induced) {
        this.induced = induced;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GraphGetClustersRequest)) return false;
        GraphGetClustersRequest other = (GraphGetClustersRequest) obj;
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
            ((this._return==null && other.get_return()==null) || 
             (this._return!=null &&
              this._return.equals(other.get_return()))) &&
            ((this.outformat==null && other.getOutformat()==null) || 
             (this.outformat!=null &&
              this.outformat.equals(other.getOutformat()))) &&
            ((this.inputgraph==null && other.getInputgraph()==null) || 
             (this.inputgraph!=null &&
              this.inputgraph.equals(other.getInputgraph()))) &&
            ((this.clusters==null && other.getClusters()==null) || 
             (this.clusters!=null &&
              this.clusters.equals(other.getClusters()))) &&
            ((this.wcol==null && other.getWcol()==null) || 
             (this.wcol!=null &&
              this.wcol.equals(other.getWcol()))) &&
            ((this.scol==null && other.getScol()==null) || 
             (this.scol!=null &&
              this.scol.equals(other.getScol()))) &&
            ((this.tcol==null && other.getTcol()==null) || 
             (this.tcol!=null &&
              this.tcol.equals(other.getTcol()))) &&
            ((this.distinct==null && other.getDistinct()==null) || 
             (this.distinct!=null &&
              this.distinct.equals(other.getDistinct()))) &&
            ((this.induced==null && other.getInduced()==null) || 
             (this.induced!=null &&
              this.induced.equals(other.getInduced())));
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
        if (get_return() != null) {
            _hashCode += get_return().hashCode();
        }
        if (getOutformat() != null) {
            _hashCode += getOutformat().hashCode();
        }
        if (getInputgraph() != null) {
            _hashCode += getInputgraph().hashCode();
        }
        if (getClusters() != null) {
            _hashCode += getClusters().hashCode();
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
        if (getDistinct() != null) {
            _hashCode += getDistinct().hashCode();
        }
        if (getInduced() != null) {
            _hashCode += getInduced().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GraphGetClustersRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:RSATWS", "GraphGetClustersRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("informat");
        elemField.setXmlName(new javax.xml.namespace.QName("", "informat"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("_return");
        elemField.setXmlName(new javax.xml.namespace.QName("", "return"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("clusters");
        elemField.setXmlName(new javax.xml.namespace.QName("", "clusters"));
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
        elemField.setFieldName("distinct");
        elemField.setXmlName(new javax.xml.namespace.QName("", "distinct"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("induced");
        elemField.setXmlName(new javax.xml.namespace.QName("", "induced"));
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
