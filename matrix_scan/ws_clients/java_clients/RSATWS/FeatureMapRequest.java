/**
 * FeatureMapRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.3 Oct 05, 2005 (05:23:37 EDT) WSDL2Java emitter.
 */

package RSATWS;

public class FeatureMapRequest  implements java.io.Serializable {
    /* Return type. Accepted values: 'server' (result is stored on
     * a file on the server), 'client' (result is directly transferred to
     * the client), or  'both'. 
     * 		Default is 'both'. */
    private java.lang.String output;

    /* a list of features (ORFs, regulatory sites). Each feature is
     * represented by a single line, which should	provide the following information:
     * 		Input file columns:
     * 		1. map label (eg gene name)
     * 		2. feature type
     * 		3. feature identifier (ex: GATAbox, Abf1_site)
     * 		4. strand (D for Direct, R for Reverse),
     * 		5. feature start position
     * 		6. feature end position
     * 		7. (optional) description 
     * 		8. (optional) score
     * 		The standard input format assumes that these topics are provided
     * in this order, separated by tabs. Start and end positions can be positive
     * or negative. */
    private java.lang.String features;

    /* Name of the file with input features on the server (workflow
     * usage). You need to supply either this parameter or the previous one
     * (features). */
    private java.lang.String tmp_infile;

    /* Input sequence(s). */
    private java.lang.String sequence;

    /* Reference sequence file on the server (workflow usage) */
    private java.lang.String tmp_sequence_file;

    /* Format of reference sequence file on the server. */
    private java.lang.String sequence_format;

    /* Output image format. Supported: png,jpg,ps,gif (default = jpg) */
    private java.lang.String format;

    /* Lower limit of the positions represented on the graph. */
    private java.lang.Integer from;

    /* Upper limit of the positions represented on the graph. */
    private java.lang.Integer to;

    /* Generic Title for the feature map. */
    private java.lang.String title;

    /* Define the info to display for each feature. Valid keys are:
     * id, strand, descr (feature descritption), pos (feature start and end
     * positions).
     * 		Several keys can be entered separated by commas without space. ex:
     * -label pos,id. (default = id). */
    private java.lang.String label;

    /* Associates a graphical symbol (i.e. rectangle, circle, buterfly,
     * ...) to each feature. This is convenient to distinguish the features
     * on black and white printings.
     * 		Mutually exclusive with the -dot option. */
    private java.lang.Integer symbol;

    /* A color dot is associated to each feature. This allows to distinguish
     * overlapping structures on a color screen. Mutually exclusive with
     * the -symbol option. */
    private java.lang.Integer dot;

    /* map length (in pixels).Default is 600.Length refers to either
     * height (for vertical maps) of width (for horizontal maps). */
    private java.lang.Integer mlen;

    /* Map thickness.Thickness refers to either width (for vertical
     * maps) or height (horizintal maps). This parameter allows to change
     * the thickness allocated to each map. This is useful when labels are
     * too large. Default is 150. */
    private java.lang.Integer mapthick;

    /* Map spacing.The size of the border between maps (in pixel). */
    private java.lang.Integer mspacing;

    /* All coordinates are recalculated relative to this origin.This
     * allows to display all coordinates with respect to the ORF start or
     * transcription start site. */
    private java.lang.Integer origin;

    /* Draws a legend on the graph, showing the symbol associated
     * to each distinct feature. */
    private java.lang.Integer legend;

    /* Draws a scale bar on the left of the graph. */
    private java.lang.Integer scalebar;

    /* Step between annotations of the scale bar. If not specified,
     * a reasonable step is calculated on basis of the scale bar range. */
    private java.lang.Integer scalestep;

    /* Each feature is displayed with a thickness proportional to
     * its score. Only positive scores are represented. */
    private java.lang.Integer scorethick;

    /* (only valid when -scorethick is active) Maximal allowed score
     * value. Higher score values are clipped for the drawing. */
    private java.lang.Integer maxscore;

    /* (only valid when -scorethick is active) Minimal allowed score
     * value. Features with smaller score are not displayed. */
    private java.lang.Integer minscore;

    /* Max feature thickness */
    private java.lang.Integer maxfthick;

    /* Min feature thickness */
    private java.lang.Integer minfthick;

