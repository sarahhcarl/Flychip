package MyTypes::GraphNodeDegreeRequest;
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

my %output_of :ATTR(:get<output>);
my %informat_of :ATTR(:get<informat>);
my %all_of :ATTR(:get<all>);
my %inputgraph_of :ATTR(:get<inputgraph>);
my %nodefile_of :ATTR(:get<nodefile>);
my %wcol_of :ATTR(:get<wcol>);
my %scol_of :ATTR(:get<scol>);
my %tcol_of :ATTR(:get<tcol>);

__PACKAGE__->_factory(
    [ qw(        output
        informat
        all
        inputgraph
        nodefile
        wcol
        scol
        tcol

    ) ],
    {
        'output' => \%output_of,
        'informat' => \%informat_of,
        'all' => \%all_of,
        'inputgraph' => \%inputgraph_of,
        'nodefile' => \%nodefile_of,
        'wcol' => \%wcol_of,
        'scol' => \%scol_of,
        'tcol' => \%tcol_of,
    },
    {
        'output' => 'SOAP::WSDL::XSD::Typelib::Builtin::string',
        'informat' => 'SOAP::WSDL::XSD::Typelib::Builtin::string',
        'all' => 'SOAP::WSDL::XSD::Typelib::Builtin::int',
        'inputgraph' => 'SOAP::WSDL::XSD::Typelib::Builtin::string',
        'nodefile' => 'SOAP::WSDL::XSD::Typelib::Builtin::string',
        'wcol' => 'SOAP::WSDL::XSD::Typelib::Builtin::int',
        'scol' => 'SOAP::WSDL::XSD::Typelib::Builtin::int',
        'tcol' => 'SOAP::WSDL::XSD::Typelib::Builtin::int',
    },
    {

        'output' => 'output',
        'informat' => 'informat',
        'all' => 'all',
        'inputgraph' => 'inputgraph',
        'nodefile' => 'nodefile',
        'wcol' => 'wcol',
        'scol' => 'scol',
        'tcol' => 'tcol',
    }
);

} # end BLOCK







1;


=pod

=head1 NAME

MyTypes::GraphNodeDegreeRequest

=head1 DESCRIPTION

Perl data type class for the XML Schema defined complexType
GraphNodeDegreeRequest from the namespace urn:RSATWS.






=head2 PROPERTIES

The following properties may be accessed using get_PROPERTY / set_PROPERTY
methods:

=over

=item * output


=item * informat


=item * all


=item * inputgraph


=item * nodefile


=item * wcol


=item * scol


=item * tcol




=back


=head1 METHODS

=head2 new

Constructor. The following data structure may be passed to new():

 { # MyTypes::GraphNodeDegreeRequest
   output =>  $some_value, # string
   informat =>  $some_value, # string
   all =>  $some_value, # int
   inputgraph =>  $some_value, # string
   nodefile =>  $some_value, # string
   wcol =>  $some_value, # int
   scol =>  $some_value, # int
   tcol =>  $some_value, # int
 },




=head1 AUTHOR

Generated by SOAP::WSDL

=cut
