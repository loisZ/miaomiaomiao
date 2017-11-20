package org.apache.spark.network.nio;
public abstract class Message {
  static public  long BUFFER_MESSAGE () { throw new RuntimeException(); }
  static public  int lastId () { throw new RuntimeException(); }
  static public  int getNewId () { throw new RuntimeException(); }
  static public  org.apache.spark.network.nio.BufferMessage createBufferMessage (scala.collection.Seq<java.nio.ByteBuffer> dataBuffers, int ackId) { throw new RuntimeException(); }
  static public  org.apache.spark.network.nio.BufferMessage createBufferMessage (scala.collection.Seq<java.nio.ByteBuffer> dataBuffers) { throw new RuntimeException(); }
  static public  org.apache.spark.network.nio.BufferMessage createBufferMessage (java.nio.ByteBuffer dataBuffer, int ackId) { throw new RuntimeException(); }
  static public  org.apache.spark.network.nio.BufferMessage createBufferMessage (java.nio.ByteBuffer dataBuffer) { throw new RuntimeException(); }
  static public  org.apache.spark.network.nio.BufferMessage createBufferMessage (int ackId) { throw new RuntimeException(); }
  /**
   * Create a "negative acknowledgment" to notify a sender that an error occurred
   * while processing its message.  The exception's stacktrace will be formatted
   * as a string, serialized into a byte array, and sent as the message payload.
   */
  static public  org.apache.spark.network.nio.BufferMessage createErrorMessage (java.lang.Exception exception, int ackId) { throw new RuntimeException(); }
  static public  org.apache.spark.network.nio.Message create (org.apache.spark.network.nio.MessageChunkHeader header) { throw new RuntimeException(); }
  public  long typ () { throw new RuntimeException(); }
  public  int id () { throw new RuntimeException(); }
  // not preceding
  public   Message (long typ, int id) { throw new RuntimeException(); }
  public  java.net.InetSocketAddress senderAddress () { throw new RuntimeException(); }
  public  boolean started () { throw new RuntimeException(); }
  public  long startTime () { throw new RuntimeException(); }
  public  long finishTime () { throw new RuntimeException(); }
  public  boolean isSecurityNeg () { throw new RuntimeException(); }
  public  boolean hasError () { throw new RuntimeException(); }
  public abstract  int size () ;
  public abstract  scala.Option<org.apache.spark.network.nio.MessageChunk> getChunkForSending (int maxChunkSize) ;
  public abstract  scala.Option<org.apache.spark.network.nio.MessageChunk> getChunkForReceiving (int chunkSize) ;
  public  java.lang.String timeTaken () { throw new RuntimeException(); }
  public  java.lang.String toString () { throw new RuntimeException(); }
}
