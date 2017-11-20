package org.apache.spark.sql.catalyst.planning;
/**
 * Given a {@link plans.logical.LogicalPlan LogicalPlan}, returns a list of <code>PhysicalPlan</code>s that can
 * be used for execution. If this strategy does not apply to the give logical operation then an
 * empty list should be returned.
 */
public abstract class GenericStrategy<PhysicalPlan extends org.apache.spark.sql.catalyst.trees.TreeNode<PhysicalPlan>> implements org.apache.spark.Logging {
  // not preceding
  // TypeTree().setOriginal(TypeBoundsTree(TypeTree().setOriginal(Select(Select(Ident(_root_), scala), scala.Nothing)), TypeTree().setOriginal(AppliedTypeTree(Select(Select(Select(Select(Select(Select(Ident(org), org.apache), org.apache.spark), org.apache.spark.sql), org.apache.spark.sql.catalyst), org.apache.spark.sql.catalyst.trees), org.apache.spark.sql.catalyst.trees.TreeNode), List(TypeTree().setOriginal(Ident(newTypeName("PhysicalPlan"))))))))
  public   GenericStrategy () { throw new RuntimeException(); }
  public abstract  scala.collection.Seq<PhysicalPlan> apply (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan) ;
}
