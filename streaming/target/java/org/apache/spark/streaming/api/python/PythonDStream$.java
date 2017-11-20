package org.apache.spark.streaming.api.python;
// no position
/**
 * Helper functions, which are called from Python via Py4J.
 */
public  class PythonDStream$ implements scala.Serializable {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final PythonDStream$ MODULE$ = null;
  public   PythonDStream$ () { throw new RuntimeException(); }
  /**
   * can not access PythonTransformFunctionSerializer.register() via Py4j
   * Py4JError: PythonTransformFunctionSerializerregister does not exist in the JVM
   */
  public  void registerSerializer (org.apache.spark.streaming.api.python.PythonTransformFunctionSerializer ser) { throw new RuntimeException(); }
  /**
   * Update the port of callback client to <code>port</code>
   */
  public  void updatePythonGatewayPort (py4j.GatewayServer gws, int port) { throw new RuntimeException(); }
  /**
   * helper function for DStream.foreachRDD(),
   * cannot be <code>foreachRDD</code>, it will confusing py4j
   */
  public  void callForeachRDD (org.apache.spark.streaming.api.java.JavaDStream<byte[]> jdstream, org.apache.spark.streaming.api.python.PythonTransformFunction pfunc) { throw new RuntimeException(); }
  /**
   * convert list of RDD into queue of RDDs, for ssc.queueStream()
   */
  public  java.util.Queue<org.apache.spark.api.java.JavaRDD<byte[]>> toRDDQueue (java.util.ArrayList<org.apache.spark.api.java.JavaRDD<byte[]>> rdds) { throw new RuntimeException(); }
}
