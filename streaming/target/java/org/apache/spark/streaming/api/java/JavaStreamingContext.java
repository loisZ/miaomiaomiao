package org.apache.spark.streaming.api.java;
/**
 * A Java-friendly version of {@link org.apache.spark.streaming.StreamingContext} which is the main
 * entry point for Spark Streaming functionality. It provides methods to create
 * {@link org.apache.spark.streaming.api.java.JavaDStream} and
 * {@link org.apache.spark.streaming.api.java.JavaPairDStream.} from input sources. The internal
 * org.apache.spark.api.java.JavaSparkContext (see core Spark documentation) can be accessed
 * using <code>context.sparkContext</code>. After creating and transforming DStreams, the streaming
 * computation can be started and stopped using <code>context.start()</code> and <code>context.stop()</code>,
 * respectively. <code>context.awaitTermination()</code> allows the current thread to wait for the
 * termination of a context by <code>stop()</code> or by an exception.
 */
public  class JavaStreamingContext implements java.io.Closeable {
  /**
   * Either recreate a StreamingContext from checkpoint data or create a new StreamingContext.
   * If checkpoint data exists in the provided <code>checkpointPath</code>, then StreamingContext will be
   * recreated from the checkpoint data. If the data does not exist, then the provided factory
   * will be used to create a JavaStreamingContext.
   * <p>
   * @param checkpointPath Checkpoint directory used in an earlier JavaStreamingContext program
   * @param factory        JavaStreamingContextFactory object to create a new JavaStreamingContext
   */
  static public  org.apache.spark.streaming.api.java.JavaStreamingContext getOrCreate (java.lang.String checkpointPath, org.apache.spark.streaming.api.java.JavaStreamingContextFactory factory) { throw new RuntimeException(); }
  /**
   * Either recreate a StreamingContext from checkpoint data or create a new StreamingContext.
   * If checkpoint data exists in the provided <code>checkpointPath</code>, then StreamingContext will be
   * recreated from the checkpoint data. If the data does not exist, then the provided factory
   * will be used to create a JavaStreamingContext.
   * <p>
   * @param checkpointPath Checkpoint directory used in an earlier StreamingContext program
   * @param factory        JavaStreamingContextFactory object to create a new JavaStreamingContext
   * @param hadoopConf     Hadoop configuration if necessary for reading from any HDFS compatible
   *                       file system
   */
  static public  org.apache.spark.streaming.api.java.JavaStreamingContext getOrCreate (java.lang.String checkpointPath, org.apache.hadoop.conf.Configuration hadoopConf, org.apache.spark.streaming.api.java.JavaStreamingContextFactory factory) { throw new RuntimeException(); }
  /**
   * Either recreate a StreamingContext from checkpoint data or create a new StreamingContext.
   * If checkpoint data exists in the provided <code>checkpointPath</code>, then StreamingContext will be
   * recreated from the checkpoint data. If the data does not exist, then the provided factory
   * will be used to create a JavaStreamingContext.
   * <p>
   * @param checkpointPath Checkpoint directory used in an earlier StreamingContext program
   * @param factory        JavaStreamingContextFactory object to create a new JavaStreamingContext
   * @param hadoopConf     Hadoop configuration if necessary for reading from any HDFS compatible
   *                       file system
   * @param createOnError  Whether to create a new JavaStreamingContext if there is an
   *                       error in reading checkpoint data.
   */
  static public  org.apache.spark.streaming.api.java.JavaStreamingContext getOrCreate (java.lang.String checkpointPath, org.apache.hadoop.conf.Configuration hadoopConf, org.apache.spark.streaming.api.java.JavaStreamingContextFactory factory, boolean createOnError) { throw new RuntimeException(); }
  /**
   * Find the JAR from which a given class was loaded, to make it easy for users to pass
   * their JARs to StreamingContext.
   */
  static public  java.lang.String[] jarOfClass (java.lang.Class<?> cls) { throw new RuntimeException(); }
  public  org.apache.spark.streaming.StreamingContext ssc () { throw new RuntimeException(); }
  // not preceding
  public   JavaStreamingContext (org.apache.spark.streaming.StreamingContext ssc) { throw new RuntimeException(); }
  /**
   * Create a StreamingContext.
   * @param master Name of the Spark Master
   * @param appName Name to be used when registering with the scheduler
   * @param batchDuration The time interval at which streaming data will be divided into batches
   */
  public   JavaStreamingContext (java.lang.String master, java.lang.String appName, org.apache.spark.streaming.Duration batchDuration) { throw new RuntimeException(); }
  /**
   * Create a StreamingContext.
   * @param master Name of the Spark Master
   * @param appName Name to be used when registering with the scheduler
   * @param batchDuration The time interval at which streaming data will be divided into batches
   * @param sparkHome The SPARK_HOME directory on the slave nodes
   * @param jarFile JAR file containing job code, to ship to cluster. This can be a path on the
   *                local file system or an HDFS, HTTP, HTTPS, or FTP URL.
   */
  public   JavaStreamingContext (java.lang.String master, java.lang.String appName, org.apache.spark.streaming.Duration batchDuration, java.lang.String sparkHome, java.lang.String jarFile) { throw new RuntimeException(); }
  /**
   * Create a StreamingContext.
   * @param master Name of the Spark Master
   * @param appName Name to be used when registering with the scheduler
   * @param batchDuration The time interval at which streaming data will be divided into batches
   * @param sparkHome The SPARK_HOME directory on the slave nodes
   * @param jars Collection of JARs to send to the cluster. These can be paths on the local file
   *             system or HDFS, HTTP, HTTPS, or FTP URLs.
   */
  public   JavaStreamingContext (java.lang.String master, java.lang.String appName, org.apache.spark.streaming.Duration batchDuration, java.lang.String sparkHome, java.lang.String[] jars) { throw new RuntimeException(); }
  /**
   * Create a StreamingContext.
   * @param master Name of the Spark Master
   * @param appName Name to be used when registering with the scheduler
   * @param batchDuration The time interval at which streaming data will be divided into batches
   * @param sparkHome The SPARK_HOME directory on the slave nodes
   * @param jars Collection of JARs to send to the cluster. These can be paths on the local file
   *             system or HDFS, HTTP, HTTPS, or FTP URLs.
   * @param environment Environment variables to set on worker nodes
   */
  public   JavaStreamingContext (java.lang.String master, java.lang.String appName, org.apache.spark.streaming.Duration batchDuration, java.lang.String sparkHome, java.lang.String[] jars, java.util.Map<java.lang.String, java.lang.String> environment) { throw new RuntimeException(); }
  /**
   * Create a JavaStreamingContext using an existing JavaSparkContext.
   * @param sparkContext The underlying JavaSparkContext to use
   * @param batchDuration The time interval at which streaming data will be divided into batches
   */
  public   JavaStreamingContext (org.apache.spark.api.java.JavaSparkContext sparkContext, org.apache.spark.streaming.Duration batchDuration) { throw new RuntimeException(); }
  /**
   * Create a JavaStreamingContext using a SparkConf configuration.
   * @param conf A Spark application configuration
   * @param batchDuration The time interval at which streaming data will be divided into batches
   */
  public   JavaStreamingContext (org.apache.spark.SparkConf conf, org.apache.spark.streaming.Duration batchDuration) { throw new RuntimeException(); }
  /**
   * Recreate a JavaStreamingContext from a checkpoint file.
   * @param path Path to the directory that was specified as the checkpoint directory
   */
  public   JavaStreamingContext (java.lang.String path) { throw new RuntimeException(); }
  /**
   * Re-creates a JavaStreamingContext from a checkpoint file.
   * @param path Path to the directory that was specified as the checkpoint directory
   * <p>
   */
  public   JavaStreamingContext (java.lang.String path, org.apache.hadoop.conf.Configuration hadoopConf) { throw new RuntimeException(); }
  /** The underlying SparkContext */
  public  org.apache.spark.api.java.JavaSparkContext sparkContext () { throw new RuntimeException(); }
  public  org.apache.spark.api.java.JavaSparkContext sc () { throw new RuntimeException(); }
  /**
   * Create an input stream from network source hostname:port. Data is received using
   * a TCP socket and the receive bytes is interpreted as UTF8 encoded \n delimited
   * lines.
   * @param hostname      Hostname to connect to for receiving data
   * @param port          Port to connect to for receiving data
   * @param storageLevel  Storage level to use for storing the received objects
   */
  public  org.apache.spark.streaming.api.java.JavaReceiverInputDStream<java.lang.String> socketTextStream (java.lang.String hostname, int port, org.apache.spark.storage.StorageLevel storageLevel) { throw new RuntimeException(); }
  /**
   * Create an input stream from network source hostname:port. Data is received using
   * a TCP socket and the receive bytes is interpreted as UTF8 encoded \n delimited
   * lines. Storage level of the data will be the default StorageLevel.MEMORY_AND_DISK_SER_2.
   * @param hostname      Hostname to connect to for receiving data
   * @param port          Port to connect to for receiving data
   */
  public  org.apache.spark.streaming.api.java.JavaReceiverInputDStream<java.lang.String> socketTextStream (java.lang.String hostname, int port) { throw new RuntimeException(); }
  /**
   * Create an input stream from network source hostname:port. Data is received using
   * a TCP socket and the receive bytes it interepreted as object using the given
   * converter.
   * @param hostname      Hostname to connect to for receiving data
   * @param port          Port to connect to for receiving data
   * @param converter     Function to convert the byte stream to objects
   * @param storageLevel  Storage level to use for storing the received objects
   * @tparam T            Type of the objects received (after converting bytes to objects)
   */
  public <T extends java.lang.Object> org.apache.spark.streaming.api.java.JavaReceiverInputDStream<T> socketStream (java.lang.String hostname, int port, org.apache.spark.api.java.function.Function<java.io.InputStream, java.lang.Iterable<T>> converter, org.apache.spark.storage.StorageLevel storageLevel) { throw new RuntimeException(); }
  /**
   * Create an input stream that monitors a Hadoop-compatible filesystem
   * for new files and reads them as text files (using key as LongWritable, value
   * as Text and input format as TextInputFormat). Files must be written to the
   * monitored directory by "moving" them from another location within the same
   * file system. File names starting with . are ignored.
   * @param directory HDFS directory to monitor for new file
   */
  public  org.apache.spark.streaming.api.java.JavaDStream<java.lang.String> textFileStream (java.lang.String directory) { throw new RuntimeException(); }
  /**
   * Create an input stream from network source hostname:port, where data is received
   * as serialized blocks (serialized using the Spark's serializer) that can be directly
   * pushed into the block manager without deserializing them. This is the most efficient
   * way to receive data.
   * @param hostname      Hostname to connect to for receiving data
   * @param port          Port to connect to for receiving data
   * @param storageLevel  Storage level to use for storing the received objects
   * @tparam T            Type of the objects in the received blocks
   */
  public <T extends java.lang.Object> org.apache.spark.streaming.api.java.JavaReceiverInputDStream<T> rawSocketStream (java.lang.String hostname, int port, org.apache.spark.storage.StorageLevel storageLevel) { throw new RuntimeException(); }
  /**
   * Create an input stream from network source hostname:port, where data is received
   * as serialized blocks (serialized using the Spark's serializer) that can be directly
   * pushed into the block manager without deserializing them. This is the most efficient
   * way to receive data.
   * @param hostname      Hostname to connect to for receiving data
   * @param port          Port to connect to for receiving data
   * @tparam T            Type of the objects in the received blocks
   */
  public <T extends java.lang.Object> org.apache.spark.streaming.api.java.JavaReceiverInputDStream<T> rawSocketStream (java.lang.String hostname, int port) { throw new RuntimeException(); }
  /**
   * Create an input stream that monitors a Hadoop-compatible filesystem
   * for new files and reads them using the given key-value types and input format.
   * Files must be written to the monitored directory by "moving" them from another
   * location within the same file system. File names starting with . are ignored.
   * @param directory HDFS directory to monitor for new file
   * @tparam K Key type for reading HDFS file
   * @tparam V Value type for reading HDFS file
   * @tparam F Input format for reading HDFS file
   */
  public <K extends java.lang.Object, V extends java.lang.Object, F extends org.apache.hadoop.mapreduce.InputFormat<K, V>> org.apache.spark.streaming.api.java.JavaPairInputDStream<K, V> fileStream (java.lang.String directory) { throw new RuntimeException(); }
  /**
   * Create an input stream with any arbitrary user implemented actor receiver.
   * @param props Props object defining creation of the actor
   * @param name Name of the actor
   * @param storageLevel Storage level to use for storing the received objects
   * <p>
   * @note An important point to note:
   *       Since Actor may exist outside the spark framework, It is thus user's responsibility
   *       to ensure the type safety, i.e parametrized type of data received and actorStream
   *       should be same.
   */
  public <T extends java.lang.Object> org.apache.spark.streaming.api.java.JavaReceiverInputDStream<T> actorStream (akka.actor.Props props, java.lang.String name, org.apache.spark.storage.StorageLevel storageLevel, akka.actor.SupervisorStrategy supervisorStrategy) { throw new RuntimeException(); }
  /**
   * Create an input stream with any arbitrary user implemented actor receiver.
   * @param props Props object defining creation of the actor
   * @param name Name of the actor
   * @param storageLevel Storage level to use for storing the received objects
   * <p>
   * @note An important point to note:
   *       Since Actor may exist outside the spark framework, It is thus user's responsibility
   *       to ensure the type safety, i.e parametrized type of data received and actorStream
   *       should be same.
   */
  public <T extends java.lang.Object> org.apache.spark.streaming.api.java.JavaReceiverInputDStream<T> actorStream (akka.actor.Props props, java.lang.String name, org.apache.spark.storage.StorageLevel storageLevel) { throw new RuntimeException(); }
  /**
   * Create an input stream with any arbitrary user implemented actor receiver.
   * Storage level of the data will be the default StorageLevel.MEMORY_AND_DISK_SER_2.
   * @param props Props object defining creation of the actor
   * @param name Name of the actor
   * <p>
   * @note An important point to note:
   *       Since Actor may exist outside the spark framework, It is thus user's responsibility
   *       to ensure the type safety, i.e parametrized type of data received and actorStream
   *       should be same.
   */
  public <T extends java.lang.Object> org.apache.spark.streaming.api.java.JavaReceiverInputDStream<T> actorStream (akka.actor.Props props, java.lang.String name) { throw new RuntimeException(); }
  /**
   * Create an input stream from an queue of RDDs. In each batch,
   * it will process either one or all of the RDDs returned by the queue.
   * <p>
   * NOTE: changes to the queue after the stream is created will not be recognized.
   * @param queue      Queue of RDDs
   * @tparam T         Type of objects in the RDD
   */
  public <T extends java.lang.Object> org.apache.spark.streaming.api.java.JavaDStream<T> queueStream (java.util.Queue<org.apache.spark.api.java.JavaRDD<T>> queue) { throw new RuntimeException(); }
  /**
   * Create an input stream from an queue of RDDs. In each batch,
   * it will process either one or all of the RDDs returned by the queue.
   * <p>
   * NOTE: changes to the queue after the stream is created will not be recognized.
   * @param queue      Queue of RDDs
   * @param oneAtATime Whether only one RDD should be consumed from the queue in every interval
   * @tparam T         Type of objects in the RDD
   */
  public <T extends java.lang.Object> org.apache.spark.streaming.api.java.JavaInputDStream<T> queueStream (java.util.Queue<org.apache.spark.api.java.JavaRDD<T>> queue, boolean oneAtATime) { throw new RuntimeException(); }
  /**
   * Create an input stream from an queue of RDDs. In each batch,
   * it will process either one or all of the RDDs returned by the queue.
   * <p>
   * NOTE: changes to the queue after the stream is created will not be recognized.
   * @param queue      Queue of RDDs
   * @param oneAtATime Whether only one RDD should be consumed from the queue in every interval
   * @param defaultRDD Default RDD is returned by the DStream when the queue is empty
   * @tparam T         Type of objects in the RDD
   */
  public <T extends java.lang.Object> org.apache.spark.streaming.api.java.JavaInputDStream<T> queueStream (java.util.Queue<org.apache.spark.api.java.JavaRDD<T>> queue, boolean oneAtATime, org.apache.spark.api.java.JavaRDD<T> defaultRDD) { throw new RuntimeException(); }
  /**
   * Create an input stream with any arbitrary user implemented receiver.
   * Find more details at: http://spark.apache.org/docs/latest/streaming-custom-receivers.html
   * @param receiver Custom implementation of Receiver
   */
  public <T extends java.lang.Object> org.apache.spark.streaming.api.java.JavaReceiverInputDStream<T> receiverStream (org.apache.spark.streaming.receiver.Receiver<T> receiver) { throw new RuntimeException(); }
  /**
   * Create a unified DStream from multiple DStreams of the same type and same slide duration.
   */
  public <T extends java.lang.Object> org.apache.spark.streaming.api.java.JavaDStream<T> union (org.apache.spark.streaming.api.java.JavaDStream<T> first, java.util.List<org.apache.spark.streaming.api.java.JavaDStream<T>> rest) { throw new RuntimeException(); }
  /**
   * Create a unified DStream from multiple DStreams of the same type and same slide duration.
   */
  public <K extends java.lang.Object, V extends java.lang.Object> org.apache.spark.streaming.api.java.JavaPairDStream<K, V> union (org.apache.spark.streaming.api.java.JavaPairDStream<K, V> first, java.util.List<org.apache.spark.streaming.api.java.JavaPairDStream<K, V>> rest) { throw new RuntimeException(); }
  /**
   * Create a new DStream in which each RDD is generated by applying a function on RDDs of
   * the DStreams. The order of the JavaRDDs in the transform function parameter will be the
   * same as the order of corresponding DStreams in the list. Note that for adding a
   * JavaPairDStream in the list of JavaDStreams, convert it to a JavaDStream using
   * {@link org.apache.spark.streaming.api.java.JavaPairDStream}.toJavaDStream().
   * In the transform function, convert the JavaRDD corresponding to that JavaDStream to
   * a JavaPairRDD using org.apache.spark.api.java.JavaPairRDD.fromJavaRDD().
   */
  public <T extends java.lang.Object> org.apache.spark.streaming.api.java.JavaDStream<T> transform (java.util.List<org.apache.spark.streaming.api.java.JavaDStream<?>> dstreams, org.apache.spark.api.java.function.Function2<java.util.List<org.apache.spark.api.java.JavaRDD<?>>, org.apache.spark.streaming.Time, org.apache.spark.api.java.JavaRDD<T>> transformFunc) { throw new RuntimeException(); }
  /**
   * Create a new DStream in which each RDD is generated by applying a function on RDDs of
   * the DStreams. The order of the JavaRDDs in the transform function parameter will be the
   * same as the order of corresponding DStreams in the list. Note that for adding a
   * JavaPairDStream in the list of JavaDStreams, convert it to a JavaDStream using
   * {@link org.apache.spark.streaming.api.java.JavaPairDStream}.toJavaDStream().
   * In the transform function, convert the JavaRDD corresponding to that JavaDStream to
   * a JavaPairRDD using org.apache.spark.api.java.JavaPairRDD.fromJavaRDD().
   */
  public <K extends java.lang.Object, V extends java.lang.Object> org.apache.spark.streaming.api.java.JavaPairDStream<K, V> transformToPair (java.util.List<org.apache.spark.streaming.api.java.JavaDStream<?>> dstreams, org.apache.spark.api.java.function.Function2<java.util.List<org.apache.spark.api.java.JavaRDD<?>>, org.apache.spark.streaming.Time, org.apache.spark.api.java.JavaPairRDD<K, V>> transformFunc) { throw new RuntimeException(); }
  /**
   * Sets the context to periodically checkpoint the DStream operations for master
   * fault-tolerance. The graph will be checkpointed every batch interval.
   * @param directory HDFS-compatible directory where the checkpoint data will be reliably stored
   */
  public  void checkpoint (java.lang.String directory) { throw new RuntimeException(); }
  /**
   * Sets each DStreams in this context to remember RDDs it generated in the last given duration.
   * DStreams remember RDDs only for a limited duration of duration and releases them for garbage
   * collection. This method allows the developer to specify how long to remember the RDDs (
   * if the developer wishes to query old data outside the DStream computation).
   * @param duration Minimum duration that each DStream should remember its RDDs
   */
  public  void remember (org.apache.spark.streaming.Duration duration) { throw new RuntimeException(); }
  /** Add a {@link org.apache.spark.streaming.scheduler.StreamingListener} object for
   * receiving system events related to streaming.
   */
  public  void addStreamingListener (org.apache.spark.streaming.scheduler.StreamingListener streamingListener) { throw new RuntimeException(); }
  /**
   * Start the execution of the streams.
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
   * Stop the execution of the streams. Will stop the associated JavaSparkContext as well.
   */
  public  void stop () { throw new RuntimeException(); }
  /**
   * Stop the execution of the streams.
   * @param stopSparkContext Stop the associated SparkContext or not
   */
  public  void stop (boolean stopSparkContext) { throw new RuntimeException(); }
  /**
   * Stop the execution of the streams.
   * @param stopSparkContext Stop the associated SparkContext or not
   * @param stopGracefully Stop gracefully by waiting for the processing of all
   *                       received data to be completed
   */
  public  void stop (boolean stopSparkContext, boolean stopGracefully) { throw new RuntimeException(); }
  public  void close () { throw new RuntimeException(); }
}
