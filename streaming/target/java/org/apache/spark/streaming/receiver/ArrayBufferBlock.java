package org.apache.spark.streaming.receiver;
/** class representing a block received as an ArrayBuffer */
public  class ArrayBufferBlock implements org.apache.spark.streaming.receiver.ReceivedBlock, scala.Product, scala.Serializable {
  public  Object arrayBuffer () { throw new RuntimeException(); }
  // not preceding
  public   ArrayBufferBlock (scala.collection.mutable.ArrayBuffer<?> arrayBuffer) { throw new RuntimeException(); }
}
