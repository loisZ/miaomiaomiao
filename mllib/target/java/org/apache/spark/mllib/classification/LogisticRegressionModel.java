package org.apache.spark.mllib.classification;
/**
 * Classification model trained using Logistic Regression.
 * <p>
 * @param weights Weights computed for every feature.
 * @param intercept Intercept computed for this model.
 */
public  class LogisticRegressionModel extends org.apache.spark.mllib.regression.GeneralizedLinearModel implements org.apache.spark.mllib.classification.ClassificationModel, scala.Serializable {
  public  org.apache.spark.mllib.linalg.Vector weights () { throw new RuntimeException(); }
  public  double intercept () { throw new RuntimeException(); }
  // not preceding
  public   LogisticRegressionModel (org.apache.spark.mllib.linalg.Vector weights, double intercept) { throw new RuntimeException(); }
  private  scala.Option<java.lang.Object> threshold () { throw new RuntimeException(); }
  /**
   * :: Experimental ::
   * Sets the threshold that separates positive predictions from negative predictions. An example
   * with prediction score greater than or equal to this threshold is identified as an positive,
   * and negative otherwise. The default value is 0.5.
   */
  public  org.apache.spark.mllib.classification.LogisticRegressionModel setThreshold (double threshold) { throw new RuntimeException(); }
  /**
   * :: Experimental ::
   * Clears the threshold so that <code>predict</code> will output raw prediction scores.
   */
  public  org.apache.spark.mllib.classification.LogisticRegressionModel clearThreshold () { throw new RuntimeException(); }
  protected  double predictPoint (org.apache.spark.mllib.linalg.Vector dataMatrix, org.apache.spark.mllib.linalg.Vector weightMatrix, double intercept) { throw new RuntimeException(); }
}
