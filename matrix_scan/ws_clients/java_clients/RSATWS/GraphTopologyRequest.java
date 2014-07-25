/**
 * GraphTopologyRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.3 Oct 05, 2005 (05:23:37 EDT) WSDL2Java emitter.
 */

package RSATWS;

public class GraphTopologyRequest  implements java.io.Serializable {
    /* Input format. Supported: tab, gml. */
    private java.lang.String informat;

    /* The statistics will be computed for all nodes. */
    private java.lang.Integer all;

    /* return type : degree, closeness, betweenness. More than one
     * statistics can be returned by separating the fields with ','. To return
     * all implemented statistics, you can use all. */
    private java.lang.String _return;

    /* A graph in the format specified by the informat tag. */
    private java.lang.String inputgraph;

    /* A file containing the nodes for which you want to know the
     * degree and other statistics. */
    private java.lang.String nodefile;

    /* Specifies whether the graph is directed or not (i.e. edge A-B
     * corresponds to edge B-A). In this case, the betweenness and the closeness
     * calculation will be rather different. By default the graph is not
     * directed. */
    private java.lang.Integer directed;

    /* Specify a column of the input graph that contains an edge weight
     * or an edge label (default none) for the tab-delimited format. */
    private java.lang.Integer wcol;

    /* Specify a column of the input graph that contains the source
     * nodes for the tab-delimited format (default = 1). */
    private java.lang.Integer scol;

    /* Specify a column of the input graph that contains the target
     * nodes for the tab-delimited format (default = 2). */
    private java.lang.Integer tcol;

    public GraphTopologyRequest() {
    }

    public GraphTopologyRequest(
           java.lang.String informat,
           java.lang.Integer all,
           java.lang.String _return,
           java.lang.String inputgraph,
           java.lang.String nodefile,
           java.lang.Integer directed,
           java.lang.Integer wcol,
           java.lang.Integer scol,
           java.lang.Integer tcol) {
           this.informat = informat;
           this.all = all;
           this._return = _return;
           this.inputgraph = inputgraph;
           this.nodefile = nodefile;
           this.directed = directed;
           this.wcol = wcol;
           this.scol = scol;
           this.tcol = tcol;
    }


    /**
     * Gets the informat value for this GraphTopologyRequest.
     * 
     * @return informat   * Input format. Supported: tab, gml.
     */
    public java.lang.String getInformat() {
        return informat;
    }


    /**
     * Sets the informat value for this GraphTopologyRequest.
     * 
     * @param informat   * Input format. Supported: tab, gml.
     */
    public void setInformat(java.lang.String informat) {
        this.informat = informat;
    }


    /**
     * Gets the all value for this GraphTopologyRequest.
     * 
     * @return all   * The statistics will be computed for all nodes.
     */
    public java.lang.Integer getAll() {
        return all;
    }


    /**
     * Sets the all value for this GraphTopologyRequest.
     * 
     * @param all   * The statistics will be computed for all nodes.
     */
    public void setAll(java.lang.Integer all) {
        this.all = all;
    }


    /**
     * Gets the _return value for this GraphTopologyRequest.
     * 
     * @return _return   * return type : degree, closeness, betweenness. More than one
     * statistics can be returned by separating the fields with ','. To return
     * all implemented statistics, you can use all.
     */
    public java.lang.String get_return() {
        return _return;
    }


    /**
     * Sets the _return value for this GraphTopologyRequest.
     * 
     * @param _return   * return type : degree, closeness, betweenness. More than one
     * statistics can be returned by separating the fields with ','. To return
     * all implemented statistics, you can use all.
     */
    public void set_return(java.lang.String _return) {
        this._return = _return;
    }


    /**
     * Gets the inputgraph value for this GraphTopologyRequest.
     * 
     * @return inputgraph   * A graph in the format specified by the informat tag.
     */
    public java.lang.String getInputgraph() {
        return inputgraph;
    }


    /**
     * Sets the inputgraph value for this GraphTopologyRequest.
     * 
     * @param inputgraph   * A graph in the format specified by the informat tag.
     */
    public void setInputgraph(java.lang.String inputgraph) {
        this.inputgraph = inputgraph;
    }


    /**
     * Gets the nodefile value for this GraphTopologyRequest.
     * 
     * @return nodefile   * A file containing the nodes for which you want to know the
     * degree and other statistics.
     */
    public java.lang.String getNodefile() {
        return nodefile;
    }


    /**
     * Sets the nodefile value for this GraphTopologyRequest.
     * 
     * @param nodefile   * A file containing the nodes for which you want to know the
     * degree and other statistics.
     */
    public void setNodefile(java.lang.String nodefile) {
        this.nodefile = nodefile;
    }


