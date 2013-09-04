for i in ../prank/*.fasta.best.anc.fas; do
	perl rsat_workflow.pl ${i}
done
