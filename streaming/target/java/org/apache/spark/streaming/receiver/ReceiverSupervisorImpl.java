package org.apache.spark.streaming.receiver;
/**
 * Concrete implementation of {@link org.apache.spark.streaming.receiver.ReceiverSupervisor}
 * which provides all the necessary functionality for handling the data received by
 * the receiver. Specifically, it creates a {@link org.apache.spark.streaming.receiver.BlockGenerator}
 * object that is used to divide the received data stream into blocks of data.
 */
public  class ReceiverSupervisorImpl extends org.apache.spark.streaming.receiver.ReceiverSupervisor implements org.apache.spark.Logging {
  public   ReceiverSupervisorImpl (org.apache.spark.streaming.receiver.Receiver<?> receiver, org.apache.spark.SparkEnv env, org.apache.hadoop.conf.Configuration hadoopConf, scala.Option<java.lang.String> checkpointDirOption) { throw new RuntimeException(); }
  private  org.apache.spark.streaming.receiver.ReceivedBlockHandler receivedBlockHandler () { throw new RuntimeException(); }
  /** Remote Akka actor for the ReceiverTracker */
  private  akka.actor.ActorSelection trackerActor () { throw new RuntimeException(); }
  /** Timeout for Akka actor messages */
  private  scala.concurrent.duration.FiniteDuration askTimeout () { throw new RuntimeException(); }
  /** Akka actor for receiving messages from the ReceiverTracker in the driver */
  private  akka.actor.ActorRef actor () { throw new RuntimeException(); }
  /** Unique block ids if one wants to add blocks directly */
  private  java.util.concurrent.atomic.AtomicLong newBlockId () { throw new RuntimeException(); }
  /** Divides received data records into data blocks for pushing in BlockManager. */
  private  org.apache.spark.streaming.receiver.BlockGenerator blockGenerator () { throw new RuntimeException(); }
  /** Push a single record of received data into block generator. */
  public  void pushSingle (Object data) { throw new RuntimeException(); }
  /** Store an ArrayBuffer of received data as a data block into Spark's memory. */
  public  void pushArrayBuffer (scala.collection.mutable.ArrayBuffer<?> arrayBuffer, scala.Option<java.lang.Object> metadataOption, scala.Option<org.apache.spark.storage.StreamBlockId> blockIdOption) { throw new RuntimeException(); }
  /** Store a iterator of received data as a data block into Spark's memory. */
  public  void pushIterator (scala.collection.Iterator<java.lang.Object> iterator, scala.Option<java.lang.Object> metadataOption, scala.Option<org.apache.spark.storage.StreamBlockId> blockIdOption) { throw new RuntimeException(); }
  /** Store the bytes of received data as a data block into Spark's memory. */
  public  void pushBytes (java.nio.ByteBuffer bytes, scala.Option<java.lang.Object> metadataOption, scala.Option<org.apache.spark.storage.StreamBlockId> blockIdOption) { throw new RuntimeException(); }
  /** Store block and report it to driver */
  public  void pushAndReportBlock (org.apache.spark.streaming.receiver.ReceivedBlock receivedBlock, scala.Option<java.lang.Object> metadataOption, scala.Option<org.apache.spark.storage.StreamBlockId> blockIdOption) { throw new RuntimeException(); }
  /** Report error to the receiver tracker */
  public  void reportError (java.lang.String message, java.lang.Throwable error) { throw new RuntimeException(); }
  protected  void onStart () { throw new RuntimeException(); }
  protected  void onStop (java.lang.String message, scala.Option<java.lang.Throwable> error) { throw new RuntimeException(); }
  protected  void onReceiverStart () { throw new RuntimeException(); }
  protected  void onReceiverStop (java.lang.String message, scala.Option<java.lang.Throwable> error) { throw new RuntimeException(); }
  /** Generate new block ID */
  private  org.apache.spark.storage.StreamBlockId nextBlockId () { throw new RuntimeException(); }
}
