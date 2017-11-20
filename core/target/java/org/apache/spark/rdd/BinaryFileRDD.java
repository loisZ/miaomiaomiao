package org.apache.spark.rdd;
public  class BinaryFileRDD<T extends java.lang.Object> extends org.apache.spark.rdd.NewHadoopRDD<java.lang.String, T> {
  // not preceding
  // TypeTree().setOriginal(TypeBoundsTree(TypeTree().setOriginal(Select(Select(Ident(_root_), scala), scala.Nothing)), TypeTree().setOriginal(Select(Select(Ident(_root_), scala), scala.Any))))
  public   BinaryFileRDD (org.apache.spark.SparkContext sc, java.lang.Class<? extends org.apache.spark.input.StreamFileInputFormat<T>> inputFormatClass, java.lang.Class<java.lang.String> keyClass, java.lang.Class<T> valueClass, org.apache.hadoop.conf.Configuration conf, int minPartitions) { throw new RuntimeException(); }
  public  org.apache.spark.Partition[] getPartitions () { throw new RuntimeException(); }
}
