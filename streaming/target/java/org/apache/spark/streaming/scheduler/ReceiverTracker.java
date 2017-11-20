package org.apache.spark.streaming.scheduler;
/**
 * This class manages the execution of the receivers of ReceiverInputDStreams. Instance of
 * this class must be created after all input streams have been added and StreamingContext.start()
 * has been called because it needs the final set of input streams at the time of instantiation.
 * <p>
 * @param skipReceiverLaunch Do not launch the receiver. This is useful for testing.
 */
public  class ReceiverTracker implements org.apache.spark.Logging {
  /** Actor to receive messages from the receivers. */
  private  class ReceiverTrackerActor implements akka.actor.Actor {
    public   ReceiverTrackerActor () { throw new RuntimeException(); }
    public  scala.PartialFunction<java.lang.Object, scala.runtime.BoxedUnit> receive () { throw new RuntimeException(); }
  }
  /** This thread class runs all the receivers on the cluster.  */
  public  class ReceiverLauncher {
    public   ReceiverLauncher () { throw new RuntimeException(); }
    public  org.apache.spark.SparkEnv env () { throw new RuntimeException(); }
    public  java.lang.Thread thread () { throw new RuntimeException(); }
    public  void start () { throw new RuntimeException(); }
    public  void stop () { throw new RuntimeException(); }
    /**
     * Get the receivers from the ReceiverInputDStreams, distributes them to the
     * worker nodes as a parallel collection, and runs them.
     */
    private  void startReceivers () { throw new RuntimeException(); }
    /** Stops the receivers. */
    private  void stopReceivers () { throw new RuntimeException(); }
  }
  public   ReceiverTracker (org.apache.spark.streaming.StreamingContext ssc, boolean skipReceiverLaunch) { throw new RuntimeException(); }
  private  org.apache.spark.streaming.dstream.ReceiverInputDStream<?>[] receiverInputStreams () { throw new RuntimeException(); }
  private  int[] receiverInputStreamIds () { throw new RuntimeException(); }
  private  org.apache.spark.streaming.scheduler.ReceiverTracker.ReceiverLauncher receiverExecutor () { throw new RuntimeException(); }
  private  scala.collection.mutable.HashMap<java.lang.Object, org.apache.spark.streaming.scheduler.ReceiverInfo> receiverInfo () { throw new RuntimeException(); }
  private  org.apache.spark.streaming.scheduler.ReceivedBlockTracker receivedBlockTracker () { throw new RuntimeException(); }
  private  org.apache.spark.streaming.scheduler.StreamingListenerBus listenerBus () { throw new RuntimeException(); }
  private  akka.actor.ActorRef actor () { throw new RuntimeException(); }
  /** Start the actor and receiver execution thread. */
  public  void start () { throw new RuntimeException(); }
  /** Stop the receiver execution thread. */
  public  void stop () { throw new RuntimeException(); }
  /** Allocate all unallocated blocks to the given batch. */
  public  void allocateBlocksToBatch (org.apache.spark.streaming.Time batchTime) { throw new RuntimeException(); }
  /** Get the blocks for the given batch and all input streams. */
  public  scala.collection.immutable.Map<java.lang.Object, scala.collection.Seq<org.apache.spark.streaming.scheduler.ReceivedBlockInfo>> getBlocksOfBatch (org.apache.spark.streaming.Time batchTime) { throw new RuntimeException(); }
  /** Get the blocks allocated to the given batch and stream. */
  public  scala.collection.Seq<org.apache.spark.streaming.scheduler.ReceivedBlockInfo> getBlocksOfBatchAndStream (org.apache.spark.streaming.Time batchTime, int streamId) { throw new RuntimeException(); }
  /** Clean up metadata older than the given threshold time */
  public  void cleanupOldMetadata (org.apache.spark.streaming.Time cleanupThreshTime) { throw new RuntimeException(); }
  /** Register a receiver */
  private  void registerReceiver (int streamId, java.lang.String typ, java.lang.String host, akka.actor.ActorRef receiverActor, akka.actor.ActorRef sender) { throw new RuntimeException(); }
  /** Deregister a receiver */
  private  void deregisterReceiver (int streamId, java.lang.String message, java.lang.String error) { throw new RuntimeException(); }
  /** Add new blocks for the given stream */
  private  boolean addBlock (org.apache.spark.streaming.scheduler.ReceivedBlockInfo receivedBlockInfo) { throw new RuntimeException(); }
  /** Report error sent by a receiver */
  private  void reportError (int streamId, java.lang.String message, java.lang.String error) { throw new RuntimeException(); }
  /** Check if any blocks are left to be processed */
  public  boolean hasUnallocatedBlocks () { throw new RuntimeException(); }
}
