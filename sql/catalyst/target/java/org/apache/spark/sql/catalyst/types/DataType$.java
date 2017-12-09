package org.apache.spark.sql.catalyst.types;
// no position
public  class DataType$ {
  /**
   * Static reference to the singleton instance of this Scala object.
   */
  public static final DataType$ MODULE$ = null;
  public   DataType$ () { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.types.DataType fromJson (java.lang.String json) { throw new RuntimeException(); }
  private  org.apache.spark.sql.catalyst.types.DataType parseDataType (org.json4s.JsonAST.JValue json) { throw new RuntimeException(); }
  private  org.apache.spark.sql.catalyst.types.StructField parseStructField (org.json4s.JsonAST.JValue json) { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.types.DataType fromCaseClassString (java.lang.String string) { throw new RuntimeException(); }
  protected  void buildFormattedString (org.apache.spark.sql.catalyst.types.DataType dataType, java.lang.String prefix, scala.collection.mutable.StringBuilder builder) { throw new RuntimeException(); }
  /**
   * Compares two types, ignoring nullability of ArrayType, MapType, StructType.
   */
  public  boolean equalsIgnoreNullability (org.apache.spark.sql.catalyst.types.DataType left, org.apache.spark.sql.catalyst.types.DataType right) { throw new RuntimeException(); }
}
