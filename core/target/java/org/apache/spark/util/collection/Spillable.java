package org.apache.spark.util.collection;
/**
 * Spills contents of an in-memory collection to disk when the memory threshold
 * has been exceeded.
 */
public  interface Spillable<C extends java.lang.Object> extends org.apache.spark.Logging {
  /**
   * Spills the current in-memory collection to disk, and releases the memory.
   * <p>
   * @param collection collection to spill to disk
   */
  public  void spill (C collection) ;
  public  long elementsRead () ;
  public  void addElementsRead () ;
  /**
   * Spills the current in-memory collection to disk if needed. Attempts to acquire more
   * memory before spilling.
   * <p>
   * @param collection collection to spill to disk
   * @param currentMemory estimated size of the collection in bytes
   * @return true if <code>collection</code> was spilled to disk; false otherwise
   */
  public  boolean maybeSpill (C collection, long currentMemory) ;
  /**
   * @return number of bytes spilled in total
   */
  public  long memoryBytesSpilled () ;
  /**
   * Release our memory back to the shuffle pool so that other threads can grab it.
   */
  public  void releaseMemoryForThisThread () ;
  /**
   * Prints a standard log message detailing spillage.
   * <p>
   * @param size number of bytes spilled
   */
  public  void logSpillage (long size) ;
}
