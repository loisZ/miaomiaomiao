package org.apache.spark.scheduler.cluster;
/**
 * Abstract Yarn scheduler backend that contains common logic
 * between the client and cluster Yarn scheduler backends.
 */
public abstract class YarnSchedulerBackend extends org.apache.spark.scheduler.cluster.CoarseGrainedSchedulerBackend {
  /**
   * An actor that communicates with the ApplicationMaster.
   */
  private  class YarnSchedulerActor implements akka.actor.Actor {
    public   YarnSchedulerActor () { throw new RuntimeException(); }
    private  scala.Option<akka.actor.ActorRef> amActor () { throw new RuntimeException(); }
    public  void preStart () { throw new RuntimeException(); }
    public  scala.PartialFunction<java.lang.Object, scala.runtime.BoxedUnit> receive () { throw new RuntimeException(); }
  }
  static public  java.lang.String ACTOR_NAME () { throw new RuntimeException(); }
  public   YarnSchedulerBackend (org.apache.spark.scheduler.TaskSchedulerImpl scheduler, org.apache.spark.SparkContext sc) { throw new RuntimeException(); }
  protected  int totalExpectedExecutors () { throw new RuntimeException(); }
  private  akka.actor.ActorRef yarnSchedulerActor () { throw new RuntimeException(); }
  private  scala.concurrent.duration.FiniteDuration askTimeout () { throw new RuntimeException(); }
  /**
   * Request executors from the ApplicationMaster by specifying the total number desired.
   * This includes executors already pending or running.
   */
  public  boolean doRequestTotalExecutors (int requestedTotal) { throw new RuntimeException(); }
  /**
   * Request that the ApplicationMaster kill the specified executors.
   */
  public  boolean doKillExecutors (scala.collection.Seq<java.lang.String> executorIds) { throw new RuntimeException(); }
  public  boolean sufficientResourcesRegistered () { throw new RuntimeException(); }
  /**
   * Add filters to the SparkUI.
   */
  private  void addWebUIFilter (java.lang.String filterName, scala.collection.immutable.Map<java.lang.String, java.lang.String> filterParams, java.lang.String proxyBase) { throw new RuntimeException(); }
}
