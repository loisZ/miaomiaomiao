package org.apache.spark.streaming.rdd;
/**
 * Partition class for {@link org.apache.spark.streaming.rdd.WriteAheadLogBackedBlockRDD}.
 * It contains information about the id of the blocks having this partition's data and
 * the segment of the write ahead log that backs the partition.
 * @param index index of the partition
 * @param blockId id of the block having the partition data
 * @param segment segment of the write ahead log having the partition data
 */
public  class WriteAheadLogBackedBlockRDDPartition implements org.apache.spark.Partition {
  public  int index () { throw new RuntimeException(); }
  public  org.apache.spark.storage.BlockId blockId () { throw new RuntimeException(); }
  public  org.apache.spark.streaming.util.WriteAheadLogFileSegment segment () { throw new RuntimeException(); }
  // not preceding
  public   WriteAheadLogBackedBlockRDDPartition (int index, org.apache.spark.storage.BlockId blockId, org.apache.spark.streaming.util.WriteAheadLogFileSegment segment) { throw new RuntimeException(); }
}
