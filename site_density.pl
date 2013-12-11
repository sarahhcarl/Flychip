# This script determines the density of TFBSs called by matrix-scan in enhancers.

use strict;
use warnings;

open COUNT, $ARGV[0];
open MEL, "<../prank/control_enhancers/nonCNS/nonCNS_enhancers_dmel_strand.bed";
open SIM, "<../prank/control_enhancers/nonCNS/nonCNS_enhancers_dsim_strand.bed";
open YAK, "<../prank/control_enhancers/nonCNS/nonCNS_enhancers_dyak_strand.bed";
open PSE, "<../prank/control_enhancers/nonCNS/nonCNS_enhancers_dpse_strand.bed";
open MELDENS, ">./control_enhancers/D_scan_nonCNS_density_dmel.txt";
open SIMDENS, ">./control_enhancers/D_scan_nonCNS_density_dsim.txt";
open YAKDENS, ">./control_enhancers/D_scan_nonCNS_density_dyak.txt";
open PSEDENS, ">./control_enhancers/D_scan_nonCNS_density_dpse.txt";

#Store counts of TFBSs per enhancer in a hash
my %counts;
while (my $line = <COUNT>) {
	chomp $line;
	my @tmp = split(/\t/, $line);
	my $count = $tmp[2];
	my $enh;
	if ($tmp[0] =~ /(.+)_D_scan/) {
		$enh = $1;
	}
	my $species = $tmp[1];
	my $ID = $enh."\t".$species;
	$counts{$ID}=$count;
}
close COUNT;

#Go through enhancer file for each species, get length of each enhancer and calculate density of sites
while (my $line = <MEL>) {
	my $dens=0;
	my $token=0;
	chomp $line;
	my @tmp = split(/\t/, $line);
	my $start = $tmp[1];
	my $end = $tmp[2];
	my $length = $end-$start;
	my $enh = $tmp[3];
	foreach my $ID (keys %counts) {
		my @tmp2 = split(/\t/, $ID);
		my $enhID = $tmp2[0];
		my $species = $tmp2[1];
		if ($species eq "dmel") {
			if ($enh eq $enhID) {
				$dens = $counts{$ID} / $length;
				$token++;
			}
		}
	}
	if ($token > 0) {
		print MELDENS "$enh\t$dens\n";
	}
}
close MEL;
close MELDENS;

while (my $line = <SIM>) {
	my $dens=0;
	my $token=0;
	chomp $line;
	my @tmp = split(/\t/, $line);
	my $start = $tmp[1];
	my $end = $tmp[2];
	my $length = $end-$start;
	my $enh = $tmp[3];
	foreach my $ID (keys %counts) {
		my @tmp2 = split(/\t/, $ID);
		my $enhID = $tmp2[0];
		my $species = $tmp2[1];
		if ($species eq "dsim") {
			if ($enh eq $enhID) {
				$dens = $counts{$ID} / $length;
				$token++;
			}
		}
	}
	if ($token > 0){
		print SIMDENS "$enh\t$dens\n";
	}
}
close SIM;
close SIMDENS;

while (my $line = <YAK>) {
	my $dens=0;
	my $token=0;
	chomp $line;
	my @tmp = split(/\t/, $line);
	my $start = $tmp[1];
	my $end = $tmp[2];
	my $length = $end-$start;
	my $enh = $tmp[3];
	foreach my $ID (keys %counts) {
		my @tmp2 = split(/\t/, $ID);
		my $enhID = $tmp2[0];
		my $species = $tmp2[1];
		if ($species eq "dyak") {
			if ($enh eq $enhID) {
				$dens = $counts{$ID} / $length;
				$token++;
			}
		}
	}
	if ($token > 0) {
		print YAKDENS "$enh\t$dens\n";
	}
}
close YAK;
close YAKDENS;

while (my $line = <PSE>) {
	my $dens=0;
	my $token=0;
	chomp $line;
	my @tmp = split(/\t/, $line);
	my $start = $tmp[1];
	my $end = $tmp[2];
	my $length = $end-$start;
	my $enh = $tmp[3];
	foreach my $ID (keys %counts) {
		my @tmp2 = split(/\t/, $ID);
		my $enhID = $tmp2[0];
		my $species = $tmp2[1];
		if ($species eq "dpse") {
			if ($enh eq $enhID) {
				$dens = $counts{$ID} / $length;
				$token++;
			}
		}
	}
	if ($token > 0) {
		print PSEDENS "$enh\t$dens\n";
	}
}
close PSE;
close PSEDENS;


