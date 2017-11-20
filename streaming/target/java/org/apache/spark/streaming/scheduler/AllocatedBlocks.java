package org.apache.spark.streaming.scheduler;
/** Class representing the blocks of all the streams allocated to a batch */
public  class AllocatedBlocks implements scala.Product, scala.Serializable {
  public  scala.collection.immutable.Map<java.lang.Object, scala.collection.Seq<org.apache.spark.streaming.scheduler.ReceivedBlockInfo>> streamIdToAllocatedBlocks () { throw new RuntimeException(); }
  // not preceding
  public   AllocatedBlocks (scala.collection.immutable.Map<java.lang.Object, scala.collection.Seq<org.apache.spark.streaming.scheduler.ReceivedBlockInfo>> streamIdToAllocatedBlocks) { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.streaming.scheduler.ReceivedBlockInfo> getBlocksOfStream (int streamId) { throw new RuntimeException(); }
}
