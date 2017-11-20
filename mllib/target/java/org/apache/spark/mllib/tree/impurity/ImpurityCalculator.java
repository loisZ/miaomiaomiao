package org.apache.spark.mllib.tree.impurity;
/**
 * Stores statistics for one (node, feature, bin) for calculating impurity.
 * Unlike {@link ImpurityAggregator}, this class stores its own data and is for a specific
 * (node, feature, bin).
 * @param stats  Array of sufficient statistics for a (node, feature, bin).
 */
public abstract class ImpurityCalculator {
  public  double[] stats () { throw new RuntimeException(); }
  // not preceding
  public   ImpurityCalculator (double[] stats) { throw new RuntimeException(); }
  /**
   * Make a deep copy of this {@link ImpurityCalculator}.
   */
  public abstract  org.apache.spark.mllib.tree.impurity.ImpurityCalculator copy () ;
  /**
   * Calculate the impurity from the stored sufficient statistics.
   */
  public abstract  double calculate () ;
  /**
   * Add the stats from another calculator into this one, modifying and returning this calculator.
   */
  public  org.apache.spark.mllib.tree.impurity.ImpurityCalculator add (org.apache.spark.mllib.tree.impurity.ImpurityCalculator other) { throw new RuntimeException(); }
  /**
   * Subtract the stats from another calculator from this one, modifying and returning this
   * calculator.
   */
  public  org.apache.spark.mllib.tree.impurity.ImpurityCalculator subtract (org.apache.spark.mllib.tree.impurity.ImpurityCalculator other) { throw new RuntimeException(); }
  /**
   * Number of data points accounted for in the sufficient statistics.
   */
  public abstract  long count () ;
  /**
   * Prediction which should be made based on the sufficient statistics.
   */
  public abstract  double predict () ;
  /**
   * Probability of the label given by {@link predict}, or -1 if no probability is available.
   */
  public  double prob (double label) { throw new RuntimeException(); }
  /**
   * Return the index of the largest array element.
   * Fails if the array is empty.
   */
  protected  int indexOfLargestArrayElement (double[] array) { throw new RuntimeException(); }
}
