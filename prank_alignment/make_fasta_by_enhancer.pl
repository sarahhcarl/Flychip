# Script to take several fasta files containing enhancer sequences from one species and collate them into new files according to enhancer.

use strict;
use warnings;

open DMEL, "<all_CNS_enhancers_dmel.fasta";
open DSIM, "<all_CNS_enhancers_dsim.fasta";
open DYAK, "<all_CNS_enhancers_dyak.fasta";
open DPSE, "<all_CNS_enhancers_dpse.fasta";

while (my $line = <DMEL>) {
	chomp $line;
	my $ID;
	if ($line =~ /\>(.+)\_chr(.+)/) {
		$ID = $1;
		open NEWFILE, ">>$ID.fasta";
		print NEWFILE ">dmel_".$ID."\n";
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
	if ($line =~ /\>(.+)\_chr(.+)/) {
		$ID = $1;
		open NEWFILE, ">>$ID.fasta";
		print NEWFILE ">dsim_".$ID."\n";
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
	if ($line =~ /\>(.+)\_chr(.+)/) {
		$ID = $1;
		open NEWFILE, ">>$ID.fasta";
		print NEWFILE ">dyak_".$ID."\n";
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
	if ($line =~ /\>(.+)\_chr(.+)/) {
		$ID = $1;
		open NEWFILE, ">>$ID.fasta";
		print NEWFILE ">dpse_".$ID."\n";
	}
	else {
		print NEWFILE "$line\n";
		close NEWFILE;
	}
}
close DPSE;
