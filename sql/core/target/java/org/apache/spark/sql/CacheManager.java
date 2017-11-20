package org.apache.spark.sql;
/**
 * Provides support in a SQLContext for caching query results and automatically using these cached
 * results when subsequent queries are executed.  Data is cached using byte buffers stored in an
 * InMemoryRelation.  This relation is automatically substituted query plans that return the
 * <code>sameResult</code> as the originally cached query.
 */
public  interface CacheManager {
  public  scala.collection.mutable.ArrayBuffer<org.apache.spark.sql.CachedData> cachedData () ;
  public  java.util.concurrent.locks.ReentrantReadWriteLock cacheLock () ;
  /** Returns true if the table is currently cached in-memory. */
  public  boolean isCached (java.lang.String tableName) ;
  /** Caches the specified table in-memory. */
  public  void cacheTable (java.lang.String tableName) ;
  /** Removes the specified table from the in-memory cache. */
  public  void uncacheTable (java.lang.String tableName) ;
  /** Acquires a read lock on the cache for the duration of `f`. */
  public <A extends java.lang.Object> A readLock (scala.Function0<A> f) ;
  /** Acquires a write lock on the cache for the duration of `f`. */
  public <A extends java.lang.Object> A writeLock (scala.Function0<A> f) ;
  public  void clearCache () ;
  /**
   * Caches the data produced by the logical representation of the given schema rdd.  Unlike
   * <code>RDD.cache()</code>, the default storage level is set to be <code>MEMORY_AND_DISK</code> because recomputing
   * the in-memory columnar representation of the underlying table is expensive.
   */
  public  void cacheQuery (org.apache.spark.sql.SchemaRDD query, scala.Option<java.lang.String> tableName, org.apache.spark.storage.StorageLevel storageLevel) ;
  /** Removes the data for the given SchemaRDD from the cache */
  public  void uncacheQuery (org.apache.spark.sql.SchemaRDD query, boolean blocking) ;
  /** Tries to remove the data for the given SchemaRDD from the cache if it's cached */
  public  boolean tryUncacheQuery (org.apache.spark.sql.SchemaRDD query, boolean blocking) ;
  /** Optionally returns cached data for the given SchemaRDD */
  public  scala.Option<org.apache.spark.sql.CachedData> lookupCachedData (org.apache.spark.sql.SchemaRDD query) ;
  /** Optionally returns cached data for the given LogicalPlan. */
  public  scala.Option<org.apache.spark.sql.CachedData> lookupCachedData (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan) ;
  /** Replaces segments of the given logical plan with cached versions where possible. */
  public  org.apache.spark.sql.catalyst.plans.logical.LogicalPlan useCachedData (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan) ;
  /**
   * Invalidates the cache of any data that contains <code>plan</code>. Note that it is possible that this
   * function will over invalidate.
   */
  public  void invalidateCache (org.apache.spark.sql.catalyst.plans.logical.LogicalPlan plan) ;
}
