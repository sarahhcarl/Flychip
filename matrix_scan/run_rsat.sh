for i in ../prank/control_enhancers/nonCNS/*.fasta.best.anc.fas; do
	perl ../Flychip/matrix_scan/rsat_workflow.pl ${i}
done
