/**
 * CompareClassesRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.3 Oct 05, 2005 (05:23:37 EDT) WSDL2Java emitter.
 */

package RSATWS;


/**
 * Parameters for the operation compare_classes.
 */
public class CompareClassesRequest  implements java.io.Serializable {
    /* Return type. Accepted values: 'server' (result is stored on
     * a file on the server), 'client' (result is directly transferred to
     * the client), or  'both'. 
     * Default is 'both'. */
    private java.lang.String output;

    /* A tab-delimited text file containing the description of reference
     * classes */
    private java.lang.String[] ref_classes;

    /* A tab-delimited text file containing the description of query
     * classes */
    private java.lang.String query_classes;

    /* List of fields to return separated by a comma. Supported: dotprod,
     * entropy, freq, jac_sim, members, occ, proba, rank */
    private java.lang.String return_fields;

    /* Specify a column of the input file containing a score associated
     * to each member */
    private java.lang.Integer score_column;

    /* This file will be used as both reference and query.This is
     * equivalent to -q input_file -r input_file. */
    private java.lang.String input_classes;

    /* Supported fields: E(QR), E_val, F(!Q!R), F(Q!R), F(Q), F(QR),
     * F(R!Q), F(R), H(Q), H(Q,R), H(Q|R), H(R), H(R|Q), 
     * I(Q,R), IC, P(QR), P(Q|R), P(R|Q), P_val, Q, QR, QvR, R, U(Q|R), U(R|Q),
     * dH(Q,R), dotprod, jac_sim, rank, sigE(QR),E_val,F(!Q!R),F(Q!R),F(Q),F(QR),F(R!Q),F(R),H(Q),H
     * (Q,R),H(Q|R),H(R),H(R|Q),I(Q,R),IC,P(QR),P(Q|R),P(R|Q),P_val,Q,QR,QvR,R,U(Q|R),U
     * (R|Q),dH(Q,R),dotprod,dp_bits,jac_sim,log2_dp,names,prodrts,sig,sqrt_dp.
     * semicolumn (":") as there are fields containing commas. */
    private java.lang.String upper_threshold_field;

    /* Upper threshold value for a supported field. There must be
     * as many thresholds values as thresholds fields in the same order as
     * the list of threshold fields were given. */
    private java.lang.String upper_threshold_value;

    /* Supported fields: same fields as upper_threshold_field. */
    private java.lang.String lower_threshold_field;

    /* Lower threshold value for a given field. */
    private java.lang.String lower_threshold_value;

    /* Sort on the basis of the specified key. */
    private java.lang.String sort;

    /* Prevent to compare each class with itself (when the reference
     * and query files contain the same classes) */
    private java.lang.Integer distinct;

    /* (only valid if query file and reference file are the same)
     * Do not perform the reciprocal comparisons. */
    private java.lang.Integer triangle;

    /* Return a pairwise matrix, where each row corresponds to a reference
     * class, each column to a query class, and each cell contains a comparison
     * between the two classes. 
     * The next argument indicates which statistics has to be return in the
     * matrix (default = sig) 
     * Supported: E(QR), E_val, F(!Q!R), F(Q!R), F(Q), F(QR), F(R!Q), F(R),
     * H(Q), H(Q,R), H(Q|R), H(R), H(R|Q), I(Q,R), IC, P(QR), P(Q|R), P(R|Q),
     * P_val, Q, QR, QvR, R, U(Q|R), U(R|Q), dH(Q,R), dotprod, jac_sim, rank,
     * sig */
    private java.lang.String matrix;

    public CompareClassesRequest() {
    }

    public CompareClassesRequest(
           java.lang.String output,
           java.lang.String[] ref_classes,
           java.lang.String query_classes,
           java.lang.String return_fields,
           java.lang.Integer score_column,
           java.lang.String input_classes,
           java.lang.String upper_threshold_field,
           java.lang.String upper_threshold_value,
           java.lang.String lower_threshold_field,
           java.lang.String lower_threshold_value,
           java.lang.String sort,
           java.lang.Integer distinct,
           java.lang.Integer triangle,
           java.lang.String matrix) {
           this.output = output;
           this.ref_classes = ref_classes;
           this.query_classes = query_classes;
           this.return_fields = return_fields;
           this.score_column = score_column;
           this.input_classes = input_classes;
           this.upper_threshold_field = upper_threshold_field;
           this.upper_threshold_value = upper_threshold_value;
           this.lower_threshold_field = lower_threshold_field;
           this.lower_threshold_value = lower_threshold_value;
           this.sort = sort;
           this.distinct = distinct;
           this.triangle = triangle;
           this.matrix = matrix;
    }


