/**
 * CompareGraphsRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.3 Oct 05, 2005 (05:23:37 EDT) WSDL2Java emitter.
 */

package RSATWS;

public class CompareGraphsRequest  implements java.io.Serializable {
    /* Input format of query graph. Supported: tab, gml. */
    private java.lang.String qinformat;

    /* Input format of reference graph. Supported: tab, gml. */
    private java.lang.String rinformat;

    /* Output format. Supported: tab, gml, dot. */
    private java.lang.String outformat;

    /* Q (weights of the query graph), R (weights of the reference
     * graph), sum (sum of the weights of the two graphs), 
     * mean (mean of the weights of the two graphs), mean.g (geometrical
     * mean of the weights of the two graphs), min (minimum weight), max
     * (maximum weight), Q::R (weight of the two graphs) (default). */
    private java.lang.String outweight;

    /* The reference graph in the format specified by the informat
     * tag. */
    private java.lang.String rinputgraph;

    /* The query graph in the format specified by the informat tag */
    private java.lang.String qinputgraph;

    /* Specify a column of the query input graph that contains an
     * edge weight or an edge label (default none) for the tab-delimited
     * format. */
    private java.lang.Integer qwcol;

    /* Specify a column of the query input graph that contains the
     * source nodes for the tab-delimited format (default = 1). */
    private java.lang.Integer qscol;

    /* Specify a column of the query input graph that contains the
     * target nodes for the tab-delimited format (default = 2). */
    private java.lang.Integer qtcol;

    /* Specify a column of the reference input graph that contains
     * an edge weight or an edge label (default none) for the tab-delimited
     * format. */
    private java.lang.Integer rwcol;

    /* Specify a column of the reference input graph that contains
     * the source nodes for the tab-delimited format (default = 1). */
    private java.lang.Integer rscol;

    /* Specify a column of the reference input graph that contains
     * the target nodes for the tab-delimited format (default = 2). */
    private java.lang.Integer rtcol;

    /* intersection, union, difference, R.and.Q, Q.and.R, Q.or.R,
     * Q.not.R, R.not.Q, Q.and.R+Q, 
     * Q.and.R+R, R.and.Q+Q, R.and.Q+R, intersection+Q, intersection+R. */
    private java.lang.String _return;

    /* Indicates whether the graphs must be considered as directed,
     * i.e., an arc from node A to node B is different from an arc from B
     * to A. */
    private java.lang.Integer directed;

    /* Indicates whether the graphs can admit self-loops, i.e., an
     * arc from a node to itself. 
     * Note that the graphs do not specially need to contain actual self-loops,
     * the question is whether it would or not be acceptable for the considered
     * input graphs to contain self-loops. */
    private java.lang.Integer self;

    public CompareGraphsRequest() {
    }

    public CompareGraphsRequest(
           java.lang.String qinformat,
           java.lang.String rinformat,
           java.lang.String outformat,
           java.lang.String outweight,
           java.lang.String rinputgraph,
           java.lang.String qinputgraph,
           java.lang.Integer qwcol,
           java.lang.Integer qscol,
           java.lang.Integer qtcol,
           java.lang.Integer rwcol,
           java.lang.Integer rscol,
           java.lang.Integer rtcol,
           java.lang.String _return,
           java.lang.Integer directed,
           java.lang.Integer self) {
           this.qinformat = qinformat;
           this.rinformat = rinformat;
           this.outformat = outformat;
           this.outweight = outweight;
           this.rinputgraph = rinputgraph;
           this.qinputgraph = qinputgraph;
           this.qwcol = qwcol;
           this.qscol = qscol;
           this.qtcol = qtcol;
           this.rwcol = rwcol;
           this.rscol = rscol;
           this.rtcol = rtcol;
           this._return = _return;
           this.directed = directed;
           this.self = self;
    }


    /**
     * Gets the qinformat value for this CompareGraphsRequest.
     * 
     * @return qinformat   * Input format of query graph. Supported: tab, gml.
     */
    public java.lang.String getQinformat() {
        return qinformat;
    }


    /**
     * Sets the qinformat value for this CompareGraphsRequest.
     * 
     * @param qinformat   * Input format of query graph. Supported: tab, gml.
     */
    public void setQinformat(java.lang.String qinformat) {
        this.qinformat = qinformat;
    }


    /**
     * Gets the rinformat value for this CompareGraphsRequest.
     * 
     * @return rinformat   * Input format of reference graph. Supported: tab, gml.
     */
    public java.lang.String getRinformat() {
        return rinformat;
    }


