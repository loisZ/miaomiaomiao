package org.apache.spark.mllib.tree.impl;
/**
 * Time tracker implementation which holds labeled timers.
 */
public  class TimeTracker implements scala.Serializable {
  public   TimeTracker () { throw new RuntimeException(); }
  private  scala.collection.mutable.HashMap<java.lang.String, java.lang.Object> starts () { throw new RuntimeException(); }
  private  scala.collection.mutable.HashMap<java.lang.String, java.lang.Object> totals () { throw new RuntimeException(); }
  /**
   * Starts a new timer, or re-starts a stopped timer.
   */
  public  void start (java.lang.String timerLabel) { throw new RuntimeException(); }
  /**
   * Stops a timer and returns the elapsed time in seconds.
   */
  public  double stop (java.lang.String timerLabel) { throw new RuntimeException(); }
  /**
   * Print all timing results in seconds.
   */
  public  java.lang.String toString () { throw new RuntimeException(); }
}
