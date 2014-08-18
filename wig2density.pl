# Script to convert a wig file into a density file for easy correlation calculation

use strict;
use warnings;

my $name;
if ($ARGV[0] =~ /(.+).wig/) {
	open FILE, "<", $ARGV[0];
	$name = $1;
} else {
	die "Please specify a .wig file to convert!";
}

my $chr;
my $startcoord;
my $endcoord;
my $score;
open NEWFILE, ">", $name.".density";
while (my $line = <FILE>) {
	chomp $line;
	if ($line =~ /track type(.+)/) {
	}
	elsif ($line =~ /(.+)chrom=(.+) start=(.+) step=(.+)/) {
		$chr = $2;
		$startcoord = $3-1;
		if ($startcoord >= 0) {
			foreach my $tmpstart (1..$startcoord) {
				my $tmpend = $tmpstart+1;
				print NEWFILE "$chr\t$tmpstart\t$tmpend\t0\n";
				$tmpstart++;
			}
		}
	}
	else {
		$score = $line;
		$startcoord = $startcoord+1;
		$endcoord = $startcoord+1;
		print NEWFILE "$chr\t$startcoord\t$endcoord\t$score\n";
	}
}

close FILE;
close NEWFILE;
