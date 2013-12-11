open FILE, "<transcomp_enhancers.csv";
open NEWFILE, ">transcomp_enhancers.bed";

while (my $line = <FILE>) {
	my @tmp = split("\,", $line);
	my $chr = $tmp[0];
	my $start = $tmp[1];
	my $end = $tmp[2];
	print NEWFILE "$chr\t$start\t$end"; 
}

close FILE;
close NEWFILE;
