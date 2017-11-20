package org.apache.spark.ml.param;
/**
 * :: AlphaComponent ::
 * A param to value map.
 */
public  class ParamMap implements scala.Serializable {
  /**
   * Returns an empty param map.
   */
  static public  org.apache.spark.ml.param.ParamMap empty () { throw new RuntimeException(); }
  /**
   * Puts a list of param pairs (overwrites if the input params exists).
   */
  public  org.apache.spark.ml.param.ParamMap put (org.apache.spark.ml.param.ParamPair<?>... paramPairs) { throw new RuntimeException(); }
  // not preceding
  private  scala.collection.mutable.Map<org.apache.spark.ml.param.Param<java.lang.Object>, java.lang.Object> map () { throw new RuntimeException(); }
  // not preceding
  public   ParamMap (scala.collection.mutable.Map<org.apache.spark.ml.param.Param<java.lang.Object>, java.lang.Object> map) { throw new RuntimeException(); }
  /**
   * Creates an empty param map.
   */
  public   ParamMap () { throw new RuntimeException(); }
  /**
   * Puts a (param, value) pair (overwrites if the input param exists).
   */
  public <T extends java.lang.Object> org.apache.spark.ml.param.ParamMap put (org.apache.spark.ml.param.Param<T> param, T value) { throw new RuntimeException(); }
  /**
   * Puts a list of param pairs (overwrites if the input params exists).
   */
  public  org.apache.spark.ml.param.ParamMap put (scala.collection.Seq<org.apache.spark.ml.param.ParamPair<?>> paramPairs) { throw new RuntimeException(); }
  /**
   * Optionally returns the value associated with a param or its default.
   */
  public <T extends java.lang.Object> scala.Option<T> get (org.apache.spark.ml.param.Param<T> param) { throw new RuntimeException(); }
  /**
   * Gets the value of the input param or its default value if it does not exist.
   * Raises a NoSuchElementException if there is no value associated with the input param.
   */
  public <T extends java.lang.Object> T apply (org.apache.spark.ml.param.Param<T> param) { throw new RuntimeException(); }
  /**
   * Checks whether a parameter is explicitly specified.
   */
  public  boolean contains (org.apache.spark.ml.param.Param<?> param) { throw new RuntimeException(); }
  /**
   * Filters this param map for the given parent.
   */
  public  org.apache.spark.ml.param.ParamMap filter (org.apache.spark.ml.param.Params parent) { throw new RuntimeException(); }
  /**
   * Make a copy of this param map.
   */
  public  org.apache.spark.ml.param.ParamMap copy () { throw new RuntimeException(); }
  public  java.lang.String toString () { throw new RuntimeException(); }
  /**
   * Converts this param map to a sequence of param pairs.
   */
  public  scala.collection.Seq<org.apache.spark.ml.param.ParamPair<?>> toSeq () { throw new RuntimeException(); }
}
