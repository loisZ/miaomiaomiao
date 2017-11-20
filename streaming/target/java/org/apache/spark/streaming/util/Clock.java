package org.apache.spark.streaming.util;
public  interface Clock {
  public  long currentTime () ;
  public  long waitTillTime (long targetTime) ;
}
