package org.apache.spark.mllib.classification;
/**
 * Train a classification model for Logistic Regression using Limited-memory BFGS.
 * Standard feature scaling and L2 regularization are used by default.
 * NOTE: Labels used in Logistic Regression should be {0, 1}
 */
public  class LogisticRegressionWithLBFGS extends org.apache.spark.mllib.regression.GeneralizedLinearAlgorithm<org.apache.spark.mllib.classification.LogisticRegressionModel> implements scala.Serializable {
  public   LogisticRegressionWithLBFGS () { throw new RuntimeException(); }
  public  org.apache.spark.mllib.optimization.LBFGS optimizer () { throw new RuntimeException(); }
  protected  scala.collection.immutable.List<scala.Function1<org.apache.spark.rdd.RDD<org.apache.spark.mllib.regression.LabeledPoint>, java.lang.Object>> validators () { throw new RuntimeException(); }
  protected  org.apache.spark.mllib.classification.LogisticRegressionModel createModel (org.apache.spark.mllib.linalg.Vector weights, double intercept) { throw new RuntimeException(); }
}
