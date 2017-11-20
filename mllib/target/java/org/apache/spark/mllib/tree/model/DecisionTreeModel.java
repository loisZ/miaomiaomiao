package org.apache.spark.mllib.tree.model;
/**
 * :: Experimental ::
 * Decision tree model for classification or regression.
 * This model stores the decision tree structure and parameters.
 * @param topNode root node
 * @param algo algorithm type -- classification or regression
 */
public  class DecisionTreeModel implements scala.Serializable {
  public  org.apache.spark.mllib.tree.model.Node topNode () { throw new RuntimeException(); }
  public  scala.Enumeration.Value algo () { throw new RuntimeException(); }
  // not preceding
  public   DecisionTreeModel (org.apache.spark.mllib.tree.model.Node topNode, scala.Enumeration.Value algo) { throw new RuntimeException(); }
  /**
   * Predict values for a single data point using the model trained.
   * <p>
   * @param features array representing a single data point
   * @return Double prediction from the trained model
   */
  public  double predict (org.apache.spark.mllib.linalg.Vector features) { throw new RuntimeException(); }
  /**
   * Predict values for the given data set using the model trained.
   * <p>
   * @param features RDD representing data points to be predicted
   * @return RDD of predictions for each of the given data points
   */
  public  org.apache.spark.rdd.RDD<java.lang.Object> predict (org.apache.spark.rdd.RDD<org.apache.spark.mllib.linalg.Vector> features) { throw new RuntimeException(); }
  /**
   * Predict values for the given data set using the model trained.
   * <p>
   * @param features JavaRDD representing data points to be predicted
   * @return JavaRDD of predictions for each of the given data points
   */
  public  org.apache.spark.api.java.JavaRDD<java.lang.Object> predict (org.apache.spark.api.java.JavaRDD<org.apache.spark.mllib.linalg.Vector> features) { throw new RuntimeException(); }
  /**
   * Get number of nodes in tree, including leaf nodes.
   */
  public  int numNodes () { throw new RuntimeException(); }
  /**
   * Get depth of tree.
   * E.g.: Depth 0 means 1 leaf node.  Depth 1 means 1 internal node and 2 leaf nodes.
   */
  public  int depth () { throw new RuntimeException(); }
  /**
   * Print a summary of the model.
   */
  public  java.lang.String toString () { throw new RuntimeException(); }
  /**
   * Print the full model to a string.
   */
  public  java.lang.String toDebugString () { throw new RuntimeException(); }
}
