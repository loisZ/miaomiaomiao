package org.apache.spark.mllib.recommendation;
/**
 * Partitioner for ALS.
 */
public  class ALSPartitioner extends org.apache.spark.Partitioner {
  public  int numPartitions () { throw new RuntimeException(); }
  // not preceding
  public   ALSPartitioner (int numPartitions) { throw new RuntimeException(); }
  public  int getPartition (Object key) { throw new RuntimeException(); }
  public  boolean equals (Object obj) { throw new RuntimeException(); }
}
