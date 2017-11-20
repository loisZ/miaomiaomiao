package org.apache.spark.sql.parquet;
public  class ParquetQuerySuite extends org.apache.spark.sql.QueryTest implements org.scalatest.FunSuiteLike, org.scalatest.BeforeAndAfterAll {
  public   ParquetQuerySuite () { throw new RuntimeException(); }
  private  org.apache.spark.sql.SchemaRDD testRDD () { throw new RuntimeException(); }
  private  boolean originalParquetFilterPushdownEnabled () { throw new RuntimeException(); }
  public  void beforeAll () { throw new RuntimeException(); }
  public  void afterAll () { throw new RuntimeException(); }
  public  void checkFilter (org.apache.spark.sql.catalyst.expressions.Predicate predicate, java.lang.Class<? extends parquet.filter2.predicate.FilterPredicate> filterClass) { throw new RuntimeException(); }
}
