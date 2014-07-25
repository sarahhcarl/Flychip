/**
 * XYGraphRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.3 Oct 05, 2005 (05:23:37 EDT) WSDL2Java emitter.
 */

package RSATWS;

public class XYGraphRequest  implements java.io.Serializable {
    /* The input file should contain columns with numeric data. Each
     * line contains info about one point of the graph. By  default, the
     * first column is considered to contain X data, and the second column
     * Y data. X and Y columns can be changed with -xcol and -ycol options.
     * Columns should be separated by tabs. */
    private java.lang.String inputFile;

    /* Supported : png,pdf,jpg,eps,gif */
    private java.lang.String format;

    /* first graph title */
    private java.lang.String title1;

    /* second graph title */
    private java.lang.String title2;

    /* points are jointed by lines */
    private java.lang.Integer lines;

    /* use the content of the first line from input file as
     *                         		      legend for Y data. */
    private java.lang.Integer legend;

    /* first line of the data file contains a column header
     *                         		      if option -legend is active, this
     * header is used as
     *                         		      legend, else it is ignored. */
    private java.lang.Integer header;

    /* first x legend */
    private java.lang.String xleg1;

    /* second x legend */
    private java.lang.String xleg2;

    /* first y legend */
    private java.lang.String yleg1;

    /* second y legend */
    private java.lang.String yleg2;

    /* maximal value represented on X axis. */
    private java.lang.String xmax;

    /* maximal value represented on Y axis. */
    private java.lang.String ymax;

    /* minimal value represented on X axis. */
    private java.lang.String xmin;

    /* minimal value represented on Y axis. */
    private java.lang.String ymin;

    /* Y data are displayed on a logarithmic scale
     * 					      If the next argument is a number, it provides the
     *                         		     log base. Default log base is 10. */
    private java.lang.String ylog;

    /* X data are displayed on a logarithmic scale
     * 					      		 If the next argument is a number, it provides the
     *                 			                 log base. Default log base is
     * 10. */
    private java.lang.String xlog;

    /* column containing data for the X axis.
     * 					      A zero value indicates that there is no column with X va
     * 					      lues.
     *                         In this case, X values are ordinal. */
    private java.lang.String xcol;

    /* column containing data for the Y axis.
     * 					      Several columns can be specified by:
     * 					      -ycol #,#,#
     * 					      A range of columns can be specified by:
     * 					      -ycol #-#
     *                         They have to be separated by commas without
     * spaces. */
    private java.lang.String ycol;

    public XYGraphRequest() {
    }

    public XYGraphRequest(
           java.lang.String inputFile,
           java.lang.String format,
           java.lang.String title1,
           java.lang.String title2,
           java.lang.Integer lines,
           java.lang.Integer legend,
           java.lang.Integer header,
           java.lang.String xleg1,
           java.lang.String xleg2,
           java.lang.String yleg1,
           java.lang.String yleg2,
           java.lang.String xmax,
           java.lang.String ymax,
           java.lang.String xmin,
           java.lang.String ymin,
           java.lang.String ylog,
           java.lang.String xlog,
           java.lang.String xcol,
           java.lang.String ycol) {
           this.inputFile = inputFile;
           this.format = format;
           this.title1 = title1;
           this.title2 = title2;
           this.lines = lines;
           this.legend = legend;
           this.header = header;
           this.xleg1 = xleg1;
           this.xleg2 = xleg2;
           this.yleg1 = yleg1;
           this.yleg2 = yleg2;
           this.xmax = xmax;
           this.ymax = ymax;
           this.xmin = xmin;
           this.ymin = ymin;
           this.ylog = ylog;
           this.xlog = xlog;
           this.xcol = xcol;
           this.ycol = ycol;
    }


    /**
     * Gets the inputFile value for this XYGraphRequest.
     * 
     * @return inputFile   * The input file should contain columns with numeric data. Each
     * line contains info about one point of the graph. By  default, the
     * first column is considered to contain X data, and the second column
     * Y data. X and Y columns can be changed with -xcol and -ycol options.
     * Columns should be separated by tabs.
     */
    public java.lang.String getInputFile() {
        return inputFile;
    }


    /**
     * Sets the inputFile value for this XYGraphRequest.
     * 
     * @param inputFile   * The input file should contain columns with numeric data. Each
     * line contains info about one point of the graph. By  default, the
     * first column is considered to contain X data, and the second column
     * Y data. X and Y columns can be changed with -xcol and -ycol options.
     * Columns should be separated by tabs.
     */
    public void setInputFile(java.lang.String inputFile) {
        this.inputFile = inputFile;
    }


    /**
     * Gets the format value for this XYGraphRequest.
     * 
     * @return format   * Supported : png,pdf,jpg,eps,gif
     */
    public java.lang.String getFormat() {
        return format;
    }


