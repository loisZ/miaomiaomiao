package org.apache.spark.ui;
/**
 * Top level user interface for a Spark application.
 */
public  class SparkUI extends org.apache.spark.ui.WebUI implements org.apache.spark.Logging {
  static public  int DEFAULT_PORT () { throw new RuntimeException(); }
  static public  java.lang.String STATIC_RESOURCE_DIR () { throw new RuntimeException(); }
  static public  int getUIPort (org.apache.spark.SparkConf conf) { throw new RuntimeException(); }
  static public  org.apache.spark.ui.SparkUI createLiveUI (org.apache.spark.SparkContext sc, org.apache.spark.SparkConf conf, org.apache.spark.scheduler.SparkListenerBus listenerBus, org.apache.spark.ui.jobs.JobProgressListener jobProgressListener, org.apache.spark.SecurityManager securityManager, java.lang.String appName) { throw new RuntimeException(); }
  static public  org.apache.spark.ui.SparkUI createHistoryUI (org.apache.spark.SparkConf conf, org.apache.spark.scheduler.SparkListenerBus listenerBus, org.apache.spark.SecurityManager securityManager, java.lang.String appName, java.lang.String basePath) { throw new RuntimeException(); }
  /**
   * Create a new Spark UI.
   * <p>
   * @param sc optional SparkContext; this can be None when reconstituting a UI from event logs.
   * @param jobProgressListener if supplied, this JobProgressListener will be used; otherwise, the
   *                            web UI will create and register its own JobProgressListener.
   */
  static private  org.apache.spark.ui.SparkUI create (scala.Option<org.apache.spark.SparkContext> sc, org.apache.spark.SparkConf conf, org.apache.spark.scheduler.SparkListenerBus listenerBus, org.apache.spark.SecurityManager securityManager, java.lang.String appName, java.lang.String basePath, scala.Option<org.apache.spark.ui.jobs.JobProgressListener> jobProgressListener) { throw new RuntimeException(); }
  public  scala.Option<org.apache.spark.SparkContext> sc () { throw new RuntimeException(); }
  public  org.apache.spark.SparkConf conf () { throw new RuntimeException(); }
  public  org.apache.spark.SecurityManager securityManager () { throw new RuntimeException(); }
  public  org.apache.spark.ui.env.EnvironmentListener environmentListener () { throw new RuntimeException(); }
  public  org.apache.spark.storage.StorageStatusListener storageStatusListener () { throw new RuntimeException(); }
  public  org.apache.spark.ui.exec.ExecutorsListener executorsListener () { throw new RuntimeException(); }
  public  org.apache.spark.ui.jobs.JobProgressListener jobProgressListener () { throw new RuntimeException(); }
  public  org.apache.spark.ui.storage.StorageListener storageListener () { throw new RuntimeException(); }
  public  java.lang.String appName () { throw new RuntimeException(); }
  public  java.lang.String basePath () { throw new RuntimeException(); }
  // not preceding
  private   SparkUI (scala.Option<org.apache.spark.SparkContext> sc, org.apache.spark.SparkConf conf, org.apache.spark.SecurityManager securityManager, org.apache.spark.ui.env.EnvironmentListener environmentListener, org.apache.spark.storage.StorageStatusListener storageStatusListener, org.apache.spark.ui.exec.ExecutorsListener executorsListener, org.apache.spark.ui.jobs.JobProgressListener jobProgressListener, org.apache.spark.ui.storage.StorageListener storageListener, java.lang.String appName, java.lang.String basePath) { throw new RuntimeException(); }
  public  boolean killEnabled () { throw new RuntimeException(); }
  /** Initialize all components of the server. */
  public  void initialize () { throw new RuntimeException(); }
  public  java.lang.String getAppName () { throw new RuntimeException(); }
  /** Set the app name for this UI. */
  public  void setAppName (java.lang.String name) { throw new RuntimeException(); }
  /** Stop the server behind this web interface. Only valid after bind(). */
  public  void stop () { throw new RuntimeException(); }
  /**
   * Return the application UI host:port. This does not include the scheme (http://).
   */
  public  java.lang.String appUIHostPort () { throw new RuntimeException(); }
  public  java.lang.String appUIAddress () { throw new RuntimeException(); }
}
