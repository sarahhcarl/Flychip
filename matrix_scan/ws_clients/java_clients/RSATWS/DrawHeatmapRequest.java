/**
 * DrawHeatmapRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.3 Oct 05, 2005 (05:23:37 EDT) WSDL2Java emitter.
 */

package RSATWS;

public class DrawHeatmapRequest  implements java.io.Serializable {
    /* Output format. Supported: png, jpeg. */
    private java.lang.String outformat;

    /* Returns an HTML file that load the heatmap. The name of this
     * file is the name of the output file on the server with the html extension */
    private java.lang.Integer html;

    /* A graph in the format specified by the informat tag. */
    private java.lang.String inputfile;

    /* Use this option if the first column contain the row names. */
    private java.lang.Integer row_names;

    /* Using this option, the values are not written in the cells
     * of the */
    private java.lang.Integer no_text;

    /* Width of the columns (in pixel). If the row height is to small,
     * the label of the heatmap will not be indicated. (Default : 50 px) */
    private java.lang.Integer col_width;

    /* Height of the rows (in pixel). If the row height is to small,
     * the label of the heatmap will not be indicated. (Default : 30 px) */
    private java.lang.Integer row_height;

    /* Minimal value of the heatmap. By default, this value is the
     * minimal value of the input file. If the specified value is larger
     * than the minimal value of the heatmap, then the minimal value of the
     * heatmap will be used as minimal value. */
    private java.lang.Integer min;

    /* Maximal value of the heatmap. By default, this value is the
     * maximal value of the input file. If the specified value is smaller
     * than the maximal value of the heatmap, then the maximal value of the
     * heatmap will be used as maximal value. */
    private java.lang.Integer max;

    /* Color of the intensity gradient of the heatmap. Default is
     * grey.
     *         				Supported : green, blue, red, fire, grey. */
    private java.lang.String gradient;

    public DrawHeatmapRequest() {
    }

    public DrawHeatmapRequest(
           java.lang.String outformat,
           java.lang.Integer html,
           java.lang.String inputfile,
           java.lang.Integer row_names,
           java.lang.Integer no_text,
           java.lang.Integer col_width,
           java.lang.Integer row_height,
           java.lang.Integer min,
           java.lang.Integer max,
           java.lang.String gradient) {
           this.outformat = outformat;
           this.html = html;
           this.inputfile = inputfile;
           this.row_names = row_names;
           this.no_text = no_text;
           this.col_width = col_width;
           this.row_height = row_height;
           this.min = min;
           this.max = max;
           this.gradient = gradient;
    }


    /**
     * Gets the outformat value for this DrawHeatmapRequest.
     * 
     * @return outformat   * Output format. Supported: png, jpeg.
     */
    public java.lang.String getOutformat() {
        return outformat;
    }


    /**
     * Sets the outformat value for this DrawHeatmapRequest.
     * 
     * @param outformat   * Output format. Supported: png, jpeg.
     */
    public void setOutformat(java.lang.String outformat) {
        this.outformat = outformat;
    }


    /**
     * Gets the html value for this DrawHeatmapRequest.
     * 
     * @return html   * Returns an HTML file that load the heatmap. The name of this
     * file is the name of the output file on the server with the html extension
     */
    public java.lang.Integer getHtml() {
        return html;
    }


    /**
     * Sets the html value for this DrawHeatmapRequest.
     * 
     * @param html   * Returns an HTML file that load the heatmap. The name of this
     * file is the name of the output file on the server with the html extension
     */
    public void setHtml(java.lang.Integer html) {
        this.html = html;
    }


    /**
     * Gets the inputfile value for this DrawHeatmapRequest.
     * 
     * @return inputfile   * A graph in the format specified by the informat tag.
     */
    public java.lang.String getInputfile() {
        return inputfile;
    }


    /**
     * Sets the inputfile value for this DrawHeatmapRequest.
     * 
     * @param inputfile   * A graph in the format specified by the informat tag.
     */
    public void setInputfile(java.lang.String inputfile) {
        this.inputfile = inputfile;
    }


