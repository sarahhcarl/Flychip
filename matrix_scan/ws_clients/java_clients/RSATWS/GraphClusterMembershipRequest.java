/**
 * GraphClusterMembershipRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.3 Oct 05, 2005 (05:23:37 EDT) WSDL2Java emitter.
 */

package RSATWS;

public class GraphClusterMembershipRequest  implements java.io.Serializable {
    /* Input format. Supported: tab, gml. */
    private java.lang.String informat;

    /* A graph in the format specified by the informat tag. */
    private java.lang.String inputgraph;

    /* clustering as a tab-delimited file. */
    private java.lang.String clusters;

    /* Determines how the node membership will be calculated (edge,
     * weight, relw). */
    private java.lang.String stat;

    /* Number of decimals to print for the membership. Note that by
     * selecting this option, the entries of the membership-vectors (rows)
     * won't sum up to 1. */
    private java.lang.Integer decimals;

    /* Specify a column of the input graph that contains an edge weight
     * or an edge label (default none) for the tab-delimited format. */
    private java.lang.Integer wcol;

    /* Specify a column of the input graph that contains the source
     * nodes for the tab-delimited format (default = 1). */
    private java.lang.Integer scol;

    /* Specify a column of the input graph that contains the target
     * nodes for the tab-delimited format (default = 2). */
    private java.lang.Integer tcol;

    public GraphClusterMembershipRequest() {
    }

    public GraphClusterMembershipRequest(
           java.lang.String informat,
           java.lang.String inputgraph,
           java.lang.String clusters,
           java.lang.String stat,
           java.lang.Integer decimals,
           java.lang.Integer wcol,
           java.lang.Integer scol,
           java.lang.Integer tcol) {
           this.informat = informat;
           this.inputgraph = inputgraph;
           this.clusters = clusters;
           this.stat = stat;
           this.decimals = decimals;
           this.wcol = wcol;
           this.scol = scol;
           this.tcol = tcol;
    }


    /**
     * Gets the informat value for this GraphClusterMembershipRequest.
     * 
     * @return informat   * Input format. Supported: tab, gml.
     */
    public java.lang.String getInformat() {
        return informat;
    }


    /**
     * Sets the informat value for this GraphClusterMembershipRequest.
     * 
     * @param informat   * Input format. Supported: tab, gml.
     */
    public void setInformat(java.lang.String informat) {
        this.informat = informat;
    }


    /**
     * Gets the inputgraph value for this GraphClusterMembershipRequest.
     * 
     * @return inputgraph   * A graph in the format specified by the informat tag.
     */
    public java.lang.String getInputgraph() {
        return inputgraph;
    }


    /**
     * Sets the inputgraph value for this GraphClusterMembershipRequest.
     * 
     * @param inputgraph   * A graph in the format specified by the informat tag.
     */
    public void setInputgraph(java.lang.String inputgraph) {
        this.inputgraph = inputgraph;
    }


    /**
     * Gets the clusters value for this GraphClusterMembershipRequest.
     * 
     * @return clusters   * clustering as a tab-delimited file.
     */
    public java.lang.String getClusters() {
        return clusters;
    }


    /**
     * Sets the clusters value for this GraphClusterMembershipRequest.
     * 
     * @param clusters   * clustering as a tab-delimited file.
     */
    public void setClusters(java.lang.String clusters) {
        this.clusters = clusters;
    }


    /**
     * Gets the stat value for this GraphClusterMembershipRequest.
     * 
     * @return stat   * Determines how the node membership will be calculated (edge,
     * weight, relw).
     */
    public java.lang.String getStat() {
        return stat;
    }


    /**
     * Sets the stat value for this GraphClusterMembershipRequest.
     * 
     * @param stat   * Determines how the node membership will be calculated (edge,
     * weight, relw).
     */
    public void setStat(java.lang.String stat) {
        this.stat = stat;
    }


