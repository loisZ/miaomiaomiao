package org.apache.spark.sql.catalyst.trees;
/**
 * A {@link TreeNode} with a single {@link child}.
 */
public  interface UnaryNode<BaseType extends org.apache.spark.sql.catalyst.trees.TreeNode<BaseType>> {
  public  BaseType child () ;
  public  scala.collection.immutable.List<BaseType> children () ;
}