    /**
     * Sets the format value for this XYGraphRequest.
     * 
     * @param format   * Supported : png,pdf,jpg,eps,gif
     */
    public void setFormat(java.lang.String format) {
        this.format = format;
    }


    /**
     * Gets the title1 value for this XYGraphRequest.
     * 
     * @return title1   * first graph title
     */
    public java.lang.String getTitle1() {
        return title1;
    }


    /**
     * Sets the title1 value for this XYGraphRequest.
     * 
     * @param title1   * first graph title
     */
    public void setTitle1(java.lang.String title1) {
        this.title1 = title1;
    }


    /**
     * Gets the title2 value for this XYGraphRequest.
     * 
     * @return title2   * second graph title
     */
    public java.lang.String getTitle2() {
        return title2;
    }


    /**
     * Sets the title2 value for this XYGraphRequest.
     * 
     * @param title2   * second graph title
     */
    public void setTitle2(java.lang.String title2) {
        this.title2 = title2;
    }


    /**
     * Gets the lines value for this XYGraphRequest.
     * 
     * @return lines   * points are jointed by lines
     */
    public java.lang.Integer getLines() {
        return lines;
    }


    /**
     * Sets the lines value for this XYGraphRequest.
     * 
     * @param lines   * points are jointed by lines
     */
    public void setLines(java.lang.Integer lines) {
        this.lines = lines;
    }


    /**
     * Gets the legend value for this XYGraphRequest.
     * 
     * @return legend   * use the content of the first line from input file as
     *                         		      legend for Y data.
     */
    public java.lang.Integer getLegend() {
        return legend;
    }


    /**
     * Sets the legend value for this XYGraphRequest.
     * 
     * @param legend   * use the content of the first line from input file as
     *                         		      legend for Y data.
     */
    public void setLegend(java.lang.Integer legend) {
        this.legend = legend;
    }


    /**
     * Gets the header value for this XYGraphRequest.
     * 
     * @return header   * first line of the data file contains a column header
     *                         		      if option -legend is active, this
     * header is used as
     *                         		      legend, else it is ignored.
     */
    public java.lang.Integer getHeader() {
        return header;
    }


    /**
     * Sets the header value for this XYGraphRequest.
     * 
     * @param header   * first line of the data file contains a column header
     *                         		      if option -legend is active, this
     * header is used as
     *                         		      legend, else it is ignored.
     */
    public void setHeader(java.lang.Integer header) {
        this.header = header;
    }


    /**
     * Gets the xleg1 value for this XYGraphRequest.
     * 
     * @return xleg1   * first x legend
     */
    public java.lang.String getXleg1() {
        return xleg1;
    }


    /**
     * Sets the xleg1 value for this XYGraphRequest.
     * 
     * @param xleg1   * first x legend
     */
    public void setXleg1(java.lang.String xleg1) {
        this.xleg1 = xleg1;
    }


    /**
     * Gets the xleg2 value for this XYGraphRequest.
     * 
     * @return xleg2   * second x legend
     */
    public java.lang.String getXleg2() {
        return xleg2;
    }


    /**
     * Sets the xleg2 value for this XYGraphRequest.
     * 
     * @param xleg2   * second x legend
     */
    public void setXleg2(java.lang.String xleg2) {
        this.xleg2 = xleg2;
    }


    /**
     * Gets the yleg1 value for this XYGraphRequest.
     * 
     * @return yleg1   * first y legend
     */
    public java.lang.String getYleg1() {
        return yleg1;
    }


    /**
     * Sets the yleg1 value for this XYGraphRequest.
     * 
     * @param yleg1   * first y legend
     */
    public void setYleg1(java.lang.String yleg1) {
        this.yleg1 = yleg1;
    }


    /**
     * Gets the yleg2 value for this XYGraphRequest.
     * 
     * @return yleg2   * second y legend
     */
    public java.lang.String getYleg2() {
        return yleg2;
    }


    /**
     * Sets the yleg2 value for this XYGraphRequest.
     * 
     * @param yleg2   * second y legend
     */
    public void setYleg2(java.lang.String yleg2) {
        this.yleg2 = yleg2;
    }


    /**
     * Gets the xmax value for this XYGraphRequest.
     * 
     * @return xmax   * maximal value represented on X axis.
     */
    public java.lang.String getXmax() {
        return xmax;
    }


    /**
     * Sets the xmax value for this XYGraphRequest.
     * 
     * @param xmax   * maximal value represented on X axis.
     */
    public void setXmax(java.lang.String xmax) {
        this.xmax = xmax;
    }


    /**
     * Gets the ymax value for this XYGraphRequest.
     * 
     * @return ymax   * maximal value represented on Y axis.
     */
    public java.lang.String getYmax() {
        return ymax;
    }


