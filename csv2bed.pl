open FILE, "<", $ARGV[0];
open NEWFILE, ">", $ARGV[1];

my $counter = -1;
while (my $line = <FILE>) {
	$counter++;
	if ($counter > 0) {
		my @tmp = split(/\,/, $line);
		my $chr;
		if ($tmp[0] =~ /"(.+)"/) {
			$chr = $1;
		}
		my $start = $tmp[1];
		my $end = $tmp[2];
		my $score = $tmp[6];
		print NEWFILE "$chr\t$start\t$end\t$counter\t$score\t+\n";
	} 
}

close FILE;
close NEWFILE;
