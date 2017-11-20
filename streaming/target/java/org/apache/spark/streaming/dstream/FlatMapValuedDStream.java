package org.apache.spark.streaming.dstream;
public  class FlatMapValuedDStream<K extends java.lang.Object, V extends java.lang.Object, U extends java.lang.Object> extends org.apache.spark.streaming.dstream.DStream<scala.Tuple2<K, U>> {
  // not preceding
  // TypeTree().setOriginal(TypeBoundsTree(TypeTree().setOriginal(Select(Select(Ident(_root_), scala), scala.Nothing)), TypeTree().setOriginal(Select(Select(Ident(_root_), scala), scala.Any))))
  // TypeTree().setOriginal(TypeBoundsTree(TypeTree().setOriginal(Select(Select(Ident(_root_), scala), scala.Nothing)), TypeTree().setOriginal(Select(Select(Ident(_root_), scala), scala.Any))))
  // TypeTree().setOriginal(TypeBoundsTree(TypeTree().setOriginal(Select(Select(Ident(_root_), scala), scala.Nothing)), TypeTree().setOriginal(Select(Select(Ident(_root_), scala), scala.Any))))
  public   FlatMapValuedDStream (org.apache.spark.streaming.dstream.DStream<scala.Tuple2<K, V>> parent, scala.Function1<V, scala.collection.TraversableOnce<U>> flatMapValueFunc, scala.reflect.ClassTag<K> evidence$1, scala.reflect.ClassTag<V> evidence$2, scala.reflect.ClassTag<U> evidence$3) { throw new RuntimeException(); }
  public  scala.collection.immutable.List<org.apache.spark.streaming.dstream.DStream<scala.Tuple2<K, V>>> dependencies () { throw new RuntimeException(); }
  public  org.apache.spark.streaming.Duration slideDuration () { throw new RuntimeException(); }
  public  scala.Option<org.apache.spark.rdd.RDD<scala.Tuple2<K, U>>> compute (org.apache.spark.streaming.Time validTime) { throw new RuntimeException(); }
}
