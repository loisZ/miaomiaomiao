package org.apache.spark.streaming.dstream;
// no position
public  class FileInputDStream$ implements scala.Serializable {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final FileInputDStream$ MODULE$ = null;
  public   FileInputDStream$ () { throw new RuntimeException(); }
  /**
   * Minimum duration of remembering the information of selected files. Files with mod times
   * older than this "window" of remembering will be ignored. So if new files are visible
   * within this window, then the file will get selected in the next batch.
   */
  private  org.apache.spark.streaming.Duration MIN_REMEMBER_DURATION () { throw new RuntimeException(); }
  public  boolean defaultFilter (org.apache.hadoop.fs.Path path) { throw new RuntimeException(); }
  /**
   * Calculate the number of last batches to remember, such that all the files selected in
   * at least last MIN_REMEMBER_DURATION duration can be remembered.
   */
  public  int calculateNumBatchesToRemember (org.apache.spark.streaming.Duration batchDuration) { throw new RuntimeException(); }
}
