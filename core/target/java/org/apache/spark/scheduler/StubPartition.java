package org.apache.spark.scheduler;
public  class StubPartition implements org.apache.spark.Partition, scala.Product, scala.Serializable {
  public  int index () { throw new RuntimeException(); }
  // not preceding
  public   StubPartition (int index) { throw new RuntimeException(); }
}
