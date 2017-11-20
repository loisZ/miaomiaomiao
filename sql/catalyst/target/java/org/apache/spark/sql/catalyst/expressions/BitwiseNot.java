package org.apache.spark.sql.catalyst.expressions;
/**
 * A function that calculates bitwise not(~) of a number.
 */
public  class BitwiseNot extends org.apache.spark.sql.catalyst.expressions.UnaryExpression implements scala.Product, scala.Serializable {
  public  org.apache.spark.sql.catalyst.expressions.Expression child () { throw new RuntimeException(); }
  // not preceding
  public   BitwiseNot (org.apache.spark.sql.catalyst.expressions.Expression child) { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.types.DataType dataType () { throw new RuntimeException(); }
  public  boolean foldable () { throw new RuntimeException(); }
  public  boolean nullable () { throw new RuntimeException(); }
  public  java.lang.String toString () { throw new RuntimeException(); }
  public  Object eval (org.apache.spark.sql.catalyst.expressions.Row input) { throw new RuntimeException(); }
}