    /**
     * Sets the rinformat value for this CompareGraphsRequest.
     * 
     * @param rinformat   * Input format of reference graph. Supported: tab, gml.
     */
    public void setRinformat(java.lang.String rinformat) {
        this.rinformat = rinformat;
    }


    /**
     * Gets the outformat value for this CompareGraphsRequest.
     * 
     * @return outformat   * Output format. Supported: tab, gml, dot.
     */
    public java.lang.String getOutformat() {
        return outformat;
    }


    /**
     * Sets the outformat value for this CompareGraphsRequest.
     * 
     * @param outformat   * Output format. Supported: tab, gml, dot.
     */
    public void setOutformat(java.lang.String outformat) {
        this.outformat = outformat;
    }


    /**
     * Gets the outweight value for this CompareGraphsRequest.
     * 
     * @return outweight   * Q (weights of the query graph), R (weights of the reference
     * graph), sum (sum of the weights of the two graphs), 
     * mean (mean of the weights of the two graphs), mean.g (geometrical
     * mean of the weights of the two graphs), min (minimum weight), max
     * (maximum weight), Q::R (weight of the two graphs) (default).
     */
    public java.lang.String getOutweight() {
        return outweight;
    }


    /**
     * Sets the outweight value for this CompareGraphsRequest.
     * 
     * @param outweight   * Q (weights of the query graph), R (weights of the reference
     * graph), sum (sum of the weights of the two graphs), 
     * mean (mean of the weights of the two graphs), mean.g (geometrical
     * mean of the weights of the two graphs), min (minimum weight), max
     * (maximum weight), Q::R (weight of the two graphs) (default).
     */
    public void setOutweight(java.lang.String outweight) {
        this.outweight = outweight;
    }


    /**
     * Gets the rinputgraph value for this CompareGraphsRequest.
     * 
     * @return rinputgraph   * The reference graph in the format specified by the informat
     * tag.
     */
    public java.lang.String getRinputgraph() {
        return rinputgraph;
    }


    /**
     * Sets the rinputgraph value for this CompareGraphsRequest.
     * 
     * @param rinputgraph   * The reference graph in the format specified by the informat
     * tag.
     */
    public void setRinputgraph(java.lang.String rinputgraph) {
        this.rinputgraph = rinputgraph;
    }


    /**
     * Gets the qinputgraph value for this CompareGraphsRequest.
     * 
     * @return qinputgraph   * The query graph in the format specified by the informat tag
     */
    public java.lang.String getQinputgraph() {
        return qinputgraph;
    }


    /**
     * Sets the qinputgraph value for this CompareGraphsRequest.
     * 
     * @param qinputgraph   * The query graph in the format specified by the informat tag
     */
    public void setQinputgraph(java.lang.String qinputgraph) {
        this.qinputgraph = qinputgraph;
    }


    /**
     * Gets the qwcol value for this CompareGraphsRequest.
     * 
     * @return qwcol   * Specify a column of the query input graph that contains an
     * edge weight or an edge label (default none) for the tab-delimited
     * format.
     */
    public java.lang.Integer getQwcol() {
        return qwcol;
    }


    /**
     * Sets the qwcol value for this CompareGraphsRequest.
     * 
     * @param qwcol   * Specify a column of the query input graph that contains an
     * edge weight or an edge label (default none) for the tab-delimited
     * format.
     */
    public void setQwcol(java.lang.Integer qwcol) {
        this.qwcol = qwcol;
    }


    /**
     * Gets the qscol value for this CompareGraphsRequest.
     * 
     * @return qscol   * Specify a column of the query input graph that contains the
     * source nodes for the tab-delimited format (default = 1).
     */
    public java.lang.Integer getQscol() {
        return qscol;
    }


    /**
     * Sets the qscol value for this CompareGraphsRequest.
     * 
     * @param qscol   * Specify a column of the query input graph that contains the
     * source nodes for the tab-delimited format (default = 1).
     */
    public void setQscol(java.lang.Integer qscol) {
        this.qscol = qscol;
    }


    /**
     * Gets the qtcol value for this CompareGraphsRequest.
     * 
     * @return qtcol   * Specify a column of the query input graph that contains the
     * target nodes for the tab-delimited format (default = 2).
     */
    public java.lang.Integer getQtcol() {
        return qtcol;
    }


