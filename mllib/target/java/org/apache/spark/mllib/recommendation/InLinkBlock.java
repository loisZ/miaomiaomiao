package org.apache.spark.mllib.recommendation;
/**
 * In-link information for a user (or product) block. This includes the original user/product IDs
 * of the elements within this block, as well as an array of indices and ratings that specify
 * which user in the block will be rated by which products from each product block (or vice-versa).
 * Specifically, if this InLinkBlock is for users, ratingsForBlock(b)(i) will contain two arrays,
 * indices and ratings, for the i'th product that will be sent to us by product block b (call this
 * P). These arrays represent the users that product P had ratings for (by their index in this
 * block), as well as the corresponding rating for each one. We can thus use this information when
 * we get product block b's message to update the corresponding users.
 */
public  class InLinkBlock implements scala.Product, scala.Serializable {
  public  int[] elementIds () { throw new RuntimeException(); }
  public  scala.Tuple2<int[], double[]>[][] ratingsForBlock () { throw new RuntimeException(); }
  // not preceding
  public   InLinkBlock (int[] elementIds, scala.Tuple2<int[], double[]>[][] ratingsForBlock) { throw new RuntimeException(); }
}
