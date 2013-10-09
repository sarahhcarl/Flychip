use strict;
use warnings;

open FILE, "<nonSox_enhancers.bed";
open NEWFILE, ">nonSox_enhancers_dmel_strand.bed";
while (my $line = <FILE>) {
	chomp $line;
	print NEWFILE $line."\t+\n";
}

close FILE;
close NEWFILE;
