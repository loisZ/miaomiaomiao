package org.apache.spark.graphx.impl;
/** Add a new edge to the partition. */
public  class EdgeWithLocalIds<ED extends java.lang.Object> implements scala.Product, scala.Serializable {
  static public <ED extends java.lang.Object> scala.math.Ordering<org.apache.spark.graphx.impl.EdgeWithLocalIds<ED>> lexicographicOrdering () { throw new RuntimeException(); }
  static public <ED extends java.lang.Object> org.apache.spark.util.collection.SortDataFormat<org.apache.spark.graphx.impl.EdgeWithLocalIds<ED>, org.apache.spark.graphx.impl.EdgeWithLocalIds<ED>[]> edgeArraySortDataFormat () { throw new RuntimeException(); }
  public  long srcId () { throw new RuntimeException(); }
  public  long dstId () { throw new RuntimeException(); }
  public  int localSrcId () { throw new RuntimeException(); }
  public  int localDstId () { throw new RuntimeException(); }
  public  ED attr () { throw new RuntimeException(); }
  // not preceding
  public   EdgeWithLocalIds (long srcId, long dstId, int localSrcId, int localDstId, ED attr) { throw new RuntimeException(); }
}
