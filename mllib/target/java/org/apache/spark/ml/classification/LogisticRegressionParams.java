package org.apache.spark.ml.classification;
/**
 * :: AlphaComponent ::
 * Params for logistic regression.
 */
public  interface LogisticRegressionParams extends org.apache.spark.ml.param.Params, org.apache.spark.ml.param.HasRegParam, org.apache.spark.ml.param.HasMaxIter, org.apache.spark.ml.param.HasLabelCol, org.apache.spark.ml.param.HasThreshold, org.apache.spark.ml.param.HasFeaturesCol, org.apache.spark.ml.param.HasScoreCol, org.apache.spark.ml.param.HasPredictionCol {
  /**
   * Validates and transforms the input schema with the provided param map.
   * @param schema input schema
   * @param paramMap additional parameters
   * @param fitting whether this is in fitting
   * @return output schema
   */
  public  org.apache.spark.sql.catalyst.types.StructType validateAndTransformSchema (org.apache.spark.sql.catalyst.types.StructType schema, org.apache.spark.ml.param.ParamMap paramMap, boolean fitting) ;
}
