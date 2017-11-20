package org.apache.spark.mllib.linalg.distributed;
// no position
public  class RowMatrix$ implements scala.Serializable {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final RowMatrix$ MODULE$ = null;
  public   RowMatrix$ () { throw new RuntimeException(); }
  /**
   * Adds alpha * x * x.t to a matrix in-place. This is the same as BLAS's DSPR.
   * <p>
   * @param U the upper triangular part of the matrix packed in an array (column major)
   */
  private  void dspr (double alpha, org.apache.spark.mllib.linalg.Vector v, double[] U) { throw new RuntimeException(); }
  /**
   * Fills a full square matrix from its upper triangular part.
   */
  private  org.apache.spark.mllib.linalg.Matrix triuToFull (int n, double[] U) { throw new RuntimeException(); }
}
