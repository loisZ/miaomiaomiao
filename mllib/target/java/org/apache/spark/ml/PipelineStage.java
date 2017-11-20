package org.apache.spark.ml;
/**
 * :: AlphaComponent ::
 * A stage in a pipeline, either an {@link Estimator} or a {@link Transformer}.
 */
public abstract class PipelineStage implements scala.Serializable, org.apache.spark.Logging {
  public   PipelineStage () { throw new RuntimeException(); }
  /**
   * Derives the output schema from the input schema and parameters.
   */
  public abstract  org.apache.spark.sql.catalyst.types.StructType transformSchema (org.apache.spark.sql.catalyst.types.StructType schema, org.apache.spark.ml.param.ParamMap paramMap) ;
  /**
   * Derives the output schema from the input schema and parameters, optionally with logging.
   */
  protected  org.apache.spark.sql.catalyst.types.StructType transformSchema (org.apache.spark.sql.catalyst.types.StructType schema, org.apache.spark.ml.param.ParamMap paramMap, boolean logging) { throw new RuntimeException(); }
}
