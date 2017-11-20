package org.apache.spark.ml;
/**
 * :: AlphaComponent ::
 * Abstract class for estimators that fit models to data.
 */
public abstract class Estimator<M extends org.apache.spark.ml.Model<M>> extends org.apache.spark.ml.PipelineStage implements org.apache.spark.ml.param.Params {
  /**
   * Fits a single model to the input data with optional parameters.
   * <p>
   * @param dataset input dataset
   * @param paramPairs optional list of param pairs (overwrite embedded params)
   * @return fitted model
   */
  public  M fit (org.apache.spark.sql.SchemaRDD dataset, org.apache.spark.ml.param.ParamPair<?>... paramPairs) { throw new RuntimeException(); }
  /**
   * Fits a single model to the input data with optional parameters.
   * <p>
   * @param dataset input dataset
   * @param paramPairs optional list of param pairs (overwrite embedded params)
   * @return fitted model
   */
  public  M fit (org.apache.spark.sql.api.java.JavaSchemaRDD dataset, org.apache.spark.ml.param.ParamPair<?>... paramPairs) { throw new RuntimeException(); }
  // not preceding
  public   Estimator () { throw new RuntimeException(); }
  /**
   * Fits a single model to the input data with optional parameters.
   * <p>
   * @param dataset input dataset
   * @param paramPairs optional list of param pairs (overwrite embedded params)
   * @return fitted model
   */
  public  M fit (org.apache.spark.sql.SchemaRDD dataset, scala.collection.Seq<org.apache.spark.ml.param.ParamPair<?>> paramPairs) { throw new RuntimeException(); }
  /**
   * Fits a single model to the input data with provided parameter map.
   * <p>
   * @param dataset input dataset
   * @param paramMap parameter map
   * @return fitted model
   */
  public abstract  M fit (org.apache.spark.sql.SchemaRDD dataset, org.apache.spark.ml.param.ParamMap paramMap) ;
  /**
   * Fits multiple models to the input data with multiple sets of parameters.
   * The default implementation uses a for loop on each parameter map.
   * Subclasses could overwrite this to optimize multi-model training.
   * <p>
   * @param dataset input dataset
   * @param paramMaps an array of parameter maps
   * @return fitted models, matching the input parameter maps
   */
  public  scala.collection.Seq<M> fit (org.apache.spark.sql.SchemaRDD dataset, org.apache.spark.ml.param.ParamMap[] paramMaps) { throw new RuntimeException(); }
  /**
   * Fits a single model to the input data with optional parameters.
   * <p>
   * @param dataset input dataset
   * @param paramPairs optional list of param pairs (overwrite embedded params)
   * @return fitted model
   */
  public  M fit (org.apache.spark.sql.api.java.JavaSchemaRDD dataset, scala.collection.Seq<org.apache.spark.ml.param.ParamPair<?>> paramPairs) { throw new RuntimeException(); }
  /**
   * Fits a single model to the  input data with provided parameter map.
   * <p>
   * @param dataset input dataset
   * @param paramMap parameter map
   * @return fitted model
   */
  public  M fit (org.apache.spark.sql.api.java.JavaSchemaRDD dataset, org.apache.spark.ml.param.ParamMap paramMap) { throw new RuntimeException(); }
  /**
   * Fits multiple models to the input data with multiple sets of parameters.
   * <p>
   * @param dataset input dataset
   * @param paramMaps an array of parameter maps
   * @return fitted models, matching the input parameter maps
   */
  public  java.util.List<M> fit (org.apache.spark.sql.api.java.JavaSchemaRDD dataset, org.apache.spark.ml.param.ParamMap[] paramMaps) { throw new RuntimeException(); }
}
