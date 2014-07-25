/**
 * GeneInfoRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.3 Oct 05, 2005 (05:23:37 EDT) WSDL2Java emitter.
 */

package RSATWS;

public class GeneInfoRequest  implements java.io.Serializable {
    /* Return type. Accepted values: 'server' (result is stored on
     * a file on the server), 'client' (result is directly transferred to
     * the client), or  'both'. 
     * 		Default is 'both'. */
    private java.lang.String output;

    /* Organism. Words need to be underscore separated (example: Escherichia_coli_K12). */
    private java.lang.String organism;

    /* List of gene(s) for which you want info on or list of keywords
     * to search for (can be regular expressions). */
    private java.lang.String[] query;

    /* Full match only (no substring matching) if value = 1. */
    private java.lang.Integer full;

    /* Do not print the query at the begining of each line if value
     * = 1. */
    private java.lang.Integer noquery;

    /* Match query against the description, too, not just against
     * gene ID and name if value = 1. */
    private java.lang.Integer descr;

    /* Feature type (CDS, mRNA, tRNA, rRNA, scRNA). */
    private java.lang.String feattype;

    public GeneInfoRequest() {
    }

    public GeneInfoRequest(
           java.lang.String output,
           java.lang.String organism,
           java.lang.String[] query,
           java.lang.Integer full,
           java.lang.Integer noquery,
           java.lang.Integer descr,
           java.lang.String feattype) {
           this.output = output;
           this.organism = organism;
           this.query = query;
           this.full = full;
           this.noquery = noquery;
           this.descr = descr;
           this.feattype = feattype;
    }


    /**
     * Gets the output value for this GeneInfoRequest.
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
     * Sets the output value for this GeneInfoRequest.
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
     * Gets the organism value for this GeneInfoRequest.
     * 
     * @return organism   * Organism. Words need to be underscore separated (example: Escherichia_coli_K12).
     */
    public java.lang.String getOrganism() {
        return organism;
    }


    /**
     * Sets the organism value for this GeneInfoRequest.
     * 
     * @param organism   * Organism. Words need to be underscore separated (example: Escherichia_coli_K12).
     */
    public void setOrganism(java.lang.String organism) {
        this.organism = organism;
    }


    /**
     * Gets the query value for this GeneInfoRequest.
     * 
     * @return query   * List of gene(s) for which you want info on or list of keywords
     * to search for (can be regular expressions).
     */
    public java.lang.String[] getQuery() {
        return query;
    }


    /**
     * Sets the query value for this GeneInfoRequest.
     * 
     * @param query   * List of gene(s) for which you want info on or list of keywords
     * to search for (can be regular expressions).
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
     * Gets the full value for this GeneInfoRequest.
     * 
     * @return full   * Full match only (no substring matching) if value = 1.
     */
    public java.lang.Integer getFull() {
        return full;
    }


    /**
     * Sets the full value for this GeneInfoRequest.
     * 
     * @param full   * Full match only (no substring matching) if value = 1.
     */
    public void setFull(java.lang.Integer full) {
        this.full = full;
    }


    /**
     * Gets the noquery value for this GeneInfoRequest.
     * 
     * @return noquery   * Do not print the query at the begining of each line if value
     * = 1.
     */
    public java.lang.Integer getNoquery() {
        return noquery;
    }


    /**
     * Sets the noquery value for this GeneInfoRequest.
     * 
     * @param noquery   * Do not print the query at the begining of each line if value
     * = 1.
     */
    public void setNoquery(java.lang.Integer noquery) {
        this.noquery = noquery;
    }


    /**
     * Gets the descr value for this GeneInfoRequest.
     * 
     * @return descr   * Match query against the description, too, not just against
     * gene ID and name if value = 1.
     */
    public java.lang.Integer getDescr() {
        return descr;
    }


    /**
     * Sets the descr value for this GeneInfoRequest.
     * 
     * @param descr   * Match query against the description, too, not just against
     * gene ID and name if value = 1.
     */
    public void setDescr(java.lang.Integer descr) {
        this.descr = descr;
    }


    /**
     * Gets the feattype value for this GeneInfoRequest.
     * 
     * @return feattype   * Feature type (CDS, mRNA, tRNA, rRNA, scRNA).
     */
    public java.lang.String getFeattype() {
        return feattype;
    }


    /**
     * Sets the feattype value for this GeneInfoRequest.
     * 
     * @param feattype   * Feature type (CDS, mRNA, tRNA, rRNA, scRNA).
     */
    public void setFeattype(java.lang.String feattype) {
        this.feattype = feattype;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GeneInfoRequest)) return false;
        GeneInfoRequest other = (GeneInfoRequest) obj;
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
            ((this.full==null && other.getFull()==null) || 
             (this.full!=null &&
              this.full.equals(other.getFull()))) &&
            ((this.noquery==null && other.getNoquery()==null) || 
             (this.noquery!=null &&
              this.noquery.equals(other.getNoquery()))) &&
            ((this.descr==null && other.getDescr()==null) || 
             (this.descr!=null &&
              this.descr.equals(other.getDescr()))) &&
            ((this.feattype==null && other.getFeattype()==null) || 
             (this.feattype!=null &&
              this.feattype.equals(other.getFeattype())));
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
        if (getFull() != null) {
            _hashCode += getFull().hashCode();
        }
        if (getNoquery() != null) {
            _hashCode += getNoquery().hashCode();
        }
        if (getDescr() != null) {
            _hashCode += getDescr().hashCode();
        }
        if (getFeattype() != null) {
            _hashCode += getFeattype().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GeneInfoRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:RSATWS", "GeneInfoRequest"));
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
        elemField.setFieldName("full");
        elemField.setXmlName(new javax.xml.namespace.QName("", "full"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("noquery");
        elemField.setXmlName(new javax.xml.namespace.QName("", "noquery"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("descr");
        elemField.setXmlName(new javax.xml.namespace.QName("", "descr"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("feattype");
        elemField.setXmlName(new javax.xml.namespace.QName("", "feattype"));
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