    /* HTML map.An HTML document is automatically generated, which
     * includes the feature map GIF file as an HTML map.
     * 		In other words,this document displays a figure with sensitive areas.
     * Each time the mouse is positioned above a feature, information about
     * this particuliar feature is displayed at the bottom of the browser
     * window. */
    private java.lang.Integer htmap;

    /* Monochrome palette (for printing on black/white printer). */
    private java.lang.Integer mono;

    /* Orientation of the map. Valid values are "horiz" for an horizontal
     * map (default) and "vertic" for a vertical map. */
    private java.lang.String orientation;

    /* Only display the features whose ID is in the provided id_list.
     * 		The id_list contains one or several IDs, separated by commas.IDs
     * may be embraced in single quotes to allow multiple words within the
     * IDs. Commas and single quotes are not allowed within an ID.
     * 		Example:-select 'gataag','gattag' only displays features identified
     * by gataag or gattag. */
    private java.lang.String select;

    public FeatureMapRequest() {
    }

    public FeatureMapRequest(
           java.lang.String output,
           java.lang.String features,
           java.lang.String tmp_infile,
           java.lang.String sequence,
           java.lang.String tmp_sequence_file,
           java.lang.String sequence_format,
           java.lang.String format,
           java.lang.Integer from,
           java.lang.Integer to,
           java.lang.String title,
           java.lang.String label,
           java.lang.Integer symbol,
           java.lang.Integer dot,
           java.lang.Integer mlen,
           java.lang.Integer mapthick,
           java.lang.Integer mspacing,
           java.lang.Integer origin,
           java.lang.Integer legend,
           java.lang.Integer scalebar,
           java.lang.Integer scalestep,
           java.lang.Integer scorethick,
           java.lang.Integer maxscore,
           java.lang.Integer minscore,
           java.lang.Integer maxfthick,
           java.lang.Integer minfthick,
           java.lang.Integer htmap,
           java.lang.Integer mono,
           java.lang.String orientation,
           java.lang.String select) {
           this.output = output;
           this.features = features;
           this.tmp_infile = tmp_infile;
           this.sequence = sequence;
           this.tmp_sequence_file = tmp_sequence_file;
           this.sequence_format = sequence_format;
           this.format = format;
           this.from = from;
           this.to = to;
           this.title = title;
           this.label = label;
           this.symbol = symbol;
           this.dot = dot;
           this.mlen = mlen;
           this.mapthick = mapthick;
           this.mspacing = mspacing;
           this.origin = origin;
           this.legend = legend;
           this.scalebar = scalebar;
           this.scalestep = scalestep;
           this.scorethick = scorethick;
           this.maxscore = maxscore;
           this.minscore = minscore;
           this.maxfthick = maxfthick;
           this.minfthick = minfthick;
           this.htmap = htmap;
           this.mono = mono;
           this.orientation = orientation;
           this.select = select;
    }


    /**
     * Gets the output value for this FeatureMapRequest.
     * 
     * @return output   * Return type. Accepted values: 'server' (result is stored on
     * a file on the server), 'client' (result is directly transferred to
     * the client), or  'both'. 
     * 		Default is 'both'.
     */
    public java.lang.String getOutput() {
        return output;
    }


    /**
     * Sets the output value for this FeatureMapRequest.
     * 
     * @param output   * Return type. Accepted values: 'server' (result is stored on
     * a file on the server), 'client' (result is directly transferred to
     * the client), or  'both'. 
     * 		Default is 'both'.
     */
    public void setOutput(java.lang.String output) {
        this.output = output;
    }


    /**
     * Gets the features value for this FeatureMapRequest.
     * 
     * @return features   * a list of features (ORFs, regulatory sites). Each feature is
     * represented by a single line, which should	provide the following information:
     * 		Input file columns:
     * 		1. map label (eg gene name)
     * 		2. feature type
     * 		3. feature identifier (ex: GATAbox, Abf1_site)
     * 		4. strand (D for Direct, R for Reverse),
     * 		5. feature start position
     * 		6. feature end position
     * 		7. (optional) description 
     * 		8. (optional) score
     * 		The standard input format assumes that these topics are provided
     * in this order, separated by tabs. Start and end positions can be positive
     * or negative.
     */
    public java.lang.String getFeatures() {
        return features;
    }


