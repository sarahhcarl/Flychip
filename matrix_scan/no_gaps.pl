#Script to take multiple alignments and sort them so that the first sequence does not start with a gap (necessary for matrix-scan).

use strict;
use warnings;

my %seqs;

open FILE, "+<$ARGV[0]";
my $ID;
while (my $line = <FILE>) {
	my $seq;
	chomp $line;
	if ($line =~ />(.+)/) {
		$ID = $line;
	} else {
		$seq = $line;
		$seqs{$seq}=$ID;
	}
}

seek(FILE, 0, 0);

foreach my $seq (sort {$b cmp $a} keys %seqs) {
	print FILE "$seqs{$seq}\n";
	print FILE "$seq\n";
}
close FILE;