    /**
     * Sets the qtcol value for this CompareGraphsRequest.
     * 
     * @param qtcol   * Specify a column of the query input graph that contains the
     * target nodes for the tab-delimited format (default = 2).
     */
    public void setQtcol(java.lang.Integer qtcol) {
        this.qtcol = qtcol;
    }


    /**
     * Gets the rwcol value for this CompareGraphsRequest.
     * 
     * @return rwcol   * Specify a column of the reference input graph that contains
     * an edge weight or an edge label (default none) for the tab-delimited
     * format.
     */
    public java.lang.Integer getRwcol() {
        return rwcol;
    }


    /**
     * Sets the rwcol value for this CompareGraphsRequest.
     * 
     * @param rwcol   * Specify a column of the reference input graph that contains
     * an edge weight or an edge label (default none) for the tab-delimited
     * format.
     */
    public void setRwcol(java.lang.Integer rwcol) {
        this.rwcol = rwcol;
    }


    /**
     * Gets the rscol value for this CompareGraphsRequest.
     * 
     * @return rscol   * Specify a column of the reference input graph that contains
     * the source nodes for the tab-delimited format (default = 1).
     */
    public java.lang.Integer getRscol() {
        return rscol;
    }


    /**
     * Sets the rscol value for this CompareGraphsRequest.
     * 
     * @param rscol   * Specify a column of the reference input graph that contains
     * the source nodes for the tab-delimited format (default = 1).
     */
    public void setRscol(java.lang.Integer rscol) {
        this.rscol = rscol;
    }


    /**
     * Gets the rtcol value for this CompareGraphsRequest.
     * 
     * @return rtcol   * Specify a column of the reference input graph that contains
     * the target nodes for the tab-delimited format (default = 2).
     */
    public java.lang.Integer getRtcol() {
        return rtcol;
    }


    /**
     * Sets the rtcol value for this CompareGraphsRequest.
     * 
     * @param rtcol   * Specify a column of the reference input graph that contains
     * the target nodes for the tab-delimited format (default = 2).
     */
    public void setRtcol(java.lang.Integer rtcol) {
        this.rtcol = rtcol;
    }


    /**
     * Gets the _return value for this CompareGraphsRequest.
     * 
     * @return _return   * intersection, union, difference, R.and.Q, Q.and.R, Q.or.R,
     * Q.not.R, R.not.Q, Q.and.R+Q, 
     * Q.and.R+R, R.and.Q+Q, R.and.Q+R, intersection+Q, intersection+R.
     */
    public java.lang.String get_return() {
        return _return;
    }


    /**
     * Sets the _return value for this CompareGraphsRequest.
     * 
     * @param _return   * intersection, union, difference, R.and.Q, Q.and.R, Q.or.R,
     * Q.not.R, R.not.Q, Q.and.R+Q, 
     * Q.and.R+R, R.and.Q+Q, R.and.Q+R, intersection+Q, intersection+R.
     */
    public void set_return(java.lang.String _return) {
        this._return = _return;
    }


    /**
     * Gets the directed value for this CompareGraphsRequest.
     * 
     * @return directed   * Indicates whether the graphs must be considered as directed,
     * i.e., an arc from node A to node B is different from an arc from B
     * to A.
     */
    public java.lang.Integer getDirected() {
        return directed;
    }


    /**
     * Sets the directed value for this CompareGraphsRequest.
     * 
     * @param directed   * Indicates whether the graphs must be considered as directed,
     * i.e., an arc from node A to node B is different from an arc from B
     * to A.
     */
    public void setDirected(java.lang.Integer directed) {
        this.directed = directed;
    }


    /**
     * Gets the self value for this CompareGraphsRequest.
     * 
     * @return self   * Indicates whether the graphs can admit self-loops, i.e., an
     * arc from a node to itself. 
     * Note that the graphs do not specially need to contain actual self-loops,
     * the question is whether it would or not be acceptable for the considered
     * input graphs to contain self-loops.
     */
    public java.lang.Integer getSelf() {
        return self;
    }


