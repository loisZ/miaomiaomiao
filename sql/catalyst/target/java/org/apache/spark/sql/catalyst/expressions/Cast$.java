package org.apache.spark.sql.catalyst.expressions;
// no position
/**
 * Change the precision / scale in a given decimal to those set in <code>decimalType</code> (if any),
 * returning null if it overflows or modifying <code>value</code> in-place and returning it if successful.
 * <p>
 * NOTE: this modifies <code>value</code> in-place, so don't call it on external data.
 */
public  class Cast$ implements scala.Serializable {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final Cast$ MODULE$ = null;
  public   Cast$ () { throw new RuntimeException(); }
  public  java.lang.ThreadLocal<java.text.DateFormat> threadLocalDateFormat () { throw new RuntimeException(); }
  public  java.lang.ThreadLocal<java.text.DateFormat> threadLocalTimestampFormat () { throw new RuntimeException(); }
}
