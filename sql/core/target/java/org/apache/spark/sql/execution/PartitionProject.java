package org.apache.spark.sql.execution;
/**
 * A projection operator that is tailor to improve performance of UDF execution by using
 * external hashing.
 * <p>
 * @param projectList
 * @param child
 */
public  class PartitionProject extends org.apache.spark.sql.execution.SparkPlan implements org.apache.spark.sql.execution.UnaryNode, scala.Product, scala.Serializable {
  public  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> projectList () { throw new RuntimeException(); }
  public  org.apache.spark.sql.execution.SparkPlan child () { throw new RuntimeException(); }
  // not preceding
  public   PartitionProject (scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> projectList, org.apache.spark.sql.execution.SparkPlan child) { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Attribute> output () { throw new RuntimeException(); }
  public  org.apache.spark.rdd.RDD<org.apache.spark.sql.catalyst.expressions.Row> execute () { throw new RuntimeException(); }
  /**
   * This method takes an iterator as an input. It should first partition the whole input to disk.
   * It should then read each partition from disk and construct do in-memory memoization over each
   * partition to avoid recomputation of UDFs.
   * <p>
   * @param input the input iterator
   * @return the result of applying the projection
   */
  public  scala.collection.Iterator<org.apache.spark.sql.catalyst.expressions.Row> generateIterator (scala.collection.Iterator<org.apache.spark.sql.catalyst.expressions.Row> input) { throw new RuntimeException(); }
}
