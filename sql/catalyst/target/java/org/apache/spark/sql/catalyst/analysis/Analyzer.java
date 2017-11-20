package org.apache.spark.sql.catalyst.analysis;
/**
 * Provides a logical query plan analyzer, which translates {@link UnresolvedAttribute}s and
 * {@link UnresolvedRelation}s into fully typed objects using information in a schema {@link Catalog} and
 * a {@link FunctionRegistry}.
 */
public  class Analyzer extends org.apache.spark.sql.catalyst.rules.RuleExecutor<org.apache.spark.sql.catalyst.plans.logical.LogicalPlan> implements org.apache.spark.sql.catalyst.analysis.HiveTypeCoercion {
  // no position
  /**
   * Makes sure all attributes and logical plans have been resolved.
   */
  public  class CheckResolution$ extends org.apache.spark.sql.catalyst.rules.Rule<org.apache.spark.sql.catalyst.plans.logical.LogicalPlan> {
    public   CheckResolution$ () { throw new RuntimeException(); }
    public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan apply (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan) { throw new RuntimeException(); }
  }
  // no position
  /**
   * Removes no-op Alias expressions from the plan.
   */
  public  class TrimGroupingAliases$ extends org.apache.spark.sql.catalyst.rules.Rule<org.apache.spark.sql.catalyst.plans.logical.LogicalPlan> {
    public   TrimGroupingAliases$ () { throw new RuntimeException(); }
    public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan apply (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan) { throw new RuntimeException(); }
  }
  // no position
  public  class ResolveGroupingAnalytics$ extends org.apache.spark.sql.catalyst.rules.Rule<org.apache.spark.sql.catalyst.plans.logical.LogicalPlan> {
    public   ResolveGroupingAnalytics$ () { throw new RuntimeException(); }
    /**
     * Extract attribute set according to the grouping id
     * @param bitmask bitmask to represent the selected of the attribute sequence
     * @param exprs the attributes in sequence
     * @return the attributes of non selected specified via bitmask (with the bit set to 1)
     */
    private  org.apache.spark.util.collection.OpenHashSet<org.apache.spark.sql.catalyst.expressions.Expression> buildNonSelectExprSet (int bitmask, scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> exprs) { throw new RuntimeException(); }
    public  scala.collection.Seq<java.lang.Object> bitmasks (org.apache.spark.sql.catalyst.plans.logical.Rollup r) { throw new RuntimeException(); }
    public  scala.collection.Seq<java.lang.Object> bitmasks (org.apache.spark.sql.catalyst.plans.logical.Cube c) { throw new RuntimeException(); }
    /**
     * Create an array of Projections for the child projection, and replace the projections'
     * expressions which equal GroupBy expressions with Literal(null), if those expressions
     * are not set for this grouping set (according to the bit mask).
     */
    private  scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.GroupExpression> expand (org.apache.spark.sql.catalyst.plans.logical.GroupingSets g) { throw new RuntimeException(); }
    public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan apply (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan) { throw new RuntimeException(); }
  }
  // no position
  /**
   * Checks for non-aggregated attributes with aggregation
   */
  public  class CheckAggregation$ extends org.apache.spark.sql.catalyst.rules.Rule<org.apache.spark.sql.catalyst.plans.logical.LogicalPlan> {
    public   CheckAggregation$ () { throw new RuntimeException(); }
    public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan apply (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan) { throw new RuntimeException(); }
  }
  // no position
  /**
   * Replaces {@link UnresolvedRelation}s with concrete relations from the catalog.
   */
  public  class ResolveRelations$ extends org.apache.spark.sql.catalyst.rules.Rule<org.apache.spark.sql.catalyst.plans.logical.LogicalPlan> {
    public   ResolveRelations$ () { throw new RuntimeException(); }
    public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan apply (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan) { throw new RuntimeException(); }
  }
  // no position
  /**
   * Replaces {@link UnresolvedAttribute}s with concrete
   * {@link catalyst.expressions.AttributeReference AttributeReferences} from a logical plan node's
   * children.
   */
  public  class ResolveReferences$ extends org.apache.spark.sql.catalyst.rules.Rule<org.apache.spark.sql.catalyst.plans.logical.LogicalPlan> {
    public   ResolveReferences$ () { throw new RuntimeException(); }
    public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan apply (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan) { throw new RuntimeException(); }
    /**
     * Returns true if <code>exprs</code> contains a {@link Star}.
     */
    protected  boolean containsStar (scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> exprs) { throw new RuntimeException(); }
  }
  // no position
  /**
   * In many dialects of SQL is it valid to sort by attributes that are not present in the SELECT
   * clause.  This rule detects such queries and adds the required attributes to the original
   * projection, so that they will be available during sorting. Another projection is added to
   * remove these attributes after sorting.
   */
  public  class ResolveSortReferences$ extends org.apache.spark.sql.catalyst.rules.Rule<org.apache.spark.sql.catalyst.plans.logical.LogicalPlan> {
    public   ResolveSortReferences$ () { throw new RuntimeException(); }
    public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan apply (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan) { throw new RuntimeException(); }
  }
  // no position
  /**
   * Replaces {@link UnresolvedFunction}s with concrete {@link catalyst.expressions.Expression Expressions}.
   */
  public  class ResolveFunctions$ extends org.apache.spark.sql.catalyst.rules.Rule<org.apache.spark.sql.catalyst.plans.logical.LogicalPlan> {
    public   ResolveFunctions$ () { throw new RuntimeException(); }
    public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan apply (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan) { throw new RuntimeException(); }
  }
  // no position
  /**
   * Turns projections that contain aggregate expressions into aggregations.
   */
  public  class GlobalAggregates$ extends org.apache.spark.sql.catalyst.rules.Rule<org.apache.spark.sql.catalyst.plans.logical.LogicalPlan> {
    public   GlobalAggregates$ () { throw new RuntimeException(); }
    public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan apply (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan) { throw new RuntimeException(); }
    public  boolean containsAggregates (scala.collection.Seq<org.apache.spark.sql.catalyst.expressions.Expression> exprs) { throw new RuntimeException(); }
  }
  // no position
  /**
   * This rule finds expressions in HAVING clause filters that depend on
   * unresolved attributes.  It pushes these expressions down to the underlying
   * aggregates and then projects them away above the filter.
   */
  public  class UnresolvedHavingClauseAttributes$ extends org.apache.spark.sql.catalyst.rules.Rule<org.apache.spark.sql.catalyst.plans.logical.LogicalPlan> {
    public   UnresolvedHavingClauseAttributes$ () { throw new RuntimeException(); }
    public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan apply (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan) { throw new RuntimeException(); }
    protected  boolean containsAggregate (org.apache.spark.sql.catalyst.expressions.Expression condition) { throw new RuntimeException(); }
  }
  // no position
  /**
   * When a SELECT clause has only a single expression and that expression is a
   * {@link catalyst.expressions.Generator Generator} we convert the
   * {@link catalyst.plans.logical.Project Project} to a {@link catalyst.plans.logical.Generate Generate}.
   */
  public  class ImplicitGenerate$ extends org.apache.spark.sql.catalyst.rules.Rule<org.apache.spark.sql.catalyst.plans.logical.LogicalPlan> {
    public   ImplicitGenerate$ () { throw new RuntimeException(); }
    public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan apply (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan) { throw new RuntimeException(); }
  }
  public   Analyzer (org.apache.spark.sql.catalyst.analysis.Catalog catalog, org.apache.spark.sql.catalyst.analysis.FunctionRegistry registry, boolean caseSensitive, int maxIterations) { throw new RuntimeException(); }
  public  scala.Function2<java.lang.String, java.lang.String, java.lang.Object> resolver () { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.rules.RuleExecutor<org.apache.spark.sql.catalyst.plans.logical.LogicalPlan>.FixedPoint fixedPoint () { throw new RuntimeException(); }
  /**
   * Override to provide additional rules for the "Resolution" batch.
   */
  public  scala.collection.Seq<org.apache.spark.sql.catalyst.rules.Rule<org.apache.spark.sql.catalyst.plans.logical.LogicalPlan>> extendedRules () { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.sql.catalyst.rules.RuleExecutor<org.apache.spark.sql.catalyst.plans.logical.LogicalPlan>.Batch> batches () { throw new RuntimeException(); }
  /**
   * Accessor for nested Scala object
   */
  public  org.apache.spark.sql.catalyst.analysis.Analyzer.CheckResolution$ CheckResolution () { throw new RuntimeException(); }
  /**
   * Accessor for nested Scala object
   */
  public  org.apache.spark.sql.catalyst.analysis.Analyzer.TrimGroupingAliases$ TrimGroupingAliases () { throw new RuntimeException(); }
  /**
   * Accessor for nested Scala object
   */
  public  org.apache.spark.sql.catalyst.analysis.Analyzer.ResolveGroupingAnalytics$ ResolveGroupingAnalytics () { throw new RuntimeException(); }
  /**
   * Accessor for nested Scala object
   */
  public  org.apache.spark.sql.catalyst.analysis.Analyzer.CheckAggregation$ CheckAggregation () { throw new RuntimeException(); }
  /**
   * Accessor for nested Scala object
   */
  public  org.apache.spark.sql.catalyst.analysis.Analyzer.ResolveRelations$ ResolveRelations () { throw new RuntimeException(); }
  /**
   * Accessor for nested Scala object
   */
  public  org.apache.spark.sql.catalyst.analysis.Analyzer.ResolveReferences$ ResolveReferences () { throw new RuntimeException(); }
  /**
   * Accessor for nested Scala object
   */
  public  org.apache.spark.sql.catalyst.analysis.Analyzer.ResolveSortReferences$ ResolveSortReferences () { throw new RuntimeException(); }
  /**
   * Accessor for nested Scala object
   */
  public  org.apache.spark.sql.catalyst.analysis.Analyzer.ResolveFunctions$ ResolveFunctions () { throw new RuntimeException(); }
  /**
   * Accessor for nested Scala object
   */
  public  org.apache.spark.sql.catalyst.analysis.Analyzer.GlobalAggregates$ GlobalAggregates () { throw new RuntimeException(); }
  /**
   * Accessor for nested Scala object
   */
  public  org.apache.spark.sql.catalyst.analysis.Analyzer.UnresolvedHavingClauseAttributes$ UnresolvedHavingClauseAttributes () { throw new RuntimeException(); }
  /**
   * Accessor for nested Scala object
   */
  public  org.apache.spark.sql.catalyst.analysis.Analyzer.ImplicitGenerate$ ImplicitGenerate () { throw new RuntimeException(); }
}
