package org.apache.spark.mllib.tree.impl;
/**
 * Internal representation of LabeledPoint for DecisionTree.
 * This bins feature values based on a subsampled of data as follows:
 *  (a) Continuous features are binned into ranges.
 *  (b) Unordered categorical features are binned based on subsets of feature values.
 *      "Unordered categorical features" are categorical features with low arity used in
 *      multiclass classification.
 *  (c) Ordered categorical features are binned based on feature values.
 *      "Ordered categorical features" are categorical features with high arity,
 *      or any categorical feature used in regression or binary classification.
 * <p>
 * @param label  Label from LabeledPoint
 * @param binnedFeatures  Binned feature values.
 *                        Same length as LabeledPoint.features, but values are bin indices.
 */
public  class TreePoint implements scala.Serializable {
  /**
   * Convert an input dataset into its TreePoint representation,
   * binning feature values in preparation for DecisionTree training.
   * @param input     Input dataset.
   * @param bins      Bins for features, of size (numFeatures, numBins).
   * @param metadata  Learning and dataset metadata
   * @return  TreePoint dataset representation
   */
  static public  org.apache.spark.rdd.RDD<org.apache.spark.mllib.tree.impl.TreePoint> convertToTreeRDD (org.apache.spark.rdd.RDD<org.apache.spark.mllib.regression.LabeledPoint> input, org.apache.spark.mllib.tree.model.Bin[][] bins, org.apache.spark.mllib.tree.impl.DecisionTreeMetadata metadata) { throw new RuntimeException(); }
  /**
   * Convert one LabeledPoint into its TreePoint representation.
   * @param bins      Bins for features, of size (numFeatures, numBins).
   * @param featureArity  Array indexed by feature, with value 0 for continuous and numCategories
   *                      for categorical features.
   * @param isUnordered  Array index by feature, with value true for unordered categorical features.
   */
  static private  org.apache.spark.mllib.tree.impl.TreePoint labeledPointToTreePoint (org.apache.spark.mllib.regression.LabeledPoint labeledPoint, org.apache.spark.mllib.tree.model.Bin[][] bins, int[] featureArity, boolean[] isUnordered) { throw new RuntimeException(); }
  /**
   * Find bin for one (labeledPoint, feature).
   * <p>
   * @param featureArity  0 for continuous features; number of categories for categorical features.
   * @param isUnorderedFeature  (only applies if feature is categorical)
   * @param bins   Bins for features, of size (numFeatures, numBins).
   */
  static private  int findBin (int featureIndex, org.apache.spark.mllib.regression.LabeledPoint labeledPoint, int featureArity, boolean isUnorderedFeature, org.apache.spark.mllib.tree.model.Bin[][] bins) { throw new RuntimeException(); }
  public  double label () { throw new RuntimeException(); }
  public  int[] binnedFeatures () { throw new RuntimeException(); }
  // not preceding
  public   TreePoint (double label, int[] binnedFeatures) { throw new RuntimeException(); }
}
