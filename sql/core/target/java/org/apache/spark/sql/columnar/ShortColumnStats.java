package org.apache.spark.sql.columnar;
public  class ShortColumnStats implements org.apache.spark.sql.columnar.ColumnStats {
  public   ShortColumnStats () { throw new RuntimeException(); }
  protected  short upper () { throw new RuntimeException(); }
  protected  short lower () { throw new RuntimeException(); }
  public  void gatherStats (org.apache.spark.sql.catalyst.expressions.Row row, int ordinal) { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.expressions.Row collectedStatistics () { throw new RuntimeException(); }
}
