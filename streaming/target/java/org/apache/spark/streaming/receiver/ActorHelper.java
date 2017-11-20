package org.apache.spark.streaming.receiver;
/**
 * :: DeveloperApi ::
 * A receiver trait to be mixed in with your Actor to gain access to
 * the API for pushing received data into Spark Streaming for being processed.
 * <p>
 * Find more details at: http://spark.apache.org/docs/latest/streaming-custom-receivers.html
 * <p>
 * @example <pre><code>
 *  class MyActor extends Actor with ActorHelper{
 *      def receive {
 *          case anything: String =&gt; store(anything)
 *      }
 *  }
 *
 *  // Can be used with an actorStream as follows
 *  ssc.actorStream[String](Props(new MyActor),"MyActorReceiver")
 *
 * </code></pre>
 * <p>
 * @note Since Actor may exist outside the spark framework, It is thus user's responsibility
 *       to ensure the type safety, i.e parametrized type of push block and InputDStream
 *       should be same.
 */
public  interface ActorHelper extends org.apache.spark.Logging {
  /** Store an iterator of received data as a data block into Spark's memory. */
  public <T extends java.lang.Object> void store (scala.collection.Iterator<T> iter) ;
  /**
   * Store the bytes of received data as a data block into Spark's memory. Note
   * that the data in the ByteBuffer must be serialized using the same serializer
   * that Spark is configured to use.
   */
  public  void store (java.nio.ByteBuffer bytes) ;
  /**
   * Store a single item of received data to Spark's memory.
   * These single items will be aggregated together into data blocks before
   * being pushed into Spark's memory.
   */
  public <T extends java.lang.Object> void store (T item) ;
}
