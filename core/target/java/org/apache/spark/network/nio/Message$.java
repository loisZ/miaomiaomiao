package org.apache.spark.network.nio;
// no position
public  class Message$ {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final Message$ MODULE$ = null;
  public   Message$ () { throw new RuntimeException(); }
  public  long BUFFER_MESSAGE () { throw new RuntimeException(); }
  public  int lastId () { throw new RuntimeException(); }
  public  int getNewId () { throw new RuntimeException(); }
  public  org.apache.spark.network.nio.BufferMessage createBufferMessage (scala.collection.Seq<java.nio.ByteBuffer> dataBuffers, int ackId) { throw new RuntimeException(); }
  public  org.apache.spark.network.nio.BufferMessage createBufferMessage (scala.collection.Seq<java.nio.ByteBuffer> dataBuffers) { throw new RuntimeException(); }
  public  org.apache.spark.network.nio.BufferMessage createBufferMessage (java.nio.ByteBuffer dataBuffer, int ackId) { throw new RuntimeException(); }
  public  org.apache.spark.network.nio.BufferMessage createBufferMessage (java.nio.ByteBuffer dataBuffer) { throw new RuntimeException(); }
  public  org.apache.spark.network.nio.BufferMessage createBufferMessage (int ackId) { throw new RuntimeException(); }
  /**
   * Create a "negative acknowledgment" to notify a sender that an error occurred
   * while processing its message.  The exception's stacktrace will be formatted
   * as a string, serialized into a byte array, and sent as the message payload.
   */
  public  org.apache.spark.network.nio.BufferMessage createErrorMessage (java.lang.Exception exception, int ackId) { throw new RuntimeException(); }
  public  org.apache.spark.network.nio.Message create (org.apache.spark.network.nio.MessageChunkHeader header) { throw new RuntimeException(); }
}
