/**
 * RandomSequenceRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.3 Oct 05, 2005 (05:23:37 EDT) WSDL2Java emitter.
 */

package RSATWS;


/**
 * Parameters for the operation random_seq.
 */
public class RandomSequenceRequest  implements java.io.Serializable {
    /* Return type. Accepted values: 'server' (result is stored on
     * a file on the server), 'client' (result is directly transferred to
     * the client), or  'both'. 
     * Default is 'both'. */
    private java.lang.String output;

    /* Length of sequence to generate. */
    private java.lang.Integer sequence_length;

    /* Number of sequences to generate. */
    private java.lang.Integer repetition;

    /* Format of sequence(s) to generate. */
    private java.lang.String format;

    /* A newline character will be inserted in the sequence every
     * # bases, where # is the number provided. 
     * Default is 70. A value of 0 will prevent newline insertion. */
    private java.lang.Integer line_width;

    /* Type of sequence(s) to generate (protein | DNA | other). */
    private java.lang.String type;

    /* Seed for the random generator. */
    private java.lang.Integer seed;

    /* Alphabet. Must be followed by residue frequencies expressed
     * precisely this way:    a:t # c:g # */
    private java.lang.String alphabet;

    /* Expected frequencies of oligomers in sequence(s) to generate.
     * Indicate the file that contains expected oligomer frequencies. 
     * When this option is used, the sequences are generated according to
     * a Markov chain. */
    private java.lang.String expfreq;

    /* Name of the file with expected frequencies on the server. */
    private java.lang.String tmp_expfreq_file;

    /* Background model. Automatically load a pre-calibrated exected
     * frequency file from the RSAT genome distribution. 
     * When this option is used, the options organism and oligo_length are
     * also required, to indicate the organism and the oligonucleotide length,
     * respectively.
     * This option is incompatible with the option expfreq.             
     * 
     * Type of sequences used as background model for estimating expected
     * oligonucleotide frequencies (supported models):
     *   - equi (equiprobable residue frequencies [default]), 
     *   - upstream (all upstream sequences, allowing overlap with upstream
     * ORFs. Requires to speciy a model organism), 
     *   - upstream-noorf (all upstream sequences, preventing overlap with
     * upstream ORFs. Requires to specify a model organism), and 
     *   - intergenic (intergenic frequencies. Whole set of intergenic regions,
     * including upstream and downstream sequences. Requires to specify a
     * model organism). */
    private java.lang.String bg_model;

    /* Name of the organism when using a background model. */
    private java.lang.String organism;

    /* Length of oligomer when using a background model. */
    private java.lang.Integer oligo_length;

    /* Length file. Allows to generate random sequences with the same
     * lengths as a set of reference sequences.
     * The length file contains two columns : sequence ID (ignored) and sequence
     * length. */
    private java.lang.String length_file;

    public RandomSequenceRequest() {
    }

    public RandomSequenceRequest(
           java.lang.String output,
           java.lang.Integer sequence_length,
           java.lang.Integer repetition,
           java.lang.String format,
           java.lang.Integer line_width,
           java.lang.String type,
           java.lang.Integer seed,
           java.lang.String alphabet,
           java.lang.String expfreq,
           java.lang.String tmp_expfreq_file,
           java.lang.String bg_model,
           java.lang.String organism,
           java.lang.Integer oligo_length,
           java.lang.String length_file) {
           this.output = output;
           this.sequence_length = sequence_length;
           this.repetition = repetition;
           this.format = format;
           this.line_width = line_width;
           this.type = type;
           this.seed = seed;
           this.alphabet = alphabet;
           this.expfreq = expfreq;
           this.tmp_expfreq_file = tmp_expfreq_file;
           this.bg_model = bg_model;
           this.organism = organism;
           this.oligo_length = oligo_length;
           this.length_file = length_file;
    }


    /**
     * Gets the output value for this RandomSequenceRequest.
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
     * Sets the output value for this RandomSequenceRequest.
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
     * Gets the sequence_length value for this RandomSequenceRequest.
     * 
     * @return sequence_length   * Length of sequence to generate.
     */
    public java.lang.Integer getSequence_length() {
        return sequence_length;
    }


    /**
     * Sets the sequence_length value for this RandomSequenceRequest.
     * 
     * @param sequence_length   * Length of sequence to generate.
     */
    public void setSequence_length(java.lang.Integer sequence_length) {
        this.sequence_length = sequence_length;
    }


