package org.apache.spark.sql.catalyst.plans.logical;
/**
 * Commands of the form "SET [key [= value] ]".
 */
public  class SetCommand extends org.apache.spark.sql.catalyst.plans.logical.Command implements scala.Product, scala.Serializable {
  public  scala.Option<scala.Tuple2<java.lang.String, scala.Option<java.lang.String>>> kv () { throw new RuntimeException(); }
  // not preceding
  public   SetCommand (scala.Option<scala.Tuple2<java.lang.String, scala.Option<java.lang.String>>> kv) { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.AttributeReference> output () { throw new RuntimeException(); }
}
