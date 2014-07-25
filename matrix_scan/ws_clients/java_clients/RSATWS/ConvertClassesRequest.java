/**
 * ConvertClassesRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.3 Oct 05, 2005 (05:23:37 EDT) WSDL2Java emitter.
 */

package RSATWS;


/**
 * Parameters for the operation convert-classes.
 */
public class ConvertClassesRequest  implements java.io.Serializable {
    /* Input format : supported tab, profiles, mcl */
    private java.lang.String informat;

    /* Output format : supported tab, profiles, mcl */
    private java.lang.String outformat;

    /* Member column. Column containing the member names in the tab
     * format (default 1). */
    private java.lang.String member_col;

    /* Class column. Column containing the class names in the tab
     * format  (default 2). */
    private java.lang.String class_col;

    /* Score column. Column containing the score in the tab format
     * : if not specified, scores are not defined.. */
    private java.lang.Integer score_col;

    /* Minimal score value for member to class assignation. */
    private java.lang.String min_score;

    /* Input classes in the format defined by the input_format tag */
    private java.lang.String inputclasses;

    /* Two tab-delimited columns specifying the labels of the members
     * of the classification given in the classification file. First column
     * contains the identifier and second column the corresponding label. */
    private java.lang.String names;

    public ConvertClassesRequest() {
    }

    public ConvertClassesRequest(
           java.lang.String informat,
           java.lang.String outformat,
           java.lang.String member_col,
           java.lang.String class_col,
           java.lang.Integer score_col,
           java.lang.String min_score,
           java.lang.String inputclasses,
           java.lang.String names) {
           this.informat = informat;
           this.outformat = outformat;
           this.member_col = member_col;
           this.class_col = class_col;
           this.score_col = score_col;
           this.min_score = min_score;
           this.inputclasses = inputclasses;
           this.names = names;
    }


    /**
     * Gets the informat value for this ConvertClassesRequest.
     * 
     * @return informat   * Input format : supported tab, profiles, mcl
     */
    public java.lang.String getInformat() {
        return informat;
    }


    /**
     * Sets the informat value for this ConvertClassesRequest.
     * 
     * @param informat   * Input format : supported tab, profiles, mcl
     */
    public void setInformat(java.lang.String informat) {
        this.informat = informat;
    }


    /**
     * Gets the outformat value for this ConvertClassesRequest.
     * 
     * @return outformat   * Output format : supported tab, profiles, mcl
     */
    public java.lang.String getOutformat() {
        return outformat;
    }


    /**
     * Sets the outformat value for this ConvertClassesRequest.
     * 
     * @param outformat   * Output format : supported tab, profiles, mcl
     */
    public void setOutformat(java.lang.String outformat) {
        this.outformat = outformat;
    }


    /**
     * Gets the member_col value for this ConvertClassesRequest.
     * 
     * @return member_col   * Member column. Column containing the member names in the tab
     * format (default 1).
     */
    public java.lang.String getMember_col() {
        return member_col;
    }


    /**
     * Sets the member_col value for this ConvertClassesRequest.
     * 
     * @param member_col   * Member column. Column containing the member names in the tab
     * format (default 1).
     */
    public void setMember_col(java.lang.String member_col) {
        this.member_col = member_col;
    }


    /**
     * Gets the class_col value for this ConvertClassesRequest.
     * 
     * @return class_col   * Class column. Column containing the class names in the tab
     * format  (default 2).
     */
    public java.lang.String getClass_col() {
        return class_col;
    }


    /**
     * Sets the class_col value for this ConvertClassesRequest.
     * 
     * @param class_col   * Class column. Column containing the class names in the tab
     * format  (default 2).
     */
    public void setClass_col(java.lang.String class_col) {
        this.class_col = class_col;
    }


    /**
     * Gets the score_col value for this ConvertClassesRequest.
     * 
     * @return score_col   * Score column. Column containing the score in the tab format
     * : if not specified, scores are not defined..
     */
    public java.lang.Integer getScore_col() {
        return score_col;
    }


    /**
     * Sets the score_col value for this ConvertClassesRequest.
     * 
     * @param score_col   * Score column. Column containing the score in the tab format
     * : if not specified, scores are not defined..
     */
    public void setScore_col(java.lang.Integer score_col) {
        this.score_col = score_col;
    }


