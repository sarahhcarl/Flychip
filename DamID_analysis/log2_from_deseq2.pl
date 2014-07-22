# Make log2 ratio files by taking scores from DESeq2 results

use strict;
use warnings;

#Open DESeq2 results file
my $sample;
if ($ARGV[0] =~ /(.+).csv/) {
	open FILE, "<", $ARGV[0];
	$sample = $1;
} else {
	die "Please specify a csv file with DESeq2 results!";
}

#Open file of GATC fragments
open GATC, "<", $ARGV[1];

#load GATC fragments into memory
my %gatc;
while (my $line = <GATC>) {
	chomp $line;
	my @tmp = split(/\t/, $line);
	my $chr = $tmp[0];
	my $start = $tmp[3];
	my $end = $tmp[4];
	my $id = $tmp[8];
	$gatc{$id}=$chr."\t".$start."\t".$end;
}
close GATC;

#Go through DESeq2 file, match all fragments
open NEWFILE, ">", $sample.".bedgraph";
print NEWFILE "track type=bedGraph\n";
my $counter=0;
while (my $line = <FILE>) {
	chomp $line;
	$counter++;
	if ($counter > 1) {
		my @tmp = split(/\,/, $line);
		my $name;
		if ($tmp[0] =~ /\"(.+)\"/) {
			$name = $1;
		}
		#print "$name\n";
		my $log2 = $tmp[2];
		if ($log2 ne "NA") {
		#print "$log2\n";
			foreach my $id (keys %gatc) {
				if ($id eq $name) {
					print NEWFILE "$gatc{$id}\t$log2\n";
				}
			}
		}
	}
}
close NEWFILE;
close FILE;

