package org.apache.spark.streaming.dstream;
public  class ForEachDStream<T extends java.lang.Object> extends org.apache.spark.streaming.dstream.DStream<scala.runtime.BoxedUnit> {
  // not preceding
  // TypeTree().setOriginal(TypeBoundsTree(TypeTree().setOriginal(Select(Select(Ident(_root_), scala), scala.Nothing)), TypeTree().setOriginal(Select(Select(Ident(_root_), scala), scala.Any))))
  public   ForEachDStream (org.apache.spark.streaming.dstream.DStream<T> parent, scala.Function2<org.apache.spark.rdd.RDD<T>, org.apache.spark.streaming.Time, scala.runtime.BoxedUnit> foreachFunc, scala.reflect.ClassTag<T> evidence$1) { throw new RuntimeException(); }
  public  scala.collection.immutable.List<org.apache.spark.streaming.dstream.DStream<T>> dependencies () { throw new RuntimeException(); }
  public  org.apache.spark.streaming.Duration slideDuration () { throw new RuntimeException(); }
  public  scala.Option<org.apache.spark.rdd.RDD<scala.runtime.BoxedUnit>> compute (org.apache.spark.streaming.Time validTime) { throw new RuntimeException(); }
  public  scala.Option<org.apache.spark.streaming.scheduler.Job> generateJob (org.apache.spark.streaming.Time time) { throw new RuntimeException(); }
}
