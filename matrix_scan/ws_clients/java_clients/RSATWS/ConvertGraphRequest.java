/**
 * ConvertGraphRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.3 Oct 05, 2005 (05:23:37 EDT) WSDL2Java emitter.
 */

package RSATWS;

public class ConvertGraphRequest  implements java.io.Serializable {
    /* Input format. Supported: tab, gml, adj_matrix. */
    private java.lang.String informat;

    /* Compute an edge color for the GML output. The color intensity
     * is
     *         	proportional to the weight of the edge. All weights in the
     * column
     *                 indicated by the -wcol argument must thus be real
     * values. Supported
     *                 : green, blue, red, fire, grey. */
    private java.lang.String ecolors;

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

    /* Specify a column of the input graph that containsthe color
     * of the edge (no default). */
    private java.lang.Integer eccol;

    /* Specify a column of the input graph that contains the color
     * of the source node (no default). */
    private java.lang.Integer sccol;

    /* Specify a column of the input graph that contains the color
     * of the target node (no default). */
    private java.lang.Integer tccol;

    /* Specify the column containing the paths */
    private java.lang.Integer pathcol;

    /* The graph is considered as being undirected (useful for the
     * adjacency matrix input and output). */
    private java.lang.Integer undirected;

    /* The nodes belonging to different paths are duplicated with
     * this option */
    private java.lang.Integer distinct_path;

    /* Specify whether the disposition of each node has to be calculated
     * using the $RSAT/bin/fr_layout program.
     * This option is only useful for GML output. */
    private java.lang.Integer layout;

    /* Calculate the edge width for the GML output. The width is
     *                 proportional to the weight of the edge. This value
     * can only be
     *                 computed for the GML output. All weights in the column
     * indicated by
     *                 the -wcol argument must thus be real values. */
    private java.lang.Integer ewidth;

    public ConvertGraphRequest() {
    }

    public ConvertGraphRequest(
           java.lang.String informat,
           java.lang.String ecolors,
           java.lang.String outformat,
           java.lang.String inputgraph,
           java.lang.Integer wcol,
           java.lang.Integer scol,
           java.lang.Integer tcol,
           java.lang.Integer eccol,
           java.lang.Integer sccol,
           java.lang.Integer tccol,
           java.lang.Integer pathcol,
           java.lang.Integer undirected,
           java.lang.Integer distinct_path,
           java.lang.Integer layout,
           java.lang.Integer ewidth) {
           this.informat = informat;
           this.ecolors = ecolors;
           this.outformat = outformat;
           this.inputgraph = inputgraph;
           this.wcol = wcol;
           this.scol = scol;
           this.tcol = tcol;
           this.eccol = eccol;
           this.sccol = sccol;
           this.tccol = tccol;
           this.pathcol = pathcol;
           this.undirected = undirected;
           this.distinct_path = distinct_path;
           this.layout = layout;
           this.ewidth = ewidth;
    }


    /**
     * Gets the informat value for this ConvertGraphRequest.
     * 
     * @return informat   * Input format. Supported: tab, gml, adj_matrix.
     */
    public java.lang.String getInformat() {
        return informat;
    }


    /**
     * Sets the informat value for this ConvertGraphRequest.
     * 
     * @param informat   * Input format. Supported: tab, gml, adj_matrix.
     */
    public void setInformat(java.lang.String informat) {
        this.informat = informat;
    }


    /**
     * Gets the ecolors value for this ConvertGraphRequest.
     * 
     * @return ecolors   * Compute an edge color for the GML output. The color intensity
     * is
     *         	proportional to the weight of the edge. All weights in the
     * column
     *                 indicated by the -wcol argument must thus be real
     * values. Supported
     *                 : green, blue, red, fire, grey.
     */
    public java.lang.String getEcolors() {
        return ecolors;
    }


    /**
     * Sets the ecolors value for this ConvertGraphRequest.
     * 
     * @param ecolors   * Compute an edge color for the GML output. The color intensity
     * is
     *         	proportional to the weight of the edge. All weights in the
     * column
     *                 indicated by the -wcol argument must thus be real
     * values. Supported
     *                 : green, blue, red, fire, grey.
     */
    public void setEcolors(java.lang.String ecolors) {
        this.ecolors = ecolors;
    }


    /**
     * Gets the outformat value for this ConvertGraphRequest.
     * 
     * @return outformat   * Output format. Supported: tab, gml, dot, adj_matrix.
     */
    public java.lang.String getOutformat() {
        return outformat;
    }


    /**
     * Sets the outformat value for this ConvertGraphRequest.
     * 
     * @param outformat   * Output format. Supported: tab, gml, dot, adj_matrix.
     */
    public void setOutformat(java.lang.String outformat) {
        this.outformat = outformat;
    }


    /**
     * Gets the inputgraph value for this ConvertGraphRequest.
     * 
     * @return inputgraph   * A graph in the format specified by the informat tag.
     */
    public java.lang.String getInputgraph() {
        return inputgraph;
    }


