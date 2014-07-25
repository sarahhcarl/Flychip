/**
 * RNSCRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.3 Oct 05, 2005 (05:23:37 EDT) WSDL2Java emitter.
 */

package RSATWS;

public class RNSCRequest  implements java.io.Serializable {
    /* A graph in the format required by RNSC : an adjacency list
     * in which each edge appears only once.  The vertices are labelled with
     * the integers 0, 1, ..., n-1. The list of neighbours for vertex v appears
     * as
     * v n_1 n_2 ... n_x -1
     * The input network in the correct format can be produced by the convert-graph
     * program. */
    private java.lang.String inputgraph;

    /* Allow no more than "num" clusters.  "num" must be between 2
     * and n, 	where n is the number of vertices in the graph.  If this option
     * is not specified or an invalid value is given, n clusters are used. */
    private java.lang.Integer max_clust;

    /* Set the tabu length to "num".  Default value is 1.  Note that
     * when the tabulist option is used, vertices can appear on the tabu
     * list more than once and moving them is only forbidden when they are
     * on the tabu list more than TabuTol times, where TabuTol is the tabu
     * list tolerance. */
    private java.lang.Integer tabulength;

    /* Set the tabu list tolerance to "num". Default value is 1. 
     * The tabu list tolerance is the number of times a vertex must appear
     * on the tabu list before moving it is forbidden. */
    private java.lang.Integer tabulist;

    /* Set the naive stopping tolerance to "num".  Default value is
     * 5.  This is the number of steps that the naive scheme will continue
     * without improving the best cost.  If you run the scaled scheme, using
     * a higher naive stopping tolerance isn't likely to improve your results. */
    private java.lang.Integer naive_stop;

    /* Set the scaled stopping tolerance to "num".  Default value
     * is 5.  This is the number of steps that the scaled scheme will continue
     * without improving the best cost.  Setting the tolerance to 0 will
     * cause the algorithm to skip the scaled scheme. */
    private java.lang.Integer scale_stop;

    /* Run "num" experiments.  The best final clustering over all
     * experiments will be written to file.  Default is 1. */
    private java.lang.Integer exp_nb;

    /* Set the diversification frequency to "num".  Without this option,
     * no diversification will be performed.  If the shf_div_len flag is
     * also used, then "num" is the shuffling diversification frequency.
     * If the -d flag is not used, then "num" is the destructive diversification
     * frequency.  It is recommended that the shf_div_len flag is used, because
     * destructive diversification isn't much help. */
    private java.lang.Integer div_freq;

    /* Set the shuffling diversification length to "num".  That means
     * that the last "num" moves in the diversification period will be diversification
     * moves.  Don't set this to be higher than the diversification frequency. */
    private java.lang.Integer shf_div_len;

    public RNSCRequest() {
    }

    public RNSCRequest(
           java.lang.String inputgraph,
           java.lang.Integer max_clust,
           java.lang.Integer tabulength,
           java.lang.Integer tabulist,
           java.lang.Integer naive_stop,
           java.lang.Integer scale_stop,
           java.lang.Integer exp_nb,
           java.lang.Integer div_freq,
           java.lang.Integer shf_div_len) {
           this.inputgraph = inputgraph;
           this.max_clust = max_clust;
           this.tabulength = tabulength;
           this.tabulist = tabulist;
           this.naive_stop = naive_stop;
           this.scale_stop = scale_stop;
           this.exp_nb = exp_nb;
           this.div_freq = div_freq;
           this.shf_div_len = shf_div_len;
    }


    /**
     * Gets the inputgraph value for this RNSCRequest.
     * 
     * @return inputgraph   * A graph in the format required by RNSC : an adjacency list
     * in which each edge appears only once.  The vertices are labelled with
     * the integers 0, 1, ..., n-1. The list of neighbours for vertex v appears
     * as
     * v n_1 n_2 ... n_x -1
     * The input network in the correct format can be produced by the convert-graph
     * program.
     */
    public java.lang.String getInputgraph() {
        return inputgraph;
    }


    /**
     * Sets the inputgraph value for this RNSCRequest.
     * 
     * @param inputgraph   * A graph in the format required by RNSC : an adjacency list
     * in which each edge appears only once.  The vertices are labelled with
     * the integers 0, 1, ..., n-1. The list of neighbours for vertex v appears
     * as
     * v n_1 n_2 ... n_x -1
     * The input network in the correct format can be produced by the convert-graph
     * program.
     */
    public void setInputgraph(java.lang.String inputgraph) {
        this.inputgraph = inputgraph;
    }


    /**
     * Gets the max_clust value for this RNSCRequest.
     * 
     * @return max_clust   * Allow no more than "num" clusters.  "num" must be between 2
     * and n, 	where n is the number of vertices in the graph.  If this option
     * is not specified or an invalid value is given, n clusters are used.
     */
    public java.lang.Integer getMax_clust() {
        return max_clust;
    }


