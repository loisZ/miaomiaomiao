package org.apache.spark.network.nio;
public  class MessageChunk {
  public  org.apache.spark.network.nio.MessageChunkHeader header () { throw new RuntimeException(); }
  public  java.nio.ByteBuffer buffer () { throw new RuntimeException(); }
  // not preceding
  public   MessageChunk (org.apache.spark.network.nio.MessageChunkHeader header, java.nio.ByteBuffer buffer) { throw new RuntimeException(); }
  public  int size () { throw new RuntimeException(); }
  public  scala.collection.mutable.ArrayBuffer<java.nio.ByteBuffer> buffers () { throw new RuntimeException(); }
  public  java.lang.String toString () { throw new RuntimeException(); }
}
