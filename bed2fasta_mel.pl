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
my $PATH2SEQ = "/home/sarah/homer/data/genomes/dm3/";

my @chrom = ("chr2L", "chr2LHet", "chr2R", "chr2RHet", "chr3L", "chr3LHet", "chr3R", "chr3RHet", "chr4", "chrM", "chrU", "chrUextra", "chrX", "chrXHet", "chrYHet");

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
    my @tmp = split(/\,/, $line);
    
    my $chr = $tmp[1];
    my $ntl = $tmp[2];
    my $ntr = $tmp[3];
    my $ID = $tmp[0];
    
     #...and extract the underlying genome sequence and print it in FASTA format
	my $seq = substr($genome_sequence{$chr}, $ntl, $ntr-$ntl);
	print ">$ID\_$chr:$ntl-$ntr\n$seq\n";
}
  
close HANDLE;
