package org.apache.spark.scheduler;
/**
 * A location that includes both a host and an executor id on that host.
 */
public  class ExecutorCacheTaskLocation implements org.apache.spark.scheduler.TaskLocation, scala.Product, scala.Serializable {
  public  java.lang.String host () { throw new RuntimeException(); }
  public  java.lang.String executorId () { throw new RuntimeException(); }
  // not preceding
  public   ExecutorCacheTaskLocation (java.lang.String host, java.lang.String executorId) { throw new RuntimeException(); }
}
