package org.apache.spark.sql.columnar;
// no position
public  class DATE extends org.apache.spark.sql.columnar.NativeColumnType<org.apache.spark.sql.catalyst.types.DateType$> {
  static public  java.sql.Date extract (java.nio.ByteBuffer buffer) { throw new RuntimeException(); }
  static public  void append (java.sql.Date v, java.nio.ByteBuffer buffer) { throw new RuntimeException(); }
  static public  java.sql.Date getField (org.apache.spark.sql.catalyst.expressions.Row row, int ordinal) { throw new RuntimeException(); }
  static public  void setField (org.apache.spark.sql.catalyst.expressions.MutableRow row, int ordinal, java.sql.Date value) { throw new RuntimeException(); }
}
