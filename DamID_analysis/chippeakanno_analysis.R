## This uses functions from both ChIPpeakAnno and ChIPseeker to explore the genomic features associated with each peak.

library(ChIPpeakAnno)
library(ChIPseeker)

own.txdb <- loadDb("/flychip/share/Bettina/Analysis/PeakAnnotation/New_Annotation_resources/TranscriptDb_FlyBase_dmel-r5.55_v2.sqlite")
dmel_ddam <- readPeakFile("/flychip/production/projects/P99759/Final/Dmel_DDam_DESeq2_p01_allreps_merged.bed")
region <- assignChromosomeRegion(dmel_soxndam, TranscriptDb=own.txdb)

library(RColorBrewer)
pal = brewer.pal(7, "Dark2")

barplot(region$percentage, col=pal, names.arg=c("Exons", "Introns", "5' UTRs", "3' UTRs", "Promoters", "Downstream", "Intergenic"), cex.names=0.7, ylab="Percentage of peaks", main="Genomic features annotated to D. mel SoxN-Dam peaks")


annofile <- read.table("/flychip/production/projects/P99759/Annotation/gene_annotation/Dmel_DDam_DESeq2_p01_allreps_merged_closestGeneTable_d10000m1.txt", header=TRUE)
anno <- annofile[!is.na(annofile$distanceToTSS), ]
annofile2 <- read.table("/flychip/production/projects/P99759/Annotation/gene_annotation/Dmel_SoxNDam_DESeq2_p01_allreps_merged_closestGeneTable_d10000m1.txt", header=TRUE)
anno2 <- annofile2[!is.na(annofile2$distanceToTSS), ]
annofile3 <- read.table("/flychip/production/projects/P99756/Annotation/gene_annotation/Dsim_DDam_DESeq2_p05_GATC_dm3_new_merged_closestGeneTable_d10000m1.txt", header=TRUE)
anno3 <- annofile3[!is.na(annofile3$distanceToTSS), ]

allAnno <- list(dmel_ddam=anno, dmel_soxndam=anno2)

plotDistToTSS(allAnno, distanceColumn="distanceToTSS")
