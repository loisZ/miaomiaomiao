package org.apache.spark.scheduler.cluster;
/**
 * A scheduler backend that waits for coarse grained executors to connect to it through Akka.
 * This backend holds onto each executor for the duration of the Spark job rather than relinquishing
 * executors whenever a task is done and asking the scheduler to launch a new executor for
 * each new task. Executors may be launched in a variety of ways, such as Mesos tasks for the
 * coarse-grained Mesos mode or standalone processes for Spark's standalone deploy mode
 * (spark.deploy.*).
 */
public  class CoarseGrainedSchedulerBackend implements org.apache.spark.ExecutorAllocationClient, org.apache.spark.scheduler.SchedulerBackend, org.apache.spark.Logging {
  public  class DriverActor implements akka.actor.Actor, org.apache.spark.util.ActorLogReceive {
    public   DriverActor (scala.collection.Seq<scala.Tuple2<java.lang.String, java.lang.String>> sparkProperties) { throw new RuntimeException(); }
    protected  org.slf4j.Logger log () { throw new RuntimeException(); }
    private  scala.collection.mutable.HashMap<akka.actor.Address, java.lang.String> addressToExecutorId () { throw new RuntimeException(); }
    public  void preStart () { throw new RuntimeException(); }
    public  scala.PartialFunction<java.lang.Object, scala.runtime.BoxedUnit> receiveWithLogging () { throw new RuntimeException(); }
    public  void makeOffers () { throw new RuntimeException(); }
    public  void makeOffers (java.lang.String executorId) { throw new RuntimeException(); }
    public  void launchTasks (scala.collection.Seq<scala.collection.Seq<org.apache.spark.scheduler.TaskDescription>> tasks) { throw new RuntimeException(); }
    public  void removeExecutor (java.lang.String executorId, java.lang.String reason) { throw new RuntimeException(); }
  }
  static public  java.lang.String ACTOR_NAME () { throw new RuntimeException(); }
  public  akka.actor.ActorSystem actorSystem () { throw new RuntimeException(); }
  // not preceding
  public   CoarseGrainedSchedulerBackend (org.apache.spark.scheduler.TaskSchedulerImpl scheduler, akka.actor.ActorSystem actorSystem) { throw new RuntimeException(); }
  public  java.util.concurrent.atomic.AtomicInteger totalCoreCount () { throw new RuntimeException(); }
  public  java.util.concurrent.atomic.AtomicInteger totalRegisteredExecutors () { throw new RuntimeException(); }
  public  org.apache.spark.SparkConf conf () { throw new RuntimeException(); }
  private  scala.concurrent.duration.FiniteDuration timeout () { throw new RuntimeException(); }
  private  int akkaFrameSize () { throw new RuntimeException(); }
  public  double minRegisteredRatio () { throw new RuntimeException(); }
  public  int maxRegisteredWaitingTime () { throw new RuntimeException(); }
  public  long createTime () { throw new RuntimeException(); }
  private  scala.collection.mutable.HashMap<java.lang.String, org.apache.spark.scheduler.cluster.ExecutorData> executorDataMap () { throw new RuntimeException(); }
  private  int numPendingExecutors () { throw new RuntimeException(); }
  private  scala.collection.mutable.HashSet<java.lang.String> executorsPendingToRemove () { throw new RuntimeException(); }
  public  akka.actor.ActorRef driverActor () { throw new RuntimeException(); }
  public  scala.collection.mutable.HashMap<java.lang.String, scala.collection.mutable.HashSet<java.lang.String>> taskIdsOnSlave () { throw new RuntimeException(); }
  public  void start () { throw new RuntimeException(); }
  public  void stopExecutors () { throw new RuntimeException(); }
  public  void stop () { throw new RuntimeException(); }
  public  void reviveOffers () { throw new RuntimeException(); }
  public  void killTask (long taskId, java.lang.String executorId, boolean interruptThread) { throw new RuntimeException(); }
  public  int defaultParallelism () { throw new RuntimeException(); }
  public  void removeExecutor (java.lang.String executorId, java.lang.String reason) { throw new RuntimeException(); }
  public  boolean sufficientResourcesRegistered () { throw new RuntimeException(); }
  public  boolean isReady () { throw new RuntimeException(); }
  /**
   * Return the number of executors currently registered with this backend.
   */
  public  int numExistingExecutors () { throw new RuntimeException(); }
  /**
   * Request an additional number of executors from the cluster manager.
   * Return whether the request is acknowledged.
   */
  public final  boolean requestExecutors (int numAdditionalExecutors) { throw new RuntimeException(); }
  /**
   * Request executors from the cluster manager by specifying the total number desired,
   * including existing pending and running executors.
   * <p>
   * The semantics here guarantee that we do not over-allocate executors for this application,
   * since a later request overrides the value of any prior request. The alternative interface
   * of requesting a delta of executors risks double counting new executors when there are
   * insufficient resources to satisfy the first request. We make the assumption here that the
   * cluster manager will eventually fulfill all requests when resources free up.
   * <p>
   * Return whether the request is acknowledged.
   */
  protected  boolean doRequestTotalExecutors (int requestedTotal) { throw new RuntimeException(); }
  /**
   * Request that the cluster manager kill the specified executors.
   * Return whether the kill request is acknowledged.
   */
  public final  boolean killExecutors (scala.collection.Seq<java.lang.String> executorIds) { throw new RuntimeException(); }
  /**
   * Kill the given list of executors through the cluster manager.
   * Return whether the kill request is acknowledged.
   */
  protected  boolean doKillExecutors (scala.collection.Seq<java.lang.String> executorIds) { throw new RuntimeException(); }
}
