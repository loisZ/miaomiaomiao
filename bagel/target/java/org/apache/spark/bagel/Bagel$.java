package org.apache.spark.bagel;
// no position
public  class Bagel$ implements org.apache.spark.Logging {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final Bagel$ MODULE$ = null;
  public   Bagel$ () { throw new RuntimeException(); }
  public  org.apache.spark.storage.StorageLevel DEFAULT_STORAGE_LEVEL () { throw new RuntimeException(); }
  /**
   * Runs a Bagel program.
   * @param sc org.apache.spark.SparkContext to use for the program.
   * @param vertices vertices of the graph represented as an RDD of (Key, Vertex) pairs. Often the
   *                 Key will be the vertex id.
   * @param messages initial set of messages represented as an RDD of (Key, Message) pairs. Often
   *                 this will be an empty array, i.e. sc.parallelize(Array[K, Message]()).
   * @param combiner {@link org.apache.spark.bagel.Combiner} combines multiple individual messages to a
   *                 given vertex into one message before sending (which often involves network
   *                 I/O).
   * @param aggregator {@link org.apache.spark.bagel.Aggregator} performs a reduce across all vertices
   *                  after each superstep and provides the result to each vertex in the next
   *                  superstep.
   * @param partitioner org.apache.spark.Partitioner partitions values by key
   * @param numPartitions number of partitions across which to split the graph.
   *                      Default is the default parallelism of the SparkContext
   * @param storageLevel org.apache.spark.storage.StorageLevel to use for caching of
   *                    intermediate RDDs in each superstep. Defaults to caching in memory.
   * @param compute function that takes a Vertex, optional set of (possibly combined) messages to
   *                the Vertex, optional Aggregator and the current superstep,
   *                and returns a set of (Vertex, outgoing Messages) pairs
   * @tparam K key
   * @tparam V vertex type
   * @tparam M message type
   * @tparam C combiner
   * @tparam A aggregator
   * @return an RDD of (K, V) pairs representing the graph after completion of the program
   */
  public <K extends java.lang.Object, V extends org.apache.spark.bagel.Vertex, M extends org.apache.spark.bagel.Message<K>, C extends java.lang.Object, A extends java.lang.Object> org.apache.spark.rdd.RDD<scala.Tuple2<K, V>> run (org.apache.spark.SparkContext sc, org.apache.spark.rdd.RDD<scala.Tuple2<K, V>> vertices, org.apache.spark.rdd.RDD<scala.Tuple2<K, M>> messages, org.apache.spark.bagel.Combiner<M, C> combiner, scala.Option<org.apache.spark.bagel.Aggregator<V, A>> aggregator, org.apache.spark.Partitioner partitioner, int numPartitions, org.apache.spark.storage.StorageLevel storageLevel, scala.Function4<V, scala.Option<C>, scala.Option<A>, java.lang.Object, scala.Tuple2<V, M[]>> compute, scala.reflect.Manifest<K> evidence$1, scala.reflect.Manifest<V> evidence$2, scala.reflect.Manifest<M> evidence$3, scala.reflect.Manifest<C> evidence$4, scala.reflect.Manifest<A> evidence$5) { throw new RuntimeException(); }
  /** Runs a Bagel program with no {@link org.apache.spark.bagel.Aggregator} and the default
   * storage level */
  public <K extends java.lang.Object, V extends org.apache.spark.bagel.Vertex, M extends org.apache.spark.bagel.Message<K>, C extends java.lang.Object> org.apache.spark.rdd.RDD<scala.Tuple2<K, V>> run (org.apache.spark.SparkContext sc, org.apache.spark.rdd.RDD<scala.Tuple2<K, V>> vertices, org.apache.spark.rdd.RDD<scala.Tuple2<K, M>> messages, org.apache.spark.bagel.Combiner<M, C> combiner, org.apache.spark.Partitioner partitioner, int numPartitions, scala.Function3<V, scala.Option<C>, java.lang.Object, scala.Tuple2<V, M[]>> compute, scala.reflect.Manifest<K> evidence$6, scala.reflect.Manifest<V> evidence$7, scala.reflect.Manifest<M> evidence$8, scala.reflect.Manifest<C> evidence$9) { throw new RuntimeException(); }
  /** Runs a Bagel program with no {@link org.apache.spark.bagel.Aggregator} */
  public <K extends java.lang.Object, V extends org.apache.spark.bagel.Vertex, M extends org.apache.spark.bagel.Message<K>, C extends java.lang.Object> org.apache.spark.rdd.RDD<scala.Tuple2<K, V>> run (org.apache.spark.SparkContext sc, org.apache.spark.rdd.RDD<scala.Tuple2<K, V>> vertices, org.apache.spark.rdd.RDD<scala.Tuple2<K, M>> messages, org.apache.spark.bagel.Combiner<M, C> combiner, org.apache.spark.Partitioner partitioner, int numPartitions, org.apache.spark.storage.StorageLevel storageLevel, scala.Function3<V, scala.Option<C>, java.lang.Object, scala.Tuple2<V, M[]>> compute, scala.reflect.Manifest<K> evidence$10, scala.reflect.Manifest<V> evidence$11, scala.reflect.Manifest<M> evidence$12, scala.reflect.Manifest<C> evidence$13) { throw new RuntimeException(); }
  /**
   * Runs a Bagel program with no {@link org.apache.spark.bagel.Aggregator}, default
   * org.apache.spark.HashPartitioner and default storage level
   */
  public <K extends java.lang.Object, V extends org.apache.spark.bagel.Vertex, M extends org.apache.spark.bagel.Message<K>, C extends java.lang.Object> org.apache.spark.rdd.RDD<scala.Tuple2<K, V>> run (org.apache.spark.SparkContext sc, org.apache.spark.rdd.RDD<scala.Tuple2<K, V>> vertices, org.apache.spark.rdd.RDD<scala.Tuple2<K, M>> messages, org.apache.spark.bagel.Combiner<M, C> combiner, int numPartitions, scala.Function3<V, scala.Option<C>, java.lang.Object, scala.Tuple2<V, M[]>> compute, scala.reflect.Manifest<K> evidence$14, scala.reflect.Manifest<V> evidence$15, scala.reflect.Manifest<M> evidence$16, scala.reflect.Manifest<C> evidence$17) { throw new RuntimeException(); }
  /**
   * Runs a Bagel program with no {@link org.apache.spark.bagel.Aggregator} and the
   * default org.apache.spark.HashPartitioner
   */
  public <K extends java.lang.Object, V extends org.apache.spark.bagel.Vertex, M extends org.apache.spark.bagel.Message<K>, C extends java.lang.Object> org.apache.spark.rdd.RDD<scala.Tuple2<K, V>> run (org.apache.spark.SparkContext sc, org.apache.spark.rdd.RDD<scala.Tuple2<K, V>> vertices, org.apache.spark.rdd.RDD<scala.Tuple2<K, M>> messages, org.apache.spark.bagel.Combiner<M, C> combiner, int numPartitions, org.apache.spark.storage.StorageLevel storageLevel, scala.Function3<V, scala.Option<C>, java.lang.Object, scala.Tuple2<V, M[]>> compute, scala.reflect.Manifest<K> evidence$18, scala.reflect.Manifest<V> evidence$19, scala.reflect.Manifest<M> evidence$20, scala.reflect.Manifest<C> evidence$21) { throw new RuntimeException(); }
  /**
   * Runs a Bagel program with no {@link org.apache.spark.bagel.Aggregator},
   * default org.apache.spark.HashPartitioner,
   * {@link org.apache.spark.bagel.DefaultCombiner} and the default storage level
   */
  public <K extends java.lang.Object, V extends org.apache.spark.bagel.Vertex, M extends org.apache.spark.bagel.Message<K>> org.apache.spark.rdd.RDD<scala.Tuple2<K, V>> run (org.apache.spark.SparkContext sc, org.apache.spark.rdd.RDD<scala.Tuple2<K, V>> vertices, org.apache.spark.rdd.RDD<scala.Tuple2<K, M>> messages, int numPartitions, scala.Function3<V, scala.Option<M[]>, java.lang.Object, scala.Tuple2<V, M[]>> compute, scala.reflect.Manifest<K> evidence$22, scala.reflect.Manifest<V> evidence$23, scala.reflect.Manifest<M> evidence$24) { throw new RuntimeException(); }
  /**
   * Runs a Bagel program with no {@link org.apache.spark.bagel.Aggregator},
   * the default org.apache.spark.HashPartitioner
   * and {@link org.apache.spark.bagel.DefaultCombiner}
   */
  public <K extends java.lang.Object, V extends org.apache.spark.bagel.Vertex, M extends org.apache.spark.bagel.Message<K>> org.apache.spark.rdd.RDD<scala.Tuple2<K, V>> run (org.apache.spark.SparkContext sc, org.apache.spark.rdd.RDD<scala.Tuple2<K, V>> vertices, org.apache.spark.rdd.RDD<scala.Tuple2<K, M>> messages, int numPartitions, org.apache.spark.storage.StorageLevel storageLevel, scala.Function3<V, scala.Option<M[]>, java.lang.Object, scala.Tuple2<V, M[]>> compute, scala.reflect.Manifest<K> evidence$25, scala.reflect.Manifest<V> evidence$26, scala.reflect.Manifest<M> evidence$27) { throw new RuntimeException(); }
  /**
   * Aggregates the given vertices using the given aggregator, if it
   * is specified.
   */
  private <K extends java.lang.Object, V extends org.apache.spark.bagel.Vertex, A extends java.lang.Object> scala.Option<A> agg (org.apache.spark.rdd.RDD<scala.Tuple2<K, V>> verts, scala.Option<org.apache.spark.bagel.Aggregator<V, A>> aggregator, scala.reflect.Manifest<A> evidence$28) { throw new RuntimeException(); }
  /**
   * Processes the given vertex-message RDD using the compute
   * function. Returns the processed RDD, the number of messages
   * created, and the number of active vertices.
   */
  private <K extends java.lang.Object, V extends org.apache.spark.bagel.Vertex, M extends org.apache.spark.bagel.Message<K>, C extends java.lang.Object> scala.Tuple3<org.apache.spark.rdd.RDD<scala.Tuple2<K, scala.Tuple2<V, M[]>>>, java.lang.Object, java.lang.Object> comp (org.apache.spark.SparkContext sc, org.apache.spark.rdd.RDD<scala.Tuple2<K, scala.Tuple2<scala.collection.Iterable<C>, scala.collection.Iterable<V>>>> grouped, scala.Function2<V, scala.Option<C>, scala.Tuple2<V, M[]>> compute, org.apache.spark.storage.StorageLevel storageLevel, scala.reflect.Manifest<K> evidence$29) { throw new RuntimeException(); }
  /**
   * Converts a compute function that doesn't take an aggregator to
   * one that does, so it can be passed to Bagel.run.
   */
  private <K extends java.lang.Object, V extends org.apache.spark.bagel.Vertex, M extends org.apache.spark.bagel.Message<K>, C extends java.lang.Object> scala.Function4<V, scala.Option<C>, scala.Option<scala.runtime.Nothing$>, java.lang.Object, scala.Tuple2<V, M[]>> addAggregatorArg (scala.Function3<V, scala.Option<C>, java.lang.Object, scala.Tuple2<V, M[]>> compute, scala.reflect.Manifest<K> evidence$30, scala.reflect.Manifest<V> evidence$31, scala.reflect.Manifest<M> evidence$32) { throw new RuntimeException(); }
}
