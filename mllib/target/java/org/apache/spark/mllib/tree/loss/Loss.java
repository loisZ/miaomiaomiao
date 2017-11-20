package org.apache.spark.mllib.tree.loss;
/**
 * :: DeveloperApi ::
 * Trait for adding "pluggable" loss functions for the gradient boosting algorithm.
 */
public  interface Loss extends scala.Serializable {
  /**
   * Method to calculate the gradients for the gradient boosting calculation.
   * @param model Model of the weak learner.
   * @param point Instance of the training dataset.
   * @return Loss gradient.
   */
  public  double gradient (org.apache.spark.mllib.tree.model.TreeEnsembleModel model, org.apache.spark.mllib.regression.LabeledPoint point) ;
  /**
   * Method to calculate error of the base learner for the gradient boosting calculation.
   * Note: This method is not used by the gradient boosting algorithm but is useful for debugging
   * purposes.
   * @param model Model of the weak learner.
   * @param data Training dataset: RDD of {@link org.apache.spark.mllib.regression.LabeledPoint}.
   * @return
   */
  public  double computeError (org.apache.spark.mllib.tree.model.TreeEnsembleModel model, org.apache.spark.rdd.RDD<org.apache.spark.mllib.regression.LabeledPoint> data) ;
}
