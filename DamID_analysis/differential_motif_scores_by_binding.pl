# Script to find motifs whose RSAT score changes between species and categorize them according to increased or decreased binding in their interval

use strict;
use warnings;

open BED, "<", $ARGV[0];

my %int_1up;
my %int_2up;

while (my $line = <BED>) {
	chomp $line;
	my @tmp = split(/\t/, $line);
	my $chr = $tmp[0];
	my $start = $tmp[1]+1;
	my $end = $tmp[2];
	my $ID = $tmp[3];
	my $fold = $tmp[4];
	my $c = $chr."_".$start."_".$end;
	if ($fold < 0) {
		$int_1up{$c} = $fold;
	} elsif ($fold > 0) {
		$int_2up{$c} = $fold;
	}
}
close BED;

open FILE, "<", $ARGV[1];

#Specify species comparison
my $species1 = "mel";
my $species2 = "pse";
my %diff_1up;
my %diff_2up;

while (my $line = <FILE>) {
	chomp $line;
	my @tmp = split(/\t/, $line);
	my $interval = $tmp[0];
	my $int_coords;
	open FT, "<", $interval."_interval_DDam_cons_scan.ft";
	while (my $line = <FT>) {
		chomp $line;
		my @entry = split(/\t/, $line);
		if ($entry[0] =~ /^dmel_(\d+)_(.+)_(.+)_(.+)/) {
		my $chr = $2;
		my $start = $3;
		my $end = $4;
		$int_coords = $chr."\t".$start."\t".$end;
		}
	}
	close FT;
	my $motif_start = $tmp[1];
	my $score1 = $tmp[2];
	my $score2;
	my $diffscore;
	if ($species2 eq "sim") {
		$score2 = $tmp[3];
	} elsif ($species2 eq "yak") {
		$score2 = $tmp[4];
	} elsif ($species2 eq "pse") {
		$score2 = $tmp[5];
	}
	if ($score1 == $score2) {
	} elsif ($score1 > $score2) {
		$diff_1up{$int_coords}++;
		#print "$interval\t$score1\t$score2\t$diff_1up{$int_coords}\t$int_coords\n";
	} elsif ($score2 > $score1) {
		$diff_2up{$int_coords}++;
	}
}

close FILE;

open UPUP, ">", $species1."_vs_".$species2."_upbound_upmotifs.txt";
open UPDOWN, ">", $species1."_vs_".$species2."_upbound_downmotifs.txt";
open DOWNDOWN, ">", $species2."_vs_".$species1."_upbound_upmotifs.txt";
open DOWNUP, ">", $species2."_vs_".$species1."_upbound_downmotifs.txt";

foreach my $coords (keys %int_1up) {
	#print "$coords\n";
	my @tmp = split(/_/, $coords);
	my $chr = $tmp[0];
	my $start = $tmp[1];
	my $end = $tmp[2];
	foreach my $int_coords (keys %diff_1up) {
		my @tmp2 = split(/\t/, $int_coords);
		my $chr2 = $tmp2[0];
		my $start2 = $tmp2[1];
		my $end2 = $tmp2[2];
		if (($chr eq $chr2) && ($start2 >= $start) && ($end2 <= $end)) {
			print UPUP "$chr\t$start\t$end\t$int_1up{$coords}\t$diff_1up{$int_coords}\n";
		} 
	}
}
close UPUP;

foreach my $coords (keys %int_1up) {
	#print "$coords\n";
	my @tmp = split(/_/, $coords);
	my $chr = $tmp[0];
	my $start = $tmp[1];
	my $end = $tmp[2];
	foreach my $int_coords (keys %diff_2up) {
		my @tmp2 = split(/\t/, $int_coords);
		my $chr2 = $tmp2[0];
		my $start2 = $tmp2[1];
		my $end2 = $tmp2[2];
		if (($chr eq $chr2) && ($start2 >= $start) && ($end2 <= $end)) {
			print UPDOWN "$chr\t$start\t$end\t$int_1up{$coords}\t$diff_2up{$int_coords}\n";
		} 
	}
}
close UPDOWN;

foreach my $coords (keys %int_2up) {
	#print "$coords\n";
	my @tmp = split(/_/, $coords);
	my $chr = $tmp[0];
	my $start = $tmp[1];
	my $end = $tmp[2];
	foreach my $int_coords (keys %diff_2up) {
		my @tmp2 = split(/\t/, $int_coords);
		my $chr2 = $tmp2[0];
		my $start2 = $tmp2[1];
		my $end2 = $tmp2[2];
		if (($chr eq $chr2) && ($start2 >= $start) && ($end2 <= $end)) {
			print DOWNDOWN "$chr\t$start\t$end\t$int_2up{$coords}\t$diff_2up{$int_coords}\n";
		} 
	}
}
close DOWNDOWN;

foreach my $coords (keys %int_2up) {
	#print "$coords\n";
	my @tmp = split(/_/, $coords);
	my $chr = $tmp[0];
	my $start = $tmp[1];
	my $end = $tmp[2];
	foreach my $int_coords (keys %diff_1up) {
		my @tmp2 = split(/\t/, $int_coords);
		my $chr2 = $tmp2[0];
		my $start2 = $tmp2[1];
		my $end2 = $tmp2[2];
		if (($chr eq $chr2) && ($start2 >= $start) && ($end2 <= $end)) {
			print DOWNUP "$chr\t$start\t$end\t$int_2up{$coords}\t$diff_1up{$int_coords}\n";
		} 
	}
}
close DOWNUP;