    /**
     * Sets the features value for this FeatureMapRequest.
     * 
     * @param features   * a list of features (ORFs, regulatory sites). Each feature is
     * represented by a single line, which should	provide the following information:
     * 		Input file columns:
     * 		1. map label (eg gene name)
     * 		2. feature type
     * 		3. feature identifier (ex: GATAbox, Abf1_site)
     * 		4. strand (D for Direct, R for Reverse),
     * 		5. feature start position
     * 		6. feature end position
     * 		7. (optional) description 
     * 		8. (optional) score
     * 		The standard input format assumes that these topics are provided
     * in this order, separated by tabs. Start and end positions can be positive
     * or negative.
     */
    public void setFeatures(java.lang.String features) {
        this.features = features;
    }


    /**
     * Gets the tmp_infile value for this FeatureMapRequest.
     * 
     * @return tmp_infile   * Name of the file with input features on the server (workflow
     * usage). You need to supply either this parameter or the previous one
     * (features).
     */
    public java.lang.String getTmp_infile() {
        return tmp_infile;
    }


    /**
     * Sets the tmp_infile value for this FeatureMapRequest.
     * 
     * @param tmp_infile   * Name of the file with input features on the server (workflow
     * usage). You need to supply either this parameter or the previous one
     * (features).
     */
    public void setTmp_infile(java.lang.String tmp_infile) {
        this.tmp_infile = tmp_infile;
    }


    /**
     * Gets the sequence value for this FeatureMapRequest.
     * 
     * @return sequence   * Input sequence(s).
     */
    public java.lang.String getSequence() {
        return sequence;
    }


    /**
     * Sets the sequence value for this FeatureMapRequest.
     * 
     * @param sequence   * Input sequence(s).
     */
    public void setSequence(java.lang.String sequence) {
        this.sequence = sequence;
    }


    /**
     * Gets the tmp_sequence_file value for this FeatureMapRequest.
     * 
     * @return tmp_sequence_file   * Reference sequence file on the server (workflow usage)
     */
    public java.lang.String getTmp_sequence_file() {
        return tmp_sequence_file;
    }


    /**
     * Sets the tmp_sequence_file value for this FeatureMapRequest.
     * 
     * @param tmp_sequence_file   * Reference sequence file on the server (workflow usage)
     */
    public void setTmp_sequence_file(java.lang.String tmp_sequence_file) {
        this.tmp_sequence_file = tmp_sequence_file;
    }


    /**
     * Gets the sequence_format value for this FeatureMapRequest.
     * 
     * @return sequence_format   * Format of reference sequence file on the server.
     */
    public java.lang.String getSequence_format() {
        return sequence_format;
    }


    /**
     * Sets the sequence_format value for this FeatureMapRequest.
     * 
     * @param sequence_format   * Format of reference sequence file on the server.
     */
    public void setSequence_format(java.lang.String sequence_format) {
        this.sequence_format = sequence_format;
    }


    /**
     * Gets the format value for this FeatureMapRequest.
     * 
     * @return format   * Output image format. Supported: png,jpg,ps,gif (default = jpg)
     */
    public java.lang.String getFormat() {
        return format;
    }


    /**
     * Sets the format value for this FeatureMapRequest.
     * 
     * @param format   * Output image format. Supported: png,jpg,ps,gif (default = jpg)
     */
    public void setFormat(java.lang.String format) {
        this.format = format;
    }


    /**
     * Gets the from value for this FeatureMapRequest.
     * 
     * @return from   * Lower limit of the positions represented on the graph.
     */
    public java.lang.Integer getFrom() {
        return from;
    }


    /**
     * Sets the from value for this FeatureMapRequest.
     * 
     * @param from   * Lower limit of the positions represented on the graph.
     */
    public void setFrom(java.lang.Integer from) {
        this.from = from;
    }


    /**
     * Gets the to value for this FeatureMapRequest.
     * 
     * @return to   * Upper limit of the positions represented on the graph.
     */
    public java.lang.Integer getTo() {
        return to;
    }


    /**
     * Sets the to value for this FeatureMapRequest.
     * 
     * @param to   * Upper limit of the positions represented on the graph.
     */
    public void setTo(java.lang.Integer to) {
        this.to = to;
    }


    /**
     * Gets the title value for this FeatureMapRequest.
     * 
     * @return title   * Generic Title for the feature map.
     */
    public java.lang.String getTitle() {
        return title;
    }


