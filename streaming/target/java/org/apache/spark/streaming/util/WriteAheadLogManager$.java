package org.apache.spark.streaming.util;
// no position
public  class WriteAheadLogManager$ {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final WriteAheadLogManager$ MODULE$ = null;
  public   WriteAheadLogManager$ () { throw new RuntimeException(); }
  public  scala.util.matching.Regex logFileRegex () { throw new RuntimeException(); }
  public  java.lang.String timeToLogFile (long startTime, long stopTime) { throw new RuntimeException(); }
  /** Convert a sequence of files to a sequence of sorted LogInfo objects */
  public  scala.collection.Seq<org.apache.spark.streaming.util.WriteAheadLogManager.LogInfo> logFilesTologInfo (scala.collection.Seq<org.apache.hadoop.fs.Path> files) { throw new RuntimeException(); }
}
