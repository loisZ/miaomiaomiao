package org.apache.spark.util.collection;
/**
 * A simple wrapper over the Java implementation {@link TimSort}.
 * <p>
 * The Java implementation is package private, and hence it cannot be called outside package
 * org.apache.spark.util.collection. This is a simple wrapper of it that is available to spark.
 */
public  class Sorter<K extends java.lang.Object, Buffer extends java.lang.Object> {
  private  org.apache.spark.util.collection.SortDataFormat<K, Buffer> s () { throw new RuntimeException(); }
  // not preceding
  public   Sorter (org.apache.spark.util.collection.SortDataFormat<K, Buffer> s) { throw new RuntimeException(); }
  private  org.apache.spark.util.collection.TimSort<K, Buffer> timSort () { throw new RuntimeException(); }
  /**
   * Sorts the input buffer within range [lo, hi).
   */
  public  void sort (Buffer a, int lo, int hi, java.util.Comparator<? super K> c) { throw new RuntimeException(); }
}
