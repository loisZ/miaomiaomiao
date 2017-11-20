package org.apache.spark.streaming.api.java;
// no position
/**
 * JavaStreamingContext object contains a number of utility functions.
 */
public  class JavaStreamingContext$ {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final JavaStreamingContext$ MODULE$ = null;
  public   JavaStreamingContext$ () { throw new RuntimeException(); }
  /**
   * Either recreate a StreamingContext from checkpoint data or create a new StreamingContext.
   * If checkpoint data exists in the provided <code>checkpointPath</code>, then StreamingContext will be
   * recreated from the checkpoint data. If the data does not exist, then the provided factory
   * will be used to create a JavaStreamingContext.
   * <p>
   * @param checkpointPath Checkpoint directory used in an earlier JavaStreamingContext program
   * @param factory        JavaStreamingContextFactory object to create a new JavaStreamingContext
   */
  public  org.apache.spark.streaming.api.java.JavaStreamingContext getOrCreate (java.lang.String checkpointPath, org.apache.spark.streaming.api.java.JavaStreamingContextFactory factory) { throw new RuntimeException(); }
  /**
   * Either recreate a StreamingContext from checkpoint data or create a new StreamingContext.
   * If checkpoint data exists in the provided <code>checkpointPath</code>, then StreamingContext will be
   * recreated from the checkpoint data. If the data does not exist, then the provided factory
   * will be used to create a JavaStreamingContext.
   * <p>
   * @param checkpointPath Checkpoint directory used in an earlier StreamingContext program
   * @param factory        JavaStreamingContextFactory object to create a new JavaStreamingContext
   * @param hadoopConf     Hadoop configuration if necessary for reading from any HDFS compatible
   *                       file system
   */
  public  org.apache.spark.streaming.api.java.JavaStreamingContext getOrCreate (java.lang.String checkpointPath, org.apache.hadoop.conf.Configuration hadoopConf, org.apache.spark.streaming.api.java.JavaStreamingContextFactory factory) { throw new RuntimeException(); }
  /**
   * Either recreate a StreamingContext from checkpoint data or create a new StreamingContext.
   * If checkpoint data exists in the provided <code>checkpointPath</code>, then StreamingContext will be
   * recreated from the checkpoint data. If the data does not exist, then the provided factory
   * will be used to create a JavaStreamingContext.
   * <p>
   * @param checkpointPath Checkpoint directory used in an earlier StreamingContext program
   * @param factory        JavaStreamingContextFactory object to create a new JavaStreamingContext
   * @param hadoopConf     Hadoop configuration if necessary for reading from any HDFS compatible
   *                       file system
   * @param createOnError  Whether to create a new JavaStreamingContext if there is an
   *                       error in reading checkpoint data.
   */
  public  org.apache.spark.streaming.api.java.JavaStreamingContext getOrCreate (java.lang.String checkpointPath, org.apache.hadoop.conf.Configuration hadoopConf, org.apache.spark.streaming.api.java.JavaStreamingContextFactory factory, boolean createOnError) { throw new RuntimeException(); }
  /**
   * Find the JAR from which a given class was loaded, to make it easy for users to pass
   * their JARs to StreamingContext.
   */
  public  java.lang.String[] jarOfClass (java.lang.Class<?> cls) { throw new RuntimeException(); }
}