    /**
     * Sets the inputgraph value for this ConvertGraphRequest.
     * 
     * @param inputgraph   * A graph in the format specified by the informat tag.
     */
    public void setInputgraph(java.lang.String inputgraph) {
        this.inputgraph = inputgraph;
    }


    /**
     * Gets the wcol value for this ConvertGraphRequest.
     * 
     * @return wcol   * Specify a column of the input graph that contains an edge weight
     * or an edge label for the tab-delimited format (no default).
     */
    public java.lang.Integer getWcol() {
        return wcol;
    }


    /**
     * Sets the wcol value for this ConvertGraphRequest.
     * 
     * @param wcol   * Specify a column of the input graph that contains an edge weight
     * or an edge label for the tab-delimited format (no default).
     */
    public void setWcol(java.lang.Integer wcol) {
        this.wcol = wcol;
    }


    /**
     * Gets the scol value for this ConvertGraphRequest.
     * 
     * @return scol   * Specify a column of the input graph that contains the source
     * nodes for the tab-delimited format (default = 1).
     */
    public java.lang.Integer getScol() {
        return scol;
    }


    /**
     * Sets the scol value for this ConvertGraphRequest.
     * 
     * @param scol   * Specify a column of the input graph that contains the source
     * nodes for the tab-delimited format (default = 1).
     */
    public void setScol(java.lang.Integer scol) {
        this.scol = scol;
    }


    /**
     * Gets the tcol value for this ConvertGraphRequest.
     * 
     * @return tcol   * Specify a column of the input graph that contains the target
     * nodes for the tab-delimited format (default = 2).
     */
    public java.lang.Integer getTcol() {
        return tcol;
    }


    /**
     * Sets the tcol value for this ConvertGraphRequest.
     * 
     * @param tcol   * Specify a column of the input graph that contains the target
     * nodes for the tab-delimited format (default = 2).
     */
    public void setTcol(java.lang.Integer tcol) {
        this.tcol = tcol;
    }


    /**
     * Gets the eccol value for this ConvertGraphRequest.
     * 
     * @return eccol   * Specify a column of the input graph that containsthe color
     * of the edge (no default).
     */
    public java.lang.Integer getEccol() {
        return eccol;
    }


    /**
     * Sets the eccol value for this ConvertGraphRequest.
     * 
     * @param eccol   * Specify a column of the input graph that containsthe color
     * of the edge (no default).
     */
    public void setEccol(java.lang.Integer eccol) {
        this.eccol = eccol;
    }


    /**
     * Gets the sccol value for this ConvertGraphRequest.
     * 
     * @return sccol   * Specify a column of the input graph that contains the color
     * of the source node (no default).
     */
    public java.lang.Integer getSccol() {
        return sccol;
    }


    /**
     * Sets the sccol value for this ConvertGraphRequest.
     * 
     * @param sccol   * Specify a column of the input graph that contains the color
     * of the source node (no default).
     */
    public void setSccol(java.lang.Integer sccol) {
        this.sccol = sccol;
    }


    /**
     * Gets the tccol value for this ConvertGraphRequest.
     * 
     * @return tccol   * Specify a column of the input graph that contains the color
     * of the target node (no default).
     */
    public java.lang.Integer getTccol() {
        return tccol;
    }


    /**
     * Sets the tccol value for this ConvertGraphRequest.
     * 
     * @param tccol   * Specify a column of the input graph that contains the color
     * of the target node (no default).
     */
    public void setTccol(java.lang.Integer tccol) {
        this.tccol = tccol;
    }


    /**
     * Gets the pathcol value for this ConvertGraphRequest.
     * 
     * @return pathcol   * Specify the column containing the paths
     */
    public java.lang.Integer getPathcol() {
        return pathcol;
    }


    /**
     * Sets the pathcol value for this ConvertGraphRequest.
     * 
     * @param pathcol   * Specify the column containing the paths
     */
    public void setPathcol(java.lang.Integer pathcol) {
        this.pathcol = pathcol;
    }


    /**
     * Gets the undirected value for this ConvertGraphRequest.
     * 
     * @return undirected   * The graph is considered as being undirected (useful for the
     * adjacency matrix input and output).
     */
    public java.lang.Integer getUndirected() {
        return undirected;
    }


    /**
     * Sets the undirected value for this ConvertGraphRequest.
     * 
     * @param undirected   * The graph is considered as being undirected (useful for the
     * adjacency matrix input and output).
     */
    public void setUndirected(java.lang.Integer undirected) {
        this.undirected = undirected;
    }


    /**
     * Gets the distinct_path value for this ConvertGraphRequest.
     * 
     * @return distinct_path   * The nodes belonging to different paths are duplicated with
     * this option
     */
    public java.lang.Integer getDistinct_path() {
        return distinct_path;
    }


