
package MyElements::contingency_stats;
use strict;
use warnings;

{ # BLOCK to scope variables

sub get_xmlns { 'urn:RSATWS' }

__PACKAGE__->__set_name('contingency_stats');
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
        'request' => 'MyTypes::ContingencyStatsRequest',
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

MyElements::contingency_stats

=head1 DESCRIPTION

Perl data type class for the XML Schema defined element
contingency_stats from the namespace urn:RSATWS.





=head1 METHODS

=head2 new

 my $element = MyElements::contingency_stats->new($data);

Constructor. The following data structure may be passed to new():

 {
   request =>  { # MyTypes::ContingencyStatsRequest
     output =>  $some_value, # string
     inputfile =>  $some_value, # string
     decimals =>  $some_value, # int
     return =>  $some_value, # string
     rsizes =>  $some_value, # string
     csizes =>  $some_value, # string
   },
 },

=head1 AUTHOR

Generated by SOAP::WSDL

=cut