    /**
     * Sets the ymax value for this XYGraphRequest.
     * 
     * @param ymax   * maximal value represented on Y axis.
     */
    public void setYmax(java.lang.String ymax) {
        this.ymax = ymax;
    }


    /**
     * Gets the xmin value for this XYGraphRequest.
     * 
     * @return xmin   * minimal value represented on X axis.
     */
    public java.lang.String getXmin() {
        return xmin;
    }


    /**
     * Sets the xmin value for this XYGraphRequest.
     * 
     * @param xmin   * minimal value represented on X axis.
     */
    public void setXmin(java.lang.String xmin) {
        this.xmin = xmin;
    }


    /**
     * Gets the ymin value for this XYGraphRequest.
     * 
     * @return ymin   * minimal value represented on Y axis.
     */
    public java.lang.String getYmin() {
        return ymin;
    }


    /**
     * Sets the ymin value for this XYGraphRequest.
     * 
     * @param ymin   * minimal value represented on Y axis.
     */
    public void setYmin(java.lang.String ymin) {
        this.ymin = ymin;
    }


    /**
     * Gets the ylog value for this XYGraphRequest.
     * 
     * @return ylog   * Y data are displayed on a logarithmic scale
     * 					      If the next argument is a number, it provides the
     *                         		     log base. Default log base is 10.
     */
    public java.lang.String getYlog() {
        return ylog;
    }


    /**
     * Sets the ylog value for this XYGraphRequest.
     * 
     * @param ylog   * Y data are displayed on a logarithmic scale
     * 					      If the next argument is a number, it provides the
     *                         		     log base. Default log base is 10.
     */
    public void setYlog(java.lang.String ylog) {
        this.ylog = ylog;
    }


    /**
     * Gets the xlog value for this XYGraphRequest.
     * 
     * @return xlog   * X data are displayed on a logarithmic scale
     * 					      		 If the next argument is a number, it provides the
     *                 			                 log base. Default log base is
     * 10.
     */
    public java.lang.String getXlog() {
        return xlog;
    }


    /**
     * Sets the xlog value for this XYGraphRequest.
     * 
     * @param xlog   * X data are displayed on a logarithmic scale
     * 					      		 If the next argument is a number, it provides the
     *                 			                 log base. Default log base is
     * 10.
     */
    public void setXlog(java.lang.String xlog) {
        this.xlog = xlog;
    }


    /**
     * Gets the xcol value for this XYGraphRequest.
     * 
     * @return xcol   * column containing data for the X axis.
     * 					      A zero value indicates that there is no column with X va
     * 					      lues.
     *                         In this case, X values are ordinal.
     */
    public java.lang.String getXcol() {
        return xcol;
    }


    /**
     * Sets the xcol value for this XYGraphRequest.
     * 
     * @param xcol   * column containing data for the X axis.
     * 					      A zero value indicates that there is no column with X va
     * 					      lues.
     *                         In this case, X values are ordinal.
     */
    public void setXcol(java.lang.String xcol) {
        this.xcol = xcol;
    }


    /**
     * Gets the ycol value for this XYGraphRequest.
     * 
     * @return ycol   * column containing data for the Y axis.
     * 					      Several columns can be specified by:
     * 					      -ycol #,#,#
     * 					      A range of columns can be specified by:
     * 					      -ycol #-#
     *                         They have to be separated by commas without
     * spaces.
     */
    public java.lang.String getYcol() {
        return ycol;
    }


