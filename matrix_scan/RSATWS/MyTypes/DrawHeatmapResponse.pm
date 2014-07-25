package MyTypes::DrawHeatmapResponse;
use strict;
use warnings;


our $XML_ATTRIBUTE_CLASS;
undef $XML_ATTRIBUTE_CLASS;

sub __get_attr_class {
    return $XML_ATTRIBUTE_CLASS;
}

use Class::Std::Fast::Storable constructor => 'none';
use base qw(SOAP::WSDL::XSD::Typelib::ComplexType);

Class::Std::initialize();

{ # BLOCK to scope variables

my %server_of :ATTR(:get<server>);
my %command_of :ATTR(:get<command>);
my %client_of :ATTR(:get<client>);

__PACKAGE__->_factory(
    [ qw(        server
        command
        client

    ) ],
    {
        'server' => \%server_of,
        'command' => \%command_of,
        'client' => \%client_of,
    },
    {
        'server' => 'SOAP::WSDL::XSD::Typelib::Builtin::string',
        'command' => 'SOAP::WSDL::XSD::Typelib::Builtin::string',
        'client' => 'SOAP::WSDL::XSD::Typelib::Builtin::string',
    },
    {

        'server' => 'server',
        'command' => 'command',
        'client' => 'client',
    }
);

} # end BLOCK







1;


=pod

=head1 NAME

MyTypes::DrawHeatmapResponse

=head1 DESCRIPTION

Perl data type class for the XML Schema defined complexType
DrawHeatmapResponse from the namespace urn:RSATWS.






=head2 PROPERTIES

The following properties may be accessed using get_PROPERTY / set_PROPERTY
methods:

=over

=item * server


=item * command


=item * client




=back


=head1 METHODS

=head2 new

Constructor. The following data structure may be passed to new():

 { # MyTypes::DrawHeatmapResponse
   server =>  $some_value, # string
   command =>  $some_value, # string
   client =>  $some_value, # string
 },




=head1 AUTHOR

Generated by SOAP::WSDL

=cut

