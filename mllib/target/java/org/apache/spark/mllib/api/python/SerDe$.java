package org.apache.spark.mllib.api.python;
// no position
/**
 * SerDe utility functions for PythonMLLibAPI.
 */
public  class SerDe$ implements scala.Serializable {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final SerDe$ MODULE$ = null;
  public   SerDe$ () { throw new RuntimeException(); }
  public  java.lang.String PYSPARK_PACKAGE () { throw new RuntimeException(); }
  public  java.lang.String LATIN1 () { throw new RuntimeException(); }
  public  boolean initialized () { throw new RuntimeException(); }
  public  void initialize () { throw new RuntimeException(); }
  public  byte[] dumps (java.lang.Object obj) { throw new RuntimeException(); }
  public  java.lang.Object loads (byte[] bytes) { throw new RuntimeException(); }
  public  org.apache.spark.rdd.RDD<scala.Tuple2<java.lang.Object, java.lang.Object>> asTupleRDD (org.apache.spark.rdd.RDD<java.lang.Object[]> rdd) { throw new RuntimeException(); }
  public  org.apache.spark.rdd.RDD<java.lang.Object[]> fromTuple2RDD (org.apache.spark.rdd.RDD<scala.Tuple2<java.lang.Object, java.lang.Object>> rdd) { throw new RuntimeException(); }
  /**
   * Convert an RDD of Java objects to an RDD of serialized Python objects, that is usable by
   * PySpark.
   */
  public  org.apache.spark.api.java.JavaRDD<byte[]> javaToPython (org.apache.spark.api.java.JavaRDD<java.lang.Object> jRDD) { throw new RuntimeException(); }
  /**
   * Convert an RDD of serialized Python objects to RDD of objects, that is usable by PySpark.
   */
  public  org.apache.spark.api.java.JavaRDD<java.lang.Object> pythonToJava (org.apache.spark.api.java.JavaRDD<byte[]> pyRDD, boolean batched) { throw new RuntimeException(); }
}
