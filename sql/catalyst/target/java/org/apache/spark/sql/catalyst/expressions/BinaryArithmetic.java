package org.apache.spark.sql.catalyst.expressions;
public abstract class BinaryArithmetic extends org.apache.spark.sql.catalyst.expressions.BinaryExpression {
  public   BinaryArithmetic () { throw new RuntimeException(); }
  public  boolean nullable () { throw new RuntimeException(); }
  public  boolean resolved () { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.types.DataType dataType () { throw new RuntimeException(); }
  public  Object eval (org.apache.spark.sql.catalyst.expressions.Row input) { throw new RuntimeException(); }
  public  Object evalInternal (Object evalE1, Object evalE2) { throw new RuntimeException(); }
}
