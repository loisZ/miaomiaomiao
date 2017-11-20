package org.apache.spark.streaming.rdd;
/**
 * This class represents a special case of the BlockRDD where the data blocks in
 * the block manager are also backed by segments in write ahead logs. For reading
 * the data, this RDD first looks up the blocks by their ids in the block manager.
 * If it does not find them, it looks up the corresponding file segment.
 * <p>
 * @param sc SparkContext
 * @param blockIds Ids of the blocks that contains this RDD's data
 * @param segments Segments in write ahead logs that contain this RDD's data
 * @param storeInBlockManager Whether to store in the block manager after reading from the segment
 * @param storageLevel storage level to store when storing in block manager
 *                     (applicable when storeInBlockManager = true)
 */
public  class WriteAheadLogBackedBlockRDD<T extends java.lang.Object> extends org.apache.spark.rdd.BlockRDD<T> {
  // not preceding
  public   WriteAheadLogBackedBlockRDD (org.apache.spark.SparkContext sc, org.apache.spark.storage.BlockId[] blockIds, org.apache.spark.streaming.util.WriteAheadLogFileSegment[] segments, boolean storeInBlockManager, org.apache.spark.storage.StorageLevel storageLevel, scala.reflect.ClassTag<T> evidence$1) { throw new RuntimeException(); }
  private  org.apache.hadoop.conf.Configuration hadoopConfig () { throw new RuntimeException(); }
  private  org.apache.spark.SerializableWritable<org.apache.hadoop.conf.Configuration> broadcastedHadoopConf () { throw new RuntimeException(); }
  public  org.apache.spark.Partition[] getPartitions () { throw new RuntimeException(); }
  /**
   * Gets the partition data by getting the corresponding block from the block manager.
   * If the block does not exist, then the data is read from the corresponding segment
   * in write ahead log files.
   */
  public  scala.collection.Iterator<T> compute (org.apache.spark.Partition split, org.apache.spark.TaskContext context) { throw new RuntimeException(); }
  /**
   * Get the preferred location of the partition. This returns the locations of the block
   * if it is present in the block manager, else it returns the location of the
   * corresponding segment in HDFS.
   */
  public  scala.collection.Seq<java.lang.String> getPreferredLocations (org.apache.spark.Partition split) { throw new RuntimeException(); }
}
