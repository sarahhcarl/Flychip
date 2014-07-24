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
my $PATH2SEQ = "/flychip/share/Sarah/Drosophila_genomes/dp3/";

my @chrom = ("chr2", "chr3", "chr4_group1", "chr4_group2", "chr4_group3", "chr4_group4", "chr4_group5", "chrU", "chrXL_group1a", "chrXL_group1e", "chrXL_group3a", "chrXL_group3b", "chrXR_group3a", "chrXR_group5", "chrXR_group6", "chrXR_group8", "chrXR_group9");

foreach my $chr (@chrom) {
	open FILE, $PATH2SEQ.$chr.".fa";
	while (defined (my $line = <FILE>)) {
		chomp $line;
		if ($line !~ /\>/) {
#			$genome_sequence{$chr} .= uc $line;		# this changes all to upper case
			$genome_sequence{$chr} .= $line;
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
