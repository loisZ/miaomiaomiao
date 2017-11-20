package org.apache.spark.ml.param;
public  interface HasRegParam extends org.apache.spark.ml.param.Params {
  /** param for regularization parameter */
  public  org.apache.spark.ml.param.DoubleParam regParam () ;
  public  double getRegParam () ;
}
