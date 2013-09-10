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
if ($ARGV[0] =~ /..\/prank\/length_change_test\/(.+).fasta.best.anc.fas/) {
	$alignment = $1;
	print "$alignment\n";
}

my $result_dir = "Kr_scan_90/";
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

open ERROR, ">>Krscan90_errors.txt";

#Parameters for analysis:
my $output = 'both';
my $matrix = ">YCCCCTTYCC	2-YCCCCTTYCC,BestGuess:Kr/dmmpmm(Noyes)/fly(0.672)	6.294879	-74.782742	0	T:1354.0(18.59%),B:5707.0(13.56%),P:1e-32
0.149	0.392	0.198	0.260
0.001	0.981	0.012	0.006
0.049	0.844	0.052	0.055
0.214	0.784	0.001	0.001
0.264	0.453	0.117	0.166
0.129	0.153	0.103	0.615
0.001	0.091	0.002	0.906
0.065	0.334	0.176	0.425
0.001	0.712	0.033	0.254
0.089	0.766	0.067	0.0789";
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
my $client_scan_file = $result_dir."/".$alignment."_Krscan90.ft";
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


