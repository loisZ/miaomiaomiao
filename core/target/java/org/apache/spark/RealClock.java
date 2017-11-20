package org.apache.spark;
/**
 * A clock backed by a monotonically increasing time source.
 * The time returned by this clock does not correspond to any notion of wall-clock time.
 */
public  class RealClock implements org.apache.spark.Clock {
  public   RealClock () { throw new RuntimeException(); }
  public  long getTimeMillis () { throw new RuntimeException(); }
}
