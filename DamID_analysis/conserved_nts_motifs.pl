## Script to calculate the percentage of perfectly conserved nucleotides in a multiple alignment of a motif

use strict;
use warnings;

my $interval;
my $motif_start;
my $mel = "";
my $mel_score;
my $sim = "";
my $sim_score;
my $yak = "";
my $yak_score;
my $pse = "";
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
		#print "$line\n";
	} elsif ($line =~ /\>#3#/) {
		$species = "none";
	} elsif ($line =~ /\>#2#/) {
		$species = "none";
	} elsif ($line =~ /\>#1#/) {
		$species = "none";
	} elsif ($species eq "mel") {
		$mel = $line;
	} elsif ($species eq "sim") {
		$sim = $line;
	} elsif ($species eq "yak") {
		$yak = $line;
	} elsif ($species eq "pse") {
		$pse = $line;
		#print "First: $pse\n";
	}
}
close FILE;

if ($mel eq "") {
	print "Problem - no Dmel sequence in ".$ARGV[0]."!";
}
if ($sim eq "") {
	print "Problem - no Dsim sequence in ".$ARGV[0]."!";
}	
if ($yak eq "") {
	print "Problem - no Dyak sequence in ".$ARGV[0]."!";
}
if ($pse eq "") {
	print "Problem - no Dpse sequence in ".$ARGV[0]."!";
}

my $mel_nt;
my $sim_nt;
my $yak_nt;
my $pse_nt;
my $len = length($mel);
my $cons=0;

foreach my $i (0..$len-1) {
	$mel_nt = substr($mel, $i, 1);
	$sim_nt = substr($sim, $i, 1);
	$yak_nt = substr($yak, $i, 1);
	$pse_nt = substr($pse, $i, 1);
	if (($mel_nt eq $sim_nt) && ($mel_nt eq $yak_nt) && ($mel_nt eq $pse_nt)) {
		$cons++;
		#print "$i\t$mel_nt\t$sim_nt\t$yak_nt\t$pse_nt\n";
	}
}

#print "Second: $pse\n";

open NEWFILE, ">>", "Dmel_DDam_cons_nts_motifs.txt";
my $percent = $cons/$len;
print NEWFILE "$interval\t$motif_start\t$percent\n";
close NEWFILE;

#print "$len\t$cons\t$percent\n";
