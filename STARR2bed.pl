#Convert data on STARR-seq peaks to bed files by extending 250 bp up and downstream from midpoints of peaks

use strict;
use warnings;

my $sample;

if ($ARGV[0] =~ /(.+).txt/) {
	$sample = $1;
} else {
	die "Please input a .txt peak file!";
}

open FILE, "<", $ARGV[0];
open BED, ">", $sample.".byfold.bed";

while (my $line = <FILE>) {
	chomp $line;
	my @tmp = split(/\t/, $line);
	my $chr = $tmp[0];
	my $mid = $tmp[1];
	my $score = $tmp[2];
	my $pval = $tmp[3];
	my $start = $mid - 250;
	if ($start < 0) {
		$start = 0;
	}
	my $end = $mid + 250;
	if ($score >= 3) {
		print BED "$chr\t$start\t$end\n";
	}
}

close FILE;
close BED;
