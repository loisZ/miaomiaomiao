package org.apache.spark.streaming.scheduler;
public  class ReportError implements scala.Product, scala.Serializable {
  public  int streamId () { throw new RuntimeException(); }
  public  java.lang.String message () { throw new RuntimeException(); }
  public  java.lang.String error () { throw new RuntimeException(); }
  // not preceding
  public   ReportError (int streamId, java.lang.String message, java.lang.String error) { throw new RuntimeException(); }
}
