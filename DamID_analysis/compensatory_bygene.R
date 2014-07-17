mel <- read.table("/flychip/production/projects/P99756/Compensatory/DDam_Dmel_nooverlap_dsim_closestGeneTable_d10000m1.txt", header=TRUE)
mel_peaks <- mel[!is.na(mel$distanceToTSS), ]
sim <- read.table("/flychip/production/projects/P99756/Compensatory/DDam_Dsim_nooverlap_dmel_closestGeneTable_d10000m1.txt", header=TRUE)
sim_peaks <- sim[!is.na(sim$distanceToTSS), ]

mel_sim_bygene <- merge(mel_peaks, sim_peaks, by="GeneName")
mel_sim_uniquegene <- unique(mel_sim_bygene$GeneName)

df = data.frame(seqnames=mel_sim_bygene$chr.x,
                starts=mel_sim_bygene$start.x,
                ends=mel_sim_bygene$end.x)
df_unique = unique(df)
write.table(df_unique, file="./soxndam_dmel_compensatory_vs_dsim.bed", quote=F, sep="\t", row.names=F, col.names=F)