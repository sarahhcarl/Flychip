use strict;
use warnings;

my $factor;

if ($ARGV[0] =~ /(.+)metatable_(.+).txt/) {
	$factor = $2;
}

my $counter = 0;
open FILE, "<", $ARGV[0];
open NEWFILE, ">", "Dpse_".$factor.".bed";

while (my $line = <FILE>) {
	chomp $line;
	$counter++;
	if ($counter > 1) {
		my $chr;
		my $start;
		my $end;
		my @tmp = split(/\t/, $line);
		my $coords = $tmp[5];
		if ($coords =~ /(.+):(.+)-(.+)/) {
			$chr = $1;
			$start = $2;
			$end = $3;
		}
		print NEWFILE "$chr\t$start\t$end\n";
	}
}

close FILE;
close NEWFILE;
