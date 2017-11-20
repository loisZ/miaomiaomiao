package org.apache.spark.sql.catalyst.optimizer;
// no position
/**
 * Replaces {@link In (value, seq[Literal])} with optimized version{@link InSet (value, HashSet[Literal])}
 * which is much faster
 */
public  class OptimizeIn extends org.apache.spark.sql.catalyst.rules.Rule<org.apache.spark.sql.catalyst.plans.logical.LogicalPlan> {
  static public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan apply (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan) { throw new RuntimeException(); }
}
