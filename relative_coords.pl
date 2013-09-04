# Script to convert absolute coordinates of binding sites to relative coordinates within enhancers

use strict;
use warnings;

open ENH, "<all_CNS_enhancers_dmel_strand.bed";
open BIND, "<all_CNS_binding_dmel.bed";
open NEWFILE, ">all_CNS_binding_relative_dmel.bed";

my %enhancers;
while (my $line = <ENH>) {
	chomp $line;
	my @tmp = split(/\t/, $line);
	my $start = $tmp[1];
	my $end = $tmp[2];
	my $ID = $tmp[3];
	my $coords = $start."\t".$end;
	$enhancers{$ID}=$coords;
}
close ENH;

while (my $line = <BIND>) {
	chomp $line;
	my $relstart;
	my $relend;
	my @tmp = split(/\t/, $line);
	my $chr = $tmp[0];
	my $start = $tmp[1];
	my $end = $tmp[2];
	my $enh = $tmp[3];
	foreach my $ID (keys %enhancers) {
		my @tmp2 = split(/\t/, $enhancers{$ID});
		my $enhstart = $tmp2[0];
		my $enhend = $tmp2[1];
		if ($enh eq $ID) {
			$relstart = $start - $enhstart;
			$relend = $end - $enhstart;
		}
	}
	print NEWFILE "$chr\t$relstart\t$relend\t$enh\t1\n";
}
close BIND;
