#Script to count sites predicted at the ancestral node

use strict;
use warnings;

open FILE, "<D_scan_conservation.txt";
my $count=0;
while (my $line = <FILE>) {
	chomp $line;
	if ($line =~ /\#1\#/) {
		$count++;
	}
}
print "$count\n";
close FILE;