    /**
     * Sets the title value for this FeatureMapRequest.
     * 
     * @param title   * Generic Title for the feature map.
     */
    public void setTitle(java.lang.String title) {
        this.title = title;
    }


    /**
     * Gets the label value for this FeatureMapRequest.
     * 
     * @return label   * Define the info to display for each feature. Valid keys are:
     * id, strand, descr (feature descritption), pos (feature start and end
     * positions).
     * 		Several keys can be entered separated by commas without space. ex:
     * -label pos,id. (default = id).
     */
    public java.lang.String getLabel() {
        return label;
    }


    /**
     * Sets the label value for this FeatureMapRequest.
     * 
     * @param label   * Define the info to display for each feature. Valid keys are:
     * id, strand, descr (feature descritption), pos (feature start and end
     * positions).
     * 		Several keys can be entered separated by commas without space. ex:
     * -label pos,id. (default = id).
     */
    public void setLabel(java.lang.String label) {
        this.label = label;
    }


    /**
     * Gets the symbol value for this FeatureMapRequest.
     * 
     * @return symbol   * Associates a graphical symbol (i.e. rectangle, circle, buterfly,
     * ...) to each feature. This is convenient to distinguish the features
     * on black and white printings.
     * 		Mutually exclusive with the -dot option.
     */
    public java.lang.Integer getSymbol() {
        return symbol;
    }


    /**
     * Sets the symbol value for this FeatureMapRequest.
     * 
     * @param symbol   * Associates a graphical symbol (i.e. rectangle, circle, buterfly,
     * ...) to each feature. This is convenient to distinguish the features
     * on black and white printings.
     * 		Mutually exclusive with the -dot option.
     */
    public void setSymbol(java.lang.Integer symbol) {
        this.symbol = symbol;
    }


    /**
     * Gets the dot value for this FeatureMapRequest.
     * 
     * @return dot   * A color dot is associated to each feature. This allows to distinguish
     * overlapping structures on a color screen. Mutually exclusive with
     * the -symbol option.
     */
    public java.lang.Integer getDot() {
        return dot;
    }


    /**
     * Sets the dot value for this FeatureMapRequest.
     * 
     * @param dot   * A color dot is associated to each feature. This allows to distinguish
     * overlapping structures on a color screen. Mutually exclusive with
     * the -symbol option.
     */
    public void setDot(java.lang.Integer dot) {
        this.dot = dot;
    }


    /**
     * Gets the mlen value for this FeatureMapRequest.
     * 
     * @return mlen   * map length (in pixels).Default is 600.Length refers to either
     * height (for vertical maps) of width (for horizontal maps).
     */
    public java.lang.Integer getMlen() {
        return mlen;
    }


    /**
     * Sets the mlen value for this FeatureMapRequest.
     * 
     * @param mlen   * map length (in pixels).Default is 600.Length refers to either
     * height (for vertical maps) of width (for horizontal maps).
     */
    public void setMlen(java.lang.Integer mlen) {
        this.mlen = mlen;
    }


    /**
     * Gets the mapthick value for this FeatureMapRequest.
     * 
     * @return mapthick   * Map thickness.Thickness refers to either width (for vertical
     * maps) or height (horizintal maps). This parameter allows to change
     * the thickness allocated to each map. This is useful when labels are
     * too large. Default is 150.
     */
    public java.lang.Integer getMapthick() {
        return mapthick;
    }


    /**
     * Sets the mapthick value for this FeatureMapRequest.
     * 
     * @param mapthick   * Map thickness.Thickness refers to either width (for vertical
     * maps) or height (horizintal maps). This parameter allows to change
     * the thickness allocated to each map. This is useful when labels are
     * too large. Default is 150.
     */
    public void setMapthick(java.lang.Integer mapthick) {
        this.mapthick = mapthick;
    }


    /**
     * Gets the mspacing value for this FeatureMapRequest.
     * 
     * @return mspacing   * Map spacing.The size of the border between maps (in pixel).
     */
    public java.lang.Integer getMspacing() {
        return mspacing;
    }


    /**
     * Sets the mspacing value for this FeatureMapRequest.
     * 
     * @param mspacing   * Map spacing.The size of the border between maps (in pixel).
     */
    public void setMspacing(java.lang.Integer mspacing) {
        this.mspacing = mspacing;
    }


