# Script to find the number and density of Sox binding site in DamID (or shuffled control) binding intervals

use strict;
use warnings;

open BED, "<", $ARGV[0];

my $name;
if ($ARGV[1] =~ /(.+).gff/) {
	open GFF, "<", $ARGV[1];
	$name = $1;
} else {
	die "Please specify a gff file of motif matches!";
}

my %ints;

while (my $line = <BED>) {
	chomp $line;
	my @tmp = split(/\t/, $line);
	my $chr = $tmp[0];
	my $start = $tmp[1];
	my $end = $tmp[2];
	my $id = $chr.":".$start."-".$end;
	$ints{$id}=0;
}
close BED;

my $counter = 0;
while (my $line = <GFF>) {
	$counter++;
	if ($counter > 1) {
		chomp $line;
		my @tmp = split(/\t/, $line);
		my $id = $tmp[0];
		foreach my $int (keys %ints) {
			if ($id eq $int) {
				$ints{$int}++;
			}
		}	
	}
}

open NEWFILE, ">", $name."_density.txt";
foreach my $int (keys %ints) {
	my $length;
	my $density;
	if ($int =~ /(.+):(.+)-(.+)/) {
		my $start = $2;
		my $end = $3;
		$length = $3-$2;
	}
	$density = $ints{$int}/$length;
	print NEWFILE "$int\t$ints{$int}\t$density\n";
}
