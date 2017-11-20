package org.apache.spark.sql.catalyst.expressions;
public  interface PredicateHelper {
  public  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> splitConjunctivePredicates (org.apache.spark.sql.catalyst.expressions.Expression condition) ;
  public  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> splitDisjunctivePredicates (org.apache.spark.sql.catalyst.expressions.Expression condition) ;
  /**
   * Returns true if <code>expr</code> can be evaluated using only the output of <code>plan</code>.  This method
   * can be used to determine when is is acceptable to move expression evaluation within a query
   * plan.
   * <p>
   * For example consider a join between two relations R(a, b) and S(c, d).
   * <p>
   * <code>canEvaluate(EqualTo(a,b), R)</code> returns <code>true</code> where as <code>canEvaluate(EqualTo(a,c), R)</code> returns
   * <code>false</code>.
   */
  public  boolean canEvaluate (org.apache.spark.sql.catalyst.expressions.Expression expr, org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan) ;
}
