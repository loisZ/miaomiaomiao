package org.apache.spark.streaming.receiver;
/**
 * Implementation of {@link org.apache.spark.streaming.receiver.ReceivedBlockStoreResult}
 * that stores the metadata related to storage of blocks using
 * {@link org.apache.spark.streaming.receiver.BlockManagerBasedBlockHandler}
 */
public  class BlockManagerBasedStoreResult implements org.apache.spark.streaming.receiver.ReceivedBlockStoreResult, scala.Product, scala.Serializable {
  public  org.apache.spark.storage.StreamBlockId blockId () { throw new RuntimeException(); }
  // not preceding
  public   BlockManagerBasedStoreResult (org.apache.spark.storage.StreamBlockId blockId) { throw new RuntimeException(); }
}
