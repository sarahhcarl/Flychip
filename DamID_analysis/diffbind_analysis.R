library(DiffBind)

samples <- read.csv("dpse_dmel_ddam.csv")
dyak <- dba(sampleSheet="dpse_dmel_ddam.csv")
counts = dba.count(dpse, minOverlap=3, fragmentSize=c(0,0,0,50,150,150,0,0,0,50,50,150))
dba.overlap(counts, mode=DBA_OLAP_ALL, bCorOnly=TRUE)

pse = dba.contrast(counts, categories=DBA_TISSUE)
pse = dba.analyze(pse, bFullLibrarySize=FALSE, method=DBA_DESEQ2)
dba.plotMA(pse, th=0.01, method=DBA_DESEQ2)
ddam.DB = dba.report(pse, method=DBA_DESEQ2, th=0.01, bCalled=TRUE, file="Dpse_Dmel_DDam_differential_sites")
pse.DB = dba.report(pse, method=DBA_DESEQ2, th=0.01, bCalled=TRUE, bDB=TRUE, bGain=TRUE)
mel.DB = dba.report(pse, method=DBA_DESEQ2, th=0.01, bCalled=TRUE, bDB=TRUE, bLoss=TRUE)

pse_up = ddam.DB[ddam.DB$Fold>0, ]
mel_up = ddam.DB[ddam.DB$Fold<0, ]

dba.plotHeatmap(pse, method=DBA_DESEQ2, th=0.01, correlations=FALSE, contrast=1)

df = data.frame(seqnames=seqnames(pse_up),
                starts=start(pse_up)-1,
                ends=end(pse_up),
                strands=strand(pse_up))
write.table(df, file="./Dpse_DDam_upreg.bed", quote=F, sep="\t", row.names=F, col.names=F)

df = data.frame(seqnames=seqnames(mel_up),
                starts=start(mel_up)-1,
                ends=end(mel_up),
                strands=strand(mel_up))
write.table(df, file="./Dmel_DDam_upreg.bed", quote=F, sep="\t", row.names=F, col.names=F)