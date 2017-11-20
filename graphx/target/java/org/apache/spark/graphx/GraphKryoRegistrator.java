package org.apache.spark.graphx;
/**
 * Registers GraphX classes with Kryo for improved performance.
 */
public  class GraphKryoRegistrator implements org.apache.spark.serializer.KryoRegistrator {
  public   GraphKryoRegistrator () { throw new RuntimeException(); }
  public  void registerClasses (com.esotericsoftware.kryo.Kryo kryo) { throw new RuntimeException(); }
}
