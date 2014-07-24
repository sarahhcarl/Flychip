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
	if ($counter > 0) {
		my @tmp = split(/\t/, $line);
		my $chr;
		my $start;
		my $end;
		if ($tmp[0] =~ /(.+):(.+)-(.+)/) {
			$chr = $1;
			$start = $2;
			$end = $3;
		}
		my $num = $tmp[1];
		my $dens = $tmp[2];
		print BED "$chr\t$start\t$end\t$num\t$dens\n";
	}
}
close BED;
close FILE;
