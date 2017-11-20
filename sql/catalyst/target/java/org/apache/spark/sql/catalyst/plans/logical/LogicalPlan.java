package org.apache.spark.sql.catalyst.plans.logical;
public abstract class LogicalPlan extends org.apache.spark.sql.catalyst.plans.QueryPlan<org.apache.spark.sql.catalyst.plans.logical.LogicalPlan> implements org.apache.spark.Logging {
  public   LogicalPlan () { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.plans.logical.Statistics statistics () { throw new RuntimeException(); }
  /**
   * Returns true if this expression and all its children have been resolved to a specific schema
   * and false if it still contains any unresolved placeholders. Implementations of LogicalPlan
   * can override this (e.g.
   * {@link org.apache.spark.sql.catalyst.analysis.UnresolvedRelation UnresolvedRelation}
   * should return <code>false</code>).
   */
  public  boolean resolved () { throw new RuntimeException(); }
  protected  java.lang.String statePrefix () { throw new RuntimeException(); }
  /**
   * Returns true if all its children of this query plan have been resolved.
   */
  public  boolean childrenResolved () { throw new RuntimeException(); }
  /**
   * Returns true when the given logical plan will return the same results as this logical plan.
   * <p>
   * Since its likely undecideable to generally determine if two given plans will produce the same
   * results, it is okay for this function to return false, even if the results are actually
   * the same.  Such behavior will not affect correctness, only the application of performance
   * enhancements like caching.  However, it is not acceptable to return true if the results could
   * possibly be different.
   * <p>
   * By default this function performs a modified version of equality that is tolerant of cosmetic
   * differences like attribute naming and or expression id differences.  Logical operators that
   * can do better should override this function.
   */
  public  boolean sameResult (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan) { throw new RuntimeException(); }
  /** Args that have cleaned such that differences in expression id should not affect equality */
  protected  scala.collection.Seq<java.lang.Object> cleanArgs () { throw new RuntimeException(); }
  /**
   * Optionally resolves the given string to a {@link NamedExpression} using the input from all child
   * nodes of this LogicalPlan. The attribute is expressed as
   * as string in the following form: <code>[scope].AttributeName.[nested].[fields]...</code>.
   */
  public  scala.Option<org.apache.spark.sql.catalyst.expressions.NamedExpression> resolveChildren (java.lang.String name, scala.Function2<java.lang.String, java.lang.String, java.lang.Object> resolver) { throw new RuntimeException(); }
  /**
   * Optionally resolves the given string to a {@link NamedExpression} based on the output of this
   * LogicalPlan. The attribute is expressed as string in the following form:
   * <code>[scope].AttributeName.[nested].[fields]...</code>.
   */
  public  scala.Option<org.apache.spark.sql.catalyst.expressions.NamedExpression> resolve (java.lang.String name, scala.Function2<java.lang.String, java.lang.String, java.lang.Object> resolver) { throw new RuntimeException(); }
  /** Performs attribute resolution given a name and a sequence of possible attributes. */
  protected  scala.Option<org.apache.spark.sql.catalyst.expressions.NamedExpression> resolve (java.lang.String name, scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Attribute> input, scala.Function2<java.lang.String, java.lang.String, java.lang.Object> resolver) { throw new RuntimeException(); }
  /**
   * Given a list of successive nested field accesses, and a based expression, attempt to resolve
   * the actual field lookups on this expression.
   */
  private  org.apache.spark.sql.catalyst.expressions.Expression resolveNesting (scala.collection.immutable.List<java.lang.String> nestedFields, org.apache.spark.sql.catalyst.expressions.Expression expression, scala.Function2<java.lang.String, java.lang.String, java.lang.Object> resolver) { throw new RuntimeException(); }
}
