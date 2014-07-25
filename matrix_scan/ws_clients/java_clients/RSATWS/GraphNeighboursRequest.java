/**
 * GraphNeighboursRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.3 Oct 05, 2005 (05:23:37 EDT) WSDL2Java emitter.
 */

package RSATWS;

public class GraphNeighboursRequest  implements java.io.Serializable {
    /* Input graph. Supported: tab, gml. */
    private java.lang.String informat;

    /* Direction of the neighbours (default all). Supported: in, out,
     * all. This option cannot be used with the stat output and when specifying
     * the number of steps */
    private java.lang.String direction;

    /* The neighbours of all nodes will be searched. */
    private java.lang.Integer all;

    /* Only valid when the number of step is equal to 1. The output
     * file is presented differently, with one line for each seed node. */
    private java.lang.Integer stats;

    /* Include each node in its neighborhood, with a distance of 0,
     * even if there is no self-loop at this node. 
     * This allows to extract the node together with its neighborhood, rather
     * than the neighborhood only (default). This option cannot be used with
     * the stats option. */
    private java.lang.Integer self;

    /* A graph in the format specified by the informat tag. */
    private java.lang.String inputgraph;

    /* A list of nodes for which you want to know the neighbours. */
    private java.lang.String seedfile;

    /* Specify a column of the input graph that contains an edge weight
     * or an edge label (default none) for the tab-delimited format. */
    private java.lang.Integer wcol;

    /* Specify a column of the input graph that contains the source
     * nodes for the tab-delimited format (default = 1). */
    private java.lang.Integer scol;

    /* Specify a column of the input graph that contains the target
     * nodes for the tab-delimited format (default = 2). */
    private java.lang.Integer tcol;

    /* Maximal number of steps between a seed node and its neighbours.
     * Default: 1. */
    private java.lang.Integer steps;

    public GraphNeighboursRequest() {
    }

    public GraphNeighboursRequest(
           java.lang.String informat,
           java.lang.String direction,
           java.lang.Integer all,
           java.lang.Integer stats,
           java.lang.Integer self,
           java.lang.String inputgraph,
           java.lang.String seedfile,
           java.lang.Integer wcol,
           java.lang.Integer scol,
           java.lang.Integer tcol,
           java.lang.Integer steps) {
           this.informat = informat;
           this.direction = direction;
           this.all = all;
           this.stats = stats;
           this.self = self;
           this.inputgraph = inputgraph;
           this.seedfile = seedfile;
           this.wcol = wcol;
           this.scol = scol;
           this.tcol = tcol;
           this.steps = steps;
    }


    /**
     * Gets the informat value for this GraphNeighboursRequest.
     * 
     * @return informat   * Input graph. Supported: tab, gml.
     */
    public java.lang.String getInformat() {
        return informat;
    }


    /**
     * Sets the informat value for this GraphNeighboursRequest.
     * 
     * @param informat   * Input graph. Supported: tab, gml.
     */
    public void setInformat(java.lang.String informat) {
        this.informat = informat;
    }


    /**
     * Gets the direction value for this GraphNeighboursRequest.
     * 
     * @return direction   * Direction of the neighbours (default all). Supported: in, out,
     * all. This option cannot be used with the stat output and when specifying
     * the number of steps
     */
    public java.lang.String getDirection() {
        return direction;
    }


    /**
     * Sets the direction value for this GraphNeighboursRequest.
     * 
     * @param direction   * Direction of the neighbours (default all). Supported: in, out,
     * all. This option cannot be used with the stat output and when specifying
     * the number of steps
     */
    public void setDirection(java.lang.String direction) {
        this.direction = direction;
    }


    /**
     * Gets the all value for this GraphNeighboursRequest.
     * 
     * @return all   * The neighbours of all nodes will be searched.
     */
    public java.lang.Integer getAll() {
        return all;
    }


    /**
     * Sets the all value for this GraphNeighboursRequest.
     * 
     * @param all   * The neighbours of all nodes will be searched.
     */
    public void setAll(java.lang.Integer all) {
        this.all = all;
    }


    /**
     * Gets the stats value for this GraphNeighboursRequest.
     * 
     * @return stats   * Only valid when the number of step is equal to 1. The output
     * file is presented differently, with one line for each seed node.
     */
    public java.lang.Integer getStats() {
        return stats;
    }


    /**
     * Sets the stats value for this GraphNeighboursRequest.
     * 
     * @param stats   * Only valid when the number of step is equal to 1. The output
     * file is presented differently, with one line for each seed node.
     */
    public void setStats(java.lang.Integer stats) {
        this.stats = stats;
    }


    /**
     * Gets the self value for this GraphNeighboursRequest.
     * 
     * @return self   * Include each node in its neighborhood, with a distance of 0,
     * even if there is no self-loop at this node. 
     * This allows to extract the node together with its neighborhood, rather
     * than the neighborhood only (default). This option cannot be used with
     * the stats option.
     */
    public java.lang.Integer getSelf() {
        return self;
    }


    /**
     * Sets the self value for this GraphNeighboursRequest.
     * 
     * @param self   * Include each node in its neighborhood, with a distance of 0,
     * even if there is no self-loop at this node. 
     * This allows to extract the node together with its neighborhood, rather
     * than the neighborhood only (default). This option cannot be used with
     * the stats option.
     */
    public void setSelf(java.lang.Integer self) {
        this.self = self;
    }


    /**
     * Gets the inputgraph value for this GraphNeighboursRequest.
     * 
     * @return inputgraph   * A graph in the format specified by the informat tag.
     */
    public java.lang.String getInputgraph() {
        return inputgraph;
    }


