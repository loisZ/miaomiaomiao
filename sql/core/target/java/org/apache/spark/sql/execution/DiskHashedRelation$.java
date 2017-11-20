package org.apache.spark.sql.execution;
// no position
public  class DiskHashedRelation$ {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final DiskHashedRelation$ MODULE$ = null;
  public   DiskHashedRelation$ () { throw new RuntimeException(); }
  /**
   * Given an input iterator, partitions each row into one of a number of {@link DiskPartition}s
   * and constructors a {@link DiskHashedRelation}.
   * <p>
   * This executes the first phase of external hashing -- using a course-grained hash function
   * to partition the tuples to disk.
   * <p>
   * The block size is approximately set to 64k because that is a good estimate of the average
   * buffer page.
   * <p>
   * @param input the input {@link Iterator} of {@link Row}s
   * @param keyGenerator a {@link Projection} that generates the keys for the input
   * @param size he number of {@link DiskPartition}s
   * @return the constructed {@link DiskHashedRelation}
   */
  public  org.apache.spark.sql.execution.GeneralDiskHashedRelation apply (scala.collection.Iterator<org.apache.spark.sql.catalyst.expressions.Row> input, org.apache.spark.sql.catalyst.expressions.Projection keyGenerator, int size, int blockSize) { throw new RuntimeException(); }
}
