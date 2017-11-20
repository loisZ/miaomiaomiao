package org.apache.spark.scheduler;
public  class SparkListenerBlockManagerRemoved implements org.apache.spark.scheduler.SparkListenerEvent, scala.Product, scala.Serializable {
  public  long time () { throw new RuntimeException(); }
  public  org.apache.spark.storage.BlockManagerId blockManagerId () { throw new RuntimeException(); }
  // not preceding
  public   SparkListenerBlockManagerRemoved (long time, org.apache.spark.storage.BlockManagerId blockManagerId) { throw new RuntimeException(); }
}
