package org.apache.spark.sql.execution;
// no position
/**
 * :: DeveloperApi ::
 */
public  class RDDConversions {
  static public <A extends scala.Product> org.apache.spark.rdd.RDD<org.apache.spark.sql.catalyst.expressions.Row> productToRowRdd (org.apache.spark.rdd.RDD<A> data, org.apache.spark.sql.catalyst.types.StructType schema) { throw new RuntimeException(); }
}
