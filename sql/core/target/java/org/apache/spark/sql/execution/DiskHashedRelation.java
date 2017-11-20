package org.apache.spark.sql.execution;
/**
 * This trait represents a regular relation that is hash partitioned and spilled to
 * disk.
 */
public  interface DiskHashedRelation {
  /**
   * @return an iterator of the {@link DiskPartition}s that make up this relation.
   */
  public  scala.collection.Iterator<org.apache.spark.sql.execution.DiskPartition> getIterator () ;
  /**
   * Close all the partitions for this relation. This should involve deleting the files hashed into.
   */
  public  void closeAllPartitions () ;
}
