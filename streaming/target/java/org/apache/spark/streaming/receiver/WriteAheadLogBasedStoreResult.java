package org.apache.spark.streaming.receiver;
/**
 * Implementation of {@link org.apache.spark.streaming.receiver.ReceivedBlockStoreResult}
 * that stores the metadata related to storage of blocks using
 * {@link org.apache.spark.streaming.receiver.WriteAheadLogBasedBlockHandler}
 */
public  class WriteAheadLogBasedStoreResult implements org.apache.spark.streaming.receiver.ReceivedBlockStoreResult, scala.Product, scala.Serializable {
  public  org.apache.spark.storage.StreamBlockId blockId () { throw new RuntimeException(); }
  public  org.apache.spark.streaming.util.WriteAheadLogFileSegment segment () { throw new RuntimeException(); }
  // not preceding
  public   WriteAheadLogBasedStoreResult (org.apache.spark.storage.StreamBlockId blockId, org.apache.spark.streaming.util.WriteAheadLogFileSegment segment) { throw new RuntimeException(); }
}
