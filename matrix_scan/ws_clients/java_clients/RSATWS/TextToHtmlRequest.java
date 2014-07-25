/**
 * TextToHtmlRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.3 Oct 05, 2005 (05:23:37 EDT) WSDL2Java emitter.
 */

package RSATWS;

public class TextToHtmlRequest  implements java.io.Serializable {
    /* The text input file that will be converted in html */
    private java.lang.String inputfile;

    /* Chunk size (when there are many rows, the program splits the
     * table into several HTML tables, to reduce the waiting time on the
     * browser. */
    private java.lang.Integer chunk;

    /* make the output HTML table not sortable. */
    private java.lang.Integer no_sort;

    /* Use fixed or variable fonts in html. Supported : variable,fixed */
    private java.lang.String font;

    public TextToHtmlRequest() {
    }

    public TextToHtmlRequest(
           java.lang.String inputfile,
           java.lang.Integer chunk,
           java.lang.Integer no_sort,
           java.lang.String font) {
           this.inputfile = inputfile;
           this.chunk = chunk;
           this.no_sort = no_sort;
           this.font = font;
    }


    /**
     * Gets the inputfile value for this TextToHtmlRequest.
     * 
     * @return inputfile   * The text input file that will be converted in html
     */
    public java.lang.String getInputfile() {
        return inputfile;
    }


    /**
     * Sets the inputfile value for this TextToHtmlRequest.
     * 
     * @param inputfile   * The text input file that will be converted in html
     */
    public void setInputfile(java.lang.String inputfile) {
        this.inputfile = inputfile;
    }


    /**
     * Gets the chunk value for this TextToHtmlRequest.
     * 
     * @return chunk   * Chunk size (when there are many rows, the program splits the
     * table into several HTML tables, to reduce the waiting time on the
     * browser.
     */
    public java.lang.Integer getChunk() {
        return chunk;
    }


    /**
     * Sets the chunk value for this TextToHtmlRequest.
     * 
     * @param chunk   * Chunk size (when there are many rows, the program splits the
     * table into several HTML tables, to reduce the waiting time on the
     * browser.
     */
    public void setChunk(java.lang.Integer chunk) {
        this.chunk = chunk;
    }


    /**
     * Gets the no_sort value for this TextToHtmlRequest.
     * 
     * @return no_sort   * make the output HTML table not sortable.
     */
    public java.lang.Integer getNo_sort() {
        return no_sort;
    }


    /**
     * Sets the no_sort value for this TextToHtmlRequest.
     * 
     * @param no_sort   * make the output HTML table not sortable.
     */
    public void setNo_sort(java.lang.Integer no_sort) {
        this.no_sort = no_sort;
    }


    /**
     * Gets the font value for this TextToHtmlRequest.
     * 
     * @return font   * Use fixed or variable fonts in html. Supported : variable,fixed
     */
    public java.lang.String getFont() {
        return font;
    }


    /**
     * Sets the font value for this TextToHtmlRequest.
     * 
     * @param font   * Use fixed or variable fonts in html. Supported : variable,fixed
     */
    public void setFont(java.lang.String font) {
        this.font = font;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TextToHtmlRequest)) return false;
        TextToHtmlRequest other = (TextToHtmlRequest) obj;
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
            ((this.chunk==null && other.getChunk()==null) || 
             (this.chunk!=null &&
              this.chunk.equals(other.getChunk()))) &&
            ((this.no_sort==null && other.getNo_sort()==null) || 
             (this.no_sort!=null &&
              this.no_sort.equals(other.getNo_sort()))) &&
            ((this.font==null && other.getFont()==null) || 
             (this.font!=null &&
              this.font.equals(other.getFont())));
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
        if (getChunk() != null) {
            _hashCode += getChunk().hashCode();
        }
        if (getNo_sort() != null) {
            _hashCode += getNo_sort().hashCode();
        }
        if (getFont() != null) {
            _hashCode += getFont().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TextToHtmlRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:RSATWS", "TextToHtmlRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("inputfile");
        elemField.setXmlName(new javax.xml.namespace.QName("", "inputfile"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("chunk");
        elemField.setXmlName(new javax.xml.namespace.QName("", "chunk"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("no_sort");
        elemField.setXmlName(new javax.xml.namespace.QName("", "no_sort"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("font");
        elemField.setXmlName(new javax.xml.namespace.QName("", "font"));
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
