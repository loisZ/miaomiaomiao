package org.apache.spark.mllib.tree.model;
/**
 * Used for "binning" the feature values for faster best split calculation.
 * <p>
 * For a continuous feature, the bin is determined by a low and a high split,
 *  where an example with featureValue falls into the bin s.t.
 *  lowSplit.threshold < featureValue <= highSplit.threshold.
 * <p>
 * For ordered categorical features, there is a 1-1-1 correspondence between
 *  bins, splits, and feature values.  The bin is determined by category/feature value.
 *  However, the bins are not necessarily ordered by feature value;
 *  they are ordered using impurity.
 * <p>
 * For unordered categorical features, there is a 1-1 correspondence between bins, splits,
 *  where bins and splits correspond to subsets of feature values (in highSplit.categories).
 *  An unordered feature with k categories uses (1 << k - 1) - 1 bins, corresponding to all
 *  partitionings of categories into 2 disjoint, non-empty sets.
 * <p>
 * @param lowSplit signifying the lower threshold for the continuous feature to be
 *                 accepted in the bin
 * @param highSplit signifying the upper threshold for the continuous feature to be
 *                  accepted in the bin
 * @param featureType type of feature -- categorical or continuous
 * @param category categorical label value accepted in the bin for ordered features
 */
public  class Bin implements scala.Product, scala.Serializable {
  public  org.apache.spark.mllib.tree.model.Split lowSplit () { throw new RuntimeException(); }
  public  org.apache.spark.mllib.tree.model.Split highSplit () { throw new RuntimeException(); }
  public  scala.Enumeration.Value featureType () { throw new RuntimeException(); }
  public  double category () { throw new RuntimeException(); }
  // not preceding
  public   Bin (org.apache.spark.mllib.tree.model.Split lowSplit, org.apache.spark.mllib.tree.model.Split highSplit, scala.Enumeration.Value featureType, double category) { throw new RuntimeException(); }
}
