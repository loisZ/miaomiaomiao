package org.apache.spark.streaming.dstream;
public  class UnionDStream<T extends java.lang.Object> extends org.apache.spark.streaming.dstream.DStream<T> {
  // not preceding
  // TypeTree().setOriginal(TypeBoundsTree(TypeTree().setOriginal(Select(Select(Ident(_root_), scala), scala.Nothing)), TypeTree().setOriginal(Select(Select(Ident(_root_), scala), scala.Any))))
  public   UnionDStream (org.apache.spark.streaming.dstream.DStream<T>[] parents, scala.reflect.ClassTag<T> evidence$1) { throw new RuntimeException(); }
  public  scala.collection.immutable.List<org.apache.spark.streaming.dstream.DStream<T>> dependencies () { throw new RuntimeException(); }
  public  org.apache.spark.streaming.Duration slideDuration () { throw new RuntimeException(); }
  public  scala.Option<org.apache.spark.rdd.RDD<T>> compute (org.apache.spark.streaming.Time validTime) { throw new RuntimeException(); }
}
