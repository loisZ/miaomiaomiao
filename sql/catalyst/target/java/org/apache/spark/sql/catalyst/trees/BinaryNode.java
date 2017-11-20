package org.apache.spark.sql.catalyst.trees;
/**
 * A {@link TreeNode} that has two children, {@link left} and {@link right}.
 */
public  interface BinaryNode<BaseType extends org.apache.spark.sql.catalyst.trees.TreeNode<BaseType>> {
  public  BaseType left () ;
  public  BaseType right () ;
  public  scala.collection.Seq<BaseType> children () ;
}
