package org.apache.spark.mllib.stat.impl;
/** 
 * Utility class to implement the density function for multivariate Gaussian distribution.
 * Breeze provides this functionality, but it requires the Apache Commons Math library,
 * so this class is here so-as to not introduce a new dependency in Spark.
 */
public  class MultivariateGaussian implements scala.Serializable {
  public  breeze.linalg.DenseVector<java.lang.Object> mu () { throw new RuntimeException(); }
  public  breeze.linalg.DenseMatrix<java.lang.Object> sigma () { throw new RuntimeException(); }
  // not preceding
  public   MultivariateGaussian (breeze.linalg.DenseVector<java.lang.Object> mu, breeze.linalg.DenseMatrix<java.lang.Object> sigma) { throw new RuntimeException(); }
  private  breeze.linalg.DenseMatrix<java.lang.Object> sigmaInv2 () { throw new RuntimeException(); }
  private  double U () { throw new RuntimeException(); }
  /** Returns density of this multivariate Gaussian at given point, x */
  public  double pdf (breeze.linalg.DenseVector<java.lang.Object> x) { throw new RuntimeException(); }
}
