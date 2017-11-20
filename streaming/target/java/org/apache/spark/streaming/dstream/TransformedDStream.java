package org.apache.spark.streaming.dstream;
public  class TransformedDStream<U extends java.lang.Object> extends org.apache.spark.streaming.dstream.DStream<U> {
  // not preceding
  // TypeTree().setOriginal(TypeBoundsTree(TypeTree().setOriginal(Select(Select(Ident(_root_), scala), scala.Nothing)), TypeTree().setOriginal(Select(Select(Ident(_root_), scala), scala.Any))))
  public   TransformedDStream (scala.collection.Seq<org.apache.spark.streaming.dstream.DStream<?>> parents, scala.Function2<scala.collection.Seq<org.apache.spark.rdd.RDD<?>>, org.apache.spark.streaming.Time, org.apache.spark.rdd.RDD<U>> transformFunc, scala.reflect.ClassTag<U> evidence$1) { throw new RuntimeException(); }
  public  scala.collection.immutable.List<org.apache.spark.streaming.dstream.DStream<?>> dependencies () { throw new RuntimeException(); }
  public  org.apache.spark.streaming.Duration slideDuration () { throw new RuntimeException(); }
  public  scala.Option<org.apache.spark.rdd.RDD<U>> compute (org.apache.spark.streaming.Time validTime) { throw new RuntimeException(); }
}