    /**
     * Gets the row_names value for this DrawHeatmapRequest.
     * 
     * @return row_names   * Use this option if the first column contain the row names.
     */
    public java.lang.Integer getRow_names() {
        return row_names;
    }


    /**
     * Sets the row_names value for this DrawHeatmapRequest.
     * 
     * @param row_names   * Use this option if the first column contain the row names.
     */
    public void setRow_names(java.lang.Integer row_names) {
        this.row_names = row_names;
    }


    /**
     * Gets the no_text value for this DrawHeatmapRequest.
     * 
     * @return no_text   * Using this option, the values are not written in the cells
     * of the
     */
    public java.lang.Integer getNo_text() {
        return no_text;
    }


    /**
     * Sets the no_text value for this DrawHeatmapRequest.
     * 
     * @param no_text   * Using this option, the values are not written in the cells
     * of the
     */
    public void setNo_text(java.lang.Integer no_text) {
        this.no_text = no_text;
    }


    /**
     * Gets the col_width value for this DrawHeatmapRequest.
     * 
     * @return col_width   * Width of the columns (in pixel). If the row height is to small,
     * the label of the heatmap will not be indicated. (Default : 50 px)
     */
    public java.lang.Integer getCol_width() {
        return col_width;
    }


    /**
     * Sets the col_width value for this DrawHeatmapRequest.
     * 
     * @param col_width   * Width of the columns (in pixel). If the row height is to small,
     * the label of the heatmap will not be indicated. (Default : 50 px)
     */
    public void setCol_width(java.lang.Integer col_width) {
        this.col_width = col_width;
    }


    /**
     * Gets the row_height value for this DrawHeatmapRequest.
     * 
     * @return row_height   * Height of the rows (in pixel). If the row height is to small,
     * the label of the heatmap will not be indicated. (Default : 30 px)
     */
    public java.lang.Integer getRow_height() {
        return row_height;
    }


    /**
     * Sets the row_height value for this DrawHeatmapRequest.
     * 
     * @param row_height   * Height of the rows (in pixel). If the row height is to small,
     * the label of the heatmap will not be indicated. (Default : 30 px)
     */
    public void setRow_height(java.lang.Integer row_height) {
        this.row_height = row_height;
    }


    /**
     * Gets the min value for this DrawHeatmapRequest.
     * 
     * @return min   * Minimal value of the heatmap. By default, this value is the
     * minimal value of the input file. If the specified value is larger
     * than the minimal value of the heatmap, then the minimal value of the
     * heatmap will be used as minimal value.
     */
    public java.lang.Integer getMin() {
        return min;
    }


    /**
     * Sets the min value for this DrawHeatmapRequest.
     * 
     * @param min   * Minimal value of the heatmap. By default, this value is the
     * minimal value of the input file. If the specified value is larger
     * than the minimal value of the heatmap, then the minimal value of the
     * heatmap will be used as minimal value.
     */
    public void setMin(java.lang.Integer min) {
        this.min = min;
    }


    /**
     * Gets the max value for this DrawHeatmapRequest.
     * 
     * @return max   * Maximal value of the heatmap. By default, this value is the
     * maximal value of the input file. If the specified value is smaller
     * than the maximal value of the heatmap, then the maximal value of the
     * heatmap will be used as maximal value.
     */
    public java.lang.Integer getMax() {
        return max;
    }


    /**
     * Sets the max value for this DrawHeatmapRequest.
     * 
     * @param max   * Maximal value of the heatmap. By default, this value is the
     * maximal value of the input file. If the specified value is smaller
     * than the maximal value of the heatmap, then the maximal value of the
     * heatmap will be used as maximal value.
     */
    public void setMax(java.lang.Integer max) {
        this.max = max;
    }


