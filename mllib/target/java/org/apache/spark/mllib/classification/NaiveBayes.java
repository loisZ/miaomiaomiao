package org.apache.spark.mllib.classification;
/**
 * Trains a Naive Bayes model given an RDD of <code>(label, features)</code> pairs.
 * <p>
 * This is the Multinomial NB ({@link http://tinyurl.com/lsdw6p}) which can handle all kinds of
 * discrete data.  For example, by converting documents into TF-IDF vectors, it can be used for
 * document classification.  By making every vector a 0-1 vector, it can also be used as
 * Bernoulli NB ({@link http://tinyurl.com/p7c96j6}). The input feature values must be nonnegative.
 */
public  class NaiveBayes implements scala.Serializable, org.apache.spark.Logging {
  /**
   * Trains a Naive Bayes model given an RDD of <code>(label, features)</code> pairs.
   * <p>
   * This is the Multinomial NB ({@link http://tinyurl.com/lsdw6p}) which can handle all kinds of
   * discrete data.  For example, by converting documents into TF-IDF vectors, it can be used for
   * document classification.  By making every vector a 0-1 vector, it can also be used as
   * Bernoulli NB ({@link http://tinyurl.com/p7c96j6}).
   * <p>
   * This version of the method uses a default smoothing parameter of 1.0.
   * <p>
   * @param input RDD of <code>(label, array of features)</code> pairs.  Every vector should be a frequency
   *              vector or a count vector.
   */
  static public  org.apache.spark.mllib.classification.NaiveBayesModel train (org.apache.spark.rdd.RDD<org.apache.spark.mllib.regression.LabeledPoint> input) { throw new RuntimeException(); }
  /**
   * Trains a Naive Bayes model given an RDD of <code>(label, features)</code> pairs.
   * <p>
   * This is the Multinomial NB ({@link http://tinyurl.com/lsdw6p}) which can handle all kinds of
   * discrete data.  For example, by converting documents into TF-IDF vectors, it can be used for
   * document classification.  By making every vector a 0-1 vector, it can also be used as
   * Bernoulli NB ({@link http://tinyurl.com/p7c96j6}).
   * <p>
   * @param input RDD of <code>(label, array of features)</code> pairs.  Every vector should be a frequency
   *              vector or a count vector.
   * @param lambda The smoothing parameter
   */
  static public  org.apache.spark.mllib.classification.NaiveBayesModel train (org.apache.spark.rdd.RDD<org.apache.spark.mllib.regression.LabeledPoint> input, double lambda) { throw new RuntimeException(); }
  private  double lambda () { throw new RuntimeException(); }
  // not preceding
  private   NaiveBayes (double lambda) { throw new RuntimeException(); }
  public   NaiveBayes () { throw new RuntimeException(); }
  /** Set the smoothing parameter. Default: 1.0. */
  public  org.apache.spark.mllib.classification.NaiveBayes setLambda (double lambda) { throw new RuntimeException(); }
  /**
   * Run the algorithm with the configured parameters on an input RDD of LabeledPoint entries.
   * <p>
   * @param data RDD of {@link org.apache.spark.mllib.regression.LabeledPoint}.
   */
  public  org.apache.spark.mllib.classification.NaiveBayesModel run (org.apache.spark.rdd.RDD<org.apache.spark.mllib.regression.LabeledPoint> data) { throw new RuntimeException(); }
}