    /**
     * Sets the max_clust value for this RNSCRequest.
     * 
     * @param max_clust   * Allow no more than "num" clusters.  "num" must be between 2
     * and n, 	where n is the number of vertices in the graph.  If this option
     * is not specified or an invalid value is given, n clusters are used.
     */
    public void setMax_clust(java.lang.Integer max_clust) {
        this.max_clust = max_clust;
    }


    /**
     * Gets the tabulength value for this RNSCRequest.
     * 
     * @return tabulength   * Set the tabu length to "num".  Default value is 1.  Note that
     * when the tabulist option is used, vertices can appear on the tabu
     * list more than once and moving them is only forbidden when they are
     * on the tabu list more than TabuTol times, where TabuTol is the tabu
     * list tolerance.
     */
    public java.lang.Integer getTabulength() {
        return tabulength;
    }


    /**
     * Sets the tabulength value for this RNSCRequest.
     * 
     * @param tabulength   * Set the tabu length to "num".  Default value is 1.  Note that
     * when the tabulist option is used, vertices can appear on the tabu
     * list more than once and moving them is only forbidden when they are
     * on the tabu list more than TabuTol times, where TabuTol is the tabu
     * list tolerance.
     */
    public void setTabulength(java.lang.Integer tabulength) {
        this.tabulength = tabulength;
    }


    /**
     * Gets the tabulist value for this RNSCRequest.
     * 
     * @return tabulist   * Set the tabu list tolerance to "num". Default value is 1. 
     * The tabu list tolerance is the number of times a vertex must appear
     * on the tabu list before moving it is forbidden.
     */
    public java.lang.Integer getTabulist() {
        return tabulist;
    }


    /**
     * Sets the tabulist value for this RNSCRequest.
     * 
     * @param tabulist   * Set the tabu list tolerance to "num". Default value is 1. 
     * The tabu list tolerance is the number of times a vertex must appear
     * on the tabu list before moving it is forbidden.
     */
    public void setTabulist(java.lang.Integer tabulist) {
        this.tabulist = tabulist;
    }


    /**
     * Gets the naive_stop value for this RNSCRequest.
     * 
     * @return naive_stop   * Set the naive stopping tolerance to "num".  Default value is
     * 5.  This is the number of steps that the naive scheme will continue
     * without improving the best cost.  If you run the scaled scheme, using
     * a higher naive stopping tolerance isn't likely to improve your results.
     */
    public java.lang.Integer getNaive_stop() {
        return naive_stop;
    }


    /**
     * Sets the naive_stop value for this RNSCRequest.
     * 
     * @param naive_stop   * Set the naive stopping tolerance to "num".  Default value is
     * 5.  This is the number of steps that the naive scheme will continue
     * without improving the best cost.  If you run the scaled scheme, using
     * a higher naive stopping tolerance isn't likely to improve your results.
     */
    public void setNaive_stop(java.lang.Integer naive_stop) {
        this.naive_stop = naive_stop;
    }


    /**
     * Gets the scale_stop value for this RNSCRequest.
     * 
     * @return scale_stop   * Set the scaled stopping tolerance to "num".  Default value
     * is 5.  This is the number of steps that the scaled scheme will continue
     * without improving the best cost.  Setting the tolerance to 0 will
     * cause the algorithm to skip the scaled scheme.
     */
    public java.lang.Integer getScale_stop() {
        return scale_stop;
    }


    /**
     * Sets the scale_stop value for this RNSCRequest.
     * 
     * @param scale_stop   * Set the scaled stopping tolerance to "num".  Default value
     * is 5.  This is the number of steps that the scaled scheme will continue
     * without improving the best cost.  Setting the tolerance to 0 will
     * cause the algorithm to skip the scaled scheme.
     */
    public void setScale_stop(java.lang.Integer scale_stop) {
        this.scale_stop = scale_stop;
    }


    /**
     * Gets the exp_nb value for this RNSCRequest.
     * 
     * @return exp_nb   * Run "num" experiments.  The best final clustering over all
     * experiments will be written to file.  Default is 1.
     */
    public java.lang.Integer getExp_nb() {
        return exp_nb;
    }


    /**
     * Sets the exp_nb value for this RNSCRequest.
     * 
     * @param exp_nb   * Run "num" experiments.  The best final clustering over all
     * experiments will be written to file.  Default is 1.
     */
    public void setExp_nb(java.lang.Integer exp_nb) {
        this.exp_nb = exp_nb;
    }


    /**
     * Gets the div_freq value for this RNSCRequest.
     * 
     * @return div_freq   * Set the diversification frequency to "num".  Without this option,
     * no diversification will be performed.  If the shf_div_len flag is
     * also used, then "num" is the shuffling diversification frequency.
     * If the -d flag is not used, then "num" is the destructive diversification
     * frequency.  It is recommended that the shf_div_len flag is used, because
     * destructive diversification isn't much help.
     */
    public java.lang.Integer getDiv_freq() {
        return div_freq;
    }


