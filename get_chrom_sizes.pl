use strict;
use warnings;

open SAM, "Stage_5_2.sam";
open CHROM, ">dp4.chrom.sizes";
while (my $line = <SAM>) {
	chomp $line;
	my @tmp = split(/\t/, $line);
	if ($tmp[1] =~ /SN:(.+)/) {
		print CHROM "$1\t";
		if ($tmp[2] =~ /LN:(.+)/) {
			print CHROM "$1\n";
		}
	}
}

close SAM;
close CHROM;
