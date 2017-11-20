package org.apache.spark.deploy.master;
/**
 * LeaderAgent in this case is a no-op. Since leader is forever leader as the actual
 * recovery is made by restoring from filesystem.
 */
public  class FileSystemRecoveryModeFactory extends org.apache.spark.deploy.master.StandaloneRecoveryModeFactory implements org.apache.spark.Logging {
  public   FileSystemRecoveryModeFactory (org.apache.spark.SparkConf conf, akka.serialization.Serialization serializer) { throw new RuntimeException(); }
  public  java.lang.String RECOVERY_DIR () { throw new RuntimeException(); }
  public  org.apache.spark.deploy.master.FileSystemPersistenceEngine createPersistenceEngine () { throw new RuntimeException(); }
  public  org.apache.spark.deploy.master.MonarchyLeaderAgent createLeaderElectionAgent (org.apache.spark.deploy.master.LeaderElectable master) { throw new RuntimeException(); }
}
