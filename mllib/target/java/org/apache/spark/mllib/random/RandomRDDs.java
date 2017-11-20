package org.apache.spark.mllib.random;
// no position
/**
 * :: Experimental ::
 * Generator methods for creating RDDs comprised of i.i.d. samples from some distribution.
 */
public  class RandomRDDs {
  /**
   * Generates an RDD comprised of i.i.d. samples from the uniform distribution <code>U(0.0, 1.0)</code>.
   * <p>
   * To transform the distribution in the generated RDD from <code>U(0.0, 1.0)</code> to <code>U(a, b)</code>, use
   * <code>RandomRDDs.uniformRDD(sc, n, p, seed).map(v => a + (b - a) * v)</code>.
   * <p>
   * @param sc SparkContext used to create the RDD.
   * @param size Size of the RDD.
   * @param numPartitions Number of partitions in the RDD (default: <code>sc.defaultParallelism</code>).
   * @param seed Random seed (default: a random long integer).
   * @return RDD[Double] comprised of i.i.d. samples ~ <code>U(0.0, 1.0)</code>.
   */
  static public  org.apache.spark.rdd.RDD<java.lang.Object> uniformRDD (org.apache.spark.SparkContext sc, long size, int numPartitions, long seed) { throw new RuntimeException(); }
  /**
   * Java-friendly version of {@link RandomRDDs#uniformRDD}.
   */
  static public  org.apache.spark.api.java.JavaDoubleRDD uniformJavaRDD (org.apache.spark.api.java.JavaSparkContext jsc, long size, int numPartitions, long seed) { throw new RuntimeException(); }
  /**
   * {@link RandomRDDs#uniformJavaRDD} with the default seed.
   */
  static public  org.apache.spark.api.java.JavaDoubleRDD uniformJavaRDD (org.apache.spark.api.java.JavaSparkContext jsc, long size, int numPartitions) { throw new RuntimeException(); }
  /**
   * {@link RandomRDDs#uniformJavaRDD} with the default number of partitions and the default seed.
   */
  static public  org.apache.spark.api.java.JavaDoubleRDD uniformJavaRDD (org.apache.spark.api.java.JavaSparkContext jsc, long size) { throw new RuntimeException(); }
  /**
   * Generates an RDD comprised of i.i.d. samples from the standard normal distribution.
   * <p>
   * To transform the distribution in the generated RDD from standard normal to some other normal
   * <code>N(mean, sigma^2^)</code>, use <code>RandomRDDs.normalRDD(sc, n, p, seed).map(v => mean + sigma * v)</code>.
   * <p>
   * @param sc SparkContext used to create the RDD.
   * @param size Size of the RDD.
   * @param numPartitions Number of partitions in the RDD (default: <code>sc.defaultParallelism</code>).
   * @param seed Random seed (default: a random long integer).
   * @return RDD[Double] comprised of i.i.d. samples ~ N(0.0, 1.0).
   */
  static public  org.apache.spark.rdd.RDD<java.lang.Object> normalRDD (org.apache.spark.SparkContext sc, long size, int numPartitions, long seed) { throw new RuntimeException(); }
  /**
   * Java-friendly version of {@link RandomRDDs#normalRDD}.
   */
  static public  org.apache.spark.api.java.JavaDoubleRDD normalJavaRDD (org.apache.spark.api.java.JavaSparkContext jsc, long size, int numPartitions, long seed) { throw new RuntimeException(); }
  /**
   * {@link RandomRDDs#normalJavaRDD} with the default seed.
   */
  static public  org.apache.spark.api.java.JavaDoubleRDD normalJavaRDD (org.apache.spark.api.java.JavaSparkContext jsc, long size, int numPartitions) { throw new RuntimeException(); }
  /**
   * {@link RandomRDDs#normalJavaRDD} with the default number of partitions and the default seed.
   */
  static public  org.apache.spark.api.java.JavaDoubleRDD normalJavaRDD (org.apache.spark.api.java.JavaSparkContext jsc, long size) { throw new RuntimeException(); }
  /**
   * Generates an RDD comprised of i.i.d. samples from the Poisson distribution with the input mean.
   * <p>
   * @param sc SparkContext used to create the RDD.
   * @param mean Mean, or lambda, for the Poisson distribution.
   * @param size Size of the RDD.
   * @param numPartitions Number of partitions in the RDD (default: <code>sc.defaultParallelism</code>).
   * @param seed Random seed (default: a random long integer).
   * @return RDD[Double] comprised of i.i.d. samples ~ Pois(mean).
   */
  static public  org.apache.spark.rdd.RDD<java.lang.Object> poissonRDD (org.apache.spark.SparkContext sc, double mean, long size, int numPartitions, long seed) { throw new RuntimeException(); }
  /**
   * Java-friendly version of {@link RandomRDDs#poissonRDD}.
   */
  static public  org.apache.spark.api.java.JavaDoubleRDD poissonJavaRDD (org.apache.spark.api.java.JavaSparkContext jsc, double mean, long size, int numPartitions, long seed) { throw new RuntimeException(); }
  /**
   * {@link RandomRDDs#poissonJavaRDD} with the default seed.
   */
  static public  org.apache.spark.api.java.JavaDoubleRDD poissonJavaRDD (org.apache.spark.api.java.JavaSparkContext jsc, double mean, long size, int numPartitions) { throw new RuntimeException(); }
  /**
   * {@link RandomRDDs#poissonJavaRDD} with the default number of partitions and the default seed.
   */
  static public  org.apache.spark.api.java.JavaDoubleRDD poissonJavaRDD (org.apache.spark.api.java.JavaSparkContext jsc, double mean, long size) { throw new RuntimeException(); }
  /**
   * Generates an RDD comprised of i.i.d. samples from the exponential distribution with
   * the input mean.
   * <p>
   * @param sc SparkContext used to create the RDD.
   * @param mean Mean, or 1 / lambda, for the exponential distribution.
   * @param size Size of the RDD.
   * @param numPartitions Number of partitions in the RDD (default: <code>sc.defaultParallelism</code>).
   * @param seed Random seed (default: a random long integer).
   * @return RDD[Double] comprised of i.i.d. samples ~ Pois(mean).
   */
  static public  org.apache.spark.rdd.RDD<java.lang.Object> exponentialRDD (org.apache.spark.SparkContext sc, double mean, long size, int numPartitions, long seed) { throw new RuntimeException(); }
  /**
   * Java-friendly version of {@link RandomRDDs#exponentialRDD}.
   */
  static public  org.apache.spark.api.java.JavaDoubleRDD exponentialJavaRDD (org.apache.spark.api.java.JavaSparkContext jsc, double mean, long size, int numPartitions, long seed) { throw new RuntimeException(); }
  /**
   * {@link RandomRDDs#exponentialJavaRDD} with the default seed.
   */
  static public  org.apache.spark.api.java.JavaDoubleRDD exponentialJavaRDD (org.apache.spark.api.java.JavaSparkContext jsc, double mean, long size, int numPartitions) { throw new RuntimeException(); }
  /**
   * {@link RandomRDDs#exponentialJavaRDD} with the default number of partitions and the default seed.
   */
  static public  org.apache.spark.api.java.JavaDoubleRDD exponentialJavaRDD (org.apache.spark.api.java.JavaSparkContext jsc, double mean, long size) { throw new RuntimeException(); }
  /**
   * Generates an RDD comprised of i.i.d. samples from the gamma distribution with the input
   *  shape and scale.
   * <p>
   * @param sc SparkContext used to create the RDD.
   * @param shape shape parameter (> 0) for the gamma distribution
   * @param scale scale parameter (> 0) for the gamma distribution  
   * @param size Size of the RDD.
   * @param numPartitions Number of partitions in the RDD (default: <code>sc.defaultParallelism</code>).
   * @param seed Random seed (default: a random long integer).
   * @return RDD[Double] comprised of i.i.d. samples ~ Pois(mean).
   */
  static public  org.apache.spark.rdd.RDD<java.lang.Object> gammaRDD (org.apache.spark.SparkContext sc, double shape, double scale, long size, int numPartitions, long seed) { throw new RuntimeException(); }
  /**
   * Java-friendly version of {@link RandomRDDs#gammaRDD}.
   */
  static public  org.apache.spark.api.java.JavaDoubleRDD gammaJavaRDD (org.apache.spark.api.java.JavaSparkContext jsc, double shape, double scale, long size, int numPartitions, long seed) { throw new RuntimeException(); }
  /**
   * {@link RandomRDDs#gammaJavaRDD} with the default seed.
   */
  static public  org.apache.spark.api.java.JavaDoubleRDD gammaJavaRDD (org.apache.spark.api.java.JavaSparkContext jsc, double shape, double scale, long size, int numPartitions) { throw new RuntimeException(); }
  /**
   * {@link RandomRDDs#gammaJavaRDD} with the default number of partitions and the default seed.
   */
  static public  org.apache.spark.api.java.JavaDoubleRDD gammaJavaRDD (org.apache.spark.api.java.JavaSparkContext jsc, double shape, double scale, long size) { throw new RuntimeException(); }
  /**
   * Generates an RDD comprised of i.i.d. samples from the log normal distribution with the input
   *  mean and standard deviation
   * <p>
   * @param sc SparkContext used to create the RDD.
   * @param mean mean for the log normal distribution
   * @param std standard deviation for the log normal distribution  
   * @param size Size of the RDD.
   * @param numPartitions Number of partitions in the RDD (default: <code>sc.defaultParallelism</code>).
   * @param seed Random seed (default: a random long integer).
   * @return RDD[Double] comprised of i.i.d. samples ~ Pois(mean).
   */
  static public  org.apache.spark.rdd.RDD<java.lang.Object> logNormalRDD (org.apache.spark.SparkContext sc, double mean, double std, long size, int numPartitions, long seed) { throw new RuntimeException(); }
  /**
   * Java-friendly version of {@link RandomRDDs#logNormalRDD}.
   */
  static public  org.apache.spark.api.java.JavaDoubleRDD logNormalJavaRDD (org.apache.spark.api.java.JavaSparkContext jsc, double mean, double std, long size, int numPartitions, long seed) { throw new RuntimeException(); }
  /**
   * {@link RandomRDDs#logNormalJavaRDD} with the default seed.
   */
  static public  org.apache.spark.api.java.JavaDoubleRDD logNormalJavaRDD (org.apache.spark.api.java.JavaSparkContext jsc, double mean, double std, long size, int numPartitions) { throw new RuntimeException(); }
  /**
   * {@link RandomRDDs#logNormalJavaRDD} with the default number of partitions and the default seed.
   */
  static public  org.apache.spark.api.java.JavaDoubleRDD logNormalJavaRDD (org.apache.spark.api.java.JavaSparkContext jsc, double mean, double std, long size) { throw new RuntimeException(); }
  /**
   * :: DeveloperApi ::
   * Generates an RDD comprised of i.i.d. samples produced by the input RandomDataGenerator.
   * <p>
   * @param sc SparkContext used to create the RDD.
   * @param generator RandomDataGenerator used to populate the RDD.
   * @param size Size of the RDD.
   * @param numPartitions Number of partitions in the RDD (default: <code>sc.defaultParallelism</code>).
   * @param seed Random seed (default: a random long integer).
   * @return RDD[Double] comprised of i.i.d. samples produced by generator.
   */
  static public <T extends java.lang.Object> org.apache.spark.rdd.RDD<T> randomRDD (org.apache.spark.SparkContext sc, org.apache.spark.mllib.random.RandomDataGenerator<T> generator, long size, int numPartitions, long seed, scala.reflect.ClassTag<T> evidence$1) { throw new RuntimeException(); }
  /**
   * Generates an RDD[Vector] with vectors containing i.i.d. samples drawn from the
   * uniform distribution on <code>U(0.0, 1.0)</code>.
   * <p>
   * @param sc SparkContext used to create the RDD.
   * @param numRows Number of Vectors in the RDD.
   * @param numCols Number of elements in each Vector.
   * @param numPartitions Number of partitions in the RDD.
   * @param seed Seed for the RNG that generates the seed for the generator in each partition.
   * @return RDD[Vector] with vectors containing i.i.d samples ~ <code>U(0.0, 1.0)</code>.
   */
  static public  org.apache.spark.rdd.RDD<org.apache.spark.mllib.linalg.Vector> uniformVectorRDD (org.apache.spark.SparkContext sc, long numRows, int numCols, int numPartitions, long seed) { throw new RuntimeException(); }
  /**
   * Java-friendly version of {@link RandomRDDs#uniformVectorRDD}.
   */
  static public  org.apache.spark.api.java.JavaRDD<org.apache.spark.mllib.linalg.Vector> uniformJavaVectorRDD (org.apache.spark.api.java.JavaSparkContext jsc, long numRows, int numCols, int numPartitions, long seed) { throw new RuntimeException(); }
  /**
   * {@link RandomRDDs#uniformJavaVectorRDD} with the default seed.
   */
  static public  org.apache.spark.api.java.JavaRDD<org.apache.spark.mllib.linalg.Vector> uniformJavaVectorRDD (org.apache.spark.api.java.JavaSparkContext jsc, long numRows, int numCols, int numPartitions) { throw new RuntimeException(); }
  /**
   * {@link RandomRDDs#uniformJavaVectorRDD} with the default number of partitions and the default seed.
   */
  static public  org.apache.spark.api.java.JavaRDD<org.apache.spark.mllib.linalg.Vector> uniformJavaVectorRDD (org.apache.spark.api.java.JavaSparkContext jsc, long numRows, int numCols) { throw new RuntimeException(); }
  /**
   * Generates an RDD[Vector] with vectors containing i.i.d. samples drawn from the
   * standard normal distribution.
   * <p>
   * @param sc SparkContext used to create the RDD.
   * @param numRows Number of Vectors in the RDD.
   * @param numCols Number of elements in each Vector.
   * @param numPartitions Number of partitions in the RDD (default: <code>sc.defaultParallelism</code>).
   * @param seed Random seed (default: a random long integer).
   * @return RDD[Vector] with vectors containing i.i.d. samples ~ <code>N(0.0, 1.0)</code>.
   */
  static public  org.apache.spark.rdd.RDD<org.apache.spark.mllib.linalg.Vector> normalVectorRDD (org.apache.spark.SparkContext sc, long numRows, int numCols, int numPartitions, long seed) { throw new RuntimeException(); }
  /**
   * Java-friendly version of {@link RandomRDDs#normalVectorRDD}.
   */
  static public  org.apache.spark.api.java.JavaRDD<org.apache.spark.mllib.linalg.Vector> normalJavaVectorRDD (org.apache.spark.api.java.JavaSparkContext jsc, long numRows, int numCols, int numPartitions, long seed) { throw new RuntimeException(); }
  /**
   * {@link RandomRDDs#normalJavaVectorRDD} with the default seed.
   */
  static public  org.apache.spark.api.java.JavaRDD<org.apache.spark.mllib.linalg.Vector> normalJavaVectorRDD (org.apache.spark.api.java.JavaSparkContext jsc, long numRows, int numCols, int numPartitions) { throw new RuntimeException(); }
  /**
   * {@link RandomRDDs#normalJavaVectorRDD} with the default number of partitions and the default seed.
   */
  static public  org.apache.spark.api.java.JavaRDD<org.apache.spark.mllib.linalg.Vector> normalJavaVectorRDD (org.apache.spark.api.java.JavaSparkContext jsc, long numRows, int numCols) { throw new RuntimeException(); }
  /**
   * Generates an RDD[Vector] with vectors containing i.i.d. samples drawn from a
   * log normal distribution.
   * <p>
   * @param sc SparkContext used to create the RDD.
   * @param mean Mean of the log normal distribution.
   * @param std Standard deviation of the log normal distribution.
   * @param numRows Number of Vectors in the RDD.
   * @param numCols Number of elements in each Vector.
   * @param numPartitions Number of partitions in the RDD (default: <code>sc.defaultParallelism</code>).
   * @param seed Random seed (default: a random long integer).
   * @return RDD[Vector] with vectors containing i.i.d. samples.
   */
  static public  org.apache.spark.rdd.RDD<org.apache.spark.mllib.linalg.Vector> logNormalVectorRDD (org.apache.spark.SparkContext sc, double mean, double std, long numRows, int numCols, int numPartitions, long seed) { throw new RuntimeException(); }
  /**
   * Java-friendly version of {@link RandomRDDs#logNormalVectorRDD}.
   */
  static public  org.apache.spark.api.java.JavaRDD<org.apache.spark.mllib.linalg.Vector> logNormalJavaVectorRDD (org.apache.spark.api.java.JavaSparkContext jsc, double mean, double std, long numRows, int numCols, int numPartitions, long seed) { throw new RuntimeException(); }
  /**
   * {@link RandomRDDs#logNormalJavaVectorRDD} with the default seed.
   */
  static public  org.apache.spark.api.java.JavaRDD<org.apache.spark.mllib.linalg.Vector> logNormalJavaVectorRDD (org.apache.spark.api.java.JavaSparkContext jsc, double mean, double std, long numRows, int numCols, int numPartitions) { throw new RuntimeException(); }
  /**
   * {@link RandomRDDs#logNormalJavaVectorRDD} with the default number of partitions and
   * the default seed.
   */
  static public  org.apache.spark.api.java.JavaRDD<org.apache.spark.mllib.linalg.Vector> logNormalJavaVectorRDD (org.apache.spark.api.java.JavaSparkContext jsc, double mean, double std, long numRows, int numCols) { throw new RuntimeException(); }
  /**
   * Generates an RDD[Vector] with vectors containing i.i.d. samples drawn from the
   * Poisson distribution with the input mean.
   * <p>
   * @param sc SparkContext used to create the RDD.
   * @param mean Mean, or lambda, for the Poisson distribution.
   * @param numRows Number of Vectors in the RDD.
   * @param numCols Number of elements in each Vector.
   * @param numPartitions Number of partitions in the RDD (default: <code>sc.defaultParallelism</code>)
   * @param seed Random seed (default: a random long integer).
   * @return RDD[Vector] with vectors containing i.i.d. samples ~ Pois(mean).
   */
  static public  org.apache.spark.rdd.RDD<org.apache.spark.mllib.linalg.Vector> poissonVectorRDD (org.apache.spark.SparkContext sc, double mean, long numRows, int numCols, int numPartitions, long seed) { throw new RuntimeException(); }
  /**
   * Java-friendly version of {@link RandomRDDs#poissonVectorRDD}.
   */
  static public  org.apache.spark.api.java.JavaRDD<org.apache.spark.mllib.linalg.Vector> poissonJavaVectorRDD (org.apache.spark.api.java.JavaSparkContext jsc, double mean, long numRows, int numCols, int numPartitions, long seed) { throw new RuntimeException(); }
  /**
   * {@link RandomRDDs#poissonJavaVectorRDD} with the default seed.
   */
  static public  org.apache.spark.api.java.JavaRDD<org.apache.spark.mllib.linalg.Vector> poissonJavaVectorRDD (org.apache.spark.api.java.JavaSparkContext jsc, double mean, long numRows, int numCols, int numPartitions) { throw new RuntimeException(); }
  /**
   * {@link RandomRDDs#poissonJavaVectorRDD} with the default number of partitions and the default seed.
   */
  static public  org.apache.spark.api.java.JavaRDD<org.apache.spark.mllib.linalg.Vector> poissonJavaVectorRDD (org.apache.spark.api.java.JavaSparkContext jsc, double mean, long numRows, int numCols) { throw new RuntimeException(); }
  /**
   * Generates an RDD[Vector] with vectors containing i.i.d. samples drawn from the
   * exponential distribution with the input mean.
   * <p>
   * @param sc SparkContext used to create the RDD.
   * @param mean Mean, or 1 / lambda, for the Exponential distribution.
   * @param numRows Number of Vectors in the RDD.
   * @param numCols Number of elements in each Vector.
   * @param numPartitions Number of partitions in the RDD (default: <code>sc.defaultParallelism</code>)
   * @param seed Random seed (default: a random long integer).
   * @return RDD[Vector] with vectors containing i.i.d. samples ~ Exp(mean).
   */
  static public  org.apache.spark.rdd.RDD<org.apache.spark.mllib.linalg.Vector> exponentialVectorRDD (org.apache.spark.SparkContext sc, double mean, long numRows, int numCols, int numPartitions, long seed) { throw new RuntimeException(); }
  /**
   * Java-friendly version of {@link RandomRDDs#exponentialVectorRDD}.
   */
  static public  org.apache.spark.api.java.JavaRDD<org.apache.spark.mllib.linalg.Vector> exponentialJavaVectorRDD (org.apache.spark.api.java.JavaSparkContext jsc, double mean, long numRows, int numCols, int numPartitions, long seed) { throw new RuntimeException(); }
  /**
   * {@link RandomRDDs#exponentialJavaVectorRDD} with the default seed.
   */
  static public  org.apache.spark.api.java.JavaRDD<org.apache.spark.mllib.linalg.Vector> exponentialJavaVectorRDD (org.apache.spark.api.java.JavaSparkContext jsc, double mean, long numRows, int numCols, int numPartitions) { throw new RuntimeException(); }
  /**
   * {@link RandomRDDs#exponentialJavaVectorRDD} with the default number of partitions
   * and the default seed.
   */
  static public  org.apache.spark.api.java.JavaRDD<org.apache.spark.mllib.linalg.Vector> exponentialJavaVectorRDD (org.apache.spark.api.java.JavaSparkContext jsc, double mean, long numRows, int numCols) { throw new RuntimeException(); }
  /**
   * Generates an RDD[Vector] with vectors containing i.i.d. samples drawn from the
   * gamma distribution with the input shape and scale.
   * <p>
   * @param sc SparkContext used to create the RDD.
   * @param shape shape parameter (> 0) for the gamma distribution.
   * @param scale scale parameter (> 0) for the gamma distribution. 
   * @param numRows Number of Vectors in the RDD.
   * @param numCols Number of elements in each Vector.
   * @param numPartitions Number of partitions in the RDD (default: <code>sc.defaultParallelism</code>)
   * @param seed Random seed (default: a random long integer).
   * @return RDD[Vector] with vectors containing i.i.d. samples ~ Exp(mean).
   */
  static public  org.apache.spark.rdd.RDD<org.apache.spark.mllib.linalg.Vector> gammaVectorRDD (org.apache.spark.SparkContext sc, double shape, double scale, long numRows, int numCols, int numPartitions, long seed) { throw new RuntimeException(); }
  /**
   * Java-friendly version of {@link RandomRDDs#gammaVectorRDD}.
   */
  static public  org.apache.spark.api.java.JavaRDD<org.apache.spark.mllib.linalg.Vector> gammaJavaVectorRDD (org.apache.spark.api.java.JavaSparkContext jsc, double shape, double scale, long numRows, int numCols, int numPartitions, long seed) { throw new RuntimeException(); }
  /**
   * {@link RandomRDDs#gammaJavaVectorRDD} with the default seed.
   */
  static public  org.apache.spark.api.java.JavaRDD<org.apache.spark.mllib.linalg.Vector> gammaJavaVectorRDD (org.apache.spark.api.java.JavaSparkContext jsc, double shape, double scale, long numRows, int numCols, int numPartitions) { throw new RuntimeException(); }
  /**
   * {@link RandomRDDs#gammaJavaVectorRDD} with the default number of partitions and the default seed.
   */
  static public  org.apache.spark.api.java.JavaRDD<org.apache.spark.mllib.linalg.Vector> gammaJavaVectorRDD (org.apache.spark.api.java.JavaSparkContext jsc, double shape, double scale, long numRows, int numCols) { throw new RuntimeException(); }
  /**
   * :: DeveloperApi ::
   * Generates an RDD[Vector] with vectors containing i.i.d. samples produced by the
   * input RandomDataGenerator.
   * <p>
   * @param sc SparkContext used to create the RDD.
   * @param generator RandomDataGenerator used to populate the RDD.
   * @param numRows Number of Vectors in the RDD.
   * @param numCols Number of elements in each Vector.
   * @param numPartitions Number of partitions in the RDD (default: <code>sc.defaultParallelism</code>).
   * @param seed Random seed (default: a random long integer).
   * @return RDD[Vector] with vectors containing i.i.d. samples produced by generator.
   */
  static public  org.apache.spark.rdd.RDD<org.apache.spark.mllib.linalg.Vector> randomVectorRDD (org.apache.spark.SparkContext sc, org.apache.spark.mllib.random.RandomDataGenerator<java.lang.Object> generator, long numRows, int numCols, int numPartitions, long seed) { throw new RuntimeException(); }
  /**
   * Returns <code>numPartitions</code> if it is positive, or <code>sc.defaultParallelism</code> otherwise.
   */
  static private  int numPartitionsOrDefault (org.apache.spark.SparkContext sc, int numPartitions) { throw new RuntimeException(); }
}
