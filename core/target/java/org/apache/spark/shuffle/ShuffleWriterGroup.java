package org.apache.spark.shuffle;
/** A group of writers for a ShuffleMapTask, one writer per reducer. */
public  interface ShuffleWriterGroup {
  public  org.apache.spark.storage.BlockObjectWriter[] writers () ;
  /** @param success Indicates all writes were successful. If false, no blocks will be recorded. */
  public  void releaseWriters (boolean success) ;
}
