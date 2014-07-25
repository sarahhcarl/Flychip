/**
 * ClassFreqRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.3 Oct 05, 2005 (05:23:37 EDT) WSDL2Java emitter.
 */

package RSATWS;

public class ClassFreqRequest  implements java.io.Serializable {
    /* Input file */
    private java.lang.String inputFile;

    /* class interval. If not specified, takes the value (max - min)/20 */
    private java.lang.String classinterval;

    /* column to which apply the program. This option can be used
     * iteratively. */
    private java.lang.String col;

    /* numbers strictly smaller than this value are not taken into
     * account */
    private java.lang.String min;

    /* numbers strictly higher than this value are not taken into
     * account */
    private java.lang.String max;

    /* inferior limit for the classes to display
     * 					      values lower than this limit are however taken into account
     * 					      in the calculation of statistics (avg, variance, ...) and
     * of
     *                 				class frequencies (In contrast with the -min option). */
    private java.lang.String from;

    /* superior limit for the classes to display
     * 					      values higher than this limit are however taken into account
     * 					      in the calculation of statistics (avg, variance, ...) and
     * of
     * 					      class frequencies (In contrast with the -min option). */
    private java.lang.String to;

    public ClassFreqRequest() {
    }

    public ClassFreqRequest(
           java.lang.String inputFile,
           java.lang.String classinterval,
           java.lang.String col,
           java.lang.String min,
           java.lang.String max,
           java.lang.String from,
           java.lang.String to) {
           this.inputFile = inputFile;
           this.classinterval = classinterval;
           this.col = col;
           this.min = min;
           this.max = max;
           this.from = from;
           this.to = to;
    }


    /**
     * Gets the inputFile value for this ClassFreqRequest.
     * 
     * @return inputFile   * Input file
     */
    public java.lang.String getInputFile() {
        return inputFile;
    }


    /**
     * Sets the inputFile value for this ClassFreqRequest.
     * 
     * @param inputFile   * Input file
     */
    public void setInputFile(java.lang.String inputFile) {
        this.inputFile = inputFile;
    }


    /**
     * Gets the classinterval value for this ClassFreqRequest.
     * 
     * @return classinterval   * class interval. If not specified, takes the value (max - min)/20
     */
    public java.lang.String getClassinterval() {
        return classinterval;
    }


    /**
     * Sets the classinterval value for this ClassFreqRequest.
     * 
     * @param classinterval   * class interval. If not specified, takes the value (max - min)/20
     */
    public void setClassinterval(java.lang.String classinterval) {
        this.classinterval = classinterval;
    }


    /**
     * Gets the col value for this ClassFreqRequest.
     * 
     * @return col   * column to which apply the program. This option can be used
     * iteratively.
     */
    public java.lang.String getCol() {
        return col;
    }


    /**
     * Sets the col value for this ClassFreqRequest.
     * 
     * @param col   * column to which apply the program. This option can be used
     * iteratively.
     */
    public void setCol(java.lang.String col) {
        this.col = col;
    }


    /**
     * Gets the min value for this ClassFreqRequest.
     * 
     * @return min   * numbers strictly smaller than this value are not taken into
     * account
     */
    public java.lang.String getMin() {
        return min;
    }


    /**
     * Sets the min value for this ClassFreqRequest.
     * 
     * @param min   * numbers strictly smaller than this value are not taken into
     * account
     */
    public void setMin(java.lang.String min) {
        this.min = min;
    }


    /**
     * Gets the max value for this ClassFreqRequest.
     * 
     * @return max   * numbers strictly higher than this value are not taken into
     * account
     */
    public java.lang.String getMax() {
        return max;
    }


    /**
     * Sets the max value for this ClassFreqRequest.
     * 
     * @param max   * numbers strictly higher than this value are not taken into
     * account
     */
    public void setMax(java.lang.String max) {
        this.max = max;
    }


    /**
     * Gets the from value for this ClassFreqRequest.
     * 
     * @return from   * inferior limit for the classes to display
     * 					      values lower than this limit are however taken into account
     * 					      in the calculation of statistics (avg, variance, ...) and
     * of
     *                 				class frequencies (In contrast with the -min option).
     */
    public java.lang.String getFrom() {
        return from;
    }


    /**
     * Sets the from value for this ClassFreqRequest.
     * 
     * @param from   * inferior limit for the classes to display
     * 					      values lower than this limit are however taken into account
     * 					      in the calculation of statistics (avg, variance, ...) and
     * of
     *                 				class frequencies (In contrast with the -min option).
     */
    public void setFrom(java.lang.String from) {
        this.from = from;
    }


    /**
     * Gets the to value for this ClassFreqRequest.
     * 
     * @return to   * superior limit for the classes to display
     * 					      values higher than this limit are however taken into account
     * 					      in the calculation of statistics (avg, variance, ...) and
     * of
     * 					      class frequencies (In contrast with the -min option).
     */
    public java.lang.String getTo() {
        return to;
    }


    /**
     * Sets the to value for this ClassFreqRequest.
     * 
     * @param to   * superior limit for the classes to display
     * 					      values higher than this limit are however taken into account
     * 					      in the calculation of statistics (avg, variance, ...) and
     * of
     * 					      class frequencies (In contrast with the -min option).
     */
    public void setTo(java.lang.String to) {
        this.to = to;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ClassFreqRequest)) return false;
        ClassFreqRequest other = (ClassFreqRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.inputFile==null && other.getInputFile()==null) || 
             (this.inputFile!=null &&
              this.inputFile.equals(other.getInputFile()))) &&
            ((this.classinterval==null && other.getClassinterval()==null) || 
             (this.classinterval!=null &&
              this.classinterval.equals(other.getClassinterval()))) &&
            ((this.col==null && other.getCol()==null) || 
             (this.col!=null &&
              this.col.equals(other.getCol()))) &&
            ((this.min==null && other.getMin()==null) || 
             (this.min!=null &&
              this.min.equals(other.getMin()))) &&
            ((this.max==null && other.getMax()==null) || 
             (this.max!=null &&
              this.max.equals(other.getMax()))) &&
            ((this.from==null && other.getFrom()==null) || 
             (this.from!=null &&
              this.from.equals(other.getFrom()))) &&
            ((this.to==null && other.getTo()==null) || 
             (this.to!=null &&
              this.to.equals(other.getTo())));
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
        if (getInputFile() != null) {
            _hashCode += getInputFile().hashCode();
        }
        if (getClassinterval() != null) {
            _hashCode += getClassinterval().hashCode();
        }
        if (getCol() != null) {
            _hashCode += getCol().hashCode();
        }
        if (getMin() != null) {
            _hashCode += getMin().hashCode();
        }
        if (getMax() != null) {
            _hashCode += getMax().hashCode();
        }
        if (getFrom() != null) {
            _hashCode += getFrom().hashCode();
        }
        if (getTo() != null) {
            _hashCode += getTo().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ClassFreqRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:RSATWS", "ClassFreqRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("inputFile");
        elemField.setXmlName(new javax.xml.namespace.QName("", "inputFile"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("classinterval");
        elemField.setXmlName(new javax.xml.namespace.QName("", "classinterval"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("col");
        elemField.setXmlName(new javax.xml.namespace.QName("", "col"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("min");
        elemField.setXmlName(new javax.xml.namespace.QName("", "min"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("max");
        elemField.setXmlName(new javax.xml.namespace.QName("", "max"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("from");
        elemField.setXmlName(new javax.xml.namespace.QName("", "from"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("to");
        elemField.setXmlName(new javax.xml.namespace.QName("", "to"));
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
