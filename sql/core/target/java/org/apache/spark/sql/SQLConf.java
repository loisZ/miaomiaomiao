package org.apache.spark.sql;
/**
 * A trait that enables the setting and getting of mutable config parameters/hints.
 * <p>
 * In the presence of a SQLContext, these can be set and queried by passing SET commands
 * into Spark SQL's query functions (i.e. sql()). Otherwise, users of this trait can
 * modify the hints by programmatically calling the setters and getters of this trait.
 * <p>
 * SQLConf is thread-safe (internally synchronized, so safe to be used in multiple threads).
 */
public  interface SQLConf {
  // no position
  static public  class Deprecated$ {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final Deprecated$ MODULE$ = null;
    public   Deprecated$ () { throw new RuntimeException(); }
    public  java.lang.String MAPRED_REDUCE_TASKS () { throw new RuntimeException(); }
  }
  /** Only low degree of contention is expected for conf, thus NOT using ConcurrentHashMap. */
  public  java.util.Map<java.lang.String, java.lang.String> settings () ;
  /**
   * The SQL dialect that is used when parsing queries.  This defaults to 'sql' which uses
   * a simple SQL parser provided by Spark SQL.  This is currently the only option for users of
   * SQLContext.
   * <p>
   * When using a HiveContext, this value defaults to 'hiveql', which uses the Hive 0.12.0 HiveQL
   * parser.  Users can change this to 'sql' if they want to run queries that aren't supported by
   * HiveQL (e.g., SELECT 1).
   * <p>
   * Note that the choice of dialect does not affect things like what tables are available or
   * how query execution is performed.
   */
  public  java.lang.String dialect () ;
  /** When true tables cached using the in-memory columnar caching will be compressed. */
  public  boolean useCompression () ;
  /** The compression codec for writing to a Parquetfile */
  public  java.lang.String parquetCompressionCodec () ;
  /** The number of rows that will be  */
  public  int columnBatchSize () ;
  /** Number of partitions to use for shuffle operators. */
  public  int numShufflePartitions () ;
  /** When true predicates will be passed to the parquet record reader when possible. */
  public  boolean parquetFilterPushDown () ;
  /** When true the planner will use the external sort, which may spill to disk. */
  public  boolean externalSortEnabled () ;
  /**
   * When set to true, Spark SQL will use the Scala compiler at runtime to generate custom bytecode
   * that evaluates expressions found in queries.  In general this custom code runs much faster
   * than interpreted evaluation, but there are significant start-up costs due to compilation.
   * As a result codegen is only beneficial when queries run for a long time, or when the same
   * expressions are used multiple times.
   * <p>
   * Defaults to false as this feature is currently experimental.
   */
  public  boolean codegenEnabled () ;
  /**
   * Upper bound on the sizes (in bytes) of the tables qualified for the auto conversion to
   * a broadcast value during the physical executions of join operations.  Setting this to -1
   * effectively disables auto conversion.
   * <p>
   * Hive setting: hive.auto.convert.join.noconditionaltask.size, whose default value is 10000.
   */
  public  int autoBroadcastJoinThreshold () ;
  /**
   * The default size in bytes to assign to a logical operator's estimation statistics.  By default,
   * it is set to a larger value than <code>autoBroadcastJoinThreshold</code>, hence any logical operator
   * without a properly implemented estimation of this statistic will not be incorrectly broadcasted
   * in joins.
   */
  public  long defaultSizeInBytes () ;
  /**
   * When set to true, we always treat byte arrays in Parquet files as strings.
   */
  public  boolean isParquetBinaryAsString () ;
  /**
   * When set to true, partition pruning for in-memory columnar tables is enabled.
   */
  public  boolean inMemoryPartitionPruning () ;
  public  java.lang.String columnNameOfCorruptRecord () ;
  /**
   * Timeout in seconds for the broadcast wait time in hash join
   */
  public  int broadcastTimeout () ;
  /** Set Spark SQL configuration properties. */
  public  void setConf (java.util.Properties props) ;
  /** Set the given Spark SQL configuration property. */
  public  void setConf (java.lang.String key, java.lang.String value) ;
  /** Return the value of Spark SQL configuration property for the given key. */
  public  java.lang.String getConf (java.lang.String key) ;
  /**
   * Return the value of Spark SQL configuration property for the given key. If the key is not set
   * yet, return <code>defaultValue</code>.
   */
  public  java.lang.String getConf (java.lang.String key, java.lang.String defaultValue) ;
  /**
   * Return all the configuration properties that have been set (i.e. not the default).
   * This creates a new copy of the config properties in the form of a Map.
   */
  public  scala.collection.immutable.Map<java.lang.String, java.lang.String> getAllConfs () ;
  public  void unsetConf (java.lang.String key) ;
  public  void clear () ;
}
