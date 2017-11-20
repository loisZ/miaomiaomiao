package org.apache.spark.sql.catalyst.plans.logical;
/**
 * Rollup is a syntactic sugar for GROUPING SETS, and will be transformed to GroupingSets,
 * and eventually will be transformed to Aggregate(.., Expand) in Analyzer
 * <p>
 * @param groupByExprs The Group By expressions candidates, take effective only if the
 *                     associated bit in the bitmask set to 1.
 * @param child        Child operator
 * @param aggregations The Aggregation expressions, those non selected group by expressions
 *                     will be considered as constant null if it appears in the expressions
 * @param gid          The attribute represents the virtual column GROUPING__ID, and it's also
 *                     the bitmask indicates the selected GroupBy Expressions for each
 *                     aggregating output row.
 */
public  class Rollup extends org.apache.spark.sql.catalyst.plans.logical.UnaryNode implements org.apache.spark.sql.catalyst.plans.logical.GroupingAnalytics, scala.Product, scala.Serializable {
  public  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> groupByExprs () { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan child () { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.NamedExpression> aggregations () { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.expressions.AttributeReference gid () { throw new RuntimeException(); }
  // not preceding
  public   Rollup (scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> groupByExprs, org.apache.spark.sql.catalyst.plans.logical.LogicalPlan child, scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.NamedExpression> aggregations, org.apache.spark.sql.catalyst.expressions.AttributeReference gid) { throw new RuntimeException(); }
}
