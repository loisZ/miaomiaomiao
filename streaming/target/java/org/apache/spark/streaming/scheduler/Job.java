package org.apache.spark.streaming.scheduler;
/**
 * Class representing a Spark computation. It may contain multiple Spark jobs.
 */
public  class Job {
  public  org.apache.spark.streaming.Time time () { throw new RuntimeException(); }
  // not preceding
  public   Job (org.apache.spark.streaming.Time time, scala.Function0<?> func) { throw new RuntimeException(); }
  public  java.lang.String id () { throw new RuntimeException(); }
  public  Object result () { throw new RuntimeException(); }
  public  void run () { throw new RuntimeException(); }
  public  void setId (int number) { throw new RuntimeException(); }
  public  java.lang.String toString () { throw new RuntimeException(); }
}