    /**
     * Gets the directed value for this GraphTopologyRequest.
     * 
     * @return directed   * Specifies whether the graph is directed or not (i.e. edge A-B
     * corresponds to edge B-A). In this case, the betweenness and the closeness
     * calculation will be rather different. By default the graph is not
     * directed.
     */
    public java.lang.Integer getDirected() {
        return directed;
    }


    /**
     * Sets the directed value for this GraphTopologyRequest.
     * 
     * @param directed   * Specifies whether the graph is directed or not (i.e. edge A-B
     * corresponds to edge B-A). In this case, the betweenness and the closeness
     * calculation will be rather different. By default the graph is not
     * directed.
     */
    public void setDirected(java.lang.Integer directed) {
        this.directed = directed;
    }


    /**
     * Gets the wcol value for this GraphTopologyRequest.
     * 
     * @return wcol   * Specify a column of the input graph that contains an edge weight
     * or an edge label (default none) for the tab-delimited format.
     */
    public java.lang.Integer getWcol() {
        return wcol;
    }


    /**
     * Sets the wcol value for this GraphTopologyRequest.
     * 
     * @param wcol   * Specify a column of the input graph that contains an edge weight
     * or an edge label (default none) for the tab-delimited format.
     */
    public void setWcol(java.lang.Integer wcol) {
        this.wcol = wcol;
    }


    /**
     * Gets the scol value for this GraphTopologyRequest.
     * 
     * @return scol   * Specify a column of the input graph that contains the source
     * nodes for the tab-delimited format (default = 1).
     */
    public java.lang.Integer getScol() {
        return scol;
    }


    /**
     * Sets the scol value for this GraphTopologyRequest.
     * 
     * @param scol   * Specify a column of the input graph that contains the source
     * nodes for the tab-delimited format (default = 1).
     */
    public void setScol(java.lang.Integer scol) {
        this.scol = scol;
    }


    /**
     * Gets the tcol value for this GraphTopologyRequest.
     * 
     * @return tcol   * Specify a column of the input graph that contains the target
     * nodes for the tab-delimited format (default = 2).
     */
    public java.lang.Integer getTcol() {
        return tcol;
    }


    /**
     * Sets the tcol value for this GraphTopologyRequest.
     * 
     * @param tcol   * Specify a column of the input graph that contains the target
     * nodes for the tab-delimited format (default = 2).
     */
    public void setTcol(java.lang.Integer tcol) {
        this.tcol = tcol;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GraphTopologyRequest)) return false;
        GraphTopologyRequest other = (GraphTopologyRequest) obj;
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
            ((this.all==null && other.getAll()==null) || 
             (this.all!=null &&
              this.all.equals(other.getAll()))) &&
            ((this._return==null && other.get_return()==null) || 
             (this._return!=null &&
              this._return.equals(other.get_return()))) &&
            ((this.inputgraph==null && other.getInputgraph()==null) || 
             (this.inputgraph!=null &&
              this.inputgraph.equals(other.getInputgraph()))) &&
            ((this.nodefile==null && other.getNodefile()==null) || 
             (this.nodefile!=null &&
              this.nodefile.equals(other.getNodefile()))) &&
            ((this.directed==null && other.getDirected()==null) || 
             (this.directed!=null &&
              this.directed.equals(other.getDirected()))) &&
            ((this.wcol==null && other.getWcol()==null) || 
             (this.wcol!=null &&
              this.wcol.equals(other.getWcol()))) &&
            ((this.scol==null && other.getScol()==null) || 
             (this.scol!=null &&
              this.scol.equals(other.getScol()))) &&
            ((this.tcol==null && other.getTcol()==null) || 
             (this.tcol!=null &&
              this.tcol.equals(other.getTcol())));
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
        if (getAll() != null) {
            _hashCode += getAll().hashCode();
        }
        if (get_return() != null) {
            _hashCode += get_return().hashCode();
        }
        if (getInputgraph() != null) {
            _hashCode += getInputgraph().hashCode();
        }
        if (getNodefile() != null) {
            _hashCode += getNodefile().hashCode();
        }
        if (getDirected() != null) {
            _hashCode += getDirected().hashCode();
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
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GraphTopologyRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:RSATWS", "GraphTopologyRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("informat");
        elemField.setXmlName(new javax.xml.namespace.QName("", "informat"));
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
        elemField.setFieldName("_return");
        elemField.setXmlName(new javax.xml.namespace.QName("", "return"));
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
        elemField.setFieldName("nodefile");
        elemField.setXmlName(new javax.xml.namespace.QName("", "nodefile"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
