package org.apache.spark.sql.sources;
public  class CreateTableUsing extends org.apache.spark.sql.catalyst.plans.logical.Command implements org.apache.spark.sql.execution.RunnableCommand, scala.Product, scala.Serializable {
  public  java.lang.String tableName () { throw new RuntimeException(); }
  public  java.lang.String provider () { throw new RuntimeException(); }
  public  scala.collection.immutable.Map<java.lang.String, java.lang.String> options () { throw new RuntimeException(); }
  // not preceding
  public   CreateTableUsing (java.lang.String tableName, java.lang.String provider, scala.collection.immutable.Map<java.lang.String, java.lang.String> options) { throw new RuntimeException(); }
  public  scala.collection.Seq<scala.runtime.Nothing$> run (org.apache.spark.sql.SQLContext sqlContext) { throw new RuntimeException(); }
}
