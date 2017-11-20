package org.apache.spark.streaming.api.python;
/**
 * Interface for Python Serializer to serialize PythonTransformFunction
 */
public  interface PythonTransformFunctionSerializer {
  public  byte[] dumps (java.lang.String id) ;
  public  org.apache.spark.streaming.api.python.PythonTransformFunction loads (byte[] bytes) ;
}
