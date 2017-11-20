package org.apache.spark.mllib.linalg;
// no position
/**
 * BLAS routines for MLlib's vectors and matrices.
 */
public  class BLAS implements scala.Serializable, org.apache.spark.Logging {
  static private  com.github.fommil.netlib.BLAS _f2jBLAS () { throw new RuntimeException(); }
  static private  com.github.fommil.netlib.BLAS _nativeBLAS () { throw new RuntimeException(); }
  static private  com.github.fommil.netlib.BLAS f2jBLAS () { throw new RuntimeException(); }
  /**
   * y += a * x
   */
  static public  void axpy (double a, org.apache.spark.mllib.linalg.Vector x, org.apache.spark.mllib.linalg.Vector y) { throw new RuntimeException(); }
  /**
   * y += a * x
   */
  static private  void axpy (double a, org.apache.spark.mllib.linalg.DenseVector x, org.apache.spark.mllib.linalg.DenseVector y) { throw new RuntimeException(); }
  /**
   * y += a * x
   */
  static private  void axpy (double a, org.apache.spark.mllib.linalg.SparseVector x, org.apache.spark.mllib.linalg.DenseVector y) { throw new RuntimeException(); }
  /**
   * dot(x, y)
   */
  static public  double dot (org.apache.spark.mllib.linalg.Vector x, org.apache.spark.mllib.linalg.Vector y) { throw new RuntimeException(); }
  /**
   * dot(x, y)
   */
  static private  double dot (org.apache.spark.mllib.linalg.DenseVector x, org.apache.spark.mllib.linalg.DenseVector y) { throw new RuntimeException(); }
  /**
   * dot(x, y)
   */
  static private  double dot (org.apache.spark.mllib.linalg.SparseVector x, org.apache.spark.mllib.linalg.DenseVector y) { throw new RuntimeException(); }
  /**
   * dot(x, y)
   */
  static private  double dot (org.apache.spark.mllib.linalg.SparseVector x, org.apache.spark.mllib.linalg.SparseVector y) { throw new RuntimeException(); }
  /**
   * y = x
   */
  static public  void copy (org.apache.spark.mllib.linalg.Vector x, org.apache.spark.mllib.linalg.Vector y) { throw new RuntimeException(); }
  /**
   * x = a * x
   */
  static public  void scal (double a, org.apache.spark.mllib.linalg.Vector x) { throw new RuntimeException(); }
  static private  com.github.fommil.netlib.BLAS nativeBLAS () { throw new RuntimeException(); }
  /**
   * C := alpha * A * B + beta * C
   * @param transA whether to use the transpose of matrix A (true), or A itself (false).
   * @param transB whether to use the transpose of matrix B (true), or B itself (false).
   * @param alpha a scalar to scale the multiplication A * B.
   * @param A the matrix A that will be left multiplied to B. Size of m x k.
   * @param B the matrix B that will be left multiplied by A. Size of k x n.
   * @param beta a scalar that can be used to scale matrix C.
   * @param C the resulting matrix C. Size of m x n.
   */
  static public  void gemm (boolean transA, boolean transB, double alpha, org.apache.spark.mllib.linalg.Matrix A, org.apache.spark.mllib.linalg.DenseMatrix B, double beta, org.apache.spark.mllib.linalg.DenseMatrix C) { throw new RuntimeException(); }
  /**
   * C := alpha * A * B + beta * C
   * <p>
   * @param alpha a scalar to scale the multiplication A * B.
   * @param A the matrix A that will be left multiplied to B. Size of m x k.
   * @param B the matrix B that will be left multiplied by A. Size of k x n.
   * @param beta a scalar that can be used to scale matrix C.
   * @param C the resulting matrix C. Size of m x n.
   */
  static public  void gemm (double alpha, org.apache.spark.mllib.linalg.Matrix A, org.apache.spark.mllib.linalg.DenseMatrix B, double beta, org.apache.spark.mllib.linalg.DenseMatrix C) { throw new RuntimeException(); }
  /**
   * C := alpha * A * B + beta * C
   * For <code>DenseMatrix</code> A.
   */
  static private  void gemm (boolean transA, boolean transB, double alpha, org.apache.spark.mllib.linalg.DenseMatrix A, org.apache.spark.mllib.linalg.DenseMatrix B, double beta, org.apache.spark.mllib.linalg.DenseMatrix C) { throw new RuntimeException(); }
  /**
   * C := alpha * A * B + beta * C
   * For <code>SparseMatrix</code> A.
   */
  static private  void gemm (boolean transA, boolean transB, double alpha, org.apache.spark.mllib.linalg.SparseMatrix A, org.apache.spark.mllib.linalg.DenseMatrix B, double beta, org.apache.spark.mllib.linalg.DenseMatrix C) { throw new RuntimeException(); }
  /**
   * y := alpha * A * x + beta * y
   * @param trans whether to use the transpose of matrix A (true), or A itself (false).
   * @param alpha a scalar to scale the multiplication A * x.
   * @param A the matrix A that will be left multiplied to x. Size of m x n.
   * @param x the vector x that will be left multiplied by A. Size of n x 1.
   * @param beta a scalar that can be used to scale vector y.
   * @param y the resulting vector y. Size of m x 1.
   */
  static public  void gemv (boolean trans, double alpha, org.apache.spark.mllib.linalg.Matrix A, org.apache.spark.mllib.linalg.DenseVector x, double beta, org.apache.spark.mllib.linalg.DenseVector y) { throw new RuntimeException(); }
  /**
   * y := alpha * A * x + beta * y
   * <p>
   * @param alpha a scalar to scale the multiplication A * x.
   * @param A the matrix A that will be left multiplied to x. Size of m x n.
   * @param x the vector x that will be left multiplied by A. Size of n x 1.
   * @param beta a scalar that can be used to scale vector y.
   * @param y the resulting vector y. Size of m x 1.
   */
  static public  void gemv (double alpha, org.apache.spark.mllib.linalg.Matrix A, org.apache.spark.mllib.linalg.DenseVector x, double beta, org.apache.spark.mllib.linalg.DenseVector y) { throw new RuntimeException(); }
  /**
   * y := alpha * A * x + beta * y
   * For <code>DenseMatrix</code> A.
   */
  static private  void gemv (boolean trans, double alpha, org.apache.spark.mllib.linalg.DenseMatrix A, org.apache.spark.mllib.linalg.DenseVector x, double beta, org.apache.spark.mllib.linalg.DenseVector y) { throw new RuntimeException(); }
  /**
   * y := alpha * A * x + beta * y
   * For <code>SparseMatrix</code> A.
   */
  static private  void gemv (boolean trans, double alpha, org.apache.spark.mllib.linalg.SparseMatrix A, org.apache.spark.mllib.linalg.DenseVector x, double beta, org.apache.spark.mllib.linalg.DenseVector y) { throw new RuntimeException(); }
}
