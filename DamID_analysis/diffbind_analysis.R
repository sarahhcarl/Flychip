library(DiffBind)

samples <- read.csv("dmel_allsamples.csv")
dsim <- dba(sampleSheet="dmel_allsamples.csv")
counts = dba.count(dsim, minOverlap=3, fragmentSize=c(50,150,150,50,150,150,50,50,150))
dba.overlap(counts, mode=DBA_OLAP_ALL, bCorOnly=TRUE)

tf = dba.contrast(counts, categories=DBA_FACTOR)
tf = dba.analyze(tf, bFullLibrarySize=FALSE, method=DBA_DESEQ2)
dba.plotMA(tf, th=0.01, method=DBA_DESEQ2)
tf.DB = dba.report(tf, method=DBA_DESEQ2, th=0.01, bCalled=TRUE, file="Dmel_DDam_SoxNDam_differential_sites")
ddam.DB = dba.report(tf, method=DBA_DESEQ2, th=0.01, bCalled=TRUE, bDB=TRUE, bGain=TRUE)
soxn.DB = dba.report(tf, method=DBA_DESEQ2, th=0.01, bCalled=TRUE, bDB=TRUE, bLoss=TRUE)

ddam_up = tf.DB[tf.DB$Fold>0, ]
soxn_up = tf.DB[tf.DB$Fold<0, ]

dba.plotHeatmap(tf, method=DBA_DESEQ2, th=0.01, correlations=FALSE, contrast=1)

df = data.frame(seqnames=seqnames(dsim_up),
                starts=start(dsim_up)-1,
                ends=end(dsim_up),
                strands=strand(dsim_up))
write.table(df, file="./SoxNDam_Dsim_upreg.bed", quote=F, sep="\t", row.names=F, col.names=F)

df = data.frame(seqnames=seqnames(dmel_up),
                starts=start(dmel_up)-1,
                ends=end(dmel_up),
                strands=strand(dmel_up))
write.table(df, file="./SoxNDam_Dmel_upreg.bed", quote=F, sep="\t", row.names=F, col.names=F)