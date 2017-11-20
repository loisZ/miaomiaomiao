package org.apache.spark.mllib.api.python;
// no position
/**
 * SerDe utility functions for PythonMLLibAPI.
 */
public  class SerDe implements scala.Serializable {
  /**
   * Base class used for pickle
   */
  static public abstract class BasePickler<T extends java.lang.Object> implements net.razorvine.pickle.IObjectPickler, net.razorvine.pickle.IObjectConstructor {
    // not preceding
    // TypeTree().setOriginal(TypeBoundsTree(TypeTree().setOriginal(Select(Select(Ident(_root_), scala), scala.Nothing)), TypeTree().setOriginal(Select(Select(Ident(_root_), scala), scala.Any))))
    public   BasePickler (scala.reflect.ClassTag<T> evidence$1) { throw new RuntimeException(); }
    private  Object cls () { throw new RuntimeException(); }
    private  java.lang.String module () { throw new RuntimeException(); }
    private  java.lang.String name () { throw new RuntimeException(); }
    public  void register () { throw new RuntimeException(); }
    public  void pickle (java.lang.Object obj, java.io.OutputStream out, net.razorvine.pickle.Pickler pickler) { throw new RuntimeException(); }
    public  void saveObjects (java.io.OutputStream out, net.razorvine.pickle.Pickler pickler, scala.collection.Seq<java.lang.Object> objects) { throw new RuntimeException(); }
    public abstract  void saveState (java.lang.Object obj, java.io.OutputStream out, net.razorvine.pickle.Pickler pickler) ;
  }
  static public  class DenseVectorPickler extends org.apache.spark.mllib.api.python.SerDe.BasePickler<org.apache.spark.mllib.linalg.DenseVector> {
    public   DenseVectorPickler () { throw new RuntimeException(); }
    public  void saveState (java.lang.Object obj, java.io.OutputStream out, net.razorvine.pickle.Pickler pickler) { throw new RuntimeException(); }
    public  java.lang.Object construct (java.lang.Object[] args) { throw new RuntimeException(); }
  }
  static public  class DenseMatrixPickler extends org.apache.spark.mllib.api.python.SerDe.BasePickler<org.apache.spark.mllib.linalg.DenseMatrix> {
    public   DenseMatrixPickler () { throw new RuntimeException(); }
    public  void saveState (java.lang.Object obj, java.io.OutputStream out, net.razorvine.pickle.Pickler pickler) { throw new RuntimeException(); }
    public  java.lang.Object construct (java.lang.Object[] args) { throw new RuntimeException(); }
  }
  static public  class SparseVectorPickler extends org.apache.spark.mllib.api.python.SerDe.BasePickler<org.apache.spark.mllib.linalg.SparseVector> {
    public   SparseVectorPickler () { throw new RuntimeException(); }
    public  void saveState (java.lang.Object obj, java.io.OutputStream out, net.razorvine.pickle.Pickler pickler) { throw new RuntimeException(); }
    public  java.lang.Object construct (java.lang.Object[] args) { throw new RuntimeException(); }
  }
  static public  class LabeledPointPickler extends org.apache.spark.mllib.api.python.SerDe.BasePickler<org.apache.spark.mllib.regression.LabeledPoint> {
    public   LabeledPointPickler () { throw new RuntimeException(); }
    public  void saveState (java.lang.Object obj, java.io.OutputStream out, net.razorvine.pickle.Pickler pickler) { throw new RuntimeException(); }
    public  java.lang.Object construct (java.lang.Object[] args) { throw new RuntimeException(); }
  }
  static public  class RatingPickler extends org.apache.spark.mllib.api.python.SerDe.BasePickler<org.apache.spark.mllib.recommendation.Rating> {
    public   RatingPickler () { throw new RuntimeException(); }
    public  void saveState (java.lang.Object obj, java.io.OutputStream out, net.razorvine.pickle.Pickler pickler) { throw new RuntimeException(); }
    public  java.lang.Object construct (java.lang.Object[] args) { throw new RuntimeException(); }
  }
  static public  java.lang.String PYSPARK_PACKAGE () { throw new RuntimeException(); }
  static public  java.lang.String LATIN1 () { throw new RuntimeException(); }
  static public  boolean initialized () { throw new RuntimeException(); }
  static public  void initialize () { throw new RuntimeException(); }
  static public  byte[] dumps (java.lang.Object obj) { throw new RuntimeException(); }
  static public  java.lang.Object loads (byte[] bytes) { throw new RuntimeException(); }
  static public  org.apache.spark.rdd.RDD<scala.Tuple2<java.lang.Object, java.lang.Object>> asTupleRDD (org.apache.spark.rdd.RDD<java.lang.Object[]> rdd) { throw new RuntimeException(); }
  static public  org.apache.spark.rdd.RDD<java.lang.Object[]> fromTuple2RDD (org.apache.spark.rdd.RDD<scala.Tuple2<java.lang.Object, java.lang.Object>> rdd) { throw new RuntimeException(); }
  /**
   * Convert an RDD of Java objects to an RDD of serialized Python objects, that is usable by
   * PySpark.
   */
  static public  org.apache.spark.api.java.JavaRDD<byte[]> javaToPython (org.apache.spark.api.java.JavaRDD<java.lang.Object> jRDD) { throw new RuntimeException(); }
  /**
   * Convert an RDD of serialized Python objects to RDD of objects, that is usable by PySpark.
   */
  static public  org.apache.spark.api.java.JavaRDD<java.lang.Object> pythonToJava (org.apache.spark.api.java.JavaRDD<byte[]> pyRDD, boolean batched) { throw new RuntimeException(); }
}
