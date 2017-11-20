package org.apache.spark.scheduler;
public  class SparkListenerBlockManagerAdded implements org.apache.spark.scheduler.SparkListenerEvent, scala.Product, scala.Serializable {
  public  long time () { throw new RuntimeException(); }
  public  org.apache.spark.storage.BlockManagerId blockManagerId () { throw new RuntimeException(); }
  public  long maxMem () { throw new RuntimeException(); }
  // not preceding
  public   SparkListenerBlockManagerAdded (long time, org.apache.spark.storage.BlockManagerId blockManagerId, long maxMem) { throw new RuntimeException(); }
}
