## Script to calculate the percentage of perfectly conserved nucleotides in a multiple alignment

use strict;
use warnings;

my $interval;
my $mel = "";
my $sim = "";
my $yak = "";
my $pse = "";

if ($ARGV[0] =~ /(\d+)\_(.+)/) {
	open FILE, "<", $ARGV[0];
	$interval = $1;
}

#while (<FILE>) {}
#print "$.\n";
#print "$interval\n";

my $species="none";
while (my $line = <FILE>) {
	chomp $line;
	if ($line =~ /\>dmel/) {
		$species = "mel";
	} elsif ($line =~ /\>dsim/) {
		$species = "sim";
	} elsif ($line =~ /\>dyak/) {
		$species = "yak";
	} elsif ($line =~ /\>dpse/) {
		$species = "pse";
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
	print "Problem - no Dmel sequence in ".$interval."!";
}
if ($sim eq "") {
	print "Problem - no Dsim sequence in ".$interval."!";
}	
if ($yak eq "") {
	print "Problem - no Dyak sequence in ".$interval."!";
}
if ($pse eq "") {
	print "Problem - no Dpse sequence in ".$interval."!";
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

open NEWFILE, ">>", "Dmel_DDam_unique_nts_test.txt";
my $percent = $cons/$len;
print NEWFILE "$interval\t$percent\n";
close NEWFILE;

#print "$len\t$cons\t$percent\n";

