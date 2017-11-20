package org.apache.spark;
/**
 * :: DeveloperApi ::
 * The task failed because the executor that it was running on was lost. This may happen because
 * the task crashed the JVM.
 */
public  class ExecutorLostFailure implements org.apache.spark.TaskFailedReason, scala.Product, scala.Serializable {
  public  java.lang.String execId () { throw new RuntimeException(); }
  // not preceding
  public   ExecutorLostFailure (java.lang.String execId) { throw new RuntimeException(); }
  public  java.lang.String toErrorString () { throw new RuntimeException(); }
}