    /**
     * Sets the distinct_path value for this ConvertGraphRequest.
     * 
     * @param distinct_path   * The nodes belonging to different paths are duplicated with
     * this option
     */
    public void setDistinct_path(java.lang.Integer distinct_path) {
        this.distinct_path = distinct_path;
    }


    /**
     * Gets the layout value for this ConvertGraphRequest.
     * 
     * @return layout   * Specify whether the disposition of each node has to be calculated
     * using the $RSAT/bin/fr_layout program.
     * This option is only useful for GML output.
     */
    public java.lang.Integer getLayout() {
        return layout;
    }


    /**
     * Sets the layout value for this ConvertGraphRequest.
     * 
     * @param layout   * Specify whether the disposition of each node has to be calculated
     * using the $RSAT/bin/fr_layout program.
     * This option is only useful for GML output.
     */
    public void setLayout(java.lang.Integer layout) {
        this.layout = layout;
    }


    /**
     * Gets the ewidth value for this ConvertGraphRequest.
     * 
     * @return ewidth   * Calculate the edge width for the GML output. The width is
     *                 proportional to the weight of the edge. This value
     * can only be
     *                 computed for the GML output. All weights in the column
     * indicated by
     *                 the -wcol argument must thus be real values.
     */
    public java.lang.Integer getEwidth() {
        return ewidth;
    }


    /**
     * Sets the ewidth value for this ConvertGraphRequest.
     * 
     * @param ewidth   * Calculate the edge width for the GML output. The width is
     *                 proportional to the weight of the edge. This value
     * can only be
     *                 computed for the GML output. All weights in the column
     * indicated by
     *                 the -wcol argument must thus be real values.
     */
    public void setEwidth(java.lang.Integer ewidth) {
        this.ewidth = ewidth;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ConvertGraphRequest)) return false;
        ConvertGraphRequest other = (ConvertGraphRequest) obj;
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
            ((this.ecolors==null && other.getEcolors()==null) || 
             (this.ecolors!=null &&
              this.ecolors.equals(other.getEcolors()))) &&
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
            ((this.eccol==null && other.getEccol()==null) || 
             (this.eccol!=null &&
              this.eccol.equals(other.getEccol()))) &&
            ((this.sccol==null && other.getSccol()==null) || 
             (this.sccol!=null &&
              this.sccol.equals(other.getSccol()))) &&
            ((this.tccol==null && other.getTccol()==null) || 
             (this.tccol!=null &&
              this.tccol.equals(other.getTccol()))) &&
            ((this.pathcol==null && other.getPathcol()==null) || 
             (this.pathcol!=null &&
              this.pathcol.equals(other.getPathcol()))) &&
            ((this.undirected==null && other.getUndirected()==null) || 
             (this.undirected!=null &&
              this.undirected.equals(other.getUndirected()))) &&
            ((this.distinct_path==null && other.getDistinct_path()==null) || 
             (this.distinct_path!=null &&
              this.distinct_path.equals(other.getDistinct_path()))) &&
            ((this.layout==null && other.getLayout()==null) || 
             (this.layout!=null &&
              this.layout.equals(other.getLayout()))) &&
            ((this.ewidth==null && other.getEwidth()==null) || 
             (this.ewidth!=null &&
              this.ewidth.equals(other.getEwidth())));
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
        if (getEcolors() != null) {
            _hashCode += getEcolors().hashCode();
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
        if (getEccol() != null) {
            _hashCode += getEccol().hashCode();
        }
        if (getSccol() != null) {
            _hashCode += getSccol().hashCode();
        }
        if (getTccol() != null) {
            _hashCode += getTccol().hashCode();
        }
        if (getPathcol() != null) {
            _hashCode += getPathcol().hashCode();
        }
        if (getUndirected() != null) {
            _hashCode += getUndirected().hashCode();
        }
        if (getDistinct_path() != null) {
            _hashCode += getDistinct_path().hashCode();
        }
        if (getLayout() != null) {
            _hashCode += getLayout().hashCode();
        }
        if (getEwidth() != null) {
            _hashCode += getEwidth().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ConvertGraphRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:RSATWS", "ConvertGraphRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("informat");
        elemField.setXmlName(new javax.xml.namespace.QName("", "informat"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ecolors");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ecolors"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
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
        elemField.setFieldName("eccol");
        elemField.setXmlName(new javax.xml.namespace.QName("", "eccol"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sccol");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sccol"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tccol");
        elemField.setXmlName(new javax.xml.namespace.QName("", "tccol"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pathcol");
        elemField.setXmlName(new javax.xml.namespace.QName("", "pathcol"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("undirected");
        elemField.setXmlName(new javax.xml.namespace.QName("", "undirected"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("distinct_path");
        elemField.setXmlName(new javax.xml.namespace.QName("", "distinct_path"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("layout");
        elemField.setXmlName(new javax.xml.namespace.QName("", "layout"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ewidth");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ewidth"));
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
