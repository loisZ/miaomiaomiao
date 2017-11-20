package org.apache.spark.mllib.rdd;
/**
 * Machine learning specific RDD functions.
 */
public  class RDDFunctions<T extends java.lang.Object> implements scala.Serializable {
  /** Implicit conversion from an RDD to RDDFunctions. */
  static public <T extends java.lang.Object> org.apache.spark.mllib.rdd.RDDFunctions<T> fromRDD (org.apache.spark.rdd.RDD<T> rdd, scala.reflect.ClassTag<T> evidence$3) { throw new RuntimeException(); }
  // not preceding
  // TypeTree().setOriginal(TypeBoundsTree(TypeTree().setOriginal(Select(Select(Ident(_root_), scala), scala.Nothing)), TypeTree().setOriginal(Select(Select(Ident(_root_), scala), scala.Any))))
  public   RDDFunctions (org.apache.spark.rdd.RDD<T> self, scala.reflect.ClassTag<T> evidence$1) { throw new RuntimeException(); }
  /**
   * Returns a RDD from grouping items of its parent RDD in fixed size blocks by passing a sliding
   * window over them. The ordering is first based on the partition index and then the ordering of
   * items within each partition. This is similar to sliding in Scala collections, except that it
   * becomes an empty RDD if the window size is greater than the total number of items. It needs to
   * trigger a Spark job if the parent RDD has more than one partitions and the window size is
   * greater than 1.
   */
  public  org.apache.spark.rdd.RDD<java.lang.Object> sliding (int windowSize) { throw new RuntimeException(); }
  /**
   * Reduces the elements of this RDD in a multi-level tree pattern.
   * <p>
   * @param depth suggested depth of the tree (default: 2)
   * @see org.apache.spark.rdd.RDD#reduce
   */
  public  T treeReduce (scala.Function2<T, T, T> f, int depth) { throw new RuntimeException(); }
  /**
   * Aggregates the elements of this RDD in a multi-level tree pattern.
   * <p>
   * @param depth suggested depth of the tree (default: 2)
   * @see org.apache.spark.rdd.RDD#aggregate
   */
  public <U extends java.lang.Object> U treeAggregate (U zeroValue, scala.Function2<U, T, U> seqOp, scala.Function2<U, U, U> combOp, int depth, scala.reflect.ClassTag<U> evidence$2) { throw new RuntimeException(); }
}