    /**
     * Gets the repetition value for this RandomSequenceRequest.
     * 
     * @return repetition   * Number of sequences to generate.
     */
    public java.lang.Integer getRepetition() {
        return repetition;
    }


    /**
     * Sets the repetition value for this RandomSequenceRequest.
     * 
     * @param repetition   * Number of sequences to generate.
     */
    public void setRepetition(java.lang.Integer repetition) {
        this.repetition = repetition;
    }


    /**
     * Gets the format value for this RandomSequenceRequest.
     * 
     * @return format   * Format of sequence(s) to generate.
     */
    public java.lang.String getFormat() {
        return format;
    }


    /**
     * Sets the format value for this RandomSequenceRequest.
     * 
     * @param format   * Format of sequence(s) to generate.
     */
    public void setFormat(java.lang.String format) {
        this.format = format;
    }


    /**
     * Gets the line_width value for this RandomSequenceRequest.
     * 
     * @return line_width   * A newline character will be inserted in the sequence every
     * # bases, where # is the number provided. 
     * Default is 70. A value of 0 will prevent newline insertion.
     */
    public java.lang.Integer getLine_width() {
        return line_width;
    }


    /**
     * Sets the line_width value for this RandomSequenceRequest.
     * 
     * @param line_width   * A newline character will be inserted in the sequence every
     * # bases, where # is the number provided. 
     * Default is 70. A value of 0 will prevent newline insertion.
     */
    public void setLine_width(java.lang.Integer line_width) {
        this.line_width = line_width;
    }


    /**
     * Gets the type value for this RandomSequenceRequest.
     * 
     * @return type   * Type of sequence(s) to generate (protein | DNA | other).
     */
    public java.lang.String getType() {
        return type;
    }


    /**
     * Sets the type value for this RandomSequenceRequest.
     * 
     * @param type   * Type of sequence(s) to generate (protein | DNA | other).
     */
    public void setType(java.lang.String type) {
        this.type = type;
    }


    /**
     * Gets the seed value for this RandomSequenceRequest.
     * 
     * @return seed   * Seed for the random generator.
     */
    public java.lang.Integer getSeed() {
        return seed;
    }


    /**
     * Sets the seed value for this RandomSequenceRequest.
     * 
     * @param seed   * Seed for the random generator.
     */
    public void setSeed(java.lang.Integer seed) {
        this.seed = seed;
    }


    /**
     * Gets the alphabet value for this RandomSequenceRequest.
     * 
     * @return alphabet   * Alphabet. Must be followed by residue frequencies expressed
     * precisely this way:    a:t # c:g #
     */
    public java.lang.String getAlphabet() {
        return alphabet;
    }


    /**
     * Sets the alphabet value for this RandomSequenceRequest.
     * 
     * @param alphabet   * Alphabet. Must be followed by residue frequencies expressed
     * precisely this way:    a:t # c:g #
     */
    public void setAlphabet(java.lang.String alphabet) {
        this.alphabet = alphabet;
    }


    /**
     * Gets the expfreq value for this RandomSequenceRequest.
     * 
     * @return expfreq   * Expected frequencies of oligomers in sequence(s) to generate.
     * Indicate the file that contains expected oligomer frequencies. 
     * When this option is used, the sequences are generated according to
     * a Markov chain.
     */
    public java.lang.String getExpfreq() {
        return expfreq;
    }


    /**
     * Sets the expfreq value for this RandomSequenceRequest.
     * 
     * @param expfreq   * Expected frequencies of oligomers in sequence(s) to generate.
     * Indicate the file that contains expected oligomer frequencies. 
     * When this option is used, the sequences are generated according to
     * a Markov chain.
     */
    public void setExpfreq(java.lang.String expfreq) {
        this.expfreq = expfreq;
    }


    /**
     * Gets the tmp_expfreq_file value for this RandomSequenceRequest.
     * 
     * @return tmp_expfreq_file   * Name of the file with expected frequencies on the server.
     */
    public java.lang.String getTmp_expfreq_file() {
        return tmp_expfreq_file;
    }


