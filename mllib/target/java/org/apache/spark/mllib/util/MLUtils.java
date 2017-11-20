package org.apache.spark.mllib.util;
// no position
/**
 * Helper methods to load, save and pre-process data used in ML Lib.
 */
public  class MLUtils {
  static public  double EPSILON () { throw new RuntimeException(); }
  /**
   * Loads labeled data in the LIBSVM format into an RDD[LabeledPoint].
   * The LIBSVM format is a text-based format used by LIBSVM and LIBLINEAR.
   * Each line represents a labeled sparse feature vector using the following format:
   * <pre><code>label index1:value1 index2:value2 ...</code></pre>
   * where the indices are one-based and in ascending order.
   * This method parses each line into a {&#64;link org.apache.spark.mllib.regression.LabeledPoint},
   * where the feature indices are converted to zero-based.
   *
   * &#64;param sc Spark context
   * &#64;param path file or directory path in any Hadoop-supported file system URI
   * &#64;param numFeatures number of features, which will be determined from the input data if a
   *                    nonpositive value is given. This is useful when the dataset is already split
   *                    into multiple files and you want to load them separately, because some
   *                    features may not present in certain files, which leads to inconsistent
   *                    feature dimensions.
   * &#64;param minPartitions min number of partitions
   * &#64;return labeled data stored as an RDD[LabeledPoint]
   */
  static public  org.apache.spark.rdd.RDD<org.apache.spark.mllib.regression.LabeledPoint> loadLibSVMFile (org.apache.spark.SparkContext sc, java.lang.String path, int numFeatures, int minPartitions) { throw new RuntimeException(); }
  static public  org.apache.spark.rdd.RDD<org.apache.spark.mllib.regression.LabeledPoint> loadLibSVMFile (org.apache.spark.SparkContext sc, java.lang.String path, boolean multiclass, int numFeatures, int minPartitions) { throw new RuntimeException(); }
  /**
   * Loads labeled data in the LIBSVM format into an RDD[LabeledPoint], with the default number of
   * partitions.
   */
  static public  org.apache.spark.rdd.RDD<org.apache.spark.mllib.regression.LabeledPoint> loadLibSVMFile (org.apache.spark.SparkContext sc, java.lang.String path, int numFeatures) { throw new RuntimeException(); }
  static public  org.apache.spark.rdd.RDD<org.apache.spark.mllib.regression.LabeledPoint> loadLibSVMFile (org.apache.spark.SparkContext sc, java.lang.String path, boolean multiclass, int numFeatures) { throw new RuntimeException(); }
  static public  org.apache.spark.rdd.RDD<org.apache.spark.mllib.regression.LabeledPoint> loadLibSVMFile (org.apache.spark.SparkContext sc, java.lang.String path, boolean multiclass) { throw new RuntimeException(); }
  /**
   * Loads binary labeled data in the LIBSVM format into an RDD[LabeledPoint], with number of
   * features determined automatically and the default number of partitions.
   */
  static public  org.apache.spark.rdd.RDD<org.apache.spark.mllib.regression.LabeledPoint> loadLibSVMFile (org.apache.spark.SparkContext sc, java.lang.String path) { throw new RuntimeException(); }
  /**
   * Save labeled data in LIBSVM format.
   * @param data an RDD of LabeledPoint to be saved
   * @param dir directory to save the data
   * <p>
   * @see org.apache.spark.mllib.util.MLUtils#loadLibSVMFile
   */
  static public  void saveAsLibSVMFile (org.apache.spark.rdd.RDD<org.apache.spark.mllib.regression.LabeledPoint> data, java.lang.String dir) { throw new RuntimeException(); }
  /**
   * Loads vectors saved using <code>RDD[Vector].saveAsTextFile</code>.
   * @param sc Spark context
   * @param path file or directory path in any Hadoop-supported file system URI
   * @param minPartitions min number of partitions
   * @return vectors stored as an RDD[Vector]
   */
  static public  org.apache.spark.rdd.RDD<org.apache.spark.mllib.linalg.Vector> loadVectors (org.apache.spark.SparkContext sc, java.lang.String path, int minPartitions) { throw new RuntimeException(); }
  /**
   * Loads vectors saved using <code>RDD[Vector].saveAsTextFile</code> with the default number of partitions.
   */
  static public  org.apache.spark.rdd.RDD<org.apache.spark.mllib.linalg.Vector> loadVectors (org.apache.spark.SparkContext sc, java.lang.String path) { throw new RuntimeException(); }
  /**
   * Loads labeled points saved using <code>RDD[LabeledPoint].saveAsTextFile</code>.
   * @param sc Spark context
   * @param path file or directory path in any Hadoop-supported file system URI
   * @param minPartitions min number of partitions
   * @return labeled points stored as an RDD[LabeledPoint]
   */
  static public  org.apache.spark.rdd.RDD<org.apache.spark.mllib.regression.LabeledPoint> loadLabeledPoints (org.apache.spark.SparkContext sc, java.lang.String path, int minPartitions) { throw new RuntimeException(); }
  /**
   * Loads labeled points saved using <code>RDD[LabeledPoint].saveAsTextFile</code> with the default number of
   * partitions.
   */
  static public  org.apache.spark.rdd.RDD<org.apache.spark.mllib.regression.LabeledPoint> loadLabeledPoints (org.apache.spark.SparkContext sc, java.lang.String dir) { throw new RuntimeException(); }
  /**
   * Load labeled data from a file. The data format used here is
   * L, f1 f2 ...
   * where f1, f2 are feature values in Double and L is the corresponding label as Double.
   * <p>
   * @param sc SparkContext
   * @param dir Directory to the input data files.
   * @return An RDD of LabeledPoint. Each labeled point has two elements: the first element is
   *         the label, and the second element represents the feature values (an array of Double).
   * <p>
   * @deprecated Should use {@link org.apache.spark.rdd.RDD#saveAsTextFile} for saving and
   *            {@link org.apache.spark.mllib.util.MLUtils#loadLabeledPoints} for loading.
   */
  static public  org.apache.spark.rdd.RDD<org.apache.spark.mllib.regression.LabeledPoint> loadLabeledData (org.apache.spark.SparkContext sc, java.lang.String dir) { throw new RuntimeException(); }
  /**
   * Save labeled data to a file. The data format used here is
   * L, f1 f2 ...
   * where f1, f2 are feature values in Double and L is the corresponding label as Double.
   * <p>
   * @param data An RDD of LabeledPoints containing data to be saved.
   * @param dir Directory to save the data.
   * <p>
   * @deprecated Should use {@link org.apache.spark.rdd.RDD#saveAsTextFile} for saving and
   *            {@link org.apache.spark.mllib.util.MLUtils#loadLabeledPoints} for loading.
   */
  static public  void saveLabeledData (org.apache.spark.rdd.RDD<org.apache.spark.mllib.regression.LabeledPoint> data, java.lang.String dir) { throw new RuntimeException(); }
  /**
   * :: Experimental ::
   * Return a k element array of pairs of RDDs with the first element of each pair
   * containing the training data, a complement of the validation data and the second
   * element, the validation data, containing a unique 1/kth of the data. Where k=numFolds.
   */
  static public <T extends java.lang.Object> scala.Tuple2<org.apache.spark.rdd.RDD<T>, org.apache.spark.rdd.RDD<T>>[] kFold (org.apache.spark.rdd.RDD<T> rdd, int numFolds, int seed, scala.reflect.ClassTag<T> evidence$1) { throw new RuntimeException(); }
  /**
   * Returns a new vector with <code>1.0</code> (bias) appended to the input vector.
   */
  static public  org.apache.spark.mllib.linalg.Vector appendBias (org.apache.spark.mllib.linalg.Vector vector) { throw new RuntimeException(); }
  /**
   * Returns the squared Euclidean distance between two vectors. The following formula will be used
   * if it does not introduce too much numerical error:
   * <pre>
   *   \|a - b\|_2^2 = \|a\|_2^2 + \|b\|_2^2 - 2 a^T b.
   * </pre>
   * When both vector norms are given, this is faster than computing the squared distance directly,
   * especially when one of the vectors is a sparse vector.
   * <p>
   * @param v1 the first vector
   * @param norm1 the norm of the first vector, non-negative
   * @param v2 the second vector
   * @param norm2 the norm of the second vector, non-negative
   * @param precision desired relative precision for the squared distance
   * @return squared distance between v1 and v2 within the specified precision
   */
  static public  double fastSquaredDistance (org.apache.spark.mllib.linalg.Vector v1, double norm1, org.apache.spark.mllib.linalg.Vector v2, double norm2, double precision) { throw new RuntimeException(); }
}
