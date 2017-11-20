package org.apache.spark.mllib.tree.impl;
/**
 * DecisionTree statistics aggregator for a node.
 * This holds a flat array of statistics for a set of (features, bins)
 * and helps with indexing.
 * This class is abstract to support learning with and without feature subsampling.
 */
public  class DTStatsAggregator implements scala.Serializable {
  public  org.apache.spark.mllib.tree.impl.DecisionTreeMetadata metadata () { throw new RuntimeException(); }
  // not preceding
  public   DTStatsAggregator (org.apache.spark.mllib.tree.impl.DecisionTreeMetadata metadata, scala.Option<int[]> featureSubset) { throw new RuntimeException(); }
  /**
   * {@link ImpurityAggregator} instance specifying the impurity type.
   */
  public  org.apache.spark.mllib.tree.impurity.ImpurityAggregator impurityAggregator () { throw new RuntimeException(); }
  /**
   * Number of elements (Double values) used for the sufficient statistics of each bin.
   */
  private  int statsSize () { throw new RuntimeException(); }
  /**
   * Number of bins for each feature.  This is indexed by the feature index.
   */
  private  int[] numBins () { throw new RuntimeException(); }
  /**
   * Offset for each feature for calculating indices into the {@link allStats} array.
   */
  private  int[] featureOffsets () { throw new RuntimeException(); }
  /**
   * Total number of elements stored in this aggregator
   */
  private  int allStatsSize () { throw new RuntimeException(); }
  /**
   * Flat array of elements.
   * Index for start of stats for a (feature, bin) is:
   *   index = featureOffsets(featureIndex) + binIndex * statsSize
   * Note: For unordered features,
   *       the left child stats have binIndex in [0, numBins(featureIndex) / 2))
   *       and the right child stats in [numBins(featureIndex) / 2), numBins(featureIndex))
   */
  private  double[] allStats () { throw new RuntimeException(); }
  /**
   * Get an {@link ImpurityCalculator} for a given (node, feature, bin).
   * @param featureOffset  For ordered features, this is a pre-computed (node, feature) offset
   *                           from {@link getFeatureOffset}.
   *                           For unordered features, this is a pre-computed
   *                           (node, feature, left/right child) offset from
   *                           {@link getLeftRightFeatureOffsets}.
   */
  public  org.apache.spark.mllib.tree.impurity.ImpurityCalculator getImpurityCalculator (int featureOffset, int binIndex) { throw new RuntimeException(); }
  /**
   * Update the stats for a given (feature, bin) for ordered features, using the given label.
   */
  public  void update (int featureIndex, int binIndex, double label, double instanceWeight) { throw new RuntimeException(); }
  /**
   * Faster version of {@link update}.
   * Update the stats for a given (feature, bin), using the given label.
   * @param featureOffset  For ordered features, this is a pre-computed feature offset
   *                           from {@link getFeatureOffset}.
   *                           For unordered features, this is a pre-computed
   *                           (feature, left/right child) offset from
   *                           {@link getLeftRightFeatureOffsets}.
   */
  public  void featureUpdate (int featureOffset, int binIndex, double label, double instanceWeight) { throw new RuntimeException(); }
  /**
   * Pre-compute feature offset for use with {@link featureUpdate}.
   * For ordered features only.
   */
  public  int getFeatureOffset (int featureIndex) { throw new RuntimeException(); }
  /**
   * Pre-compute feature offset for use with {@link featureUpdate}.
   * For unordered features only.
   */
  public  scala.Tuple2<java.lang.Object, java.lang.Object> getLeftRightFeatureOffsets (int featureIndex) { throw new RuntimeException(); }
  /**
   * For a given feature, merge the stats for two bins.
   * @param featureOffset  For ordered features, this is a pre-computed feature offset
   *                           from {@link getFeatureOffset}.
   *                           For unordered features, this is a pre-computed
   *                           (feature, left/right child) offset from
   *                           {@link getLeftRightFeatureOffsets}.
   * @param binIndex  The other bin is merged into this bin.
   * @param otherBinIndex  This bin is not modified.
   */
  public  void mergeForFeature (int featureOffset, int binIndex, int otherBinIndex) { throw new RuntimeException(); }
  /**
   * Merge this aggregator with another, and returns this aggregator.
   * This method modifies this aggregator in-place.
   */
  public  org.apache.spark.mllib.tree.impl.DTStatsAggregator merge (org.apache.spark.mllib.tree.impl.DTStatsAggregator other) { throw new RuntimeException(); }
}
