package org.apache.spark.sql.execution;
/**
 * A projection operator that is tailored to improve performance of UDF execution using
 * in-memory memoization.
 * <p>
 * NOTE: This assumes that we are only caching for a single UDF. If there are multiple
 * UDFs, it will only cache for the last UDF. All other UDFs will be executed regularly.
 * <p>
 * Once you have completed implementing the functions in {@link CS143Utils}, this operator
 * should work.
 */
public  class CacheProject extends org.apache.spark.sql.execution.SparkPlan implements org.apache.spark.sql.execution.UnaryNode, scala.Product, scala.Serializable {
  public  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> projectList () { throw new RuntimeException(); }
  public  org.apache.spark.sql.execution.SparkPlan child () { throw new RuntimeException(); }
  // not preceding
  public   CacheProject (scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> projectList, org.apache.spark.sql.execution.SparkPlan child) { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Attribute> output () { throw new RuntimeException(); }
  public  org.apache.spark.rdd.RDD<org.apache.spark.sql.catalyst.expressions.Row> execute () { throw new RuntimeException(); }
}
