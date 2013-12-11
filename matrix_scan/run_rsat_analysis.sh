for i in ./vvl_scan_allspecies/*.ft; do
	perl ../Flychip/matrix_scan/rsat_analysis_onlyextant.pl ${i}
done
