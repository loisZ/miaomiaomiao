package org.apache.spark.sql.catalyst.expressions;
/**
 * A function that get the absolute value of the numeric value.
 */
public  class Abs extends org.apache.spark.sql.catalyst.expressions.UnaryExpression implements scala.Product, scala.Serializable {
  public  org.apache.spark.sql.catalyst.expressions.Expression child () { throw new RuntimeException(); }
  // not preceding
  public   Abs (org.apache.spark.sql.catalyst.expressions.Expression child) { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.types.DataType dataType () { throw new RuntimeException(); }
  public  boolean foldable () { throw new RuntimeException(); }
  public  boolean nullable () { throw new RuntimeException(); }
  public  java.lang.String toString () { throw new RuntimeException(); }
  public  Object eval (org.apache.spark.sql.catalyst.expressions.Row input) { throw new RuntimeException(); }
}
