package org.apache.spark.bagel;
/** Default combiner that simply appends messages together (i.e. performs no aggregation) */
public  class DefaultCombiner<M extends java.lang.Object> implements org.apache.spark.bagel.Combiner<M, java.lang.Object>, scala.Serializable {
  // not preceding
  // TypeTree().setOriginal(TypeBoundsTree(TypeTree().setOriginal(Select(Select(Ident(_root_), scala), scala.Nothing)), TypeTree().setOriginal(Select(Select(Ident(_root_), scala), scala.Any))))
  public   DefaultCombiner (scala.reflect.Manifest<M> evidence$33) { throw new RuntimeException(); }
  public  java.lang.Object createCombiner (M msg) { throw new RuntimeException(); }
  public  java.lang.Object mergeMsg (java.lang.Object combiner, M msg) { throw new RuntimeException(); }
  public  java.lang.Object mergeCombiners (java.lang.Object a, java.lang.Object b) { throw new RuntimeException(); }
}
