package org.apache.spark.mllib.clustering;
/**
 * This class performs expectation maximization for multivariate Gaussian
 * Mixture Models (GMMs).  A GMM represents a composite distribution of
 * independent Gaussian distributions with associated "mixing" weights
 * specifying each's contribution to the composite.
 * <p>
 * Given a set of sample points, this class will maximize the log-likelihood 
 * for a mixture of k Gaussians, iterating until the log-likelihood changes by 
 * less than convergenceTol, or until it has reached the max number of iterations.
 * While this process is generally guaranteed to converge, it is not guaranteed
 * to find a global optimum.  
 * <p>
 * @param k The number of independent Gaussians in the mixture model
 * @param convergenceTol The maximum change in log-likelihood at which convergence
 * is considered to have occurred.
 * @param maxIterations The maximum number of iterations to perform
 */
public  class GaussianMixtureEM implements scala.Serializable {
  private  int k () { throw new RuntimeException(); }
  private  double convergenceTol () { throw new RuntimeException(); }
  private  int maxIterations () { throw new RuntimeException(); }
  // not preceding
  private   GaussianMixtureEM (int k, double convergenceTol, int maxIterations) { throw new RuntimeException(); }
  /** A default instance, 2 Gaussians, 100 iterations, 0.01 log-likelihood threshold */
  public   GaussianMixtureEM () { throw new RuntimeException(); }
  private  int nSamples () { throw new RuntimeException(); }
  private  scala.Option<org.apache.spark.mllib.clustering.GaussianMixtureModel> initialModel () { throw new RuntimeException(); }
  /** Set the initial GMM starting point, bypassing the random initialization.
   *  You must call setK() prior to calling this method, and the condition
   *  (model.k == this.k) must be met; failure will result in an IllegalArgumentException
   */
  public  org.apache.spark.mllib.clustering.GaussianMixtureEM setInitialModel (org.apache.spark.mllib.clustering.GaussianMixtureModel model) { throw new RuntimeException(); }
  /** Return the user supplied initial GMM, if supplied */
  public  scala.Option<org.apache.spark.mllib.clustering.GaussianMixtureModel> getInitialModel () { throw new RuntimeException(); }
  /** Set the number of Gaussians in the mixture model.  Default: 2 */
  public  org.apache.spark.mllib.clustering.GaussianMixtureEM setK (int k) { throw new RuntimeException(); }
  /** Return the number of Gaussians in the mixture model */
  public  int getK () { throw new RuntimeException(); }
  /** Set the maximum number of iterations to run. Default: 100 */
  public  org.apache.spark.mllib.clustering.GaussianMixtureEM setMaxIterations (int maxIterations) { throw new RuntimeException(); }
  /** Return the maximum number of iterations to run */
  public  int getMaxIterations () { throw new RuntimeException(); }
  /**
   * Set the largest change in log-likelihood at which convergence is 
   * considered to have occurred.
   */
  public  org.apache.spark.mllib.clustering.GaussianMixtureEM setConvergenceTol (double convergenceTol) { throw new RuntimeException(); }
  /** Return the largest change in log-likelihood at which convergence is
   *  considered to have occurred.
   */
  public  double getConvergenceTol () { throw new RuntimeException(); }
  /** Perform expectation maximization */
  public  org.apache.spark.mllib.clustering.GaussianMixtureModel run (org.apache.spark.rdd.RDD<org.apache.spark.mllib.linalg.Vector> data) { throw new RuntimeException(); }
  /** Average of dense breeze vectors */
  private  breeze.linalg.DenseVector<java.lang.Object> vectorMean (scala.collection.mutable.IndexedSeq<breeze.linalg.DenseVector<java.lang.Object>> x) { throw new RuntimeException(); }
  /**
   * Construct matrix where diagonal entries are element-wise
   * variance of input vectors (computes biased variance)
   */
  private  breeze.linalg.DenseMatrix<java.lang.Object> initCovariance (scala.collection.mutable.IndexedSeq<breeze.linalg.DenseVector<java.lang.Object>> x) { throw new RuntimeException(); }
}
