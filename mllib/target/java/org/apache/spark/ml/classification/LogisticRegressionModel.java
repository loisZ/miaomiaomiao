package org.apache.spark.ml.classification;
/**
 * :: AlphaComponent ::
 * Model produced by {@link LogisticRegression}.
 */
public  class LogisticRegressionModel extends org.apache.spark.ml.Model<org.apache.spark.ml.classification.LogisticRegressionModel> implements org.apache.spark.ml.classification.LogisticRegressionParams {
  public  org.apache.spark.ml.classification.LogisticRegression parent () { throw new RuntimeException(); }
  public  org.apache.spark.ml.param.ParamMap fittingParamMap () { throw new RuntimeException(); }
  // not preceding
  public   LogisticRegressionModel (org.apache.spark.ml.classification.LogisticRegression parent, org.apache.spark.ml.param.ParamMap fittingParamMap, org.apache.spark.mllib.linalg.Vector weights) { throw new RuntimeException(); }
  public  org.apache.spark.ml.classification.LogisticRegressionModel setThreshold (double value) { throw new RuntimeException(); }
  public  org.apache.spark.ml.classification.LogisticRegressionModel setFeaturesCol (java.lang.String value) { throw new RuntimeException(); }
  public  org.apache.spark.ml.classification.LogisticRegressionModel setScoreCol (java.lang.String value) { throw new RuntimeException(); }
  public  org.apache.spark.ml.classification.LogisticRegressionModel setPredictionCol (java.lang.String value) { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.types.StructType transformSchema (org.apache.spark.sql.catalyst.types.StructType schema, org.apache.spark.ml.param.ParamMap paramMap) { throw new RuntimeException(); }
  public  org.apache.spark.sql.SchemaRDD transform (org.apache.spark.sql.SchemaRDD dataset, org.apache.spark.ml.param.ParamMap paramMap) { throw new RuntimeException(); }
}
