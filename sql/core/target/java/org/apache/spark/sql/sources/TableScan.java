package org.apache.spark.sql.sources;
/**
 * ::DeveloperApi::
 * A BaseRelation that can produce all of its tuples as an RDD of Row objects.
 */
public abstract class TableScan extends org.apache.spark.sql.sources.BaseRelation {
  public   TableScan () { throw new RuntimeException(); }
  public abstract  org.apache.spark.rdd.RDD<org.apache.spark.sql.catalyst.expressions.Row> buildScan () ;
}
