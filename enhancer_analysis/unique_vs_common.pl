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


#Define species and TFs being analyzed

my @species = ('dmel', 'dsim', 'dyak', 'dpse');
my @TFs = ('D', 'SoxN');


# Now split the info in the density files by binding category and report it

foreach (@species) {
	foreach (@TF) {
		open DENS, "<..\/..\/rsat\/".$TF."_scan90_density_".$species.".txt";
		&density($TF, $species);
	}	
}




# Definition of density subroutine

sub density {
	open DFILE, "..\/..\/rsat\/".$_[0]."_scan90_Dunique_density_".$_[1].".txt";
	open SOXNFILE, "..\/..\/rsat\/".$_[0]."_scan90_SoxNunique_density_".$_[1].".txt";
	open COMMONFILE, "..\/..\/rsat\/".$_[0]."_scan90_common_density_".$_[1].".txt";
	while (my $line = <DENS>) {
		chomp $line;
		my @tmp = split(/\t/, $line);
		my $enh = $tmp[0];
		my $dens = $tmp[1];
		foreach my $ID (keys %d_unique) {
			if ($enh eq $ID) {
				print DFILE "$enh\t$dens\n";
			}
		}
		foreach my $ID (keys %soxn_unique) {
			if ($enh eq $ID) {
				print SOXNFILE "$enh\t$dens\n";
			}
		}
		foreach my $ID (keys %common) {
			if ($enh eq $ID) {
				print COMMONFILE "$enh\t$dens\n";
			}
		}
	}
	close DFILE;
	close SOXNFILE;
	close COMMONFILE;
	
}


