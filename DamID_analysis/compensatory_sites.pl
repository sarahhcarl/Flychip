# Script to identify sites that are annotated to the same gene in two species but do not overlap

use strict;
use warnings;

open FILE, "<", $ARGV[0];

#my $cur_peak_ID;
my %peaks;

while (my $line = <FILE>) {
	chomp $line;
	my @tmp = split(/\t/, $line);
	my $gene = $tmp[0];
	my $chr = $tmp[1];
	my $start1 = $tmp[2];
	my $end1 = $tmp[3];
	my $start2 = $tmp[14];
	my $end2 = $tmp[15];
	my $peak_ID = $chr."\t".$start1."\t".$end1."\t".$gene;
	#Check if we're on the same peak
	#if ($cur_peak_ID eq $peak_ID) {
	#}
	# If not, change cur_peak_ID
	#else { 
	#	$cur_peak_ID = $peak_ID;	
	#	$peaks{$cur_peak_ID} = 0;
	#}
	if ($peaks{$cur_peak_ID} == 1) {
		#skip it
	}
	else {
		#Check if they overlap
		if ((($end1 >= $start2) && ($end1 <= $end2)) || (($start1>=$start2) && ($start1 <= $end2))) {
			$peaks{$cur_peak_ID} = 1;
		}
	}
}

close FILE;
open NEWFILE, ">", "Dsim_compensatory_peaks_vs_Dmel.bed";

foreach my $peak (keys %peaks) {
	if ($peaks{$peak} == 0) {
		print NEWFILE "$peak\n";
	}
}
