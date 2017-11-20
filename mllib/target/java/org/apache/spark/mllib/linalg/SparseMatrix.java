package org.apache.spark.mllib.linalg;
/**
 * Column-major sparse matrix.
 * The entry values are stored in Compressed Sparse Column (CSC) format.
 * For example, the following matrix
 * <pre><code>
 *   1.0 0.0 4.0
 *   0.0 3.0 5.0
 *   2.0 0.0 6.0
 * </code></pre>
 * is stored as <code>values: [1.0, 2.0, 3.0, 4.0, 5.0, 6.0]</code>,
 * <code>rowIndices=[0, 2, 1, 0, 1, 2]</code>, <code>colPointers=[0, 2, 3, 6]</code>.
 * <p>
 * @param numRows number of rows
 * @param numCols number of columns
 * @param colPtrs the index corresponding to the start of a new column
 * @param rowIndices the row index of the entry. They must be in strictly increasing order for each
 *                   column
 * @param values non-zero matrix entries in column major
 */
public  class SparseMatrix implements org.apache.spark.mllib.linalg.Matrix {
  /**
   * Generate a <code>SparseMatrix</code> from Coordinate List (COO) format. Input must be an array of
   * (i, j, value) tuples. Entries that have duplicate values of i and j are
   * added together. Tuples where value is equal to zero will be omitted.
   * @param numRows number of rows of the matrix
   * @param numCols number of columns of the matrix
   * @param entries Array of (i, j, value) tuples
   * @return The corresponding <code>SparseMatrix</code>
   */
  static public  org.apache.spark.mllib.linalg.SparseMatrix fromCOO (int numRows, int numCols, scala.collection.Iterable<scala.Tuple3<java.lang.Object, java.lang.Object, java.lang.Object>> entries) { throw new RuntimeException(); }
  /**
   * Generate an Identity Matrix in <code>SparseMatrix</code> format.
   * @param n number of rows and columns of the matrix
   * @return <code>SparseMatrix</code> with size <code>n</code> x <code>n</code> and values of ones on the diagonal
   */
  static public  org.apache.spark.mllib.linalg.SparseMatrix speye (int n) { throw new RuntimeException(); }
  /**
   * Generates the skeleton of a random <code>SparseMatrix</code> with a given random number generator.
   * The values of the matrix returned are undefined.
   */
  static private  org.apache.spark.mllib.linalg.SparseMatrix genRandMatrix (int numRows, int numCols, double density, java.util.Random rng) { throw new RuntimeException(); }
  /**
   * Generate a <code>SparseMatrix</code> consisting of i.i.d. uniform random numbers. The number of non-zero
   * elements equal the ceiling of <code>numRows</code> x <code>numCols</code> x <code>density</code>
   * <p>
   * @param numRows number of rows of the matrix
   * @param numCols number of columns of the matrix
   * @param density the desired density for the matrix
   * @param rng a random number generator
   * @return <code>SparseMatrix</code> with size <code>numRows</code> x <code>numCols</code> and values in U(0, 1)
   */
  static public  org.apache.spark.mllib.linalg.SparseMatrix sprand (int numRows, int numCols, double density, java.util.Random rng) { throw new RuntimeException(); }
  /**
   * Generate a <code>SparseMatrix</code> consisting of i.i.d. gaussian random numbers.
   * @param numRows number of rows of the matrix
   * @param numCols number of columns of the matrix
   * @param density the desired density for the matrix
   * @param rng a random number generator
   * @return <code>SparseMatrix</code> with size <code>numRows</code> x <code>numCols</code> and values in N(0, 1)
   */
  static public  org.apache.spark.mllib.linalg.SparseMatrix sprandn (int numRows, int numCols, double density, java.util.Random rng) { throw new RuntimeException(); }
  /**
   * Generate a diagonal matrix in <code>SparseMatrix</code> format from the supplied values.
   * @param vector a <code>Vector</code> that will form the values on the diagonal of the matrix
   * @return Square <code>SparseMatrix</code> with size <code>values.length</code> x <code>values.length</code> and non-zero
   *         <code>values</code> on the diagonal
   */
  static public  org.apache.spark.mllib.linalg.SparseMatrix diag (org.apache.spark.mllib.linalg.Vector vector) { throw new RuntimeException(); }
  public  int numRows () { throw new RuntimeException(); }
  public  int numCols () { throw new RuntimeException(); }
  public  int[] colPtrs () { throw new RuntimeException(); }
  public  int[] rowIndices () { throw new RuntimeException(); }
  public  double[] values () { throw new RuntimeException(); }
  // not preceding
  public   SparseMatrix (int numRows, int numCols, int[] colPtrs, int[] rowIndices, double[] values) { throw new RuntimeException(); }
  public  double[] toArray () { throw new RuntimeException(); }
  public  breeze.linalg.Matrix<java.lang.Object> toBreeze () { throw new RuntimeException(); }
  public  double apply (int i, int j) { throw new RuntimeException(); }
  public  int index (int i, int j) { throw new RuntimeException(); }
  public  void update (int i, int j, double v) { throw new RuntimeException(); }
  public  org.apache.spark.mllib.linalg.SparseMatrix copy () { throw new RuntimeException(); }
  public  org.apache.spark.mllib.linalg.SparseMatrix map (scala.Function1<java.lang.Object, java.lang.Object> f) { throw new RuntimeException(); }
  public  org.apache.spark.mllib.linalg.SparseMatrix update (scala.Function1<java.lang.Object, java.lang.Object> f) { throw new RuntimeException(); }
  /** Generate a `DenseMatrix` from the given `SparseMatrix`. */
  public  org.apache.spark.mllib.linalg.DenseMatrix toDense () { throw new RuntimeException(); }
}
