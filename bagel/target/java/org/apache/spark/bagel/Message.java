package org.apache.spark.bagel;
/**
 * Represents a Bagel message to a target vertex.
 * <p>
 * Subclasses may contain a payload to deliver to the target vertex
 * and must inherit from java.io.Serializable or scala.Serializable.
 */
public  interface Message<K extends java.lang.Object> {
  public  K targetId () ;
}
