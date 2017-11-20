package org.apache.spark.sql.catalyst.expressions;
public  class CombineSetsAndSumFunction extends org.apache.spark.sql.catalyst.expressions.AggregateFunction implements scala.Product, scala.Serializable {
  public  org.apache.spark.sql.catalyst.expressions.Expression inputSet () { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.expressions.AggregateExpression base () { throw new RuntimeException(); }
  // not preceding
  public   CombineSetsAndSumFunction (org.apache.spark.sql.catalyst.expressions.Expression inputSet, org.apache.spark.sql.catalyst.expressions.AggregateExpression base) { throw new RuntimeException(); }
  public   CombineSetsAndSumFunction () { throw new RuntimeException(); }
  public  org.apache.spark.util.collection.OpenHashSet<java.lang.Object> seen () { throw new RuntimeException(); }
  public  void update (org.apache.spark.sql.catalyst.expressions.Row input) { throw new RuntimeException(); }
  public  Object eval (org.apache.spark.sql.catalyst.expressions.Row input) { throw new RuntimeException(); }
}
