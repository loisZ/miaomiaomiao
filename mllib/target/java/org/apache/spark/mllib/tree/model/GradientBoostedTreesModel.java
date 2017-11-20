package org.apache.spark.mllib.tree.model;
/**
 * :: Experimental ::
 * Represents a gradient boosted trees model.
 * <p>
 * @param algo algorithm for the ensemble model, either Classification or Regression
 * @param trees tree ensembles
 * @param treeWeights tree ensemble weights
 */
public  class GradientBoostedTreesModel extends org.apache.spark.mllib.tree.model.TreeEnsembleModel {
  public  scala.Enumeration.Value algo () { throw new RuntimeException(); }
  public  org.apache.spark.mllib.tree.model.DecisionTreeModel[] trees () { throw new RuntimeException(); }
  public  double[] treeWeights () { throw new RuntimeException(); }
  // not preceding
  public   GradientBoostedTreesModel (scala.Enumeration.Value algo, org.apache.spark.mllib.tree.model.DecisionTreeModel[] trees, double[] treeWeights) { throw new RuntimeException(); }
}
