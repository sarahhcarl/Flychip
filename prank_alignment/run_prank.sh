export PATH=$PATH:/flychip/share/analysis/prank/bin/

for i in *.fa; do
	prank -d=${i} -F -showtree -showanc -showevents -o=${i}
done

