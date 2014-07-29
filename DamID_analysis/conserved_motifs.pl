## Script to extract sequences of positionally conserved TF binding motifs in intervals

use strict;
use warnings;

my $interval;
if ($ARGV[0] =~ /(\d+)_interval_(.+)/) {
	$interval = $1;
	open FILE, "<", $ARGV[0];
}

my $mel_count=0;
my %motifs;
while (my $line = <FILE>) {
	chomp $line;
	if ($line =~ /^\;(.+)/) {
	} elsif ($line =~ /^\;/){
	} elsif ($line =~ /^\#(.+)/) {
	} else {
		#print "$line\n";
		my $species;
		my @tmp = split(/\t/, $line);
		if ($tmp[0] =~ /(.+)_(\d+)_(.+)_(\d+)_(\d+)/) {
			$species = $1;
		}
		if ($species eq "dmel") {
			$mel_count++;
		}
		#print "$species\n";
		my $strand = $tmp[3];
		my $start = $tmp[4];
		my $end = $tmp[5];
		my $coords = $start."\t".$end;
		my $seq = $tmp[6]; 
		my $score = $tmp[7];
		if (exists $motifs{$coords}) {
			$motifs{$coords}=$motifs{$coords}."\t".$species."\t".$seq."\t".$score;
		} else {
			$motifs{$coords}=$species."\t".$seq."\t".$score;
		}
	}
}

close FILE;

my $cons_count=0;
foreach my $site (keys %motifs) {
	#print "$site\t$motifs{$site}\n";
	my @tmp = split(/\t/, $motifs{$site});
	my @coords = split(/\t/, $site);
	my $start = $coords[0];
	my $end = $coords[1];
	if ((scalar @tmp == 12) && ($tmp[0] ne $tmp[3]) && ($tmp[0] ne $tmp[6]) && ($tmp[0] ne $tmp[9]) && ($tmp[3] ne $tmp[6]) && ($tmp[3] ne $tmp[9]) && ($tmp[6] ne $tmp[9])) {
		if (($tmp[1] eq $tmp[4]) && ($tmp[1] eq $tmp[7]) && ($tmp[1] eq $tmp[10])) {
			$cons_count++;
		}
		#print "$site\t$motifs{$site}\n";
		#open NEWFILE, ">", $interval."_interval".$start."_".$end.".fa";
		#print NEWFILE ">$tmp[0]\t$tmp[2]\n$tmp[1]\n>$tmp[3]\t$tmp[5]\n$tmp[4]\n>$tmp[6]\t$tmp[8]\n$tmp[7]\n>$tmp[9]\t$tmp[11]\n$tmp[10]\n";
		#close NEWFILE;
	}
}

open NEWFILE, ">>", "nt_motif_numbers.txt";
print NEWFILE "$cons_count\t$mel_count\n";

