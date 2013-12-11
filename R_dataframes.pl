#Script to make some data frames for plotting in R

use strict;
use warnings;


#Plotting conservation versus position in enhancer

open CONS, $ARGV[0];
my $TF;
my $extant=0;

if ($ARGV[0] =~ /..\/rsat\/(.+)_extant_conservation.txt/) {
	$TF = $1;
	$extant = 1;
} elsif ($ARGV[0] =~ /..\/rsat\/(.+)_conservation.txt/) {
	$TF = $1;
}

if ($extant == 0) {
	open OUTPUT, ">../rsat/Rplots/".$TF."_cons_vs_position.txt";
} elsif ($extant ==1) {
	open OUTPUT, ">../rsat/Rplots/".$TF."_extant_cons_vs_position.txt";
}
print OUTPUT "Start\tEnd\tCons\n";

while (my $line = <CONS>) {
	chomp $line;
	my @tmp = split(/\t/, $line);
	my $enh = $tmp[0];
	my $start = $tmp[1];
	my $end = $tmp[2];
	my $num = $tmp[3];
	print OUTPUT "$start\t$end\t$num\n";
}

close CONS;
close OUTPUT;


#Plotting conservation versus w-score of motif

open CONS, $ARGV[0];
if ($extant == 0) {
	open OUT2, ">../rsat/Rplots/".$TF."_cons_vs_wscore.txt";
} elsif($extant ==1) {
	open OUT2, ">../rsat/Rplots/".$TF."_extant_cons_vs_wscore.txt";
}
print OUT2 "Wscore\tCons\n";

while (my $line = <CONS>) {
	chomp $line;
	my @tmp = split(/\t/, $line);
	my $enh = $tmp[0];
	my $start = $tmp[1];
	my $end = $tmp[2];
	my $num = $tmp[3];
	open FEAT, "<../rsat/".$TF."/".$enh."_Dscan90.ft";
	while (my $newline = <FEAT>) {
		chomp $newline;
		if ($newline =~ /\;/) {
		} elsif ($newline =~ /#seq_id/) {
		} else {
			my @tmp = split(/\t/, $newline);
			my $newstart = $tmp[4];
			my $newend = $tmp[5];
			my $wscore = $tmp[7];
			if ($start == $newstart) {
				print OUT2 "$wscore\t$num\n";
			}
		}		
	}
	close FEAT;
}
close OUT2;
close CONS;
print "$TF\n";

