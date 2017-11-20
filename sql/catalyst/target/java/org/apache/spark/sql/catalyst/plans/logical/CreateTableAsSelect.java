package org.apache.spark.sql.catalyst.plans.logical;
public  class CreateTableAsSelect<T extends java.lang.Object> extends org.apache.spark.sql.catalyst.plans.logical.UnaryNode implements scala.Product, scala.Serializable {
  public  scala.Option<java.lang.String> databaseName () { throw new RuntimeException(); }
  public  java.lang.String tableName () { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan child () { throw new RuntimeException(); }
  public  boolean allowExisting () { throw new RuntimeException(); }
  public  scala.Option<T> desc () { throw new RuntimeException(); }
  // not preceding
  public   CreateTableAsSelect (scala.Option<java.lang.String> databaseName, java.lang.String tableName, org.apache.spark.sql.catalyst.plans.logical.LogicalPlan child, boolean allowExisting, scala.Option<T> desc) { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Attribute> output () { throw new RuntimeException(); }
  public  boolean resolved () { throw new RuntimeException(); }
}
