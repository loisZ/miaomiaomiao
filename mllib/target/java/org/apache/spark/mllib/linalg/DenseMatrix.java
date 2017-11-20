package org.apache.spark.mllib.linalg;
/**
 * Column-major dense matrix.
 * The entry values are stored in a single array of doubles with columns listed in sequence.
 * For example, the following matrix
 * <pre><code>
 *   1.0 2.0
 *   3.0 4.0
 *   5.0 6.0
 * </code></pre>
 * is stored as <code>[1.0, 3.0, 5.0, 2.0, 4.0, 6.0]</code>.
 * <p>
 * @param numRows number of rows
 * @param numCols number of columns
 * @param values matrix entries in column major
 */
public  class DenseMatrix implements org.apache.spark.mllib.linalg.Matrix {
  /**
   * Generate a <code>DenseMatrix</code> consisting of zeros.
   * @param numRows number of rows of the matrix
   * @param numCols number of columns of the matrix
   * @return <code>DenseMatrix</code> with size <code>numRows</code> x <code>numCols</code> and values of zeros
   */
  static public  org.apache.spark.mllib.linalg.DenseMatrix zeros (int numRows, int numCols) { throw new RuntimeException(); }
  /**
   * Generate a <code>DenseMatrix</code> consisting of ones.
   * @param numRows number of rows of the matrix
   * @param numCols number of columns of the matrix
   * @return <code>DenseMatrix</code> with size <code>numRows</code> x <code>numCols</code> and values of ones
   */
  static public  org.apache.spark.mllib.linalg.DenseMatrix ones (int numRows, int numCols) { throw new RuntimeException(); }
  /**
   * Generate an Identity Matrix in <code>DenseMatrix</code> format.
   * @param n number of rows and columns of the matrix
   * @return <code>DenseMatrix</code> with size <code>n</code> x <code>n</code> and values of ones on the diagonal
   */
  static public  org.apache.spark.mllib.linalg.DenseMatrix eye (int n) { throw new RuntimeException(); }
  /**
   * Generate a <code>DenseMatrix</code> consisting of i.i.d. uniform random numbers.
   * @param numRows number of rows of the matrix
   * @param numCols number of columns of the matrix
   * @param rng a random number generator
   * @return <code>DenseMatrix</code> with size <code>numRows</code> x <code>numCols</code> and values in U(0, 1)
   */
  static public  org.apache.spark.mllib.linalg.DenseMatrix rand (int numRows, int numCols, java.util.Random rng) { throw new RuntimeException(); }
  /**
   * Generate a <code>DenseMatrix</code> consisting of i.i.d. gaussian random numbers.
   * @param numRows number of rows of the matrix
   * @param numCols number of columns of the matrix
   * @param rng a random number generator
   * @return <code>DenseMatrix</code> with size <code>numRows</code> x <code>numCols</code> and values in N(0, 1)
   */
  static public  org.apache.spark.mllib.linalg.DenseMatrix randn (int numRows, int numCols, java.util.Random rng) { throw new RuntimeException(); }
  /**
   * Generate a diagonal matrix in <code>DenseMatrix</code> format from the supplied values.
   * @param vector a <code>Vector</code> that will form the values on the diagonal of the matrix
   * @return Square <code>DenseMatrix</code> with size <code>values.length</code> x <code>values.length</code> and <code>values</code>
   *         on the diagonal
   */
  static public  org.apache.spark.mllib.linalg.DenseMatrix diag (org.apache.spark.mllib.linalg.Vector vector) { throw new RuntimeException(); }
  public  int numRows () { throw new RuntimeException(); }
  public  int numCols () { throw new RuntimeException(); }
  public  double[] values () { throw new RuntimeException(); }
  // not preceding
  public   DenseMatrix (int numRows, int numCols, double[] values) { throw new RuntimeException(); }
  public  double[] toArray () { throw new RuntimeException(); }
  public  boolean equals (Object o) { throw new RuntimeException(); }
  public  breeze.linalg.Matrix<java.lang.Object> toBreeze () { throw new RuntimeException(); }
  public  double apply (int i) { throw new RuntimeException(); }
  public  double apply (int i, int j) { throw new RuntimeException(); }
  public  int index (int i, int j) { throw new RuntimeException(); }
  public  void update (int i, int j, double v) { throw new RuntimeException(); }
  public  org.apache.spark.mllib.linalg.DenseMatrix copy () { throw new RuntimeException(); }
  public  org.apache.spark.mllib.linalg.DenseMatrix map (scala.Function1<java.lang.Object, java.lang.Object> f) { throw new RuntimeException(); }
  public  org.apache.spark.mllib.linalg.DenseMatrix update (scala.Function1<java.lang.Object, java.lang.Object> f) { throw new RuntimeException(); }
  /** Generate a `SparseMatrix` from the given `DenseMatrix`. */
  public  org.apache.spark.mllib.linalg.SparseMatrix toSparse () { throw new RuntimeException(); }
}
