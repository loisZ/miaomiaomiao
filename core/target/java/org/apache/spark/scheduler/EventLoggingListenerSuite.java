package org.apache.spark.scheduler;
/**
 * Test whether EventLoggingListener logs events properly.
 * <p>
 * This tests whether EventLoggingListener actually log files with expected name patterns while
 * logging events, whether the parsing of the file names is correct, and whether the logged events
 * can be read and deserialized into actual SparkListenerEvents.
 */
public  class EventLoggingListenerSuite extends org.scalatest.FunSuite implements org.scalatest.BeforeAndAfter, org.apache.spark.Logging {
  /**
   * A listener that asserts certain events are logged by the given EventLoggingListener.
   * This is necessary because events are posted asynchronously in a different thread.
   */
  private  class EventExistenceListener implements org.apache.spark.scheduler.SparkListener {
    public   EventExistenceListener (org.apache.spark.scheduler.EventLoggingListener eventLogger) { throw new RuntimeException(); }
    public  boolean jobStarted () { throw new RuntimeException(); }
    public  boolean jobEnded () { throw new RuntimeException(); }
    public  boolean appEnded () { throw new RuntimeException(); }
    public  void onJobStart (org.apache.spark.scheduler.SparkListenerJobStart jobStart) { throw new RuntimeException(); }
    public  void onJobEnd (org.apache.spark.scheduler.SparkListenerJobEnd jobEnd) { throw new RuntimeException(); }
    public  void onApplicationEnd (org.apache.spark.scheduler.SparkListenerApplicationEnd applicationEnd) { throw new RuntimeException(); }
    public  void assertAllCallbacksInvoked () { throw new RuntimeException(); }
  }
  /** Get a SparkConf with event logging enabled. */
  static public  org.apache.spark.SparkConf getLoggingConf (org.apache.hadoop.fs.Path logDir, scala.Option<java.lang.String> compressionCodec) { throw new RuntimeException(); }
  static public  java.lang.String getUniqueApplicationId () { throw new RuntimeException(); }
  public   EventLoggingListenerSuite () { throw new RuntimeException(); }
  private  org.apache.hadoop.fs.FileSystem fileSystem () { throw new RuntimeException(); }
  private  java.io.File testDir () { throw new RuntimeException(); }
  private  org.apache.hadoop.fs.Path testDirPath () { throw new RuntimeException(); }
  /**
   * Test basic event logging functionality.
   * <p>
   * This creates two simple events, posts them to the EventLoggingListener, and verifies that
   * exactly these two events are logged in the expected file.
   */
  private  void testEventLogging (scala.Option<java.lang.String> compressionCodec, scala.collection.immutable.Map<java.lang.String, java.lang.String> extraConf) { throw new RuntimeException(); }
  /**
   * Test end-to-end event logging functionality in an application.
   * This runs a simple Spark job and asserts that the expected events are logged when expected.
   */
  private  void testApplicationEventLogging (scala.Option<java.lang.String> compressionCodec) { throw new RuntimeException(); }
  private  scala.collection.Seq<java.lang.String> readLines (java.io.InputStream in) { throw new RuntimeException(); }
}
