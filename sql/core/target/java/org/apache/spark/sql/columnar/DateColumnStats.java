package org.apache.spark.sql.columnar;
public  class DateColumnStats implements org.apache.spark.sql.columnar.ColumnStats {
  public   DateColumnStats () { throw new RuntimeException(); }
  protected  java.sql.Date upper () { throw new RuntimeException(); }
  protected  java.sql.Date lower () { throw new RuntimeException(); }
  public  void gatherStats (org.apache.spark.sql.catalyst.expressions.Row row, int ordinal) { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.expressions.Row collectedStatistics () { throw new RuntimeException(); }
}
