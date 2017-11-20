package org.apache.spark.mllib.recommendation;
/**
 * Out-link information for a user or product block. This includes the original user/product IDs
 * of the elements within this block, and the list of destination blocks that each user or
 * product will need to send its feature vector to.
 */
public  class OutLinkBlock implements scala.Product, scala.Serializable {
  public  int[] elementIds () { throw new RuntimeException(); }
  public  scala.collection.mutable.BitSet[] shouldSend () { throw new RuntimeException(); }
  // not preceding
  public   OutLinkBlock (int[] elementIds, scala.collection.mutable.BitSet[] shouldSend) { throw new RuntimeException(); }
}
