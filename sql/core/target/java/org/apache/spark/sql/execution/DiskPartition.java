package org.apache.spark.sql.execution;
public  class DiskPartition {
  public   DiskPartition (java.lang.String filename, int blockSize) { throw new RuntimeException(); }
  private  java.nio.file.Path path () { throw new RuntimeException(); }
  private  java.util.ArrayList<org.apache.spark.sql.catalyst.expressions.Row> data () { throw new RuntimeException(); }
  private  java.io.OutputStream outStream () { throw new RuntimeException(); }
  private  java.io.InputStream inStream () { throw new RuntimeException(); }
  private  java.util.ArrayList<java.lang.Object> chunkSizes () { throw new RuntimeException(); }
  private  boolean writtenToDisk () { throw new RuntimeException(); }
  private  boolean inputClosed () { throw new RuntimeException(); }
  /**
   * This method inserts a new row into this particular partition. If the size of the partition
   * exceeds the blockSize, the partition is spilled to disk.
   * <p>
   * @param row the {@link Row} we are adding
   */
  public  void insert (org.apache.spark.sql.catalyst.expressions.Row row) { throw new RuntimeException(); }
  /**
   * This method converts the data to a byte array and returns the size of the byte array
   * as an estimation of the size of the partition.
   * <p>
   * @return the estimated size of the data
   */
  private  int measurePartitionSize () { throw new RuntimeException(); }
  /**
   * Uses the {@link Files} API to write a byte array representing data to a file.
   */
  private  void spillPartitionToDisk () { throw new RuntimeException(); }
  /**
   * If this partition has been closed, this method returns an Iterator of all the
   * data that was written to disk by this partition.
   * <p>
   * @return the {@link Iterator} of the data
   */
  public  scala.collection.Iterator<org.apache.spark.sql.catalyst.expressions.Row> getData () { throw new RuntimeException(); }
  /**
   * Closes this partition, implying that no more data will be written to this partition. If getData()
   * is called without closing the partition, an error will be thrown.
   * <p>
   * If any data has not been written to disk yet, it should be written. The output stream should
   * also be closed.
   */
  public  void closeInput () { throw new RuntimeException(); }
  /**
   * Closes this partition. This closes the input stream and deletes the file backing the partition.
   */
  public  boolean closePartition () { throw new RuntimeException(); }
}
