package org.apache.spark.ml;
/**
 * Object with a unique id.
 */
public  interface Identifiable extends scala.Serializable {
  /**
   * A unique id for the object. The default implementation concatenates the class name, "-", and 8
   * random hex chars.
   */
  public  java.lang.String uid () ;
}