    /**
     * Sets the tmp_expfreq_file value for this RandomSequenceRequest.
     * 
     * @param tmp_expfreq_file   * Name of the file with expected frequencies on the server.
     */
    public void setTmp_expfreq_file(java.lang.String tmp_expfreq_file) {
        this.tmp_expfreq_file = tmp_expfreq_file;
    }


    /**
     * Gets the bg_model value for this RandomSequenceRequest.
     * 
     * @return bg_model   * Background model. Automatically load a pre-calibrated exected
     * frequency file from the RSAT genome distribution. 
     * When this option is used, the options organism and oligo_length are
     * also required, to indicate the organism and the oligonucleotide length,
     * respectively.
     * This option is incompatible with the option expfreq.             
     * 
     * Type of sequences used as background model for estimating expected
     * oligonucleotide frequencies (supported models):
     *   - equi (equiprobable residue frequencies [default]), 
     *   - upstream (all upstream sequences, allowing overlap with upstream
     * ORFs. Requires to speciy a model organism), 
     *   - upstream-noorf (all upstream sequences, preventing overlap with
     * upstream ORFs. Requires to specify a model organism), and 
     *   - intergenic (intergenic frequencies. Whole set of intergenic regions,
     * including upstream and downstream sequences. Requires to specify a
     * model organism).
     */
    public java.lang.String getBg_model() {
        return bg_model;
    }


    /**
     * Sets the bg_model value for this RandomSequenceRequest.
     * 
     * @param bg_model   * Background model. Automatically load a pre-calibrated exected
     * frequency file from the RSAT genome distribution. 
     * When this option is used, the options organism and oligo_length are
     * also required, to indicate the organism and the oligonucleotide length,
     * respectively.
     * This option is incompatible with the option expfreq.             
     * 
     * Type of sequences used as background model for estimating expected
     * oligonucleotide frequencies (supported models):
     *   - equi (equiprobable residue frequencies [default]), 
     *   - upstream (all upstream sequences, allowing overlap with upstream
     * ORFs. Requires to speciy a model organism), 
     *   - upstream-noorf (all upstream sequences, preventing overlap with
     * upstream ORFs. Requires to specify a model organism), and 
     *   - intergenic (intergenic frequencies. Whole set of intergenic regions,
     * including upstream and downstream sequences. Requires to specify a
     * model organism).
     */
    public void setBg_model(java.lang.String bg_model) {
        this.bg_model = bg_model;
    }


    /**
     * Gets the organism value for this RandomSequenceRequest.
     * 
     * @return organism   * Name of the organism when using a background model.
     */
    public java.lang.String getOrganism() {
        return organism;
    }


    /**
     * Sets the organism value for this RandomSequenceRequest.
     * 
     * @param organism   * Name of the organism when using a background model.
     */
    public void setOrganism(java.lang.String organism) {
        this.organism = organism;
    }


    /**
     * Gets the oligo_length value for this RandomSequenceRequest.
     * 
     * @return oligo_length   * Length of oligomer when using a background model.
     */
    public java.lang.Integer getOligo_length() {
        return oligo_length;
    }


    /**
     * Sets the oligo_length value for this RandomSequenceRequest.
     * 
     * @param oligo_length   * Length of oligomer when using a background model.
     */
    public void setOligo_length(java.lang.Integer oligo_length) {
        this.oligo_length = oligo_length;
    }


    /**
     * Gets the length_file value for this RandomSequenceRequest.
     * 
     * @return length_file   * Length file. Allows to generate random sequences with the same
     * lengths as a set of reference sequences.
     * The length file contains two columns : sequence ID (ignored) and sequence
     * length.
     */
    public java.lang.String getLength_file() {
        return length_file;
    }


