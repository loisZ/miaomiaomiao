package org.apache.spark.streaming.dstream;
/**
 * Extra functions available on DStream of (key, value) pairs through an implicit conversion.
 */
public  class PairDStreamFunctions<K extends java.lang.Object, V extends java.lang.Object> implements scala.Serializable {
  // not preceding
  // TypeTree().setOriginal(TypeBoundsTree(TypeTree().setOriginal(Select(Select(Ident(_root_), scala), scala.Nothing)), TypeTree().setOriginal(Select(Select(Ident(_root_), scala), scala.Any))))
  // TypeTree().setOriginal(TypeBoundsTree(TypeTree().setOriginal(Select(Select(Ident(_root_), scala), scala.Nothing)), TypeTree().setOriginal(Select(Select(Ident(_root_), scala), scala.Any))))
  public   PairDStreamFunctions (org.apache.spark.streaming.dstream.DStream<scala.Tuple2<K, V>> self, scala.reflect.ClassTag<K> kt, scala.reflect.ClassTag<V> vt, scala.math.Ordering<K> ord) { throw new RuntimeException(); }
  public  org.apache.spark.streaming.StreamingContext ssc () { throw new RuntimeException(); }
  public  org.apache.spark.HashPartitioner defaultPartitioner (int numPartitions) { throw new RuntimeException(); }
  /**
   * Return a new DStream by applying <code>groupByKey</code> to each RDD. Hash partitioning is used to
   * generate the RDDs with Spark's default number of partitions.
   */
  public  org.apache.spark.streaming.dstream.DStream<scala.Tuple2<K, scala.collection.Iterable<V>>> groupByKey () { throw new RuntimeException(); }
  /**
   * Return a new DStream by applying <code>groupByKey</code> to each RDD. Hash partitioning is used to
   * generate the RDDs with <code>numPartitions</code> partitions.
   */
  public  org.apache.spark.streaming.dstream.DStream<scala.Tuple2<K, scala.collection.Iterable<V>>> groupByKey (int numPartitions) { throw new RuntimeException(); }
  /**
   * Return a new DStream by applying <code>groupByKey</code> on each RDD. The supplied
   * org.apache.spark.Partitioner is used to control the partitioning of each RDD.
   */
  public  org.apache.spark.streaming.dstream.DStream<scala.Tuple2<K, scala.collection.Iterable<V>>> groupByKey (org.apache.spark.Partitioner partitioner) { throw new RuntimeException(); }
  /**
   * Return a new DStream by applying <code>reduceByKey</code> to each RDD. The values for each key are
   * merged using the associative reduce function. Hash partitioning is used to generate the RDDs
   * with Spark's default number of partitions.
   */
  public  org.apache.spark.streaming.dstream.DStream<scala.Tuple2<K, V>> reduceByKey (scala.Function2<V, V, V> reduceFunc) { throw new RuntimeException(); }
  /**
   * Return a new DStream by applying <code>reduceByKey</code> to each RDD. The values for each key are
   * merged using the supplied reduce function. Hash partitioning is used to generate the RDDs
   * with <code>numPartitions</code> partitions.
   */
  public  org.apache.spark.streaming.dstream.DStream<scala.Tuple2<K, V>> reduceByKey (scala.Function2<V, V, V> reduceFunc, int numPartitions) { throw new RuntimeException(); }
  /**
   * Return a new DStream by applying <code>reduceByKey</code> to each RDD. The values for each key are
   * merged using the supplied reduce function. org.apache.spark.Partitioner is used to control
   * the partitioning of each RDD.
   */
  public  org.apache.spark.streaming.dstream.DStream<scala.Tuple2<K, V>> reduceByKey (scala.Function2<V, V, V> reduceFunc, org.apache.spark.Partitioner partitioner) { throw new RuntimeException(); }
  /**
   * Combine elements of each key in DStream's RDDs using custom functions. This is similar to the
   * combineByKey for RDDs. Please refer to combineByKey in
   * org.apache.spark.rdd.PairRDDFunctions in the Spark core documentation for more information.
   */
  public <C extends java.lang.Object> org.apache.spark.streaming.dstream.DStream<scala.Tuple2<K, C>> combineByKey (scala.Function1<V, C> createCombiner, scala.Function2<C, V, C> mergeValue, scala.Function2<C, C, C> mergeCombiner, org.apache.spark.Partitioner partitioner, boolean mapSideCombine, scala.reflect.ClassTag<C> evidence$1) { throw new RuntimeException(); }
  /**
   * Return a new DStream by applying <code>groupByKey</code> over a sliding window. This is similar to
   * <code>DStream.groupByKey()</code> but applies it over a sliding window. The new DStream generates RDDs
   * with the same interval as this DStream. Hash partitioning is used to generate the RDDs with
   * Spark's default number of partitions.
   * @param windowDuration width of the window; must be a multiple of this DStream's
   *                       batching interval
   */
  public  org.apache.spark.streaming.dstream.DStream<scala.Tuple2<K, scala.collection.Iterable<V>>> groupByKeyAndWindow (org.apache.spark.streaming.Duration windowDuration) { throw new RuntimeException(); }
  /**
   * Return a new DStream by applying <code>groupByKey</code> over a sliding window. Similar to
   * <code>DStream.groupByKey()</code>, but applies it over a sliding window. Hash partitioning is used to
   * generate the RDDs with Spark's default number of partitions.
   * @param windowDuration width of the window; must be a multiple of this DStream's
   *                       batching interval
   * @param slideDuration  sliding interval of the window (i.e., the interval after which
   *                       the new DStream will generate RDDs); must be a multiple of this
   *                       DStream's batching interval
   */
  public  org.apache.spark.streaming.dstream.DStream<scala.Tuple2<K, scala.collection.Iterable<V>>> groupByKeyAndWindow (org.apache.spark.streaming.Duration windowDuration, org.apache.spark.streaming.Duration slideDuration) { throw new RuntimeException(); }
  /**
   * Return a new DStream by applying <code>groupByKey</code> over a sliding window on <code>this</code> DStream.
   * Similar to <code>DStream.groupByKey()</code>, but applies it over a sliding window.
   * Hash partitioning is used to generate the RDDs with <code>numPartitions</code> partitions.
   * @param windowDuration width of the window; must be a multiple of this DStream's
   *                       batching interval
   * @param slideDuration  sliding interval of the window (i.e., the interval after which
   *                       the new DStream will generate RDDs); must be a multiple of this
   *                       DStream's batching interval
   * @param numPartitions  number of partitions of each RDD in the new DStream; if not specified
   *                       then Spark's default number of partitions will be used
   */
  public  org.apache.spark.streaming.dstream.DStream<scala.Tuple2<K, scala.collection.Iterable<V>>> groupByKeyAndWindow (org.apache.spark.streaming.Duration windowDuration, org.apache.spark.streaming.Duration slideDuration, int numPartitions) { throw new RuntimeException(); }
  /**
   * Create a new DStream by applying <code>groupByKey</code> over a sliding window on <code>this</code> DStream.
   * Similar to <code>DStream.groupByKey()</code>, but applies it over a sliding window.
   * @param windowDuration width of the window; must be a multiple of this DStream's
   *                       batching interval
   * @param slideDuration  sliding interval of the window (i.e., the interval after which
   *                       the new DStream will generate RDDs); must be a multiple of this
   *                       DStream's batching interval
   * @param partitioner    partitioner for controlling the partitioning of each RDD in the new
   *                       DStream.
   */
  public  org.apache.spark.streaming.dstream.DStream<scala.Tuple2<K, scala.collection.Iterable<V>>> groupByKeyAndWindow (org.apache.spark.streaming.Duration windowDuration, org.apache.spark.streaming.Duration slideDuration, org.apache.spark.Partitioner partitioner) { throw new RuntimeException(); }
  /**
   * Return a new DStream by applying <code>reduceByKey</code> over a sliding window on <code>this</code> DStream.
   * Similar to <code>DStream.reduceByKey()</code>, but applies it over a sliding window. The new DStream
   * generates RDDs with the same interval as this DStream. Hash partitioning is used to generate
   * the RDDs with Spark's default number of partitions.
   * @param reduceFunc associative reduce function
   * @param windowDuration width of the window; must be a multiple of this DStream's
   *                       batching interval
   */
  public  org.apache.spark.streaming.dstream.DStream<scala.Tuple2<K, V>> reduceByKeyAndWindow (scala.Function2<V, V, V> reduceFunc, org.apache.spark.streaming.Duration windowDuration) { throw new RuntimeException(); }
  /**
   * Return a new DStream by applying <code>reduceByKey</code> over a sliding window. This is similar to
   * <code>DStream.reduceByKey()</code> but applies it over a sliding window. Hash partitioning is used to
   * generate the RDDs with Spark's default number of partitions.
   * @param reduceFunc associative reduce function
   * @param windowDuration width of the window; must be a multiple of this DStream's
   *                       batching interval
   * @param slideDuration  sliding interval of the window (i.e., the interval after which
   *                       the new DStream will generate RDDs); must be a multiple of this
   *                       DStream's batching interval
   */
  public  org.apache.spark.streaming.dstream.DStream<scala.Tuple2<K, V>> reduceByKeyAndWindow (scala.Function2<V, V, V> reduceFunc, org.apache.spark.streaming.Duration windowDuration, org.apache.spark.streaming.Duration slideDuration) { throw new RuntimeException(); }
  /**
   * Return a new DStream by applying <code>reduceByKey</code> over a sliding window. This is similar to
   * <code>DStream.reduceByKey()</code> but applies it over a sliding window. Hash partitioning is used to
   * generate the RDDs with <code>numPartitions</code> partitions.
   * @param reduceFunc associative reduce function
   * @param windowDuration width of the window; must be a multiple of this DStream's
   *                       batching interval
   * @param slideDuration  sliding interval of the window (i.e., the interval after which
   *                       the new DStream will generate RDDs); must be a multiple of this
   *                       DStream's batching interval
   * @param numPartitions  number of partitions of each RDD in the new DStream.
   */
  public  org.apache.spark.streaming.dstream.DStream<scala.Tuple2<K, V>> reduceByKeyAndWindow (scala.Function2<V, V, V> reduceFunc, org.apache.spark.streaming.Duration windowDuration, org.apache.spark.streaming.Duration slideDuration, int numPartitions) { throw new RuntimeException(); }
  /**
   * Return a new DStream by applying <code>reduceByKey</code> over a sliding window. Similar to
   * <code>DStream.reduceByKey()</code>, but applies it over a sliding window.
   * @param reduceFunc associative reduce function
   * @param windowDuration width of the window; must be a multiple of this DStream's
   *                       batching interval
   * @param slideDuration  sliding interval of the window (i.e., the interval after which
   *                       the new DStream will generate RDDs); must be a multiple of this
   *                       DStream's batching interval
   * @param partitioner    partitioner for controlling the partitioning of each RDD
   *                       in the new DStream.
   */
  public  org.apache.spark.streaming.dstream.DStream<scala.Tuple2<K, V>> reduceByKeyAndWindow (scala.Function2<V, V, V> reduceFunc, org.apache.spark.streaming.Duration windowDuration, org.apache.spark.streaming.Duration slideDuration, org.apache.spark.Partitioner partitioner) { throw new RuntimeException(); }
  /**
   * Return a new DStream by applying incremental <code>reduceByKey</code> over a sliding window.
   * The reduced value of over a new window is calculated using the old window's reduced value :
   *  1. reduce the new values that entered the window (e.g., adding new counts)
   * <p>
   *  2. "inverse reduce" the old values that left the window (e.g., subtracting old counts)
   * <p>
   * This is more efficient than reduceByKeyAndWindow without "inverse reduce" function.
   * However, it is applicable to only "invertible reduce functions".
   * Hash partitioning is used to generate the RDDs with Spark's default number of partitions.
   * @param reduceFunc associative reduce function
   * @param invReduceFunc inverse reduce function
   * @param windowDuration width of the window; must be a multiple of this DStream's
   *                       batching interval
   * @param slideDuration  sliding interval of the window (i.e., the interval after which
   *                       the new DStream will generate RDDs); must be a multiple of this
   *                       DStream's batching interval
   * @param filterFunc     Optional function to filter expired key-value pairs;
   *                       only pairs that satisfy the function are retained
   */
  public  org.apache.spark.streaming.dstream.DStream<scala.Tuple2<K, V>> reduceByKeyAndWindow (scala.Function2<V, V, V> reduceFunc, scala.Function2<V, V, V> invReduceFunc, org.apache.spark.streaming.Duration windowDuration, org.apache.spark.streaming.Duration slideDuration, int numPartitions, scala.Function1<scala.Tuple2<K, V>, java.lang.Object> filterFunc) { throw new RuntimeException(); }
  /**
   * Return a new DStream by applying incremental <code>reduceByKey</code> over a sliding window.
   * The reduced value of over a new window is calculated using the old window's reduced value :
   *  1. reduce the new values that entered the window (e.g., adding new counts)
   *  2. "inverse reduce" the old values that left the window (e.g., subtracting old counts)
   * This is more efficient than reduceByKeyAndWindow without "inverse reduce" function.
   * However, it is applicable to only "invertible reduce functions".
   * @param reduceFunc     associative reduce function
   * @param invReduceFunc  inverse reduce function
   * @param windowDuration width of the window; must be a multiple of this DStream's
   *                       batching interval
   * @param slideDuration  sliding interval of the window (i.e., the interval after which
   *                       the new DStream will generate RDDs); must be a multiple of this
   *                       DStream's batching interval
   * @param partitioner    partitioner for controlling the partitioning of each RDD in the new
   *                       DStream.
   * @param filterFunc     Optional function to filter expired key-value pairs;
   *                       only pairs that satisfy the function are retained
   */
  public  org.apache.spark.streaming.dstream.DStream<scala.Tuple2<K, V>> reduceByKeyAndWindow (scala.Function2<V, V, V> reduceFunc, scala.Function2<V, V, V> invReduceFunc, org.apache.spark.streaming.Duration windowDuration, org.apache.spark.streaming.Duration slideDuration, org.apache.spark.Partitioner partitioner, scala.Function1<scala.Tuple2<K, V>, java.lang.Object> filterFunc) { throw new RuntimeException(); }
  /**
   * Return a new "state" DStream where the state for each key is updated by applying
   * the given function on the previous state of the key and the new values of each key.
   * Hash partitioning is used to generate the RDDs with Spark's default number of partitions.
   * @param updateFunc State update function. If <code>this</code> function returns None, then
   *                   corresponding state key-value pair will be eliminated.
   * @tparam S State type
   */
  public <S extends java.lang.Object> org.apache.spark.streaming.dstream.DStream<scala.Tuple2<K, S>> updateStateByKey (scala.Function2<scala.collection.Seq<V>, scala.Option<S>, scala.Option<S>> updateFunc, scala.reflect.ClassTag<S> evidence$2) { throw new RuntimeException(); }
  /**
   * Return a new "state" DStream where the state for each key is updated by applying
   * the given function on the previous state of the key and the new values of each key.
   * Hash partitioning is used to generate the RDDs with <code>numPartitions</code> partitions.
   * @param updateFunc State update function. If <code>this</code> function returns None, then
   *                   corresponding state key-value pair will be eliminated.
   * @param numPartitions Number of partitions of each RDD in the new DStream.
   * @tparam S State type
   */
  public <S extends java.lang.Object> org.apache.spark.streaming.dstream.DStream<scala.Tuple2<K, S>> updateStateByKey (scala.Function2<scala.collection.Seq<V>, scala.Option<S>, scala.Option<S>> updateFunc, int numPartitions, scala.reflect.ClassTag<S> evidence$3) { throw new RuntimeException(); }
  /**
   * Return a new "state" DStream where the state for each key is updated by applying
   * the given function on the previous state of the key and the new values of the key.
   * org.apache.spark.Partitioner is used to control the partitioning of each RDD.
   * @param updateFunc State update function. If <code>this</code> function returns None, then
   *                   corresponding state key-value pair will be eliminated.
   * @param partitioner Partitioner for controlling the partitioning of each RDD in the new
   *                    DStream.
   * @tparam S State type
   */
  public <S extends java.lang.Object> org.apache.spark.streaming.dstream.DStream<scala.Tuple2<K, S>> updateStateByKey (scala.Function2<scala.collection.Seq<V>, scala.Option<S>, scala.Option<S>> updateFunc, org.apache.spark.Partitioner partitioner, scala.reflect.ClassTag<S> evidence$4) { throw new RuntimeException(); }
  /**
   * Return a new "state" DStream where the state for each key is updated by applying
   * the given function on the previous state of the key and the new values of each key.
   * org.apache.spark.Partitioner is used to control the partitioning of each RDD.
   * @param updateFunc State update function. Note, that this function may generate a different
   *                   tuple with a different key than the input key. Therefore keys may be removed
   *                   or added in this way. It is up to the developer to decide whether to
   *                   remember the partitioner despite the key being changed.
   * @param partitioner Partitioner for controlling the partitioning of each RDD in the new
   *                    DStream
   * @param rememberPartitioner Whether to remember the paritioner object in the generated RDDs.
   * @tparam S State type
   */
  public <S extends java.lang.Object> org.apache.spark.streaming.dstream.DStream<scala.Tuple2<K, S>> updateStateByKey (scala.Function1<scala.collection.Iterator<scala.Tuple3<K, scala.collection.Seq<V>, scala.Option<S>>>, scala.collection.Iterator<scala.Tuple2<K, S>>> updateFunc, org.apache.spark.Partitioner partitioner, boolean rememberPartitioner, scala.reflect.ClassTag<S> evidence$5) { throw new RuntimeException(); }
  /**
   * Return a new "state" DStream where the state for each key is updated by applying
   * the given function on the previous state of the key and the new values of the key.
   * org.apache.spark.Partitioner is used to control the partitioning of each RDD.
   * @param updateFunc State update function. If <code>this</code> function returns None, then
   *                   corresponding state key-value pair will be eliminated.
   * @param partitioner Partitioner for controlling the partitioning of each RDD in the new
   *                    DStream.
   * @param initialRDD initial state value of each key.
   * @tparam S State type
   */
  public <S extends java.lang.Object> org.apache.spark.streaming.dstream.DStream<scala.Tuple2<K, S>> updateStateByKey (scala.Function2<scala.collection.Seq<V>, scala.Option<S>, scala.Option<S>> updateFunc, org.apache.spark.Partitioner partitioner, org.apache.spark.rdd.RDD<scala.Tuple2<K, S>> initialRDD, scala.reflect.ClassTag<S> evidence$6) { throw new RuntimeException(); }
  /**
   * Return a new "state" DStream where the state for each key is updated by applying
   * the given function on the previous state of the key and the new values of each key.
   * org.apache.spark.Partitioner is used to control the partitioning of each RDD.
   * @param updateFunc State update function. Note, that this function may generate a different
   *                   tuple with a different key than the input key. Therefore keys may be removed
   *                   or added in this way. It is up to the developer to decide whether to
   *                   remember the  partitioner despite the key being changed.
   * @param partitioner Partitioner for controlling the partitioning of each RDD in the new
   *                    DStream
   * @param rememberPartitioner Whether to remember the paritioner object in the generated RDDs.
   * @param initialRDD initial state value of each key.
   * @tparam S State type
   */
  public <S extends java.lang.Object> org.apache.spark.streaming.dstream.DStream<scala.Tuple2<K, S>> updateStateByKey (scala.Function1<scala.collection.Iterator<scala.Tuple3<K, scala.collection.Seq<V>, scala.Option<S>>>, scala.collection.Iterator<scala.Tuple2<K, S>>> updateFunc, org.apache.spark.Partitioner partitioner, boolean rememberPartitioner, org.apache.spark.rdd.RDD<scala.Tuple2<K, S>> initialRDD, scala.reflect.ClassTag<S> evidence$7) { throw new RuntimeException(); }
  /**
   * Return a new DStream by applying a map function to the value of each key-value pairs in
   * 'this' DStream without changing the key.
   */
  public <U extends java.lang.Object> org.apache.spark.streaming.dstream.DStream<scala.Tuple2<K, U>> mapValues (scala.Function1<V, U> mapValuesFunc, scala.reflect.ClassTag<U> evidence$8) { throw new RuntimeException(); }
  /**
   * Return a new DStream by applying a flatmap function to the value of each key-value pairs in
   * 'this' DStream without changing the key.
   */
  public <U extends java.lang.Object> org.apache.spark.streaming.dstream.DStream<scala.Tuple2<K, U>> flatMapValues (scala.Function1<V, scala.collection.TraversableOnce<U>> flatMapValuesFunc, scala.reflect.ClassTag<U> evidence$9) { throw new RuntimeException(); }
  /**
   * Return a new DStream by applying 'cogroup' between RDDs of <code>this</code> DStream and <code>other</code> DStream.
   * Hash partitioning is used to generate the RDDs with Spark's default number
   * of partitions.
   */
  public <W extends java.lang.Object> org.apache.spark.streaming.dstream.DStream<scala.Tuple2<K, scala.Tuple2<scala.collection.Iterable<V>, scala.collection.Iterable<W>>>> cogroup (org.apache.spark.streaming.dstream.DStream<scala.Tuple2<K, W>> other, scala.reflect.ClassTag<W> evidence$10) { throw new RuntimeException(); }
  /**
   * Return a new DStream by applying 'cogroup' between RDDs of <code>this</code> DStream and <code>other</code> DStream.
   * Hash partitioning is used to generate the RDDs with <code>numPartitions</code> partitions.
   */
  public <W extends java.lang.Object> org.apache.spark.streaming.dstream.DStream<scala.Tuple2<K, scala.Tuple2<scala.collection.Iterable<V>, scala.collection.Iterable<W>>>> cogroup (org.apache.spark.streaming.dstream.DStream<scala.Tuple2<K, W>> other, int numPartitions, scala.reflect.ClassTag<W> evidence$11) { throw new RuntimeException(); }
  /**
   * Return a new DStream by applying 'cogroup' between RDDs of <code>this</code> DStream and <code>other</code> DStream.
   * The supplied org.apache.spark.Partitioner is used to partition the generated RDDs.
   */
  public <W extends java.lang.Object> org.apache.spark.streaming.dstream.DStream<scala.Tuple2<K, scala.Tuple2<scala.collection.Iterable<V>, scala.collection.Iterable<W>>>> cogroup (org.apache.spark.streaming.dstream.DStream<scala.Tuple2<K, W>> other, org.apache.spark.Partitioner partitioner, scala.reflect.ClassTag<W> evidence$12) { throw new RuntimeException(); }
  /**
   * Return a new DStream by applying 'join' between RDDs of <code>this</code> DStream and <code>other</code> DStream.
   * Hash partitioning is used to generate the RDDs with Spark's default number of partitions.
   */
  public <W extends java.lang.Object> org.apache.spark.streaming.dstream.DStream<scala.Tuple2<K, scala.Tuple2<V, W>>> join (org.apache.spark.streaming.dstream.DStream<scala.Tuple2<K, W>> other, scala.reflect.ClassTag<W> evidence$13) { throw new RuntimeException(); }
  /**
   * Return a new DStream by applying 'join' between RDDs of <code>this</code> DStream and <code>other</code> DStream.
   * Hash partitioning is used to generate the RDDs with <code>numPartitions</code> partitions.
   */
  public <W extends java.lang.Object> org.apache.spark.streaming.dstream.DStream<scala.Tuple2<K, scala.Tuple2<V, W>>> join (org.apache.spark.streaming.dstream.DStream<scala.Tuple2<K, W>> other, int numPartitions, scala.reflect.ClassTag<W> evidence$14) { throw new RuntimeException(); }
  /**
   * Return a new DStream by applying 'join' between RDDs of <code>this</code> DStream and <code>other</code> DStream.
   * The supplied org.apache.spark.Partitioner is used to control the partitioning of each RDD.
   */
  public <W extends java.lang.Object> org.apache.spark.streaming.dstream.DStream<scala.Tuple2<K, scala.Tuple2<V, W>>> join (org.apache.spark.streaming.dstream.DStream<scala.Tuple2<K, W>> other, org.apache.spark.Partitioner partitioner, scala.reflect.ClassTag<W> evidence$15) { throw new RuntimeException(); }
  /**
   * Return a new DStream by applying 'left outer join' between RDDs of <code>this</code> DStream and
   * <code>other</code> DStream. Hash partitioning is used to generate the RDDs with Spark's default
   * number of partitions.
   */
  public <W extends java.lang.Object> org.apache.spark.streaming.dstream.DStream<scala.Tuple2<K, scala.Tuple2<V, scala.Option<W>>>> leftOuterJoin (org.apache.spark.streaming.dstream.DStream<scala.Tuple2<K, W>> other, scala.reflect.ClassTag<W> evidence$16) { throw new RuntimeException(); }
  /**
   * Return a new DStream by applying 'left outer join' between RDDs of <code>this</code> DStream and
   * <code>other</code> DStream. Hash partitioning is used to generate the RDDs with <code>numPartitions</code>
   * partitions.
   */
  public <W extends java.lang.Object> org.apache.spark.streaming.dstream.DStream<scala.Tuple2<K, scala.Tuple2<V, scala.Option<W>>>> leftOuterJoin (org.apache.spark.streaming.dstream.DStream<scala.Tuple2<K, W>> other, int numPartitions, scala.reflect.ClassTag<W> evidence$17) { throw new RuntimeException(); }
  /**
   * Return a new DStream by applying 'left outer join' between RDDs of <code>this</code> DStream and
   * <code>other</code> DStream. The supplied org.apache.spark.Partitioner is used to control
   * the partitioning of each RDD.
   */
  public <W extends java.lang.Object> org.apache.spark.streaming.dstream.DStream<scala.Tuple2<K, scala.Tuple2<V, scala.Option<W>>>> leftOuterJoin (org.apache.spark.streaming.dstream.DStream<scala.Tuple2<K, W>> other, org.apache.spark.Partitioner partitioner, scala.reflect.ClassTag<W> evidence$18) { throw new RuntimeException(); }
  /**
   * Return a new DStream by applying 'right outer join' between RDDs of <code>this</code> DStream and
   * <code>other</code> DStream. Hash partitioning is used to generate the RDDs with Spark's default
   * number of partitions.
   */
  public <W extends java.lang.Object> org.apache.spark.streaming.dstream.DStream<scala.Tuple2<K, scala.Tuple2<scala.Option<V>, W>>> rightOuterJoin (org.apache.spark.streaming.dstream.DStream<scala.Tuple2<K, W>> other, scala.reflect.ClassTag<W> evidence$19) { throw new RuntimeException(); }
  /**
   * Return a new DStream by applying 'right outer join' between RDDs of <code>this</code> DStream and
   * <code>other</code> DStream. Hash partitioning is used to generate the RDDs with <code>numPartitions</code>
   * partitions.
   */
  public <W extends java.lang.Object> org.apache.spark.streaming.dstream.DStream<scala.Tuple2<K, scala.Tuple2<scala.Option<V>, W>>> rightOuterJoin (org.apache.spark.streaming.dstream.DStream<scala.Tuple2<K, W>> other, int numPartitions, scala.reflect.ClassTag<W> evidence$20) { throw new RuntimeException(); }
  /**
   * Return a new DStream by applying 'right outer join' between RDDs of <code>this</code> DStream and
   * <code>other</code> DStream. The supplied org.apache.spark.Partitioner is used to control
   * the partitioning of each RDD.
   */
  public <W extends java.lang.Object> org.apache.spark.streaming.dstream.DStream<scala.Tuple2<K, scala.Tuple2<scala.Option<V>, W>>> rightOuterJoin (org.apache.spark.streaming.dstream.DStream<scala.Tuple2<K, W>> other, org.apache.spark.Partitioner partitioner, scala.reflect.ClassTag<W> evidence$21) { throw new RuntimeException(); }
  /**
   * Return a new DStream by applying 'full outer join' between RDDs of <code>this</code> DStream and
   * <code>other</code> DStream. Hash partitioning is used to generate the RDDs with Spark's default
   * number of partitions.
   */
  public <W extends java.lang.Object> org.apache.spark.streaming.dstream.DStream<scala.Tuple2<K, scala.Tuple2<scala.Option<V>, scala.Option<W>>>> fullOuterJoin (org.apache.spark.streaming.dstream.DStream<scala.Tuple2<K, W>> other, scala.reflect.ClassTag<W> evidence$22) { throw new RuntimeException(); }
  /**
   * Return a new DStream by applying 'full outer join' between RDDs of <code>this</code> DStream and
   * <code>other</code> DStream. Hash partitioning is used to generate the RDDs with <code>numPartitions</code>
   * partitions.
   */
  public <W extends java.lang.Object> org.apache.spark.streaming.dstream.DStream<scala.Tuple2<K, scala.Tuple2<scala.Option<V>, scala.Option<W>>>> fullOuterJoin (org.apache.spark.streaming.dstream.DStream<scala.Tuple2<K, W>> other, int numPartitions, scala.reflect.ClassTag<W> evidence$23) { throw new RuntimeException(); }
  /**
   * Return a new DStream by applying 'full outer join' between RDDs of <code>this</code> DStream and
   * <code>other</code> DStream. The supplied org.apache.spark.Partitioner is used to control
   * the partitioning of each RDD.
   */
  public <W extends java.lang.Object> org.apache.spark.streaming.dstream.DStream<scala.Tuple2<K, scala.Tuple2<scala.Option<V>, scala.Option<W>>>> fullOuterJoin (org.apache.spark.streaming.dstream.DStream<scala.Tuple2<K, W>> other, org.apache.spark.Partitioner partitioner, scala.reflect.ClassTag<W> evidence$24) { throw new RuntimeException(); }
  /**
   * Save each RDD in <code>this</code> DStream as a Hadoop file. The file name at each batch interval
   * is generated based on <code>prefix</code> and <code>suffix</code>: "prefix-TIME_IN_MS.suffix"
   */
  public <F extends org.apache.hadoop.mapred.OutputFormat<K, V>> void saveAsHadoopFiles (java.lang.String prefix, java.lang.String suffix, scala.reflect.ClassTag<F> fm) { throw new RuntimeException(); }
  /**
   * Save each RDD in <code>this</code> DStream as a Hadoop file. The file name at each batch interval
   * is generated based on <code>prefix</code> and <code>suffix</code>: "prefix-TIME_IN_MS.suffix"
   */
  public  void saveAsHadoopFiles (java.lang.String prefix, java.lang.String suffix, java.lang.Class<?> keyClass, java.lang.Class<?> valueClass, java.lang.Class<? extends org.apache.hadoop.mapred.OutputFormat<?, ?>> outputFormatClass, org.apache.hadoop.mapred.JobConf conf) { throw new RuntimeException(); }
  /**
   * Save each RDD in <code>this</code> DStream as a Hadoop file. The file name at each batch interval is
   * generated based on <code>prefix</code> and <code>suffix</code>: "prefix-TIME_IN_MS.suffix".
   */
  public <F extends org.apache.hadoop.mapreduce.OutputFormat<K, V>> void saveAsNewAPIHadoopFiles (java.lang.String prefix, java.lang.String suffix, scala.reflect.ClassTag<F> fm) { throw new RuntimeException(); }
  /**
   * Save each RDD in <code>this</code> DStream as a Hadoop file. The file name at each batch interval is
   * generated based on <code>prefix</code> and <code>suffix</code>: "prefix-TIME_IN_MS.suffix".
   */
  public  void saveAsNewAPIHadoopFiles (java.lang.String prefix, java.lang.String suffix, java.lang.Class<?> keyClass, java.lang.Class<?> valueClass, java.lang.Class<? extends org.apache.hadoop.mapreduce.OutputFormat<?, ?>> outputFormatClass, org.apache.hadoop.conf.Configuration conf) { throw new RuntimeException(); }
  private  java.lang.Class<?> keyClass () { throw new RuntimeException(); }
  private  java.lang.Class<?> valueClass () { throw new RuntimeException(); }
}
