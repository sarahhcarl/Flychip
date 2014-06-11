use strict;
use warnings;

my $name;
if ($ARGV[0] =~ /(.+).gff/) {
	$name = $1;
} else {
	die "Please input a gff file!";
}

open FILE, "<", $ARGV[0];
open BED, ">", $name.".bed";
my $counter=0;

while (my $line = <FILE>) {
	chomp $line;
	$counter++;
	if ($counter > 3) {
		my @tmp = split(/\t/, $line);
		my $chr = $tmp[0];
		my $chrom = "chr".$chr;
		my $start = $tmp[3];
		my $end = $tmp[4];
		my $ID = $tmp[8];
		print BED "$chrom\t$start\t$end\t$ID\n";
	}
}
close BED;
close FILE;


