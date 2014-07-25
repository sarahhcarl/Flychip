#!/usr/bin/perl
# the first line of the script must tell us which language interpreter to use,
# in this case it is perl

use strict;

# import the modules we need for this test
use SOAP::WSDL;
use lib '../RSATWS';
use MyInterfaces::RSATWebServices::RSATWSPortType;

eval
{       
    # Retriving and processing the WSDL
    my $soap=MyInterfaces::RSATWebServices::RSATWSPortType->new();

    # Defining parameters
    my @gene = ("metA");
    my %args = (
	'organism' => 'Escherichia_coli_K12',
	'query' => \@gene,
	'from' => '-10'
	);

    # Calling the service
    my $som = $soap->retrieve_seq({'request' => \%args});
        
    # If the response arrived, look for a specific sequence
    # If the sequence is correct, return 0 because the test passed.
    # If the sequence is something else, return 2 to indicate a warning.
    # If no answer has arrived, return 1 to indicate the test failed.
    if ( defined $som ) {
	my $results = $som->get_response();
	my $result = $results -> get_client();
	if ($result =~ 'TAATCAGGTT') {
	    print "Passed\n";
	    exit 0;
	} else {
	    print "Unexpected data\n";
	    exit 2;
	}
    } else {    
	print "Failed\n";
	exit 1;
    }
};

if ($@)
{
    print "Caught an exception : $@\n";
    exit 1;
}
