package org.apache.spark.sql.test;
// no position
/** A SQLContext that can be used for local testing. */
public  class TestSQLContext extends org.apache.spark.sql.SQLContext {
  /** Fewer partitions to speed up testing. */
  static public  int numShufflePartitions () { throw new RuntimeException(); }
}
