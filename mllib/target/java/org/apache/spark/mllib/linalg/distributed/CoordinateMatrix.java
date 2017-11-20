package org.apache.spark.mllib.linalg.distributed;
/**
 * :: Experimental ::
 * Represents a matrix in coordinate format.
 * <p>
 * @param entries matrix entries
 * @param nRows number of rows. A non-positive value means unknown, and then the number of rows will
 *              be determined by the max row index plus one.
 * @param nCols number of columns. A non-positive value means unknown, and then the number of
 *              columns will be determined by the max column index plus one.
 */
public  class CoordinateMatrix implements org.apache.spark.mllib.linalg.distributed.DistributedMatrix {
  public  org.apache.spark.rdd.RDD<org.apache.spark.mllib.linalg.distributed.MatrixEntry> entries () { throw new RuntimeException(); }
  private  long nRows () { throw new RuntimeException(); }
  private  long nCols () { throw new RuntimeException(); }
  // not preceding
  public   CoordinateMatrix (org.apache.spark.rdd.RDD<org.apache.spark.mllib.linalg.distributed.MatrixEntry> entries, long nRows, long nCols) { throw new RuntimeException(); }
  /** Alternative constructor leaving matrix dimensions to be determined automatically. */
  public   CoordinateMatrix (org.apache.spark.rdd.RDD<org.apache.spark.mllib.linalg.distributed.MatrixEntry> entries) { throw new RuntimeException(); }
  /** Gets or computes the number of columns. */
  public  long numCols () { throw new RuntimeException(); }
  /** Gets or computes the number of rows. */
  public  long numRows () { throw new RuntimeException(); }
  /** Converts to IndexedRowMatrix. The number of columns must be within the integer range. */
  public  org.apache.spark.mllib.linalg.distributed.IndexedRowMatrix toIndexedRowMatrix () { throw new RuntimeException(); }
  /**
   * Converts to RowMatrix, dropping row indices after grouping by row index.
   * The number of columns must be within the integer range.
   */
  public  org.apache.spark.mllib.linalg.distributed.RowMatrix toRowMatrix () { throw new RuntimeException(); }
  /** Determines the size by computing the max row/column index. */
  private  void computeSize () { throw new RuntimeException(); }
  /** Collects data and assembles a local matrix. */
  public  breeze.linalg.DenseMatrix<java.lang.Object> toBreeze () { throw new RuntimeException(); }
}