    /**
     * Gets the output value for this CompareClassesRequest.
     * 
     * @return output   * Return type. Accepted values: 'server' (result is stored on
     * a file on the server), 'client' (result is directly transferred to
     * the client), or  'both'. 
     * Default is 'both'.
     */
    public java.lang.String getOutput() {
        return output;
    }


    /**
     * Sets the output value for this CompareClassesRequest.
     * 
     * @param output   * Return type. Accepted values: 'server' (result is stored on
     * a file on the server), 'client' (result is directly transferred to
     * the client), or  'both'. 
     * Default is 'both'.
     */
    public void setOutput(java.lang.String output) {
        this.output = output;
    }


    /**
     * Gets the ref_classes value for this CompareClassesRequest.
     * 
     * @return ref_classes   * A tab-delimited text file containing the description of reference
     * classes
     */
    public java.lang.String[] getRef_classes() {
        return ref_classes;
    }


    /**
     * Sets the ref_classes value for this CompareClassesRequest.
     * 
     * @param ref_classes   * A tab-delimited text file containing the description of reference
     * classes
     */
    public void setRef_classes(java.lang.String[] ref_classes) {
        this.ref_classes = ref_classes;
    }

    public java.lang.String getRef_classes(int i) {
        return this.ref_classes[i];
    }

    public void setRef_classes(int i, java.lang.String _value) {
        this.ref_classes[i] = _value;
    }


    /**
     * Gets the query_classes value for this CompareClassesRequest.
     * 
     * @return query_classes   * A tab-delimited text file containing the description of query
     * classes
     */
    public java.lang.String getQuery_classes() {
        return query_classes;
    }


    /**
     * Sets the query_classes value for this CompareClassesRequest.
     * 
     * @param query_classes   * A tab-delimited text file containing the description of query
     * classes
     */
    public void setQuery_classes(java.lang.String query_classes) {
        this.query_classes = query_classes;
    }


    /**
     * Gets the return_fields value for this CompareClassesRequest.
     * 
     * @return return_fields   * List of fields to return separated by a comma. Supported: dotprod,
     * entropy, freq, jac_sim, members, occ, proba, rank
     */
    public java.lang.String getReturn_fields() {
        return return_fields;
    }


    /**
     * Sets the return_fields value for this CompareClassesRequest.
     * 
     * @param return_fields   * List of fields to return separated by a comma. Supported: dotprod,
     * entropy, freq, jac_sim, members, occ, proba, rank
     */
    public void setReturn_fields(java.lang.String return_fields) {
        this.return_fields = return_fields;
    }


    /**
     * Gets the score_column value for this CompareClassesRequest.
     * 
     * @return score_column   * Specify a column of the input file containing a score associated
     * to each member
     */
    public java.lang.Integer getScore_column() {
        return score_column;
    }


    /**
     * Sets the score_column value for this CompareClassesRequest.
     * 
     * @param score_column   * Specify a column of the input file containing a score associated
     * to each member
     */
    public void setScore_column(java.lang.Integer score_column) {
        this.score_column = score_column;
    }


    /**
     * Gets the input_classes value for this CompareClassesRequest.
     * 
     * @return input_classes   * This file will be used as both reference and query.This is
     * equivalent to -q input_file -r input_file.
     */
    public java.lang.String getInput_classes() {
        return input_classes;
    }


    /**
     * Sets the input_classes value for this CompareClassesRequest.
     * 
     * @param input_classes   * This file will be used as both reference and query.This is
     * equivalent to -q input_file -r input_file.
     */
    public void setInput_classes(java.lang.String input_classes) {
        this.input_classes = input_classes;
    }


