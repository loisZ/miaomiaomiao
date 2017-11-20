package org.apache.spark.sql.catalyst.analysis;
/** A catalog for looking up user defined functions, used by an {@link Analyzer}. */
public  interface FunctionRegistry {
  public  void registerFunction (java.lang.String name, scala.Function1<scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression>, org.apache.spark.sql.catalyst.expressions.Expression> builder) ;
  public  org.apache.spark.sql.catalyst.expressions.Expression lookupFunction (java.lang.String name, scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> children) ;
}
