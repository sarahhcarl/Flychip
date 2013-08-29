# Script to count the patterns of motif site conservation present in all the enhancers.

use strict;
use warnings;

my %cons7;
my %cons6;
my %cons5;
my %cons4;
my %cons3;
my %cons2;
my %cons1;

open CONS, ">./conservation/D_overall_conservation.txt";
open CONS1, ">./conservation/D_1node.txt";
open CONS2, ">./conservation/D_2nodes.txt";
open CONS3, ">./conservation/D_3nodes.txt";
open CONS4, ">./conservation/D_4nodes.txt";
open CONS5, ">./conservation/D_5nodes.txt";
open CONS6, ">./conservation/D_6nodes.txt";

open FILE, "<D_scan_conservation.txt";
while (my $line = <FILE>) {
	chomp $line;
	my @tmp = split(/\t/, $line);
	my $enh = $tmp[0];
	my $start = $tmp[1];
	my $end = $tmp[2];
	my $ID = $enh."\t".$start."\t".$end;
	my $num = $tmp[3];
#First, get all the sites conserved at all nodes
	if ($num == 7) {
		$cons7{$ID}++;
	}
#Next, get all the sites conserved at 6 nodes, etc.
	if ($num == 6) {
		my $tax1 = $tmp[4];
		my $tax2 = $tmp[5];
		my $tax3 = $tmp[6];
		my $tax4 = $tmp[7];
		my $tax5 = $tmp[8];
		my $tax6 = $tmp[9];
		my @taxa = ($tax1, $tax2, $tax3, $tax4, $tax5, $tax6);
		@taxa = sort {$a cmp $b} @taxa;
		my $taxa = join("\t", @taxa);
		$cons6{$ID}=$taxa;
	}
	if ($num == 5) {
		my $tax1 = $tmp[4];
		my $tax2 = $tmp[5];
		my $tax3 = $tmp[6];
		my $tax4 = $tmp[7];
		my $tax5 = $tmp[8];
		my @taxa = ($tax1, $tax2, $tax3, $tax4, $tax5);
		@taxa = sort {$a cmp $b} @taxa;
		my $taxa = join("\t", @taxa);
		$cons5{$ID}=$taxa;
	}
	if ($num == 4) {
		my $tax1 = $tmp[4];
		my $tax2 = $tmp[5];
		my $tax3 = $tmp[6];
		my $tax4 = $tmp[7];
		my @taxa = ($tax1, $tax2, $tax3, $tax4);
		@taxa = sort {$a cmp $b} @taxa;
		my $taxa = join("\t", @taxa);
		$cons4{$ID}=$taxa;
	}
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

# Output the number of enhancers in each category of conservation
my $count7 = keys %cons7;
my $count6 = keys %cons6;
my $count5 = keys %cons5;
my $count4 = keys %cons4;
my $count3 = keys %cons3;
my $count2 = keys %cons2;
my $count1 = keys %cons1;
print CONS "1\t$count1\n2\t$count2\n3\t$count3\n4\t$count4\n5\t$count5\n6\t$count6\n7\t$count7\n";

# Now, iterate over each hash and pick out the different phylogenetic patterns
my %cons1_taxa;
foreach my $ID (keys %cons1) {
	$cons1_taxa{$cons1{$ID}}++;
}
foreach my $taxa (keys %cons1_taxa) {
	print CONS1 "$taxa\t$cons1_taxa{$taxa}\n";
}

my %cons2_taxa;
foreach my $ID (keys %cons2) {
	$cons2_taxa{$cons2{$ID}}++;
}
foreach my $taxa (keys %cons2_taxa) {
	print CONS2 "$taxa\t$cons2_taxa{$taxa}\n";
}

my %cons3_taxa;
foreach my $ID (keys %cons3) {
	$cons3_taxa{$cons3{$ID}}++;
}
foreach my $taxa (keys %cons3_taxa) {
	print CONS3 "$taxa\t$cons3_taxa{$taxa}\n";
}

my %cons4_taxa;
foreach my $ID (keys %cons4) {
	$cons4_taxa{$cons4{$ID}}++;
}
foreach my $taxa (keys %cons4_taxa) {
	print CONS4 "$taxa\t$cons4_taxa{$taxa}\n";
}

my %cons5_taxa;
foreach my $ID (keys %cons5) {
	$cons5_taxa{$cons5{$ID}}++;
}
foreach my $taxa (keys %cons5_taxa) {
	print CONS5 "$taxa\t$cons5_taxa{$taxa}\n";
}

my %cons6_taxa;
foreach my $ID (keys %cons6) {
	$cons6_taxa{$cons6{$ID}}++;
}
foreach my $taxa (keys %cons6_taxa) {
	print CONS6 "$taxa\t$cons6_taxa{$taxa}\n";
}

close CONS;
close CONS1;
close CONS2;
close CONS3;
close CONS4;
close CONS5;
close CONS6;

