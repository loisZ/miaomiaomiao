package org.apache.spark.sql.execution;
public  class ExistingRdd extends org.apache.spark.sql.execution.SparkPlan implements org.apache.spark.sql.execution.LeafNode, scala.Product, scala.Serializable {
  public  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Attribute> output () { throw new RuntimeException(); }
  public  org.apache.spark.rdd.RDD<org.apache.spark.sql.catalyst.expressions.Row> rdd () { throw new RuntimeException(); }
  // not preceding
  public   ExistingRdd (scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Attribute> output, org.apache.spark.rdd.RDD<org.apache.spark.sql.catalyst.expressions.Row> rdd) { throw new RuntimeException(); }
  public  org.apache.spark.rdd.RDD<org.apache.spark.sql.catalyst.expressions.Row> execute () { throw new RuntimeException(); }
}
