package org.apache.spark.mllib.tree;
/**
 * :: Experimental ::
 * A class that implements
 * {@link http://en.wikipedia.org/wiki/Gradient_boosting  Stochastic Gradient Boosting}
 * for regression and binary classification.
 * <p>
 * The implementation is based upon:
 *   J.H. Friedman.  "Stochastic Gradient Boosting."  1999.
 * <p>
 * Notes on Gradient Boosting vs. TreeBoost:
 *  - This implementation is for Stochastic Gradient Boosting, not for TreeBoost.
 *  - Both algorithms learn tree ensembles by minimizing loss functions.
 *  - TreeBoost (Friedman, 1999) additionally modifies the outputs at tree leaf nodes
 *    based on the loss function, whereas the original gradient boosting method does not.
 *     - When the loss is SquaredError, these methods give the same result, but they could differ
 *       for other loss functions.
 * <p>
 * @param boostingStrategy Parameters for the gradient boosting algorithm.
 */
public  class GradientBoostedTrees implements scala.Serializable, org.apache.spark.Logging {
  /**
   * Method to train a gradient boosting model.
   * <p>
   * @param input Training dataset: RDD of {@link org.apache.spark.mllib.regression.LabeledPoint}.
   *              For classification, labels should take values {0, 1, ..., numClasses-1}.
   *              For regression, labels are real numbers.
   * @param boostingStrategy Configuration options for the boosting algorithm.
   * @return a gradient boosted trees model that can be used for prediction
   */
  static public  org.apache.spark.mllib.tree.model.GradientBoostedTreesModel train (org.apache.spark.rdd.RDD<org.apache.spark.mllib.regression.LabeledPoint> input, org.apache.spark.mllib.tree.configuration.BoostingStrategy boostingStrategy) { throw new RuntimeException(); }
  /**
   * Java-friendly API for {@link org.apache.spark.mllib.tree.GradientBoostedTrees$#train}
   */
  static public  org.apache.spark.mllib.tree.model.GradientBoostedTreesModel train (org.apache.spark.api.java.JavaRDD<org.apache.spark.mllib.regression.LabeledPoint> input, org.apache.spark.mllib.tree.configuration.BoostingStrategy boostingStrategy) { throw new RuntimeException(); }
  /**
   * Internal method for performing regression using trees as base learners.
   * @param input training dataset
   * @param boostingStrategy boosting parameters
   * @return a gradient boosted trees model that can be used for prediction
   */
  static private  org.apache.spark.mllib.tree.model.GradientBoostedTreesModel boost (org.apache.spark.rdd.RDD<org.apache.spark.mllib.regression.LabeledPoint> input, org.apache.spark.mllib.tree.configuration.BoostingStrategy boostingStrategy) { throw new RuntimeException(); }
  private  org.apache.spark.mllib.tree.configuration.BoostingStrategy boostingStrategy () { throw new RuntimeException(); }
  // not preceding
  public   GradientBoostedTrees (org.apache.spark.mllib.tree.configuration.BoostingStrategy boostingStrategy) { throw new RuntimeException(); }
  /**
   * Method to train a gradient boosting model
   * @param input Training dataset: RDD of {@link org.apache.spark.mllib.regression.LabeledPoint}.
   * @return a gradient boosted trees model that can be used for prediction
   */
  public  org.apache.spark.mllib.tree.model.GradientBoostedTreesModel run (org.apache.spark.rdd.RDD<org.apache.spark.mllib.regression.LabeledPoint> input) { throw new RuntimeException(); }
  /**
   * Java-friendly API for {@link org.apache.spark.mllib.tree.GradientBoostedTrees!#run}.
   */
  public  org.apache.spark.mllib.tree.model.GradientBoostedTreesModel run (org.apache.spark.api.java.JavaRDD<org.apache.spark.mllib.regression.LabeledPoint> input) { throw new RuntimeException(); }
}
