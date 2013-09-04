for i in ./vnd_scan_allspecies/*.ft; do
	perl rsat_analysis_onlyextant.pl ${i}
done
