package org.apache.spark.streaming.util;
/**
 * A random access reader for reading write ahead log files written using
 * {@link org.apache.spark.streaming.util.WriteAheadLogWriter}. Given the file segment info,
 * this reads the record (bytebuffer) from the log file.
 */
public  class WriteAheadLogRandomReader implements java.io.Closeable {
  public   WriteAheadLogRandomReader (java.lang.String path, org.apache.hadoop.conf.Configuration conf) { throw new RuntimeException(); }
  private  org.apache.hadoop.fs.FSDataInputStream instream () { throw new RuntimeException(); }
  private  boolean closed () { throw new RuntimeException(); }
  public  java.nio.ByteBuffer read (org.apache.spark.streaming.util.WriteAheadLogFileSegment segment) { throw new RuntimeException(); }
  public  void close () { throw new RuntimeException(); }
  private  void assertOpen () { throw new RuntimeException(); }
}
