package org.apache.spark.streaming.receiver;
/** class representing a block received as an ByteBuffer */
public  class ByteBufferBlock implements org.apache.spark.streaming.receiver.ReceivedBlock, scala.Product, scala.Serializable {
  public  java.nio.ByteBuffer byteBuffer () { throw new RuntimeException(); }
  // not preceding
  public   ByteBufferBlock (java.nio.ByteBuffer byteBuffer) { throw new RuntimeException(); }
}
