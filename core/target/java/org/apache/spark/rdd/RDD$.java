package org.apache.spark.rdd;
// no position
/**
 * Defines implicit functions that provide extra functionalities on RDDs of specific types.
 * <p>
 * For example, {@link RDD.rddToPairRDDFunctions} converts an RDD into a {@link PairRDDFunctions} for
 * key-value-pair RDDs, and enabling extra functionalities such as {@link PairRDDFunctions.reduceByKey}.
 */
public  class RDD$ implements scala.Serializable {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final RDD$ MODULE$ = null;
  public   RDD$ () { throw new RuntimeException(); }
  public <K extends java.lang.Object, V extends java.lang.Object> org.apache.spark.rdd.PairRDDFunctions<K, V> rddToPairRDDFunctions (org.apache.spark.rdd.RDD<scala.Tuple2<K, V>> rdd, scala.reflect.ClassTag<K> kt, scala.reflect.ClassTag<V> vt, scala.math.Ordering<K> ord) { throw new RuntimeException(); }
  public <T extends java.lang.Object> org.apache.spark.rdd.AsyncRDDActions<T> rddToAsyncRDDActions (org.apache.spark.rdd.RDD<T> rdd, scala.reflect.ClassTag<T> evidence$35) { throw new RuntimeException(); }
  public <K extends java.lang.Object, V extends java.lang.Object> org.apache.spark.rdd.SequenceFileRDDFunctions<K, V> rddToSequenceFileRDDFunctions (org.apache.spark.rdd.RDD<scala.Tuple2<K, V>> rdd, scala.Function1<K, org.apache.hadoop.io.Writable> evidence$36, scala.reflect.ClassTag<K> evidence$37, scala.Function1<V, org.apache.hadoop.io.Writable> evidence$38, scala.reflect.ClassTag<V> evidence$39) { throw new RuntimeException(); }
  public <K extends java.lang.Object, V extends java.lang.Object> org.apache.spark.rdd.OrderedRDDFunctions<K, V, scala.Tuple2<K, V>> rddToOrderedRDDFunctions (org.apache.spark.rdd.RDD<scala.Tuple2<K, V>> rdd, scala.math.Ordering<K> evidence$40, scala.reflect.ClassTag<K> evidence$41, scala.reflect.ClassTag<V> evidence$42) { throw new RuntimeException(); }
  public  org.apache.spark.rdd.DoubleRDDFunctions doubleRDDToDoubleRDDFunctions (org.apache.spark.rdd.RDD<java.lang.Object> rdd) { throw new RuntimeException(); }
  public <T extends java.lang.Object> org.apache.spark.rdd.DoubleRDDFunctions numericRDDToDoubleRDDFunctions (org.apache.spark.rdd.RDD<T> rdd, scala.math.Numeric<T> num) { throw new RuntimeException(); }
}