    /**
     * Sets the self value for this CompareGraphsRequest.
     * 
     * @param self   * Indicates whether the graphs can admit self-loops, i.e., an
     * arc from a node to itself. 
     * Note that the graphs do not specially need to contain actual self-loops,
     * the question is whether it would or not be acceptable for the considered
     * input graphs to contain self-loops.
     */
    public void setSelf(java.lang.Integer self) {
        this.self = self;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CompareGraphsRequest)) return false;
        CompareGraphsRequest other = (CompareGraphsRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.qinformat==null && other.getQinformat()==null) || 
             (this.qinformat!=null &&
              this.qinformat.equals(other.getQinformat()))) &&
            ((this.rinformat==null && other.getRinformat()==null) || 
             (this.rinformat!=null &&
              this.rinformat.equals(other.getRinformat()))) &&
            ((this.outformat==null && other.getOutformat()==null) || 
             (this.outformat!=null &&
              this.outformat.equals(other.getOutformat()))) &&
            ((this.outweight==null && other.getOutweight()==null) || 
             (this.outweight!=null &&
              this.outweight.equals(other.getOutweight()))) &&
            ((this.rinputgraph==null && other.getRinputgraph()==null) || 
             (this.rinputgraph!=null &&
              this.rinputgraph.equals(other.getRinputgraph()))) &&
            ((this.qinputgraph==null && other.getQinputgraph()==null) || 
             (this.qinputgraph!=null &&
              this.qinputgraph.equals(other.getQinputgraph()))) &&
            ((this.qwcol==null && other.getQwcol()==null) || 
             (this.qwcol!=null &&
              this.qwcol.equals(other.getQwcol()))) &&
            ((this.qscol==null && other.getQscol()==null) || 
             (this.qscol!=null &&
              this.qscol.equals(other.getQscol()))) &&
            ((this.qtcol==null && other.getQtcol()==null) || 
             (this.qtcol!=null &&
              this.qtcol.equals(other.getQtcol()))) &&
            ((this.rwcol==null && other.getRwcol()==null) || 
             (this.rwcol!=null &&
              this.rwcol.equals(other.getRwcol()))) &&
            ((this.rscol==null && other.getRscol()==null) || 
             (this.rscol!=null &&
              this.rscol.equals(other.getRscol()))) &&
            ((this.rtcol==null && other.getRtcol()==null) || 
             (this.rtcol!=null &&
              this.rtcol.equals(other.getRtcol()))) &&
            ((this._return==null && other.get_return()==null) || 
             (this._return!=null &&
              this._return.equals(other.get_return()))) &&
            ((this.directed==null && other.getDirected()==null) || 
             (this.directed!=null &&
              this.directed.equals(other.getDirected()))) &&
            ((this.self==null && other.getSelf()==null) || 
             (this.self!=null &&
              this.self.equals(other.getSelf())));
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
        if (getQinformat() != null) {
            _hashCode += getQinformat().hashCode();
        }
        if (getRinformat() != null) {
            _hashCode += getRinformat().hashCode();
        }
        if (getOutformat() != null) {
            _hashCode += getOutformat().hashCode();
        }
        if (getOutweight() != null) {
            _hashCode += getOutweight().hashCode();
        }
        if (getRinputgraph() != null) {
            _hashCode += getRinputgraph().hashCode();
        }
        if (getQinputgraph() != null) {
            _hashCode += getQinputgraph().hashCode();
        }
        if (getQwcol() != null) {
            _hashCode += getQwcol().hashCode();
        }
        if (getQscol() != null) {
            _hashCode += getQscol().hashCode();
        }
        if (getQtcol() != null) {
            _hashCode += getQtcol().hashCode();
        }
        if (getRwcol() != null) {
            _hashCode += getRwcol().hashCode();
        }
        if (getRscol() != null) {
            _hashCode += getRscol().hashCode();
        }
        if (getRtcol() != null) {
            _hashCode += getRtcol().hashCode();
        }
        if (get_return() != null) {
            _hashCode += get_return().hashCode();
        }
        if (getDirected() != null) {
            _hashCode += getDirected().hashCode();
        }
        if (getSelf() != null) {
            _hashCode += getSelf().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CompareGraphsRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:RSATWS", "CompareGraphsRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("qinformat");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Qinformat"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rinformat");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Rinformat"));
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
        elemField.setFieldName("outweight");
        elemField.setXmlName(new javax.xml.namespace.QName("", "outweight"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rinputgraph");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Rinputgraph"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("qinputgraph");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Qinputgraph"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("qwcol");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Qwcol"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("qscol");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Qscol"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("qtcol");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Qtcol"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rwcol");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Rwcol"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rscol");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Rscol"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rtcol");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Rtcol"));
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
        elemField.setFieldName("directed");
        elemField.setXmlName(new javax.xml.namespace.QName("", "directed"));
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
