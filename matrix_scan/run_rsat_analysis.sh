for i in ./SoxN_scan_nonCNS/*.ft; do
	perl ../Flychip/matrix_scan/rsat_analysis_onlyextant.pl ${i}
done
