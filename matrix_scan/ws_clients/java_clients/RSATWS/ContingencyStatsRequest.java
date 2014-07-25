/**
 * ContingencyStatsRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.3 Oct 05, 2005 (05:23:37 EDT) WSDL2Java emitter.
 */

package RSATWS;


/**
 * Parameters for the operation contingency-stats.
 */
public class ContingencyStatsRequest  implements java.io.Serializable {
    /* A contingency table : a N*M table used to compare the contents
     * of two classifications. Rows represent the clusters of the first classification
     * (considered as reference), and columns the clusters of the second
     * classification (query). */
    private java.lang.String inputfile;

    /* Number of decimals to display for the computed statistics. */
    private java.lang.Integer decimals;

    /* List of fields to return.
     * 	  	stats : table-wise statistics
     *                 rowstats : row-wise statistics (one line per row of
     * the contingency table)
     *                 colstats : column-wise statistics (one line per column
     * of the contingency table)
     *                 tables : full tables for each statistics (counts,
     * Sn, PPV, separation).
     *                 margins : marginal statistics besides the tables (requires
     * to return tables). */
    private java.lang.String _return;

    /* Specify row group sizes in a separate file. This option can
     * be used in particular cases where the marginal sum of the contingency
     * table does not correspond to the group sizes (for example if a classification
     * supoprts the same elements assigned to multiple groups, or on the
     * contrary if some elements can be unassigned).
     *             The row size file must contain one row per row of the
     * contingency table, and two columns. The first column indicated the
     * name of the row (the same name as in the contingency table), and the
     * second the  size of the corresponding group. */
    private java.lang.String rsizes;

    /* Specify column group sizes in a separate file.
     *             Same description as for -rsizes tag. */
    private java.lang.String csizes;

    public ContingencyStatsRequest() {
    }

    public ContingencyStatsRequest(
           java.lang.String inputfile,
           java.lang.Integer decimals,
           java.lang.String _return,
           java.lang.String rsizes,
           java.lang.String csizes) {
           this.inputfile = inputfile;
           this.decimals = decimals;
           this._return = _return;
           this.rsizes = rsizes;
           this.csizes = csizes;
    }


    /**
     * Gets the inputfile value for this ContingencyStatsRequest.
     * 
     * @return inputfile   * A contingency table : a N*M table used to compare the contents
     * of two classifications. Rows represent the clusters of the first classification
     * (considered as reference), and columns the clusters of the second
     * classification (query).
     */
    public java.lang.String getInputfile() {
        return inputfile;
    }


    /**
     * Sets the inputfile value for this ContingencyStatsRequest.
     * 
     * @param inputfile   * A contingency table : a N*M table used to compare the contents
     * of two classifications. Rows represent the clusters of the first classification
     * (considered as reference), and columns the clusters of the second
     * classification (query).
     */
    public void setInputfile(java.lang.String inputfile) {
        this.inputfile = inputfile;
    }


    /**
     * Gets the decimals value for this ContingencyStatsRequest.
     * 
     * @return decimals   * Number of decimals to display for the computed statistics.
     */
    public java.lang.Integer getDecimals() {
        return decimals;
    }


    /**
     * Sets the decimals value for this ContingencyStatsRequest.
     * 
     * @param decimals   * Number of decimals to display for the computed statistics.
     */
    public void setDecimals(java.lang.Integer decimals) {
        this.decimals = decimals;
    }


    /**
     * Gets the _return value for this ContingencyStatsRequest.
     * 
     * @return _return   * List of fields to return.
     * 	  	stats : table-wise statistics
     *                 rowstats : row-wise statistics (one line per row of
     * the contingency table)
     *                 colstats : column-wise statistics (one line per column
     * of the contingency table)
     *                 tables : full tables for each statistics (counts,
     * Sn, PPV, separation).
     *                 margins : marginal statistics besides the tables (requires
     * to return tables).
     */
    public java.lang.String get_return() {
        return _return;
    }


