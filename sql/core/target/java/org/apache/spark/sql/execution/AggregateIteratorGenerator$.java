package org.apache.spark.sql.execution;
// no position
/**
 * This function takes an input iterator containing aggregate values and returns an iterator that properly assemble the
 * output row. The result is the concatenation of the aggregate result plus the related group data.
 * <p>
 * @param resultExpressions
 * @param inputSchema
 * @return
 */
public  class AggregateIteratorGenerator$ {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final AggregateIteratorGenerator$ MODULE$ = null;
  public   AggregateIteratorGenerator$ () { throw new RuntimeException(); }
  public  scala.Function1<scala.collection.Iterator<scala.Tuple2<org.apache.spark.sql.catalyst.expressions.Row, org.apache.spark.sql.catalyst.expressions.AggregateFunction>>, scala.collection.Iterator<org.apache.spark.sql.catalyst.expressions.Row>> apply (scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> resultExpressions, scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Attribute> inputSchema) { throw new RuntimeException(); }
}
