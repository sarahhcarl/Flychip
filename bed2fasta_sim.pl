#!/usr/bin/perl

# Scipt uses *.bed created by sbed_top_peaks.pl script and extracts the
# sequence into a fasta file to use with nmica
#
# Author: Jelena Aleksic, Enrico Ferrero, Sarah Carl

use strict;

unless ($ARGV[0]) {
	die "usage: $0 interval.bed > fasta.fa\n";
}


my %genome_sequence = ();
# load genomic sequences into memory -- warning: don't try this at home
# on hal/thebeast/themonster:
my $PATH2SEQ = "/flychip/share/Sarah/Drosophila_genomes/droSim1/byChrom/";

my @chrom = ("chr2h_random", "chr2L", "chr2L_random", "chr2R", "chr2R_random", "chr3h_random", "chr3L", "chr3L_random", "chr3R", "chr3R_random", "chr4", "chr4_random", "chrM", "chrU", "chrX", "chrXh_random", "chrX_random", "chrYh_random");

foreach my $chr (@chrom) {
	open FILE, $PATH2SEQ.$chr.".fa";
	while (defined (my $line = <FILE>)) {
		chomp $line;
		#print "Testing: $line\n";
		if ($line !~ /\>/) {
#			$genome_sequence{$chr} .= uc $line;		# this changes all to upper case
			$genome_sequence{$chr} .= $line;
			#print "Testing: $line\n";
	  	}
  	}
	close FILE;
}
  
open HANDLE, $ARGV[0];

my $count = 0;

while (defined (my $line = <HANDLE>)) {
    chomp $line;
    $count++;
    my @tmp = split(/\t/, $line);
    
    my $chr = $tmp[0];
    my $ntl = $tmp[1];
    my $ntr = $tmp[2];
    my $ID = $tmp[3];
    
     #...and extract the underlying genome sequence and print it in FASTA format
	my $seq = substr($genome_sequence{$chr}, $ntl, $ntr-$ntl);
	print ">$ID\_$chr:$ntl-$ntr\n$seq\n";
}
  
close HANDLE;
