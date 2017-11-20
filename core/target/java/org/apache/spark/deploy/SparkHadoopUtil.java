package org.apache.spark.deploy;
/**
 * :: DeveloperApi ::
 * Contains util methods to interact with Hadoop from Spark.
 */
public  class SparkHadoopUtil implements org.apache.spark.Logging {
  static private  org.apache.spark.deploy.SparkHadoopUtil hadoop () { throw new RuntimeException(); }
  static public  org.apache.spark.deploy.SparkHadoopUtil get () { throw new RuntimeException(); }
  public   SparkHadoopUtil () { throw new RuntimeException(); }
  public  org.apache.hadoop.conf.Configuration conf () { throw new RuntimeException(); }
  /**
   * Runs the given function with a Hadoop UserGroupInformation as a thread local variable
   * (distributed to child threads), used for authenticating HDFS and YARN calls.
   * <p>
   * IMPORTANT NOTE: If this function is going to be called repeated in the same process
   * you need to look https://issues.apache.org/jira/browse/HDFS-3545 and possibly
   * do a FileSystem.closeAllForUGI in order to avoid leaking Filesystems
   */
  public  void runAsSparkUser (scala.Function0<scala.runtime.BoxedUnit> func) { throw new RuntimeException(); }
  public  void transferCredentials (org.apache.hadoop.security.UserGroupInformation source, org.apache.hadoop.security.UserGroupInformation dest) { throw new RuntimeException(); }
  public  org.apache.hadoop.conf.Configuration newConfiguration () { throw new RuntimeException(); }
  /**
   * Return an appropriate (subclass) of Configuration. Creating config can initializes some Hadoop
   * subsystems.
   */
  public  org.apache.hadoop.conf.Configuration newConfiguration (org.apache.spark.SparkConf conf) { throw new RuntimeException(); }
  /**
   * Add any user credentials to the job conf which are necessary for running on a secure Hadoop
   * cluster.
   */
  public  void addCredentials (org.apache.hadoop.mapred.JobConf conf) { throw new RuntimeException(); }
  public  boolean isYarnMode () { throw new RuntimeException(); }
  public  org.apache.hadoop.security.Credentials getCurrentUserCredentials () { throw new RuntimeException(); }
  public  void addCurrentUserCredentials (org.apache.hadoop.security.Credentials creds) { throw new RuntimeException(); }
  public  void addSecretKeyToUserCredentials (java.lang.String key, java.lang.String secret) { throw new RuntimeException(); }
  public  byte[] getSecretKeyFromUserCredentials (java.lang.String key) { throw new RuntimeException(); }
  public  void loginUserFromKeytab (java.lang.String principalName, java.lang.String keytabFilename) { throw new RuntimeException(); }
  /**
   * Returns a function that can be called to find Hadoop FileSystem bytes read. If
   * getFSBytesReadOnThreadCallback is called from thread r at time t, the returned callback will
   * return the bytes read on r since t.  Reflection is required because thread-level FileSystem
   * statistics are only available as of Hadoop 2.5 (see HADOOP-10688).
   * Returns None if the required method can't be found.
   */
  public  scala.Option<scala.Function0<java.lang.Object>> getFSBytesReadOnThreadCallback (org.apache.hadoop.fs.Path path, org.apache.hadoop.conf.Configuration conf) { throw new RuntimeException(); }
  /**
   * Returns a function that can be called to find Hadoop FileSystem bytes written. If
   * getFSBytesWrittenOnThreadCallback is called from thread r at time t, the returned callback will
   * return the bytes written on r since t.  Reflection is required because thread-level FileSystem
   * statistics are only available as of Hadoop 2.5 (see HADOOP-10688).
   * Returns None if the required method can't be found.
   */
  public  scala.Option<scala.Function0<java.lang.Object>> getFSBytesWrittenOnThreadCallback (org.apache.hadoop.fs.Path path, org.apache.hadoop.conf.Configuration conf) { throw new RuntimeException(); }
  private  scala.collection.Seq<java.lang.Object> getFileSystemThreadStatistics (org.apache.hadoop.fs.Path path, org.apache.hadoop.conf.Configuration conf) { throw new RuntimeException(); }
  private  java.lang.reflect.Method getFileSystemThreadStatisticsMethod (java.lang.String methodName) { throw new RuntimeException(); }
  /**
   * Using reflection to get the Configuration from JobContext/TaskAttemptContext. If we directly
   * call <code>JobContext/TaskAttemptContext.getConfiguration</code>, it will generate different byte codes
   * for Hadoop 1.+ and Hadoop 2.+ because JobContext/TaskAttemptContext is class in Hadoop 1.+
   * while it's interface in Hadoop 2.+.
   */
  public  org.apache.hadoop.conf.Configuration getConfigurationFromJobContext (org.apache.hadoop.mapreduce.JobContext context) { throw new RuntimeException(); }
}
