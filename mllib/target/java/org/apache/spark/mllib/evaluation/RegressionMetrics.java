package org.apache.spark.mllib.evaluation;
/**
 * :: Experimental ::
 * Evaluator for regression.
 * <p>
 * @param predictionAndObservations an RDD of (prediction, observation) pairs.
 */
public  class RegressionMetrics implements org.apache.spark.Logging {
  public   RegressionMetrics (org.apache.spark.rdd.RDD<scala.Tuple2<java.lang.Object, java.lang.Object>> predictionAndObservations) { throw new RuntimeException(); }
  /**
   * Use MultivariateOnlineSummarizer to calculate summary statistics of observations and errors.
   */
  private  org.apache.spark.mllib.stat.MultivariateStatisticalSummary summary () { throw new RuntimeException(); }
  /**
   * Returns the explained variance regression score.
   * explainedVariance = 1 - variance(y - \hat{y}) / variance(y)
   * Reference: {@link http://en.wikipedia.org/wiki/Explained_variation}
   */
  public  double explainedVariance () { throw new RuntimeException(); }
  /**
   * Returns the mean absolute error, which is a risk function corresponding to the
   * expected value of the absolute error loss or l1-norm loss.
   */
  public  double meanAbsoluteError () { throw new RuntimeException(); }
  /**
   * Returns the mean squared error, which is a risk function corresponding to the
   * expected value of the squared error loss or quadratic loss.
   */
  public  double meanSquaredError () { throw new RuntimeException(); }
  /**
   * Returns the root mean squared error, which is defined as the square root of
   * the mean squared error.
   */
  public  double rootMeanSquaredError () { throw new RuntimeException(); }
  /**
   * Returns R^2^, the coefficient of determination.
   * Reference: {@link http://en.wikipedia.org/wiki/Coefficient_of_determination}
   */
  public  double r2 () { throw new RuntimeException(); }
}
