package org.apache.spark.network.netty;
/**
 * A BlockTransferService that uses Netty to fetch a set of blocks at at time.
 */
public  class NettyBlockTransferService extends org.apache.spark.network.BlockTransferService {
  public   NettyBlockTransferService (org.apache.spark.SparkConf conf, org.apache.spark.SecurityManager securityManager, int numCores) { throw new RuntimeException(); }
  private  org.apache.spark.serializer.JavaSerializer serializer () { throw new RuntimeException(); }
  private  boolean authEnabled () { throw new RuntimeException(); }
  private  org.apache.spark.network.util.TransportConf transportConf () { throw new RuntimeException(); }
  public  void init (org.apache.spark.network.BlockDataManager blockDataManager) { throw new RuntimeException(); }
  public  void fetchBlocks (java.lang.String host, int port, java.lang.String execId, java.lang.String[] blockIds, org.apache.spark.network.shuffle.BlockFetchingListener listener) { throw new RuntimeException(); }
  public  java.lang.String hostName () { throw new RuntimeException(); }
  public  int port () { throw new RuntimeException(); }
  public  scala.concurrent.Future<scala.runtime.BoxedUnit> uploadBlock (java.lang.String hostname, int port, java.lang.String execId, org.apache.spark.storage.BlockId blockId, org.apache.spark.network.buffer.ManagedBuffer blockData, org.apache.spark.storage.StorageLevel level) { throw new RuntimeException(); }
  public  void close () { throw new RuntimeException(); }
}
