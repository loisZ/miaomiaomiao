package org.apache.spark.sql.catalyst.analysis;
// no position
public  class HiveTypeCoercion$ {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final HiveTypeCoercion$ MODULE$ = null;
  public   HiveTypeCoercion$ () { throw new RuntimeException(); }
  private  scala.collection.Seq<org.apache.spark.sql.catalyst.types.NumericType> numericPrecedence () { throw new RuntimeException(); }
  /**
   * Find the tightest common type of two types that might be used in a binary expression.
   * This handles all numeric types except fixed-precision decimals interacting with each other or
   * with primitive types, because in that case the precision and scale of the result depends on
   * the operation. Those rules are implemented in {@link HiveTypeCoercion.DecimalPrecision}.
   */
  public  scala.Option<org.apache.spark.sql.catalyst.types.DataType> findTightestCommonType (org.apache.spark.sql.catalyst.types.DataType t1, org.apache.spark.sql.catalyst.types.DataType t2) { throw new RuntimeException(); }
}
