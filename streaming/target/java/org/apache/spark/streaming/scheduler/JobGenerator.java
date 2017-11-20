package org.apache.spark.streaming.scheduler;
/**
 * This class generates jobs from DStreams as well as drives checkpointing and cleaning
 * up DStream metadata.
 */
public  class JobGenerator implements org.apache.spark.Logging {
  public   JobGenerator (org.apache.spark.streaming.scheduler.JobScheduler jobScheduler) { throw new RuntimeException(); }
  private  org.apache.spark.streaming.StreamingContext ssc () { throw new RuntimeException(); }
  private  org.apache.spark.SparkConf conf () { throw new RuntimeException(); }
  private  org.apache.spark.streaming.DStreamGraph graph () { throw new RuntimeException(); }
  public  org.apache.spark.streaming.util.Clock clock () { throw new RuntimeException(); }
  private  org.apache.spark.streaming.util.RecurringTimer timer () { throw new RuntimeException(); }
  private  boolean shouldCheckpoint () { throw new RuntimeException(); }
  private  org.apache.spark.streaming.CheckpointWriter checkpointWriter () { throw new RuntimeException(); }
  private  akka.actor.ActorRef eventActor () { throw new RuntimeException(); }
  private  org.apache.spark.streaming.Time lastProcessedBatch () { throw new RuntimeException(); }
  /** Start generation of jobs */
  public  void start () { throw new RuntimeException(); }
  /**
   * Stop generation of jobs. processReceivedData = true makes this wait until jobs
   * of current ongoing time interval has been generated, processed and corresponding
   * checkpoints written.
   */
  public  void stop (boolean processReceivedData) { throw new RuntimeException(); }
  /**
   * Callback called when a batch has been completely processed.
   */
  public  void onBatchCompletion (org.apache.spark.streaming.Time time) { throw new RuntimeException(); }
  /**
   * Callback called when the checkpoint of a batch has been written.
   */
  public  void onCheckpointCompletion (org.apache.spark.streaming.Time time) { throw new RuntimeException(); }
  /** Processes all events */
  private  void processEvent (org.apache.spark.streaming.scheduler.JobGeneratorEvent event) { throw new RuntimeException(); }
  /** Starts the generator for the first time */
  private  void startFirstTime () { throw new RuntimeException(); }
  /** Restarts the generator based on the information in checkpoint */
  private  void restart () { throw new RuntimeException(); }
  /** Generate jobs and perform checkpoint for the given `time`.  */
  private  void generateJobs (org.apache.spark.streaming.Time time) { throw new RuntimeException(); }
  /** Clear DStream metadata for the given `time`. */
  private  void clearMetadata (org.apache.spark.streaming.Time time) { throw new RuntimeException(); }
  /** Clear DStream checkpoint data for the given `time`. */
  private  void clearCheckpointData (org.apache.spark.streaming.Time time) { throw new RuntimeException(); }
  /** Perform checkpoint for the give `time`. */
  private  void doCheckpoint (org.apache.spark.streaming.Time time) { throw new RuntimeException(); }
  private  void markBatchFullyProcessed (org.apache.spark.streaming.Time time) { throw new RuntimeException(); }
}
