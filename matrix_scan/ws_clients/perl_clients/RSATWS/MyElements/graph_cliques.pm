
package MyElements::graph_cliques;
use strict;
use warnings;

{ # BLOCK to scope variables

sub get_xmlns { 'urn:RSATWS' }

__PACKAGE__->__set_name('graph_cliques');
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
        'request' => 'MyTypes::GraphCliquesRequest',
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

MyElements::graph_cliques

=head1 DESCRIPTION

Perl data type class for the XML Schema defined element
graph_cliques from the namespace urn:RSATWS.





=head1 METHODS

=head2 new

 my $element = MyElements::graph_cliques->new($data);

Constructor. The following data structure may be passed to new():

 {
   request =>  { # MyTypes::GraphCliquesRequest
     output =>  $some_value, # string
     informat =>  $some_value, # string
     inputgraph =>  $some_value, # string
     scol =>  $some_value, # int
     tcol =>  $some_value, # int
     min_size =>  $some_value, # int
   },
 },

=head1 AUTHOR

Generated by SOAP::WSDL

=cut

