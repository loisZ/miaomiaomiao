package org.apache.spark.sql.execution;
public  class SparkLogicalPlan extends org.apache.spark.sql.catalyst.plans.logical.LogicalPlan implements org.apache.spark.sql.catalyst.analysis.MultiInstanceRelation, scala.Product, scala.Serializable {
  public  org.apache.spark.sql.execution.SparkPlan alreadyPlanned () { throw new RuntimeException(); }
  // not preceding
  public   SparkLogicalPlan (org.apache.spark.sql.execution.SparkPlan alreadyPlanned, org.apache.spark.sql.SQLContext sqlContext) { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Attribute> output () { throw new RuntimeException(); }
  public  scala.collection.immutable.Nil$ children () { throw new RuntimeException(); }
  public final  org.apache.spark.sql.execution.SparkLogicalPlan newInstance () { throw new RuntimeException(); }
  public  boolean sameResult (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan) { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.plans.logical.Statistics statistics () { throw new RuntimeException(); }
}
