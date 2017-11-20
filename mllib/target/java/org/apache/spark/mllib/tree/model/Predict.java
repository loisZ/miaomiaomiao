package org.apache.spark.mllib.tree.model;
/**
 * Predicted value for a node
 * @param predict predicted value
 * @param prob probability of the label (classification only)
 */
public  class Predict implements scala.Serializable {
  public  double predict () { throw new RuntimeException(); }
  public  double prob () { throw new RuntimeException(); }
  // not preceding
  public   Predict (double predict, double prob) { throw new RuntimeException(); }
  public  java.lang.String toString () { throw new RuntimeException(); }
}
