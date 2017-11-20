package org.apache.spark;
/**
 * A client that communicates with the cluster manager to request or kill executors.
 */
public  interface ExecutorAllocationClient {
  /**
   * Request an additional number of executors from the cluster manager.
   * Return whether the request is acknowledged by the cluster manager.
   */
  public  boolean requestExecutors (int numAdditionalExecutors) ;
  /**
   * Request that the cluster manager kill the specified executors.
   * Return whether the request is acknowledged by the cluster manager.
   */
  public  boolean killExecutors (scala.collection.Seq<java.lang.String> executorIds) ;
  /**
   * Request that the cluster manager kill the specified executor.
   * Return whether the request is acknowledged by the cluster manager.
   */
  public  boolean killExecutor (java.lang.String executorId) ;
}
