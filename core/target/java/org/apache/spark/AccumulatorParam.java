package org.apache.spark;
/**
 * A simpler version of {@link org.apache.spark.AccumulableParam} where the only data type you can add
 * in is the same type as the accumulated value. An implicit AccumulatorParam object needs to be
 * available when you create Accumulators of a specific type.
 * <p>
 * @tparam T type of value to accumulate
 */
public  interface AccumulatorParam<T extends java.lang.Object> extends org.apache.spark.AccumulableParam<T, T> {
  // no position
  static public  class DoubleAccumulatorParam$ implements org.apache.spark.AccumulatorParam<java.lang.Object> {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final DoubleAccumulatorParam$ MODULE$ = null;
    public   DoubleAccumulatorParam$ () { throw new RuntimeException(); }
    public  double addInPlace (double t1, double t2) { throw new RuntimeException(); }
    public  double zero (double initialValue) { throw new RuntimeException(); }
  }
  // no position
  static public  class IntAccumulatorParam$ implements org.apache.spark.AccumulatorParam<java.lang.Object> {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final IntAccumulatorParam$ MODULE$ = null;
    public   IntAccumulatorParam$ () { throw new RuntimeException(); }
    public  int addInPlace (int t1, int t2) { throw new RuntimeException(); }
    public  int zero (int initialValue) { throw new RuntimeException(); }
  }
  // no position
  static public  class LongAccumulatorParam$ implements org.apache.spark.AccumulatorParam<java.lang.Object> {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final LongAccumulatorParam$ MODULE$ = null;
    public   LongAccumulatorParam$ () { throw new RuntimeException(); }
    public  long addInPlace (long t1, long t2) { throw new RuntimeException(); }
    public  long zero (long initialValue) { throw new RuntimeException(); }
  }
  // no position
  static public  class FloatAccumulatorParam$ implements org.apache.spark.AccumulatorParam<java.lang.Object> {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final FloatAccumulatorParam$ MODULE$ = null;
    public   FloatAccumulatorParam$ () { throw new RuntimeException(); }
    public  float addInPlace (float t1, float t2) { throw new RuntimeException(); }
    public  float zero (float initialValue) { throw new RuntimeException(); }
  }
  public  T addAccumulator (T t1, T t2) ;
}
