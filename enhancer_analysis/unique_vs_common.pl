# This script will divide the analyzed enhancers into 3 categories: SoxN-unique, Dichaete-unique, or common, based on DamID binding data. It will then measure conservation of D and SoxN sites in each group and see if they are the same or different.

use strict;
use warnings;


# First, open the lists of enhancers by binding category and store them in hashes

open D_UNIQUE, "<..\/..\/CNS.all.full.in.DDam.unique.bed";
open SOXN_UNIQUE, "<..\/..\/CNS.all.full.in.SoxNDam.unique.bed";
open COMMON, "<..\/..\/CNS.all.full.in.SoxNDam.DDam.common.bed";

my %d_unique;
my %soxn_unique;
my %common;

while (my $line = <D_UNIQUE>) {
	chomp $line;
	my @tmp = split(/\t/, $line);
	my $enh = $tmp[3];
	$d_unique{$enh}=0;
}
close D_UNIQUE;

while (my $line = <SOXN_UNIQUE>) {
	chomp $line;
	my @tmp = split(/\t/, $line);
	my $enh = $tmp[3];
	$soxn_unique{$enh}=0;
} 
close SOXN_UNIQUE;

while (my $line = <COMMON>) {
	chomp $line;
	my @tmp = split(/\t/, $line);
	my $enh = $tmp[3];
	$common{$enh}=0;
}
close COMMON;


#Define species and TFs being analyzed

my @species = ('dmel', 'dsim', 'dyak', 'dpse');
my @TFs = ('D', 'SoxN');


# Run various analyses

foreach my $species (@species) {
	foreach my $TF (@TFs) {
		&density($TF, $species);
	}	
}

foreach my $TF (@TFs) {
	&pairwise($TF);
}


# Definition of density subroutine

sub density {
	open DENS, "<..\/..\/rsat\/".$_[0]."_scan90_density_".$_[1].".txt";
	open DFILE, ">..\/..\/rsat\/".$_[0]."_scan90_Dunique_density_".$_[1].".txt";
	print DFILE "enhancer\tdensity\n";
	open SOXNFILE, ">..\/..\/rsat\/".$_[0]."_scan90_SoxNunique_density_".$_[1].".txt";
	print SOXNFILE "enhancer\tdensity\n";
	open COMMONFILE, ">..\/..\/rsat\/".$_[0]."_scan90_common_density_".$_[1].".txt";
	print COMMONFILE "enhancer\tdensity\n";
	while (my $line = <DENS>) {
		chomp $line;
		my @tmp = split(/\t/, $line);
		my $enh = $tmp[0];
		my $dens = $tmp[1];
		foreach my $ID (keys %d_unique) {
			if ($enh eq $ID) {
				print DFILE "$enh\t$dens\n";
			}
		}
		foreach my $ID (keys %soxn_unique) {
			if ($enh eq $ID) {
				print SOXNFILE "$enh\t$dens\n";
			}
		}
		foreach my $ID (keys %common) {
			if ($enh eq $ID) {
				print COMMONFILE "$enh\t$dens\n";
			}
		}
	}
	close DFILE;
	close SOXNFILE;
	close COMMONFILE;
	close DENS;
}


#Definition of pairwise conservation subroutine

