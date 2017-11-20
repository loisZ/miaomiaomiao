package org.apache.spark.mllib.linalg.distributed;
/**
 * :: Experimental ::
 * Represents an entry in an distributed matrix.
 * @param i row index
 * @param j column index
 * @param value value of the entry
 */
public  class MatrixEntry implements scala.Product, scala.Serializable {
  public  long i () { throw new RuntimeException(); }
  public  long j () { throw new RuntimeException(); }
  public  double value () { throw new RuntimeException(); }
  // not preceding
  public   MatrixEntry (long i, long j, double value) { throw new RuntimeException(); }
}