    /**
     * Gets the upper_threshold_field value for this CompareClassesRequest.
     * 
     * @return upper_threshold_field   * Supported fields: E(QR), E_val, F(!Q!R), F(Q!R), F(Q), F(QR),
     * F(R!Q), F(R), H(Q), H(Q,R), H(Q|R), H(R), H(R|Q), 
     * I(Q,R), IC, P(QR), P(Q|R), P(R|Q), P_val, Q, QR, QvR, R, U(Q|R), U(R|Q),
     * dH(Q,R), dotprod, jac_sim, rank, sigE(QR),E_val,F(!Q!R),F(Q!R),F(Q),F(QR),F(R!Q),F(R),H(Q),H
     * (Q,R),H(Q|R),H(R),H(R|Q),I(Q,R),IC,P(QR),P(Q|R),P(R|Q),P_val,Q,QR,QvR,R,U(Q|R),U
     * (R|Q),dH(Q,R),dotprod,dp_bits,jac_sim,log2_dp,names,prodrts,sig,sqrt_dp.
     * semicolumn (":") as there are fields containing commas.
     */
    public java.lang.String getUpper_threshold_field() {
        return upper_threshold_field;
    }


    /**
     * Sets the upper_threshold_field value for this CompareClassesRequest.
     * 
     * @param upper_threshold_field   * Supported fields: E(QR), E_val, F(!Q!R), F(Q!R), F(Q), F(QR),
     * F(R!Q), F(R), H(Q), H(Q,R), H(Q|R), H(R), H(R|Q), 
     * I(Q,R), IC, P(QR), P(Q|R), P(R|Q), P_val, Q, QR, QvR, R, U(Q|R), U(R|Q),
     * dH(Q,R), dotprod, jac_sim, rank, sigE(QR),E_val,F(!Q!R),F(Q!R),F(Q),F(QR),F(R!Q),F(R),H(Q),H
     * (Q,R),H(Q|R),H(R),H(R|Q),I(Q,R),IC,P(QR),P(Q|R),P(R|Q),P_val,Q,QR,QvR,R,U(Q|R),U
     * (R|Q),dH(Q,R),dotprod,dp_bits,jac_sim,log2_dp,names,prodrts,sig,sqrt_dp.
     * semicolumn (":") as there are fields containing commas.
     */
    public void setUpper_threshold_field(java.lang.String upper_threshold_field) {
        this.upper_threshold_field = upper_threshold_field;
    }


    /**
     * Gets the upper_threshold_value value for this CompareClassesRequest.
     * 
     * @return upper_threshold_value   * Upper threshold value for a supported field. There must be
     * as many thresholds values as thresholds fields in the same order as
     * the list of threshold fields were given.
     */
    public java.lang.String getUpper_threshold_value() {
        return upper_threshold_value;
    }


    /**
     * Sets the upper_threshold_value value for this CompareClassesRequest.
     * 
     * @param upper_threshold_value   * Upper threshold value for a supported field. There must be
     * as many thresholds values as thresholds fields in the same order as
     * the list of threshold fields were given.
     */
    public void setUpper_threshold_value(java.lang.String upper_threshold_value) {
        this.upper_threshold_value = upper_threshold_value;
    }


    /**
     * Gets the lower_threshold_field value for this CompareClassesRequest.
     * 
     * @return lower_threshold_field   * Supported fields: same fields as upper_threshold_field.
     */
    public java.lang.String getLower_threshold_field() {
        return lower_threshold_field;
    }


    /**
     * Sets the lower_threshold_field value for this CompareClassesRequest.
     * 
     * @param lower_threshold_field   * Supported fields: same fields as upper_threshold_field.
     */
    public void setLower_threshold_field(java.lang.String lower_threshold_field) {
        this.lower_threshold_field = lower_threshold_field;
    }


    /**
     * Gets the lower_threshold_value value for this CompareClassesRequest.
     * 
     * @return lower_threshold_value   * Lower threshold value for a given field.
     */
    public java.lang.String getLower_threshold_value() {
        return lower_threshold_value;
    }


    /**
     * Sets the lower_threshold_value value for this CompareClassesRequest.
     * 
     * @param lower_threshold_value   * Lower threshold value for a given field.
     */
    public void setLower_threshold_value(java.lang.String lower_threshold_value) {
        this.lower_threshold_value = lower_threshold_value;
    }


