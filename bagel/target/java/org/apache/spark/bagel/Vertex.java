package org.apache.spark.bagel;
/**
 * Represents a Bagel vertex.
 * <p>
 * Subclasses may store state along with each vertex and must
 * inherit from java.io.Serializable or scala.Serializable.
 */
public  interface Vertex {
  public  boolean active () ;
}
