package org.apache.spark.mllib.recommendation;
// no position
/**
 * Top-level methods for calling Alternating Least Squares (ALS) matrix factorization.
 */
public  class ALS$ implements scala.Serializable {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final ALS$ MODULE$ = null;
  public   ALS$ () { throw new RuntimeException(); }
  /**
   * Train a matrix factorization model given an RDD of ratings given by users to some products,
   * in the form of (userID, productID, rating) pairs. We approximate the ratings matrix as the
   * product of two lower-rank matrices of a given rank (number of features). To solve for these
   * features, we run a given number of iterations of ALS. This is done using a level of
   * parallelism given by <code>blocks</code>.
   * <p>
   * @param ratings    RDD of (userID, productID, rating) pairs
   * @param rank       number of features to use
   * @param iterations number of iterations of ALS (recommended: 10-20)
   * @param lambda     regularization factor (recommended: 0.01)
   * @param blocks     level of parallelism to split computation into
   * @param seed       random seed
   */
  public  org.apache.spark.mllib.recommendation.MatrixFactorizationModel train (org.apache.spark.rdd.RDD<org.apache.spark.mllib.recommendation.Rating> ratings, int rank, int iterations, double lambda, int blocks, long seed) { throw new RuntimeException(); }
  /**
   * Train a matrix factorization model given an RDD of ratings given by users to some products,
   * in the form of (userID, productID, rating) pairs. We approximate the ratings matrix as the
   * product of two lower-rank matrices of a given rank (number of features). To solve for these
   * features, we run a given number of iterations of ALS. This is done using a level of
   * parallelism given by <code>blocks</code>.
   * <p>
   * @param ratings    RDD of (userID, productID, rating) pairs
   * @param rank       number of features to use
   * @param iterations number of iterations of ALS (recommended: 10-20)
   * @param lambda     regularization factor (recommended: 0.01)
   * @param blocks     level of parallelism to split computation into
   */
  public  org.apache.spark.mllib.recommendation.MatrixFactorizationModel train (org.apache.spark.rdd.RDD<org.apache.spark.mllib.recommendation.Rating> ratings, int rank, int iterations, double lambda, int blocks) { throw new RuntimeException(); }
  /**
   * Train a matrix factorization model given an RDD of ratings given by users to some products,
   * in the form of (userID, productID, rating) pairs. We approximate the ratings matrix as the
   * product of two lower-rank matrices of a given rank (number of features). To solve for these
   * features, we run a given number of iterations of ALS. The level of parallelism is determined
   * automatically based on the number of partitions in <code>ratings</code>.
   * <p>
   * @param ratings    RDD of (userID, productID, rating) pairs
   * @param rank       number of features to use
   * @param iterations number of iterations of ALS (recommended: 10-20)
   * @param lambda     regularization factor (recommended: 0.01)
   */
  public  org.apache.spark.mllib.recommendation.MatrixFactorizationModel train (org.apache.spark.rdd.RDD<org.apache.spark.mllib.recommendation.Rating> ratings, int rank, int iterations, double lambda) { throw new RuntimeException(); }
  /**
   * Train a matrix factorization model given an RDD of ratings given by users to some products,
   * in the form of (userID, productID, rating) pairs. We approximate the ratings matrix as the
   * product of two lower-rank matrices of a given rank (number of features). To solve for these
   * features, we run a given number of iterations of ALS. The level of parallelism is determined
   * automatically based on the number of partitions in <code>ratings</code>.
   * <p>
   * @param ratings    RDD of (userID, productID, rating) pairs
   * @param rank       number of features to use
   * @param iterations number of iterations of ALS (recommended: 10-20)
   */
  public  org.apache.spark.mllib.recommendation.MatrixFactorizationModel train (org.apache.spark.rdd.RDD<org.apache.spark.mllib.recommendation.Rating> ratings, int rank, int iterations) { throw new RuntimeException(); }
  /**
   * Train a matrix factorization model given an RDD of 'implicit preferences' given by users
   * to some products, in the form of (userID, productID, preference) pairs. We approximate the
   * ratings matrix as the product of two lower-rank matrices of a given rank (number of features).
   * To solve for these features, we run a given number of iterations of ALS. This is done using
   * a level of parallelism given by <code>blocks</code>.
   * <p>
   * @param ratings    RDD of (userID, productID, rating) pairs
   * @param rank       number of features to use
   * @param iterations number of iterations of ALS (recommended: 10-20)
   * @param lambda     regularization factor (recommended: 0.01)
   * @param blocks     level of parallelism to split computation into
   * @param alpha      confidence parameter
   * @param seed       random seed
   */
  public  org.apache.spark.mllib.recommendation.MatrixFactorizationModel trainImplicit (org.apache.spark.rdd.RDD<org.apache.spark.mllib.recommendation.Rating> ratings, int rank, int iterations, double lambda, int blocks, double alpha, long seed) { throw new RuntimeException(); }
  /**
   * Train a matrix factorization model given an RDD of 'implicit preferences' given by users
   * to some products, in the form of (userID, productID, preference) pairs. We approximate the
   * ratings matrix as the product of two lower-rank matrices of a given rank (number of features).
   * To solve for these features, we run a given number of iterations of ALS. This is done using
   * a level of parallelism given by <code>blocks</code>.
   * <p>
   * @param ratings    RDD of (userID, productID, rating) pairs
   * @param rank       number of features to use
   * @param iterations number of iterations of ALS (recommended: 10-20)
   * @param lambda     regularization factor (recommended: 0.01)
   * @param blocks     level of parallelism to split computation into
   * @param alpha      confidence parameter
   */
  public  org.apache.spark.mllib.recommendation.MatrixFactorizationModel trainImplicit (org.apache.spark.rdd.RDD<org.apache.spark.mllib.recommendation.Rating> ratings, int rank, int iterations, double lambda, int blocks, double alpha) { throw new RuntimeException(); }
  /**
   * Train a matrix factorization model given an RDD of 'implicit preferences' given by users to
   * some products, in the form of (userID, productID, preference) pairs. We approximate the
   * ratings matrix as the product of two lower-rank matrices of a given rank (number of features).
   * To solve for these features, we run a given number of iterations of ALS. The level of
   * parallelism is determined automatically based on the number of partitions in <code>ratings</code>.
   * <p>
   * @param ratings    RDD of (userID, productID, rating) pairs
   * @param rank       number of features to use
   * @param iterations number of iterations of ALS (recommended: 10-20)
   * @param lambda     regularization factor (recommended: 0.01)
   * @param alpha      confidence parameter
   */
  public  org.apache.spark.mllib.recommendation.MatrixFactorizationModel trainImplicit (org.apache.spark.rdd.RDD<org.apache.spark.mllib.recommendation.Rating> ratings, int rank, int iterations, double lambda, double alpha) { throw new RuntimeException(); }
  /**
   * Train a matrix factorization model given an RDD of 'implicit preferences' ratings given by
   * users to some products, in the form of (userID, productID, rating) pairs. We approximate the
   * ratings matrix as the product of two lower-rank matrices of a given rank (number of features).
   * To solve for these features, we run a given number of iterations of ALS. The level of
   * parallelism is determined automatically based on the number of partitions in <code>ratings</code>.
   * Model parameters <code>alpha</code> and <code>lambda</code> are set to reasonable default values
   * <p>
   * @param ratings    RDD of (userID, productID, rating) pairs
   * @param rank       number of features to use
   * @param iterations number of iterations of ALS (recommended: 10-20)
   */
  public  org.apache.spark.mllib.recommendation.MatrixFactorizationModel trainImplicit (org.apache.spark.rdd.RDD<org.apache.spark.mllib.recommendation.Rating> ratings, int rank, int iterations) { throw new RuntimeException(); }
  /**
   * :: DeveloperApi ::
   * Given an RDD of ratings, number of user blocks, and number of product blocks, computes the
   * statistics of each block in ALS computation. This is useful for estimating cost and diagnosing
   * load balance.
   * <p>
   * @param ratings an RDD of ratings
   * @param numUserBlocks number of user blocks
   * @param numProductBlocks number of product blocks
   * @return statistics of user blocks and product blocks
   */
  public  org.apache.spark.mllib.recommendation.ALS.BlockStats[] analyzeBlocks (org.apache.spark.rdd.RDD<org.apache.spark.mllib.recommendation.Rating> ratings, int numUserBlocks, int numProductBlocks) { throw new RuntimeException(); }
  private  scala.collection.immutable.Map<java.lang.Object, java.lang.Object> countRatings (org.apache.spark.rdd.RDD<scala.Tuple2<java.lang.Object, org.apache.spark.mllib.recommendation.InLinkBlock>> inLinks) { throw new RuntimeException(); }
}
