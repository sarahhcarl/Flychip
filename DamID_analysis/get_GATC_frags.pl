use strict;
use warnings;

my $genome;
if (($ARGV[0] =~ /(.+).fasta/) || ($ARGV[0] =~ /(.+).fa/)) {
	$genome = $1;
} else {
	die "Usage: perl get_GATC_frags.pl genome.fasta genome.chrom.sizes";
}

my %seqs;

open FILE, "<", $ARGV[0];
my $chr;
while (my $line = <FILE>) {
	chomp $line;
	if ($line =~ />(.+)/){
		$chr = $1;
		$seqs{$chr};
	} else {
		$seqs{$chr}=$seqs{$chr}.$line;
	}
}
close FILE;

open CHROM, "<", $ARGV[1];
my @chroms;
while (my $line = <CHROM>) {
	chomp $line;
	my @tmp = split(/\t/, $line);
	push @chroms, $tmp[0];
}
close CHROM;

foreach my $chrom (@chroms) {
	my $curseq = %seqs{$chrom};
	
}