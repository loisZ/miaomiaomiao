package org.apache.spark.streaming.dstream;
public  class PluggableInputDStream<T extends java.lang.Object> extends org.apache.spark.streaming.dstream.ReceiverInputDStream<T> {
  // not preceding
  // TypeTree().setOriginal(TypeBoundsTree(TypeTree().setOriginal(Select(Select(Ident(_root_), scala), scala.Nothing)), TypeTree().setOriginal(Select(Select(Ident(_root_), scala), scala.Any))))
  public   PluggableInputDStream (org.apache.spark.streaming.StreamingContext ssc_, org.apache.spark.streaming.receiver.Receiver<T> receiver, scala.reflect.ClassTag<T> evidence$1) { throw new RuntimeException(); }
  public  org.apache.spark.streaming.receiver.Receiver<T> getReceiver () { throw new RuntimeException(); }
}
