package org.apache.spark.shuffle;
/**
 * Failed to fetch a shuffle block. The executor catches this exception and propagates it
 * back to DAGScheduler (through TaskEndReason) so we'd resubmit the previous stage.
 * <p>
 * Note that bmAddress can be null.
 */
public  class FetchFailedException extends java.lang.Exception {
  public   FetchFailedException (org.apache.spark.storage.BlockManagerId bmAddress, int shuffleId, int mapId, int reduceId, java.lang.String message, java.lang.Throwable cause) { throw new RuntimeException(); }
  public   FetchFailedException (org.apache.spark.storage.BlockManagerId bmAddress, int shuffleId, int mapId, int reduceId, java.lang.Throwable cause) { throw new RuntimeException(); }
  public  org.apache.spark.TaskEndReason toTaskEndReason () { throw new RuntimeException(); }
}
