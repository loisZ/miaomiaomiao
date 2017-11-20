package org.apache.spark.scheduler;
public  class SparkListenerApplicationStart implements org.apache.spark.scheduler.SparkListenerEvent, scala.Product, scala.Serializable {
  public  java.lang.String appName () { throw new RuntimeException(); }
  public  scala.Option<java.lang.String> appId () { throw new RuntimeException(); }
  public  long time () { throw new RuntimeException(); }
  public  java.lang.String sparkUser () { throw new RuntimeException(); }
  // not preceding
  public   SparkListenerApplicationStart (java.lang.String appName, scala.Option<java.lang.String> appId, long time, java.lang.String sparkUser) { throw new RuntimeException(); }
}
