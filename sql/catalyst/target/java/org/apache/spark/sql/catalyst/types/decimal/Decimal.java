package org.apache.spark.sql.catalyst.types.decimal;
/**
 * A mutable implementation of BigDecimal that can hold a Long if values are small enough.
 * <p>
 * The semantics of the fields are as follows:
 * - _precision and _scale represent the SQL precision and scale we are looking for
 * - If decimalVal is set, it represents the whole decimal value
 * - Otherwise, the decimal value is longVal / (10 ** _scale)
 */
public final class Decimal implements scala.math.Ordered<org.apache.spark.sql.catalyst.types.decimal.Decimal>, scala.Serializable {
  // no position
  /** A {@link scala.math.Fractional} evidence parameter for Decimals. */
  static public  class DecimalIsFractional$ implements org.apache.spark.sql.catalyst.types.decimal.Decimal.DecimalIsConflicted, scala.math.Fractional<org.apache.spark.sql.catalyst.types.decimal.Decimal> {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final DecimalIsFractional$ MODULE$ = null;
    public   DecimalIsFractional$ () { throw new RuntimeException(); }
    public  org.apache.spark.sql.catalyst.types.decimal.Decimal div (org.apache.spark.sql.catalyst.types.decimal.Decimal x, org.apache.spark.sql.catalyst.types.decimal.Decimal y) { throw new RuntimeException(); }
  }
  // no position
  /** A {@link scala.math.Integral} evidence parameter for Decimals. */
  static public  class DecimalAsIfIntegral$ implements org.apache.spark.sql.catalyst.types.decimal.Decimal.DecimalIsConflicted, scala.math.Integral<org.apache.spark.sql.catalyst.types.decimal.Decimal> {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final DecimalAsIfIntegral$ MODULE$ = null;
    public   DecimalAsIfIntegral$ () { throw new RuntimeException(); }
    public  org.apache.spark.sql.catalyst.types.decimal.Decimal quot (org.apache.spark.sql.catalyst.types.decimal.Decimal x, org.apache.spark.sql.catalyst.types.decimal.Decimal y) { throw new RuntimeException(); }
    public  org.apache.spark.sql.catalyst.types.decimal.Decimal rem (org.apache.spark.sql.catalyst.types.decimal.Decimal x, org.apache.spark.sql.catalyst.types.decimal.Decimal y) { throw new RuntimeException(); }
  }
  /** Common methods for Decimal evidence parameters */
  static public  interface DecimalIsConflicted extends scala.math.Numeric<org.apache.spark.sql.catalyst.types.decimal.Decimal> {
    public  org.apache.spark.sql.catalyst.types.decimal.Decimal plus (org.apache.spark.sql.catalyst.types.decimal.Decimal x, org.apache.spark.sql.catalyst.types.decimal.Decimal y) ;
    public  org.apache.spark.sql.catalyst.types.decimal.Decimal times (org.apache.spark.sql.catalyst.types.decimal.Decimal x, org.apache.spark.sql.catalyst.types.decimal.Decimal y) ;
    public  org.apache.spark.sql.catalyst.types.decimal.Decimal minus (org.apache.spark.sql.catalyst.types.decimal.Decimal x, org.apache.spark.sql.catalyst.types.decimal.Decimal y) ;
    public  org.apache.spark.sql.catalyst.types.decimal.Decimal negate (org.apache.spark.sql.catalyst.types.decimal.Decimal x) ;
    public  double toDouble (org.apache.spark.sql.catalyst.types.decimal.Decimal x) ;
    public  float toFloat (org.apache.spark.sql.catalyst.types.decimal.Decimal x) ;
    public  int toInt (org.apache.spark.sql.catalyst.types.decimal.Decimal x) ;
    public  long toLong (org.apache.spark.sql.catalyst.types.decimal.Decimal x) ;
    public  org.apache.spark.sql.catalyst.types.decimal.Decimal fromInt (int x) ;
    public  int compare (org.apache.spark.sql.catalyst.types.decimal.Decimal x, org.apache.spark.sql.catalyst.types.decimal.Decimal y) ;
  }
  static private  scala.Enumeration.Value ROUNDING_MODE () { throw new RuntimeException(); }
  /** Maximum number of decimal digits a Long can represent */
  static public  int MAX_LONG_DIGITS () { throw new RuntimeException(); }
  static private  long[] POW_10 () { throw new RuntimeException(); }
  static private  scala.math.BigDecimal BIG_DEC_ZERO () { throw new RuntimeException(); }
  static public  org.apache.spark.sql.catalyst.types.decimal.Decimal apply (double value) { throw new RuntimeException(); }
  static public  org.apache.spark.sql.catalyst.types.decimal.Decimal apply (long value) { throw new RuntimeException(); }
  static public  org.apache.spark.sql.catalyst.types.decimal.Decimal apply (int value) { throw new RuntimeException(); }
  static public  org.apache.spark.sql.catalyst.types.decimal.Decimal apply (scala.math.BigDecimal value) { throw new RuntimeException(); }
  static public  org.apache.spark.sql.catalyst.types.decimal.Decimal apply (scala.math.BigDecimal value, int precision, int scale) { throw new RuntimeException(); }
  static public  org.apache.spark.sql.catalyst.types.decimal.Decimal apply (long unscaled, int precision, int scale) { throw new RuntimeException(); }
  static public  org.apache.spark.sql.catalyst.types.decimal.Decimal apply (java.lang.String value) { throw new RuntimeException(); }
  public   Decimal () { throw new RuntimeException(); }
  private  scala.math.BigDecimal decimalVal () { throw new RuntimeException(); }
  private  long longVal () { throw new RuntimeException(); }
  private  int _precision () { throw new RuntimeException(); }
  private  int _scale () { throw new RuntimeException(); }
  public  int precision () { throw new RuntimeException(); }
  public  int scale () { throw new RuntimeException(); }
  /**
   * Set this Decimal to the given Long. Will have precision 20 and scale 0.
   */
  public  org.apache.spark.sql.catalyst.types.decimal.Decimal set (long longVal) { throw new RuntimeException(); }
  /**
   * Set this Decimal to the given Int. Will have precision 10 and scale 0.
   */
  public  org.apache.spark.sql.catalyst.types.decimal.Decimal set (int intVal) { throw new RuntimeException(); }
  /**
   * Set this Decimal to the given unscaled Long, with a given precision and scale.
   */
  public  org.apache.spark.sql.catalyst.types.decimal.Decimal set (long unscaled, int precision, int scale) { throw new RuntimeException(); }
  /**
   * Set this Decimal to the given unscaled Long, with a given precision and scale,
   * and return it, or return null if it cannot be set due to overflow.
   */
  public  org.apache.spark.sql.catalyst.types.decimal.Decimal setOrNull (long unscaled, int precision, int scale) { throw new RuntimeException(); }
  /**
   * Set this Decimal to the given BigDecimal value, with a given precision and scale.
   */
  public  org.apache.spark.sql.catalyst.types.decimal.Decimal set (scala.math.BigDecimal decimal, int precision, int scale) { throw new RuntimeException(); }
  /**
   * Set this Decimal to the given BigDecimal value, inheriting its precision and scale.
   */
  public  org.apache.spark.sql.catalyst.types.decimal.Decimal set (scala.math.BigDecimal decimal) { throw new RuntimeException(); }
  /**
   * Set this Decimal to the given Decimal value.
   */
  public  org.apache.spark.sql.catalyst.types.decimal.Decimal set (org.apache.spark.sql.catalyst.types.decimal.Decimal decimal) { throw new RuntimeException(); }
  public  scala.math.BigDecimal toBigDecimal () { throw new RuntimeException(); }
  public  long toUnscaledLong () { throw new RuntimeException(); }
  public  java.lang.String toString () { throw new RuntimeException(); }
  public  java.lang.String toDebugString () { throw new RuntimeException(); }
  public  double toDouble () { throw new RuntimeException(); }
  public  float toFloat () { throw new RuntimeException(); }
  public  long toLong () { throw new RuntimeException(); }
  public  int toInt () { throw new RuntimeException(); }
  public  short toShort () { throw new RuntimeException(); }
  public  byte toByte () { throw new RuntimeException(); }
  /**
   * Update precision and scale while keeping our value the same, and return true if successful.
   * <p>
   * @return true if successful, false if overflow would occur
   */
  public  boolean changePrecision (int precision, int scale) { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.types.decimal.Decimal clone () { throw new RuntimeException(); }
  public  int compare (org.apache.spark.sql.catalyst.types.decimal.Decimal other) { throw new RuntimeException(); }
  public  boolean equals (Object other) { throw new RuntimeException(); }
  public  int hashCode () { throw new RuntimeException(); }
  public  boolean isZero () { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.types.decimal.Decimal remainder (org.apache.spark.sql.catalyst.types.decimal.Decimal that) { throw new RuntimeException(); }
}
