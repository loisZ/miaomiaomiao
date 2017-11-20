package org.apache.spark.network.nio;
/**
 * A {@link BlockTransferService} implementation based on {@link ConnectionManager}, a custom
 * implementation using Java NIO.
 */
public final class NioBlockTransferService extends org.apache.spark.network.BlockTransferService implements org.apache.spark.Logging {
  public   NioBlockTransferService (org.apache.spark.SparkConf conf, org.apache.spark.SecurityManager securityManager) { throw new RuntimeException(); }
  private  org.apache.spark.network.nio.ConnectionManager cm () { throw new RuntimeException(); }
  private  org.apache.spark.network.BlockDataManager blockDataManager () { throw new RuntimeException(); }
  /**
   * Port number the service is listening on, available only after {@link init} is invoked.
   */
  public  int port () { throw new RuntimeException(); }
  /**
   * Host name the service is listening on, available only after {@link init} is invoked.
   */
  public  java.lang.String hostName () { throw new RuntimeException(); }
  /**
   * Initialize the transfer service by giving it the BlockDataManager that can be used to fetch
   * local blocks or put local blocks.
   */
  public  void init (org.apache.spark.network.BlockDataManager blockDataManager) { throw new RuntimeException(); }
  /**
   * Tear down the transfer service.
   */
  public  void close () { throw new RuntimeException(); }
  public  void fetchBlocks (java.lang.String host, int port, java.lang.String execId, java.lang.String[] blockIds, org.apache.spark.network.shuffle.BlockFetchingListener listener) { throw new RuntimeException(); }
  /**
   * Upload a single block to a remote node, available only after {@link init} is invoked.
   * <p>
   * This call blocks until the upload completes, or throws an exception upon failures.
   */
  public  scala.concurrent.Future<scala.runtime.BoxedUnit> uploadBlock (java.lang.String hostname, int port, java.lang.String execId, org.apache.spark.storage.BlockId blockId, org.apache.spark.network.buffer.ManagedBuffer blockData, org.apache.spark.storage.StorageLevel level) { throw new RuntimeException(); }
  private  void checkInit () { throw new RuntimeException(); }
  private  scala.Option<org.apache.spark.network.nio.Message> onBlockMessageReceive (org.apache.spark.network.nio.Message msg, org.apache.spark.network.nio.ConnectionManagerId id) { throw new RuntimeException(); }
  private  scala.Option<org.apache.spark.network.nio.BlockMessage> processBlockMessage (org.apache.spark.network.nio.BlockMessage blockMessage) { throw new RuntimeException(); }
  private  void putBlock (org.apache.spark.storage.BlockId blockId, java.nio.ByteBuffer bytes, org.apache.spark.storage.StorageLevel level) { throw new RuntimeException(); }
  private  java.nio.ByteBuffer getBlock (org.apache.spark.storage.BlockId blockId) { throw new RuntimeException(); }
}
