# Script to find called TFBSs that are within binding intervals and report counts.

use strict;
use warnings;

open BIND, "<all_CNS_binding_relative_dmel.bed";
open FILE, $ARGV[0];
open NEWFILE, ">>./rsat/SoxN_scan_binding_count_density.txt";

#Define which enhancer and which TF we're looking at
my $enhancer;
my $TF;
if ($ARGV[0] =~ /\.\/rsat\/SoxN_scan_allspecies\/(.+)\_(.+)\.ft/) {
	$enhancer = $1;
	$TF = $2;
}

#Read through file line by line, ignoring header lines. Store D. melanogaster motif sites in a hash.
my %sites;
while (my $line = <FILE>) {
	chomp $line;
	if ($line =~ /\;/) {
	}
	elsif ($line =~ /\#seq_id(.+)/) {
	}	
	else {
		my @tmp = split(/\t/, $line);
		my $species = $tmp[0];
		my $start = $tmp[4];
		my $end = $tmp[5];
		my $seq = $tmp[6];
		if ($species eq "dmel") {
			my $coords = $start."\t".$end;
			$sites{$coords}=$seq;
		}
	}
}
close FILE;

while (my $line = <BIND>) {
	my $count=0;
	my $length=0;
	my $dens=0;
	chomp $line;
	my @tmp = split(/\t/, $line);
	my $start = $tmp[1];
	my $end = $tmp[2];
	my $enh = $tmp[3];
	$length = $end - $start;
	if ($enh eq $enhancer) {
		foreach my $coords (keys %sites) {
			my @tmp2 = split(/\t/, $coords);
			my $sitestart = $tmp2[0];
			my $siteend = $tmp2[1];
			if (($sitestart >= $start) && ($siteend <= $end)) {
				$count++;
			}
		}
		$dens = $count / $length;
		print NEWFILE"$count\t$dens\n";
	}
}
close BIND;
close NEWFILE;



