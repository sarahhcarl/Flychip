#!/usr/bin/perl

use strict;
use warnings;

open FILE1, $ARGV[0];
while (my $line = <FILE1>) {
    if ($line =~ />(.+)_/) {
        my $ID = $1;
        open NEWFILE, ">>$ID";
        print NEWFILE $line;
    }
    else {
        print NEWFILE $line;
        close NEWFILE;
    }
}
close FILE1;

open FILE2, $ARGV[1];
while (my $line = <FILE2>) {
    if ($line =~ />(.+)_/) {
        my $ID = $1;
        open NEWFILE, ">>$ID";
        print NEWFILE $line;
    }
    else {
        print NEWFILE $line;
        close NEWFILE;
    }
}
close FILE2;

open FILE3, $ARGV[2];
while (my $line = <FILE3>) {
    if ($line =~ />(.+)_/) {
        my $ID = $1;
        open NEWFILE, ">>$ID";
        print NEWFILE $line;
    }
    else {
        print NEWFILE $line;
        close NEWFILE;
    }
}
close FILE3;

open FILE4, $ARGV[3];
while (my $line = <FILE4>) {
    if ($line =~ />(.+)_(.+)_/) {
        my $ID = $1;
        open NEWFILE, ">>$ID";
        print NEWFILE $line;
    }
    elsif ($line =~ />(.+)_/) {
        my $ID = $1;
        open NEWFILE, ">>$ID";
        print NEWFILE $line;
    }
    else {
        print NEWFILE $line;
        close NEWFILE;
    }
}
close FILE4;
