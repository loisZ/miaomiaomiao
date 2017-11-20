package org.apache.spark.sql.parquet;
public  class Partition implements scala.Product, scala.Serializable {
  public  scala.collection.immutable.Map<java.lang.String, java.lang.Object> partitionValues () { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.hadoop.fs.FileStatus> files () { throw new RuntimeException(); }
  // not preceding
  public   Partition (scala.collection.immutable.Map<java.lang.String, java.lang.Object> partitionValues, scala.collection.Seq<org.apache.hadoop.fs.FileStatus> files) { throw new RuntimeException(); }
}
