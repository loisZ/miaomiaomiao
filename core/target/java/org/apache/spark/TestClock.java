package org.apache.spark;
/**
 * A clock that allows the caller to customize the time.
 * This is used mainly for testing.
 */
public  class TestClock implements org.apache.spark.Clock {
  public   TestClock (long startTimeMillis) { throw new RuntimeException(); }
  private  long time () { throw new RuntimeException(); }
  public  long getTimeMillis () { throw new RuntimeException(); }
  public  void tick (long ms) { throw new RuntimeException(); }
}
