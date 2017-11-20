package org.apache.spark.bagel;
public  interface Aggregator<V extends java.lang.Object, A extends java.lang.Object> {
  public  A createAggregator (V vert) ;
  public  A mergeAggregators (A a, A b) ;
}
