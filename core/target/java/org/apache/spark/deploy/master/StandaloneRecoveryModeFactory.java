package org.apache.spark.deploy.master;
/**
 * ::DeveloperApi::
 * <p>
 * Implementation of this class can be plugged in as recovery mode alternative for Spark's
 * Standalone mode.
 * <p>
 */
public abstract class StandaloneRecoveryModeFactory {
  public   StandaloneRecoveryModeFactory (org.apache.spark.SparkConf conf, akka.serialization.Serialization serializer) { throw new RuntimeException(); }
  /**
   * PersistenceEngine defines how the persistent data(Information about worker, driver etc..)
   * is handled for recovery.
   * <p>
   */
  public abstract  org.apache.spark.deploy.master.PersistenceEngine createPersistenceEngine () ;
  /**
   * Create an instance of LeaderAgent that decides who gets elected as master.
   */
  public abstract  org.apache.spark.deploy.master.LeaderElectionAgent createLeaderElectionAgent (org.apache.spark.deploy.master.LeaderElectable master) ;
}
