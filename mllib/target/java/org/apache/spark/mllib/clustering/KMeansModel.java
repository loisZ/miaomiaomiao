package org.apache.spark.mllib.clustering;
/**
 * A clustering model for K-means. Each point belongs to the cluster with the closest center.
 */
public  class KMeansModel implements scala.Serializable {
  public  org.apache.spark.mllib.linalg.Vector[] clusterCenters () { throw new RuntimeException(); }
  // not preceding
  public   KMeansModel (org.apache.spark.mllib.linalg.Vector[] clusterCenters) { throw new RuntimeException(); }
  /** Total number of clusters. */
  public  int k () { throw new RuntimeException(); }
  /** Returns the cluster index that a given point belongs to. */
  public  int predict (org.apache.spark.mllib.linalg.Vector point) { throw new RuntimeException(); }
  /** Maps given points to their cluster indices. */
  public  org.apache.spark.rdd.RDD<java.lang.Object> predict (org.apache.spark.rdd.RDD<org.apache.spark.mllib.linalg.Vector> points) { throw new RuntimeException(); }
  /** Maps given points to their cluster indices. */
  public  org.apache.spark.api.java.JavaRDD<java.lang.Integer> predict (org.apache.spark.api.java.JavaRDD<org.apache.spark.mllib.linalg.Vector> points) { throw new RuntimeException(); }
  /**
   * Return the K-means cost (sum of squared distances of points to their nearest center) for this
   * model on the given data.
   */
  public  double computeCost (org.apache.spark.rdd.RDD<org.apache.spark.mllib.linalg.Vector> data) { throw new RuntimeException(); }
  private  scala.collection.Iterable<org.apache.spark.mllib.clustering.VectorWithNorm> clusterCentersWithNorm () { throw new RuntimeException(); }
}
