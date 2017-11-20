package org.apache.spark.ml.feature;
/**
 * :: AlphaComponent ::
 * Standardizes features by removing the mean and scaling to unit variance using column summary
 * statistics on the samples in the training set.
 */
public  class StandardScaler extends org.apache.spark.ml.Estimator<org.apache.spark.ml.feature.StandardScalerModel> implements org.apache.spark.ml.feature.StandardScalerParams {
  public   StandardScaler () { throw new RuntimeException(); }
  public  org.apache.spark.ml.feature.StandardScaler setInputCol (java.lang.String value) { throw new RuntimeException(); }
  public  org.apache.spark.ml.feature.StandardScaler setOutputCol (java.lang.String value) { throw new RuntimeException(); }
  public  org.apache.spark.ml.feature.StandardScalerModel fit (org.apache.spark.sql.SchemaRDD dataset, org.apache.spark.ml.param.ParamMap paramMap) { throw new RuntimeException(); }
  // not preceding
  public  org.apache.spark.sql.catalyst.types.StructType transformSchema (org.apache.spark.sql.catalyst.types.StructType schema, org.apache.spark.ml.param.ParamMap paramMap) { throw new RuntimeException(); }
}
