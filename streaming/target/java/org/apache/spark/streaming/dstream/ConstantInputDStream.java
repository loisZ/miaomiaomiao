package org.apache.spark.streaming.dstream;
/**
 * An input stream that always returns the same RDD on each timestep. Useful for testing.
 */
public  class ConstantInputDStream<T extends java.lang.Object> extends org.apache.spark.streaming.dstream.InputDStream<T> {
  // not preceding
  // TypeTree().setOriginal(TypeBoundsTree(TypeTree().setOriginal(Select(Select(Ident(_root_), scala), scala.Nothing)), TypeTree().setOriginal(Select(Select(Ident(_root_), scala), scala.Any))))
  public   ConstantInputDStream (org.apache.spark.streaming.StreamingContext ssc_, org.apache.spark.rdd.RDD<T> rdd, scala.reflect.ClassTag<T> evidence$1) { throw new RuntimeException(); }
  public  void start () { throw new RuntimeException(); }
  public  void stop () { throw new RuntimeException(); }
  public  scala.Option<org.apache.spark.rdd.RDD<T>> compute (org.apache.spark.streaming.Time validTime) { throw new RuntimeException(); }
}