    /**
     * Sets the inputgraph value for this GraphNeighboursRequest.
     * 
     * @param inputgraph   * A graph in the format specified by the informat tag.
     */
    public void setInputgraph(java.lang.String inputgraph) {
        this.inputgraph = inputgraph;
    }


    /**
     * Gets the seedfile value for this GraphNeighboursRequest.
     * 
     * @return seedfile   * A list of nodes for which you want to know the neighbours.
     */
    public java.lang.String getSeedfile() {
        return seedfile;
    }


    /**
     * Sets the seedfile value for this GraphNeighboursRequest.
     * 
     * @param seedfile   * A list of nodes for which you want to know the neighbours.
     */
    public void setSeedfile(java.lang.String seedfile) {
        this.seedfile = seedfile;
    }


    /**
     * Gets the wcol value for this GraphNeighboursRequest.
     * 
     * @return wcol   * Specify a column of the input graph that contains an edge weight
     * or an edge label (default none) for the tab-delimited format.
     */
    public java.lang.Integer getWcol() {
        return wcol;
    }


    /**
     * Sets the wcol value for this GraphNeighboursRequest.
     * 
     * @param wcol   * Specify a column of the input graph that contains an edge weight
     * or an edge label (default none) for the tab-delimited format.
     */
    public void setWcol(java.lang.Integer wcol) {
        this.wcol = wcol;
    }


    /**
     * Gets the scol value for this GraphNeighboursRequest.
     * 
     * @return scol   * Specify a column of the input graph that contains the source
     * nodes for the tab-delimited format (default = 1).
     */
    public java.lang.Integer getScol() {
        return scol;
    }


    /**
     * Sets the scol value for this GraphNeighboursRequest.
     * 
     * @param scol   * Specify a column of the input graph that contains the source
     * nodes for the tab-delimited format (default = 1).
     */
    public void setScol(java.lang.Integer scol) {
        this.scol = scol;
    }


    /**
     * Gets the tcol value for this GraphNeighboursRequest.
     * 
     * @return tcol   * Specify a column of the input graph that contains the target
     * nodes for the tab-delimited format (default = 2).
     */
    public java.lang.Integer getTcol() {
        return tcol;
    }


    /**
     * Sets the tcol value for this GraphNeighboursRequest.
     * 
     * @param tcol   * Specify a column of the input graph that contains the target
     * nodes for the tab-delimited format (default = 2).
     */
    public void setTcol(java.lang.Integer tcol) {
        this.tcol = tcol;
    }


    /**
     * Gets the steps value for this GraphNeighboursRequest.
     * 
     * @return steps   * Maximal number of steps between a seed node and its neighbours.
     * Default: 1.
     */
    public java.lang.Integer getSteps() {
        return steps;
    }


    /**
     * Sets the steps value for this GraphNeighboursRequest.
     * 
     * @param steps   * Maximal number of steps between a seed node and its neighbours.
     * Default: 1.
     */
    public void setSteps(java.lang.Integer steps) {
        this.steps = steps;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GraphNeighboursRequest)) return false;
        GraphNeighboursRequest other = (GraphNeighboursRequest) obj;
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
            ((this.direction==null && other.getDirection()==null) || 
             (this.direction!=null &&
              this.direction.equals(other.getDirection()))) &&
            ((this.all==null && other.getAll()==null) || 
             (this.all!=null &&
              this.all.equals(other.getAll()))) &&
            ((this.stats==null && other.getStats()==null) || 
             (this.stats!=null &&
              this.stats.equals(other.getStats()))) &&
            ((this.self==null && other.getSelf()==null) || 
             (this.self!=null &&
              this.self.equals(other.getSelf()))) &&
            ((this.inputgraph==null && other.getInputgraph()==null) || 
             (this.inputgraph!=null &&
              this.inputgraph.equals(other.getInputgraph()))) &&
            ((this.seedfile==null && other.getSeedfile()==null) || 
             (this.seedfile!=null &&
              this.seedfile.equals(other.getSeedfile()))) &&
            ((this.wcol==null && other.getWcol()==null) || 
             (this.wcol!=null &&
              this.wcol.equals(other.getWcol()))) &&
            ((this.scol==null && other.getScol()==null) || 
             (this.scol!=null &&
              this.scol.equals(other.getScol()))) &&
            ((this.tcol==null && other.getTcol()==null) || 
             (this.tcol!=null &&
              this.tcol.equals(other.getTcol()))) &&
            ((this.steps==null && other.getSteps()==null) || 
             (this.steps!=null &&
              this.steps.equals(other.getSteps())));
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
        if (getDirection() != null) {
            _hashCode += getDirection().hashCode();
        }
        if (getAll() != null) {
            _hashCode += getAll().hashCode();
        }
        if (getStats() != null) {
            _hashCode += getStats().hashCode();
        }
        if (getSelf() != null) {
            _hashCode += getSelf().hashCode();
        }
        if (getInputgraph() != null) {
            _hashCode += getInputgraph().hashCode();
        }
        if (getSeedfile() != null) {
            _hashCode += getSeedfile().hashCode();
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
        if (getSteps() != null) {
            _hashCode += getSteps().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GraphNeighboursRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:RSATWS", "GraphNeighboursRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("informat");
        elemField.setXmlName(new javax.xml.namespace.QName("", "informat"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("direction");
        elemField.setXmlName(new javax.xml.namespace.QName("", "direction"));
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
        elemField.setFieldName("stats");
        elemField.setXmlName(new javax.xml.namespace.QName("", "stats"));
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
        elemField.setFieldName("inputgraph");
        elemField.setXmlName(new javax.xml.namespace.QName("", "inputgraph"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("seedfile");
        elemField.setXmlName(new javax.xml.namespace.QName("", "seedfile"));
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
        elemField.setFieldName("steps");
        elemField.setXmlName(new javax.xml.namespace.QName("", "steps"));
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
