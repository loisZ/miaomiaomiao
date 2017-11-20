package org.apache.spark.mllib.tree.model;
/**
 * :: Experimental ::
 * Represents a random forest model.
 * <p>
 * @param algo algorithm for the ensemble model, either Classification or Regression
 * @param trees tree ensembles
 */
public  class RandomForestModel extends org.apache.spark.mllib.tree.model.TreeEnsembleModel {
  public  scala.Enumeration.Value algo () { throw new RuntimeException(); }
  public  org.apache.spark.mllib.tree.model.DecisionTreeModel[] trees () { throw new RuntimeException(); }
  // not preceding
  public   RandomForestModel (scala.Enumeration.Value algo, org.apache.spark.mllib.tree.model.DecisionTreeModel[] trees) { throw new RuntimeException(); }
}
