package org.apache.spark.mllib.classification;
/**
 * Model for Naive Bayes Classifiers.
 * <p>
 * @param labels list of labels
 * @param pi log of class priors, whose dimension is C, number of labels
 * @param theta log of class conditional probabilities, whose dimension is C-by-D,
 *              where D is number of features
 */
public  class NaiveBayesModel implements org.apache.spark.mllib.classification.ClassificationModel, scala.Serializable {
  public  double[] labels () { throw new RuntimeException(); }
  public  double[] pi () { throw new RuntimeException(); }
  public  double[][] theta () { throw new RuntimeException(); }
  // not preceding
  public   NaiveBayesModel (double[] labels, double[] pi, double[][] theta) { throw new RuntimeException(); }
  private  breeze.linalg.DenseVector<java.lang.Object> brzPi () { throw new RuntimeException(); }
  private  breeze.linalg.DenseMatrix<java.lang.Object> brzTheta () { throw new RuntimeException(); }
  public  org.apache.spark.rdd.RDD<java.lang.Object> predict (org.apache.spark.rdd.RDD<org.apache.spark.mllib.linalg.Vector> testData) { throw new RuntimeException(); }
  public  double predict (org.apache.spark.mllib.linalg.Vector testData) { throw new RuntimeException(); }
}
