# Script to extract information from RSAT matrix-scan output files (count number of occurrences of motifs in each sequence, etc.), only looking at extant nodes (not ancestral)

use strict;
use warnings;


open FILE, $ARGV[0];
open COUNT, ">>vvl_scan_extant_count.txt";
open CONS, ">>vvl_scan_extant_conservation.txt";

#Define which enhancer and which TF we're looking at
my $enhancer;
my $TF;
if ($ARGV[0] =~ /\.\/vvl_scan_allspecies\/(.+)\_(.+)\.ft/) {
	$enhancer = $1;
	$TF = $2;
}
#print "$enhancer\n";

#Read through file line by line, ignoring header lines. Store motif sites in a hash.
my %sites;
while (my $line = <FILE>) {
	chomp $line;
	if ($line =~ /\;/) {
	}
	elsif ($line =~ /\#seq_id(.+)/) {
	}	
	else {
		my @tmp = split(/\t/, $line);
		my $seq_id = $tmp[0];
		my $start = $tmp[4];
		my $end = $tmp[5];
		my $seq = $tmp[6];
		if (($seq_id eq "dmel") || ($seq_id eq "dsim") || ($seq_id eq "dyak") || ($seq_id eq "dpse")) {
			my $coords = $seq_id."\t".$start."\t".$end;
			$sites{$coords}=$seq;
		}
	}
}

my @seqs = ('dmel', 'dsim', 'dyak', 'dpse');
foreach (@seqs) {
	my $count=0;
	foreach my $coords (keys %sites) {
		my @tmp = split(/\t/, $coords);
		my $seq_id;
		if ($tmp[0] eq "\#1\#") {
		} elsif ($tmp[0] eq "\#2\#") {
		} elsif ($tmp[0] eq "\#3\#") {
		} else {
			$seq_id = $tmp[0];
		}
		if ($seq_id eq $_) {
			$count++;
		}
	}
	print COUNT "$enhancer\t$_\t$count\n";
}
my $counter;
my %cons;
foreach my $c (sort {$a cmp $b} keys %sites) {
	$counter=1;
	my @tmp1 = split(/\t/, $c);
	my $seq_id1 = $tmp1[0];
	my $start1 = $tmp1[1];
	my $end1 = $tmp1[2];
	my $site_coords = $start1."\t".$end1;
	$cons{$site_coords}=$seq_id1;
	foreach my $coords (sort {$a cmp $b} keys %sites) {
		my @tmp2 = split(/\t/, $coords);
		my $seq_id2 = $tmp2[0];
		my $start2 = $tmp2[1];
		my $end2 = $tmp2[2];
		if (($start1 == $start2) && ($seq_id1 ne $seq_id2)){
			$counter++;
			$cons{$site_coords}=$cons{$site_coords}."\t".$seq_id2;
		}	
	}
	$cons{$site_coords}=$counter."\t".$cons{$site_coords};
}

foreach my $sites (keys %cons) {
	print CONS "$enhancer\t$sites\t$cons{$sites}\n";
}
