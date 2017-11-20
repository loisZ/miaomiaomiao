package org.apache.spark.streaming.dstream;
/**
 * Abstract class for defining any {@link org.apache.spark.streaming.dstream.InputDStream}
 * that has to start a receiver on worker nodes to receive external data.
 * Specific implementations of ReceiverInputDStream must
 * define <code>the getReceiver()</code> function that gets the receiver object of type
 * {@link org.apache.spark.streaming.receiver.Receiver} that will be sent
 * to the workers to receive data.
 * @param ssc_ Streaming context that will execute this input stream
 * @tparam T Class type of the object of this stream
 */
public abstract class ReceiverInputDStream<T extends java.lang.Object> extends org.apache.spark.streaming.dstream.InputDStream<T> {
  // not preceding
  // TypeTree().setOriginal(TypeBoundsTree(TypeTree().setOriginal(Select(Select(Ident(_root_), scala), scala.Nothing)), TypeTree().setOriginal(Select(Select(Ident(_root_), scala), scala.Any))))
  public   ReceiverInputDStream (org.apache.spark.streaming.StreamingContext ssc_, scala.reflect.ClassTag<T> evidence$1) { throw new RuntimeException(); }
  /** This is an unique identifier for the receiver input stream. */
  public  int id () { throw new RuntimeException(); }
  /**
   * Gets the receiver object that will be sent to the worker nodes
   * to receive data. This method needs to defined by any specific implementation
   * of a ReceiverInputDStream.
   */
  public abstract  org.apache.spark.streaming.receiver.Receiver<T> getReceiver () ;
  public  void start () { throw new RuntimeException(); }
  public  void stop () { throw new RuntimeException(); }
  /**
   * Generates RDDs with blocks received by the receiver of this stream. */
  public  scala.Option<org.apache.spark.rdd.RDD<T>> compute (org.apache.spark.streaming.Time validTime) { throw new RuntimeException(); }
  /**
   * Clear metadata that are older than <code>rememberDuration</code> of this DStream.
   * This is an internal method that should not be called directly. This
   * implementation overrides the default implementation to clear received
   * block information.
   */
  public  void clearMetadata (org.apache.spark.streaming.Time time) { throw new RuntimeException(); }
}
