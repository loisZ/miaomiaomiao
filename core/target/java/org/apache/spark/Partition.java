package org.apache.spark;
/**
 * An identifier for a partition in an RDD.
 */
public  interface Partition extends scala.Serializable {
  /**
   * Get the partition's index within its parent RDD
   */
  public  int index () ;
  public  int hashCode () ;
}
