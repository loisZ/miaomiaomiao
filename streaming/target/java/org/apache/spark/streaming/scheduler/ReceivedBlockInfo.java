package org.apache.spark.streaming.scheduler;
/** Information about blocks received by the receiver */
public  class ReceivedBlockInfo implements scala.Product, scala.Serializable {
  public  int streamId () { throw new RuntimeException(); }
  public  long numRecords () { throw new RuntimeException(); }
  public  org.apache.spark.streaming.receiver.ReceivedBlockStoreResult blockStoreResult () { throw new RuntimeException(); }
  // not preceding
  public   ReceivedBlockInfo (int streamId, long numRecords, org.apache.spark.streaming.receiver.ReceivedBlockStoreResult blockStoreResult) { throw new RuntimeException(); }
}
