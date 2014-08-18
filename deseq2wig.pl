use strict;
use warnings;

my $sample;
if ($ARGV[0] =~ /(.+).csv/) {
	$sample = $1;
} else {
	die "Please input a csv file from DESeq.";
}

open FILE, "<", $ARGV[0];
open BED, ">>", $sample.".bedgraph";
print BED "track\ttype=bedGraph\n";
my $counter = 0;

my %scores;
while (my $line = <FILE>) {
	$counter++;
	if ($counter > 1) {
		chomp $line;
		my @tmp = split(/\,/, $line);
		my $name = $tmp[1];
		my $log2fold = $tmp[6];
		$scores{$name}=$log2fold; 
	}
}	
close FILE;

foreach my $name (sort {$a cmp $b} keys %scores) {
	#print "$name\n";
	my $chr;
	my $start;
	my $end;
	if ($name =~ /"(.+)_(.+)"/) {
		$chr = $1;
		$start = $2;
	}
	$end = $start + 100;
	if (($scores{$name} ne "Inf") && ($scores{$name} ne "-Inf") && ($scores{$name} ne "NA")) {
		print BED "$chr\t$start\t$end\t$scores{$name}\n";
	}
}

close BED;
