package org.apache.spark.ml.classification;
/**
 * Logistic regression.
 */
public  class LogisticRegression extends org.apache.spark.ml.Estimator<org.apache.spark.ml.classification.LogisticRegressionModel> implements org.apache.spark.ml.classification.LogisticRegressionParams {
  public   LogisticRegression () { throw new RuntimeException(); }
  public  org.apache.spark.ml.classification.LogisticRegression setRegParam (double value) { throw new RuntimeException(); }
  public  org.apache.spark.ml.classification.LogisticRegression setMaxIter (int value) { throw new RuntimeException(); }
  public  org.apache.spark.ml.classification.LogisticRegression setLabelCol (java.lang.String value) { throw new RuntimeException(); }
  public  org.apache.spark.ml.classification.LogisticRegression setThreshold (double value) { throw new RuntimeException(); }
  public  org.apache.spark.ml.classification.LogisticRegression setFeaturesCol (java.lang.String value) { throw new RuntimeException(); }
  public  org.apache.spark.ml.classification.LogisticRegression setScoreCol (java.lang.String value) { throw new RuntimeException(); }
  public  org.apache.spark.ml.classification.LogisticRegression setPredictionCol (java.lang.String value) { throw new RuntimeException(); }
  public  org.apache.spark.ml.classification.LogisticRegressionModel fit (org.apache.spark.sql.SchemaRDD dataset, org.apache.spark.ml.param.ParamMap paramMap) { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.types.StructType transformSchema (org.apache.spark.sql.catalyst.types.StructType schema, org.apache.spark.ml.param.ParamMap paramMap) { throw new RuntimeException(); }
}
