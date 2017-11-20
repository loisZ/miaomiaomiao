package org.apache.spark.streaming.util;
public  class SystemClock implements org.apache.spark.streaming.util.Clock {
  public   SystemClock () { throw new RuntimeException(); }
  public  long minPollTime () { throw new RuntimeException(); }
  public  long currentTime () { throw new RuntimeException(); }
  public  long waitTillTime (long targetTime) { throw new RuntimeException(); }
}
