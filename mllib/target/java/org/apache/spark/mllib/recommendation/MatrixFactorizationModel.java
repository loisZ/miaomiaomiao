package org.apache.spark.mllib.recommendation;
/**
 * Model representing the result of matrix factorization.
 * <p>
 * Note: If you create the model directly using constructor, please be aware that fast prediction
 * requires cached user/product features and their associated partitioners.
 * <p>
 * @param rank Rank for the features in this model.
 * @param userFeatures RDD of tuples where each tuple represents the userId and
 *                     the features computed for this user.
 * @param productFeatures RDD of tuples where each tuple represents the productId
 *                        and the features computed for this product.
 */
public  class MatrixFactorizationModel implements scala.Serializable, org.apache.spark.Logging {
  public  int rank () { throw new RuntimeException(); }
  public  org.apache.spark.rdd.RDD<scala.Tuple2<java.lang.Object, double[]>> userFeatures () { throw new RuntimeException(); }
  public  org.apache.spark.rdd.RDD<scala.Tuple2<java.lang.Object, double[]>> productFeatures () { throw new RuntimeException(); }
  // not preceding
  public   MatrixFactorizationModel (int rank, org.apache.spark.rdd.RDD<scala.Tuple2<java.lang.Object, double[]>> userFeatures, org.apache.spark.rdd.RDD<scala.Tuple2<java.lang.Object, double[]>> productFeatures) { throw new RuntimeException(); }
  /** Validates factors and warns users if there are performance concerns. */
  private  void validateFeatures (java.lang.String name, org.apache.spark.rdd.RDD<scala.Tuple2<java.lang.Object, double[]>> features) { throw new RuntimeException(); }
  /** Predict the rating of one user for one product. */
  public  double predict (int user, int product) { throw new RuntimeException(); }
  /**
   * Predict the rating of many users for many products.
   * The output RDD has an element per each element in the input RDD (including all duplicates)
   * unless a user or product is missing in the training set.
   * <p>
   * @param usersProducts  RDD of (user, product) pairs.
   * @return RDD of Ratings.
   */
  public  org.apache.spark.rdd.RDD<org.apache.spark.mllib.recommendation.Rating> predict (org.apache.spark.rdd.RDD<scala.Tuple2<java.lang.Object, java.lang.Object>> usersProducts) { throw new RuntimeException(); }
  /**
   * Java-friendly version of {@link MatrixFactorizationModel.predict}.
   */
  public  org.apache.spark.api.java.JavaRDD<org.apache.spark.mllib.recommendation.Rating> predict (org.apache.spark.api.java.JavaPairRDD<java.lang.Integer, java.lang.Integer> usersProducts) { throw new RuntimeException(); }
  /**
   * Recommends products to a user.
   * <p>
   * @param user the user to recommend products to
   * @param num how many products to return. The number returned may be less than this.
   * @return {@link Rating} objects, each of which contains the given user ID, a product ID, and a
   *  "score" in the rating field. Each represents one recommended product, and they are sorted
   *  by score, decreasing. The first returned is the one predicted to be most strongly
   *  recommended to the user. The score is an opaque value that indicates how strongly
   *  recommended the product is.
   */
  public  org.apache.spark.mllib.recommendation.Rating[] recommendProducts (int user, int num) { throw new RuntimeException(); }
  /**
   * Recommends users to a product. That is, this returns users who are most likely to be
   * interested in a product.
   * <p>
   * @param product the product to recommend users to
   * @param num how many users to return. The number returned may be less than this.
   * @return {@link Rating} objects, each of which contains a user ID, the given product ID, and a
   *  "score" in the rating field. Each represents one recommended user, and they are sorted
   *  by score, decreasing. The first returned is the one predicted to be most strongly
   *  recommended to the product. The score is an opaque value that indicates how strongly
   *  recommended the user is.
   */
  public  org.apache.spark.mllib.recommendation.Rating[] recommendUsers (int product, int num) { throw new RuntimeException(); }
  private  scala.Tuple2<java.lang.Object, java.lang.Object>[] recommend (double[] recommendToFeatures, org.apache.spark.rdd.RDD<scala.Tuple2<java.lang.Object, double[]>> recommendableFeatures, int num) { throw new RuntimeException(); }
}
