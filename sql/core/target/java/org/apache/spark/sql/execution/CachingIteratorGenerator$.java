package org.apache.spark.sql.execution;
// no position
public  class CachingIteratorGenerator$ {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final CachingIteratorGenerator$ MODULE$ = null;
  public   CachingIteratorGenerator$ () { throw new RuntimeException(); }
  /**
   * This function takes an input iterator and returns an iterator that does in-memory memoization
   * as it evaluates the projection operator over each input row. The result is the concatenation of
   * the projection of the preUdfExpressions, the evaluation of the udf, and the projection of the
   * postUdfExpressions, in that order.
   * <p>
   * The UDF should only be evaluated if the inputs to the UDF have never been seen before.
   * <p>
   * This method only needs to worry about caching for the UDF that is specifically passed in. If
   * there are any other UDFs in the expression lists, then they can and should be evaluated
   * without any caching.
   * <p>
   * @param cacheKeys the keys on which we will cache -- the inputs to the UDF
   * @param udf the udf we are caching for
   * @param preUdfExpressions the expressions that come before the UDF in the projection
   * @param postUdfExpressions the expressions that come after the UDF in the projection
   * @param inputSchema the schema of the rows -- useful for creating projections
   * @return
   */
  public  scala.Function1<scala.collection.Iterator<org.apache.spark.sql.catalyst.expressions.Row>, scala.collection.Iterator<org.apache.spark.sql.catalyst.expressions.Row>> apply (scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> cacheKeys, org.apache.spark.sql.catalyst.expressions.ScalaUdf udf, scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> preUdfExpressions, scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> postUdfExpressions, scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Attribute> inputSchema) { throw new RuntimeException(); }
}
