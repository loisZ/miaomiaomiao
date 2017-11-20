package org.apache.spark.mllib.linalg;
/**
 * A dense vector represented by a value array.
 */
public  class DenseVector implements org.apache.spark.mllib.linalg.Vector {
  public  double[] values () { throw new RuntimeException(); }
  // not preceding
  public   DenseVector (double[] values) { throw new RuntimeException(); }
  public  int size () { throw new RuntimeException(); }
  public  java.lang.String toString () { throw new RuntimeException(); }
  public  double[] toArray () { throw new RuntimeException(); }
  public  breeze.linalg.Vector<java.lang.Object> toBreeze () { throw new RuntimeException(); }
  public  double apply (int i) { throw new RuntimeException(); }
  public  org.apache.spark.mllib.linalg.DenseVector copy () { throw new RuntimeException(); }
  public  void foreachActive (scala.Function2<java.lang.Object, java.lang.Object, scala.runtime.BoxedUnit> f) { throw new RuntimeException(); }
}
