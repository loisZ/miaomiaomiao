package org.apache.spark.sql.catalyst.expressions;
/** Cast the child expression to the target data type. */
public  class Cast extends org.apache.spark.sql.catalyst.expressions.UnaryExpression implements org.apache.spark.Logging, scala.Product, scala.Serializable {
  static public  java.lang.ThreadLocal<java.text.DateFormat> threadLocalDateFormat () { throw new RuntimeException(); }
  static public  java.lang.ThreadLocal<java.text.DateFormat> threadLocalTimestampFormat () { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.expressions.Expression child () { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.types.DataType dataType () { throw new RuntimeException(); }
  // not preceding
  public   Cast (org.apache.spark.sql.catalyst.expressions.Expression child, org.apache.spark.sql.catalyst.types.DataType dataType) { throw new RuntimeException(); }
  public  boolean resolved () { throw new RuntimeException(); }
  public  boolean foldable () { throw new RuntimeException(); }
  public  boolean nullable () { throw new RuntimeException(); }
  private  boolean forceNullable (org.apache.spark.sql.catalyst.types.DataType from, org.apache.spark.sql.catalyst.types.DataType to) { throw new RuntimeException(); }
  private  boolean resolvableNullability (boolean from, boolean to) { throw new RuntimeException(); }
  private  boolean resolve (org.apache.spark.sql.catalyst.types.DataType from, org.apache.spark.sql.catalyst.types.DataType to) { throw new RuntimeException(); }
  public  java.lang.String toString () { throw new RuntimeException(); }
  private <T extends java.lang.Object> Object buildCast (Object a, scala.Function1<T, java.lang.Object> func) { throw new RuntimeException(); }
  private  scala.Function1<java.lang.Object, java.lang.Object> castToString (org.apache.spark.sql.catalyst.types.DataType from) { throw new RuntimeException(); }
  private  scala.Function1<java.lang.Object, java.lang.Object> castToBinary (org.apache.spark.sql.catalyst.types.DataType from) { throw new RuntimeException(); }
  private  scala.Function1<java.lang.Object, java.lang.Object> castToBoolean (org.apache.spark.sql.catalyst.types.DataType from) { throw new RuntimeException(); }
  private  scala.Function1<java.lang.Object, java.lang.Object> castToTimestamp (org.apache.spark.sql.catalyst.types.DataType from) { throw new RuntimeException(); }
  private  java.sql.Timestamp decimalToTimestamp (org.apache.spark.sql.catalyst.types.decimal.Decimal d) { throw new RuntimeException(); }
  private  long timestampToLong (java.sql.Timestamp ts) { throw new RuntimeException(); }
  private  double timestampToDouble (java.sql.Timestamp ts) { throw new RuntimeException(); }
  private  java.lang.String timestampToString (java.sql.Timestamp ts) { throw new RuntimeException(); }
  private  java.lang.String timestampToDateString (java.sql.Timestamp ts) { throw new RuntimeException(); }
  private  scala.Function1<java.lang.Object, java.lang.Object> castToDate (org.apache.spark.sql.catalyst.types.DataType from) { throw new RuntimeException(); }
  private  scala.Null dateToLong (java.sql.Date d) { throw new RuntimeException(); }
  private  scala.Null dateToDouble (java.sql.Date d) { throw new RuntimeException(); }
  private  java.lang.String dateToString (java.sql.Date d) { throw new RuntimeException(); }
  private  scala.Function1<java.lang.Object, java.lang.Object> castToLong (org.apache.spark.sql.catalyst.types.DataType from) { throw new RuntimeException(); }
  private  scala.Function1<java.lang.Object, java.lang.Object> castToInt (org.apache.spark.sql.catalyst.types.DataType from) { throw new RuntimeException(); }
  private  scala.Function1<java.lang.Object, java.lang.Object> castToShort (org.apache.spark.sql.catalyst.types.DataType from) { throw new RuntimeException(); }
  private  scala.Function1<java.lang.Object, java.lang.Object> castToByte (org.apache.spark.sql.catalyst.types.DataType from) { throw new RuntimeException(); }
  /**
   * Change the precision / scale in a given decimal to those set in <code>decimalType</code> (if any),
   * returning null if it overflows or modifying <code>value</code> in-place and returning it if successful.
   * <p>
   * NOTE: this modifies <code>value</code> in-place, so don't call it on external data.
   */
  private  org.apache.spark.sql.catalyst.types.decimal.Decimal changePrecision (org.apache.spark.sql.catalyst.types.decimal.Decimal value, org.apache.spark.sql.catalyst.types.DecimalType decimalType) { throw new RuntimeException(); }
  private  scala.Function1<java.lang.Object, java.lang.Object> castToDecimal (org.apache.spark.sql.catalyst.types.DataType from, org.apache.spark.sql.catalyst.types.DecimalType target) { throw new RuntimeException(); }
  private  scala.Function1<java.lang.Object, java.lang.Object> castToDouble (org.apache.spark.sql.catalyst.types.DataType from) { throw new RuntimeException(); }
  private  scala.Function1<java.lang.Object, java.lang.Object> castToFloat (org.apache.spark.sql.catalyst.types.DataType from) { throw new RuntimeException(); }
  private  scala.Function1<java.lang.Object, java.lang.Object> castArray (org.apache.spark.sql.catalyst.types.ArrayType from, org.apache.spark.sql.catalyst.types.ArrayType to) { throw new RuntimeException(); }
  private  scala.Function1<java.lang.Object, java.lang.Object> castMap (org.apache.spark.sql.catalyst.types.MapType from, org.apache.spark.sql.catalyst.types.MapType to) { throw new RuntimeException(); }
  private  scala.Function1<java.lang.Object, java.lang.Object> castStruct (org.apache.spark.sql.catalyst.types.StructType from, org.apache.spark.sql.catalyst.types.StructType to) { throw new RuntimeException(); }
  private  scala.Function1<java.lang.Object, java.lang.Object> cast (org.apache.spark.sql.catalyst.types.DataType from, org.apache.spark.sql.catalyst.types.DataType to) { throw new RuntimeException(); }
  private  scala.Function1<java.lang.Object, java.lang.Object> cast () { throw new RuntimeException(); }
  public  Object eval (org.apache.spark.sql.catalyst.expressions.Row input) { throw new RuntimeException(); }
}
