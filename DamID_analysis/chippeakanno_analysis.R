## This uses functions from both ChIPpeakAnno and ChIPseeker to explore the genomic features associated with each peak.

library(ChIPpeakAnno)
library(ChIPseeker)

own.txdb <- loadDb("/flychip/share/Bettina/Analysis/PeakAnnotation/New_Annotation_resources/TranscriptDb_FlyBase_dmel-r5.55_v2.sqlite")
dyak_ddam <- readPeakFile("/flychip/production/projects/P99753/Final/Dpse_DDam_dm3_DESeq2_p05_merged.bed")
region <- assignChromosomeRegion(dyak_ddam, TranscriptDb=own.txdb)

library(RColorBrewer)
pal = brewer.pal(7, "Dark2")

barplot(region$percentage, col=pal, names.arg=c("Exons", "Introns", "5' UTRs", "3' UTRs", "Promoters", "Downstream", "Intergenic"), cex.names=0.7, ylab="Percentage of peaks", main="Genomic features annotated to D. pse Dichaete-Dam peaks")


annofile <- read.table("/flychip/production/projects/P99759/Annotation/gene_annotation/Dmel_DDam_DESeq2_p01_allreps_merged_closestGeneTable_d10000m1.txt", header=TRUE)
anno <- annofile[!is.na(annofile$distanceToTSS), ]
annofile2 <- read.table("/flychip/production/projects/P99759/Annotation/gene_annotation/Dmel_SoxNDam_DESeq2_p01_allreps_merged_closestGeneTable_d10000m1.txt", header=TRUE)
anno2 <- annofile2[!is.na(annofile2$distanceToTSS), ]
annofile3 <- read.table("/flychip/production/projects/P99756/Annotation/gene_annotation/Dsim_DDam_DESeq2_p05_GATC_dm3_new_merged_closestGeneTable_d10000m1.txt", header=TRUE)
anno3 <- annofile3[!is.na(annofile3$distanceToTSS), ]
annofile4 <- read.table("/flychip/production/projects/P99756/Annotation/gene_annotation/Dsim_SoxNDam_DESeq2_p05_GATC_dm3_new_merged_closestGeneTable_d10000m1.txt", header=TRUE)
anno4 <- annofile4[!is.na(annofile4$distanceToTSS), ]
annofile5 <- read.table("/flychip/production/projects/P99752/Annotation/Dyak_DDam_dm3_DESeq2_p05_merged_closestGeneTable_d10000m1.txt", header=TRUE)
anno5 <- annofile5[!is.na(annofile5$distanceToTSS), ]
annofile6 <- read.table("/flychip/production/projects/P99753/Annotation/Dpse_DDam_dm3_DESeq2_p05_merged_closestGeneTable_d10000m1.txt", header=TRUE)
anno6 <- annofile6[!is.na(annofile6$distanceToTSS), ]

allAnno <- list(Dmel_DDam=anno, Dmel_SoxNDam=anno2, Dsim_DDam=anno3, Dsim_SoxNDam=anno4, Dyak_DDam=anno5, Dpse_DDam=anno6)

plotDistToTSS(allAnno, distanceColumn="distanceToTSS")
