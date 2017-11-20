package org.apache.spark.deploy.worker;
/**
 * @param masterUrls Each url should look like spark://host:port.
 */
public  class Worker implements akka.actor.Actor, org.apache.spark.util.ActorLogReceive, org.apache.spark.Logging {
  static public  void main (java.lang.String[] argStrings) { throw new RuntimeException(); }
  static public  scala.Tuple2<akka.actor.ActorSystem, java.lang.Object> startSystemAndActor (java.lang.String host, int port, int webUiPort, int cores, int memory, java.lang.String[] masterUrls, java.lang.String workDir, scala.Option<java.lang.Object> workerNumber) { throw new RuntimeException(); }
  public  org.apache.spark.SparkConf conf () { throw new RuntimeException(); }
  public  org.apache.spark.SecurityManager securityMgr () { throw new RuntimeException(); }
  // not preceding
  public   Worker (java.lang.String host, int port, int webUiPort, int cores, int memory, java.lang.String[] masterUrls, java.lang.String actorSystemName, java.lang.String actorName, java.lang.String workDirPath, org.apache.spark.SparkConf conf, org.apache.spark.SecurityManager securityMgr) { throw new RuntimeException(); }
  public  java.text.SimpleDateFormat createDateFormat () { throw new RuntimeException(); }
  public  long HEARTBEAT_MILLIS () { throw new RuntimeException(); }
  public  int INITIAL_REGISTRATION_RETRIES () { throw new RuntimeException(); }
  public  int TOTAL_REGISTRATION_RETRIES () { throw new RuntimeException(); }
  public  double FUZZ_MULTIPLIER_INTERVAL_LOWER_BOUND () { throw new RuntimeException(); }
  public  double REGISTRATION_RETRY_FUZZ_MULTIPLIER () { throw new RuntimeException(); }
  public  scala.concurrent.duration.FiniteDuration INITIAL_REGISTRATION_RETRY_INTERVAL () { throw new RuntimeException(); }
  public  scala.concurrent.duration.FiniteDuration PROLONGED_REGISTRATION_RETRY_INTERVAL () { throw new RuntimeException(); }
  public  boolean CLEANUP_ENABLED () { throw new RuntimeException(); }
  public  long CLEANUP_INTERVAL_MILLIS () { throw new RuntimeException(); }
  public  long APP_DATA_RETENTION_SECS () { throw new RuntimeException(); }
  public  boolean testing () { throw new RuntimeException(); }
  public  akka.actor.ActorSelection master () { throw new RuntimeException(); }
  public  akka.actor.Address masterAddress () { throw new RuntimeException(); }
  public  java.lang.String activeMasterUrl () { throw new RuntimeException(); }
  public  java.lang.String activeMasterWebUiUrl () { throw new RuntimeException(); }
  public  java.lang.String akkaUrl () { throw new RuntimeException(); }
  public  boolean registered () { throw new RuntimeException(); }
  public  boolean connected () { throw new RuntimeException(); }
  public  java.lang.String workerId () { throw new RuntimeException(); }
  public  java.io.File sparkHome () { throw new RuntimeException(); }
  public  java.io.File workDir () { throw new RuntimeException(); }
  public  scala.collection.mutable.HashMap<java.lang.String, org.apache.spark.deploy.worker.ExecutorRunner> executors () { throw new RuntimeException(); }
  public  scala.collection.mutable.HashMap<java.lang.String, org.apache.spark.deploy.worker.ExecutorRunner> finishedExecutors () { throw new RuntimeException(); }
  public  scala.collection.mutable.HashMap<java.lang.String, org.apache.spark.deploy.worker.DriverRunner> drivers () { throw new RuntimeException(); }
  public  scala.collection.mutable.HashMap<java.lang.String, org.apache.spark.deploy.worker.DriverRunner> finishedDrivers () { throw new RuntimeException(); }
  public  scala.collection.mutable.HashMap<java.lang.String, scala.collection.Seq<java.lang.String>> appDirectories () { throw new RuntimeException(); }
  public  scala.collection.mutable.HashSet<java.lang.String> finishedApps () { throw new RuntimeException(); }
  public  org.apache.spark.deploy.worker.StandaloneWorkerShuffleService shuffleService () { throw new RuntimeException(); }
  public  java.lang.String publicAddress () { throw new RuntimeException(); }
  public  org.apache.spark.deploy.worker.ui.WorkerWebUI webUi () { throw new RuntimeException(); }
  public  int coresUsed () { throw new RuntimeException(); }
  public  int memoryUsed () { throw new RuntimeException(); }
  public  int connectionAttemptCount () { throw new RuntimeException(); }
  public  org.apache.spark.metrics.MetricsSystem metricsSystem () { throw new RuntimeException(); }
  public  org.apache.spark.deploy.worker.WorkerSource workerSource () { throw new RuntimeException(); }
  public  scala.Option<akka.actor.Cancellable> registrationRetryTimer () { throw new RuntimeException(); }
  public  int coresFree () { throw new RuntimeException(); }
  public  int memoryFree () { throw new RuntimeException(); }
  public  void createWorkDir () { throw new RuntimeException(); }
  public  void preStart () { throw new RuntimeException(); }
  public  void changeMaster (java.lang.String url, java.lang.String uiUrl) { throw new RuntimeException(); }
  // not preceding
  private  void tryRegisterAllMasters () { throw new RuntimeException(); }
  /**
   * Re-register with the master because a network failure or a master failure has occurred.
   * If the re-registration attempt threshold is exceeded, the worker exits with error.
   * Note that for thread-safety this should only be called from the actor.
   */
  private  void reregisterWithMaster () { throw new RuntimeException(); }
  public  void registerWithMaster () { throw new RuntimeException(); }
  public  scala.PartialFunction<java.lang.Object, scala.runtime.BoxedUnit> receiveWithLogging () { throw new RuntimeException(); }
  private  void masterDisconnected () { throw new RuntimeException(); }
  private  void maybeCleanupApplication (java.lang.String id) { throw new RuntimeException(); }
  public  java.lang.String generateWorkerId () { throw new RuntimeException(); }
  public  void postStop () { throw new RuntimeException(); }
}
