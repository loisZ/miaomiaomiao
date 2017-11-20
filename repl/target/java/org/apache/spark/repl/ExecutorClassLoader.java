package org.apache.spark.repl;
/**
 * A ClassLoader that reads classes from a Hadoop FileSystem or HTTP URI,
 * used to load classes defined by the interpreter when the REPL is used.
 * Allows the user to specify if user class path should be first
 */
public  class ExecutorClassLoader extends java.lang.ClassLoader {
  public   ExecutorClassLoader (org.apache.spark.SparkConf conf, java.lang.String classUri, java.lang.ClassLoader parent, boolean userClassPathFirst) { throw new RuntimeException(); }
  public  java.net.URI uri () { throw new RuntimeException(); }
  public  java.lang.String directory () { throw new RuntimeException(); }
  public  org.apache.spark.util.ParentClassLoader parentLoader () { throw new RuntimeException(); }
  public  org.apache.hadoop.fs.FileSystem fileSystem () { throw new RuntimeException(); }
  public  java.lang.Class<?> findClass (java.lang.String name) { throw new RuntimeException(); }
  public  scala.Option<java.lang.Class<?>> findClassLocally (java.lang.String name) { throw new RuntimeException(); }
  public  byte[] readAndTransformClass (java.lang.String name, java.io.InputStream in) { throw new RuntimeException(); }
  /**
   * URL-encode a string, preserving only slashes
   */
  public  java.lang.String urlEncode (java.lang.String str) { throw new RuntimeException(); }
}
