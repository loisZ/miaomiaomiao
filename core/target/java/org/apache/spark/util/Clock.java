package org.apache.spark.util;
/**
 * An interface to represent clocks, so that they can be mocked out in unit tests.
 */
public  interface Clock {
  public  long getTime () ;
}
