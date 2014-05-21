use strict;
use warnings;

open FILE1, "Dsim_SoxNDam1_GATC_counts.bed";
open FILE2, "Dsim_SoxNDam2_GATC_counts.bed";
open FILE3, "Dsim_SoxNDam3_GATC_counts.bed";
open INPUT1, "Dsim_Dam1_GATC_counts.bed";
open INPUT2, "Dsim_Dam2_GATC_counts.bed";
open INPUT3, "Dsim_DDam3_GATC_counts.bed";

my %count_table;
my $ID;

while (my $line = <FILE1>) {
	chomp $line;
	my @tmp = split(/\t/, $line);
	my $chr = $tmp[0];
	my $start = $tmp[1];
	$ID = $tmp[3];
	my $count = $tmp[6];
	$count_table{$ID}=$count;
}

while (my $line = <FILE2>) {
	chomp $line;
	my @tmp = split(/\t/, $line);
	my $chr = $tmp[0];
	my $start = $tmp[1];
	$ID = $tmp[3];
	my $count = $tmp[6];
	$count_table{$ID}=$count_table{$ID}."\t".$count;
}

while (my $line = <FILE3>) {
	chomp $line;
	my @tmp = split(/\t/, $line);
	my $chr = $tmp[0];
	my $start = $tmp[1];
	$ID = $tmp[3];
	my $count = $tmp[6];
	$count_table{$ID}=$count_table{$ID}."\t".$count;
}

while (my $line = <INPUT1>) {
	chomp $line;
	my @tmp = split(/\t/, $line);
	my $chr = $tmp[0];
	my $start = $tmp[1];
	$ID = $tmp[3];
	my $count = $tmp[6];
	$count_table{$ID}=$count_table{$ID}."\t".$count;
}

while (my $line = <INPUT2>) {
	chomp $line;
	my @tmp = split(/\t/, $line);
	my $chr = $tmp[0];
	my $start = $tmp[1];
	$ID = $tmp[3];
	my $count = $tmp[6];
	$count_table{$ID}=$count_table{$ID}."\t".$count;
}

while (my $line = <INPUT3>) {
	chomp $line;
	my @tmp = split(/\t/, $line);
	my $chr = $tmp[0];
	my $start = $tmp[1];
	$ID = $tmp[3];
	my $count = $tmp[6];
	$count_table{$ID}=$count_table{$ID}."\t".$count;
}

close FILE1;
close FILE2;
close FILE3;
close INPUT1;
close INPUT2;
close INPUT3;

open NEWFILE, ">Dsim_SoxNDam_GATCcount_table_rev.tsv";
print NEWFILE "frag_id\tSoxNDam1\tSoxNDam2\tSoxNDam3\tDam1\tDam2\tDam3\n";
foreach my $ID (keys %count_table) {
	print NEWFILE "$ID\t$count_table{$ID}\n";
}

close NEWFILE;

