package org.apache.spark.mllib.clustering;
/**
 * K-means clustering with support for multiple parallel runs and a k-means++ like initialization
 * mode (the k-means|| algorithm by Bahmani et al). When multiple concurrent runs are requested,
 * they are executed together with joint passes over the data for efficiency.
 * <p>
 * This is an iterative algorithm that will make multiple passes over the data, so any RDDs given
 * to it should be cached by the user.
 */
public  class KMeans implements scala.Serializable, org.apache.spark.Logging {
  static public  java.lang.String RANDOM () { throw new RuntimeException(); }
  static public  java.lang.String K_MEANS_PARALLEL () { throw new RuntimeException(); }
  /**
   * Trains a k-means model using the given set of parameters.
   * <p>
   * @param data training points stored as <code>RDD[Array[Double}</code>
   * @param k number of clusters
   * @param maxIterations max number of iterations
   * @param runs number of parallel runs, defaults to 1. The best model is returned.
   * @param initializationMode initialization model, either "random" or "k-means||" (default).
   */
  static public  org.apache.spark.mllib.clustering.KMeansModel train (org.apache.spark.rdd.RDD<org.apache.spark.mllib.linalg.Vector> data, int k, int maxIterations, int runs, java.lang.String initializationMode) { throw new RuntimeException(); }
  /**
   * Trains a k-means model using specified parameters and the default values for unspecified.
   */
  static public  org.apache.spark.mllib.clustering.KMeansModel train (org.apache.spark.rdd.RDD<org.apache.spark.mllib.linalg.Vector> data, int k, int maxIterations) { throw new RuntimeException(); }
  /**
   * Trains a k-means model using specified parameters and the default values for unspecified.
   */
  static public  org.apache.spark.mllib.clustering.KMeansModel train (org.apache.spark.rdd.RDD<org.apache.spark.mllib.linalg.Vector> data, int k, int maxIterations, int runs) { throw new RuntimeException(); }
  /**
   * Returns the index of the closest center to the given point, as well as the squared distance.
   */
  static public  scala.Tuple2<java.lang.Object, java.lang.Object> findClosest (scala.collection.TraversableOnce<org.apache.spark.mllib.clustering.VectorWithNorm> centers, org.apache.spark.mllib.clustering.VectorWithNorm point) { throw new RuntimeException(); }
  /**
   * Returns the K-means cost of a given point against the given cluster centers.
   */
  static public  double pointCost (scala.collection.TraversableOnce<org.apache.spark.mllib.clustering.VectorWithNorm> centers, org.apache.spark.mllib.clustering.VectorWithNorm point) { throw new RuntimeException(); }
  /**
   * Returns the squared Euclidean distance between two vectors computed by
   * {@link org.apache.spark.mllib.util.MLUtils#fastSquaredDistance}.
   */
  static public  double fastSquaredDistance (org.apache.spark.mllib.clustering.VectorWithNorm v1, org.apache.spark.mllib.clustering.VectorWithNorm v2) { throw new RuntimeException(); }
  private  int k () { throw new RuntimeException(); }
  private  int maxIterations () { throw new RuntimeException(); }
  private  int runs () { throw new RuntimeException(); }
  private  java.lang.String initializationMode () { throw new RuntimeException(); }
  private  int initializationSteps () { throw new RuntimeException(); }
  private  double epsilon () { throw new RuntimeException(); }
  // not preceding
  private   KMeans (int k, int maxIterations, int runs, java.lang.String initializationMode, int initializationSteps, double epsilon) { throw new RuntimeException(); }
  /**
   * Constructs a KMeans instance with default parameters: {k: 2, maxIterations: 20, runs: 1,
   * initializationMode: "k-means||", initializationSteps: 5, epsilon: 1e-4}.
   */
  public   KMeans () { throw new RuntimeException(); }
  /** Set the number of clusters to create (k). Default: 2. */
  public  org.apache.spark.mllib.clustering.KMeans setK (int k) { throw new RuntimeException(); }
  /** Set maximum number of iterations to run. Default: 20. */
  public  org.apache.spark.mllib.clustering.KMeans setMaxIterations (int maxIterations) { throw new RuntimeException(); }
  /**
   * Set the initialization algorithm. This can be either "random" to choose random points as
   * initial cluster centers, or "k-means||" to use a parallel variant of k-means++
   * (Bahmani et al., Scalable K-Means++, VLDB 2012). Default: k-means||.
   */
  public  org.apache.spark.mllib.clustering.KMeans setInitializationMode (java.lang.String initializationMode) { throw new RuntimeException(); }
  /**
   * :: Experimental ::
   * Set the number of runs of the algorithm to execute in parallel. We initialize the algorithm
   * this many times with random starting conditions (configured by the initialization mode), then
   * return the best clustering found over any run. Default: 1.
   */
  public  org.apache.spark.mllib.clustering.KMeans setRuns (int runs) { throw new RuntimeException(); }
  /**
   * Set the number of steps for the k-means|| initialization mode. This is an advanced
   * setting -- the default of 5 is almost always enough. Default: 5.
   */
  public  org.apache.spark.mllib.clustering.KMeans setInitializationSteps (int initializationSteps) { throw new RuntimeException(); }
  /**
   * Set the distance threshold within which we've consider centers to have converged.
   * If all centers move less than this Euclidean distance, we stop iterating one run.
   */
  public  org.apache.spark.mllib.clustering.KMeans setEpsilon (double epsilon) { throw new RuntimeException(); }
  /**
   * Train a K-means model on the given set of points; <code>data</code> should be cached for high
   * performance, because this is an iterative algorithm.
   */
  public  org.apache.spark.mllib.clustering.KMeansModel run (org.apache.spark.rdd.RDD<org.apache.spark.mllib.linalg.Vector> data) { throw new RuntimeException(); }
  /**
   * Implementation of K-Means algorithm.
   */
  private  org.apache.spark.mllib.clustering.KMeansModel runAlgorithm (org.apache.spark.rdd.RDD<org.apache.spark.mllib.clustering.VectorWithNorm> data) { throw new RuntimeException(); }
  /**
   * Initialize <code>runs</code> sets of cluster centers at random.
   */
  private  org.apache.spark.mllib.clustering.VectorWithNorm[][] initRandom (org.apache.spark.rdd.RDD<org.apache.spark.mllib.clustering.VectorWithNorm> data) { throw new RuntimeException(); }
  /**
   * Initialize <code>runs</code> sets of cluster centers using the k-means|| algorithm by Bahmani et al.
   * (Bahmani et al., Scalable K-Means++, VLDB 2012). This is a variant of k-means++ that tries
   * to find with dissimilar cluster centers by starting with a random center and then doing
   * passes where more centers are chosen with probability proportional to their squared distance
   * to the current cluster set. It results in a provable approximation to an optimal clustering.
   * <p>
   * The original paper can be found at http://theory.stanford.edu/~sergei/papers/vldb12-kmpar.pdf.
   */
  private  org.apache.spark.mllib.clustering.VectorWithNorm[][] initKMeansParallel (org.apache.spark.rdd.RDD<org.apache.spark.mllib.clustering.VectorWithNorm> data) { throw new RuntimeException(); }
}