    /**
     * Gets the sort value for this CompareClassesRequest.
     * 
     * @return sort   * Sort on the basis of the specified key.
     */
    public java.lang.String getSort() {
        return sort;
    }


    /**
     * Sets the sort value for this CompareClassesRequest.
     * 
     * @param sort   * Sort on the basis of the specified key.
     */
    public void setSort(java.lang.String sort) {
        this.sort = sort;
    }


    /**
     * Gets the distinct value for this CompareClassesRequest.
     * 
     * @return distinct   * Prevent to compare each class with itself (when the reference
     * and query files contain the same classes)
     */
    public java.lang.Integer getDistinct() {
        return distinct;
    }


    /**
     * Sets the distinct value for this CompareClassesRequest.
     * 
     * @param distinct   * Prevent to compare each class with itself (when the reference
     * and query files contain the same classes)
     */
    public void setDistinct(java.lang.Integer distinct) {
        this.distinct = distinct;
    }


    /**
     * Gets the triangle value for this CompareClassesRequest.
     * 
     * @return triangle   * (only valid if query file and reference file are the same)
     * Do not perform the reciprocal comparisons.
     */
    public java.lang.Integer getTriangle() {
        return triangle;
    }


    /**
     * Sets the triangle value for this CompareClassesRequest.
     * 
     * @param triangle   * (only valid if query file and reference file are the same)
     * Do not perform the reciprocal comparisons.
     */
    public void setTriangle(java.lang.Integer triangle) {
        this.triangle = triangle;
    }


    /**
     * Gets the matrix value for this CompareClassesRequest.
     * 
     * @return matrix   * Return a pairwise matrix, where each row corresponds to a reference
     * class, each column to a query class, and each cell contains a comparison
     * between the two classes. 
     * The next argument indicates which statistics has to be return in the
     * matrix (default = sig) 
     * Supported: E(QR), E_val, F(!Q!R), F(Q!R), F(Q), F(QR), F(R!Q), F(R),
     * H(Q), H(Q,R), H(Q|R), H(R), H(R|Q), I(Q,R), IC, P(QR), P(Q|R), P(R|Q),
     * P_val, Q, QR, QvR, R, U(Q|R), U(R|Q), dH(Q,R), dotprod, jac_sim, rank,
     * sig
     */
    public java.lang.String getMatrix() {
        return matrix;
    }


