package org.apache.spark.streaming.util;
public  class RecurringTimer implements org.apache.spark.Logging {
  static public  void main (java.lang.String[] args) { throw new RuntimeException(); }
  public   RecurringTimer (org.apache.spark.streaming.util.Clock clock, long period, scala.Function1<java.lang.Object, scala.runtime.BoxedUnit> callback, java.lang.String name) { throw new RuntimeException(); }
  private  java.lang.Thread thread () { throw new RuntimeException(); }
  private  long prevTime () { throw new RuntimeException(); }
  private  long nextTime () { throw new RuntimeException(); }
  private  boolean stopped () { throw new RuntimeException(); }
  /**
   * Get the time when this timer will fire if it is started right now.
   * The time will be a multiple of this timer's period and more than
   * current system time.
   */
  public  long getStartTime () { throw new RuntimeException(); }
  /**
   * Get the time when the timer will fire if it is restarted right now.
   * This time depends on when the timer was started the first time, and was stopped
   * for whatever reason. The time must be a multiple of this timer's period and
   * more than current time.
   */
  public  long getRestartTime (long originalStartTime) { throw new RuntimeException(); }
  /**
   * Start at the given start time.
   */
  public  long start (long startTime) { throw new RuntimeException(); }
  /**
   * Start at the earliest time it can start based on the period.
   */
  public  long start () { throw new RuntimeException(); }
  /**
   * Stop the timer, and return the last time the callback was made.
   * interruptTimer = true will interrupt the callback
   * if it is in progress (not guaranteed to give correct time in this case).
   */
  public  long stop (boolean interruptTimer) { throw new RuntimeException(); }
  /**
   * Repeatedly call the callback every interval.
   */
  private  void loop () { throw new RuntimeException(); }
}
