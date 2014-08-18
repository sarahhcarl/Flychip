## Script to find correlations between binding affinity in intervals and motif content

use strict;
use warnings;

my $motifs;
if ($ARGV[0] =~ /(.+).gff/) {
	$motifs=$1;
	open GFF1, $ARGV[0];
}

my $counter1=0;
my $cur_coords1="";
my $total_score1=0;
my %scores1;
#my $avg_score1;
my $num1=1;

#Gets total (cumulative) FIMO scores in each interval
while (my $line = <GFF1>) {
	$counter1++;
	if ($counter1 > 1) {
		chomp $line;
		my @tmp = split(/\t/, $line);
		my $coords;
		if ($tmp[0] =~ /dm3_(.+)_(.+)_(.+)_(.+)/) {
			$coords = $1."_".$2."_".$3;
		}
		my $score = $tmp[5];
		if ($cur_coords1 eq $coords) {
			$total_score1 = $total_score1 + $score;
			$num1++;
		} else {
			#$avg_score1 = $total_score1/$num1;
			$scores1{$cur_coords1}=$total_score1."\t".$num1;
			$cur_coords1 = $coords;
			$total_score1 = $score;
			$num1 = 1;
		}	
	}
}

close GFF1;

open GFF2, "<", $ARGV[1];
my $counter2=0;
my $cur_coords2="";
my $total_score2=0;
my %scores2;
#my $avg_score2;
my $num2=1;

#Gets total (cumulative) FIMO scores in each interval
while (my $line = <GFF2>) {
	$counter2++;
	if ($counter2 > 1) {
		chomp $line;
		my @tmp = split(/\t/, $line);
		my $coords;
		if ($tmp[0] =~ /droSim1_(.+)_(.+)_(.+)_(.+)/) {
			$coords = $1."_".$2."_".$3;
		}
		my $score = $tmp[5];
		if ($cur_coords2 eq $coords) {
			$total_score2 = $total_score2 + $score;
			$num2++;
		} else {
			#$avg_score2 = $total_score2/$num2;
			$scores2{$cur_coords2}=$total_score2."\t".$num2;
			$cur_coords2 = $coords;
			$total_score2 = $score;
			$num2 = 1;
		}	
	}
}

close GFF2;

my $intervals;
if ($ARGV[2] =~ /(.+).bed/) {
	open BED1, "<", $ARGV[2];
	$intervals = $1;
}	

open BED2, "<", $ARGV[3];

my %bed2;

while (my $line = <BED2>) {
	chomp $line;
	my @tmp = split(/\t/, $line);
	my $chr = $tmp[0];
	my $start = $tmp[1]+1;
	my $end = $tmp[2];
	my $ID = $tmp[3];
	my $fold = $tmp[4];
	my $c = $chr."_".$start."_".$end;
	foreach my $coords (keys %scores2) {
		if ($c eq $coords) {
			$bed2{$ID}=$coords."\t".$fold."\t".$scores2{$coords};
		}
	}
}

open NEWFILE, ">", "motif_scores_Dmel_vs_Dsim_SoxNDam.txt";

while (my $line = <BED1>) {
	chomp $line;
	my @tmp = split(/\t/, $line);
	my $chr = $tmp[0];
	my $start = $tmp[1]+1;
	my $end = $tmp[2];
	my $ID = $tmp[3];
	my $fold = -($tmp[4]);
	my $c = $chr."_".$start."_".$end;
	foreach my $coords (keys %scores1) {
		if ($c eq $coords) {
			foreach my $ID2 (keys %bed2) {
				if ($ID == $ID2) {
					print NEWFILE "$ID\t$coords\t$fold\t$scores1{$coords}\t$bed2{$ID2}\n";
				}
			}
		}
	}
}
close NEWFILE;

close BED1;
close BED2;
