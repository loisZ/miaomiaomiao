package org.apache.spark.streaming.scheduler;
public  class BatchAllocationEvent implements org.apache.spark.streaming.scheduler.ReceivedBlockTrackerLogEvent, scala.Product, scala.Serializable {
  public  org.apache.spark.streaming.Time time () { throw new RuntimeException(); }
  public  org.apache.spark.streaming.scheduler.AllocatedBlocks allocatedBlocks () { throw new RuntimeException(); }
  // not preceding
  public   BatchAllocationEvent (org.apache.spark.streaming.Time time, org.apache.spark.streaming.scheduler.AllocatedBlocks allocatedBlocks) { throw new RuntimeException(); }
}