    /**
     * Sets the length_file value for this RandomSequenceRequest.
     * 
     * @param length_file   * Length file. Allows to generate random sequences with the same
     * lengths as a set of reference sequences.
     * The length file contains two columns : sequence ID (ignored) and sequence
     * length.
     */
    public void setLength_file(java.lang.String length_file) {
        this.length_file = length_file;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RandomSequenceRequest)) return false;
        RandomSequenceRequest other = (RandomSequenceRequest) obj;
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
            ((this.sequence_length==null && other.getSequence_length()==null) || 
             (this.sequence_length!=null &&
              this.sequence_length.equals(other.getSequence_length()))) &&
            ((this.repetition==null && other.getRepetition()==null) || 
             (this.repetition!=null &&
              this.repetition.equals(other.getRepetition()))) &&
            ((this.format==null && other.getFormat()==null) || 
             (this.format!=null &&
              this.format.equals(other.getFormat()))) &&
            ((this.line_width==null && other.getLine_width()==null) || 
             (this.line_width!=null &&
              this.line_width.equals(other.getLine_width()))) &&
            ((this.type==null && other.getType()==null) || 
             (this.type!=null &&
              this.type.equals(other.getType()))) &&
            ((this.seed==null && other.getSeed()==null) || 
             (this.seed!=null &&
              this.seed.equals(other.getSeed()))) &&
            ((this.alphabet==null && other.getAlphabet()==null) || 
             (this.alphabet!=null &&
              this.alphabet.equals(other.getAlphabet()))) &&
            ((this.expfreq==null && other.getExpfreq()==null) || 
             (this.expfreq!=null &&
              this.expfreq.equals(other.getExpfreq()))) &&
            ((this.tmp_expfreq_file==null && other.getTmp_expfreq_file()==null) || 
             (this.tmp_expfreq_file!=null &&
              this.tmp_expfreq_file.equals(other.getTmp_expfreq_file()))) &&
            ((this.bg_model==null && other.getBg_model()==null) || 
             (this.bg_model!=null &&
              this.bg_model.equals(other.getBg_model()))) &&
            ((this.organism==null && other.getOrganism()==null) || 
             (this.organism!=null &&
              this.organism.equals(other.getOrganism()))) &&
            ((this.oligo_length==null && other.getOligo_length()==null) || 
             (this.oligo_length!=null &&
              this.oligo_length.equals(other.getOligo_length()))) &&
            ((this.length_file==null && other.getLength_file()==null) || 
             (this.length_file!=null &&
              this.length_file.equals(other.getLength_file())));
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
        if (getSequence_length() != null) {
            _hashCode += getSequence_length().hashCode();
        }
        if (getRepetition() != null) {
            _hashCode += getRepetition().hashCode();
        }
        if (getFormat() != null) {
            _hashCode += getFormat().hashCode();
        }
        if (getLine_width() != null) {
            _hashCode += getLine_width().hashCode();
        }
        if (getType() != null) {
            _hashCode += getType().hashCode();
        }
        if (getSeed() != null) {
            _hashCode += getSeed().hashCode();
        }
        if (getAlphabet() != null) {
            _hashCode += getAlphabet().hashCode();
        }
        if (getExpfreq() != null) {
            _hashCode += getExpfreq().hashCode();
        }
        if (getTmp_expfreq_file() != null) {
            _hashCode += getTmp_expfreq_file().hashCode();
        }
        if (getBg_model() != null) {
            _hashCode += getBg_model().hashCode();
        }
        if (getOrganism() != null) {
            _hashCode += getOrganism().hashCode();
        }
        if (getOligo_length() != null) {
            _hashCode += getOligo_length().hashCode();
        }
        if (getLength_file() != null) {
            _hashCode += getLength_file().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RandomSequenceRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:RSATWS", "RandomSequenceRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("output");
        elemField.setXmlName(new javax.xml.namespace.QName("", "output"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sequence_length");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sequence_length"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("repetition");
        elemField.setXmlName(new javax.xml.namespace.QName("", "repetition"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("format");
        elemField.setXmlName(new javax.xml.namespace.QName("", "format"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("line_width");
        elemField.setXmlName(new javax.xml.namespace.QName("", "line_width"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("type");
        elemField.setXmlName(new javax.xml.namespace.QName("", "type"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("seed");
        elemField.setXmlName(new javax.xml.namespace.QName("", "seed"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("alphabet");
        elemField.setXmlName(new javax.xml.namespace.QName("", "alphabet"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("expfreq");
        elemField.setXmlName(new javax.xml.namespace.QName("", "expfreq"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tmp_expfreq_file");
        elemField.setXmlName(new javax.xml.namespace.QName("", "tmp_expfreq_file"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bg_model");
        elemField.setXmlName(new javax.xml.namespace.QName("", "bg_model"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("organism");
        elemField.setXmlName(new javax.xml.namespace.QName("", "organism"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("oligo_length");
        elemField.setXmlName(new javax.xml.namespace.QName("", "oligo_length"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("length_file");
        elemField.setXmlName(new javax.xml.namespace.QName("", "length_file"));
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