    /**
     * Sets the div_freq value for this RNSCRequest.
     * 
     * @param div_freq   * Set the diversification frequency to "num".  Without this option,
     * no diversification will be performed.  If the shf_div_len flag is
     * also used, then "num" is the shuffling diversification frequency.
     * If the -d flag is not used, then "num" is the destructive diversification
     * frequency.  It is recommended that the shf_div_len flag is used, because
     * destructive diversification isn't much help.
     */
    public void setDiv_freq(java.lang.Integer div_freq) {
        this.div_freq = div_freq;
    }


    /**
     * Gets the shf_div_len value for this RNSCRequest.
     * 
     * @return shf_div_len   * Set the shuffling diversification length to "num".  That means
     * that the last "num" moves in the diversification period will be diversification
     * moves.  Don't set this to be higher than the diversification frequency.
     */
    public java.lang.Integer getShf_div_len() {
        return shf_div_len;
    }


    /**
     * Sets the shf_div_len value for this RNSCRequest.
     * 
     * @param shf_div_len   * Set the shuffling diversification length to "num".  That means
     * that the last "num" moves in the diversification period will be diversification
     * moves.  Don't set this to be higher than the diversification frequency.
     */
    public void setShf_div_len(java.lang.Integer shf_div_len) {
        this.shf_div_len = shf_div_len;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RNSCRequest)) return false;
        RNSCRequest other = (RNSCRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.inputgraph==null && other.getInputgraph()==null) || 
             (this.inputgraph!=null &&
              this.inputgraph.equals(other.getInputgraph()))) &&
            ((this.max_clust==null && other.getMax_clust()==null) || 
             (this.max_clust!=null &&
              this.max_clust.equals(other.getMax_clust()))) &&
            ((this.tabulength==null && other.getTabulength()==null) || 
             (this.tabulength!=null &&
              this.tabulength.equals(other.getTabulength()))) &&
            ((this.tabulist==null && other.getTabulist()==null) || 
             (this.tabulist!=null &&
              this.tabulist.equals(other.getTabulist()))) &&
            ((this.naive_stop==null && other.getNaive_stop()==null) || 
             (this.naive_stop!=null &&
              this.naive_stop.equals(other.getNaive_stop()))) &&
            ((this.scale_stop==null && other.getScale_stop()==null) || 
             (this.scale_stop!=null &&
              this.scale_stop.equals(other.getScale_stop()))) &&
            ((this.exp_nb==null && other.getExp_nb()==null) || 
             (this.exp_nb!=null &&
              this.exp_nb.equals(other.getExp_nb()))) &&
            ((this.div_freq==null && other.getDiv_freq()==null) || 
             (this.div_freq!=null &&
              this.div_freq.equals(other.getDiv_freq()))) &&
            ((this.shf_div_len==null && other.getShf_div_len()==null) || 
             (this.shf_div_len!=null &&
              this.shf_div_len.equals(other.getShf_div_len())));
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
        if (getInputgraph() != null) {
            _hashCode += getInputgraph().hashCode();
        }
        if (getMax_clust() != null) {
            _hashCode += getMax_clust().hashCode();
        }
        if (getTabulength() != null) {
            _hashCode += getTabulength().hashCode();
        }
        if (getTabulist() != null) {
            _hashCode += getTabulist().hashCode();
        }
        if (getNaive_stop() != null) {
            _hashCode += getNaive_stop().hashCode();
        }
        if (getScale_stop() != null) {
            _hashCode += getScale_stop().hashCode();
        }
        if (getExp_nb() != null) {
            _hashCode += getExp_nb().hashCode();
        }
        if (getDiv_freq() != null) {
            _hashCode += getDiv_freq().hashCode();
        }
        if (getShf_div_len() != null) {
            _hashCode += getShf_div_len().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RNSCRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:RSATWS", "RNSCRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("inputgraph");
        elemField.setXmlName(new javax.xml.namespace.QName("", "inputgraph"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("max_clust");
        elemField.setXmlName(new javax.xml.namespace.QName("", "max_clust"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tabulength");
        elemField.setXmlName(new javax.xml.namespace.QName("", "tabulength"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tabulist");
        elemField.setXmlName(new javax.xml.namespace.QName("", "tabulist"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("naive_stop");
        elemField.setXmlName(new javax.xml.namespace.QName("", "naive_stop"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("scale_stop");
        elemField.setXmlName(new javax.xml.namespace.QName("", "scale_stop"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("exp_nb");
        elemField.setXmlName(new javax.xml.namespace.QName("", "exp_nb"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("div_freq");
        elemField.setXmlName(new javax.xml.namespace.QName("", "div_freq"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shf_div_len");
        elemField.setXmlName(new javax.xml.namespace.QName("", "shf_div_len"));
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
