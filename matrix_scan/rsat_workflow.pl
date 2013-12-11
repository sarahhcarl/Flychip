use strict;
use warnings;
use File::Path;
use MIME::Base64;
use SOAP::WSDL;

use lib 'RSATWS';
use MyInterfaces::RSATWebServices::RSATWSPortType;

my $soap = MyInterfaces::RSATWebServices::RSATWSPortType->new();
$soap->get_transport()->timeout(1000);

my $alignment;
if ($ARGV[0] =~ /..\/prank\/control_enhancers\/nonCNS\/(.+).fasta.best.anc.fas/) {
	$alignment = $1;
	print "$alignment\n";
}

my $result_dir = "SoxN_scan_nonCNS/";
&File::Path::mkpath($result_dir);
die("Cannot create result directory", $result_dir) unless (-d $result_dir);

open FILE, $ARGV[0];
my $sequence;
my $count=0;
while (my $line = <FILE>) {
	$sequence = $sequence.$line;
	$count++;
}
die("Not enough sequences present in the alignment") unless ($count == 14);

open ERROR, ">>SoxNscan_nonCNS_errors.txt";

#Parameters for analysis:
my $output = 'both';
my $matrix = ">VGVACAAAGG	3-VGVACAAAGG,BestGuess:MA00445.1_D/Jaspar(0.804)	7.156252	-66.311778	0	T:1417.0(19.45%),B:6147.8(14.61%),P:1e-28
0.355	0.217	0.274	0.155
0.208	0.213	0.521	0.058
0.253	0.284	0.399	0.064
0.805	0.087	0.107	0.001
0.304	0.614	0.001	0.081
0.997	0.001	0.001	0.001
0.997	0.001	0.001	0.001
0.838	0.001	0.001	0.160
0.312	0.082	0.502	0.104
0.001	0.001	0.965	0.033";
my $matrix_format = "cb";
my $n_treatment = "score";
my $organism = "Drosophila_melanogaster";
my $background = "upstream-noorf";
my $background_model = "a	0.30372
c	0.20053
g	0.19830
t	0.29744";
my @lth = ('score 4');
my @uth = ('pval 1e-3');
my $origin = "start";
my $crer_ids=1;


#Define hashtable of parameters
my %args = ('output' => $output, 
			'sequence' => $sequence, 
			'matrix' => $matrix, 
			'matrix_format' => $matrix_format, 
			'background_model' => $background_model,
			'background' => $background,
			'organism' => $organism, 
			'n_treatment' => $n_treatment,
			'lth' => \@lth,
			'uth' => \@uth,
			'origin' => $origin,
			'crer_ids' => $crer_ids,
			'verbosity' => 1,
			'str' => 2
			);

#Define output parameters
my $client_scan_file = $result_dir."/".$alignment."_SoxN_scan_nonCNS.ft";
my $server_scan_file;
my $result;

#Send request to server
my $som = $soap->matrix_scan({'request' => \%args});

#Get result and errors, if any
if ($som) {
	my $results = $som->get_response;
	$server_scan_file = $results->get_server();
	chomp($server_scan_file);
	$result = $results->get_client();
	open OUTPUT_SCAN, ">$client_scan_file";
	print OUTPUT_SCAN $result;
	close OUTPUT_SCAN;
	warn "\tRemote matrix-scan result\t",$server_scan_file,"\n";
	warn "\tLocal matrix-scan result\t",$client_scan_file,"\n";
} else {
	print ERROR $alignment."\n";
	printf ERROR "A fault (%s) occurred: %s\n",$som->get_faultcode, $som->get_faultstring;
}


