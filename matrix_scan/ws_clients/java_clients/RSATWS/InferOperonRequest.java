/**
 * InferOperonRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.3 Oct 05, 2005 (05:23:37 EDT) WSDL2Java emitter.
 */

package RSATWS;

public class InferOperonRequest  implements java.io.Serializable {
    /* Return type. Accepted values: 'server' (result is stored on
     * a file on the server), 'client' (result is directly transferred to
     * the client), or  'both'. 
     * 		Default is 'both'. */
    private java.lang.String output;

    /* Organism. Words need to be underscore separated (example: Escherichia_coli_K12). */
    private java.lang.String organism;

    /* List of gene(s) for which you want to infer the operon. */
    private java.lang.String[] query;

    /* Name of the file with query genes on the server. You need to
     * supply either this parameter or the previous one (query). */
    private java.lang.String tmp_infile;

    /* Infer operons for all the genes of the query organism if value
     * = 1. */
    private java.lang.Integer all;

    /* Distance threshold. */
    private java.lang.Integer distance;

    /* List of fields to return.
     * 
     *         Supported fields:
     *         leader,trailer,operon,query,q_info,up_info,down_info
     * 
     *         leader
     *             Predicted operon leader.
     * 
     *         trailer
     *             Predicted operon trailer.
     * 
     *         operon
     *             Full composition of the operon. The names of member genes
     * are
     *             separated by a semi-column ";".
     * 
     *         q_info
     *             Detailed info on the query gene(s).
     * 
     *         up_info
     *             Detailed info on the upstream gene.
     * 
     *         down_info
     *             Detailed info on the downstream gene. */
    private java.lang.String _return;

    public InferOperonRequest() {
    }

    public InferOperonRequest(
           java.lang.String output,
           java.lang.String organism,
           java.lang.String[] query,
           java.lang.String tmp_infile,
           java.lang.Integer all,
           java.lang.Integer distance,
           java.lang.String _return) {
           this.output = output;
           this.organism = organism;
           this.query = query;
           this.tmp_infile = tmp_infile;
           this.all = all;
           this.distance = distance;
           this._return = _return;
    }


    /**
     * Gets the output value for this InferOperonRequest.
     * 
     * @return output   * Return type. Accepted values: 'server' (result is stored on
     * a file on the server), 'client' (result is directly transferred to
     * the client), or  'both'. 
     * 		Default is 'both'.
     */
    public java.lang.String getOutput() {
        return output;
    }


    /**
     * Sets the output value for this InferOperonRequest.
     * 
     * @param output   * Return type. Accepted values: 'server' (result is stored on
     * a file on the server), 'client' (result is directly transferred to
     * the client), or  'both'. 
     * 		Default is 'both'.
     */
    public void setOutput(java.lang.String output) {
        this.output = output;
    }


    /**
     * Gets the organism value for this InferOperonRequest.
     * 
     * @return organism   * Organism. Words need to be underscore separated (example: Escherichia_coli_K12).
     */
    public java.lang.String getOrganism() {
        return organism;
    }


    /**
     * Sets the organism value for this InferOperonRequest.
     * 
     * @param organism   * Organism. Words need to be underscore separated (example: Escherichia_coli_K12).
     */
    public void setOrganism(java.lang.String organism) {
        this.organism = organism;
    }


    /**
     * Gets the query value for this InferOperonRequest.
     * 
     * @return query   * List of gene(s) for which you want to infer the operon.
     */
    public java.lang.String[] getQuery() {
        return query;
    }


    /**
     * Sets the query value for this InferOperonRequest.
     * 
     * @param query   * List of gene(s) for which you want to infer the operon.
     */
    public void setQuery(java.lang.String[] query) {
        this.query = query;
    }

    public java.lang.String getQuery(int i) {
        return this.query[i];
    }

    public void setQuery(int i, java.lang.String _value) {
        this.query[i] = _value;
    }


    /**
     * Gets the tmp_infile value for this InferOperonRequest.
     * 
     * @return tmp_infile   * Name of the file with query genes on the server. You need to
     * supply either this parameter or the previous one (query).
     */
    public java.lang.String getTmp_infile() {
        return tmp_infile;
    }


    /**
     * Sets the tmp_infile value for this InferOperonRequest.
     * 
     * @param tmp_infile   * Name of the file with query genes on the server. You need to
     * supply either this parameter or the previous one (query).
     */
    public void setTmp_infile(java.lang.String tmp_infile) {
        this.tmp_infile = tmp_infile;
    }