    /**
     * Gets the min_score value for this ConvertClassesRequest.
     * 
     * @return min_score   * Minimal score value for member to class assignation.
     */
    public java.lang.String getMin_score() {
        return min_score;
    }


    /**
     * Sets the min_score value for this ConvertClassesRequest.
     * 
     * @param min_score   * Minimal score value for member to class assignation.
     */
    public void setMin_score(java.lang.String min_score) {
        this.min_score = min_score;
    }


    /**
     * Gets the inputclasses value for this ConvertClassesRequest.
     * 
     * @return inputclasses   * Input classes in the format defined by the input_format tag
     */
    public java.lang.String getInputclasses() {
        return inputclasses;
    }


    /**
     * Sets the inputclasses value for this ConvertClassesRequest.
     * 
     * @param inputclasses   * Input classes in the format defined by the input_format tag
     */
    public void setInputclasses(java.lang.String inputclasses) {
        this.inputclasses = inputclasses;
    }


    /**
     * Gets the names value for this ConvertClassesRequest.
     * 
     * @return names   * Two tab-delimited columns specifying the labels of the members
     * of the classification given in the classification file. First column
     * contains the identifier and second column the corresponding label.
     */
    public java.lang.String getNames() {
        return names;
    }


    /**
     * Sets the names value for this ConvertClassesRequest.
     * 
     * @param names   * Two tab-delimited columns specifying the labels of the members
     * of the classification given in the classification file. First column
     * contains the identifier and second column the corresponding label.
     */
    public void setNames(java.lang.String names) {
        this.names = names;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ConvertClassesRequest)) return false;
        ConvertClassesRequest other = (ConvertClassesRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.informat==null && other.getInformat()==null) || 
             (this.informat!=null &&
              this.informat.equals(other.getInformat()))) &&
            ((this.outformat==null && other.getOutformat()==null) || 
             (this.outformat!=null &&
              this.outformat.equals(other.getOutformat()))) &&
            ((this.member_col==null && other.getMember_col()==null) || 
             (this.member_col!=null &&
              this.member_col.equals(other.getMember_col()))) &&
            ((this.class_col==null && other.getClass_col()==null) || 
             (this.class_col!=null &&
              this.class_col.equals(other.getClass_col()))) &&
            ((this.score_col==null && other.getScore_col()==null) || 
             (this.score_col!=null &&
              this.score_col.equals(other.getScore_col()))) &&
            ((this.min_score==null && other.getMin_score()==null) || 
             (this.min_score!=null &&
              this.min_score.equals(other.getMin_score()))) &&
            ((this.inputclasses==null && other.getInputclasses()==null) || 
             (this.inputclasses!=null &&
              this.inputclasses.equals(other.getInputclasses()))) &&
            ((this.names==null && other.getNames()==null) || 
             (this.names!=null &&
              this.names.equals(other.getNames())));
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
        if (getInformat() != null) {
            _hashCode += getInformat().hashCode();
        }
        if (getOutformat() != null) {
            _hashCode += getOutformat().hashCode();
        }
        if (getMember_col() != null) {
            _hashCode += getMember_col().hashCode();
        }
        if (getClass_col() != null) {
            _hashCode += getClass_col().hashCode();
        }
        if (getScore_col() != null) {
            _hashCode += getScore_col().hashCode();
        }
        if (getMin_score() != null) {
            _hashCode += getMin_score().hashCode();
        }
        if (getInputclasses() != null) {
            _hashCode += getInputclasses().hashCode();
        }
        if (getNames() != null) {
            _hashCode += getNames().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ConvertClassesRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:RSATWS", "ConvertClassesRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("informat");
        elemField.setXmlName(new javax.xml.namespace.QName("", "informat"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("outformat");
        elemField.setXmlName(new javax.xml.namespace.QName("", "outformat"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("member_col");
        elemField.setXmlName(new javax.xml.namespace.QName("", "member_col"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("class_col");
        elemField.setXmlName(new javax.xml.namespace.QName("", "class_col"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("score_col");
        elemField.setXmlName(new javax.xml.namespace.QName("", "score_col"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("min_score");
        elemField.setXmlName(new javax.xml.namespace.QName("", "min_score"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("inputclasses");
        elemField.setXmlName(new javax.xml.namespace.QName("", "inputclasses"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("names");
        elemField.setXmlName(new javax.xml.namespace.QName("", "names"));
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
