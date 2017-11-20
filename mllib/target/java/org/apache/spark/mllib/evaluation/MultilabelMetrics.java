package org.apache.spark.mllib.evaluation;
/**
 * Evaluator for multilabel classification.
 * @param predictionAndLabels an RDD of (predictions, labels) pairs,
 * both are non-null Arrays, each with unique elements.
 */
public  class MultilabelMetrics {
  public   MultilabelMetrics (org.apache.spark.rdd.RDD<scala.Tuple2<double[], double[]>> predictionAndLabels) { throw new RuntimeException(); }
  private  long numDocs () { throw new RuntimeException(); }
  private  long numLabels () { throw new RuntimeException(); }
  /**
   * Returns subset accuracy
   * (for equal sets of labels)
   */
  public  double subsetAccuracy () { throw new RuntimeException(); }
  /**
   * Returns accuracy
   */
  public  double accuracy () { throw new RuntimeException(); }
  /**
   * Returns Hamming-loss
   */
  public  double hammingLoss () { throw new RuntimeException(); }
  /**
   * Returns document-based precision averaged by the number of documents
   */
  public  double precision () { throw new RuntimeException(); }
  /**
   * Returns document-based recall averaged by the number of documents
   */
  public  double recall () { throw new RuntimeException(); }
  /**
   * Returns document-based f1-measure averaged by the number of documents
   */
  public  double f1Measure () { throw new RuntimeException(); }
  private  scala.collection.Map<java.lang.Object, java.lang.Object> tpPerClass () { throw new RuntimeException(); }
  private  scala.collection.Map<java.lang.Object, java.lang.Object> fpPerClass () { throw new RuntimeException(); }
  private  scala.collection.Map<java.lang.Object, java.lang.Object> fnPerClass () { throw new RuntimeException(); }
  /**
   * Returns precision for a given label (category)
   * @param label the label.
   */
  public  double precision (double label) { throw new RuntimeException(); }
  /**
   * Returns recall for a given label (category)
   * @param label the label.
   */
  public  double recall (double label) { throw new RuntimeException(); }
  /**
   * Returns f1-measure for a given label (category)
   * @param label the label.
   */
  public  double f1Measure (double label) { throw new RuntimeException(); }
  private  long sumTp () { throw new RuntimeException(); }
  private  long sumFpClass () { throw new RuntimeException(); }
  private  long sumFnClass () { throw new RuntimeException(); }
  /**
   * Returns micro-averaged label-based precision
   * (equals to micro-averaged document-based precision)
   */
  public  double microPrecision () { throw new RuntimeException(); }
  /**
   * Returns micro-averaged label-based recall
   * (equals to micro-averaged document-based recall)
   */
  public  double microRecall () { throw new RuntimeException(); }
  /**
   * Returns micro-averaged label-based f1-measure
   * (equals to micro-averaged document-based f1-measure)
   */
  public  double microF1Measure () { throw new RuntimeException(); }
  /**
   * Returns the sequence of labels in ascending order
   */
  public  double[] labels () { throw new RuntimeException(); }
}
