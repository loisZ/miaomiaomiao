package org.apache.spark.mllib.tree;
// no position
public  class GradientBoostedTrees$ implements org.apache.spark.Logging, scala.Serializable {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final GradientBoostedTrees$ MODULE$ = null;
  public   GradientBoostedTrees$ () { throw new RuntimeException(); }
  /**
   * Method to train a gradient boosting model.
   * <p>
   * @param input Training dataset: RDD of {@link org.apache.spark.mllib.regression.LabeledPoint}.
   *              For classification, labels should take values {0, 1, ..., numClasses-1}.
   *              For regression, labels are real numbers.
   * @param boostingStrategy Configuration options for the boosting algorithm.
   * @return a gradient boosted trees model that can be used for prediction
   */
  public  org.apache.spark.mllib.tree.model.GradientBoostedTreesModel train (org.apache.spark.rdd.RDD<org.apache.spark.mllib.regression.LabeledPoint> input, org.apache.spark.mllib.tree.configuration.BoostingStrategy boostingStrategy) { throw new RuntimeException(); }
  /**
   * Java-friendly API for {@link org.apache.spark.mllib.tree.GradientBoostedTrees$#train}
   */
  public  org.apache.spark.mllib.tree.model.GradientBoostedTreesModel train (org.apache.spark.api.java.JavaRDD<org.apache.spark.mllib.regression.LabeledPoint> input, org.apache.spark.mllib.tree.configuration.BoostingStrategy boostingStrategy) { throw new RuntimeException(); }
  /**
   * Internal method for performing regression using trees as base learners.
   * @param input training dataset
   * @param boostingStrategy boosting parameters
   * @return a gradient boosted trees model that can be used for prediction
   */
  private  org.apache.spark.mllib.tree.model.GradientBoostedTreesModel boost (org.apache.spark.rdd.RDD<org.apache.spark.mllib.regression.LabeledPoint> input, org.apache.spark.mllib.tree.configuration.BoostingStrategy boostingStrategy) { throw new RuntimeException(); }
}
