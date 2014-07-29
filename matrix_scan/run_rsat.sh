for i in /flychip/production/projects/P99759/prank/fasta/*_nogaps.fa; do
	perl ./rsat_workflow.pl ${i}
done
