package org.apache.spark.streaming.scheduler;
public  class ErrorReported implements org.apache.spark.streaming.scheduler.JobSchedulerEvent, scala.Product, scala.Serializable {
  public  java.lang.String msg () { throw new RuntimeException(); }
  public  java.lang.Throwable e () { throw new RuntimeException(); }
  // not preceding
  public   ErrorReported (java.lang.String msg, java.lang.Throwable e) { throw new RuntimeException(); }
}
