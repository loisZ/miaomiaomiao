package org.apache.spark.sql.catalyst.types;
/** A Decimal that might have fixed precision and scale, or unlimited values for these */
public  class DecimalType extends org.apache.spark.sql.catalyst.types.FractionalType implements scala.Product, scala.Serializable {
  // no position
  static public  class Fixed$ {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final Fixed$ MODULE$ = null;
    public   Fixed$ () { throw new RuntimeException(); }
    public  scala.Option<scala.Tuple2<java.lang.Object, java.lang.Object>> unapply (org.apache.spark.sql.catalyst.types.DecimalType t) { throw new RuntimeException(); }
  }
  // no position
  static public  class Expression$ {
    /**
     * Static reference to the singleton instance of this Scala object.
     */
    public static final Expression$ MODULE$ = null;
    public   Expression$ () { throw new RuntimeException(); }
    public  scala.Option<scala.Tuple2<java.lang.Object, java.lang.Object>> unapply (org.apache.spark.sql.catalyst.expressions.Expression e) { throw new RuntimeException(); }
  }
  static public  org.apache.spark.sql.catalyst.types.DecimalType Unlimited () { throw new RuntimeException(); }
  static public  org.apache.spark.sql.catalyst.types.DecimalType apply () { throw new RuntimeException(); }
  static public  org.apache.spark.sql.catalyst.types.DecimalType apply (int precision, int scale) { throw new RuntimeException(); }
  static public  boolean unapply (org.apache.spark.sql.catalyst.types.DataType t) { throw new RuntimeException(); }
  static public  boolean unapply (org.apache.spark.sql.catalyst.expressions.Expression e) { throw new RuntimeException(); }
  static public  boolean isFixed (org.apache.spark.sql.catalyst.types.DataType dataType) { throw new RuntimeException(); }
  public  scala.Option<org.apache.spark.sql.catalyst.types.PrecisionInfo> precisionInfo () { throw new RuntimeException(); }
  // not preceding
  public   DecimalType (scala.Option<org.apache.spark.sql.catalyst.types.PrecisionInfo> precisionInfo) { throw new RuntimeException(); }
  public  scala.reflect.api.TypeTags.TypeTag<org.apache.spark.sql.catalyst.types.decimal.Decimal> tag () { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.types.decimal.Decimal.DecimalIsFractional$ numeric () { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.types.decimal.Decimal.DecimalIsFractional$ fractional () { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.types.decimal.Decimal.DecimalIsFractional$ ordering () { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.types.decimal.Decimal.DecimalAsIfIntegral$ asIntegral () { throw new RuntimeException(); }
  public  java.lang.String typeName () { throw new RuntimeException(); }
  public  java.lang.String toString () { throw new RuntimeException(); }
}
