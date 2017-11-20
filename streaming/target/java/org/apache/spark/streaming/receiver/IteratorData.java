package org.apache.spark.streaming.receiver;
public  class IteratorData<T extends java.lang.Object> implements org.apache.spark.streaming.receiver.ActorReceiverData, scala.Product, scala.Serializable {
  public  scala.collection.Iterator<T> iterator () { throw new RuntimeException(); }
  // not preceding
  public   IteratorData (scala.collection.Iterator<T> iterator) { throw new RuntimeException(); }
}
