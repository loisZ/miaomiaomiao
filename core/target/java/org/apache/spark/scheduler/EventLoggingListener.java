package org.apache.spark.scheduler;
/**
 * A SparkListener that logs events to persistent storage.
 * <p>
 * Event logging is specified by the following configurable parameters:
 *   spark.eventLog.enabled - Whether event logging is enabled.
 *   spark.eventLog.compress - Whether to compress logged events
 *   spark.eventLog.overwrite - Whether to overwrite any existing files.
 *   spark.eventLog.dir - Path to the directory in which events are logged.
 *   spark.eventLog.buffer.kb - Buffer size to use when writing to output streams
 */
public  class EventLoggingListener implements org.apache.spark.scheduler.SparkListener, org.apache.spark.Logging {
  static public  java.lang.String IN_PROGRESS () { throw new RuntimeException(); }
  static public  java.lang.String DEFAULT_LOG_DIR () { throw new RuntimeException(); }
  static private  org.apache.hadoop.fs.permission.FsPermission LOG_FILE_PERMISSIONS () { throw new RuntimeException(); }
  static private  java.lang.String HEADER_END_MARKER () { throw new RuntimeException(); }
  static private  int MAX_HEADER_LINE_LENGTH () { throw new RuntimeException(); }
  static private  scala.collection.mutable.HashMap<java.lang.String, org.apache.spark.io.CompressionCodec> codecMap () { throw new RuntimeException(); }
  /**
   * Write metadata about the event log to the given stream.
   * <p>
   * The header is a serialized version of a map, except it does not use Java serialization to
   * avoid incompatibilities between different JDKs. It writes one map entry per line, in
   * "key=value" format.
   * <p>
   * The very last entry in the header is the <code>HEADER_END_MARKER</code> marker, so that the parsing code
   * can know when to stop.
   * <p>
   * The format needs to be kept in sync with the openEventLog() method below. Also, it cannot
   * change in new Spark versions without some other way of detecting the change (like some
   * metadata encoded in the file name).
   * <p>
   * @param logStream Raw output stream to the even log file.
   * @param compressionCodec Optional compression codec to use.
   * @return A stream where to write event log data. This may be a wrapper around the original
   *         stream (for example, when compression is enabled).
   */
  static public  java.io.OutputStream initEventLog (java.io.OutputStream logStream, scala.Option<org.apache.spark.io.CompressionCodec> compressionCodec) { throw new RuntimeException(); }
  /**
   * Return a file-system-safe path to the log file for the given application.
   * <p>
   * @param logBaseDir Directory where the log file will be written.
   * @param appId A unique app ID.
   * @return A path which consists of file-system-safe characters.
   */
  static public  java.lang.String getLogPath (java.lang.String logBaseDir, java.lang.String appId) { throw new RuntimeException(); }
  /**
   * Opens an event log file and returns an input stream to the event data.
   * <p>
   * @return 2-tuple (event input stream, Spark version of event data)
   */
  static public  scala.Tuple2<java.io.InputStream, java.lang.String> openEventLog (org.apache.hadoop.fs.Path log, org.apache.hadoop.fs.FileSystem fs) { throw new RuntimeException(); }
  public   EventLoggingListener (java.lang.String appId, java.lang.String logBaseDir, org.apache.spark.SparkConf sparkConf, org.apache.hadoop.conf.Configuration hadoopConf) { throw new RuntimeException(); }
  public   EventLoggingListener (java.lang.String appId, java.lang.String logBaseDir, org.apache.spark.SparkConf sparkConf) { throw new RuntimeException(); }
  private  boolean shouldCompress () { throw new RuntimeException(); }
  private  boolean shouldOverwrite () { throw new RuntimeException(); }
  private  boolean testing () { throw new RuntimeException(); }
  private  int outputBufferSize () { throw new RuntimeException(); }
  private  org.apache.hadoop.fs.FileSystem fileSystem () { throw new RuntimeException(); }
  private  scala.Option<org.apache.hadoop.fs.FSDataOutputStream> hadoopDataStream () { throw new RuntimeException(); }
  private  java.lang.reflect.Method hadoopFlushMethod () { throw new RuntimeException(); }
  private  scala.Option<java.io.PrintWriter> writer () { throw new RuntimeException(); }
  public  scala.collection.mutable.ArrayBuffer<org.json4s.JsonAST.JValue> loggedEvents () { throw new RuntimeException(); }
  public  java.lang.String logPath () { throw new RuntimeException(); }
  /**
   * Creates the log file in the configured log directory.
   */
  public  void start () { throw new RuntimeException(); }
  /** Log the event as JSON. */
  private  void logEvent (org.apache.spark.scheduler.SparkListenerEvent event, boolean flushLogger) { throw new RuntimeException(); }
  public  void onStageSubmitted (org.apache.spark.scheduler.SparkListenerStageSubmitted event) { throw new RuntimeException(); }
  public  void onTaskStart (org.apache.spark.scheduler.SparkListenerTaskStart event) { throw new RuntimeException(); }
  public  void onTaskGettingResult (org.apache.spark.scheduler.SparkListenerTaskGettingResult event) { throw new RuntimeException(); }
  public  void onTaskEnd (org.apache.spark.scheduler.SparkListenerTaskEnd event) { throw new RuntimeException(); }
  public  void onEnvironmentUpdate (org.apache.spark.scheduler.SparkListenerEnvironmentUpdate event) { throw new RuntimeException(); }
  public  void onStageCompleted (org.apache.spark.scheduler.SparkListenerStageCompleted event) { throw new RuntimeException(); }
  public  void onJobStart (org.apache.spark.scheduler.SparkListenerJobStart event) { throw new RuntimeException(); }
  public  void onJobEnd (org.apache.spark.scheduler.SparkListenerJobEnd event) { throw new RuntimeException(); }
  public  void onBlockManagerAdded (org.apache.spark.scheduler.SparkListenerBlockManagerAdded event) { throw new RuntimeException(); }
  public  void onBlockManagerRemoved (org.apache.spark.scheduler.SparkListenerBlockManagerRemoved event) { throw new RuntimeException(); }
  public  void onUnpersistRDD (org.apache.spark.scheduler.SparkListenerUnpersistRDD event) { throw new RuntimeException(); }
  public  void onApplicationStart (org.apache.spark.scheduler.SparkListenerApplicationStart event) { throw new RuntimeException(); }
  public  void onApplicationEnd (org.apache.spark.scheduler.SparkListenerApplicationEnd event) { throw new RuntimeException(); }
  public  void onExecutorMetricsUpdate (org.apache.spark.scheduler.SparkListenerExecutorMetricsUpdate event) { throw new RuntimeException(); }
  /**
   * Stop logging events. The event log file will be renamed so that it loses the
   * ".inprogress" suffix.
   */
  public  boolean stop () { throw new RuntimeException(); }
}
