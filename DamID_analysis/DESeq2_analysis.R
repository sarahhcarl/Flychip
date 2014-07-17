library("DESeq2")

datafile = "/flychip/production/projects/P99753/translate/DESeq2/Dpse_DDam_dm3_GATCcount_table.tsv"
countTable = read.table(datafile, header=TRUE, row.names=1)

DamID_design = data.frame(
  row.names = c("DDam1", "DDam2", "DDam3", "Dam1", "Dam2", "Dam3"),
  condition = c("fusion", "fusion", "fusion", "dam", "dam", "dam"),
  libType = c("single-end", "single-end", "single-end", "single-end", "single-end", "single-end"))

ddsFullCountTable <- DESeqDataSetFromMatrix(
  countData = countTable,
  colData = DamID_design,
  design = ~ condition)

ddsFullCountTable$condition <- relevel(ddsFullCountTable$condition, "dam")

dds <- DESeq(ddsFullCountTable)
res <- results(dds)
resSig <- res[which(res$padj < 0.05), ]

write.csv(res, "Dpse_DDam_dm3_DESeq2_allGATC_new.csv")
write.csv(resSig, "Dpse_DDam_dm3_DESeq2_p05_GATC_new.csv")