    /**
     * Sets the _return value for this ContingencyStatsRequest.
     * 
     * @param _return   * List of fields to return.
     * 	  	stats : table-wise statistics
     *                 rowstats : row-wise statistics (one line per row of
     * the contingency table)
     *                 colstats : column-wise statistics (one line per column
     * of the contingency table)
     *                 tables : full tables for each statistics (counts,
     * Sn, PPV, separation).
     *                 margins : marginal statistics besides the tables (requires
     * to return tables).
     */
    public void set_return(java.lang.String _return) {
        this._return = _return;
    }


    /**
     * Gets the rsizes value for this ContingencyStatsRequest.
     * 
     * @return rsizes   * Specify row group sizes in a separate file. This option can
     * be used in particular cases where the marginal sum of the contingency
     * table does not correspond to the group sizes (for example if a classification
     * supoprts the same elements assigned to multiple groups, or on the
     * contrary if some elements can be unassigned).
     *             The row size file must contain one row per row of the
     * contingency table, and two columns. The first column indicated the
     * name of the row (the same name as in the contingency table), and the
     * second the  size of the corresponding group.
     */
    public java.lang.String getRsizes() {
        return rsizes;
    }


    /**
     * Sets the rsizes value for this ContingencyStatsRequest.
     * 
     * @param rsizes   * Specify row group sizes in a separate file. This option can
     * be used in particular cases where the marginal sum of the contingency
     * table does not correspond to the group sizes (for example if a classification
     * supoprts the same elements assigned to multiple groups, or on the
     * contrary if some elements can be unassigned).
     *             The row size file must contain one row per row of the
     * contingency table, and two columns. The first column indicated the
     * name of the row (the same name as in the contingency table), and the
     * second the  size of the corresponding group.
     */
    public void setRsizes(java.lang.String rsizes) {
        this.rsizes = rsizes;
    }


    /**
     * Gets the csizes value for this ContingencyStatsRequest.
     * 
     * @return csizes   * Specify column group sizes in a separate file.
     *             Same description as for -rsizes tag.
     */
    public java.lang.String getCsizes() {
        return csizes;
    }


    /**
     * Sets the csizes value for this ContingencyStatsRequest.
     * 
     * @param csizes   * Specify column group sizes in a separate file.
     *             Same description as for -rsizes tag.
     */
    public void setCsizes(java.lang.String csizes) {
        this.csizes = csizes;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ContingencyStatsRequest)) return false;
        ContingencyStatsRequest other = (ContingencyStatsRequest) obj;
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
            ((this.decimals==null && other.getDecimals()==null) || 
             (this.decimals!=null &&
              this.decimals.equals(other.getDecimals()))) &&
            ((this._return==null && other.get_return()==null) || 
             (this._return!=null &&
              this._return.equals(other.get_return()))) &&
            ((this.rsizes==null && other.getRsizes()==null) || 
             (this.rsizes!=null &&
              this.rsizes.equals(other.getRsizes()))) &&
            ((this.csizes==null && other.getCsizes()==null) || 
             (this.csizes!=null &&
              this.csizes.equals(other.getCsizes())));
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
        if (getDecimals() != null) {
            _hashCode += getDecimals().hashCode();
        }
        if (get_return() != null) {
            _hashCode += get_return().hashCode();
        }
        if (getRsizes() != null) {
            _hashCode += getRsizes().hashCode();
        }
        if (getCsizes() != null) {
            _hashCode += getCsizes().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ContingencyStatsRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:RSATWS", "ContingencyStatsRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("inputfile");
        elemField.setXmlName(new javax.xml.namespace.QName("", "inputfile"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("decimals");
        elemField.setXmlName(new javax.xml.namespace.QName("", "decimals"));
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
        elemField.setFieldName("rsizes");
        elemField.setXmlName(new javax.xml.namespace.QName("", "rsizes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("csizes");
        elemField.setXmlName(new javax.xml.namespace.QName("", "csizes"));
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
