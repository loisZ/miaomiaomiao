package org.apache.spark.ml;
/**
 * :: AlphaComponent ::
 * Abstract class for evaluators that compute metrics from predictions.
 */
public abstract class Evaluator implements org.apache.spark.ml.Identifiable {
  public   Evaluator () { throw new RuntimeException(); }
  /**
   * Evaluates the output.
   * <p>
   * @param dataset a dataset that contains labels/observations and predictions.
   * @param paramMap parameter map that specifies the input columns and output metrics
   * @return metric
   */
  public abstract  double evaluate (org.apache.spark.sql.SchemaRDD dataset, org.apache.spark.ml.param.ParamMap paramMap) ;
}
