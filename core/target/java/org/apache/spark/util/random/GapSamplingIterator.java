package org.apache.spark.util.random;
public  class GapSamplingIterator<T extends java.lang.Object> implements scala.collection.Iterator<T> {
  public  scala.collection.Iterator<T> data () { throw new RuntimeException(); }
  // not preceding
  public   GapSamplingIterator (scala.collection.Iterator<T> data, double f, java.util.Random rng, double epsilon, scala.reflect.ClassTag<T> evidence$3) { throw new RuntimeException(); }
  /** implement efficient linear-sequence drop until Scala includes fix for jira SI-8835. */
  private  scala.Function1<java.lang.Object, scala.runtime.BoxedUnit> iterDrop () { throw new RuntimeException(); }
  public  boolean hasNext () { throw new RuntimeException(); }
  public  T next () { throw new RuntimeException(); }
  private  double lnq () { throw new RuntimeException(); }
  /** skip elements that won't be sampled, according to geometric dist P(k) = (f)(1-f)^k. */
  private  void advance () { throw new RuntimeException(); }
}
