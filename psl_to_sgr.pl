# This script takes a .psl file, the output from running blat, and parses it to create a .sgr file, which can be plotted in IGB. It filters the reads to select only those for which at least 90% of the read can be mapped to the genome.
# Usage: perl psl_to_sgr.pl <psl_file.psl>

use strict;
use warnings;

my $outputfile;
my %reads;
my $linecounter = 0;
my $ntcounter = 0;

if ($ARGV[0] =~ /(.+)\.psl/) {
	$outputfile = $1.".sgr";
} else {
	die "Incorrect input. Need a .psl file.";
}

open FILE, $ARGV[0];
open NEWFILE, ">$outputfile";
while (my $line = <FILE>) {
	$linecounter++;
	if ($linecounter > 5) {
		chomp $line;
		my @tmp = split(/\t/, $line);
		my $match = $tmp[0];
		my $qsize = $tmp[10];
		my $chr = $tmp[13];
		my $start = $tmp[15];
		my $end = $tmp[16];
		my $percent = $match / $qsize;
		if ($percent >= 0.9) {
			foreach my $nt ($start .. $end) {
				$reads{$chr}{$nt}++;
			}
		}	
	}	
}
close FILE;

foreach my $chr (keys %reads) {
	foreach my $nt (sort {$a <=> $b} keys %{$reads{$chr}}) {
		print NEWFILE "$chr\t$nt\t$reads{$chr}{$nt}\n";	
	}
}

close NEWFILE;