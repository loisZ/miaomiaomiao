package org.apache.spark.sql.catalyst.expressions;
public  interface CaseConversionExpression {
  public  java.lang.String convert (java.lang.String v) ;
  public  boolean foldable () ;
  public  boolean nullable () ;
  public  org.apache.spark.sql.catalyst.types.DataType dataType () ;
  public  Object eval (org.apache.spark.sql.catalyst.expressions.Row input) ;
}
