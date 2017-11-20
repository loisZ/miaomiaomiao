package org.apache.spark.mllib.linalg;
/**
 * Trait for a local matrix.
 */
public  interface Matrix extends scala.Serializable {
  /** Number of rows. */
  public  int numRows () ;
  /** Number of columns. */
  public  int numCols () ;
  /** Converts to a dense array in column major. */
  public  double[] toArray () ;
  /** Converts to a breeze matrix. */
  public  breeze.linalg.Matrix<java.lang.Object> toBreeze () ;
  /** Gets the (i, j)-th element. */
  public  double apply (int i, int j) ;
  /** Return the index for the (i, j)-th element in the backing array. */
  public  int index (int i, int j) ;
  /** Update element at (i, j) */
  public  void update (int i, int j, double v) ;
  /** Get a deep copy of the matrix. */
  public  org.apache.spark.mllib.linalg.Matrix copy () ;
  /** Convenience method for `Matrix`-`DenseMatrix` multiplication. */
  public  org.apache.spark.mllib.linalg.DenseMatrix multiply (org.apache.spark.mllib.linalg.DenseMatrix y) ;
  /** Convenience method for `Matrix`-`DenseVector` multiplication. */
  public  org.apache.spark.mllib.linalg.DenseVector multiply (org.apache.spark.mllib.linalg.DenseVector y) ;
  /** Convenience method for `Matrix`^T^-`DenseMatrix` multiplication. */
  public  org.apache.spark.mllib.linalg.DenseMatrix transposeMultiply (org.apache.spark.mllib.linalg.DenseMatrix y) ;
  /** Convenience method for `Matrix`^T^-`DenseVector` multiplication. */
  public  org.apache.spark.mllib.linalg.DenseVector transposeMultiply (org.apache.spark.mllib.linalg.DenseVector y) ;
  /** A human readable representation of the matrix */
  public  java.lang.String toString () ;
  /** Map the values of this matrix using a function. Generates a new matrix. Performs the
   * function on only the backing array. For example, an operation such as addition or
   * subtraction will only be performed on the non-zero values in a <code>SparseMatrix</code>. */
  public  org.apache.spark.mllib.linalg.Matrix map (scala.Function1<java.lang.Object, java.lang.Object> f) ;
  /** Update all the values of this matrix using the function f. Performed in-place on the
   * backing array. For example, an operation such as addition or subtraction will only be
   * performed on the non-zero values in a <code>SparseMatrix</code>. */
  public  org.apache.spark.mllib.linalg.Matrix update (scala.Function1<java.lang.Object, java.lang.Object> f) ;
}
