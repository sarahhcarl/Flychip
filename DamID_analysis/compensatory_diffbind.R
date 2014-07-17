sim_diffbind <- read.csv("/flychip/production/projects/P99756/DiffBind/DDam/DBA_Dsim_Dmel_DDam_differential_sites.csv", header=TRUE)
sim_only <- sim_diffbind[sim_diffbind$Fold>0 & sim_diffbind$Called1==3 & sim_diffbind$Called2==0, ]
mel_only <- sim_diffbind[sim_diffbind$Fold<0 & sim_diffbind$Called1==0 & sim_diffbind$Called2==3, ]

yak_diffbind <- read.csv("/flychip/production/projects/P99752/DiffBind/DBA_Dyak_Dmel_DDam_differential_sites.csv")
yak_only <- yak_diffbind[yak_diffbind$Fold>0 & yak_diffbind$Called1==3 & yak_diffbind$Called2==0, ]
mel_only <- yak_diffbind[yak_diffbind$Fold<0 & yak_diffbind$Called1==0 & yak_diffbind$Called2==3, ]

df = data.frame(seqnames=yak_only$Chr,
                starts=yak_only$Start-1,
                ends=yak_only$End)
write.table(df, file="./Dyak_DDam_upreg_yakonly.bed", quote=F, sep="\t", row.names=F, col.names=F)

sim_unique_diffbind <- read.table("/flychip/production/projects/P99756/DiffBind/DDam/gene_annotation/Dsim_DDam_upreg_simonly_closestGeneTable_d10000m1.txt", header=TRUE)
sim_unique <- sim_unique_diffbind[!is.na(sim_unique_diffbind$distanceToTSS), ]
mel_unique_diffbind <- read.table("/flychip/production/projects/P99756/DiffBind/DDam/gene_annotation/Dmel_DDam_upreg_melonly_closestGeneTable_d10000m1.txt", header=TRUE)
mel_unique <- mel_unique_diffbind[!is.na(mel_unique_diffbind$distanceToTSS), ]

mel_sim_unique <- merge(mel_unique, sim_unique, by="GeneName")
mel_sim_unique_genes <- unique(mel_sim_unique$GeneName)

df = data.frame(seqnames=mel_sim_unique$chr.y,
                starts=mel_sim_unique$start.y,
                ends=mel_sim_unique$end.y)
write.table(df, file="./dsim_diffbind_compensatory.bed", quote=F, sep="\t", row.names=F, col.names=F)

yak_unique_diffbind <- read.table("/flychip/production/projects/P99752/DiffBind/gene_annotation/Dyak_DDam_upreg_yakonly_closestGeneTable_d10000m1.txt", header=TRUE)
yak_unique <- yak_unique_diffbind[!is.na(yak_unique_diffbind$distanceToTSS), ]
mel_unique_diffbind <- read.table("/flychip/production/projects/P99752/DiffBind/gene_annotation/Dmel_DDam_upreg_melonly_closestGeneTable_d10000m1.txt", header=TRUE)
mel_unique <- mel_unique_diffbind[!is.na(mel_unique_diffbind$distanceToTSS), ]

yak_up_diffbind <- read.table("/flychip/production/projects/P99752/DiffBind/gene_annotation/Dyak_DDam_upreg_closestGeneTable_d10000m1.txt", header=TRUE)
yak_up <- yak_up_diffbind[!is.na(yak_up_diffbind$distanceToTSS), ]
mel_up_diffbind <- read.table("/flychip/production/projects/P99752/DiffBind/gene_annotation/Dmel_DDam_upreg_closestGeneTable_d10000m1.txt", header=TRUE)
mel_up <- mel_up_diffbind[!is.na(mel_up_diffbind$distanceToTSS), ]

mel_yak_unique <- merge(mel_unique, yak_unique, by="GeneName")
mel_yak_unique_genes <- unique(mel_yak_unique$GeneName)

mel_yak_up <- merge(mel_up, yak_up, by="GeneName")
mel_yak_up_genes <- unique(mel_yak_up$GeneName)

df = data.frame(seqnames=mel_yak_unique$chr.x,
                starts=mel_yak_unique$start.x,
                ends=mel_yak_unique$end.x)
write.table(df, file="./dmel_diffbind_compensatory.bed", quote=F, sep="\t", row.names=F, col.names=F)