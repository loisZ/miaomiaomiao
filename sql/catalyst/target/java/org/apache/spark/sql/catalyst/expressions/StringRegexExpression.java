package org.apache.spark.sql.catalyst.expressions;
public  interface StringRegexExpression {
  public  java.lang.String escape (java.lang.String v) ;
  public  boolean matches (java.util.regex.Pattern regex, java.lang.String str) ;
  public  boolean nullable () ;
  public  org.apache.spark.sql.catalyst.types.DataType dataType () ;
  public  java.util.regex.Pattern cache () ;
  public  java.util.regex.Pattern compile (java.lang.String str) ;
  public  java.util.regex.Pattern pattern (java.lang.String str) ;
  public  Object eval (org.apache.spark.sql.catalyst.expressions.Row input) ;
}
