package org.apache.spark.sql.catalyst.plans.logical;
/**
 * Apply the all of the GroupExpressions to every input row, hence we will get
 * multiple output rows for a input row.
 * @param projections The group of expressions, all of the group expressions should
 *                    output the same schema specified by the parameter <code>output</code>
 * @param output      The output Schema
 * @param child       Child operator
 */
public  class Expand extends org.apache.spark.sql.catalyst.plans.logical.UnaryNode implements scala.Product, scala.Serializable {
  public  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.GroupExpression> projections () { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Attribute> output () { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan child () { throw new RuntimeException(); }
  // not preceding
  public   Expand (scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.GroupExpression> projections, scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Attribute> output, org.apache.spark.sql.catalyst.plans.logical.LogicalPlan child) { throw new RuntimeException(); }
}
