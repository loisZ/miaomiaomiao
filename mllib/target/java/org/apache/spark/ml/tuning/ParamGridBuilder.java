package org.apache.spark.ml.tuning;
/**
 * :: AlphaComponent ::
 * Builder for a param grid used in grid search-based model selection.
 */
public  class ParamGridBuilder {
  /**
   * Sets the given parameters in this grid to fixed values.
   */
  public  org.apache.spark.ml.tuning.ParamGridBuilder baseOn (org.apache.spark.ml.param.ParamPair<?>... paramPairs) { throw new RuntimeException(); }
  // not preceding
  public   ParamGridBuilder () { throw new RuntimeException(); }
  private  scala.collection.mutable.Map<org.apache.spark.ml.param.Param<?>, scala.collection.Iterable<?>> paramGrid () { throw new RuntimeException(); }
  /**
   * Sets the given parameters in this grid to fixed values.
   */
  public  org.apache.spark.ml.tuning.ParamGridBuilder baseOn (org.apache.spark.ml.param.ParamMap paramMap) { throw new RuntimeException(); }
  /**
   * Sets the given parameters in this grid to fixed values.
   */
  public  org.apache.spark.ml.tuning.ParamGridBuilder baseOn (scala.collection.Seq<org.apache.spark.ml.param.ParamPair<?>> paramPairs) { throw new RuntimeException(); }
  /**
   * Adds a param with multiple values (overwrites if the input param exists).
   */
  public <T extends java.lang.Object> org.apache.spark.ml.tuning.ParamGridBuilder addGrid (org.apache.spark.ml.param.Param<T> param, scala.collection.Iterable<T> values) { throw new RuntimeException(); }
  /**
   * Adds a double param with multiple values.
   */
  public  org.apache.spark.ml.tuning.ParamGridBuilder addGrid (org.apache.spark.ml.param.DoubleParam param, double[] values) { throw new RuntimeException(); }
  /**
   * Adds a int param with multiple values.
   */
  public  org.apache.spark.ml.tuning.ParamGridBuilder addGrid (org.apache.spark.ml.param.IntParam param, int[] values) { throw new RuntimeException(); }
  /**
   * Adds a float param with multiple values.
   */
  public  org.apache.spark.ml.tuning.ParamGridBuilder addGrid (org.apache.spark.ml.param.FloatParam param, float[] values) { throw new RuntimeException(); }
  /**
   * Adds a long param with multiple values.
   */
  public  org.apache.spark.ml.tuning.ParamGridBuilder addGrid (org.apache.spark.ml.param.LongParam param, long[] values) { throw new RuntimeException(); }
  /**
   * Adds a boolean param with true and false.
   */
  public  org.apache.spark.ml.tuning.ParamGridBuilder addGrid (org.apache.spark.ml.param.BooleanParam param) { throw new RuntimeException(); }
  /**
   * Builds and returns all combinations of parameters specified by the param grid.
   */
  public  org.apache.spark.ml.param.ParamMap[] build () { throw new RuntimeException(); }
}
