package org.apache.spark.sql.catalyst.expressions;
/** Create a Decimal from an unscaled Long value */
public  class MakeDecimal extends org.apache.spark.sql.catalyst.expressions.UnaryExpression implements scala.Product, scala.Serializable {
  public  org.apache.spark.sql.catalyst.expressions.Expression child () { throw new RuntimeException(); }
  public  int precision () { throw new RuntimeException(); }
  public  int scale () { throw new RuntimeException(); }
  // not preceding
  public   MakeDecimal (org.apache.spark.sql.catalyst.expressions.Expression child, int precision, int scale) { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.types.DataType dataType () { throw new RuntimeException(); }
  public  boolean foldable () { throw new RuntimeException(); }
  public  boolean nullable () { throw new RuntimeException(); }
  public  java.lang.String toString () { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.types.decimal.Decimal eval (org.apache.spark.sql.catalyst.expressions.Row input) { throw new RuntimeException(); }
}
