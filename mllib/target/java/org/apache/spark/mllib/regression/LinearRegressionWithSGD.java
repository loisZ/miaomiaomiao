package org.apache.spark.mllib.regression;
/**
 * Train a linear regression model with no regularization using Stochastic Gradient Descent.
 * This solves the least squares regression formulation
 *              f(weights) = 1/n ||A weights-y||^2
 * (which is the mean squared error).
 * Here the data matrix has n rows, and the input RDD holds the set of rows of A, each with
 * its corresponding right hand side label y.
 * See also the documentation for the precise formulation.
 */
public  class LinearRegressionWithSGD extends org.apache.spark.mllib.regression.GeneralizedLinearAlgorithm<org.apache.spark.mllib.regression.LinearRegressionModel> implements scala.Serializable {
  /**
   * Train a Linear Regression model given an RDD of (label, features) pairs. We run a fixed number
   * of iterations of gradient descent using the specified step size. Each iteration uses
   * <code>miniBatchFraction</code> fraction of the data to calculate a stochastic gradient. The weights used
   * in gradient descent are initialized using the initial weights provided.
   * <p>
   * @param input RDD of (label, array of features) pairs. Each pair describes a row of the data
   *              matrix A as well as the corresponding right hand side label y
   * @param numIterations Number of iterations of gradient descent to run.
   * @param stepSize Step size to be used for each iteration of gradient descent.
   * @param miniBatchFraction Fraction of data to be used per iteration.
   * @param initialWeights Initial set of weights to be used. Array should be equal in size to
   *        the number of features in the data.
   */
  static public  org.apache.spark.mllib.regression.LinearRegressionModel train (org.apache.spark.rdd.RDD<org.apache.spark.mllib.regression.LabeledPoint> input, int numIterations, double stepSize, double miniBatchFraction, org.apache.spark.mllib.linalg.Vector initialWeights) { throw new RuntimeException(); }
  /**
   * Train a LinearRegression model given an RDD of (label, features) pairs. We run a fixed number
   * of iterations of gradient descent using the specified step size. Each iteration uses
   * <code>miniBatchFraction</code> fraction of the data to calculate a stochastic gradient.
   * <p>
   * @param input RDD of (label, array of features) pairs. Each pair describes a row of the data
   *              matrix A as well as the corresponding right hand side label y
   * @param numIterations Number of iterations of gradient descent to run.
   * @param stepSize Step size to be used for each iteration of gradient descent.
   * @param miniBatchFraction Fraction of data to be used per iteration.
   */
  static public  org.apache.spark.mllib.regression.LinearRegressionModel train (org.apache.spark.rdd.RDD<org.apache.spark.mllib.regression.LabeledPoint> input, int numIterations, double stepSize, double miniBatchFraction) { throw new RuntimeException(); }
  /**
   * Train a LinearRegression model given an RDD of (label, features) pairs. We run a fixed number
   * of iterations of gradient descent using the specified step size. We use the entire data set to
   * compute the true gradient in each iteration.
   * <p>
   * @param input RDD of (label, array of features) pairs. Each pair describes a row of the data
   *              matrix A as well as the corresponding right hand side label y
   * @param stepSize Step size to be used for each iteration of Gradient Descent.
   * @param numIterations Number of iterations of gradient descent to run.
   * @return a LinearRegressionModel which has the weights and offset from training.
   */
  static public  org.apache.spark.mllib.regression.LinearRegressionModel train (org.apache.spark.rdd.RDD<org.apache.spark.mllib.regression.LabeledPoint> input, int numIterations, double stepSize) { throw new RuntimeException(); }
  /**
   * Train a LinearRegression model given an RDD of (label, features) pairs. We run a fixed number
   * of iterations of gradient descent using a step size of 1.0. We use the entire data set to
   * compute the true gradient in each iteration.
   * <p>
   * @param input RDD of (label, array of features) pairs. Each pair describes a row of the data
   *              matrix A as well as the corresponding right hand side label y
   * @param numIterations Number of iterations of gradient descent to run.
   * @return a LinearRegressionModel which has the weights and offset from training.
   */
  static public  org.apache.spark.mllib.regression.LinearRegressionModel train (org.apache.spark.rdd.RDD<org.apache.spark.mllib.regression.LabeledPoint> input, int numIterations) { throw new RuntimeException(); }
  private  double stepSize () { throw new RuntimeException(); }
  private  int numIterations () { throw new RuntimeException(); }
  private  double miniBatchFraction () { throw new RuntimeException(); }
  // not preceding
  public   LinearRegressionWithSGD (double stepSize, int numIterations, double miniBatchFraction) { throw new RuntimeException(); }
  private  org.apache.spark.mllib.optimization.LeastSquaresGradient gradient () { throw new RuntimeException(); }
  private  org.apache.spark.mllib.optimization.SimpleUpdater updater () { throw new RuntimeException(); }
  public  org.apache.spark.mllib.optimization.GradientDescent optimizer () { throw new RuntimeException(); }
  /**
   * Construct a LinearRegression object with default parameters: {stepSize: 1.0,
   * numIterations: 100, miniBatchFraction: 1.0}.
   */
  public   LinearRegressionWithSGD () { throw new RuntimeException(); }
  protected  org.apache.spark.mllib.regression.LinearRegressionModel createModel (org.apache.spark.mllib.linalg.Vector weights, double intercept) { throw new RuntimeException(); }
}
