package org.apache.spark.util.io;
/**
 * An OutputStream that writes to fixed-size chunks of byte arrays.
 * <p>
 * @param chunkSize size of each chunk, in bytes.
 */
public  class ByteArrayChunkOutputStream extends java.io.OutputStream {
  public   ByteArrayChunkOutputStream (int chunkSize) { throw new RuntimeException(); }
  private  scala.collection.mutable.ArrayBuffer<byte[]> chunks () { throw new RuntimeException(); }
  /** Index of the last chunk. Starting with -1 when the chunks array is empty. */
  private  int lastChunkIndex () { throw new RuntimeException(); }
  /**
   * Next position to write in the last chunk.
   * <p>
   * If this equals chunkSize, it means for next write we need to allocate a new chunk.
   * This can also never be 0.
   */
  private  int position () { throw new RuntimeException(); }
  public  void write (int b) { throw new RuntimeException(); }
  public  void write (byte[] bytes, int off, int len) { throw new RuntimeException(); }
  private  void allocateNewChunkIfNeeded () { throw new RuntimeException(); }
  public  byte[][] toArrays () { throw new RuntimeException(); }
}
