package org.apache.spark.ml.param;
public  interface HasThreshold extends org.apache.spark.ml.param.Params {
  /** param for threshold in (binary) prediction */
  public  org.apache.spark.ml.param.DoubleParam threshold () ;
  public  double getThreshold () ;
}
