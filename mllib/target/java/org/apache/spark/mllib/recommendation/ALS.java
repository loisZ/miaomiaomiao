package org.apache.spark.mllib.recommendation;
/**
 * Alternating Least Squares matrix factorization.
 * <p>
 * ALS attempts to estimate the ratings matrix <code>R</code> as the product of two lower-rank matrices,
 * <code>X</code> and <code>Y</code>, i.e. <code>X * Yt = R</code>. Typically these approximations are called 'factor' matrices.
 * The general approach is iterative. During each iteration, one of the factor matrices is held
 * constant, while the other is solved for using least squares. The newly-solved factor matrix is
 * then held constant while solving for the other factor matrix.
 * <p>
 * This is a blocked implementation of the ALS factorization algorithm that groups the two sets
 * of factors (referred to as "users" and "products") into blocks and reduces communication by only
 * sending one copy of each user vector to each product block on each iteration, and only for the
 * product blocks that need that user's feature vector. This is achieved by precomputing some
 * information about the ratings matrix to determine the "out-links" of each user (which blocks of
 * products it will contribute to) and "in-link" information for each product (which of the feature
 * vectors it receives from each user block it will depend on). This allows us to send only an
 * array of feature vectors between each user block and product block, and have the product block
 * find the users' ratings and update the products based on these messages.
 * <p>
 * For implicit preference data, the algorithm used is based on
 * "Collaborative Filtering for Implicit Feedback Datasets", available at
 * {@link http://dx.doi.org/10.1109/ICDM.2008.22}, adapted for the blocked approach used here.
 * <p>
 * Essentially instead of finding the low-rank approximations to the rating matrix <code>R</code>,
 * this finds the approximations for a preference matrix <code>P</code> where the elements of <code>P</code> are 1 if
 * r > 0 and 0 if r = 0. The ratings then act as 'confidence' values related to strength of
 * indicated user
 * preferences rather than explicit ratings given to items.
 */
