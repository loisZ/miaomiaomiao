package org.apache.spark.sql.parquet;
/**
 * A test suite that tests Parquet filter2 API based filter pushdown optimization.
 * <p>
 * NOTE:
 * <p>
 * 1. <code>!(a cmp b)</code> is always transformed to its negated form <code>a cmp' b</code> by the
 *    <code>BooleanSimplification</code> optimization rule whenever possible. As a result, predicate <code>!(a < 1)</code>
 *    results in a <code>GtEq</code> filter predicate rather than a <code>Not</code>.
 * <p>
 * 2. <code>Tuple1(Option(x))</code> is used together with <code>AnyVal</code> types like <code>Int</code> to ensure the inferred
 *    data type is nullable.
 */
public  class ParquetFilterSuite extends org.apache.spark.sql.QueryTest implements org.apache.spark.sql.parquet.ParquetTest {
  public   ParquetFilterSuite () { throw new RuntimeException(); }
  public  org.apache.spark.sql.test.TestSQLContext$ sqlContext () { throw new RuntimeException(); }
  private  void checkFilterPushdown (org.apache.spark.sql.SchemaRDD rdd, scala.collection.Seq<scala.Symbol> output, org.apache.spark.sql.catalyst.expressions.Predicate predicate, java.lang.Class<? extends parquet.filter2.predicate.FilterPredicate> filterClass, scala.Function2<org.apache.spark.sql.SchemaRDD, java.lang.Object, scala.runtime.BoxedUnit> checker, scala.Function0<java.lang.Object> expectedResult) { throw new RuntimeException(); }
  private  void checkFilterPushdown (org.apache.spark.sql.SchemaRDD rdd, scala.collection.Seq<scala.Symbol> output, org.apache.spark.sql.catalyst.expressions.Predicate predicate, java.lang.Class<? extends parquet.filter2.predicate.FilterPredicate> filterClass, scala.Function0<java.lang.Object> expectedResult) { throw new RuntimeException(); }
  public  void checkBinaryFilterPushdown (org.apache.spark.sql.SchemaRDD rdd, scala.collection.Seq<scala.Symbol> output, org.apache.spark.sql.catalyst.expressions.Predicate predicate, java.lang.Class<? extends parquet.filter2.predicate.FilterPredicate> filterClass, scala.Function0<java.lang.Object> expectedResult) { throw new RuntimeException(); }
}
