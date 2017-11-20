package org.apache.spark.streaming;
public  class Checkpoint implements org.apache.spark.Logging, java.io.Serializable {
  static public  java.lang.String PREFIX () { throw new RuntimeException(); }
  static public  scala.util.matching.Regex REGEX () { throw new RuntimeException(); }
  /** Get the checkpoint file for the given checkpoint time */
  static public  org.apache.hadoop.fs.Path checkpointFile (java.lang.String checkpointDir, org.apache.spark.streaming.Time checkpointTime) { throw new RuntimeException(); }
  /** Get the checkpoint backup file for the given checkpoint time */
  static public  org.apache.hadoop.fs.Path checkpointBackupFile (java.lang.String checkpointDir, org.apache.spark.streaming.Time checkpointTime) { throw new RuntimeException(); }
  /** Get checkpoint files present in the give directory, ordered by oldest-first */
  static public  scala.collection.Seq<org.apache.hadoop.fs.Path> getCheckpointFiles (java.lang.String checkpointDir, org.apache.hadoop.fs.FileSystem fs) { throw new RuntimeException(); }
  public  org.apache.spark.streaming.Time checkpointTime () { throw new RuntimeException(); }
  // not preceding
  public   Checkpoint (org.apache.spark.streaming.StreamingContext ssc, org.apache.spark.streaming.Time checkpointTime) { throw new RuntimeException(); }
  public  java.lang.String master () { throw new RuntimeException(); }
  public  java.lang.String framework () { throw new RuntimeException(); }
  public  scala.collection.Seq<java.lang.String> jars () { throw new RuntimeException(); }
  public  org.apache.spark.streaming.DStreamGraph graph () { throw new RuntimeException(); }
  public  java.lang.String checkpointDir () { throw new RuntimeException(); }
  public  org.apache.spark.streaming.Duration checkpointDuration () { throw new RuntimeException(); }
  public  org.apache.spark.streaming.Time[] pendingTimes () { throw new RuntimeException(); }
  public  int delaySeconds () { throw new RuntimeException(); }
  public  scala.Tuple2<java.lang.String, java.lang.String>[] sparkConfPairs () { throw new RuntimeException(); }
  public  org.apache.spark.SparkConf sparkConf () { throw new RuntimeException(); }
  public  void validate () { throw new RuntimeException(); }
}
