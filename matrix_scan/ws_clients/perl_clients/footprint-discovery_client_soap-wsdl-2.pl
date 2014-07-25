#!/usr/bin/perl -w
# footprint-discovery_client_soap-wsdl-2.pl - Client footprint-discovery using the SOAP::WSDL module

################################################################
##
## This script runs a simple demo of the web service inerface to the
## RSAT tool footprint-discovery. It sends a request to the server for
## discovering conserved dyads in lexA orthologs
##
################################################################

use strict;
use SOAP::WSDL; ## Requires version 2.0 or later of SOAP::WSDL
use lib 'RSATWS';
use MyInterfaces::RSATWebServices::RSATWSPortType;

warn "\nThis demo script discovers conserved dyads in lexA orthologs\n\n";

## WSDL location
my $server = 'http://rsat.scmbb.ulb.ac.be/rsat/web_services';

## Service call
my $soap=MyInterfaces::RSATWebServices::RSATWSPortType->new();

## Output option
my $output_choice = 'server';  ## Accepted values: 'server', 'client', 'both'

## Retrieve-seq parameters
my $organism = 'Escherichia_coli_K12';  ## Name of the query organism
my @gene = ("lexA");  ## List of query genes
my $taxon = "Enterobacteriales";
my $bg_model = "taxfreq";
my $stats = "";
my $output_prefix = "testing_WS";

my %args = (
	    'output' => $output_choice,
	    'organism' => $organism,
	    'query' => \@gene,  ## An array in a hash has to be referenced (always?)
            'taxon' => $taxon,
            'bg_model' => $bg_model,
            'output_prefix' => $output_prefix
	    );

## Send the request to the server
print "Sending request to the server $server\n";
my $som = $soap->footprint_discovery({'request' => \%args});

## Get the result
unless ($som) {
	printf "A fault (%s) occured: %s\n", $som->get_faultcode(), $som->get_faultstring();
} else {
	my $results = $som->get_response();

    ## Report the remote command
    my $command = $results -> get_command();
    print "Command used on the server: ".$command, "\n";

    ## Report the result
    if ($output_choice eq 'server') {
 		my $server_file = $results -> get_server();
		print "Result file on the server: ".$server_file;
   } elsif ($output_choice eq 'client') {
		my $result = $results -> get_client();
		print "Retrieved sequence(s): \n".$result;
   } elsif ($output_choice eq 'both') {
		my $server_file = $results -> get_server();
		my $result = $results -> get_client();
		print "Result file on the server: ".$server_file."\n";
		print "Retrieved sequence(s): \n".$result;
    }
}