    /**
     * Gets the gradient value for this DrawHeatmapRequest.
     * 
     * @return gradient   * Color of the intensity gradient of the heatmap. Default is
     * grey.
     *         				Supported : green, blue, red, fire, grey.
     */
    public java.lang.String getGradient() {
        return gradient;
    }


    /**
     * Sets the gradient value for this DrawHeatmapRequest.
     * 
     * @param gradient   * Color of the intensity gradient of the heatmap. Default is
     * grey.
     *         				Supported : green, blue, red, fire, grey.
     */
    public void setGradient(java.lang.String gradient) {
        this.gradient = gradient;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DrawHeatmapRequest)) return false;
        DrawHeatmapRequest other = (DrawHeatmapRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.outformat==null && other.getOutformat()==null) || 
             (this.outformat!=null &&
              this.outformat.equals(other.getOutformat()))) &&
            ((this.html==null && other.getHtml()==null) || 
             (this.html!=null &&
              this.html.equals(other.getHtml()))) &&
            ((this.inputfile==null && other.getInputfile()==null) || 
             (this.inputfile!=null &&
              this.inputfile.equals(other.getInputfile()))) &&
            ((this.row_names==null && other.getRow_names()==null) || 
             (this.row_names!=null &&
              this.row_names.equals(other.getRow_names()))) &&
            ((this.no_text==null && other.getNo_text()==null) || 
             (this.no_text!=null &&
              this.no_text.equals(other.getNo_text()))) &&
            ((this.col_width==null && other.getCol_width()==null) || 
             (this.col_width!=null &&
              this.col_width.equals(other.getCol_width()))) &&
            ((this.row_height==null && other.getRow_height()==null) || 
             (this.row_height!=null &&
              this.row_height.equals(other.getRow_height()))) &&
            ((this.min==null && other.getMin()==null) || 
             (this.min!=null &&
              this.min.equals(other.getMin()))) &&
            ((this.max==null && other.getMax()==null) || 
             (this.max!=null &&
              this.max.equals(other.getMax()))) &&
            ((this.gradient==null && other.getGradient()==null) || 
             (this.gradient!=null &&
              this.gradient.equals(other.getGradient())));
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
        if (getOutformat() != null) {
            _hashCode += getOutformat().hashCode();
        }
        if (getHtml() != null) {
            _hashCode += getHtml().hashCode();
        }
        if (getInputfile() != null) {
            _hashCode += getInputfile().hashCode();
        }
        if (getRow_names() != null) {
            _hashCode += getRow_names().hashCode();
        }
        if (getNo_text() != null) {
            _hashCode += getNo_text().hashCode();
        }
        if (getCol_width() != null) {
            _hashCode += getCol_width().hashCode();
        }
        if (getRow_height() != null) {
            _hashCode += getRow_height().hashCode();
        }
        if (getMin() != null) {
            _hashCode += getMin().hashCode();
        }
        if (getMax() != null) {
            _hashCode += getMax().hashCode();
        }
        if (getGradient() != null) {
            _hashCode += getGradient().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DrawHeatmapRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:RSATWS", "DrawHeatmapRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("outformat");
        elemField.setXmlName(new javax.xml.namespace.QName("", "outformat"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("html");
        elemField.setXmlName(new javax.xml.namespace.QName("", "html"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("inputfile");
        elemField.setXmlName(new javax.xml.namespace.QName("", "inputfile"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("row_names");
        elemField.setXmlName(new javax.xml.namespace.QName("", "row_names"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("no_text");
        elemField.setXmlName(new javax.xml.namespace.QName("", "no_text"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("col_width");
        elemField.setXmlName(new javax.xml.namespace.QName("", "col_width"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("row_height");
        elemField.setXmlName(new javax.xml.namespace.QName("", "row_height"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("min");
        elemField.setXmlName(new javax.xml.namespace.QName("", "min"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("max");
        elemField.setXmlName(new javax.xml.namespace.QName("", "max"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("gradient");
        elemField.setXmlName(new javax.xml.namespace.QName("", "gradient"));
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
