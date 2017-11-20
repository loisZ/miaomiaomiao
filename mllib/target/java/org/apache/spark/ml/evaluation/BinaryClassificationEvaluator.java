package org.apache.spark.ml.evaluation;
/**
 * :: AlphaComponent ::
 * Evaluator for binary classification, which expects two input columns: score and label.
 */
public  class BinaryClassificationEvaluator extends org.apache.spark.ml.Evaluator implements org.apache.spark.ml.param.Params, org.apache.spark.ml.param.HasScoreCol, org.apache.spark.ml.param.HasLabelCol {
  public   BinaryClassificationEvaluator () { throw new RuntimeException(); }
  /** param for metric name in evaluation */
  public  org.apache.spark.ml.param.Param<java.lang.String> metricName () { throw new RuntimeException(); }
  public  java.lang.String getMetricName () { throw new RuntimeException(); }
  public  org.apache.spark.ml.evaluation.BinaryClassificationEvaluator setMetricName (java.lang.String value) { throw new RuntimeException(); }
  public  org.apache.spark.ml.evaluation.BinaryClassificationEvaluator setScoreCol (java.lang.String value) { throw new RuntimeException(); }
  public  org.apache.spark.ml.evaluation.BinaryClassificationEvaluator setLabelCol (java.lang.String value) { throw new RuntimeException(); }
  public  double evaluate (org.apache.spark.sql.SchemaRDD dataset, org.apache.spark.ml.param.ParamMap paramMap) { throw new RuntimeException(); }
}
