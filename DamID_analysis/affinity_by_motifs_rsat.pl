# Script to get motif scores of positionally conserved motifs

use strict;
use warnings;

my $interval;
my $motif_start;
my $mel_score;
my $sim_score;
my $yak_score;
my $pse_score;

if ($ARGV[0] =~ /(\d+)_interval(\d+)_(\d+).fa/) {
	open FILE, "<", $ARGV[0];
	$interval = $1;
	$motif_start = $2;
}

#while (<FILE>) {}
#print "$.\n";
#print "$interval\n";

my $species="none";
while (my $line = <FILE>) {
	chomp $line;
	if ($line =~ /^\>dmel\t(.+)/) {
		$species = "mel";
		$mel_score = $1;
	} elsif ($line =~ /^\>dsim\t(.+)/) {
		$species = "sim";
		$sim_score = $1;
	} elsif ($line =~ /^\>dyak\t(.+)/) {
		$species = "yak";
		$yak_score = $1;
	} elsif ($line =~ /^\>dpse\t(.+)/) {
		$species = "pse";
		$pse_score = $1;
	}
}
close FILE;

open NEWFILE, ">>", "motif_scores_ddam_fourway.txt";
print NEWFILE "$interval\t$motif_start\t$mel_score\t$sim_score\t$yak_score\t$pse_score\n";
close NEWFILE;
