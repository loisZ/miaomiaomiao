package org.apache.spark.mllib.tree.impl;
/**
 * :: DeveloperApi ::
 * This is used by the node id cache to find the child id that a data point would belong to.
 * @param split Split information.
 * @param nodeIndex The current node index of a data point that this will update.
 */
public  class NodeIndexUpdater implements scala.Product, scala.Serializable {
  public  org.apache.spark.mllib.tree.model.Split split () { throw new RuntimeException(); }
  public  int nodeIndex () { throw new RuntimeException(); }
  // not preceding
  public   NodeIndexUpdater (org.apache.spark.mllib.tree.model.Split split, int nodeIndex) { throw new RuntimeException(); }
  /**
   * Determine a child node index based on the feature value and the split.
   * @param binnedFeatures Binned feature values.
   * @param bins Bin information to convert the bin indices to approximate feature values.
   * @return Child node index to update to.
   */
  public  int updateNodeIndex (int[] binnedFeatures, org.apache.spark.mllib.tree.model.Bin[][] bins) { throw new RuntimeException(); }
}
