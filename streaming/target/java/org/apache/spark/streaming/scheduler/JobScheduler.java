package org.apache.spark.streaming.scheduler;
/**
 * This class schedules jobs to be run on Spark. It uses the JobGenerator to generate
 * the jobs and runs them using a thread pool.
 */
public  class JobScheduler implements org.apache.spark.Logging {
  public  org.apache.spark.streaming.StreamingContext ssc () { throw new RuntimeException(); }
  // not preceding
  public   JobScheduler (org.apache.spark.streaming.StreamingContext ssc) { throw new RuntimeException(); }
  private  java.util.concurrent.ConcurrentHashMap<org.apache.spark.streaming.Time, org.apache.spark.streaming.scheduler.JobSet> jobSets () { throw new RuntimeException(); }
  private  int numConcurrentJobs () { throw new RuntimeException(); }
  private  java.util.concurrent.ExecutorService jobExecutor () { throw new RuntimeException(); }
  private  org.apache.spark.streaming.scheduler.JobGenerator jobGenerator () { throw new RuntimeException(); }
  public  org.apache.spark.streaming.util.Clock clock () { throw new RuntimeException(); }
  public  org.apache.spark.streaming.scheduler.StreamingListenerBus listenerBus () { throw new RuntimeException(); }
  public  org.apache.spark.streaming.scheduler.ReceiverTracker receiverTracker () { throw new RuntimeException(); }
  private  akka.actor.ActorRef eventActor () { throw new RuntimeException(); }
  public  void start () { throw new RuntimeException(); }
  public  void stop (boolean processAllReceivedData) { throw new RuntimeException(); }
  public  void submitJobSet (org.apache.spark.streaming.scheduler.JobSet jobSet) { throw new RuntimeException(); }
  public  scala.collection.Seq<org.apache.spark.streaming.Time> getPendingTimes () { throw new RuntimeException(); }
  public  void reportError (java.lang.String msg, java.lang.Throwable e) { throw new RuntimeException(); }
  private  void processEvent (org.apache.spark.streaming.scheduler.JobSchedulerEvent event) { throw new RuntimeException(); }
  private  void handleJobStart (org.apache.spark.streaming.scheduler.Job job) { throw new RuntimeException(); }
  private  void handleJobCompletion (org.apache.spark.streaming.scheduler.Job job) { throw new RuntimeException(); }
  private  void handleError (java.lang.String msg, java.lang.Throwable e) { throw new RuntimeException(); }
  private  class JobHandler implements java.lang.Runnable {
    public   JobHandler (org.apache.spark.streaming.scheduler.Job job) { throw new RuntimeException(); }
    public  void run () { throw new RuntimeException(); }
  }
}
