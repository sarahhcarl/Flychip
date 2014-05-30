use strict;
use warnings;

open FILE, "<dp3_GATC_sites.bed";
open NEWFILE, ">dp3_GATC_fragments.bed";

my $old_chr="chr2";
my $old_end;
my $old_ID;
my $counter=0;
while (my $line = <FILE>) {
	chomp $line;
	my @tmp = split(/\t/, $line);
	my $chr = $tmp[0];
	my $start = $tmp[1];
	my $end = $tmp[2];
	my $name = $tmp[3];
	my $score = $tmp[4];
	my $ID = $name;
	if ($counter == 0) {
		print NEWFILE "$chr\t$start\t";
		$counter++;
	} else {
		$ID = $name.$counter;
		if ($chr eq $old_chr) {
			print NEWFILE "$start\t$ID\t$score\t\-\n";	
		} else {
			print NEWFILE "$old_end\t$ID\t$score\t\-\n";
		}
		$counter++;
		print NEWFILE "$chr\t$start\t";
	}
	$old_chr = $chr;
	$old_end = $end;
	$old_ID = $ID;
}

close FILE;
close NEWFILE;
