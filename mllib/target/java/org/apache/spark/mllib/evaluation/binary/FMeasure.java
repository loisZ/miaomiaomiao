package org.apache.spark.mllib.evaluation.binary;
/**
 * F-Measure. Defined as 0 if both precision and recall are 0. EG in the case that all examples
 * are false positives.
 * @param beta the beta constant in F-Measure
 * @see http://en.wikipedia.org/wiki/F1_score
 */
public  class FMeasure implements org.apache.spark.mllib.evaluation.binary.BinaryClassificationMetricComputer, scala.Product, scala.Serializable {
  public  double beta () { throw new RuntimeException(); }
  // not preceding
  public   FMeasure (double beta) { throw new RuntimeException(); }
  private  double beta2 () { throw new RuntimeException(); }
  public  double apply (org.apache.spark.mllib.evaluation.binary.BinaryConfusionMatrix c) { throw new RuntimeException(); }
}
