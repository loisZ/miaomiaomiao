package org.apache.spark.streaming.api.python;
/**
 * Interface for Python callback function which is used to transform RDDs
 */
public  interface PythonTransformFunction {
  public  org.apache.spark.api.java.JavaRDD<byte[]> call (long time, java.util.List<?> rdds) ;
}
