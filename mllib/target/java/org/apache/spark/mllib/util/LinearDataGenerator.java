package org.apache.spark.mllib.util;
// no position
/**
 * :: DeveloperApi ::
 * Generate sample data used for Linear Data. This class generates
 * uniformly random values for every feature and adds Gaussian noise with mean <code>eps</code> to the
 * response variable <code>Y</code>.
 */
public  class LinearDataGenerator {
  /**
   * Return a Java List of synthetic data randomly generated according to a multi
   * collinear model.
   * @param intercept Data intercept
   * @param weights  Weights to be applied.
   * @param nPoints Number of points in sample.
   * @param seed Random seed
   * @return Java List of input.
   */
  static public  java.util.List<org.apache.spark.mllib.regression.LabeledPoint> generateLinearInputAsList (double intercept, double[] weights, int nPoints, int seed, double eps) { throw new RuntimeException(); }
  /**
   * @param intercept Data intercept
   * @param weights  Weights to be applied.
   * @param nPoints Number of points in sample.
   * @param seed Random seed
   * @param eps Epsilon scaling factor.
   * @return
   */
  static public  scala.collection.Seq<org.apache.spark.mllib.regression.LabeledPoint> generateLinearInput (double intercept, double[] weights, int nPoints, int seed, double eps) { throw new RuntimeException(); }
  /**
   * Generate an RDD containing sample data for Linear Regression models - including Ridge, Lasso,
   * and uregularized variants.
   * <p>
   * @param sc SparkContext to be used for generating the RDD.
   * @param nexamples Number of examples that will be contained in the RDD.
   * @param nfeatures Number of features to generate for each example.
   * @param eps Epsilon factor by which examples are scaled.
   * @param nparts Number of partitions in the RDD. Default value is 2.
   * <p>
   * @return RDD of LabeledPoint containing sample data.
   */
  static public  org.apache.spark.rdd.RDD<org.apache.spark.mllib.regression.LabeledPoint> generateLinearRDD (org.apache.spark.SparkContext sc, int nexamples, int nfeatures, double eps, int nparts, double intercept) { throw new RuntimeException(); }
  static public  void main (java.lang.String[] args) { throw new RuntimeException(); }
}
