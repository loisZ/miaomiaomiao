package org.apache.spark.streaming.util;
public  class ManualClock implements org.apache.spark.streaming.util.Clock {
  public   ManualClock () { throw new RuntimeException(); }
  public  long time () { throw new RuntimeException(); }
  public  long currentTime () { throw new RuntimeException(); }
  public  void setTime (long timeToSet) { throw new RuntimeException(); }
  public  void addToTime (long timeToAdd) { throw new RuntimeException(); }
  public  long waitTillTime (long targetTime) { throw new RuntimeException(); }
}
