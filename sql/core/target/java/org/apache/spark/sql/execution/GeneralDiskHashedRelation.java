package org.apache.spark.sql.execution;
/**
 * A general implementation of {@link DiskHashedRelation}.
 * <p>
 * @param partitions the disk partitions that we are going to spill to
 */
public final class GeneralDiskHashedRelation implements org.apache.spark.sql.execution.DiskHashedRelation, java.io.Serializable {
  public   GeneralDiskHashedRelation (org.apache.spark.sql.execution.DiskPartition[] partitions) { throw new RuntimeException(); }
  public  scala.collection.Iterator<org.apache.spark.sql.execution.DiskPartition> getIterator () { throw new RuntimeException(); }
  public  void closeAllPartitions () { throw new RuntimeException(); }
}
