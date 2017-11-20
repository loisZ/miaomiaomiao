package org.apache.spark.streaming;
/**
 * Convenience class to handle the writing of graph checkpoint to file
 */
public  class CheckpointWriter implements org.apache.spark.Logging {
  public   CheckpointWriter (org.apache.spark.streaming.scheduler.JobGenerator jobGenerator, org.apache.spark.SparkConf conf, java.lang.String checkpointDir, org.apache.hadoop.conf.Configuration hadoopConf) { throw new RuntimeException(); }
  public  int MAX_ATTEMPTS () { throw new RuntimeException(); }
  public  java.util.concurrent.ExecutorService executor () { throw new RuntimeException(); }
  public  org.apache.spark.io.CompressionCodec compressionCodec () { throw new RuntimeException(); }
  private  boolean stopped () { throw new RuntimeException(); }
  private  org.apache.hadoop.fs.FileSystem fs_ () { throw new RuntimeException(); }
  public  class CheckpointWriteHandler implements java.lang.Runnable {
    public   CheckpointWriteHandler (org.apache.spark.streaming.Time checkpointTime, byte[] bytes) { throw new RuntimeException(); }
    public  void run () { throw new RuntimeException(); }
  }
  public  void write (org.apache.spark.streaming.Checkpoint checkpoint) { throw new RuntimeException(); }
  public  void stop () { throw new RuntimeException(); }
  private  org.apache.hadoop.fs.FileSystem fs () { throw new RuntimeException(); }
  private  void reset () { throw new RuntimeException(); }
}
