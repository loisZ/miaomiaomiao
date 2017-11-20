package org.apache.spark.sql.catalyst.expressions;
/**
 * Returns an Array containing the evaluation of all children expressions.
 */
public  class CreateArray extends org.apache.spark.sql.catalyst.expressions.Expression implements scala.Product, scala.Serializable {
  public  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> children () { throw new RuntimeException(); }
  // not preceding
  public   CreateArray (scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> children) { throw new RuntimeException(); }
  public  boolean foldable () { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.sql.catalyst.types.DataType> childTypes () { throw new RuntimeException(); }
  public  boolean resolved () { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.types.DataType dataType () { throw new RuntimeException(); }
  public  boolean nullable () { throw new RuntimeException(); }
  public  Object eval (org.apache.spark.sql.catalyst.expressions.Row input) { throw new RuntimeException(); }
  public  java.lang.String toString () { throw new RuntimeException(); }
}
