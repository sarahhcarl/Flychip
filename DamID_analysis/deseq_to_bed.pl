use strict;
use warnings;

open DESEQ, "Dsim_SoxNDam_DESeq2_p05_GATC_new.csv";
my $counter=0;
my %sig;

while (my $line = <DESEQ>) {
	$counter++;
	if ($counter > 1) {
		chomp $line;
		my @tmp = split(/\,/, $line);
		my $ID = $tmp[0];
		if ($ID =~ /"(.+)"/) {
			$ID = $1;
		}
		my $log2 = $tmp[2];
		my $adjp = $tmp[6];
		if (($log2 ne "NA") && ($log2 ne "-Inf") && ($log2 > 0) && ($adjp ne "NA") && ($adjp <= 0.05)) {
			$sig{$ID}=$adjp;
		}
	}
}
close DESEQ;

open GFF, "<droSim1_GATC_fragments.bed";
open NEWFILE, ">Dsim_SoxNDam_DESeq2_p05_GATC_new.bed";

while (my $line = <GFF>) {
	chomp $line;
	my @tmp = split(/\t/, $line);
	my $chr = $tmp[0];
	my $start = $tmp[1];
	my $fragID = $tmp[3];
	my $end = $tmp[2];
	
	foreach my $ID (keys %sig) {
		if ($ID eq $fragID) {
			print NEWFILE "$chr\t$start\t$end\n";
		}
	}
}
close GFF;
close NEWFILE;
