package org.apache.spark.mllib.tree.model;
/**
 * Represents a tree ensemble model.
 * <p>
 * @param algo algorithm for the ensemble model, either Classification or Regression
 * @param trees tree ensembles
 * @param treeWeights tree ensemble weights
 * @param combiningStrategy strategy for combining the predictions, not used for regression.
 */
public  class TreeEnsembleModel implements scala.Serializable {
  protected  scala.Enumeration.Value algo () { throw new RuntimeException(); }
  protected  org.apache.spark.mllib.tree.model.DecisionTreeModel[] trees () { throw new RuntimeException(); }
  protected  double[] treeWeights () { throw new RuntimeException(); }
  protected  scala.Enumeration.Value combiningStrategy () { throw new RuntimeException(); }
  // not preceding
  public   TreeEnsembleModel (scala.Enumeration.Value algo, org.apache.spark.mllib.tree.model.DecisionTreeModel[] trees, double[] treeWeights, scala.Enumeration.Value combiningStrategy) { throw new RuntimeException(); }
  private  double sumWeights () { throw new RuntimeException(); }
  /**
   * Predicts for a single data point using the weighted sum of ensemble predictions.
   * <p>
   * @param features array representing a single data point
   * @return predicted category from the trained model
   */
  private  double predictBySumming (org.apache.spark.mllib.linalg.Vector features) { throw new RuntimeException(); }
  /**
   * Classifies a single data point based on (weighted) majority votes.
   */
  private  double predictByVoting (org.apache.spark.mllib.linalg.Vector features) { throw new RuntimeException(); }
  /**
   * Predict values for a single data point using the model trained.
   * <p>
   * @param features array representing a single data point
   * @return predicted category from the trained model
   */
  public  double predict (org.apache.spark.mllib.linalg.Vector features) { throw new RuntimeException(); }
  /**
   * Predict values for the given data set.
   * <p>
   * @param features RDD representing data points to be predicted
   * @return RDD[Double] where each entry contains the corresponding prediction
   */
  public  org.apache.spark.rdd.RDD<java.lang.Object> predict (org.apache.spark.rdd.RDD<org.apache.spark.mllib.linalg.Vector> features) { throw new RuntimeException(); }
  /**
   * Java-friendly version of {@link org.apache.spark.mllib.tree.model.TreeEnsembleModel#predict}.
   */
  public  org.apache.spark.api.java.JavaRDD<java.lang.Double> predict (org.apache.spark.api.java.JavaRDD<org.apache.spark.mllib.linalg.Vector> features) { throw new RuntimeException(); }
  /**
   * Print a summary of the model.
   */
  public  java.lang.String toString () { throw new RuntimeException(); }
  /**
   * Print the full model to a string.
   */
  public  java.lang.String toDebugString () { throw new RuntimeException(); }
  /**
   * Get number of trees in forest.
   */
  public  int numTrees () { throw new RuntimeException(); }
  /**
   * Get total number of nodes, summed over all trees in the forest.
   */
  public  int totalNumNodes () { throw new RuntimeException(); }
}