    /**
     * Gets the origin value for this FeatureMapRequest.
     * 
     * @return origin   * All coordinates are recalculated relative to this origin.This
     * allows to display all coordinates with respect to the ORF start or
     * transcription start site.
     */
    public java.lang.Integer getOrigin() {
        return origin;
    }


    /**
     * Sets the origin value for this FeatureMapRequest.
     * 
     * @param origin   * All coordinates are recalculated relative to this origin.This
     * allows to display all coordinates with respect to the ORF start or
     * transcription start site.
     */
    public void setOrigin(java.lang.Integer origin) {
        this.origin = origin;
    }


    /**
     * Gets the legend value for this FeatureMapRequest.
     * 
     * @return legend   * Draws a legend on the graph, showing the symbol associated
     * to each distinct feature.
     */
    public java.lang.Integer getLegend() {
        return legend;
    }


    /**
     * Sets the legend value for this FeatureMapRequest.
     * 
     * @param legend   * Draws a legend on the graph, showing the symbol associated
     * to each distinct feature.
     */
    public void setLegend(java.lang.Integer legend) {
        this.legend = legend;
    }


    /**
     * Gets the scalebar value for this FeatureMapRequest.
     * 
     * @return scalebar   * Draws a scale bar on the left of the graph.
     */
    public java.lang.Integer getScalebar() {
        return scalebar;
    }


    /**
     * Sets the scalebar value for this FeatureMapRequest.
     * 
     * @param scalebar   * Draws a scale bar on the left of the graph.
     */
    public void setScalebar(java.lang.Integer scalebar) {
        this.scalebar = scalebar;
    }


    /**
     * Gets the scalestep value for this FeatureMapRequest.
     * 
     * @return scalestep   * Step between annotations of the scale bar. If not specified,
     * a reasonable step is calculated on basis of the scale bar range.
     */
    public java.lang.Integer getScalestep() {
        return scalestep;
    }


    /**
     * Sets the scalestep value for this FeatureMapRequest.
     * 
     * @param scalestep   * Step between annotations of the scale bar. If not specified,
     * a reasonable step is calculated on basis of the scale bar range.
     */
    public void setScalestep(java.lang.Integer scalestep) {
        this.scalestep = scalestep;
    }


    /**
     * Gets the scorethick value for this FeatureMapRequest.
     * 
     * @return scorethick   * Each feature is displayed with a thickness proportional to
     * its score. Only positive scores are represented.
     */
    public java.lang.Integer getScorethick() {
        return scorethick;
    }


    /**
     * Sets the scorethick value for this FeatureMapRequest.
     * 
     * @param scorethick   * Each feature is displayed with a thickness proportional to
     * its score. Only positive scores are represented.
     */
    public void setScorethick(java.lang.Integer scorethick) {
        this.scorethick = scorethick;
    }


    /**
     * Gets the maxscore value for this FeatureMapRequest.
     * 
     * @return maxscore   * (only valid when -scorethick is active) Maximal allowed score
     * value. Higher score values are clipped for the drawing.
     */
    public java.lang.Integer getMaxscore() {
        return maxscore;
    }


    /**
     * Sets the maxscore value for this FeatureMapRequest.
     * 
     * @param maxscore   * (only valid when -scorethick is active) Maximal allowed score
     * value. Higher score values are clipped for the drawing.
     */
    public void setMaxscore(java.lang.Integer maxscore) {
        this.maxscore = maxscore;
    }


    /**
     * Gets the minscore value for this FeatureMapRequest.
     * 
     * @return minscore   * (only valid when -scorethick is active) Minimal allowed score
     * value. Features with smaller score are not displayed.
     */
    public java.lang.Integer getMinscore() {
        return minscore;
    }


    /**
     * Sets the minscore value for this FeatureMapRequest.
     * 
     * @param minscore   * (only valid when -scorethick is active) Minimal allowed score
     * value. Features with smaller score are not displayed.
     */
    public void setMinscore(java.lang.Integer minscore) {
        this.minscore = minscore;
    }


    /**
     * Gets the maxfthick value for this FeatureMapRequest.
     * 
     * @return maxfthick   * Max feature thickness
     */
    public java.lang.Integer getMaxfthick() {
        return maxfthick;
    }


    /**
     * Sets the maxfthick value for this FeatureMapRequest.
     * 
     * @param maxfthick   * Max feature thickness
     */
    public void setMaxfthick(java.lang.Integer maxfthick) {
        this.maxfthick = maxfthick;
    }


