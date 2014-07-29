## Script to find nucelotide conservation of Sox motifs 

use strict;
use warnings;

my $interval;
if ($ARGV[0] =~ /(\d+)_interval(.+).ft/) {
	$interval=$1;
	open FT, "<", $ARGV[0];
}

open FAS, "<", "\.\.\/prank\/fasta\/".$interval."_interval_nogaps\.fa";

my $mel = "";
my $sim = "";
my $yak = "";
my $pse = "";

#Load all sequences into variables
my $species="none";
while (my $line = <FAS>) {
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
close FAS;

#Double-check that each species has a sequence
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

#Get the D.mel motifs one by one and find corresponding sequences
my $mel_seq;
my $sim_seq;
my $yak_seq;
my $pse_seq;

while (my $line = <FT>) {
	chomp $line;
	my $start;
	my $end;
	my $len;
	if ($line =~ /^dmel_(.+)/) {
		#print "$line\n";
		my @tmp = split(/\t/, $line);
		$start = $tmp[4];
		$end = $tmp[5];
		$len = $end-$start;
		$mel_seq = substr($mel, $start-1, $len+1);
		$sim_seq = substr($sim, $start-1, $len+1);
		$yak_seq = substr($yak, $start-1, $len+1);
		$pse_seq = substr($pse, $start-1, $len+1);
		#print "$start\t$mel_seq\t$sim_seq\t$yak_seq\t$pse_seq\n";
		my $cons_count=0;
		if ($mel_seq =~ /-/) {
			#print "$start\t$mel_seq\t$sim_seq\t$yak_seq\t$pse_seq\n";
		} elsif ($sim_seq =~ /-/) {
		} elsif ($yak_seq =~ /-/) {
		} elsif ($pse_seq =~ /-/) {
		} else {
			#print "No gaps!\n";
			my $mel_nt;
			my $sim_nt;
			my $yak_nt;
			my $pse_nt; 
			foreach my $i (0..$len) {
				$mel_nt = substr($mel_seq, $i, 1);
				$sim_nt = substr($sim_seq, $i, 1);
				$yak_nt = substr($yak_seq, $i, 1);
				$pse_nt = substr($pse_seq, $i, 1);
				if (($mel_nt eq $sim_nt) && ($mel_nt eq $yak_nt) && ($mel_nt eq $pse_nt)) {
					$cons_count++;
				}
			}
			my $percent = $cons_count/($len+1);
			#print "$start\t$mel_seq\t$sim_seq\t$yak_seq\t$pse_seq\t$percent\n";
			open NEWFILE, ">>", "nt_conservation_nogaps_motifs_dmel.txt";
			print NEWFILE "$interval\t$start\t$mel_seq\t$percent\n";
			close NEWFILE;
		}
	}
}

close FT;


