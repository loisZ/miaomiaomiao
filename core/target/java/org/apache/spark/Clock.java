package org.apache.spark;
/**
 * An abstract clock for measuring elapsed time.
 */
public  interface Clock {
  public  long getTimeMillis () ;
}
