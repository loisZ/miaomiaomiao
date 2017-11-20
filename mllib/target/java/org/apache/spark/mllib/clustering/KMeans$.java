package org.apache.spark.mllib.clustering;
// no position
/**
 * Top-level methods for calling K-means clustering.
 */
public  class KMeans$ implements scala.Serializable {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final KMeans$ MODULE$ = null;
  public   KMeans$ () { throw new RuntimeException(); }
  public  java.lang.String RANDOM () { throw new RuntimeException(); }
  public  java.lang.String K_MEANS_PARALLEL () { throw new RuntimeException(); }
  /**
   * Trains a k-means model using the given set of parameters.
   * <p>
   * @param data training points stored as <code>RDD[Array[Double}</code>
   * @param k number of clusters
   * @param maxIterations max number of iterations
   * @param runs number of parallel runs, defaults to 1. The best model is returned.
   * @param initializationMode initialization model, either "random" or "k-means||" (default).
   */
  public  org.apache.spark.mllib.clustering.KMeansModel train (org.apache.spark.rdd.RDD<org.apache.spark.mllib.linalg.Vector> data, int k, int maxIterations, int runs, java.lang.String initializationMode) { throw new RuntimeException(); }
  /**
   * Trains a k-means model using specified parameters and the default values for unspecified.
   */
  public  org.apache.spark.mllib.clustering.KMeansModel train (org.apache.spark.rdd.RDD<org.apache.spark.mllib.linalg.Vector> data, int k, int maxIterations) { throw new RuntimeException(); }
  /**
   * Trains a k-means model using specified parameters and the default values for unspecified.
   */
  public  org.apache.spark.mllib.clustering.KMeansModel train (org.apache.spark.rdd.RDD<org.apache.spark.mllib.linalg.Vector> data, int k, int maxIterations, int runs) { throw new RuntimeException(); }
  /**
   * Returns the index of the closest center to the given point, as well as the squared distance.
   */
  public  scala.Tuple2<java.lang.Object, java.lang.Object> findClosest (scala.collection.TraversableOnce<org.apache.spark.mllib.clustering.VectorWithNorm> centers, org.apache.spark.mllib.clustering.VectorWithNorm point) { throw new RuntimeException(); }
  /**
   * Returns the K-means cost of a given point against the given cluster centers.
   */
  public  double pointCost (scala.collection.TraversableOnce<org.apache.spark.mllib.clustering.VectorWithNorm> centers, org.apache.spark.mllib.clustering.VectorWithNorm point) { throw new RuntimeException(); }
  /**
   * Returns the squared Euclidean distance between two vectors computed by
   * {@link org.apache.spark.mllib.util.MLUtils#fastSquaredDistance}.
   */
  public  double fastSquaredDistance (org.apache.spark.mllib.clustering.VectorWithNorm v1, org.apache.spark.mllib.clustering.VectorWithNorm v2) { throw new RuntimeException(); }
}
