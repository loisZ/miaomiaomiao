package org.apache.spark.shuffle;
public  interface ShuffleBlockManager {
  /**
   * Get shuffle block data managed by the local ShuffleBlockManager.
   * @return Some(ByteBuffer) if block found, otherwise None.
   */
  public  scala.Option<java.nio.ByteBuffer> getBytes (org.apache.spark.storage.ShuffleBlockId blockId) ;
  public  org.apache.spark.network.buffer.ManagedBuffer getBlockData (org.apache.spark.storage.ShuffleBlockId blockId) ;
  public  void stop () ;
}
