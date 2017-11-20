package org.apache.spark.streaming.receiver;
/**
 * Generates batches of objects received by a
 * {@link org.apache.spark.streaming.receiver.Receiver} and puts them into appropriately
 * named blocks at regular intervals. This class starts two threads,
 * one to periodically start a new batch and prepare the previous batch of as a block,
 * the other to push the blocks into the block manager.
 */
public  class BlockGenerator extends org.apache.spark.streaming.receiver.RateLimiter implements org.apache.spark.Logging {
  public   BlockGenerator (org.apache.spark.streaming.receiver.BlockGeneratorListener listener, int receiverId, org.apache.spark.SparkConf conf) { throw new RuntimeException(); }
  private  class Block implements scala.Product, scala.Serializable {
    public  org.apache.spark.storage.StreamBlockId id () { throw new RuntimeException(); }
    public  scala.collection.mutable.ArrayBuffer<java.lang.Object> buffer () { throw new RuntimeException(); }
    // not preceding
    public   Block (org.apache.spark.storage.StreamBlockId id, scala.collection.mutable.ArrayBuffer<java.lang.Object> buffer) { throw new RuntimeException(); }
  }
  // no position
  private  class Block extends scala.runtime.AbstractFunction2<org.apache.spark.storage.StreamBlockId, scala.collection.mutable.ArrayBuffer<java.lang.Object>, org.apache.spark.streaming.receiver.BlockGenerator.Block> implements scala.Serializable {
    public   Block () { throw new RuntimeException(); }
  }
  private  org.apache.spark.streaming.util.SystemClock clock () { throw new RuntimeException(); }
  private  long blockInterval () { throw new RuntimeException(); }
  private  org.apache.spark.streaming.util.RecurringTimer blockIntervalTimer () { throw new RuntimeException(); }
  private  int blockQueueSize () { throw new RuntimeException(); }
  private  java.util.concurrent.ArrayBlockingQueue<org.apache.spark.streaming.receiver.BlockGenerator.Block> blocksForPushing () { throw new RuntimeException(); }
  private  java.lang.Thread blockPushingThread () { throw new RuntimeException(); }
  private  scala.collection.mutable.ArrayBuffer<java.lang.Object> currentBuffer () { throw new RuntimeException(); }
  private  boolean stopped () { throw new RuntimeException(); }
  /** Start block generating and pushing threads. */
  public  void start () { throw new RuntimeException(); }
  /** Stop all threads. */
  public  void stop () { throw new RuntimeException(); }
  /**
   * Push a single data item into the buffer. All received data items
   * will be periodically pushed into BlockManager.
   */
  public  void addData (Object data) { throw new RuntimeException(); }
  /**
   * Push a single data item into the buffer. After buffering the data, the
   * <code>BlockGeneratorListener.onAddData</code> callback will be called. All received data items
   * will be periodically pushed into BlockManager.
   */
  public  void addDataWithCallback (Object data, Object metadata) { throw new RuntimeException(); }
  /** Change the buffer to which single records are added to. */
  private  void updateCurrentBuffer (long time) { throw new RuntimeException(); }
  /** Keep pushing blocks to the BlockManager. */
  private  void keepPushingBlocks () { throw new RuntimeException(); }
  private  void reportError (java.lang.String message, java.lang.Throwable t) { throw new RuntimeException(); }
  private  void pushBlock (org.apache.spark.streaming.receiver.BlockGenerator.Block block) { throw new RuntimeException(); }
}
