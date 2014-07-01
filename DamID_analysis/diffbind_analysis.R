library(DiffBind)

samples <- read.csv("dmel_allsamples.csv")
dsim <- dba(sampleSheet="dmel_allsamples.csv")
counts = dba.count(dsim, minOverlap=3)
dba.overlap(counts, mode=DBA_OLAP_ALL, bCorOnly=TRUE)

mel = dba.contrast(counts, categories=DBA_FACTOR)
mel = dba.analyze(mel, bFullLibrarySize=FALSE, method=DBA_DESEQ2)
dba.plotMA(mel, th=0.01, method=DBA_DESEQ2)
mel.DB = dba.report(mel, method=DBA_DESEQ2, th=0.01, bCalled=TRUE, file="Dmel_DDam_SoxNDam_differential_sites")
ddam.DB = dba.report(mel, method=DBA_DESEQ2, th=0.01, bCalled=TRUE, bDB=TRUE, bGain=TRUE)
soxn.DB = dba.report(mel, method=DBA_DESEQ2, th=0.01, bCalled=TRUE, bDB=TRUE, bLoss=TRUE)

ddam_up = mel.DB[mel.DB$Fold>0, ]
soxn_up = mel.DB[mel.DB$Fold<0, ]

dba.plotHeatmap(mel, method=DBA_DESEQ2, th=0.01, correlations=FALSE, contrast=1)

df = data.frame(seqnames=seqnames(ddam_only),
                starts=start(ddam_only)-1,
                ends=end(ddam_only),
                strands=strand(ddam_only))
write.table(df, file="./Dsim_DDam_only_upreg.bed", quote=F, sep="\t", row.names=F, col.names=F)

df = data.frame(seqnames=seqnames(soxn_only),
                starts=start(soxn_only)-1,
                ends=end(soxn_only),
                strands=strand(soxn_only))
write.table(df, file="./Dsim_SoxN_only_upreg.bed", quote=F, sep="\t", row.names=F, col.names=F)