    /**
     * Gets the decimals value for this GraphClusterMembershipRequest.
     * 
     * @return decimals   * Number of decimals to print for the membership. Note that by
     * selecting this option, the entries of the membership-vectors (rows)
     * won't sum up to 1.
     */
    public java.lang.Integer getDecimals() {
        return decimals;
    }


    /**
     * Sets the decimals value for this GraphClusterMembershipRequest.
     * 
     * @param decimals   * Number of decimals to print for the membership. Note that by
     * selecting this option, the entries of the membership-vectors (rows)
     * won't sum up to 1.
     */
    public void setDecimals(java.lang.Integer decimals) {
        this.decimals = decimals;
    }


    /**
     * Gets the wcol value for this GraphClusterMembershipRequest.
     * 
     * @return wcol   * Specify a column of the input graph that contains an edge weight
     * or an edge label (default none) for the tab-delimited format.
     */
    public java.lang.Integer getWcol() {
        return wcol;
    }


    /**
     * Sets the wcol value for this GraphClusterMembershipRequest.
     * 
     * @param wcol   * Specify a column of the input graph that contains an edge weight
     * or an edge label (default none) for the tab-delimited format.
     */
    public void setWcol(java.lang.Integer wcol) {
        this.wcol = wcol;
    }


    /**
     * Gets the scol value for this GraphClusterMembershipRequest.
     * 
     * @return scol   * Specify a column of the input graph that contains the source
     * nodes for the tab-delimited format (default = 1).
     */
    public java.lang.Integer getScol() {
        return scol;
    }


    /**
     * Sets the scol value for this GraphClusterMembershipRequest.
     * 
     * @param scol   * Specify a column of the input graph that contains the source
     * nodes for the tab-delimited format (default = 1).
     */
    public void setScol(java.lang.Integer scol) {
        this.scol = scol;
    }


    /**
     * Gets the tcol value for this GraphClusterMembershipRequest.
     * 
     * @return tcol   * Specify a column of the input graph that contains the target
     * nodes for the tab-delimited format (default = 2).
     */
    public java.lang.Integer getTcol() {
        return tcol;
    }


    /**
     * Sets the tcol value for this GraphClusterMembershipRequest.
     * 
     * @param tcol   * Specify a column of the input graph that contains the target
     * nodes for the tab-delimited format (default = 2).
     */
    public void setTcol(java.lang.Integer tcol) {
        this.tcol = tcol;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GraphClusterMembershipRequest)) return false;
        GraphClusterMembershipRequest other = (GraphClusterMembershipRequest) obj;
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
            ((this.inputgraph==null && other.getInputgraph()==null) || 
             (this.inputgraph!=null &&
              this.inputgraph.equals(other.getInputgraph()))) &&
            ((this.clusters==null && other.getClusters()==null) || 
             (this.clusters!=null &&
              this.clusters.equals(other.getClusters()))) &&
            ((this.stat==null && other.getStat()==null) || 
             (this.stat!=null &&
              this.stat.equals(other.getStat()))) &&
            ((this.decimals==null && other.getDecimals()==null) || 
             (this.decimals!=null &&
              this.decimals.equals(other.getDecimals()))) &&
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
        if (getInputgraph() != null) {
            _hashCode += getInputgraph().hashCode();
        }
        if (getClusters() != null) {
            _hashCode += getClusters().hashCode();
        }
        if (getStat() != null) {
            _hashCode += getStat().hashCode();
        }
        if (getDecimals() != null) {
            _hashCode += getDecimals().hashCode();
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
        new org.apache.axis.description.TypeDesc(GraphClusterMembershipRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:RSATWS", "GraphClusterMembershipRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("informat");
        elemField.setXmlName(new javax.xml.namespace.QName("", "informat"));
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
        elemField.setFieldName("stat");
        elemField.setXmlName(new javax.xml.namespace.QName("", "stat"));
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
