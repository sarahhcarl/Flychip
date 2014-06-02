# Convert a translated bed file into a sam file (missing some information) for use in downstream analysis like DiffBind

use strict;
use warnings;

my $name;
if ($ARGV[0] =~ /(.+).bed/) {
	$name = $1;
} else {
	die "Please specify a bed file to convert!";
}

open BED, "<", $ARGV[0];
open SAM, ">", $name.".sam";

#Print the D. melanogaster header information
print SAM "\@HD\tVN:1.0\tSO:unsorted\n\@SQ\tSN:chr2L\tLN:23011544\n\@SQ\tSN:chr2LHet\tLN:368872\n\@SQ\tSN:chr2R\tLN:21146708\n\@SQ\tSN:chr2RHet\tLN:3288761\n\@SQ\tSN:chr3L\tLN:24543557\n\@SQ\tSN:chr3LHet\tLN:2555491\n\@SQ\tSN:chr3R\tLN:27905053\n\@SQ\tSN:chr3RHet\tLN:2517507\n\@SQ\tSN:chr4\tLN:1351857\n\@SQ\tSN:chrM\tLN:19517\n\@SQ\tSN:chrUextra\tLN:29004656\n\@SQ\tSN:chrU\tLN:10049037\n\@SQ\tSN:chrX\tLN:22422827\n\@SQ\tSN:chrXHet\tLN:204112\n\@SQ\tSN:chrYHet\tLN:347038\n\@PG\tID:bowtie2\tPN:bowtie2\tVN:2.0.0-beta6\n";

#Print each sequence
# Correct for conversion from 0-based to 1-based coordinates
while (my $line = <BED>) {
	chomp $line;
	my @tmp = split(/\t/, $line);
	my $ID = $tmp[3];
	my $chr = $tmp[0];
	my $start = $tmp[1];
	my $end = $tmp[2];
	my $mapq = $tmp[4];
	my $strand = $tmp[5];
	my $bitflag = 0;
	my $pos = $start + 1;
	if ($strand eq "-") {
		$bitflag = 4;
		$pos = $end - 1;
	}
	print SAM "$ID\t$bitflag\t$chr\t$pos\t$mapq\t*\t*\t0\t0\t*\t*\n";
}

close BED;
close SAM;


