package org.apache.spark.mllib.linalg.distributed;
/**
 * :: Experimental ::
 * Represents a row of {@link org.apache.spark.mllib.linalg.distributed.IndexedRowMatrix}.
 */
public  class IndexedRow implements scala.Product, scala.Serializable {
  public  long index () { throw new RuntimeException(); }
  public  org.apache.spark.mllib.linalg.Vector vector () { throw new RuntimeException(); }
  // not preceding
  public   IndexedRow (long index, org.apache.spark.mllib.linalg.Vector vector) { throw new RuntimeException(); }
}
