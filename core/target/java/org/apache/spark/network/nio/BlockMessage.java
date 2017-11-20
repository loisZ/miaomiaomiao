package org.apache.spark.network.nio;
public  class BlockMessage {
  static public  int TYPE_NON_INITIALIZED () { throw new RuntimeException(); }
  static public  int TYPE_GET_BLOCK () { throw new RuntimeException(); }
  static public  int TYPE_GOT_BLOCK () { throw new RuntimeException(); }
  static public  int TYPE_PUT_BLOCK () { throw new RuntimeException(); }
  static public  org.apache.spark.network.nio.BlockMessage fromBufferMessage (org.apache.spark.network.nio.BufferMessage bufferMessage) { throw new RuntimeException(); }
  static public  org.apache.spark.network.nio.BlockMessage fromByteBuffer (java.nio.ByteBuffer buffer) { throw new RuntimeException(); }
  static public  org.apache.spark.network.nio.BlockMessage fromGetBlock (org.apache.spark.network.nio.GetBlock getBlock) { throw new RuntimeException(); }
  static public  org.apache.spark.network.nio.BlockMessage fromGotBlock (org.apache.spark.network.nio.GotBlock gotBlock) { throw new RuntimeException(); }
  static public  org.apache.spark.network.nio.BlockMessage fromPutBlock (org.apache.spark.network.nio.PutBlock putBlock) { throw new RuntimeException(); }
  public   BlockMessage () { throw new RuntimeException(); }
  private  int typ () { throw new RuntimeException(); }
  private  org.apache.spark.storage.BlockId id () { throw new RuntimeException(); }
  private  java.nio.ByteBuffer data () { throw new RuntimeException(); }
  private  org.apache.spark.storage.StorageLevel level () { throw new RuntimeException(); }
  public  void set (org.apache.spark.network.nio.GetBlock getBlock) { throw new RuntimeException(); }
  public  void set (org.apache.spark.network.nio.GotBlock gotBlock) { throw new RuntimeException(); }
  public  void set (org.apache.spark.network.nio.PutBlock putBlock) { throw new RuntimeException(); }
  public  void set (java.nio.ByteBuffer buffer) { throw new RuntimeException(); }
  public  void set (org.apache.spark.network.nio.BufferMessage bufferMsg) { throw new RuntimeException(); }
  public  int getType () { throw new RuntimeException(); }
  public  org.apache.spark.storage.BlockId getId () { throw new RuntimeException(); }
  public  java.nio.ByteBuffer getData () { throw new RuntimeException(); }
  public  org.apache.spark.storage.StorageLevel getLevel () { throw new RuntimeException(); }
  public  org.apache.spark.network.nio.BufferMessage toBufferMessage () { throw new RuntimeException(); }
  public  java.lang.String toString () { throw new RuntimeException(); }
}
