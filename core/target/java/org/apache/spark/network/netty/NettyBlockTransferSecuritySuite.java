package org.apache.spark.network.netty;
public  class NettyBlockTransferSecuritySuite extends org.scalatest.FunSuite implements org.scalatest.mock.MockitoSugar, org.scalatest.matchers.ShouldMatchers {
  public   NettyBlockTransferSecuritySuite () { throw new RuntimeException(); }
  /**
   * Creates two servers with different configurations and sees if they can talk.
   * Returns Success() if they can transfer a block, and Failure() if the block transfer was failed
   * properly. We will throw an out-of-band exception if something other than that goes wrong.
   */
  private  scala.util.Try<scala.runtime.BoxedUnit> testConnection (org.apache.spark.SparkConf conf0, org.apache.spark.SparkConf conf1) { throw new RuntimeException(); }
  /** Synchronously fetches a single block, acting as the given executor fetching from another. */
  private  scala.util.Try<org.apache.spark.network.buffer.ManagedBuffer> fetchBlock (org.apache.spark.network.BlockTransferService self, org.apache.spark.network.BlockTransferService from, java.lang.String execId, org.apache.spark.storage.BlockId blockId) { throw new RuntimeException(); }
}
