package org.apache.spark.network.nio;
// no position
public  class BlockMessage$ {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final BlockMessage$ MODULE$ = null;
  public   BlockMessage$ () { throw new RuntimeException(); }
  public  int TYPE_NON_INITIALIZED () { throw new RuntimeException(); }
  public  int TYPE_GET_BLOCK () { throw new RuntimeException(); }
  public  int TYPE_GOT_BLOCK () { throw new RuntimeException(); }
  public  int TYPE_PUT_BLOCK () { throw new RuntimeException(); }
  public  org.apache.spark.network.nio.BlockMessage fromBufferMessage (org.apache.spark.network.nio.BufferMessage bufferMessage) { throw new RuntimeException(); }
  public  org.apache.spark.network.nio.BlockMessage fromByteBuffer (java.nio.ByteBuffer buffer) { throw new RuntimeException(); }
  public  org.apache.spark.network.nio.BlockMessage fromGetBlock (org.apache.spark.network.nio.GetBlock getBlock) { throw new RuntimeException(); }
  public  org.apache.spark.network.nio.BlockMessage fromGotBlock (org.apache.spark.network.nio.GotBlock gotBlock) { throw new RuntimeException(); }
  public  org.apache.spark.network.nio.BlockMessage fromPutBlock (org.apache.spark.network.nio.PutBlock putBlock) { throw new RuntimeException(); }
}
