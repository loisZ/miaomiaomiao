package org.apache.spark.ml.tuning;
/**
 * :: AlphaComponent ::
 * K-fold cross validation.
 */
public  class CrossValidator extends org.apache.spark.ml.Estimator<org.apache.spark.ml.tuning.CrossValidatorModel> implements org.apache.spark.ml.tuning.CrossValidatorParams, org.apache.spark.Logging {
  public   CrossValidator () { throw new RuntimeException(); }
  private  com.github.fommil.netlib.F2jBLAS f2jBLAS () { throw new RuntimeException(); }
  public  org.apache.spark.ml.tuning.CrossValidator setEstimator (org.apache.spark.ml.Estimator<?> value) { throw new RuntimeException(); }
  public  org.apache.spark.ml.tuning.CrossValidator setEstimatorParamMaps (org.apache.spark.ml.param.ParamMap[] value) { throw new RuntimeException(); }
  public  org.apache.spark.ml.tuning.CrossValidator setEvaluator (org.apache.spark.ml.Evaluator value) { throw new RuntimeException(); }
  public  org.apache.spark.ml.tuning.CrossValidator setNumFolds (int value) { throw new RuntimeException(); }
  public  org.apache.spark.ml.tuning.CrossValidatorModel fit (org.apache.spark.sql.SchemaRDD dataset, org.apache.spark.ml.param.ParamMap paramMap) { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.types.StructType transformSchema (org.apache.spark.sql.catalyst.types.StructType schema, org.apache.spark.ml.param.ParamMap paramMap) { throw new RuntimeException(); }
}
