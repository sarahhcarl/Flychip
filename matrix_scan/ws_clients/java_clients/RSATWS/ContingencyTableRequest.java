/**
 * ContingencyTableRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.3 Oct 05, 2005 (05:23:37 EDT) WSDL2Java emitter.
 */

package RSATWS;


/**
 * Parameters for the operation contingency-table.
 */
public class ContingencyTableRequest  implements java.io.Serializable {
    /* A tab delimited file */
    private java.lang.String inputfile;

    /* First column to use for the contingency table */
    private int col1;

    /* Second column to use for the contingency table */
    private int col2;

    /* Calculate the marginal sums */
    private java.lang.Integer margin;

    /* Value for the null character (default: 0). */
    private java.lang.Integer _null;

    public ContingencyTableRequest() {
    }

    public ContingencyTableRequest(
           java.lang.String inputfile,
           int col1,
           int col2,
           java.lang.Integer margin,
           java.lang.Integer _null) {
           this.inputfile = inputfile;
           this.col1 = col1;
           this.col2 = col2;
           this.margin = margin;
           this._null = _null;
    }


    /**
     * Gets the inputfile value for this ContingencyTableRequest.
     * 
     * @return inputfile   * A tab delimited file
     */
    public java.lang.String getInputfile() {
        return inputfile;
    }


    /**
     * Sets the inputfile value for this ContingencyTableRequest.
     * 
     * @param inputfile   * A tab delimited file
     */
    public void setInputfile(java.lang.String inputfile) {
        this.inputfile = inputfile;
    }


    /**
     * Gets the col1 value for this ContingencyTableRequest.
     * 
     * @return col1   * First column to use for the contingency table
     */
    public int getCol1() {
        return col1;
    }


    /**
     * Sets the col1 value for this ContingencyTableRequest.
     * 
     * @param col1   * First column to use for the contingency table
     */
    public void setCol1(int col1) {
        this.col1 = col1;
    }


    /**
     * Gets the col2 value for this ContingencyTableRequest.
     * 
     * @return col2   * Second column to use for the contingency table
     */
    public int getCol2() {
        return col2;
    }


    /**
     * Sets the col2 value for this ContingencyTableRequest.
     * 
     * @param col2   * Second column to use for the contingency table
     */
    public void setCol2(int col2) {
        this.col2 = col2;
    }


    /**
     * Gets the margin value for this ContingencyTableRequest.
     * 
     * @return margin   * Calculate the marginal sums
     */
    public java.lang.Integer getMargin() {
        return margin;
    }


    /**
     * Sets the margin value for this ContingencyTableRequest.
     * 
     * @param margin   * Calculate the marginal sums
     */
    public void setMargin(java.lang.Integer margin) {
        this.margin = margin;
    }


    /**
     * Gets the _null value for this ContingencyTableRequest.
     * 
     * @return _null   * Value for the null character (default: 0).
     */
    public java.lang.Integer get_null() {
        return _null;
    }


    /**
     * Sets the _null value for this ContingencyTableRequest.
     * 
     * @param _null   * Value for the null character (default: 0).
     */
    public void set_null(java.lang.Integer _null) {
        this._null = _null;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ContingencyTableRequest)) return false;
        ContingencyTableRequest other = (ContingencyTableRequest) obj;
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
            this.col1 == other.getCol1() &&
            this.col2 == other.getCol2() &&
            ((this.margin==null && other.getMargin()==null) || 
             (this.margin!=null &&
              this.margin.equals(other.getMargin()))) &&
            ((this._null==null && other.get_null()==null) || 
             (this._null!=null &&
              this._null.equals(other.get_null())));
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
        _hashCode += getCol1();
        _hashCode += getCol2();
        if (getMargin() != null) {
            _hashCode += getMargin().hashCode();
        }
        if (get_null() != null) {
            _hashCode += get_null().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ContingencyTableRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:RSATWS", "ContingencyTableRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("inputfile");
        elemField.setXmlName(new javax.xml.namespace.QName("", "inputfile"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("col1");
        elemField.setXmlName(new javax.xml.namespace.QName("", "col1"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("col2");
        elemField.setXmlName(new javax.xml.namespace.QName("", "col2"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("margin");
        elemField.setXmlName(new javax.xml.namespace.QName("", "margin"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("_null");
        elemField.setXmlName(new javax.xml.namespace.QName("", "null"));
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
