library(ChIPpeakAnno)

own.txdb <- loadDb("/flychip/share/Bettina/Analysis/PeakAnnotation/New_Annotation_resources/TranscriptDb_FlyBase_dmel-r5.55_v2.sqlite")
dsim_soxndam <- BED2RangedData("/flychip/production/projects/P99756/Final/Dsim_SoxNDam_dm3_DESeq2_p05_merged.bed", header=FALSE)

region <- assignChromosomeRegion(dsim_soxndam, TranscriptDb=own.txdb)

library(RColorBrewer)
pal = brewer.pal(7, "Dark2")

barplot(region$percentage, col=pal, names.arg=c("Exons", "Introns", "5' UTRs", "3' UTRs", "Promoters", "Downstream", "Intergenic"), cex.names=0.7, ylab="Percentage of peaks", main="Genomic features annotated to D. sim SoxN-Dam peaks")