    /**
     * Sets the ycol value for this XYGraphRequest.
     * 
     * @param ycol   * column containing data for the Y axis.
     * 					      Several columns can be specified by:
     * 					      -ycol #,#,#
     * 					      A range of columns can be specified by:
     * 					      -ycol #-#
     *                         They have to be separated by commas without
     * spaces.
     */
    public void setYcol(java.lang.String ycol) {
        this.ycol = ycol;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof XYGraphRequest)) return false;
        XYGraphRequest other = (XYGraphRequest) obj;
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
            ((this.format==null && other.getFormat()==null) || 
             (this.format!=null &&
              this.format.equals(other.getFormat()))) &&
            ((this.title1==null && other.getTitle1()==null) || 
             (this.title1!=null &&
              this.title1.equals(other.getTitle1()))) &&
            ((this.title2==null && other.getTitle2()==null) || 
             (this.title2!=null &&
              this.title2.equals(other.getTitle2()))) &&
            ((this.lines==null && other.getLines()==null) || 
             (this.lines!=null &&
              this.lines.equals(other.getLines()))) &&
            ((this.legend==null && other.getLegend()==null) || 
             (this.legend!=null &&
              this.legend.equals(other.getLegend()))) &&
            ((this.header==null && other.getHeader()==null) || 
             (this.header!=null &&
              this.header.equals(other.getHeader()))) &&
            ((this.xleg1==null && other.getXleg1()==null) || 
             (this.xleg1!=null &&
              this.xleg1.equals(other.getXleg1()))) &&
            ((this.xleg2==null && other.getXleg2()==null) || 
             (this.xleg2!=null &&
              this.xleg2.equals(other.getXleg2()))) &&
            ((this.yleg1==null && other.getYleg1()==null) || 
             (this.yleg1!=null &&
              this.yleg1.equals(other.getYleg1()))) &&
            ((this.yleg2==null && other.getYleg2()==null) || 
             (this.yleg2!=null &&
              this.yleg2.equals(other.getYleg2()))) &&
            ((this.xmax==null && other.getXmax()==null) || 
             (this.xmax!=null &&
              this.xmax.equals(other.getXmax()))) &&
            ((this.ymax==null && other.getYmax()==null) || 
             (this.ymax!=null &&
              this.ymax.equals(other.getYmax()))) &&
            ((this.xmin==null && other.getXmin()==null) || 
             (this.xmin!=null &&
              this.xmin.equals(other.getXmin()))) &&
            ((this.ymin==null && other.getYmin()==null) || 
             (this.ymin!=null &&
              this.ymin.equals(other.getYmin()))) &&
            ((this.ylog==null && other.getYlog()==null) || 
             (this.ylog!=null &&
              this.ylog.equals(other.getYlog()))) &&
            ((this.xlog==null && other.getXlog()==null) || 
             (this.xlog!=null &&
              this.xlog.equals(other.getXlog()))) &&
            ((this.xcol==null && other.getXcol()==null) || 
             (this.xcol!=null &&
              this.xcol.equals(other.getXcol()))) &&
            ((this.ycol==null && other.getYcol()==null) || 
             (this.ycol!=null &&
              this.ycol.equals(other.getYcol())));
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
        if (getFormat() != null) {
            _hashCode += getFormat().hashCode();
        }
        if (getTitle1() != null) {
            _hashCode += getTitle1().hashCode();
        }
        if (getTitle2() != null) {
            _hashCode += getTitle2().hashCode();
        }
        if (getLines() != null) {
            _hashCode += getLines().hashCode();
        }
        if (getLegend() != null) {
            _hashCode += getLegend().hashCode();
        }
        if (getHeader() != null) {
            _hashCode += getHeader().hashCode();
        }
        if (getXleg1() != null) {
            _hashCode += getXleg1().hashCode();
        }
        if (getXleg2() != null) {
            _hashCode += getXleg2().hashCode();
        }
        if (getYleg1() != null) {
            _hashCode += getYleg1().hashCode();
        }
        if (getYleg2() != null) {
            _hashCode += getYleg2().hashCode();
        }
        if (getXmax() != null) {
            _hashCode += getXmax().hashCode();
        }
        if (getYmax() != null) {
            _hashCode += getYmax().hashCode();
        }
        if (getXmin() != null) {
            _hashCode += getXmin().hashCode();
        }
        if (getYmin() != null) {
            _hashCode += getYmin().hashCode();
        }
        if (getYlog() != null) {
            _hashCode += getYlog().hashCode();
        }
        if (getXlog() != null) {
            _hashCode += getXlog().hashCode();
        }
        if (getXcol() != null) {
            _hashCode += getXcol().hashCode();
        }
        if (getYcol() != null) {
            _hashCode += getYcol().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(XYGraphRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:RSATWS", "XYGraphRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("inputFile");
        elemField.setXmlName(new javax.xml.namespace.QName("", "inputFile"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("format");
        elemField.setXmlName(new javax.xml.namespace.QName("", "format"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("title1");
        elemField.setXmlName(new javax.xml.namespace.QName("", "title1"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("title2");
        elemField.setXmlName(new javax.xml.namespace.QName("", "title2"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lines");
        elemField.setXmlName(new javax.xml.namespace.QName("", "lines"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("legend");
        elemField.setXmlName(new javax.xml.namespace.QName("", "legend"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("header");
        elemField.setXmlName(new javax.xml.namespace.QName("", "header"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("xleg1");
        elemField.setXmlName(new javax.xml.namespace.QName("", "xleg1"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("xleg2");
        elemField.setXmlName(new javax.xml.namespace.QName("", "xleg2"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("yleg1");
        elemField.setXmlName(new javax.xml.namespace.QName("", "yleg1"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("yleg2");
        elemField.setXmlName(new javax.xml.namespace.QName("", "yleg2"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("xmax");
        elemField.setXmlName(new javax.xml.namespace.QName("", "xmax"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ymax");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ymax"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("xmin");
        elemField.setXmlName(new javax.xml.namespace.QName("", "xmin"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ymin");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ymin"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ylog");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ylog"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("xlog");
        elemField.setXmlName(new javax.xml.namespace.QName("", "xlog"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("xcol");
        elemField.setXmlName(new javax.xml.namespace.QName("", "xcol"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ycol");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ycol"));
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
