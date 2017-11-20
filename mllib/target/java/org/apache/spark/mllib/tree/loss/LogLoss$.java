package org.apache.spark.mllib.tree.loss;
// no position
/**
 * :: DeveloperApi ::
 * Class for log loss calculation (for classification).
 * This uses twice the binomial negative log likelihood, called "deviance" in Friedman (1999).
 * <p>
 * The log loss is defined as:
 *   2 log(1 + exp(-2 y F(x)))
 * where y is a label in {-1, 1} and F(x) is the model prediction for features x.
 */
public  class LogLoss$ implements org.apache.spark.mllib.tree.loss.Loss {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final LogLoss$ MODULE$ = null;
  public   LogLoss$ () { throw new RuntimeException(); }
  /**
   * Method to calculate the loss gradients for the gradient boosting calculation for binary
   * classification
   * The gradient with respect to F(x) is: - 4 y / (1 + exp(2 y F(x)))
   * @param model Ensemble model
   * @param point Instance of the training dataset
   * @return Loss gradient
   */
  public  double gradient (org.apache.spark.mllib.tree.model.TreeEnsembleModel model, org.apache.spark.mllib.regression.LabeledPoint point) { throw new RuntimeException(); }
  /**
   * Method to calculate loss of the base learner for the gradient boosting calculation.
   * Note: This method is not used by the gradient boosting algorithm but is useful for debugging
   * purposes.
   * @param model Ensemble model
   * @param data Training dataset: RDD of {@link org.apache.spark.mllib.regression.LabeledPoint}.
   * @return Mean log loss of model on data
   */
  public  double computeError (org.apache.spark.mllib.tree.model.TreeEnsembleModel model, org.apache.spark.rdd.RDD<org.apache.spark.mllib.regression.LabeledPoint> data) { throw new RuntimeException(); }
}
