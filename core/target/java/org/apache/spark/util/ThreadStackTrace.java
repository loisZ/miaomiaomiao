package org.apache.spark.util;
/**
 * Used for shipping per-thread stacktraces from the executors to driver.
 */
public  class ThreadStackTrace implements scala.Product, scala.Serializable {
  public  long threadId () { throw new RuntimeException(); }
  public  java.lang.String threadName () { throw new RuntimeException(); }
  public  java.lang.Thread.State threadState () { throw new RuntimeException(); }
  public  java.lang.String stackTrace () { throw new RuntimeException(); }
  // not preceding
  public   ThreadStackTrace (long threadId, java.lang.String threadName, java.lang.Thread.State threadState, java.lang.String stackTrace) { throw new RuntimeException(); }
}
