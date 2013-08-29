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
if ($ARGV[0] =~ /..\/prank\/(.+).fasta.best.anc.fas/) {
	$alignment = $1;
	print "$alignment\n";
}

my $result_dir = "vnd_scan_allspecies/";
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

open ERROR, ">>vndscan_errors.txt";

#Parameters for analysis:
my $output = 'both';
my $matrix = ">TCAAKTCT	9-TCAAKTCT,BestGuess:vnd/dmmpmm(Papatsenko)/fly(0.701)	6.063837	-23.312737	0	T:933.0(22.91%),B:8617.7(18.88%),P:1e-10
0.001	0.066	0.001	0.932
0.001	0.613	0.385	0.001
0.666	0.001	0.332	0.001
0.723	0.039	0.237	0.001
0.001	0.001	0.451	0.547
0.097	0.001	0.001	0.901
0.001	0.645	0.353	0.001
0.159	0.001	0.001	0.839";
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
my $client_scan_file = $result_dir."/".$alignment."_vndscan.ft";
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


