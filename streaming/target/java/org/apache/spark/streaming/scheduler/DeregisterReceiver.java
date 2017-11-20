package org.apache.spark.streaming.scheduler;
public  class DeregisterReceiver implements org.apache.spark.streaming.scheduler.ReceiverTrackerMessage, scala.Product, scala.Serializable {
  public  int streamId () { throw new RuntimeException(); }
  public  java.lang.String msg () { throw new RuntimeException(); }
  public  java.lang.String error () { throw new RuntimeException(); }
  // not preceding
  public   DeregisterReceiver (int streamId, java.lang.String msg, java.lang.String error) { throw new RuntimeException(); }
}
