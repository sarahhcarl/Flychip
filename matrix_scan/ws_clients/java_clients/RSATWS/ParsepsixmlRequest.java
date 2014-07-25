/**
 * ParsepsixmlRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.3 Oct 05, 2005 (05:23:37 EDT) WSDL2Java emitter.
 */

package RSATWS;

public class ParsepsixmlRequest  implements java.io.Serializable {
    /* The psi XML input file that will be converted in a tab file */
    private java.lang.String inputfile;

    /* A list of evidence channels to filter separated by a comma */
    private java.lang.String channels;

    /* A list of interactor_type to filter (separated by comas) :
     * protein, 'small molecule' */
    private java.lang.String interactor_type;

    /* Upper threshold on the value */
    private java.lang.Float uth;

    /* Lower threshold on the value */
    private java.lang.Float lth;

    public ParsepsixmlRequest() {
    }

    public ParsepsixmlRequest(
           java.lang.String inputfile,
           java.lang.String channels,
           java.lang.String interactor_type,
           java.lang.Float uth,
           java.lang.Float lth) {
           this.inputfile = inputfile;
           this.channels = channels;
           this.interactor_type = interactor_type;
           this.uth = uth;
           this.lth = lth;
    }


    /**
     * Gets the inputfile value for this ParsepsixmlRequest.
     * 
     * @return inputfile   * The psi XML input file that will be converted in a tab file
     */
    public java.lang.String getInputfile() {
        return inputfile;
    }


    /**
     * Sets the inputfile value for this ParsepsixmlRequest.
     * 
     * @param inputfile   * The psi XML input file that will be converted in a tab file
     */
    public void setInputfile(java.lang.String inputfile) {
        this.inputfile = inputfile;
    }


    /**
     * Gets the channels value for this ParsepsixmlRequest.
     * 
     * @return channels   * A list of evidence channels to filter separated by a comma
     */
    public java.lang.String getChannels() {
        return channels;
    }


    /**
     * Sets the channels value for this ParsepsixmlRequest.
     * 
     * @param channels   * A list of evidence channels to filter separated by a comma
     */
    public void setChannels(java.lang.String channels) {
        this.channels = channels;
    }


    /**
     * Gets the interactor_type value for this ParsepsixmlRequest.
     * 
     * @return interactor_type   * A list of interactor_type to filter (separated by comas) :
     * protein, 'small molecule'
     */
    public java.lang.String getInteractor_type() {
        return interactor_type;
    }


    /**
     * Sets the interactor_type value for this ParsepsixmlRequest.
     * 
     * @param interactor_type   * A list of interactor_type to filter (separated by comas) :
     * protein, 'small molecule'
     */
    public void setInteractor_type(java.lang.String interactor_type) {
        this.interactor_type = interactor_type;
    }


    /**
     * Gets the uth value for this ParsepsixmlRequest.
     * 
     * @return uth   * Upper threshold on the value
     */
    public java.lang.Float getUth() {
        return uth;
    }


    /**
     * Sets the uth value for this ParsepsixmlRequest.
     * 
     * @param uth   * Upper threshold on the value
     */
    public void setUth(java.lang.Float uth) {
        this.uth = uth;
    }


    /**
     * Gets the lth value for this ParsepsixmlRequest.
     * 
     * @return lth   * Lower threshold on the value
     */
    public java.lang.Float getLth() {
        return lth;
    }


    /**
     * Sets the lth value for this ParsepsixmlRequest.
     * 
     * @param lth   * Lower threshold on the value
     */
    public void setLth(java.lang.Float lth) {
        this.lth = lth;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ParsepsixmlRequest)) return false;
        ParsepsixmlRequest other = (ParsepsixmlRequest) obj;
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
            ((this.channels==null && other.getChannels()==null) || 
             (this.channels!=null &&
              this.channels.equals(other.getChannels()))) &&
            ((this.interactor_type==null && other.getInteractor_type()==null) || 
             (this.interactor_type!=null &&
              this.interactor_type.equals(other.getInteractor_type()))) &&
            ((this.uth==null && other.getUth()==null) || 
             (this.uth!=null &&
              this.uth.equals(other.getUth()))) &&
            ((this.lth==null && other.getLth()==null) || 
             (this.lth!=null &&
              this.lth.equals(other.getLth())));
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
        if (getChannels() != null) {
            _hashCode += getChannels().hashCode();
        }
        if (getInteractor_type() != null) {
            _hashCode += getInteractor_type().hashCode();
        }
        if (getUth() != null) {
            _hashCode += getUth().hashCode();
        }
        if (getLth() != null) {
            _hashCode += getLth().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ParsepsixmlRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:RSATWS", "parsepsixmlRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("inputfile");
        elemField.setXmlName(new javax.xml.namespace.QName("", "inputfile"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("channels");
        elemField.setXmlName(new javax.xml.namespace.QName("", "channels"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("interactor_type");
        elemField.setXmlName(new javax.xml.namespace.QName("", "interactor_type"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("uth");
        elemField.setXmlName(new javax.xml.namespace.QName("", "uth"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "float"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lth");
        elemField.setXmlName(new javax.xml.namespace.QName("", "lth"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "float"));
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
