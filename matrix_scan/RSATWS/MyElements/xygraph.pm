
package MyElements::xygraph;
use strict;
use warnings;

{ # BLOCK to scope variables

sub get_xmlns { 'urn:RSATWS' }

__PACKAGE__->__set_name('xygraph');
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
        'request' => 'MyTypes::XYGraphRequest',
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

MyElements::xygraph

=head1 DESCRIPTION

Perl data type class for the XML Schema defined element
xygraph from the namespace urn:RSATWS.





=head1 METHODS

=head2 new

 my $element = MyElements::xygraph->new($data);

Constructor. The following data structure may be passed to new():

 {
   request =>  { # MyTypes::XYGraphRequest
     output =>  $some_value, # string
     inputFile =>  $some_value, # string
     format =>  $some_value, # string
     title1 =>  $some_value, # string
     title2 =>  $some_value, # string
     lines =>  $some_value, # int
     legend =>  $some_value, # int
     header =>  $some_value, # int
     xleg1 =>  $some_value, # string
     xleg2 =>  $some_value, # string
     yleg1 =>  $some_value, # string
     yleg2 =>  $some_value, # string
     xmax =>  $some_value, # string
     ymax =>  $some_value, # string
     xmin =>  $some_value, # string
     ymin =>  $some_value, # string
     ylog =>  $some_value, # string
     xlog =>  $some_value, # string
     xcol =>  $some_value, # string
     ycol =>  $some_value, # string
   },
 },

=head1 AUTHOR

Generated by SOAP::WSDL

=cut

