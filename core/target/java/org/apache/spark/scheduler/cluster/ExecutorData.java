package org.apache.spark.scheduler.cluster;
/**
 * Grouping of data for an executor used by CoarseGrainedSchedulerBackend.
 * <p>
 * @param executorActor The ActorRef representing this executor
 * @param executorAddress The network address of this executor
 * @param executorHost The hostname that this executor is running on
 * @param freeCores  The current number of cores available for work on the executor
 * @param totalCores The total number of cores available to the executor
 */
public  class ExecutorData {
  public  akka.actor.ActorRef executorActor () { throw new RuntimeException(); }
  public  akka.actor.Address executorAddress () { throw new RuntimeException(); }
  public  java.lang.String executorHost () { throw new RuntimeException(); }
  public  int freeCores () { throw new RuntimeException(); }
  public  int totalCores () { throw new RuntimeException(); }
  // not preceding
  public   ExecutorData (akka.actor.ActorRef executorActor, akka.actor.Address executorAddress, java.lang.String executorHost, int freeCores, int totalCores) { throw new RuntimeException(); }
}
