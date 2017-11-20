package org.apache.spark.api.python;
// no position
/** Utilities for serialization / deserialization between Python and Java, using Pickle. */
public  class SerDeUtil implements org.apache.spark.Logging {
  static public  class ArrayConstructor extends net.razorvine.pickle.objects.ArrayConstructor {
    public   ArrayConstructor () { throw new RuntimeException(); }
    public  scala.collection.immutable.Map<java.lang.Object, java.lang.Object> machineCodes () { throw new RuntimeException(); }
    public  java.lang.Object construct (java.lang.Object[] args) { throw new RuntimeException(); }
  }
  /**
   * Choose batch size based on size of objects
   */
  static public  class AutoBatchedPickler implements scala.collection.Iterator<byte[]> {
    public   AutoBatchedPickler (scala.collection.Iterator<java.lang.Object> iter) { throw new RuntimeException(); }
    private  net.razorvine.pickle.Pickler pickle () { throw new RuntimeException(); }
    private  int batch () { throw new RuntimeException(); }
    private  scala.collection.mutable.ArrayBuffer<java.lang.Object> buffer () { throw new RuntimeException(); }
    public  boolean hasNext () { throw new RuntimeException(); }
    public  byte[] next () { throw new RuntimeException(); }
  }
  static private  boolean initialized () { throw new RuntimeException(); }
  static public  void initialize () { throw new RuntimeException(); }
  /**
   * Convert an RDD of Java objects to Array (no recursive conversions).
   * It is only used by pyspark.sql.
   */
  static public  org.apache.spark.api.java.JavaRDD<java.lang.Object> toJavaArray (org.apache.spark.api.java.JavaRDD<java.lang.Object> jrdd) { throw new RuntimeException(); }
  /**
   * Convert an RDD of Java objects to an RDD of serialized Python objects, that is usable by
   * PySpark.
   */
  static public  org.apache.spark.api.java.JavaRDD<byte[]> javaToPython (org.apache.spark.api.java.JavaRDD<?> jRDD) { throw new RuntimeException(); }
  /**
   * Convert an RDD of serialized Python objects to RDD of objects, that is usable by PySpark.
   */
  static public  org.apache.spark.api.java.JavaRDD<java.lang.Object> pythonToJava (org.apache.spark.api.java.JavaRDD<byte[]> pyRDD, boolean batched) { throw new RuntimeException(); }
  static private  scala.Tuple2<java.lang.Object, java.lang.Object> checkPickle (scala.Tuple2<java.lang.Object, java.lang.Object> t) { throw new RuntimeException(); }
  /**
   * Convert an RDD of key-value pairs to an RDD of serialized Python objects, that is usable
   * by PySpark. By default, if serialization fails, toString is called and the string
   * representation is serialized
   */
  static public  org.apache.spark.rdd.RDD<byte[]> pairRDDToPython (org.apache.spark.rdd.RDD<scala.Tuple2<java.lang.Object, java.lang.Object>> rdd, int batchSize) { throw new RuntimeException(); }
  /**
   * Convert an RDD of serialized Python tuple (K, V) to RDD[(K, V)].
   */
  static public <K extends java.lang.Object, V extends java.lang.Object> org.apache.spark.rdd.RDD<scala.Tuple2<K, V>> pythonToPairRDD (org.apache.spark.rdd.RDD<byte[]> pyRDD, boolean batched) { throw new RuntimeException(); }
}
