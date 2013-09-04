# Script to count numbers of enhancer where one unique gain or loss event can be identified (based only on extant nodes)

use strict;
use warnings;

my %cons4;
my %cons3;
my %cons2;
my %cons1;

open OUTPUT, ">./conservation/vnd_gain_loss.txt";
open FILE, "<vnd_scan_extant_conservation.txt";
while (my $line = <FILE>) {
	chomp $line;
	my @tmp = split(/\t/, $line);
	my $enh = $tmp[0];
	my $start = $tmp[1];
	my $end = $tmp[2];
	my $ID = $enh."\t".$start."\t".$end;
	my $num = $tmp[3];
#First, get all the sites conserved at all nodes
	if ($num == 4) {
		$cons4{$ID}++;
	}
#Next, get all the sites conserved at 3 nodes, etc.
	if ($num == 3) {
		my $tax1 = $tmp[4];
		my $tax2 = $tmp[5];
		my $tax3 = $tmp[6];
		my @taxa = ($tax1, $tax2, $tax3);
		@taxa = sort {$a cmp $b} @taxa;
		my $taxa = join("\t", @taxa);
		$cons3{$ID}=$taxa;
	}
	if ($num == 2) {
		my $tax1 = $tmp[4];
		my $tax2 = $tmp[5];
		my @taxa = ($tax1, $tax2);
		@taxa = sort {$a cmp $b} @taxa;
		my $taxa = join("\t", @taxa);
		$cons2{$ID}=$taxa;
	}
	if ($num == 1) {
		my $tax1 = $tmp[4];
		$cons1{$ID}=$tax1;
	}
}
close FILE;

# Output the number of enhancers in each category of conservation and the total number of enhancers
my $count4 = keys %cons4;
my $count3 = keys %cons3;
my $count2 = keys %cons2;
my $count1 = keys %cons1;
my $total = $count4 + $count3 + $count2 + $count1;
print OUTPUT "Total\t$total\n1\t$count1\n2\t$count2\n3\t$count3\n4\t$count4\n\n";

my %cons1_taxa;
foreach my $ID (keys %cons1) {
	$cons1_taxa{$cons1{$ID}}++;
}
foreach my $taxa (keys %cons1_taxa) {
	print OUTPUT "$taxa\t$cons1_taxa{$taxa}\n";
}

my %cons2_taxa;
foreach my $ID (keys %cons2) {
	$cons2_taxa{$cons2{$ID}}++;
}
foreach my $taxa (keys %cons2_taxa) {
	print OUTPUT "$taxa\t$cons2_taxa{$taxa}\n";
}

my %cons3_taxa;
foreach my $ID (keys %cons3) {
	$cons3_taxa{$cons3{$ID}}++;
}
foreach my $taxa (keys %cons3_taxa) {
	print OUTPUT "$taxa\t$cons3_taxa{$taxa}\n";
}


