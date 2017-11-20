package org.apache.spark.metrics.sink;
public  interface Sink {
  public  void start () ;
  public  void stop () ;
  public  void report () ;
}
