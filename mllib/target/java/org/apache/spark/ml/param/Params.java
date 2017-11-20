package org.apache.spark.ml.param;
/**
 * :: AlphaComponent ::
 * Trait for components that take parameters. This also provides an internal param map to store
 * parameter values attached to the instance.
 */
public  interface Params extends org.apache.spark.ml.Identifiable, scala.Serializable {
  /** Returns all params. */
  public  org.apache.spark.ml.param.Param<?>[] params () ;
  /**
   * Validates parameter values stored internally plus the input parameter map.
   * Raises an exception if any parameter is invalid.
   */
  public  void validate (org.apache.spark.ml.param.ParamMap paramMap) ;
  /**
   * Validates parameter values stored internally.
   * Raise an exception if any parameter value is invalid.
   */
  public  void validate () ;
  /**
   * Returns the documentation of all params.
   */
  public  java.lang.String explainParams () ;
  /** Checks whether a param is explicitly set. */
  public  boolean isSet (org.apache.spark.ml.param.Param<?> param) ;
  /** Gets a param by its name. */
  public  org.apache.spark.ml.param.Param<java.lang.Object> getParam (java.lang.String paramName) ;
  /**
   * Sets a parameter in the embedded param map.
   */
  public <T extends java.lang.Object> org.apache.spark.ml.param.Params set (org.apache.spark.ml.param.Param<T> param, T value) ;
  /**
   * Gets the value of a parameter in the embedded param map.
   */
  public <T extends java.lang.Object> T get (org.apache.spark.ml.param.Param<T> param) ;
  /**
   * Internal param map.
   */
  public  org.apache.spark.ml.param.ParamMap paramMap () ;
}
