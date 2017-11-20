package org.apache.spark.streaming.dstream;
public  class MappedDStream<T extends java.lang.Object, U extends java.lang.Object> extends org.apache.spark.streaming.dstream.DStream<U> {
  // not preceding
  // TypeTree().setOriginal(TypeBoundsTree(TypeTree().setOriginal(Select(Select(Ident(_root_), scala), scala.Nothing)), TypeTree().setOriginal(Select(Select(Ident(_root_), scala), scala.Any))))
  // TypeTree().setOriginal(TypeBoundsTree(TypeTree().setOriginal(Select(Select(Ident(_root_), scala), scala.Nothing)), TypeTree().setOriginal(Select(Select(Ident(_root_), scala), scala.Any))))
  public   MappedDStream (org.apache.spark.streaming.dstream.DStream<T> parent, scala.Function1<T, U> mapFunc, scala.reflect.ClassTag<T> evidence$1, scala.reflect.ClassTag<U> evidence$2) { throw new RuntimeException(); }
  public  scala.collection.immutable.List<org.apache.spark.streaming.dstream.DStream<T>> dependencies () { throw new RuntimeException(); }
  public  org.apache.spark.streaming.Duration slideDuration () { throw new RuntimeException(); }
  public  scala.Option<org.apache.spark.rdd.RDD<U>> compute (org.apache.spark.streaming.Time validTime) { throw new RuntimeException(); }
}
