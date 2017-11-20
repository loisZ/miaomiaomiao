package org.apache.spark.streaming.api.python;
/**
 * Base class for PythonDStream with some common methods
 */
public abstract class PythonDStream extends org.apache.spark.streaming.dstream.DStream<byte[]> {
  /**
   * can not access PythonTransformFunctionSerializer.register() via Py4j
   * Py4JError: PythonTransformFunctionSerializerregister does not exist in the JVM
   */
  static public  void registerSerializer (org.apache.spark.streaming.api.python.PythonTransformFunctionSerializer ser) { throw new RuntimeException(); }
  /**
   * Update the port of callback client to <code>port</code>
   */
  static public  void updatePythonGatewayPort (py4j.GatewayServer gws, int port) { throw new RuntimeException(); }
  /**
   * helper function for DStream.foreachRDD(),
   * cannot be <code>foreachRDD</code>, it will confusing py4j
   */
  static public  void callForeachRDD (org.apache.spark.streaming.api.java.JavaDStream<byte[]> jdstream, org.apache.spark.streaming.api.python.PythonTransformFunction pfunc) { throw new RuntimeException(); }
  /**
   * convert list of RDD into queue of RDDs, for ssc.queueStream()
   */
  static public  java.util.Queue<org.apache.spark.api.java.JavaRDD<byte[]>> toRDDQueue (java.util.ArrayList<org.apache.spark.api.java.JavaRDD<byte[]>> rdds) { throw new RuntimeException(); }
  public   PythonDStream (org.apache.spark.streaming.dstream.DStream<?> parent, org.apache.spark.streaming.api.python.PythonTransformFunction pfunc) { throw new RuntimeException(); }
  public  org.apache.spark.streaming.api.python.TransformFunction func () { throw new RuntimeException(); }
  public  scala.collection.immutable.List<org.apache.spark.streaming.dstream.DStream<java.lang.Object>> dependencies () { throw new RuntimeException(); }
  public  org.apache.spark.streaming.Duration slideDuration () { throw new RuntimeException(); }
  public  org.apache.spark.streaming.api.java.JavaDStream<byte[]> asJavaDStream () { throw new RuntimeException(); }
}
