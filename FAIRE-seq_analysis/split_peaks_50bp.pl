use strict;
use warnings;

my $name;

if ($ARGV[0] =~ /(.+).bed/) {
	$name = $1
} else {
	die "Please specify a bed file!";
}

open FILE, "<", $ARGV[0];
my $counter = 0;

while (my $line = <FILE>) {
	$counter++;
	open NEWFILE, ">", "KR_split_peaks/KR_peak_".$counter.".bed";
	chomp $line;
	my @tmp = split(/\t/, $line);
	my $chr = $tmp[0];
	my $start = $tmp[1];
	#print "$start\n";
	my $end = $tmp[2];
	if ($start =~ /(.+)\.5/) {
		$start = $1;
	}
	if ($end =~ /(.+)\.5/) {
		$end = $1;
	}
	#print "$start\n";
	my $newend = $start + 50;
	while ($newend <= $end) {
		print NEWFILE "$chr\t$start\t$newend\n";
		$start = $newend;
		$newend = $start + 50;
	}
	close NEWFILE; 
}
close FILE;