    /**
     * Gets the all value for this InferOperonRequest.
     * 
     * @return all   * Infer operons for all the genes of the query organism if value
     * = 1.
     */
    public java.lang.Integer getAll() {
        return all;
    }


    /**
     * Sets the all value for this InferOperonRequest.
     * 
     * @param all   * Infer operons for all the genes of the query organism if value
     * = 1.
     */
    public void setAll(java.lang.Integer all) {
        this.all = all;
    }


    /**
     * Gets the distance value for this InferOperonRequest.
     * 
     * @return distance   * Distance threshold.
     */
    public java.lang.Integer getDistance() {
        return distance;
    }


    /**
     * Sets the distance value for this InferOperonRequest.
     * 
     * @param distance   * Distance threshold.
     */
    public void setDistance(java.lang.Integer distance) {
        this.distance = distance;
    }


    /**
     * Gets the _return value for this InferOperonRequest.
     * 
     * @return _return   * List of fields to return.
     * 
     *         Supported fields:
     *         leader,trailer,operon,query,q_info,up_info,down_info
     * 
     *         leader
     *             Predicted operon leader.
     * 
     *         trailer
     *             Predicted operon trailer.
     * 
     *         operon
     *             Full composition of the operon. The names of member genes
     * are
     *             separated by a semi-column ";".
     * 
     *         q_info
     *             Detailed info on the query gene(s).
     * 
     *         up_info
     *             Detailed info on the upstream gene.
     * 
     *         down_info
     *             Detailed info on the downstream gene.
     */
    public java.lang.String get_return() {
        return _return;
    }


    /**
     * Sets the _return value for this InferOperonRequest.
     * 
     * @param _return   * List of fields to return.
     * 
     *         Supported fields:
     *         leader,trailer,operon,query,q_info,up_info,down_info
     * 
     *         leader
     *             Predicted operon leader.
     * 
     *         trailer
     *             Predicted operon trailer.
     * 
     *         operon
     *             Full composition of the operon. The names of member genes
     * are
     *             separated by a semi-column ";".
     * 
     *         q_info
     *             Detailed info on the query gene(s).
     * 
     *         up_info
     *             Detailed info on the upstream gene.
     * 
     *         down_info
     *             Detailed info on the downstream gene.
     */
    public void set_return(java.lang.String _return) {
        this._return = _return;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof InferOperonRequest)) return false;
        InferOperonRequest other = (InferOperonRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.output==null && other.getOutput()==null) || 
             (this.output!=null &&
              this.output.equals(other.getOutput()))) &&
            ((this.organism==null && other.getOrganism()==null) || 
             (this.organism!=null &&
              this.organism.equals(other.getOrganism()))) &&
            ((this.query==null && other.getQuery()==null) || 
             (this.query!=null &&
              java.util.Arrays.equals(this.query, other.getQuery()))) &&
            ((this.tmp_infile==null && other.getTmp_infile()==null) || 
             (this.tmp_infile!=null &&
              this.tmp_infile.equals(other.getTmp_infile()))) &&
            ((this.all==null && other.getAll()==null) || 
             (this.all!=null &&
              this.all.equals(other.getAll()))) &&
            ((this.distance==null && other.getDistance()==null) || 
             (this.distance!=null &&
              this.distance.equals(other.getDistance()))) &&
            ((this._return==null && other.get_return()==null) || 
             (this._return!=null &&
              this._return.equals(other.get_return())));
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
        if (getOutput() != null) {
            _hashCode += getOutput().hashCode();
        }
        if (getOrganism() != null) {
            _hashCode += getOrganism().hashCode();
        }
        if (getQuery() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getQuery());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getQuery(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getTmp_infile() != null) {
            _hashCode += getTmp_infile().hashCode();
        }
        if (getAll() != null) {
            _hashCode += getAll().hashCode();
        }
        if (getDistance() != null) {
            _hashCode += getDistance().hashCode();
        }
        if (get_return() != null) {
            _hashCode += get_return().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(InferOperonRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:RSATWS", "InferOperonRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("output");
        elemField.setXmlName(new javax.xml.namespace.QName("", "output"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("organism");
        elemField.setXmlName(new javax.xml.namespace.QName("", "organism"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("query");
        elemField.setXmlName(new javax.xml.namespace.QName("", "query"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tmp_infile");
        elemField.setXmlName(new javax.xml.namespace.QName("", "tmp_infile"));
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
        elemField.setFieldName("distance");
        elemField.setXmlName(new javax.xml.namespace.QName("", "distance"));
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
