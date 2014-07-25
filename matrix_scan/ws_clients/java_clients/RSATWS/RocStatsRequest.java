/**
 * RocStatsRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.3 Oct 05, 2005 (05:23:37 EDT) WSDL2Java emitter.
 */

package RSATWS;

public class RocStatsRequest  implements java.io.Serializable {
    /* The input file */
    private java.lang.String inputfile;

    /* Column of the input ile containing the score value (default
     * 1). */
    private java.lang.Integer scol;

    /* Column of the input file containing the status label (default
     * 2). */
    private java.lang.Integer lcol;

    /* This option allows to use different labels as synonyms for
     * the pre-defined status (neg and pos) : pos and neg. It can be useful
     * to rename these labels, for compatibility with other programs. For
     * example, it your input file contains annotations of "site" and "non-site",
     * you can use it directly as input with the options. -status site pos
     * -status non-site neg indicates that the label "site" has to be understood
     * as positive, and "non-site" as negative. */
    private java.lang.String status;

    /* Total number of elements in the universe (neg + pos). This
     * option allows to manually specify the total number of elements, in
     * case the input file would not contain the complete data set. */
    private java.lang.Integer total;

    public RocStatsRequest() {
    }

    public RocStatsRequest(
           java.lang.String inputfile,
           java.lang.Integer scol,
           java.lang.Integer lcol,
           java.lang.String status,
           java.lang.Integer total) {
           this.inputfile = inputfile;
           this.scol = scol;
           this.lcol = lcol;
           this.status = status;
           this.total = total;
    }


    /**
     * Gets the inputfile value for this RocStatsRequest.
     * 
     * @return inputfile   * The input file
     */
    public java.lang.String getInputfile() {
        return inputfile;
    }


    /**
     * Sets the inputfile value for this RocStatsRequest.
     * 
     * @param inputfile   * The input file
     */
    public void setInputfile(java.lang.String inputfile) {
        this.inputfile = inputfile;
    }


    /**
     * Gets the scol value for this RocStatsRequest.
     * 
     * @return scol   * Column of the input ile containing the score value (default
     * 1).
     */
    public java.lang.Integer getScol() {
        return scol;
    }


    /**
     * Sets the scol value for this RocStatsRequest.
     * 
     * @param scol   * Column of the input ile containing the score value (default
     * 1).
     */
    public void setScol(java.lang.Integer scol) {
        this.scol = scol;
    }


    /**
     * Gets the lcol value for this RocStatsRequest.
     * 
     * @return lcol   * Column of the input file containing the status label (default
     * 2).
     */
    public java.lang.Integer getLcol() {
        return lcol;
    }


    /**
     * Sets the lcol value for this RocStatsRequest.
     * 
     * @param lcol   * Column of the input file containing the status label (default
     * 2).
     */
    public void setLcol(java.lang.Integer lcol) {
        this.lcol = lcol;
    }


    /**
     * Gets the status value for this RocStatsRequest.
     * 
     * @return status   * This option allows to use different labels as synonyms for
     * the pre-defined status (neg and pos) : pos and neg. It can be useful
     * to rename these labels, for compatibility with other programs. For
     * example, it your input file contains annotations of "site" and "non-site",
     * you can use it directly as input with the options. -status site pos
     * -status non-site neg indicates that the label "site" has to be understood
     * as positive, and "non-site" as negative.
     */
    public java.lang.String getStatus() {
        return status;
    }


    /**
     * Sets the status value for this RocStatsRequest.
     * 
     * @param status   * This option allows to use different labels as synonyms for
     * the pre-defined status (neg and pos) : pos and neg. It can be useful
     * to rename these labels, for compatibility with other programs. For
     * example, it your input file contains annotations of "site" and "non-site",
     * you can use it directly as input with the options. -status site pos
     * -status non-site neg indicates that the label "site" has to be understood
     * as positive, and "non-site" as negative.
     */
    public void setStatus(java.lang.String status) {
        this.status = status;
    }


    /**
     * Gets the total value for this RocStatsRequest.
     * 
     * @return total   * Total number of elements in the universe (neg + pos). This
     * option allows to manually specify the total number of elements, in
     * case the input file would not contain the complete data set.
     */
    public java.lang.Integer getTotal() {
        return total;
    }


    /**
     * Sets the total value for this RocStatsRequest.
     * 
     * @param total   * Total number of elements in the universe (neg + pos). This
     * option allows to manually specify the total number of elements, in
     * case the input file would not contain the complete data set.
     */
    public void setTotal(java.lang.Integer total) {
        this.total = total;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RocStatsRequest)) return false;
        RocStatsRequest other = (RocStatsRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.inputfile==null && other.getInputfile()==null) || 
             (this.inputfile!=null &&
              this.inputfile.equals(other.getInputfile()))) &&
            ((this.scol==null && other.getScol()==null) || 
             (this.scol!=null &&
              this.scol.equals(other.getScol()))) &&
            ((this.lcol==null && other.getLcol()==null) || 
             (this.lcol!=null &&
              this.lcol.equals(other.getLcol()))) &&
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              this.status.equals(other.getStatus()))) &&
            ((this.total==null && other.getTotal()==null) || 
             (this.total!=null &&
              this.total.equals(other.getTotal())));
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
        if (getInputfile() != null) {
            _hashCode += getInputfile().hashCode();
        }
        if (getScol() != null) {
            _hashCode += getScol().hashCode();
        }
        if (getLcol() != null) {
            _hashCode += getLcol().hashCode();
        }
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        if (getTotal() != null) {
            _hashCode += getTotal().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RocStatsRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:RSATWS", "RocStatsRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("inputfile");
        elemField.setXmlName(new javax.xml.namespace.QName("", "inputfile"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
        elemField.setFieldName("lcol");
        elemField.setXmlName(new javax.xml.namespace.QName("", "lcol"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("", "status"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("total");
        elemField.setXmlName(new javax.xml.namespace.QName("", "total"));
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
