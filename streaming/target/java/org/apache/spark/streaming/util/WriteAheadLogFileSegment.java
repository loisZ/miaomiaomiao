package org.apache.spark.streaming.util;
/** Class for representing a segment of data in a write ahead log file */
public  class WriteAheadLogFileSegment implements scala.Product, scala.Serializable {
  public  java.lang.String path () { throw new RuntimeException(); }
  public  long offset () { throw new RuntimeException(); }
  public  int length () { throw new RuntimeException(); }
  // not preceding
  public   WriteAheadLogFileSegment (java.lang.String path, long offset, int length) { throw new RuntimeException(); }
}
