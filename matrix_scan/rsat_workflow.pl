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
if ($ARGV[0] =~ /\/flychip\/production\/projects\/P99759\/prank\/unique_mel\/(.+)_nogaps\.fa/) {
	$alignment = $1;
	print "$alignment\n";
}

my $result_dir = "/flychip/production/projects/P99759/rsat_unique_control/";
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

open ERROR, ">>Dmel_DDam_unique_control_scan_errors.txt";

#Parameters for analysis:
my $output = 'both';
my $matrix_file = "
>D_Dmel_perm1 /name=D_Dmel_perm1 /info=2.944 /gc_content=0.304 /consensus=AAGTTAGCTT /size=10 
0.997	0.001	0.001	0.001	
0.997	0.001	0.001	0.001	
0.001	0.001	0.997	0.001	
0.001	0.038	0.001	0.960	
0.001	0.001	0.001	0.997	
0.768	0.001	0.001	0.230	
0.001	0.001	0.997	0.001	
0.001	0.997	0.001	0.001	
0.001	0.001	0.001	0.997	
0.001	0.001	0.001	0.997	
>SoxN_dmel_perm1 /name=SoxN_dmel_perm1 /info=2.041 /gc_content=0.345 /consensus=CTWTTCGT /size=8 
0.001	0.997	0.001	0.001	
0.001	0.001	0.001	0.997	
0.278	0.001	0.001	0.720	
0.001	0.001	0.001	0.997	
0.001	0.001	0.001	0.997	
0.247	0.736	0.001	0.016	
0.001	0.001	0.997	0.001	
0.248	0.015	0.001	0.736	
>D_dsim_perm1 /name=D_dsim_perm1 /info=2.080 /gc_content=0.246 /consensus=TTTTTGBA /size=8 
0.001	0.001	0.001	0.997	
0.001	0.024	0.001	0.974	
0.001	0.001	0.001	0.997	
0.001	0.217	0.001	0.781	
0.001	0.001	0.001	0.997	
0.001	0.001	0.997	0.001	
0.001	0.309	0.412	0.278	
0.997	0.001	0.001	0.001	
>SoxN_dsim_perm1 /name=SoxN_dsim_perm1 /info=1.893 /gc_content=0.237 /consensus=GTCTTTTT /size=8 
0.041	0.072	0.886	0.001	
0.021	0.001	0.001	0.977	
0.034	0.592	0.149	0.225	
0.171	0.001	0.023	0.805	
0.001	0.034	0.048	0.917	
0.001	0.066	0.001	0.932	
0.001	0.001	0.001	0.997	
0.028	0.001	0.021	0.950	
>D_dyak_perm1 /name=D_dyak_perm1 /info=1.855 /gc_content=0.403 /consensus=GGAACTTA /size=8 
0.015	0.001	0.956	0.028	
0.001	0.111	0.845	0.043	
0.960	0.019	0.020	0.001	
0.921	0.001	0.047	0.031	
0.001	0.910	0.001	0.088	
0.109	0.024	0.001	0.866	
0.001	0.058	0.119	0.822	
0.804	0.063	0.050	0.083	
>D_dpse_perm1 /name=D_dpse_perm1 /info=1.850 /gc_content=0.295 /consensus=CAAATAGA /size=8 
0.001	0.961	0.037	0.001	
0.847	0.001	0.093	0.059	
0.944	0.054	0.001	0.001	
0.728	0.143	0.056	0.073	
0.102	0.001	0.034	0.863	
0.971	0.001	0.027	0.001	
0.055	0.025	0.858	0.062	
0.902	0.039	0.027	0.032";
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
			'matrix' => $matrix_file, 
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
my $client_scan_file = $result_dir."/".$alignment."_DDam_unique_control_scan.ft";
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


