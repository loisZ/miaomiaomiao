package org.apache.spark.executor;
/**
 * :: DeveloperApi ::
 * Metrics about writing output data.
 */
public  class OutputMetrics implements scala.Product, scala.Serializable {
  public  scala.Enumeration.Value writeMethod () { throw new RuntimeException(); }
  // not preceding
  public   OutputMetrics (scala.Enumeration.Value writeMethod) { throw new RuntimeException(); }
  /**
   * Total bytes written
   */
  public  long bytesWritten () { throw new RuntimeException(); }
}
