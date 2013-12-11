# Script to take several fasta files containing enhancer sequences from one species and collate them into new files according to enhancer.

use strict;
use warnings;

open DMEL, "<nonCNS_enhancers_dmel.fa";
open MELID, "<nonCNS_enhancers_dmel_strand.bed";
open DSIM, "<nonCNS_enhancers_dsim.fa";
open SIMID, "<nonCNS_enhancers_dsim_strand.bed";
open DYAK, "<nonCNS_enhancers_dyak.fa";
open YAKID, "<nonCNS_enhancers_dyak_strand.bed";
open DPSE, "<nonCNS_enhancers_dpse.fa";
open PSEID, "<nonCNS_enhancers_dpse_strand.bed";

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

while (my $line = <DMEL>) {
	chomp $line;
	my $ID;
	my $c;
	if (($line =~ /\>dm3\_(.+)\_\+/) || ($line =~ /\>dm3\_(.+)\_\-/)) {
		$c = $1;
		foreach my $coords (keys %melid) {
			if ($c eq $coords) {
				$ID = $melid{$coords};
			}
		}
		open NEWFILE, ">>$ID.fasta";
		print NEWFILE ">dmel ".$ID."\n";
	}
	else {
		print NEWFILE "$line\n";
		close NEWFILE;
	}
}
close DMEL;

while (my $line = <DSIM>) {
	chomp $line;
	my $ID;
	my $c;
	if (($line =~ /\>droSim1\_(.+)\_\+/) || ($line =~ /\>droSim1\_(.+)\_\-/)) {
		$c = $1;
		foreach my $coords (keys %simid) {
			if ($c eq $coords) {
				$ID = $simid{$coords};
			}
		}
		open NEWFILE, ">>$ID.fasta";
		print NEWFILE ">dsim ".$ID."\n";
	}
	else {
		print NEWFILE "$line\n";
		close NEWFILE;
	}
}
close DSIM;

while (my $line = <DYAK>) {
	chomp $line;
	my $ID;
	my $c;
	if (($line =~ /\>droYak2\_(.+)\_\+/) || ($line =~ /\>droYak2\_(.+)\_\-/)) {
		$c = $1;
		foreach my $coords (keys %yakid) {
			if ($c eq $coords) {
				$ID = $yakid{$coords};
			}
		}
		open NEWFILE, ">>$ID.fasta";
		print NEWFILE ">dyak ".$ID."\n";
	}
	else {
		print NEWFILE "$line\n";
		close NEWFILE;
	}
}
close DYAK;

while (my $line = <DPSE>) {
	chomp $line;
	my $ID;
	my $c;
	if (($line =~ /\>dp3\_(.+)\_\+/) || ($line =~ /\>dp3\_(.+)\_\-/)) {
		$c = $1;
		foreach my $coords (keys %pseid) {
			if ($c eq $coords) {
				$ID = $pseid{$coords};
			}
		}
		open NEWFILE, ">>$ID.fasta";
		print NEWFILE ">dpse ".$ID."\n";
	}
	else {
		print NEWFILE "$line\n";
		close NEWFILE;
	}
}
close DPSE;
