package org.apache.spark.mllib.clustering;
/**
 * Multivariate Gaussian Mixture Model (GMM) consisting of k Gaussians, where points 
 * are drawn from each Gaussian i=1..k with probability w(i); mu(i) and sigma(i) are 
 * the respective mean and covariance for each Gaussian distribution i=1..k. 
 * <p>
 * @param weight Weights for each Gaussian distribution in the mixture, where weight(i) is
 *               the weight for Gaussian i, and weight.sum == 1
 * @param mu Means for each Gaussian in the mixture, where mu(i) is the mean for Gaussian i
 * @param sigma Covariance maxtrix for each Gaussian in the mixture, where sigma(i) is the
 *              covariance matrix for Gaussian i
 */
public  class GaussianMixtureModel implements scala.Serializable {
  public  double[] weight () { throw new RuntimeException(); }
  public  org.apache.spark.mllib.linalg.Vector[] mu () { throw new RuntimeException(); }
  public  org.apache.spark.mllib.linalg.Matrix[] sigma () { throw new RuntimeException(); }
  // not preceding
  public   GaussianMixtureModel (double[] weight, org.apache.spark.mllib.linalg.Vector[] mu, org.apache.spark.mllib.linalg.Matrix[] sigma) { throw new RuntimeException(); }
  /** Number of gaussians in mixture */
  public  int k () { throw new RuntimeException(); }
  /** Maps given points to their cluster indices. */
  public  org.apache.spark.rdd.RDD<java.lang.Object> predict (org.apache.spark.rdd.RDD<org.apache.spark.mllib.linalg.Vector> points) { throw new RuntimeException(); }
  /**
   * Given the input vectors, return the membership value of each vector
   * to all mixture components. 
   */
  public  org.apache.spark.rdd.RDD<double[]> predictSoft (org.apache.spark.rdd.RDD<org.apache.spark.mllib.linalg.Vector> points) { throw new RuntimeException(); }
  /**
   * Compute the partial assignments for each vector
   */
  private  double[] computeSoftAssignments (breeze.linalg.DenseVector<java.lang.Object> pt, org.apache.spark.mllib.stat.impl.MultivariateGaussian[] dists, double[] weights, int k) { throw new RuntimeException(); }
}
