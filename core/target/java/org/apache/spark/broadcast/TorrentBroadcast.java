package org.apache.spark.broadcast;
/**
 * A BitTorrent-like implementation of {@link org.apache.spark.broadcast.Broadcast}.
 * <p>
 * The mechanism is as follows:
 * <p>
 * The driver divides the serialized object into small chunks and
 * stores those chunks in the BlockManager of the driver.
 * <p>
 * On each executor, the executor first attempts to fetch the object from its BlockManager. If
 * it does not exist, it then uses remote fetches to fetch the small chunks from the driver and/or
 * other executors if available. Once it gets the chunks, it puts the chunks in its own
 * BlockManager, ready for other executors to fetch from.
 * <p>
 * This prevents the driver from being the bottleneck in sending out multiple copies of the
 * broadcast data (one per executor) as done by the {@link org.apache.spark.broadcast.HttpBroadcast}.
 * <p>
 * When initialized, TorrentBroadcast objects read SparkEnv.get.conf.
 * <p>
 * @param obj object to broadcast
 * @param id A unique identifier for the broadcast variable.
 */
public  class TorrentBroadcast<T extends java.lang.Object> extends org.apache.spark.broadcast.Broadcast<T> implements org.apache.spark.Logging, java.io.Serializable {
  static public <T extends java.lang.Object> java.nio.ByteBuffer[] blockifyObject (T obj, int blockSize, org.apache.spark.serializer.Serializer serializer, scala.Option<org.apache.spark.io.CompressionCodec> compressionCodec, scala.reflect.ClassTag<T> evidence$2) { throw new RuntimeException(); }
  static public <T extends java.lang.Object> T unBlockifyObject (java.nio.ByteBuffer[] blocks, org.apache.spark.serializer.Serializer serializer, scala.Option<org.apache.spark.io.CompressionCodec> compressionCodec, scala.reflect.ClassTag<T> evidence$3) { throw new RuntimeException(); }
  /**
   * Remove all persisted blocks associated with this torrent broadcast on the executors.
   * If removeFromDriver is true, also remove these persisted blocks on the driver.
   */
  static public  void unpersist (long id, boolean removeFromDriver, boolean blocking) { throw new RuntimeException(); }
  // not preceding
  public   TorrentBroadcast (T obj, long id, scala.reflect.ClassTag<T> evidence$1) { throw new RuntimeException(); }
  /**
   * Value of the broadcast object on executors. This is reconstructed by {@link readBroadcastBlock},
   * which builds this value by reading blocks from the driver and/or other executors.
   * <p>
   * On the driver, if the value is required, it is read lazily from the block manager.
   */
  private  T _value () { throw new RuntimeException(); }
  /** The compression codec to use, or None if compression is disabled */
  private  scala.Option<org.apache.spark.io.CompressionCodec> compressionCodec () { throw new RuntimeException(); }
  /** Size of each block. Default value is 4MB.  This value is only read by the broadcaster. */
  private  int blockSize () { throw new RuntimeException(); }
  private  void setConf (org.apache.spark.SparkConf conf) { throw new RuntimeException(); }
  private  org.apache.spark.storage.BroadcastBlockId broadcastId () { throw new RuntimeException(); }
  /** Total number of blocks this broadcast variable contains. */
  private  int numBlocks () { throw new RuntimeException(); }
  protected  T getValue () { throw new RuntimeException(); }
  /**
   * Divide the object into multiple blocks and put those blocks in the block manager.
   * @param value the object to divide
   * @return number of blocks this broadcast variable is divided into
   */
  private  int writeBlocks (T value) { throw new RuntimeException(); }
  /** Fetch torrent blocks from the driver and/or other executors. */
  private  java.nio.ByteBuffer[] readBlocks () { throw new RuntimeException(); }
  /**
   * Remove all persisted state associated with this Torrent broadcast on the executors.
   */
  protected  void doUnpersist (boolean blocking) { throw new RuntimeException(); }
  /**
   * Remove all persisted state associated with this Torrent broadcast on the executors
   * and driver.
   */
  protected  void doDestroy (boolean blocking) { throw new RuntimeException(); }
  /** Used by the JVM when serializing this object. */
  private  void writeObject (java.io.ObjectOutputStream out) { throw new RuntimeException(); }
  private  T readBroadcastBlock () { throw new RuntimeException(); }
}
