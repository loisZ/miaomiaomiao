package org.apache.spark.deploy.master;
/** Single-node implementation of LeaderElectionAgent -- we're initially and always the leader. */
public  class MonarchyLeaderAgent implements org.apache.spark.deploy.master.LeaderElectionAgent {
  public  org.apache.spark.deploy.master.LeaderElectable masterActor () { throw new RuntimeException(); }
  // not preceding
  public   MonarchyLeaderAgent (org.apache.spark.deploy.master.LeaderElectable masterActor) { throw new RuntimeException(); }
}
