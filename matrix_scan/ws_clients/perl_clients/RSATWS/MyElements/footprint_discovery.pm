
package MyElements::footprint_discovery;
use strict;
use warnings;

{ # BLOCK to scope variables

sub get_xmlns { 'urn:RSATWS' }

__PACKAGE__->__set_name('footprint_discovery');
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
        'request' => 'MyTypes::FootprintDiscoveryRequest',
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

MyElements::footprint_discovery

=head1 DESCRIPTION

Perl data type class for the XML Schema defined element
footprint_discovery from the namespace urn:RSATWS.





=head1 METHODS

=head2 new

 my $element = MyElements::footprint_discovery->new($data);

Constructor. The following data structure may be passed to new():

 {
   request =>  { # MyTypes::FootprintDiscoveryRequest
     output =>  $some_value, # string
     verbosity =>  $some_value, # int
     genes =>  $some_value, # string
     tmp_infile =>  $some_value, # string
     all_genes =>  $some_value, # int
     max_genes =>  $some_value, # int
     output_prefix =>  $some_value, # string
     query =>  $some_value, # string
     sep_genes =>  $some_value, # int
     organism =>  $some_value, # string
     taxon =>  $some_value, # string
     index =>  $some_value, # int
     lth =>  $some_value, # string
     uth =>  $some_value, # string
     return =>  $some_value, # string
     to_matrix =>  $some_value, # int
     bg_model =>  $some_value, # string
     no_filter =>  $some_value, # int
     infer_operons =>  $some_value, # int
     dist_thr =>  $some_value, # int
   },
 },

=head1 AUTHOR

Generated by SOAP::WSDL

=cut

