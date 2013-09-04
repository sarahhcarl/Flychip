# This script should get all of the intervals where Dichaete or SoxN binding overlaps with one of the 50 test enhancers and report those intervals into a bed file.

use strict;
use warnings;

open COMMON, "CNS.all.in.SoxNDam.DDam.common.bed";
open SOXN, "CNS.all.in.SoxNDam.unique.bed";
open DICHAETE, "CNS.all.in.DDam.unique.bed";
open ENH, "dmel_enhancers.bed";
open OUTPUT, ">>binding_intervals_in_enhancers.bed";

my %enhancers;
while (my $line = <ENH>) {
	chomp $line;
	my @tmp = split(/\t/, $line);
	my $enhancer = $tmp[3];
	$enhancers{$enhancer}=0;
}	
close ENH;

while (my $line = <COMMON>) {
	chomp $line;
	my @tmp = split(/\t/, $line);
	my $ID = $tmp[3];
	my $chr = $tmp[0];
	my $start = $tmp[1];
	my $end = $tmp[2];
	foreach my $e (keys %enhancers) {
		if ($e eq $ID) {
			print OUTPUT $chr."\t".$start."\t".$end."\t".$ID."\n";
		}
	}
}
close COMMON;

while (my $line = <SOXN>) {
	chomp $line;
	my @tmp = split(/\t/, $line);
	my $ID = $tmp[3];
	my $chr = $tmp[0];
	my $start = $tmp[1];
	my $end = $tmp[2];
	foreach my $e (keys %enhancers) {
		if ($e eq $ID) {
			print OUTPUT $chr."\t".$start."\t".$end."\t".$ID."\n";
		}
	}
}
close SOXN;

while (my $line = <DICHAETE>) {
	chomp $line;
	my @tmp = split(/\t/, $line);
	my $ID = $tmp[3];
	my $chr = $tmp[0];
	my $start = $tmp[1];
	my $end = $tmp[2];
	foreach my $e (keys %enhancers) {
		if ($e eq $ID) {
			print OUTPUT $chr."\t".$start."\t".$end."\t".$ID."\n";
		}
	}
}
close DICHAETE;
