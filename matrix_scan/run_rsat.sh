for i in ../prank/length_change_test/*.fasta.best.anc.fas; do
	perl ../Flychip/matrix_scan/rsat_workflow.pl ${i}
done