public  class ALS implements scala.Serializable, org.apache.spark.Logging {
  /**
   * :: DeveloperApi ::
   * Statistics of a block in ALS computation.
   * <p>
   * @param category type of this block, "user" or "product"
   * @param index index of this block
   * @param count number of users or products inside this block, the same as the number of
   *              least-squares problems to solve on this block in each iteration
   * @param numRatings total number of ratings inside this block, the same as the number of outer
   *                   products we need to make on this block in each iteration
   * @param numInLinks total number of incoming links, the same as the number of vectors to retrieve
   *                   before each iteration
   * @param numOutLinks total number of outgoing links, the same as the number of vectors to send
   *                    for the next iteration
   */
  static public  class BlockStats implements scala.Product, scala.Serializable {
    public  java.lang.String category () { throw new RuntimeException(); }
    public  int index () { throw new RuntimeException(); }
    public  long count () { throw new RuntimeException(); }
    public  long numRatings () { throw new RuntimeException(); }
    public  long numInLinks () { throw new RuntimeException(); }
    public  long numOutLinks () { throw new RuntimeException(); }
    // not preceding
    public   BlockStats (java.lang.String category, int index, long count, long numRatings, long numInLinks, long numOutLinks) { throw new RuntimeException(); }
  }
  // no position
  static public  class BlockStats$ extends scala.runtime.AbstractFunction6<java.lang.String, java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object, org.apache.spark.mllib.recommendation.ALS.BlockStats> implements scala.Serializable {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final BlockStats$ MODULE$ = null;
    public   BlockStats$ () { throw new RuntimeException(); }
  }
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
  static public  org.apache.spark.mllib.recommendation.MatrixFactorizationModel train (org.apache.spark.rdd.RDD<org.apache.spark.mllib.recommendation.Rating> ratings, int rank, int iterations, double lambda, int blocks, long seed) { throw new RuntimeException(); }
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
  static public  org.apache.spark.mllib.recommendation.MatrixFactorizationModel train (org.apache.spark.rdd.RDD<org.apache.spark.mllib.recommendation.Rating> ratings, int rank, int iterations, double lambda, int blocks) { throw new RuntimeException(); }
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
  static public  org.apache.spark.mllib.recommendation.MatrixFactorizationModel train (org.apache.spark.rdd.RDD<org.apache.spark.mllib.recommendation.Rating> ratings, int rank, int iterations, double lambda) { throw new RuntimeException(); }
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
  static public  org.apache.spark.mllib.recommendation.MatrixFactorizationModel train (org.apache.spark.rdd.RDD<org.apache.spark.mllib.recommendation.Rating> ratings, int rank, int iterations) { throw new RuntimeException(); }
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
  static public  org.apache.spark.mllib.recommendation.MatrixFactorizationModel trainImplicit (org.apache.spark.rdd.RDD<org.apache.spark.mllib.recommendation.Rating> ratings, int rank, int iterations, double lambda, int blocks, double alpha, long seed) { throw new RuntimeException(); }
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
  static public  org.apache.spark.mllib.recommendation.MatrixFactorizationModel trainImplicit (org.apache.spark.rdd.RDD<org.apache.spark.mllib.recommendation.Rating> ratings, int rank, int iterations, double lambda, int blocks, double alpha) { throw new RuntimeException(); }
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
  static public  org.apache.spark.mllib.recommendation.MatrixFactorizationModel trainImplicit (org.apache.spark.rdd.RDD<org.apache.spark.mllib.recommendation.Rating> ratings, int rank, int iterations, double lambda, double alpha) { throw new RuntimeException(); }
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
  static public  org.apache.spark.mllib.recommendation.MatrixFactorizationModel trainImplicit (org.apache.spark.rdd.RDD<org.apache.spark.mllib.recommendation.Rating> ratings, int rank, int iterations) { throw new RuntimeException(); }
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
  static public  org.apache.spark.mllib.recommendation.ALS.BlockStats[] analyzeBlocks (org.apache.spark.rdd.RDD<org.apache.spark.mllib.recommendation.Rating> ratings, int numUserBlocks, int numProductBlocks) { throw new RuntimeException(); }
  static private  scala.collection.immutable.Map<java.lang.Object, java.lang.Object> countRatings (org.apache.spark.rdd.RDD<scala.Tuple2<java.lang.Object, org.apache.spark.mllib.recommendation.InLinkBlock>> inLinks) { throw new RuntimeException(); }
  private  int numUserBlocks () { throw new RuntimeException(); }
  private  int numProductBlocks () { throw new RuntimeException(); }
  private  int rank () { throw new RuntimeException(); }
  private  int iterations () { throw new RuntimeException(); }
  private  double lambda () { throw new RuntimeException(); }
  private  boolean implicitPrefs () { throw new RuntimeException(); }
  private  double alpha () { throw new RuntimeException(); }
  private  long seed () { throw new RuntimeException(); }
  // not preceding
  private   ALS (int numUserBlocks, int numProductBlocks, int rank, int iterations, double lambda, boolean implicitPrefs, double alpha, long seed) { throw new RuntimeException(); }
  /**
   * Constructs an ALS instance with default parameters: {numBlocks: -1, rank: 10, iterations: 10,
   * lambda: 0.01, implicitPrefs: false, alpha: 1.0}.
   */
  public   ALS () { throw new RuntimeException(); }
  /** If true, do alternating nonnegative least squares. */
  private  boolean nonnegative () { throw new RuntimeException(); }
  /** storage level for user/product in/out links */
  private  org.apache.spark.storage.StorageLevel intermediateRDDStorageLevel () { throw new RuntimeException(); }
  /**
   * Set the number of blocks for both user blocks and product blocks to parallelize the computation
   * into; pass -1 for an auto-configured number of blocks. Default: -1.
   */
  public  org.apache.spark.mllib.recommendation.ALS setBlocks (int numBlocks) { throw new RuntimeException(); }
  /**
   * Set the number of user blocks to parallelize the computation.
   */
  public  org.apache.spark.mllib.recommendation.ALS setUserBlocks (int numUserBlocks) { throw new RuntimeException(); }
  /**
   * Set the number of product blocks to parallelize the computation.
   */
  public  org.apache.spark.mllib.recommendation.ALS setProductBlocks (int numProductBlocks) { throw new RuntimeException(); }
  /** Set the rank of the feature matrices computed (number of features). Default: 10. */
  public  org.apache.spark.mllib.recommendation.ALS setRank (int rank) { throw new RuntimeException(); }
  /** Set the number of iterations to run. Default: 10. */
  public  org.apache.spark.mllib.recommendation.ALS setIterations (int iterations) { throw new RuntimeException(); }
  /** Set the regularization parameter, lambda. Default: 0.01. */
  public  org.apache.spark.mllib.recommendation.ALS setLambda (double lambda) { throw new RuntimeException(); }
  /** Sets whether to use implicit preference. Default: false. */
  public  org.apache.spark.mllib.recommendation.ALS setImplicitPrefs (boolean implicitPrefs) { throw new RuntimeException(); }
  /**
   * :: Experimental ::
   * Sets the constant used in computing confidence in implicit ALS. Default: 1.0.
   */
  public  org.apache.spark.mllib.recommendation.ALS setAlpha (double alpha) { throw new RuntimeException(); }
  /** Sets a random seed to have deterministic results. */
  public  org.apache.spark.mllib.recommendation.ALS setSeed (long seed) { throw new RuntimeException(); }
  /**
   * Set whether the least-squares problems solved at each iteration should have
   * nonnegativity constraints.
   */
  public  org.apache.spark.mllib.recommendation.ALS setNonnegative (boolean b) { throw new RuntimeException(); }
  /**
   * :: DeveloperApi ::
   * Sets storage level for intermediate RDDs (user/product in/out links). The default value is
   * <code>MEMORY_AND_DISK</code>. Users can change it to a serialized storage, e.g., <code>MEMORY_AND_DISK_SER</code> and
   * set <code>spark.rdd.compress</code> to <code>true</code> to reduce the space requirement, at the cost of speed.
   */
  public  org.apache.spark.mllib.recommendation.ALS setIntermediateRDDStorageLevel (org.apache.spark.storage.StorageLevel storageLevel) { throw new RuntimeException(); }
  /**
   * Run ALS with the configured parameters on an input RDD of (user, product, rating) triples.
   * Returns a MatrixFactorizationModel with feature vectors for each user and product.
   */
  public  org.apache.spark.mllib.recommendation.MatrixFactorizationModel run (org.apache.spark.rdd.RDD<org.apache.spark.mllib.recommendation.Rating> ratings) { throw new RuntimeException(); }
  /**
   * Java-friendly version of {@link ALS.run}.
   */
  public  org.apache.spark.mllib.recommendation.MatrixFactorizationModel run (org.apache.spark.api.java.JavaRDD<org.apache.spark.mllib.recommendation.Rating> ratings) { throw new RuntimeException(); }
  /**
   * Computes the (<code>rank x rank</code>) matrix <code>YtY</code>, where <code>Y</code> is the (<code>nui x rank</code>) matrix of factors
   * for each user (or product), in a distributed fashion.
   * <p>
   * @param factors the (block-distributed) user or product factor vectors
   * @return YtY - whose value is only used in the implicit preference model
   */
  private  org.jblas.DoubleMatrix computeYtY (org.apache.spark.rdd.RDD<scala.Tuple2<java.lang.Object, double[][]>> factors) { throw new RuntimeException(); }
  /**
   * Adds alpha * x * x.t to a matrix in-place. This is the same as BLAS's DSPR.
   * <p>
   * @param L the lower triangular part of the matrix packed in an array (row major)
   */
  private  void dspr (double alpha, org.jblas.DoubleMatrix x, org.jblas.DoubleMatrix L) { throw new RuntimeException(); }
  /**
   * Wrap a double array in a DoubleMatrix without creating garbage.
   * This is a temporary fix for jblas 1.2.3; it should be safe to move back to the
   * DoubleMatrix(double[]) constructor come jblas 1.2.4.
   */
  private  org.jblas.DoubleMatrix wrapDoubleArray (double[] v) { throw new RuntimeException(); }
  /**
   * Flatten out blocked user or product factors into an RDD of (id, factor vector) pairs
   */
  private  org.apache.spark.rdd.RDD<scala.Tuple2<java.lang.Object, double[]>> unblockFactors (org.apache.spark.rdd.RDD<scala.Tuple2<java.lang.Object, double[][]>> blockedFactors, org.apache.spark.rdd.RDD<scala.Tuple2<java.lang.Object, org.apache.spark.mllib.recommendation.OutLinkBlock>> outLinks) { throw new RuntimeException(); }
  /**
   * Make the out-links table for a block of the users (or products) dataset given the list of
   * (user, product, rating) values for the users in that block (or the opposite for products).
   */
  private  org.apache.spark.mllib.recommendation.OutLinkBlock makeOutLinkBlock (int numProductBlocks, org.apache.spark.mllib.recommendation.Rating[] ratings, org.apache.spark.Partitioner productPartitioner) { throw new RuntimeException(); }
  /**
   * Make the in-links table for a block of the users (or products) dataset given a list of
   * (user, product, rating) values for the users in that block (or the opposite for products).
   */
  private  org.apache.spark.mllib.recommendation.InLinkBlock makeInLinkBlock (int numProductBlocks, org.apache.spark.mllib.recommendation.Rating[] ratings, org.apache.spark.Partitioner productPartitioner) { throw new RuntimeException(); }
  /**
   * Make RDDs of InLinkBlocks and OutLinkBlocks given an RDD of (blockId, (u, p, r)) values for
   * the users (or (blockId, (p, u, r)) for the products). We create these simultaneously to avoid
   * having to shuffle the (blockId, (u, p, r)) RDD twice, or to cache it.
   */
  private  scala.Tuple2<org.apache.spark.rdd.RDD<scala.Tuple2<java.lang.Object, org.apache.spark.mllib.recommendation.InLinkBlock>>, org.apache.spark.rdd.RDD<scala.Tuple2<java.lang.Object, org.apache.spark.mllib.recommendation.OutLinkBlock>>> makeLinkRDDs (int numUserBlocks, int numProductBlocks, org.apache.spark.rdd.RDD<scala.Tuple2<java.lang.Object, org.apache.spark.mllib.recommendation.Rating>> ratingsByUserBlock, org.apache.spark.Partitioner productPartitioner) { throw new RuntimeException(); }
  /**
   * Make a random factor vector with the given random.
   */
  private  double[] randomFactor (int rank, scala.util.Random rand) { throw new RuntimeException(); }
  /**
   * Compute the user feature vectors given the current products (or vice-versa). This first joins
   * the products with their out-links to generate a set of messages to each destination block
   * (specifically, the features for the products that user block cares about), then groups these
   * by destination and joins them with the in-link info to figure out how to update each user.
   * It returns an RDD of new feature vectors for each user block.
   */
  private  org.apache.spark.rdd.RDD<scala.Tuple2<java.lang.Object, double[][]>> updateFeatures (int numUserBlocks, org.apache.spark.rdd.RDD<scala.Tuple2<java.lang.Object, double[][]>> products, org.apache.spark.rdd.RDD<scala.Tuple2<java.lang.Object, org.apache.spark.mllib.recommendation.OutLinkBlock>> productOutLinks, org.apache.spark.rdd.RDD<scala.Tuple2<java.lang.Object, org.apache.spark.mllib.recommendation.InLinkBlock>> userInLinks, int rank, double lambda, double alpha, scala.Option<org.apache.spark.broadcast.Broadcast<org.jblas.DoubleMatrix>> YtY) { throw new RuntimeException(); }
  /**
   * Compute the new feature vectors for a block of the users matrix given the list of factors
   * it received from each product and its InLinkBlock.
   */
  private  double[][] updateBlock (scala.collection.Iterable<scala.Tuple2<java.lang.Object, double[][]>> messages, org.apache.spark.mllib.recommendation.InLinkBlock inLinkBlock, int rank, double lambda, double alpha, scala.Option<org.apache.spark.broadcast.Broadcast<org.jblas.DoubleMatrix>> YtY) { throw new RuntimeException(); }
  /**
   * Given A^T A and A^T b, find the x minimising ||Ax - b||_2, possibly subject
   * to nonnegativity constraints if <code>nonnegative</code> is true.
   */
  public  double[] solveLeastSquares (org.jblas.DoubleMatrix ata, org.jblas.DoubleMatrix atb, org.apache.spark.mllib.optimization.NNLS.Workspace ws) { throw new RuntimeException(); }
  /**
   * Given a triangular matrix in the order of fillXtX above, compute the full symmetric square
   * matrix that it represents, storing it into destMatrix.
   */
  private  void fillFullMatrix (org.jblas.DoubleMatrix triangularMatrix, org.jblas.DoubleMatrix destMatrix) { throw new RuntimeException(); }
}
