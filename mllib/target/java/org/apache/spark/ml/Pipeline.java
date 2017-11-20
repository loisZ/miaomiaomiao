package org.apache.spark.ml;
/**
 * :: AlphaComponent ::
 * A simple pipeline, which acts as an estimator. A Pipeline consists of a sequence of stages, each
 * of which is either an {@link Estimator} or a {@link Transformer}. When {@link Pipeline.fit} is called, the
 * stages are executed in order. If a stage is an {@link Estimator}, its {@link Estimator.fit} method will
 * be called on the input dataset to fit a model. Then the model, which is a transformer, will be
 * used to transform the dataset as the input to the next stage. If a stage is a {@link Transformer},
 * its {@link Transformer.transform} method will be called to produce the dataset for the next stage.
 * The fitted model from a {@link Pipeline} is an {@link PipelineModel}, which consists of fitted models and
 * transformers, corresponding to the pipeline stages. If there are no stages, the pipeline acts as
 * an identity transformer.
 */
public  class Pipeline extends org.apache.spark.ml.Estimator<org.apache.spark.ml.PipelineModel> {
  public   Pipeline () { throw new RuntimeException(); }
  /** param for pipeline stages */
  public  org.apache.spark.ml.param.Param<org.apache.spark.ml.PipelineStage[]> stages () { throw new RuntimeException(); }
  public  org.apache.spark.ml.Pipeline setStages (org.apache.spark.ml.PipelineStage[] value) { throw new RuntimeException(); }
  public  org.apache.spark.ml.PipelineStage[] getStages () { throw new RuntimeException(); }
  /**
   * Fits the pipeline to the input dataset with additional parameters. If a stage is an
   * {@link Estimator}, its {@link Estimator.fit} method will be called on the input dataset to fit a model.
   * Then the model, which is a transformer, will be used to transform the dataset as the input to
   * the next stage. If a stage is a {@link Transformer}, its {@link Transformer.transform} method will be
   * called to produce the dataset for the next stage. The fitted model from a {@link Pipeline} is an
   * {@link PipelineModel}, which consists of fitted models and transformers, corresponding to the
   * pipeline stages. If there are no stages, the output model acts as an identity transformer.
   * <p>
   * @param dataset input dataset
   * @param paramMap parameter map
   * @return fitted pipeline
   */
  public  org.apache.spark.ml.PipelineModel fit (org.apache.spark.sql.SchemaRDD dataset, org.apache.spark.ml.param.ParamMap paramMap) { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.types.StructType transformSchema (org.apache.spark.sql.catalyst.types.StructType schema, org.apache.spark.ml.param.ParamMap paramMap) { throw new RuntimeException(); }
}
