package org.apache.spark.streaming;
/**
 * Main entry point for Spark Streaming functionality. It provides methods used to create
 * {@link org.apache.spark.streaming.dstream.DStream}s from various input sources. It can be either
 * created by providing a Spark master URL and an appName, or from a org.apache.spark.SparkConf
 * configuration (see core Spark documentation), or from an existing org.apache.spark.SparkContext.
 * The associated SparkContext can be accessed using <code>context.sparkContext</code>. After
 * creating and transforming DStreams, the streaming computation can be started and stopped
 * using <code>context.start()</code> and <code>context.stop()</code>, respectively.
 * <code>context.awaitTermination()</code> allows the current thread to wait for the termination
 * of the context by <code>stop()</code> or by an exception.
 */
public  class StreamingContext implements org.apache.spark.Logging {
  // no position
  /** Enumeration to identify current state of the StreamingContext */
  public  class StreamingContextState$ extends scala.Enumeration {
    public   StreamingContextState$ () { throw new RuntimeException(); }
    public  scala.Enumeration.Value Initialized () { throw new RuntimeException(); }
    public  scala.Enumeration.Value Started () { throw new RuntimeException(); }
    public  scala.Enumeration.Value Stopped () { throw new RuntimeException(); }
  }
  static public  int DEFAULT_CLEANER_TTL () { throw new RuntimeException(); }
  static public <K extends java.lang.Object, V extends java.lang.Object> org.apache.spark.streaming.dstream.PairDStreamFunctions<K, V> toPairDStreamFunctions (org.apache.spark.streaming.dstream.DStream<scala.Tuple2<K, V>> stream, scala.reflect.ClassTag<K> kt, scala.reflect.ClassTag<V> vt, scala.math.Ordering<K> ord) { throw new RuntimeException(); }
  /**
   * Either recreate a StreamingContext from checkpoint data or create a new StreamingContext.
   * If checkpoint data exists in the provided <code>checkpointPath</code>, then StreamingContext will be
   * recreated from the checkpoint data. If the data does not exist, then the StreamingContext
   * will be created by called the provided <code>creatingFunc</code>.
   * <p>
   * @param checkpointPath Checkpoint directory used in an earlier StreamingContext program
   * @param creatingFunc   Function to create a new StreamingContext
   * @param hadoopConf     Optional Hadoop configuration if necessary for reading from the
   *                       file system
   * @param createOnError  Optional, whether to create a new StreamingContext if there is an
   *                       error in reading checkpoint data. By default, an exception will be
   *                       thrown on error.
   */
  static public  org.apache.spark.streaming.StreamingContext getOrCreate (java.lang.String checkpointPath, scala.Function0<org.apache.spark.streaming.StreamingContext> creatingFunc, org.apache.hadoop.conf.Configuration hadoopConf, boolean createOnError) { throw new RuntimeException(); }
  /**
   * Find the JAR from which a given class was loaded, to make it easy for users to pass
   * their JARs to StreamingContext.
   */
  static public  scala.Option<java.lang.String> jarOfClass (java.lang.Class<?> cls) { throw new RuntimeException(); }
  static public  org.apache.spark.SparkContext createNewSparkContext (org.apache.spark.SparkConf conf) { throw new RuntimeException(); }
  static public  org.apache.spark.SparkContext createNewSparkContext (java.lang.String master, java.lang.String appName, java.lang.String sparkHome, scala.collection.Seq<java.lang.String> jars, scala.collection.Map<java.lang.String, java.lang.String> environment) { throw new RuntimeException(); }
  static public <T extends java.lang.Object> java.lang.String rddToFileName (java.lang.String prefix, java.lang.String suffix, org.apache.spark.streaming.Time time) { throw new RuntimeException(); }
  public   StreamingContext (org.apache.spark.SparkContext sc_, org.apache.spark.streaming.Checkpoint cp_, org.apache.spark.streaming.Duration batchDur_) { throw new RuntimeException(); }
  /**
   * Create a StreamingContext using an existing SparkContext.
   * @param sparkContext existing SparkContext
   * @param batchDuration the time interval at which streaming data will be divided into batches
   */
  public   StreamingContext (org.apache.spark.SparkContext sparkContext, org.apache.spark.streaming.Duration batchDuration) { throw new RuntimeException(); }
  /**
   * Create a StreamingContext by providing the configuration necessary for a new SparkContext.
   * @param conf a org.apache.spark.SparkConf object specifying Spark parameters
   * @param batchDuration the time interval at which streaming data will be divided into batches
   */
  public   StreamingContext (org.apache.spark.SparkConf conf, org.apache.spark.streaming.Duration batchDuration) { throw new RuntimeException(); }
  /**
   * Create a StreamingContext by providing the details necessary for creating a new SparkContext.
   * @param master cluster URL to connect to (e.g. mesos://host:port, spark://host:port, local[4]).
   * @param appName a name for your job, to display on the cluster web UI
   * @param batchDuration the time interval at which streaming data will be divided into batches
   */
  public   StreamingContext (java.lang.String master, java.lang.String appName, org.apache.spark.streaming.Duration batchDuration, java.lang.String sparkHome, scala.collection.Seq<java.lang.String> jars, scala.collection.Map<java.lang.String, java.lang.String> environment) { throw new RuntimeException(); }
  /**
   * Recreate a StreamingContext from a checkpoint file.
   * @param path Path to the directory that was specified as the checkpoint directory
   * @param hadoopConf Optional, configuration object if necessary for reading from
   *                   HDFS compatible filesystems
   */
  public   StreamingContext (java.lang.String path, org.apache.hadoop.conf.Configuration hadoopConf) { throw new RuntimeException(); }
  /**
   * Recreate a StreamingContext from a checkpoint file.
   * @param path Path to the directory that was specified as the checkpoint directory
   */
  public   StreamingContext (java.lang.String path) { throw new RuntimeException(); }
  public  boolean isCheckpointPresent () { throw new RuntimeException(); }
  public  org.apache.spark.SparkContext sc () { throw new RuntimeException(); }
  public  org.apache.spark.SparkConf conf () { throw new RuntimeException(); }
  public  org.apache.spark.SparkEnv env () { throw new RuntimeException(); }
  public  org.apache.spark.streaming.DStreamGraph graph () { throw new RuntimeException(); }
  private  java.util.concurrent.atomic.AtomicInteger nextReceiverInputStreamId () { throw new RuntimeException(); }
  public  java.lang.String checkpointDir () { throw new RuntimeException(); }
  public  org.apache.spark.streaming.Duration checkpointDuration () { throw new RuntimeException(); }
  public  org.apache.spark.streaming.scheduler.JobScheduler scheduler () { throw new RuntimeException(); }
  public  org.apache.spark.streaming.ContextWaiter waiter () { throw new RuntimeException(); }
  public  org.apache.spark.streaming.ui.StreamingJobProgressListener progressListener () { throw new RuntimeException(); }
  public  scala.Option<org.apache.spark.streaming.ui.StreamingTab> uiTab () { throw new RuntimeException(); }
  /** Register streaming source to metrics system */
  private  org.apache.spark.streaming.StreamingSource streamingSource () { throw new RuntimeException(); }
  /**
   * Accessor for nested Scala object
   */
  public  org.apache.spark.streaming.StreamingContext.StreamingContextState$ StreamingContextState () { throw new RuntimeException(); }
  public  scala.Enumeration.Value state () { throw new RuntimeException(); }
  /**
   * Return the associated Spark context
   */
  public  org.apache.spark.SparkContext sparkContext () { throw new RuntimeException(); }
  /**
   * Set each DStreams in this context to remember RDDs it generated in the last given duration.
   * DStreams remember RDDs only for a limited duration of time and releases them for garbage
   * collection. This method allows the developer to specify how long to remember the RDDs (
   * if the developer wishes to query old data outside the DStream computation).
   * @param duration Minimum duration that each DStream should remember its RDDs
   */
  public  void remember (org.apache.spark.streaming.Duration duration) { throw new RuntimeException(); }
  /**
   * Set the context to periodically checkpoint the DStream operations for driver
   * fault-tolerance.
   * @param directory HDFS-compatible directory where the checkpoint data will be reliably stored.
   *                  Note that this must be a fault-tolerant file system like HDFS for
   */
  public  void checkpoint (java.lang.String directory) { throw new RuntimeException(); }
  public  org.apache.spark.streaming.Checkpoint initialCheckpoint () { throw new RuntimeException(); }
  public  int getNewReceiverStreamId () { throw new RuntimeException(); }
  /**
   * Create an input stream with any arbitrary user implemented receiver.
   * Find more details at: http://spark.apache.org/docs/latest/streaming-custom-receivers.html
   * @param receiver Custom implementation of Receiver
   */
  public <T extends java.lang.Object> org.apache.spark.streaming.dstream.ReceiverInputDStream<T> networkStream (org.apache.spark.streaming.receiver.Receiver<T> receiver, scala.reflect.ClassTag<T> evidence$1) { throw new RuntimeException(); }
  /**
   * Create an input stream with any arbitrary user implemented receiver.
   * Find more details at: http://spark.apache.org/docs/latest/streaming-custom-receivers.html
   * @param receiver Custom implementation of Receiver
   */
  public <T extends java.lang.Object> org.apache.spark.streaming.dstream.ReceiverInputDStream<T> receiverStream (org.apache.spark.streaming.receiver.Receiver<T> receiver, scala.reflect.ClassTag<T> evidence$2) { throw new RuntimeException(); }
  /**
   * Create an input stream with any arbitrary user implemented actor receiver.
   * Find more details at: http://spark.apache.org/docs/latest/streaming-custom-receivers.html
   * @param props Props object defining creation of the actor
   * @param name Name of the actor
   * @param storageLevel RDD storage level (default: StorageLevel.MEMORY_AND_DISK_SER_2)
   * <p>
   * @note An important point to note:
   *       Since Actor may exist outside the spark framework, It is thus user's responsibility
   *       to ensure the type safety, i.e parametrized type of data received and actorStream
   *       should be same.
   */
  public <T extends java.lang.Object> org.apache.spark.streaming.dstream.ReceiverInputDStream<T> actorStream (akka.actor.Props props, java.lang.String name, org.apache.spark.storage.StorageLevel storageLevel, akka.actor.SupervisorStrategy supervisorStrategy, scala.reflect.ClassTag<T> evidence$3) { throw new RuntimeException(); }
  /**
   * Create a input stream from TCP source hostname:port. Data is received using
   * a TCP socket and the receive bytes is interpreted as UTF8 encoded <code>\n</code> delimited
   * lines.
   * @param hostname      Hostname to connect to for receiving data
   * @param port          Port to connect to for receiving data
   * @param storageLevel  Storage level to use for storing the received objects
   *                      (default: StorageLevel.MEMORY_AND_DISK_SER_2)
   */
  public  org.apache.spark.streaming.dstream.ReceiverInputDStream<java.lang.String> socketTextStream (java.lang.String hostname, int port, org.apache.spark.storage.StorageLevel storageLevel) { throw new RuntimeException(); }
  /**
   * Create a input stream from TCP source hostname:port. Data is received using
   * a TCP socket and the receive bytes it interepreted as object using the given
   * converter.
   * @param hostname      Hostname to connect to for receiving data
   * @param port          Port to connect to for receiving data
   * @param converter     Function to convert the byte stream to objects
   * @param storageLevel  Storage level to use for storing the received objects
   * @tparam T            Type of the objects received (after converting bytes to objects)
   */
  public <T extends java.lang.Object> org.apache.spark.streaming.dstream.ReceiverInputDStream<T> socketStream (java.lang.String hostname, int port, scala.Function1<java.io.InputStream, scala.collection.Iterator<T>> converter, org.apache.spark.storage.StorageLevel storageLevel, scala.reflect.ClassTag<T> evidence$4) { throw new RuntimeException(); }
  /**
   * Create a input stream from network source hostname:port, where data is received
   * as serialized blocks (serialized using the Spark's serializer) that can be directly
   * pushed into the block manager without deserializing them. This is the most efficient
   * way to receive data.
   * @param hostname      Hostname to connect to for receiving data
   * @param port          Port to connect to for receiving data
   * @param storageLevel  Storage level to use for storing the received objects
   *                      (default: StorageLevel.MEMORY_AND_DISK_SER_2)
   * @tparam T            Type of the objects in the received blocks
   */
  public <T extends java.lang.Object> org.apache.spark.streaming.dstream.ReceiverInputDStream<T> rawSocketStream (java.lang.String hostname, int port, org.apache.spark.storage.StorageLevel storageLevel, scala.reflect.ClassTag<T> evidence$5) { throw new RuntimeException(); }
  /**
   * Create a input stream that monitors a Hadoop-compatible filesystem
   * for new files and reads them using the given key-value types and input format.
   * Files must be written to the monitored directory by "moving" them from another
   * location within the same file system. File names starting with . are ignored.
   * @param directory HDFS directory to monitor for new file
   * @tparam K Key type for reading HDFS file
   * @tparam V Value type for reading HDFS file
   * @tparam F Input format for reading HDFS file
   */
  public <K extends java.lang.Object, V extends java.lang.Object, F extends org.apache.hadoop.mapreduce.InputFormat<K, V>> org.apache.spark.streaming.dstream.InputDStream<scala.Tuple2<K, V>> fileStream (java.lang.String directory, scala.reflect.ClassTag<K> evidence$6, scala.reflect.ClassTag<V> evidence$7, scala.reflect.ClassTag<F> evidence$8) { throw new RuntimeException(); }
  /**
   * Create a input stream that monitors a Hadoop-compatible filesystem
   * for new files and reads them using the given key-value types and input format.
   * Files must be written to the monitored directory by "moving" them from another
   * location within the same file system.
   * @param directory HDFS directory to monitor for new file
   * @param filter Function to filter paths to process
   * @param newFilesOnly Should process only new files and ignore existing files in the directory
   * @tparam K Key type for reading HDFS file
   * @tparam V Value type for reading HDFS file
   * @tparam F Input format for reading HDFS file
   */
  public <K extends java.lang.Object, V extends java.lang.Object, F extends org.apache.hadoop.mapreduce.InputFormat<K, V>> org.apache.spark.streaming.dstream.InputDStream<scala.Tuple2<K, V>> fileStream (java.lang.String directory, scala.Function1<org.apache.hadoop.fs.Path, java.lang.Object> filter, boolean newFilesOnly, scala.reflect.ClassTag<K> evidence$9, scala.reflect.ClassTag<V> evidence$10, scala.reflect.ClassTag<F> evidence$11) { throw new RuntimeException(); }
  /**
   * Create a input stream that monitors a Hadoop-compatible filesystem
   * for new files and reads them as text files (using key as LongWritable, value
   * as Text and input format as TextInputFormat). Files must be written to the
   * monitored directory by "moving" them from another location within the same
   * file system. File names starting with . are ignored.
   * @param directory HDFS directory to monitor for new file
   */
  public  org.apache.spark.streaming.dstream.DStream<java.lang.String> textFileStream (java.lang.String directory) { throw new RuntimeException(); }
  /**
   * Create an input stream from a queue of RDDs. In each batch,
   * it will process either one or all of the RDDs returned by the queue.
   * @param queue      Queue of RDDs
   * @param oneAtATime Whether only one RDD should be consumed from the queue in every interval
   * @tparam T         Type of objects in the RDD
   */
  public <T extends java.lang.Object> org.apache.spark.streaming.dstream.InputDStream<T> queueStream (scala.collection.mutable.Queue<org.apache.spark.rdd.RDD<T>> queue, boolean oneAtATime, scala.reflect.ClassTag<T> evidence$12) { throw new RuntimeException(); }
  /**
   * Create an input stream from a queue of RDDs. In each batch,
   * it will process either one or all of the RDDs returned by the queue.
   * @param queue      Queue of RDDs
   * @param oneAtATime Whether only one RDD should be consumed from the queue in every interval
   * @param defaultRDD Default RDD is returned by the DStream when the queue is empty.
   *                   Set as null if no RDD should be returned when empty
   * @tparam T         Type of objects in the RDD
   */
  public <T extends java.lang.Object> org.apache.spark.streaming.dstream.InputDStream<T> queueStream (scala.collection.mutable.Queue<org.apache.spark.rdd.RDD<T>> queue, boolean oneAtATime, org.apache.spark.rdd.RDD<T> defaultRDD, scala.reflect.ClassTag<T> evidence$13) { throw new RuntimeException(); }
  /**
   * Create a unified DStream from multiple DStreams of the same type and same slide duration.
   */
  public <T extends java.lang.Object> org.apache.spark.streaming.dstream.DStream<T> union (scala.collection.Seq<org.apache.spark.streaming.dstream.DStream<T>> streams, scala.reflect.ClassTag<T> evidence$14) { throw new RuntimeException(); }
  /**
   * Create a new DStream in which each RDD is generated by applying a function on RDDs of
   * the DStreams.
   */
  public <T extends java.lang.Object> org.apache.spark.streaming.dstream.DStream<T> transform (scala.collection.Seq<org.apache.spark.streaming.dstream.DStream<?>> dstreams, scala.Function2<scala.collection.Seq<org.apache.spark.rdd.RDD<?>>, org.apache.spark.streaming.Time, org.apache.spark.rdd.RDD<T>> transformFunc, scala.reflect.ClassTag<T> evidence$15) { throw new RuntimeException(); }
  /** Add a {@link org.apache.spark.streaming.scheduler.StreamingListener} object for
   * receiving system events related to streaming.
   */
  public  void addStreamingListener (org.apache.spark.streaming.scheduler.StreamingListener streamingListener) { throw new RuntimeException(); }
  private  void validate () { throw new RuntimeException(); }
  /**
   * Start the execution of the streams.
   * <p>
   * @throws SparkException if the context has already been started or stopped.
   */
  public  void start () { throw new RuntimeException(); }
  /**
   * Wait for the execution to stop. Any exceptions that occurs during the execution
   * will be thrown in this thread.
   */
  public  void awaitTermination () { throw new RuntimeException(); }
  /**
   * Wait for the execution to stop. Any exceptions that occurs during the execution
   * will be thrown in this thread.
   * @param timeout time to wait in milliseconds
   */
  public  void awaitTermination (long timeout) { throw new RuntimeException(); }
  /**
   * Stop the execution of the streams immediately (does not wait for all received data
   * to be processed).
   * <p>
   * @param stopSparkContext if true, stops the associated SparkContext. The underlying SparkContext
   *                         will be stopped regardless of whether this StreamingContext has been
   *                         started.
   */
  public  void stop (boolean stopSparkContext) { throw new RuntimeException(); }
  /**
   * Stop the execution of the streams, with option of ensuring all received data
   * has been processed.
   * <p>
   * @param stopSparkContext if true, stops the associated SparkContext. The underlying SparkContext
   *                         will be stopped regardless of whether this StreamingContext has been
   *                         started.
   * @param stopGracefully if true, stops gracefully by waiting for the processing of all
   *                       received data to be completed
   */
  public  void stop (boolean stopSparkContext, boolean stopGracefully) { throw new RuntimeException(); }
}
