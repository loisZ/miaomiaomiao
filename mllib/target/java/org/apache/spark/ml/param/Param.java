package org.apache.spark.ml.param;
/**
 * :: AlphaComponent ::
 * A param with self-contained documentation and optionally default value. Primitive-typed param
 * should use the specialized versions, which are more friendly to Java users.
 * <p>
 * @param parent parent object
 * @param name param name
 * @param doc documentation
 * @tparam T param value type
 */
public  class Param<T extends java.lang.Object> implements scala.Serializable {
  public  org.apache.spark.ml.param.Params parent () { throw new RuntimeException(); }
  public  java.lang.String name () { throw new RuntimeException(); }
  public  java.lang.String doc () { throw new RuntimeException(); }
  public  scala.Option<T> defaultValue () { throw new RuntimeException(); }
  // not preceding
  public   Param (org.apache.spark.ml.param.Params parent, java.lang.String name, java.lang.String doc, scala.Option<T> defaultValue) { throw new RuntimeException(); }
  /**
   * Creates a param pair with the given value (for Java).
   */
  public  org.apache.spark.ml.param.ParamPair<T> w (T value) { throw new RuntimeException(); }
  public  java.lang.String toString () { throw new RuntimeException(); }
}
