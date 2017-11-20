package org.apache.spark.mllib.tree.impurity;
/**
 * Stores statistics for one (node, feature, bin) for calculating impurity.
 * Unlike {@link GiniAggregator}, this class stores its own data and is for a specific
 * (node, feature, bin).
 * @param stats  Array of sufficient statistics for a (node, feature, bin).
 */
public  class GiniCalculator extends org.apache.spark.mllib.tree.impurity.ImpurityCalculator {
  // not preceding
  public   GiniCalculator (double[] stats) { throw new RuntimeException(); }
  /**
   * Make a deep copy of this {@link ImpurityCalculator}.
   */
  public  org.apache.spark.mllib.tree.impurity.GiniCalculator copy () { throw new RuntimeException(); }
  /**
   * Calculate the impurity from the stored sufficient statistics.
   */
  public  double calculate () { throw new RuntimeException(); }
  /**
   * Number of data points accounted for in the sufficient statistics.
   */
  public  long count () { throw new RuntimeException(); }
  /**
   * Prediction which should be made based on the sufficient statistics.
   */
  public  double predict () { throw new RuntimeException(); }
  /**
   * Probability of the label given by {@link predict}.
   */
  public  double prob (double label) { throw new RuntimeException(); }
  public  java.lang.String toString () { throw new RuntimeException(); }
}