    /**
     * Gets the minfthick value for this FeatureMapRequest.
     * 
     * @return minfthick   * Min feature thickness
     */
    public java.lang.Integer getMinfthick() {
        return minfthick;
    }


    /**
     * Sets the minfthick value for this FeatureMapRequest.
     * 
     * @param minfthick   * Min feature thickness
     */
    public void setMinfthick(java.lang.Integer minfthick) {
        this.minfthick = minfthick;
    }


    /**
     * Gets the htmap value for this FeatureMapRequest.
     * 
     * @return htmap   * HTML map.An HTML document is automatically generated, which
     * includes the feature map GIF file as an HTML map.
     * 		In other words,this document displays a figure with sensitive areas.
     * Each time the mouse is positioned above a feature, information about
     * this particuliar feature is displayed at the bottom of the browser
     * window.
     */
    public java.lang.Integer getHtmap() {
        return htmap;
    }


    /**
     * Sets the htmap value for this FeatureMapRequest.
     * 
     * @param htmap   * HTML map.An HTML document is automatically generated, which
     * includes the feature map GIF file as an HTML map.
     * 		In other words,this document displays a figure with sensitive areas.
     * Each time the mouse is positioned above a feature, information about
     * this particuliar feature is displayed at the bottom of the browser
     * window.
     */
    public void setHtmap(java.lang.Integer htmap) {
        this.htmap = htmap;
    }


    /**
     * Gets the mono value for this FeatureMapRequest.
     * 
     * @return mono   * Monochrome palette (for printing on black/white printer).
     */
    public java.lang.Integer getMono() {
        return mono;
    }


    /**
     * Sets the mono value for this FeatureMapRequest.
     * 
     * @param mono   * Monochrome palette (for printing on black/white printer).
     */
    public void setMono(java.lang.Integer mono) {
        this.mono = mono;
    }


    /**
     * Gets the orientation value for this FeatureMapRequest.
     * 
     * @return orientation   * Orientation of the map. Valid values are "horiz" for an horizontal
     * map (default) and "vertic" for a vertical map.
     */
    public java.lang.String getOrientation() {
        return orientation;
    }


    /**
     * Sets the orientation value for this FeatureMapRequest.
     * 
     * @param orientation   * Orientation of the map. Valid values are "horiz" for an horizontal
     * map (default) and "vertic" for a vertical map.
     */
    public void setOrientation(java.lang.String orientation) {
        this.orientation = orientation;
    }


    /**
     * Gets the select value for this FeatureMapRequest.
     * 
     * @return select   * Only display the features whose ID is in the provided id_list.
     * 		The id_list contains one or several IDs, separated by commas.IDs
     * may be embraced in single quotes to allow multiple words within the
     * IDs. Commas and single quotes are not allowed within an ID.
     * 		Example:-select 'gataag','gattag' only displays features identified
     * by gataag or gattag.
     */
    public java.lang.String getSelect() {
        return select;
    }