    /**
     * Sets the matrix value for this CompareClassesRequest.
     * 
     * @param matrix   * Return a pairwise matrix, where each row corresponds to a reference
     * class, each column to a query class, and each cell contains a comparison
     * between the two classes. 
     * The next argument indicates which statistics has to be return in the
     * matrix (default = sig) 
     * Supported: E(QR), E_val, F(!Q!R), F(Q!R), F(Q), F(QR), F(R!Q), F(R),
     * H(Q), H(Q,R), H(Q|R), H(R), H(R|Q), I(Q,R), IC, P(QR), P(Q|R), P(R|Q),
     * P_val, Q, QR, QvR, R, U(Q|R), U(R|Q), dH(Q,R), dotprod, jac_sim, rank,
     * sig
     */
    public void setMatrix(java.lang.String matrix) {
        this.matrix = matrix;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CompareClassesRequest)) return false;
        CompareClassesRequest other = (CompareClassesRequest) obj;
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
            ((this.ref_classes==null && other.getRef_classes()==null) || 
             (this.ref_classes!=null &&
              java.util.Arrays.equals(this.ref_classes, other.getRef_classes()))) &&
            ((this.query_classes==null && other.getQuery_classes()==null) || 
             (this.query_classes!=null &&
              this.query_classes.equals(other.getQuery_classes()))) &&
            ((this.return_fields==null && other.getReturn_fields()==null) || 
             (this.return_fields!=null &&
              this.return_fields.equals(other.getReturn_fields()))) &&
            ((this.score_column==null && other.getScore_column()==null) || 
             (this.score_column!=null &&
              this.score_column.equals(other.getScore_column()))) &&
            ((this.input_classes==null && other.getInput_classes()==null) || 
             (this.input_classes!=null &&
              this.input_classes.equals(other.getInput_classes()))) &&
            ((this.upper_threshold_field==null && other.getUpper_threshold_field()==null) || 
             (this.upper_threshold_field!=null &&
              this.upper_threshold_field.equals(other.getUpper_threshold_field()))) &&
            ((this.upper_threshold_value==null && other.getUpper_threshold_value()==null) || 
             (this.upper_threshold_value!=null &&
              this.upper_threshold_value.equals(other.getUpper_threshold_value()))) &&
            ((this.lower_threshold_field==null && other.getLower_threshold_field()==null) || 
             (this.lower_threshold_field!=null &&
              this.lower_threshold_field.equals(other.getLower_threshold_field()))) &&
            ((this.lower_threshold_value==null && other.getLower_threshold_value()==null) || 
             (this.lower_threshold_value!=null &&
              this.lower_threshold_value.equals(other.getLower_threshold_value()))) &&
            ((this.sort==null && other.getSort()==null) || 
             (this.sort!=null &&
              this.sort.equals(other.getSort()))) &&
            ((this.distinct==null && other.getDistinct()==null) || 
             (this.distinct!=null &&
              this.distinct.equals(other.getDistinct()))) &&
            ((this.triangle==null && other.getTriangle()==null) || 
             (this.triangle!=null &&
              this.triangle.equals(other.getTriangle()))) &&
            ((this.matrix==null && other.getMatrix()==null) || 
             (this.matrix!=null &&
              this.matrix.equals(other.getMatrix())));
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
        if (getRef_classes() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getRef_classes());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getRef_classes(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getQuery_classes() != null) {
            _hashCode += getQuery_classes().hashCode();
        }
        if (getReturn_fields() != null) {
            _hashCode += getReturn_fields().hashCode();
        }
        if (getScore_column() != null) {
            _hashCode += getScore_column().hashCode();
        }
        if (getInput_classes() != null) {
            _hashCode += getInput_classes().hashCode();
        }
        if (getUpper_threshold_field() != null) {
            _hashCode += getUpper_threshold_field().hashCode();
        }
        if (getUpper_threshold_value() != null) {
            _hashCode += getUpper_threshold_value().hashCode();
        }
        if (getLower_threshold_field() != null) {
            _hashCode += getLower_threshold_field().hashCode();
        }
        if (getLower_threshold_value() != null) {
            _hashCode += getLower_threshold_value().hashCode();
        }
        if (getSort() != null) {
            _hashCode += getSort().hashCode();
        }
        if (getDistinct() != null) {
            _hashCode += getDistinct().hashCode();
        }
        if (getTriangle() != null) {
            _hashCode += getTriangle().hashCode();
        }
        if (getMatrix() != null) {
            _hashCode += getMatrix().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CompareClassesRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:RSATWS", "CompareClassesRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("output");
        elemField.setXmlName(new javax.xml.namespace.QName("", "output"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ref_classes");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ref_classes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("query_classes");
        elemField.setXmlName(new javax.xml.namespace.QName("", "query_classes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("return_fields");
        elemField.setXmlName(new javax.xml.namespace.QName("", "return_fields"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("score_column");
        elemField.setXmlName(new javax.xml.namespace.QName("", "score_column"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("input_classes");
        elemField.setXmlName(new javax.xml.namespace.QName("", "input_classes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("upper_threshold_field");
        elemField.setXmlName(new javax.xml.namespace.QName("", "upper_threshold_field"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("upper_threshold_value");
        elemField.setXmlName(new javax.xml.namespace.QName("", "upper_threshold_value"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lower_threshold_field");
        elemField.setXmlName(new javax.xml.namespace.QName("", "lower_threshold_field"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lower_threshold_value");
        elemField.setXmlName(new javax.xml.namespace.QName("", "lower_threshold_value"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sort");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sort"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("distinct");
        elemField.setXmlName(new javax.xml.namespace.QName("", "distinct"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("triangle");
        elemField.setXmlName(new javax.xml.namespace.QName("", "triangle"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("matrix");
        elemField.setXmlName(new javax.xml.namespace.QName("", "matrix"));
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
