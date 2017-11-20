package org.apache.spark.ml;
/**
 * :: AlphaComponent ::
 * Represents a compiled pipeline.
 */
public  class PipelineModel extends org.apache.spark.ml.Model<org.apache.spark.ml.PipelineModel> implements org.apache.spark.Logging {
  public  org.apache.spark.ml.Pipeline parent () { throw new RuntimeException(); }
  public  org.apache.spark.ml.param.ParamMap fittingParamMap () { throw new RuntimeException(); }
  public  org.apache.spark.ml.Transformer[] stages () { throw new RuntimeException(); }
  // not preceding
  public   PipelineModel (org.apache.spark.ml.Pipeline parent, org.apache.spark.ml.param.ParamMap fittingParamMap, org.apache.spark.ml.Transformer[] stages) { throw new RuntimeException(); }
  /**
   * Gets the model produced by the input estimator. Throws an NoSuchElementException is the input
   * estimator does not exist in the pipeline.
   */
  public <M extends org.apache.spark.ml.Model<M>> M getModel (org.apache.spark.ml.Estimator<M> stage) { throw new RuntimeException(); }
  public  org.apache.spark.sql.SchemaRDD transform (org.apache.spark.sql.SchemaRDD dataset, org.apache.spark.ml.param.ParamMap paramMap) { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.types.StructType transformSchema (org.apache.spark.sql.catalyst.types.StructType schema, org.apache.spark.ml.param.ParamMap paramMap) { throw new RuntimeException(); }
}
