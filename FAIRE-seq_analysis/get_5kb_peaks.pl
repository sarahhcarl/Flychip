# find size of interval
# do (5000-size)/2 to find out how much to add on each side
# add it upstream and downstream

use strict;
use warnings;

my $name;

if ($ARGV[0] =~ /(.+).bed/) {
	$name = $1
} else {
	die "Please specify a bed file!";
}

open FILE, "<", $ARGV[0];
open NEWFILE, ">", $name."_5kb.bed";

while (my $line = <FILE>) {
	chomp $line;
	my @tmp = split(/\t/, $line);
	my $chr = $tmp[0];
	my $start = $tmp[1];
	my $end = $tmp[2];
	my $size = $end - $start;
	my $add_total = 5000 - $size;
	my $add_side = $add_total / 2;
	my $newstart = $start-$add_side;
	my $newend = $end+$add_side;
	print NEWFILE "$chr\t$newstart\t$newend\n";
}

close FILE;
close NEWFILE;
