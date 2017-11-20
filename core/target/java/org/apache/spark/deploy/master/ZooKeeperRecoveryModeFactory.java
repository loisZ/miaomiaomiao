package org.apache.spark.deploy.master;
public  class ZooKeeperRecoveryModeFactory extends org.apache.spark.deploy.master.StandaloneRecoveryModeFactory {
  public   ZooKeeperRecoveryModeFactory (org.apache.spark.SparkConf conf, akka.serialization.Serialization serializer) { throw new RuntimeException(); }
  public  org.apache.spark.deploy.master.ZooKeeperPersistenceEngine createPersistenceEngine () { throw new RuntimeException(); }
  public  org.apache.spark.deploy.master.ZooKeeperLeaderElectionAgent createLeaderElectionAgent (org.apache.spark.deploy.master.LeaderElectable master) { throw new RuntimeException(); }
}
