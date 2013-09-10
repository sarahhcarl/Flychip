# This script will divide the analyzed enhancers into 3 categories: SoxN-unique, Dichaete-unique, or common, based on DamID binding data. It will then measure conservation of D and SoxN sites in each group and see if they are the same or different.

use strict;
use warnings;

# First, open the lists of enhancers by binding category and store them in hashes

open D_UNIQUE, "<..\/..\/CNS.all.full.in.DDam.unique.bed";
open SOXN_UNIQUE, "<..\/..\/CNS.all.full.in.SoxNDam.unique.bed";
open COMMON, "<..\/..\/CNS.all.full.in.SoxNDam.DDam.common.bed";

my %d_unique;
my %soxn_unique;
my %common;

while (my $line = <D_UNIQUE>) {
	chomp $line;
	my @tmp = split(/\t/, $line);
	my $enh = $tmp[3];
	$d_unique{$enh}=0;
}
close D_UNIQUE;

while (my $line = <SOXN_UNIQUE>) {
	chomp $line;
	my @tmp = split(/\t/, $line);
	my $enh = $tmp[3];
	$soxn_unique{$enh}=0;
} 
close SOXN_UNIQUE;

while (my $line = <COMMON>) {
	chomp $line;
	my @tmp = split(/\t/, $line);
	my $enh = $tmp[3];
	$common{$enh}=0;
}
close COMMON;


#Define species being analyzed

my @species = ('dmel', 'dsim', 'dyak', 'dpse');


# Now split the info in the density files by binding category and report it

foreach (@species) {
	open D_DENS, "..\/..\/rsat\/D_scan90_density_$_.txt";
	open SOXN_DENS, "..\/..\/rsat\/SoxN_scan90_density_$_.txt";
	
}




# Definition of density subroutine

sub density {
	
}


