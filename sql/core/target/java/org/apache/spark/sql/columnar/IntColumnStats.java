package org.apache.spark.sql.columnar;
public  class IntColumnStats implements org.apache.spark.sql.columnar.ColumnStats {
  public   IntColumnStats () { throw new RuntimeException(); }
  protected  int upper () { throw new RuntimeException(); }
  protected  int lower () { throw new RuntimeException(); }
  public  void gatherStats (org.apache.spark.sql.catalyst.expressions.Row row, int ordinal) { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.expressions.Row collectedStatistics () { throw new RuntimeException(); }
}
