package org.apache.spark.ml.tuning;
/**
 * :: AlphaComponent ::
 * Model from k-fold cross validation.
 */
public  class CrossValidatorModel extends org.apache.spark.ml.Model<org.apache.spark.ml.tuning.CrossValidatorModel> implements org.apache.spark.ml.tuning.CrossValidatorParams {
  public  org.apache.spark.ml.tuning.CrossValidator parent () { throw new RuntimeException(); }
  public  org.apache.spark.ml.param.ParamMap fittingParamMap () { throw new RuntimeException(); }
  public  Object bestModel () { throw new RuntimeException(); }
  // not preceding
  public   CrossValidatorModel (org.apache.spark.ml.tuning.CrossValidator parent, org.apache.spark.ml.param.ParamMap fittingParamMap, org.apache.spark.ml.Model<?> bestModel) { throw new RuntimeException(); }
  public  org.apache.spark.sql.SchemaRDD transform (org.apache.spark.sql.SchemaRDD dataset, org.apache.spark.ml.param.ParamMap paramMap) { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.types.StructType transformSchema (org.apache.spark.sql.catalyst.types.StructType schema, org.apache.spark.ml.param.ParamMap paramMap) { throw new RuntimeException(); }
}
