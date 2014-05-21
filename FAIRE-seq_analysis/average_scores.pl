use strict;
use warnings;

my %scores;

foreach my $i (1..7297) {
	open FILE, "<", "Trl_split_peaks/Trl_peak_".$i."_Stage_5_2_cov.bed";
	my $pos = -2550;
	while (my $line = <FILE>) {
		$pos = $pos+50;
		chomp $line;
		my @tmp = split(/\t/, $line);
		my $score = $tmp[3];
		if ($i == 1) {
			$scores{$pos}=$score;
		} else {
			$scores{$pos}=$scores{$pos}+$score;
		}
	}
	close FILE;
}

open NEWFILE, ">", "average_Trl_FAIRE_scores_Stage_5_2_coords.txt";
foreach my $peak (sort {$a <=> $b} keys %scores) {
	$scores{$peak}=$scores{$peak}/7297;
	print NEWFILE "$peak\t$scores{$peak}\n";
}

close NEWFILE;
