# Script to take several fasta files containing enhancer sequences from one species and collate them into new files according to enhancer.

use strict;
use warnings;

open DMEL, "</flychip/production/projects/P99759/prank/Dmel_DDam_unique.fasta";
open MELID, "</flychip/production/projects/P99759/prank/Dmel_DDam_unique_ID.bed";
open DSIM, "</flychip/production/projects/P99759/prank/Dsim_DDam_mel_unique.fasta";
open SIMID, "</flychip/production/projects/P99759/prank/Dsim_DDam_mel_unique.bed";
open DYAK, "</flychip/production/projects/P99759/prank/Dyak_DDam_mel_unique.fasta";
open YAKID, "</flychip/production/projects/P99759/prank/Dyak_DDam_mel_unique.bed";
open DPSE, "</flychip/production/projects/P99759/prank/Dpse_DDam_mel_unique.fasta";
open PSEID, "</flychip/production/projects/P99759/prank/Dpse_DDam_mel_unique.bed";

my %melid;
my %simid;
my %yakid;
my %pseid;

while (my $line = <MELID>) {
	chomp $line;
	my @tmp = split(/\t/, $line);
	my $chr = $tmp[0];
	my $start = $tmp[1]+1;
	my $end = $tmp[2];
	my $ID = $tmp[3];
	my $coords = $chr."\_".$start."\_".$end;
	$melid{$coords}=$ID;
}
close MELID;

while (my $line = <SIMID>) {
	chomp $line;
	my @tmp = split(/\t/, $line);
	my $chr = $tmp[0];
	my $start = $tmp[1]+1;
	my $end = $tmp[2];
	my $ID = $tmp[3];
	my $coords = $chr."\_".$start."\_".$end;
	$simid{$coords}=$ID;
}
close SIMID;

while (my $line = <YAKID>) {
	chomp $line;
	my @tmp = split(/\t/, $line);
	my $chr = $tmp[0];
	my $start = $tmp[1]+1;
	my $end = $tmp[2];
	my $ID = $tmp[3];
	my $coords = $chr."\_".$start."\_".$end;
	$yakid{$coords}=$ID;
}
close YAKID;

while (my $line = <PSEID>) {
	chomp $line;
	my @tmp = split(/\t/, $line);
	my $chr = $tmp[0];
	my $start = $tmp[1]+1;
	my $end = $tmp[2];
	my $ID = $tmp[3];
	my $coords = $chr."\_".$start."\_".$end;
	$pseid{$coords}=$ID;
}
close PSEID;

my %mel;
my %sim;
my %yak;
my %pse;

my $ID;
while (my $line = <DMEL>) {
	chomp $line;
	my $c;
	if ($line =~ /\>dm3\_(.+)\_\+/) {
		$c = $1;
		#print "$c\n";
		foreach my $coords (keys %melid) {
			#print "$coords\n";
			if ($c eq $coords) {
				$ID = $melid{$coords};
				$mel{$ID} = $c;
				#print "$ID\t$c\n";
			}
		}
	}
	else {
		$mel{$ID} = $mel{$ID}."\t".$line;
	}
}
close DMEL;

while (my $line = <DSIM>) {
	chomp $line;
	my $c;
	if (($line =~ /\>droSim1\_(.+)\_\+/) || ($line =~ /\>droSim1\_(.+)\_\-/)) {
		$c = $1;
		foreach my $coords (keys %simid) {
			if ($c eq $coords) {
				$ID = $simid{$coords};
				$sim{$ID} = $c;
			}
		}
	}
	else {
		$sim{$ID} = $sim{$ID}."\t".$line;
	}
}
close DSIM;

while (my $line = <DYAK>) {
	chomp $line;
	my $c;
	if (($line =~ /\>droYak2\_(.+)\_\+/) || ($line =~ /\>droYak2\_(.+)\_\-/)) {
		$c = $1;
		foreach my $coords (keys %yakid) {
			if ($c eq $coords) {
				$ID = $yakid{$coords};
				$yak{$ID}=$c;
			}
		}
	}
	else {
		$yak{$ID} = $yak{$ID}."\t".$line;
	}
}
close DYAK;

while (my $line = <DPSE>) {
	chomp $line;
	my $c;
	if (($line =~ /\>dp3\_(.+)\_\+/) || ($line =~ /\>dp3\_(.+)\_\-/)) {
		$c = $1;
		#print "$c\n";
		foreach my $coords (keys %pseid) {
			if ($c eq $coords) {
				$ID = $pseid{$coords};
				$pse{$ID} = $c;
			}
		}
	}
	else {
		$pse{$ID} = $pse{$ID}."\t".$line;
	}
}
close DPSE;

foreach my $ID (keys %mel) {
	my @tmp1 = split(/\t/, $mel{$ID});
	my $melcoords = $tmp1[0];
	my $melseq = $tmp1[1];
	foreach my $simID (keys %sim) {
		my @tmp2 = split(/\t/, $sim{$simID});
		my $simcoords = $tmp2[0];
		my $simseq = $tmp2[1];
		if ($ID == $simID) {
			foreach my $yakID (keys %yak) {
				my @tmp3 = split(/\t/, $yak{$yakID});
				my $yakcoords = $tmp3[0];
				my $yakseq = $tmp3[1];
				if ($ID == $yakID) {
					foreach my $pseID (keys %pse) {
						my @tmp4 = split(/\t/, $pse{$pseID});
						my $psecoords = $tmp4[0];
						my $pseseq = $tmp4[1];
						if ($ID == $pseID) {
							open NEWFILE, ">", "unique_mel/".$ID."_interval.fa";
							print NEWFILE "\>dmel\_$ID\_$melcoords\n$melseq\n\>dsim\_$simID\_$simcoords\n$simseq\n\>dyak\_$yakID\_$yakcoords\n$yakseq\n\>dpse\_$pseID\_$psecoords\n$pseseq\n";
							close NEWFILE;
						}
					}
				}
			}
		}
	}
}
