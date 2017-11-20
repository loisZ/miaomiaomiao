package org.apache.spark.streaming.util;
/**
 * This class manages write ahead log files.
 * - Writes records (bytebuffers) to periodically rotating log files.
 * - Recovers the log files and the reads the recovered records upon failures.
 * - Cleans up old log files.
 * <p>
 * Uses {@link org.apache.spark.streaming.util.WriteAheadLogWriter} to write
 * and {@link org.apache.spark.streaming.util.WriteAheadLogReader} to read.
 * <p>
 * @param logDirectory Directory when rotating log files will be created.
 * @param hadoopConf Hadoop configuration for reading/writing log files.
 * @param rollingIntervalSecs The interval in seconds with which logs will be rolled over.
 *                            Default is one minute.
 * @param maxFailures Max number of failures that is tolerated for every attempt to write to log.
 *                    Default is three.
 * @param callerName Optional name of the class who is using this manager.
 * @param clock Optional clock that is used to check for rotation interval.
 */
public  class WriteAheadLogManager implements org.apache.spark.Logging {
  static public  class LogInfo implements scala.Product, scala.Serializable {
    public  long startTime () { throw new RuntimeException(); }
    public  long endTime () { throw new RuntimeException(); }
    public  java.lang.String path () { throw new RuntimeException(); }
    // not preceding
    public   LogInfo (long startTime, long endTime, java.lang.String path) { throw new RuntimeException(); }
  }
  // no position
  static public  class LogInfo$ extends scala.runtime.AbstractFunction3<java.lang.Object, java.lang.Object, java.lang.String, org.apache.spark.streaming.util.WriteAheadLogManager.LogInfo> implements scala.Serializable {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final LogInfo$ MODULE$ = null;
    public   LogInfo$ () { throw new RuntimeException(); }
  }
  static public  scala.util.matching.Regex logFileRegex () { throw new RuntimeException(); }
  static public  java.lang.String timeToLogFile (long startTime, long stopTime) { throw new RuntimeException(); }
  /** Convert a sequence of files to a sequence of sorted LogInfo objects */
  static public  scala.collection.Seq<org.apache.spark.streaming.util.WriteAheadLogManager.LogInfo> logFilesTologInfo (scala.collection.Seq<org.apache.hadoop.fs.Path> files) { throw new RuntimeException(); }
  public   WriteAheadLogManager (java.lang.String logDirectory, org.apache.hadoop.conf.Configuration hadoopConf, int rollingIntervalSecs, int maxFailures, java.lang.String callerName, org.apache.spark.streaming.util.Clock clock) { throw new RuntimeException(); }
  private  scala.collection.mutable.ArrayBuffer<org.apache.spark.streaming.util.WriteAheadLogManager.LogInfo> pastLogs () { throw new RuntimeException(); }
  private  java.lang.String callerNameTag () { throw new RuntimeException(); }
  private  java.lang.String threadpoolName () { throw new RuntimeException(); }
  private  scala.concurrent.ExecutionContextExecutorService executionContext () { throw new RuntimeException(); }
  protected  java.lang.String logName () { throw new RuntimeException(); }
  private  scala.Option<java.lang.String> currentLogPath () { throw new RuntimeException(); }
  private  org.apache.spark.streaming.util.WriteAheadLogWriter currentLogWriter () { throw new RuntimeException(); }
  private  long currentLogWriterStartTime () { throw new RuntimeException(); }
  private  long currentLogWriterStopTime () { throw new RuntimeException(); }
  /**
   * Write a byte buffer to the log file. This method synchronously writes the data in the
   * ByteBuffer to HDFS. When this method returns, the data is guaranteed to have been flushed
   * to HDFS, and will be available for readers to read.
   */
  public  org.apache.spark.streaming.util.WriteAheadLogFileSegment writeToLog (java.nio.ByteBuffer byteBuffer) { throw new RuntimeException(); }
  /**
   * Read all the existing logs from the log directory.
   * <p>
   * Note that this is typically called when the caller is initializing and wants
   * to recover past state from the write ahead logs (that is, before making any writes).
   * If this is called after writes have been made using this manager, then it may not return
   * the latest the records. This does not deal with currently active log files, and
   * hence the implementation is kept simple.
   */
  public  scala.collection.Iterator<java.nio.ByteBuffer> readFromLog () { throw new RuntimeException(); }
  /**
   * Delete the log files that are older than the threshold time.
   * <p>
   * Its important to note that the threshold time is based on the time stamps used in the log
   * files, which is usually based on the local system time. So if there is coordination necessary
   * between the node calculating the threshTime (say, driver node), and the local system time
   * (say, worker node), the caller has to take account of possible time skew.
   * <p>
   * If waitForCompletion is set to true, this method will return only after old logs have been
   * deleted. This should be set to true only for testing. Else the files will be deleted
   * asynchronously.
   */
  public  void cleanupOldLogs (long threshTime, boolean waitForCompletion) { throw new RuntimeException(); }
  /** Stop the manager, close any open log writer */
  public  void stop () { throw new RuntimeException(); }
  /** Get the current log writer while taking care of rotation */
  private  org.apache.spark.streaming.util.WriteAheadLogWriter getLogWriter (long currentTime) { throw new RuntimeException(); }
  /** Initialize the log directory or recover existing logs inside the directory */
  private  void initializeOrRecover () { throw new RuntimeException(); }
  private  void resetWriter () { throw new RuntimeException(); }
}
