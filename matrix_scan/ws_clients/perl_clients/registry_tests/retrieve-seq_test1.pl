#!/usr/bin/perl
# the first line of the script must tell us which language interpreter to use,
# in this case its perl

use strict;

# import the modules we need for this test; XML::Compile is included on the server
# by default.
use XML::Compile::WSDL11;
use XML::Compile::Transport::SOAPHTTP;

eval
{
    # Retriving and processing the WSDL
    my $wsdl  = XML::LibXML->new->parse_file('http://rsat.bigre.ulb.ac.be/rsat/web_services/RSATWS.wsdl');
    my $proxy = XML::Compile::WSDL11->new($wsdl);
    
    # Generating a request message based on the WSDL
    my $getSequence = $proxy->compileClient('retrieve_seq');
    
    # Calling the service and getting the response
    my @gene = ("metA");
    my $answer = $getSequence->( request => {organism => 'Escherichia_coli_K12', query => \@gene, from => '-50' });

    # If the response arrived, look for a specific sequence
    # If the sequence is correct, return 0 because the test passed.
    # If the result is something else, return 2 to indicate a warning.
    # If no answer has arrived, return 1 to indicate the test failed.
    if ( defined $answer ) {
#	print "Result : ".$answer->{output}->{response}->{client}."\n";
	if ($answer->{output}->{response}->{client} =~ 'GCTATCTGGATGTCTAAACGTATAAGCGTATGTAGTGAGGTAATCAGGTT'){
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
    print "Caught an exception\n";
    print $@."\n";
    exit 1;
}
