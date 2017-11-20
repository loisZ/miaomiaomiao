package org.apache.spark.streaming.api.java;
/**
 * Factory interface for creating a new JavaStreamingContext
 */
public  interface JavaStreamingContextFactory {
  public  org.apache.spark.streaming.api.java.JavaStreamingContext create () ;
}
