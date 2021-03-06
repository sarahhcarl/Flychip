
package MyElements::feature_map;
use strict;
use warnings;

{ # BLOCK to scope variables

sub get_xmlns { 'urn:RSATWS' }

__PACKAGE__->__set_name('feature_map');
__PACKAGE__->__set_nillable();
__PACKAGE__->__set_minOccurs();
__PACKAGE__->__set_maxOccurs();
__PACKAGE__->__set_ref();

use base qw(
    SOAP::WSDL::XSD::Typelib::Element
    SOAP::WSDL::XSD::Typelib::ComplexType
);

our $XML_ATTRIBUTE_CLASS;
undef $XML_ATTRIBUTE_CLASS;

sub __get_attr_class {
    return $XML_ATTRIBUTE_CLASS;
}

use Class::Std::Fast::Storable constructor => 'none';
use base qw(SOAP::WSDL::XSD::Typelib::ComplexType);

Class::Std::initialize();

{ # BLOCK to scope variables

my %request_of :ATTR(:get<request>);

__PACKAGE__->_factory(
    [ qw(        request

    ) ],
    {
        'request' => \%request_of,
    },
    {
        'request' => 'MyTypes::FeatureMapRequest',
    },
    {

        'request' => 'request',
    }
);

} # end BLOCK






} # end of BLOCK



1;


=pod

=head1 NAME

MyElements::feature_map

=head1 DESCRIPTION

Perl data type class for the XML Schema defined element
feature_map from the namespace urn:RSATWS.





=head1 METHODS

=head2 new

 my $element = MyElements::feature_map->new($data);

Constructor. The following data structure may be passed to new():

 {
   request =>  { # MyTypes::FeatureMapRequest
     output =>  $some_value, # string
     features =>  $some_value, # string
     tmp_infile =>  $some_value, # string
     sequence =>  $some_value, # string
     tmp_sequence_file =>  $some_value, # string
     sequence_format =>  $some_value, # string
     format =>  $some_value, # string
     from =>  $some_value, # int
     to =>  $some_value, # int
     title =>  $some_value, # string
     label =>  $some_value, # string
     symbol =>  $some_value, # int
     dot =>  $some_value, # int
     mlen =>  $some_value, # int
     mapthick =>  $some_value, # int
     mspacing =>  $some_value, # int
     origin =>  $some_value, # int
     legend =>  $some_value, # int
     scalebar =>  $some_value, # int
     scalestep =>  $some_value, # int
     scorethick =>  $some_value, # int
     maxscore =>  $some_value, # int
     minscore =>  $some_value, # int
     maxfthick =>  $some_value, # int
     minfthick =>  $some_value, # int
     htmap =>  $some_value, # int
     mono =>  $some_value, # int
     orientation =>  $some_value, # string
     select =>  $some_value, # string
   },
 },

=head1 AUTHOR

Generated by SOAP::WSDL

=cut

