package org.apache.spark.mllib.classification;
/**
 * Train a classification model for Logistic Regression using Stochastic Gradient Descent. By
 * default L2 regularization is used, which can be changed via
 * {@link LogisticRegressionWithSGD.optimizer}.
 * NOTE: Labels used in Logistic Regression should be {0, 1}.
 * Using {@link LogisticRegressionWithLBFGS} is recommended over this.
 */
public  class LogisticRegressionWithSGD extends org.apache.spark.mllib.regression.GeneralizedLinearAlgorithm<org.apache.spark.mllib.classification.LogisticRegressionModel> implements scala.Serializable {
  /**
   * Train a logistic regression model given an RDD of (label, features) pairs. We run a fixed
   * number of iterations of gradient descent using the specified step size. Each iteration uses
   * <code>miniBatchFraction</code> fraction of the data to calculate the gradient. The weights used in
   * gradient descent are initialized using the initial weights provided.
   * NOTE: Labels used in Logistic Regression should be {0, 1}
   * <p>
   * @param input RDD of (label, array of features) pairs.
   * @param numIterations Number of iterations of gradient descent to run.
   * @param stepSize Step size to be used for each iteration of gradient descent.
   * @param miniBatchFraction Fraction of data to be used per iteration.
   * @param initialWeights Initial set of weights to be used. Array should be equal in size to
   *        the number of features in the data.
   */
  static public  org.apache.spark.mllib.classification.LogisticRegressionModel train (org.apache.spark.rdd.RDD<org.apache.spark.mllib.regression.LabeledPoint> input, int numIterations, double stepSize, double miniBatchFraction, org.apache.spark.mllib.linalg.Vector initialWeights) { throw new RuntimeException(); }
  /**
   * Train a logistic regression model given an RDD of (label, features) pairs. We run a fixed
   * number of iterations of gradient descent using the specified step size. Each iteration uses
   * <code>miniBatchFraction</code> fraction of the data to calculate the gradient.
   * NOTE: Labels used in Logistic Regression should be {0, 1}
   * <p>
   * @param input RDD of (label, array of features) pairs.
   * @param numIterations Number of iterations of gradient descent to run.
   * @param stepSize Step size to be used for each iteration of gradient descent.
   * <p>
   * @param miniBatchFraction Fraction of data to be used per iteration.
   */
  static public  org.apache.spark.mllib.classification.LogisticRegressionModel train (org.apache.spark.rdd.RDD<org.apache.spark.mllib.regression.LabeledPoint> input, int numIterations, double stepSize, double miniBatchFraction) { throw new RuntimeException(); }
  /**
   * Train a logistic regression model given an RDD of (label, features) pairs. We run a fixed
   * number of iterations of gradient descent using the specified step size. We use the entire data
   * set to update the gradient in each iteration.
   * NOTE: Labels used in Logistic Regression should be {0, 1}
   * <p>
   * @param input RDD of (label, array of features) pairs.
   * @param stepSize Step size to be used for each iteration of Gradient Descent.
   * <p>
   * @param numIterations Number of iterations of gradient descent to run.
   * @return a LogisticRegressionModel which has the weights and offset from training.
   */
  static public  org.apache.spark.mllib.classification.LogisticRegressionModel train (org.apache.spark.rdd.RDD<org.apache.spark.mllib.regression.LabeledPoint> input, int numIterations, double stepSize) { throw new RuntimeException(); }
  /**
   * Train a logistic regression model given an RDD of (label, features) pairs. We run a fixed
   * number of iterations of gradient descent using a step size of 1.0. We use the entire data set
   * to update the gradient in each iteration.
   * NOTE: Labels used in Logistic Regression should be {0, 1}
   * <p>
   * @param input RDD of (label, array of features) pairs.
   * @param numIterations Number of iterations of gradient descent to run.
   * @return a LogisticRegressionModel which has the weights and offset from training.
   */
  static public  org.apache.spark.mllib.classification.LogisticRegressionModel train (org.apache.spark.rdd.RDD<org.apache.spark.mllib.regression.LabeledPoint> input, int numIterations) { throw new RuntimeException(); }
  private  double stepSize () { throw new RuntimeException(); }
  private  int numIterations () { throw new RuntimeException(); }
  private  double regParam () { throw new RuntimeException(); }
  private  double miniBatchFraction () { throw new RuntimeException(); }
  // not preceding
  private   LogisticRegressionWithSGD (double stepSize, int numIterations, double regParam, double miniBatchFraction) { throw new RuntimeException(); }
  private  org.apache.spark.mllib.optimization.LogisticGradient gradient () { throw new RuntimeException(); }
  private  org.apache.spark.mllib.optimization.SquaredL2Updater updater () { throw new RuntimeException(); }
  public  org.apache.spark.mllib.optimization.GradientDescent optimizer () { throw new RuntimeException(); }
  protected  scala.collection.immutable.List<scala.Function1<org.apache.spark.rdd.RDD<org.apache.spark.mllib.regression.LabeledPoint>, java.lang.Object>> validators () { throw new RuntimeException(); }
  /**
   * Construct a LogisticRegression object with default parameters: {stepSize: 1.0,
   * numIterations: 100, regParm: 0.01, miniBatchFraction: 1.0}.
   */
  public   LogisticRegressionWithSGD () { throw new RuntimeException(); }
  protected  org.apache.spark.mllib.classification.LogisticRegressionModel createModel (org.apache.spark.mllib.linalg.Vector weights, double intercept) { throw new RuntimeException(); }
}
