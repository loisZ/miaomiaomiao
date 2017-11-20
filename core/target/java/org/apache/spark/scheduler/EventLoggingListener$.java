package org.apache.spark.scheduler;
// no position
public  class EventLoggingListener$ implements org.apache.spark.Logging {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final EventLoggingListener$ MODULE$ = null;
  public   EventLoggingListener$ () { throw new RuntimeException(); }
  public  java.lang.String IN_PROGRESS () { throw new RuntimeException(); }
  public  java.lang.String DEFAULT_LOG_DIR () { throw new RuntimeException(); }
  private  org.apache.hadoop.fs.permission.FsPermission LOG_FILE_PERMISSIONS () { throw new RuntimeException(); }
  private  java.lang.String HEADER_END_MARKER () { throw new RuntimeException(); }
  private  int MAX_HEADER_LINE_LENGTH () { throw new RuntimeException(); }
  private  scala.collection.mutable.HashMap<java.lang.String, org.apache.spark.io.CompressionCodec> codecMap () { throw new RuntimeException(); }
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
  public  java.io.OutputStream initEventLog (java.io.OutputStream logStream, scala.Option<org.apache.spark.io.CompressionCodec> compressionCodec) { throw new RuntimeException(); }
  /**
   * Return a file-system-safe path to the log file for the given application.
   * <p>
   * @param logBaseDir Directory where the log file will be written.
   * @param appId A unique app ID.
   * @return A path which consists of file-system-safe characters.
   */
  public  java.lang.String getLogPath (java.lang.String logBaseDir, java.lang.String appId) { throw new RuntimeException(); }
  /**
   * Opens an event log file and returns an input stream to the event data.
   * <p>
   * @return 2-tuple (event input stream, Spark version of event data)
   */
  public  scala.Tuple2<java.io.InputStream, java.lang.String> openEventLog (org.apache.hadoop.fs.Path log, org.apache.hadoop.fs.FileSystem fs) { throw new RuntimeException(); }
}
