# Script to extract phastCons scores for specific enhancers

use strict;
use warnings;

open FILE, "<bound_enhancers.csv";

my %enhancers;

while (my $line = <FILE>) {
	my @tmp = split(/\,/, $line);
	my $name = $tmp[0];
	my $chr = $tmp[1];
	my $start = $tmp[2];
	my $end = $tmp[3]; 
	open OUTPUT, ">>"$name."_phastCons.pp";
	open CONS, "<".$chr.".pp";
	my $counter=0;
	if ($chr eq "chrX") {
		$counter = 18966;
	}
	while (my $pos = <CONS>) {
		$counter++;
		if (($start <= $counter) && ($counter <= $end)) {
			print OUTPUT "$pos\n";
		}
	}
	close OUTPUT;
	close CONS;
}	

close FILE;
