package org.apache.spark.sql.catalyst.expressions;
/**
 * Optimized version of In clause, when all filter values of In clause are
 * static.
 */
public  class InSet extends org.apache.spark.sql.catalyst.expressions.Expression implements org.apache.spark.sql.catalyst.expressions.Predicate, scala.Product, scala.Serializable {
  public  org.apache.spark.sql.catalyst.expressions.Expression value () { throw new RuntimeException(); }
  public  scala.collection.immutable.Set<java.lang.Object> hset () { throw new RuntimeException(); }
  // not preceding
  public   InSet (org.apache.spark.sql.catalyst.expressions.Expression value, scala.collection.immutable.Set<java.lang.Object> hset) { throw new RuntimeException(); }
  public  scala.collection.immutable.List<org.apache.spark.sql.catalyst.expressions.Expression> children () { throw new RuntimeException(); }
  public  boolean nullable () { throw new RuntimeException(); }
  public  java.lang.String toString () { throw new RuntimeException(); }
  public  Object eval (org.apache.spark.sql.catalyst.expressions.Row input) { throw new RuntimeException(); }
}