    /**
     * Sets the select value for this FeatureMapRequest.
     * 
     * @param select   * Only display the features whose ID is in the provided id_list.
     * 		The id_list contains one or several IDs, separated by commas.IDs
     * may be embraced in single quotes to allow multiple words within the
     * IDs. Commas and single quotes are not allowed within an ID.
     * 		Example:-select 'gataag','gattag' only displays features identified
     * by gataag or gattag.
     */
    public void setSelect(java.lang.String select) {
        this.select = select;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof FeatureMapRequest)) return false;
        FeatureMapRequest other = (FeatureMapRequest) obj;
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
            ((this.features==null && other.getFeatures()==null) || 
             (this.features!=null &&
              this.features.equals(other.getFeatures()))) &&
            ((this.tmp_infile==null && other.getTmp_infile()==null) || 
             (this.tmp_infile!=null &&
              this.tmp_infile.equals(other.getTmp_infile()))) &&
            ((this.sequence==null && other.getSequence()==null) || 
             (this.sequence!=null &&
              this.sequence.equals(other.getSequence()))) &&
            ((this.tmp_sequence_file==null && other.getTmp_sequence_file()==null) || 
             (this.tmp_sequence_file!=null &&
              this.tmp_sequence_file.equals(other.getTmp_sequence_file()))) &&
            ((this.sequence_format==null && other.getSequence_format()==null) || 
             (this.sequence_format!=null &&
              this.sequence_format.equals(other.getSequence_format()))) &&
            ((this.format==null && other.getFormat()==null) || 
             (this.format!=null &&
              this.format.equals(other.getFormat()))) &&
            ((this.from==null && other.getFrom()==null) || 
             (this.from!=null &&
              this.from.equals(other.getFrom()))) &&
            ((this.to==null && other.getTo()==null) || 
             (this.to!=null &&
              this.to.equals(other.getTo()))) &&
            ((this.title==null && other.getTitle()==null) || 
             (this.title!=null &&
              this.title.equals(other.getTitle()))) &&
            ((this.label==null && other.getLabel()==null) || 
             (this.label!=null &&
              this.label.equals(other.getLabel()))) &&
            ((this.symbol==null && other.getSymbol()==null) || 
             (this.symbol!=null &&
              this.symbol.equals(other.getSymbol()))) &&
            ((this.dot==null && other.getDot()==null) || 
             (this.dot!=null &&
              this.dot.equals(other.getDot()))) &&
            ((this.mlen==null && other.getMlen()==null) || 
             (this.mlen!=null &&
              this.mlen.equals(other.getMlen()))) &&
            ((this.mapthick==null && other.getMapthick()==null) || 
             (this.mapthick!=null &&
              this.mapthick.equals(other.getMapthick()))) &&
            ((this.mspacing==null && other.getMspacing()==null) || 
             (this.mspacing!=null &&
              this.mspacing.equals(other.getMspacing()))) &&
            ((this.origin==null && other.getOrigin()==null) || 
             (this.origin!=null &&
              this.origin.equals(other.getOrigin()))) &&
            ((this.legend==null && other.getLegend()==null) || 
             (this.legend!=null &&
              this.legend.equals(other.getLegend()))) &&
            ((this.scalebar==null && other.getScalebar()==null) || 
             (this.scalebar!=null &&
              this.scalebar.equals(other.getScalebar()))) &&
            ((this.scalestep==null && other.getScalestep()==null) || 
             (this.scalestep!=null &&
              this.scalestep.equals(other.getScalestep()))) &&
            ((this.scorethick==null && other.getScorethick()==null) || 
             (this.scorethick!=null &&
              this.scorethick.equals(other.getScorethick()))) &&
            ((this.maxscore==null && other.getMaxscore()==null) || 
             (this.maxscore!=null &&
              this.maxscore.equals(other.getMaxscore()))) &&
            ((this.minscore==null && other.getMinscore()==null) || 
             (this.minscore!=null &&
              this.minscore.equals(other.getMinscore()))) &&
            ((this.maxfthick==null && other.getMaxfthick()==null) || 
             (this.maxfthick!=null &&
              this.maxfthick.equals(other.getMaxfthick()))) &&
            ((this.minfthick==null && other.getMinfthick()==null) || 
             (this.minfthick!=null &&
              this.minfthick.equals(other.getMinfthick()))) &&
            ((this.htmap==null && other.getHtmap()==null) || 
             (this.htmap!=null &&
              this.htmap.equals(other.getHtmap()))) &&
            ((this.mono==null && other.getMono()==null) || 
             (this.mono!=null &&
              this.mono.equals(other.getMono()))) &&
            ((this.orientation==null && other.getOrientation()==null) || 
             (this.orientation!=null &&
              this.orientation.equals(other.getOrientation()))) &&
            ((this.select==null && other.getSelect()==null) || 
             (this.select!=null &&
              this.select.equals(other.getSelect())));
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
        if (getFeatures() != null) {
            _hashCode += getFeatures().hashCode();
        }
        if (getTmp_infile() != null) {
            _hashCode += getTmp_infile().hashCode();
        }
        if (getSequence() != null) {
            _hashCode += getSequence().hashCode();
        }
        if (getTmp_sequence_file() != null) {
            _hashCode += getTmp_sequence_file().hashCode();
        }
        if (getSequence_format() != null) {
            _hashCode += getSequence_format().hashCode();
        }
        if (getFormat() != null) {
            _hashCode += getFormat().hashCode();
        }
        if (getFrom() != null) {
            _hashCode += getFrom().hashCode();
        }
        if (getTo() != null) {
            _hashCode += getTo().hashCode();
        }
        if (getTitle() != null) {
            _hashCode += getTitle().hashCode();
        }
        if (getLabel() != null) {
            _hashCode += getLabel().hashCode();
        }
        if (getSymbol() != null) {
            _hashCode += getSymbol().hashCode();
        }
        if (getDot() != null) {
            _hashCode += getDot().hashCode();
        }
        if (getMlen() != null) {
            _hashCode += getMlen().hashCode();
        }
        if (getMapthick() != null) {
            _hashCode += getMapthick().hashCode();
        }
        if (getMspacing() != null) {
            _hashCode += getMspacing().hashCode();
        }
        if (getOrigin() != null) {
            _hashCode += getOrigin().hashCode();
        }
        if (getLegend() != null) {
            _hashCode += getLegend().hashCode();
        }
        if (getScalebar() != null) {
            _hashCode += getScalebar().hashCode();
        }
        if (getScalestep() != null) {
            _hashCode += getScalestep().hashCode();
        }
        if (getScorethick() != null) {
            _hashCode += getScorethick().hashCode();
        }
        if (getMaxscore() != null) {
            _hashCode += getMaxscore().hashCode();
        }
        if (getMinscore() != null) {
            _hashCode += getMinscore().hashCode();
        }
        if (getMaxfthick() != null) {
            _hashCode += getMaxfthick().hashCode();
        }
        if (getMinfthick() != null) {
            _hashCode += getMinfthick().hashCode();
        }
        if (getHtmap() != null) {
            _hashCode += getHtmap().hashCode();
        }
        if (getMono() != null) {
            _hashCode += getMono().hashCode();
        }
        if (getOrientation() != null) {
            _hashCode += getOrientation().hashCode();
        }
        if (getSelect() != null) {
            _hashCode += getSelect().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(FeatureMapRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:RSATWS", "FeatureMapRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("output");
        elemField.setXmlName(new javax.xml.namespace.QName("", "output"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("features");
        elemField.setXmlName(new javax.xml.namespace.QName("", "features"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tmp_infile");
        elemField.setXmlName(new javax.xml.namespace.QName("", "tmp_infile"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sequence");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sequence"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tmp_sequence_file");
        elemField.setXmlName(new javax.xml.namespace.QName("", "tmp_sequence_file"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sequence_format");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sequence_format"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
        elemField.setFieldName("from");
        elemField.setXmlName(new javax.xml.namespace.QName("", "from"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("to");
        elemField.setXmlName(new javax.xml.namespace.QName("", "to"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("title");
        elemField.setXmlName(new javax.xml.namespace.QName("", "title"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("label");
        elemField.setXmlName(new javax.xml.namespace.QName("", "label"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("symbol");
        elemField.setXmlName(new javax.xml.namespace.QName("", "symbol"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dot");
        elemField.setXmlName(new javax.xml.namespace.QName("", "dot"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mlen");
        elemField.setXmlName(new javax.xml.namespace.QName("", "mlen"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mapthick");
        elemField.setXmlName(new javax.xml.namespace.QName("", "mapthick"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mspacing");
        elemField.setXmlName(new javax.xml.namespace.QName("", "mspacing"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("origin");
        elemField.setXmlName(new javax.xml.namespace.QName("", "origin"));
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
        elemField.setFieldName("scalebar");
        elemField.setXmlName(new javax.xml.namespace.QName("", "scalebar"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("scalestep");
        elemField.setXmlName(new javax.xml.namespace.QName("", "scalestep"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("scorethick");
        elemField.setXmlName(new javax.xml.namespace.QName("", "scorethick"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maxscore");
        elemField.setXmlName(new javax.xml.namespace.QName("", "maxscore"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("minscore");
        elemField.setXmlName(new javax.xml.namespace.QName("", "minscore"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maxfthick");
        elemField.setXmlName(new javax.xml.namespace.QName("", "maxfthick"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("minfthick");
        elemField.setXmlName(new javax.xml.namespace.QName("", "minfthick"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("htmap");
        elemField.setXmlName(new javax.xml.namespace.QName("", "htmap"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mono");
        elemField.setXmlName(new javax.xml.namespace.QName("", "mono"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("orientation");
        elemField.setXmlName(new javax.xml.namespace.QName("", "orientation"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("select");
        elemField.setXmlName(new javax.xml.namespace.QName("", "select"));
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
