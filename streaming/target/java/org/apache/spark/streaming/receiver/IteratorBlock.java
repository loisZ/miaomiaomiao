package org.apache.spark.streaming.receiver;
/** class representing a block received as an Iterator */
public  class IteratorBlock implements org.apache.spark.streaming.receiver.ReceivedBlock, scala.Product, scala.Serializable {
  public  Object iterator () { throw new RuntimeException(); }
  // not preceding
  public   IteratorBlock (scala.collection.Iterator<java.lang.Object> iterator) { throw new RuntimeException(); }
}
