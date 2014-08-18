use strict;
use warnings;

open FILE, "<", $ARGV[0];
open NEWFILE, ">", $ARGV[1];
my $counter=0;
while (my $line = <FILE>) {
	chomp $line;
	$counter++;
	my @tmp = split(/\t/, $line);
	my $chr = $tmp[0];
	my $start = $tmp[1];
	my $end = $tmp[2];
	my $score = $tmp[3];
	print NEWFILE "$chr\t$start\t$end\t$counter\t$score\t+\n";
}

close FILE;
close NEWFILE;
