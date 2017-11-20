package org.apache.spark.ml;
/**
 * :: AlphaComponent ::
 * Abstract class for transformers that transform one dataset into another.
 */
public abstract class Transformer extends org.apache.spark.ml.PipelineStage implements org.apache.spark.ml.param.Params {
  /**
   * Transforms the dataset with optional parameters
   * @param dataset input dataset
   * @param paramPairs optional list of param pairs, overwrite embedded params
   * @return transformed dataset
   */
  public  org.apache.spark.sql.SchemaRDD transform (org.apache.spark.sql.SchemaRDD dataset, org.apache.spark.ml.param.ParamPair<?>... paramPairs) { throw new RuntimeException(); }
  /**
   * Transforms the dataset with optional parameters.
   * @param dataset input datset
   * @param paramPairs optional list of param pairs, overwrite embedded params
   * @return transformed dataset
   */
  public  org.apache.spark.sql.api.java.JavaSchemaRDD transform (org.apache.spark.sql.api.java.JavaSchemaRDD dataset, org.apache.spark.ml.param.ParamPair<?>... paramPairs) { throw new RuntimeException(); }
  // not preceding
  public   Transformer () { throw new RuntimeException(); }
  /**
   * Transforms the dataset with optional parameters
   * @param dataset input dataset
   * @param paramPairs optional list of param pairs, overwrite embedded params
   * @return transformed dataset
   */
  public  org.apache.spark.sql.SchemaRDD transform (org.apache.spark.sql.SchemaRDD dataset, scala.collection.Seq<org.apache.spark.ml.param.ParamPair<?>> paramPairs) { throw new RuntimeException(); }
  /**
   * Transforms the dataset with provided parameter map as additional parameters.
   * @param dataset input dataset
   * @param paramMap additional parameters, overwrite embedded params
   * @return transformed dataset
   */
  public abstract  org.apache.spark.sql.SchemaRDD transform (org.apache.spark.sql.SchemaRDD dataset, org.apache.spark.ml.param.ParamMap paramMap) ;
  /**
   * Transforms the dataset with optional parameters.
   * @param dataset input datset
   * @param paramPairs optional list of param pairs, overwrite embedded params
   * @return transformed dataset
   */
  public  org.apache.spark.sql.api.java.JavaSchemaRDD transform (org.apache.spark.sql.api.java.JavaSchemaRDD dataset, scala.collection.Seq<org.apache.spark.ml.param.ParamPair<?>> paramPairs) { throw new RuntimeException(); }
  /**
   * Transforms the dataset with provided parameter map as additional parameters.
   * @param dataset input dataset
   * @param paramMap additional parameters, overwrite embedded params
   * @return transformed dataset
   */
  public  org.apache.spark.sql.api.java.JavaSchemaRDD transform (org.apache.spark.sql.api.java.JavaSchemaRDD dataset, org.apache.spark.ml.param.ParamMap paramMap) { throw new RuntimeException(); }
}
