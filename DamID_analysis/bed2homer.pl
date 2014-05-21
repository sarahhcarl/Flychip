use strict;
use warnings;

my $sample;
if ($ARGV[0] =~ /(.+).bed/) {
	$sample = $1;
} else {
	die "Please input a .bed file!";
}

open FILE, "<", $ARGV[0];
open NEWFILE, ">", $sample.".homer";
my $counter=0;
while (my $line = <FILE>) {
	chomp $line;
	$counter++;
	my @tmp = split(/\t/, $line);
	my $chr = $tmp[0];
	my $start = $tmp[1];
	my $end = $tmp[2];
	my $num_frags = $tmp[3];	
	##Option to select only merged peaks:
	#if ($num_frags > 1) {
		print NEWFILE "peak_$counter\t$chr\t$start\t$end\t+\n";
	#}
}

close FILE;
close NEWFILE;
