## Script to extract multiple alignments from multiz 15-way insect alignments corresponding to binding intervals

use strict;
use warnings;

my $name;
while ($ARGV[0] =~ /(.+).bed/) {
	$name = $1;
	open BED, "<", $ARGV[0];
} else {
	die "Please specify a bed file of intervals";
}

my $path_to_multiz = "/flychip/share/Sarah/Drosophila_genomes/Multiz/";

while (my $line = <BED>) {
	my $int_found = 0;
	chomp $line;
	my @tmp = split (/\t/, $line);
	my $chr = $tmp[0];
	my $start = $tmp[1];
	my $end = $tmp[2];
	my $length = $end-$start;
	my $mel_seq;
	my $sim_seq;
	my $yak_seq;
	my $pse_seq;
	my $msa_start;
	my $msa_length;
	open MULT, "<", $path_to_multiz.$chr."maf";
	while (my $mult_line = <MULT>) {
		if ($int_found == 0) { 
			if ($mult_line =~ /dm3.$chr/) {
				my @tmp = split(/s+/, $mult_line);
				$msa_start = $tmp[2];
				$msa_length = $tmp[3];
				my $seq;
				if (($start >= $msa_start) && ($start < ($msa_start+$msa_length)) {
					$int_found++;
					$seq = $tmp[6];
					if ($end <= ($msa_start + $msa_length) {
						$mel_seq = substr($seq, ($start-$msa_start), $length);
					}
					else {
						$mel_seq = substr($seq, ($start-$msa_start), $msa_length);
					}
				}
			}
		}
		if ($int_found == 1) {
			if ($mult_line =~ /droSim1.(.+)/) {
				my @tmp = split(/s+/, $mult_line);
				my $seq = $tmp[6];
				$int_found++;
				$sim_seq = substr($seq, ($start-$msa_start), $length);
			}
		}
		if ($int_found == 2) {
			if ($mult_line =~ /droYak2.(.+)/) {
				my @tmp = split(/s+/, $mult_line);
				my $seq = $tmp[6];
				$int_found++;
				$yak_seq = substr($seq, ($start-$msa_start), $length);
			}
		}
		if ($int_fount == 3) {
			if ($mult_line =~ /dp4.(.+)/) {
				my @tmp = split(/s+/, $mult_line);
				my $seq = $tmp[6];
				$int_found++;
				$sim_seq = substr($seq, ($start-$msa_start), $length);
			}
		}
	}
}

