package org.apache.spark.sql.sources;
public  class SimpleFilteredScan extends org.apache.spark.sql.sources.PrunedFilteredScan implements scala.Product, scala.Serializable {
  public  int from () { throw new RuntimeException(); }
  public  int to () { throw new RuntimeException(); }
  public  org.apache.spark.sql.SQLContext sqlContext () { throw new RuntimeException(); }
  // not preceding
  public   SimpleFilteredScan (int from, int to, org.apache.spark.sql.SQLContext sqlContext) { throw new RuntimeException(); }
  public  org.apache.spark.sql.catalyst.types.StructType schema () { throw new RuntimeException(); }
  public  org.apache.spark.rdd.RDD<org.apache.spark.sql.catalyst.expressions.Row> buildScan (java.lang.String[] requiredColumns, org.apache.spark.sql.sources.Filter[] filters) { throw new RuntimeException(); }
}
