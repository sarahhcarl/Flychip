
package MyElements::retrieve_seqResponse;
use strict;
use warnings;

{ # BLOCK to scope variables

sub get_xmlns { 'urn:RSATWS' }

__PACKAGE__->__set_name('retrieve_seqResponse');
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

my %response_of :ATTR(:get<response>);

__PACKAGE__->_factory(
    [ qw(        response

    ) ],
    {
        'response' => \%response_of,
    },
    {
        'response' => 'MyTypes::RetrieveSequenceResponse',
    },
    {

        'response' => 'response',
    }
);

} # end BLOCK






} # end of BLOCK



1;


=pod

=head1 NAME

MyElements::retrieve_seqResponse

=head1 DESCRIPTION

Perl data type class for the XML Schema defined element
retrieve_seqResponse from the namespace urn:RSATWS.





=head1 METHODS

=head2 new

 my $element = MyElements::retrieve_seqResponse->new($data);

Constructor. The following data structure may be passed to new():

 {
   response =>  { # MyTypes::RetrieveSequenceResponse
     server =>  $some_value, # string
     command =>  $some_value, # string
     client =>  $some_value, # string
   },
 },

=head1 AUTHOR

Generated by SOAP::WSDL

=cut

