package org.apache.spark.streaming.receiver;
public  class SingleItemData<T extends java.lang.Object> implements org.apache.spark.streaming.receiver.ActorReceiverData, scala.Product, scala.Serializable {
  public  T item () { throw new RuntimeException(); }
  // not preceding
  public   SingleItemData (T item) { throw new RuntimeException(); }
}
