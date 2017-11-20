package org.apache.spark;
// no position
public  class MapOutputTracker$ implements org.apache.spark.Logging {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final MapOutputTracker$ MODULE$ = null;
  public   MapOutputTracker$ () { throw new RuntimeException(); }
  public  byte[] serializeMapStatuses (org.apache.spark.scheduler.MapStatus[] statuses) { throw new RuntimeException(); }
  public  org.apache.spark.scheduler.MapStatus[] deserializeMapStatuses (byte[] bytes) { throw new RuntimeException(); }
  private  scala.Tuple2<org.apache.spark.storage.BlockManagerId, java.lang.Object>[] convertMapStatuses (int shuffleId, int reduceId, org.apache.spark.scheduler.MapStatus[] statuses) { throw new RuntimeException(); }
}
