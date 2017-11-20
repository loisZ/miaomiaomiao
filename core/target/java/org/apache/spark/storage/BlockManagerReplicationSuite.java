package org.apache.spark.storage;
/** Testsuite that tests block replication in BlockManager */
public  class BlockManagerReplicationSuite extends org.scalatest.FunSuite implements org.scalatest.Matchers, org.scalatest.BeforeAndAfter {
  public   BlockManagerReplicationSuite () { throw new RuntimeException(); }
  private  org.apache.spark.SparkConf conf () { throw new RuntimeException(); }
  public  akka.actor.ActorSystem actorSystem () { throw new RuntimeException(); }
  public  org.apache.spark.storage.BlockManagerMaster master () { throw new RuntimeException(); }
  public  org.apache.spark.SecurityManager securityMgr () { throw new RuntimeException(); }
  public  org.apache.spark.MapOutputTrackerMaster mapOutputTracker () { throw new RuntimeException(); }
  public  org.apache.spark.shuffle.hash.HashShuffleManager shuffleManager () { throw new RuntimeException(); }
  public  scala.collection.mutable.ArrayBuffer<org.apache.spark.storage.BlockManager> allStores () { throw new RuntimeException(); }
  public  org.apache.spark.serializer.KryoSerializer serializer () { throw new RuntimeException(); }
  public  org.apache.spark.storage.BlockId StringToBlockId (java.lang.String value) { throw new RuntimeException(); }
  private  org.apache.spark.storage.BlockManager makeBlockManager (long maxMem, java.lang.String name) { throw new RuntimeException(); }
  /**
   * Test replication of blocks with different storage levels (various combinations of
   * memory, disk & serialization). For each storage level, this function tests every store
   * whether the block is present and also tests the master whether its knowledge of blocks
   * is correct. Then it also drops the block from memory of each store (using LRU) and
   * again checks whether the master's knowledge gets updated.
   */
  private  void testReplication (int maxReplication, scala.collection.Seq<org.apache.spark.storage.StorageLevel> storageLevels) { throw new RuntimeException(); }
}