sub pairwise {
	open CONS, "<..\/..\/rsat\/".$_[0]."_scan90_extant_conservation.txt";
	my %Dcons4;
	my %Dcons3;
	my %Dcons2;
	my %Dcons1;
	my %SoxNcons4;
	my %SoxNcons3;
	my %SoxNcons2;
	my %SoxNcons1;
	my %Commoncons4;
	my %Commoncons3;
	my %Commoncons2;
	my %Commoncons1;
	while (my $line = <CONS>) {
		chomp $line;
		my @tmp = split(/\t/, $line);
		my $enh = $tmp[0];
		my $start = $tmp[1];
		my $end = $tmp[2];
		my $ID = $enh."\t".$start."\t".$end;
		my $num = $tmp[3];
		foreach my $id (keys %d_unique) {
			if ($enh eq $id) {	
				if ($num == 4) {
					$Dcons4{$ID}++;
				}
				if ($num == 3) {
					my $tax1 = $tmp[4];
					my $tax2 = $tmp[5];
					my $tax3 = $tmp[6];
					my @taxa = ($tax1, $tax2, $tax3);
					@taxa = sort {$a cmp $b} @taxa;
					my $taxa = join("\t", @taxa);
					$Dcons3{$ID}=$taxa;
				}
				if ($num == 2) {
					my $tax1 = $tmp[4];
					my $tax2 = $tmp[5];
					my @taxa = ($tax1, $tax2);
					@taxa = sort {$a cmp $b} @taxa;
					my $taxa = join("\t", @taxa);
					$Dcons2{$ID}=$taxa;
				}
				if ($num == 1) {
					my $tax1 = $tmp[4];
					$Dcons1{$ID}=$tax1;
				}
			}
		}
		foreach my $id (keys %soxn_unique) {
			if ($enh eq $id) {	
				if ($num == 4) {
					$SoxNcons4{$ID}++;
				}
				if ($num == 3) {
					my $tax1 = $tmp[4];
					my $tax2 = $tmp[5];
					my $tax3 = $tmp[6];
					my @taxa = ($tax1, $tax2, $tax3);
					@taxa = sort {$a cmp $b} @taxa;
					my $taxa = join("\t", @taxa);
					$SoxNcons3{$ID}=$taxa;
				}
				if ($num == 2) {
					my $tax1 = $tmp[4];
					my $tax2 = $tmp[5];
					my @taxa = ($tax1, $tax2);
					@taxa = sort {$a cmp $b} @taxa;
					my $taxa = join("\t", @taxa);
					$SoxNcons2{$ID}=$taxa;
				}
				if ($num == 1) {
					my $tax1 = $tmp[4];
					$SoxNcons1{$ID}=$tax1;
				}
			}
		}
		foreach my $id (keys %common) {	
			if ($enh eq $id) {
				if ($num == 4) {
					$Commoncons4{$ID}++;
				}
				if ($num == 3) {
					my $tax1 = $tmp[4];
					my $tax2 = $tmp[5];
					my $tax3 = $tmp[6];
					my @taxa = ($tax1, $tax2, $tax3);
					@taxa = sort {$a cmp $b} @taxa;
					my $taxa = join("\t", @taxa);
					$Commoncons3{$ID}=$taxa;
				}
				if ($num == 2) {
					my $tax1 = $tmp[4];
					my $tax2 = $tmp[5];
					my @taxa = ($tax1, $tax2);
					@taxa = sort {$a cmp $b} @taxa;
					my $taxa = join("\t", @taxa);
					$Commoncons2{$ID}=$taxa;
				}
				if ($num == 1) {
					my $tax1 = $tmp[4];
					$Commoncons1{$ID}=$tax1;
				}
			}

		}
	}
	close CONS;
	&gain_loss(\%Dcons4, \%Dcons3, \%Dcons2, \%Dcons1, $_[0], "Dunique");
	&gain_loss(\%SoxNcons4, \%SoxNcons3, \%SoxNcons2, \%SoxNcons1, $_[0], "SoxNunique");
	&gain_loss(\%Commoncons4, \%Commoncons3, \%Commoncons2, \%Commoncons1, $_[0], "common");
}

sub gain_loss {
	open OUTPUT, ">..\/..\/rsat\/".$_[4]."_scan90_gain_loss_".$_[5].".txt";
	my %cons4 = %{shift()};
	my %cons3 = %{shift()};
	my %cons2 = %{shift()};
	my %cons1 = %{shift()};  
	# Output the number of enhancers in each category of conservation and the total number of enhancers
	my $count4 = keys %cons4;
	my $count3 = keys %cons3;
	my $count2 = keys %cons2;
	my $count1 = keys %cons1;
	my $total = $count4 + $count3 + $count2 + $count1;
	print OUTPUT "Total\t$total\n1\t$count1\n2\t$count2\n3\t$count3\n4\t$count4\n\n";
	my %cons1_taxa;
	foreach my $ID (keys %cons1) {
		$cons1_taxa{$cons1{$ID}}++;
	}
	foreach my $taxa (keys %cons1_taxa) {
		print OUTPUT "$taxa\t$cons1_taxa{$taxa}\n";
	}

	my %cons2_taxa;
	foreach my $ID (keys %cons2) {
		$cons2_taxa{$cons2{$ID}}++;
	}
	foreach my $taxa (keys %cons2_taxa) {
		print OUTPUT "$taxa\t$cons2_taxa{$taxa}\n";
	}

	my %cons3_taxa;
	foreach my $ID (keys %cons3) {
		$cons3_taxa{$cons3{$ID}}++;
	}
	foreach my $taxa (keys %cons3_taxa) {
		print OUTPUT "$taxa\t$cons3_taxa{$taxa}\n";
	}
	close OUTPUT;
}




