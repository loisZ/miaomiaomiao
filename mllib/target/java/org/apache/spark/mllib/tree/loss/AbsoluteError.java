package org.apache.spark.mllib.tree.loss;
// no position
/**
 * :: DeveloperApi ::
 * Class for absolute error loss calculation (for regression).
 * <p>
 * The absolute (L1) error is defined as:
 *  |y - F(x)|
 * where y is the label and F(x) is the model prediction for features x.
 */
public  class AbsoluteError implements org.apache.spark.mllib.tree.loss.Loss {
  /**
   * Method to calculate the gradients for the gradient boosting calculation for least
   * absolute error calculation.
   * The gradient with respect to F(x) is: sign(F(x) - y)
   * @param model Ensemble model
   * @param point Instance of the training dataset
   * @return Loss gradient
   */
  static public  double gradient (org.apache.spark.mllib.tree.model.TreeEnsembleModel model, org.apache.spark.mllib.regression.LabeledPoint point) { throw new RuntimeException(); }
  /**
   * Method to calculate loss of the base learner for the gradient boosting calculation.
   * Note: This method is not used by the gradient boosting algorithm but is useful for debugging
   * purposes.
   * @param model Ensemble model
   * @param data Training dataset: RDD of {@link org.apache.spark.mllib.regression.LabeledPoint}.
   * @return  Mean absolute error of model on data
   */
  static public  double computeError (org.apache.spark.mllib.tree.model.TreeEnsembleModel model, org.apache.spark.rdd.RDD<org.apache.spark.mllib.regression.LabeledPoint> data) { throw new RuntimeException(); }
}
