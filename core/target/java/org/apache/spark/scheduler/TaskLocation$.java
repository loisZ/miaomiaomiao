package org.apache.spark.scheduler;
// no position
public  class TaskLocation$ {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final TaskLocation$ MODULE$ = null;
  public   TaskLocation$ () { throw new RuntimeException(); }
  public  java.lang.String inMemoryLocationTag () { throw new RuntimeException(); }
  public  org.apache.spark.scheduler.ExecutorCacheTaskLocation apply (java.lang.String host, java.lang.String executorId) { throw new RuntimeException(); }
  /**
   * Create a TaskLocation from a string returned by getPreferredLocations.
   * These strings have the form [hostname] or hdfs_cache_[hostname], depending on whether the
   * location is cached.
   */
  public  org.apache.spark.scheduler.HostTaskLocation apply (java.lang.String str) { throw new RuntimeException(); }
}
