package org.apache.spark.mllib.linalg;
/**
 * A sparse vector represented by an index array and an value array.
 * <p>
 * @param size size of the vector.
 * @param indices index array, assume to be strictly increasing.
 * @param values value array, must have the same length as the index array.
 */
public  class SparseVector implements org.apache.spark.mllib.linalg.Vector {
  public  int size () { throw new RuntimeException(); }
  public  int[] indices () { throw new RuntimeException(); }
  public  double[] values () { throw new RuntimeException(); }
  // not preceding
  public   SparseVector (int size, int[] indices, double[] values) { throw new RuntimeException(); }
  public  java.lang.String toString () { throw new RuntimeException(); }
  public  double[] toArray () { throw new RuntimeException(); }
  public  org.apache.spark.mllib.linalg.SparseVector copy () { throw new RuntimeException(); }
  public  breeze.linalg.Vector<java.lang.Object> toBreeze () { throw new RuntimeException(); }
  public  void foreachActive (scala.Function2<java.lang.Object, java.lang.Object, scala.runtime.BoxedUnit> f) { throw new RuntimeException(); }
}
