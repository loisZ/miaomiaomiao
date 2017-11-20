package org.apache.spark.streaming;
// no position
public  class Checkpoint$ implements org.apache.spark.Logging, scala.Serializable {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final Checkpoint$ MODULE$ = null;
  public   Checkpoint$ () { throw new RuntimeException(); }
  public  java.lang.String PREFIX () { throw new RuntimeException(); }
  public  scala.util.matching.Regex REGEX () { throw new RuntimeException(); }
  /** Get the checkpoint file for the given checkpoint time */
  public  org.apache.hadoop.fs.Path checkpointFile (java.lang.String checkpointDir, org.apache.spark.streaming.Time checkpointTime) { throw new RuntimeException(); }
  /** Get the checkpoint backup file for the given checkpoint time */
  public  org.apache.hadoop.fs.Path checkpointBackupFile (java.lang.String checkpointDir, org.apache.spark.streaming.Time checkpointTime) { throw new RuntimeException(); }
  /** Get checkpoint files present in the give directory, ordered by oldest-first */
  public  scala.collection.Seq<org.apache.hadoop.fs.Path> getCheckpointFiles (java.lang.String checkpointDir, org.apache.hadoop.fs.FileSystem fs) { throw new RuntimeException(); }
}
