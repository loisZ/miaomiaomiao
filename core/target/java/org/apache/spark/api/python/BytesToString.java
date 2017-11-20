package org.apache.spark.api.python;
/**
 * Output a Python RDD of key-value pairs to any Hadoop file system, using a Hadoop conf
 * converted from the passed-in <code>confAsMap</code>. The conf should set relevant output params (
 * e.g., output path, output format, etc), in the same way as it would be configured for
 * a Hadoop MapReduce job. Both old and new Hadoop OutputFormat APIs are supported
 * (mapred vs. mapreduce). Keys/values are converted for output using either user specified
 * converters or, by default, {@link org.apache.spark.api.python.JavaToWritableConverter}.
 */
public  class BytesToString implements org.apache.spark.api.java.function.Function<byte[], java.lang.String> {
  public   BytesToString () { throw new RuntimeException(); }
  public  java.lang.String call (byte[] arr) { throw new RuntimeException(); }
}
