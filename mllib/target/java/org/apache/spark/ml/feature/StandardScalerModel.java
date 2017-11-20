package org.apache.spark.ml.feature;
/**
 * :: AlphaComponent ::
 * Model fitted by {@link StandardScaler}.
 */
public  class StandardScalerModel extends org.apache.spark.ml.Model<org.apache.spark.ml.feature.StandardScalerModel> implements org.apache.spark.ml.feature.StandardScalerParams {
  public  org.apache.spark.ml.feature.StandardScaler parent () { throw new RuntimeException(); }
  public  org.apache.spark.ml.param.ParamMap fittingParamMap () { throw new RuntimeException(); }
  // not preceding
  public   StandardScalerModel (org.apache.spark.ml.feature.StandardScaler parent, org.apache.spark.ml.param.ParamMap fittingParamMap, org.apache.spark.mllib.feature.StandardScalerModel scaler) { throw new RuntimeException(); }
  public  org.apache.spark.ml.feature.StandardScalerModel setInputCol (java.lang.String value) { throw new RuntimeException(); }
  public  org.apache.spark.ml.feature.StandardScalerModel setOutputCol (java.lang.String value) { throw new RuntimeException(); }
  public  org.apache.spark.sql.SchemaRDD transform (org.apache.spark.sql.SchemaRDD dataset, org.apache.spark.ml.param.ParamMap paramMap) { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.types.StructType transformSchema (org.apache.spark.sql.catalyst.types.StructType schema, org.apache.spark.ml.param.ParamMap paramMap) { throw new RuntimeException(); }
}
