#Script to take multiple alignments and sort them so that the first sequence does not start with a gap (necessary for matrix-scan).

use strict;
use warnings;

my %seqs;
my $name;
if ($ARGV[0] =~ /(\d+)\_interval(.+)/) {
	open FILE, "<", $ARGV[0];
	$name = $1;
}

my $ID;
while (my $line = <FILE>) {
	my $seq;
	chomp $line;
	if ($line =~ />(.+)/) {
		$ID = $line;
	} else {
		$seq = $line;
		$seqs{$ID}=$seq;
		#print "$ID\t$line\n";
	}
}

#seek(FILE, 0, 0);

open NEWFILE, ">", $1."_interval_nogaps.fa";
foreach my $ID (sort {$seqs{$b} cmp $seqs{$a}} (keys %seqs)) {
	#print "$ID\n";
	print NEWFILE "$ID\n";
	print NEWFILE "$seqs{$ID}\n";
}
close FILE;
close NEWFILE
